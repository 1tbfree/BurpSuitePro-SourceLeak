package org.bouncycastle.pkix.jcajce;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;

class RFC3280CertPathUtilities {
  public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
  
  public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
  
  public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
  
  public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
  
  public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
  
  protected static final int KEY_CERT_SIGN = 5;
  
  protected static final int CRL_SIGN = 6;
  
  protected static void processCRLB2(DistributionPoint paramDistributionPoint, Object paramObject, X509CRL paramX509CRL) throws AnnotatedException {
    IssuingDistributionPoint issuingDistributionPoint = null;
    try {
      issuingDistributionPoint = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509CRL, Extension.issuingDistributionPoint));
    } catch (Exception exception) {
      throw new AnnotatedException("Issuing distribution point extension could not be decoded.", exception);
    } 
    if (issuingDistributionPoint != null) {
      if (issuingDistributionPoint.getDistributionPoint() != null) {
        DistributionPointName distributionPointName = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
        ArrayList<GeneralName> arrayList = new ArrayList();
        if (distributionPointName.getType() == 0) {
          GeneralName[] arrayOfGeneralName = GeneralNames.getInstance(distributionPointName.getName()).getNames();
          for (byte b = 0; b < arrayOfGeneralName.length; b++)
            arrayList.add(arrayOfGeneralName[b]); 
        } 
        if (distributionPointName.getType() == 1) {
          ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
          try {
            Enumeration<ASN1Encodable> enumeration = ASN1Sequence.getInstance(paramX509CRL.getIssuerX500Principal().getEncoded()).getObjects();
            while (enumeration.hasMoreElements())
              aSN1EncodableVector.add(enumeration.nextElement()); 
          } catch (Exception exception) {
            throw new AnnotatedException("Could not read CRL issuer.", exception);
          } 
          aSN1EncodableVector.add(distributionPointName.getName());
          arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
        } 
        boolean bool = false;
        if (paramDistributionPoint.getDistributionPoint() != null) {
          distributionPointName = paramDistributionPoint.getDistributionPoint();
          GeneralName[] arrayOfGeneralName = null;
          if (distributionPointName.getType() == 0)
            arrayOfGeneralName = GeneralNames.getInstance(distributionPointName.getName()).getNames(); 
          if (distributionPointName.getType() == 1) {
            if (paramDistributionPoint.getCRLIssuer() != null) {
              arrayOfGeneralName = paramDistributionPoint.getCRLIssuer().getNames();
            } else {
              arrayOfGeneralName = new GeneralName[1];
              try {
                arrayOfGeneralName[0] = new GeneralName(X500Name.getInstance(((X509Certificate)paramObject).getIssuerX500Principal().getEncoded()));
              } catch (Exception exception) {
                throw new AnnotatedException("Could not read certificate issuer.", exception);
              } 
            } 
            for (byte b = 0; b < arrayOfGeneralName.length; b++) {
              Enumeration<ASN1Encodable> enumeration = ASN1Sequence.getInstance(arrayOfGeneralName[b].getName().toASN1Primitive()).getObjects();
              ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
              while (enumeration.hasMoreElements())
                aSN1EncodableVector.add(enumeration.nextElement()); 
              aSN1EncodableVector.add(distributionPointName.getName());
              arrayOfGeneralName[b] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector)));
            } 
          } 
          if (arrayOfGeneralName != null)
            for (byte b = 0; b < arrayOfGeneralName.length; b++) {
              if (arrayList.contains(arrayOfGeneralName[b])) {
                bool = true;
                break;
              } 
            }  
          if (!bool)
            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."); 
        } else {
          if (paramDistributionPoint.getCRLIssuer() == null)
            throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."); 
          GeneralName[] arrayOfGeneralName = paramDistributionPoint.getCRLIssuer().getNames();
          for (byte b = 0; b < arrayOfGeneralName.length; b++) {
            if (arrayList.contains(arrayOfGeneralName[b])) {
              bool = true;
              break;
            } 
          } 
          if (!bool)
            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."); 
        } 
      } 
      BasicConstraints basicConstraints = null;
      try {
        basicConstraints = BasicConstraints.getInstance(RevocationUtilities.getExtensionValue((X509Extension)paramObject, Extension.basicConstraints));
      } catch (Exception exception) {
        throw new AnnotatedException("Basic constraints extension could not be decoded.", exception);
      } 
      if (paramObject instanceof X509Certificate) {
        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA())
          throw new AnnotatedException("CA Cert CRL only contains user certificates."); 
        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA()))
          throw new AnnotatedException("End CRL only contains CA certificates."); 
      } 
      if (issuingDistributionPoint.onlyContainsAttributeCerts())
        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted."); 
    } 
  }
  
  protected static void processCRLB1(DistributionPoint paramDistributionPoint, Object paramObject, X509CRL paramX509CRL) throws AnnotatedException {
    ASN1Primitive aSN1Primitive = RevocationUtilities.getExtensionValue(paramX509CRL, Extension.issuingDistributionPoint);
    boolean bool1 = false;
    if (aSN1Primitive != null && IssuingDistributionPoint.getInstance(aSN1Primitive).isIndirectCRL())
      bool1 = true; 
    byte[] arrayOfByte = paramX509CRL.getIssuerX500Principal().getEncoded();
    boolean bool2 = false;
    if (paramDistributionPoint.getCRLIssuer() != null) {
      GeneralName[] arrayOfGeneralName = paramDistributionPoint.getCRLIssuer().getNames();
      for (byte b = 0; b < arrayOfGeneralName.length; b++) {
        if (arrayOfGeneralName[b].getTagNo() == 4)
          try {
            if (Arrays.areEqual(arrayOfGeneralName[b].getName().toASN1Primitive().getEncoded(), arrayOfByte))
              bool2 = true; 
          } catch (IOException iOException) {
            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", iOException);
          }  
      } 
      if (bool2 && !bool1)
        throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect."); 
      if (!bool2)
        throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point."); 
    } else if (paramX509CRL.getIssuerX500Principal().equals(((X509Certificate)paramObject).getIssuerX500Principal())) {
      bool2 = true;
    } 
    if (!bool2)
      throw new AnnotatedException("Cannot find matching CRL issuer for certificate."); 
  }
  
  protected static ReasonsMask processCRLD(X509CRL paramX509CRL, DistributionPoint paramDistributionPoint) throws AnnotatedException {
    IssuingDistributionPoint issuingDistributionPoint = null;
    try {
      issuingDistributionPoint = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509CRL, Extension.issuingDistributionPoint));
    } catch (Exception exception) {
      throw new AnnotatedException("Issuing distribution point extension could not be decoded.", exception);
    } 
    return (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && paramDistributionPoint.getReasons() != null) ? (new ReasonsMask(paramDistributionPoint.getReasons())).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons())) : (((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && paramDistributionPoint.getReasons() == null) ? ReasonsMask.allReasons : ((paramDistributionPoint.getReasons() == null) ? ReasonsMask.allReasons : new ReasonsMask(paramDistributionPoint.getReasons())).intersect((issuingDistributionPoint == null) ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons())));
  }
  
  protected static Set processCRLF(X509CRL paramX509CRL, Object paramObject, X509Certificate paramX509Certificate, PublicKey paramPublicKey, PKIXExtendedParameters paramPKIXExtendedParameters, List paramList, JcaJceHelper paramJcaJceHelper) throws AnnotatedException {
    X509CertSelector x509CertSelector = new X509CertSelector();
    try {
      byte[] arrayOfByte = paramX509CRL.getIssuerX500Principal().getEncoded();
      x509CertSelector.setSubject(arrayOfByte);
    } catch (IOException iOException) {
      throw new AnnotatedException("subject criteria for certificate selector to find issuer certificate for CRL could not be set", iOException);
    } 
    PKIXCertStoreSelector pKIXCertStoreSelector = (new PKIXCertStoreSelector.Builder(x509CertSelector)).build();
    LinkedHashSet<X509Certificate> linkedHashSet = new LinkedHashSet();
    try {
      RevocationUtilities.findCertificates(linkedHashSet, pKIXCertStoreSelector, paramPKIXExtendedParameters.getCertificateStores());
      RevocationUtilities.findCertificates(linkedHashSet, pKIXCertStoreSelector, paramPKIXExtendedParameters.getCertStores());
    } catch (AnnotatedException annotatedException1) {
      throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", annotatedException1);
    } 
    linkedHashSet.add(paramX509Certificate);
    ArrayList<X509Certificate> arrayList = new ArrayList();
    ArrayList<PublicKey> arrayList1 = new ArrayList();
    for (X509Certificate x509Certificate : linkedHashSet) {
      if (x509Certificate.equals(paramX509Certificate)) {
        arrayList.add(x509Certificate);
        arrayList1.add(paramPublicKey);
        continue;
      } 
      try {
        CertPathBuilder certPathBuilder = paramJcaJceHelper.createCertPathBuilder("PKIX");
        X509CertSelector x509CertSelector1 = new X509CertSelector();
        x509CertSelector1.setCertificate(x509Certificate);
        PKIXExtendedParameters.Builder builder = (new PKIXExtendedParameters.Builder(paramPKIXExtendedParameters)).setTargetConstraints((new PKIXCertStoreSelector.Builder(x509CertSelector1)).build());
        if (paramList.contains(x509Certificate)) {
          builder.setRevocationEnabled(false);
        } else {
          builder.setRevocationEnabled(true);
        } 
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters = (new PKIXExtendedBuilderParameters.Builder(builder.build())).build();
        List<? extends Certificate> list = certPathBuilder.build((CertPathParameters)pKIXExtendedBuilderParameters).getCertPath().getCertificates();
        arrayList.add(x509Certificate);
        arrayList1.add(RevocationUtilities.getNextWorkingKey(list, 0, paramJcaJceHelper));
      } catch (CertPathBuilderException certPathBuilderException) {
        throw new AnnotatedException("CertPath for CRL signer failed to validate.", certPathBuilderException);
      } catch (CertPathValidatorException certPathValidatorException) {
        throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", certPathValidatorException);
      } catch (Exception exception) {
        throw new AnnotatedException(exception.getMessage());
      } 
    } 
    HashSet hashSet = new HashSet();
    AnnotatedException annotatedException = null;
    for (byte b = 0; b < arrayList.size(); b++) {
      X509Certificate x509Certificate = arrayList.get(b);
      boolean[] arrayOfBoolean = x509Certificate.getKeyUsage();
      if (arrayOfBoolean != null && (arrayOfBoolean.length <= 6 || !arrayOfBoolean[6])) {
        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
      } else {
        hashSet.add(arrayList1.get(b));
      } 
    } 
    if (hashSet.isEmpty() && annotatedException == null)
      throw new AnnotatedException("Cannot find a valid issuer certificate."); 
    if (hashSet.isEmpty() && annotatedException != null)
      throw annotatedException; 
    return hashSet;
  }
  
  protected static PublicKey processCRLG(X509CRL paramX509CRL, Set paramSet) throws AnnotatedException {
    Exception exception = null;
    for (PublicKey publicKey : paramSet) {
      try {
        paramX509CRL.verify(publicKey);
        return publicKey;
      } catch (Exception exception1) {
        exception = exception1;
      } 
    } 
    throw new AnnotatedException("Cannot verify CRL.", exception);
  }
  
  protected static X509CRL processCRLH(Set paramSet, PublicKey paramPublicKey) throws AnnotatedException {
    Exception exception = null;
    for (X509CRL x509CRL : paramSet) {
      try {
        x509CRL.verify(paramPublicKey);
        return x509CRL;
      } catch (Exception exception1) {
        exception = exception1;
      } 
    } 
    if (exception != null)
      throw new AnnotatedException("Cannot verify delta CRL.", exception); 
    return null;
  }
  
  protected static Set processCRLA1i(PKIXExtendedParameters paramPKIXExtendedParameters, Date paramDate, X509Certificate paramX509Certificate, X509CRL paramX509CRL) throws AnnotatedException {
    HashSet hashSet = new HashSet();
    if (paramPKIXExtendedParameters.isUseDeltasEnabled()) {
      CRLDistPoint cRLDistPoint = null;
      try {
        cRLDistPoint = CRLDistPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509Certificate, Extension.freshestCRL));
      } catch (AnnotatedException annotatedException) {
        throw new AnnotatedException("Freshest CRL extension could not be decoded from certificate.", annotatedException);
      } 
      if (cRLDistPoint == null)
        try {
          cRLDistPoint = CRLDistPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509CRL, Extension.freshestCRL));
        } catch (AnnotatedException annotatedException) {
          throw new AnnotatedException("Freshest CRL extension could not be decoded from CRL.", annotatedException);
        }  
      if (cRLDistPoint != null) {
        ArrayList<PKIXCRLStore> arrayList = new ArrayList();
        arrayList.addAll(paramPKIXExtendedParameters.getCRLStores());
        try {
          arrayList.addAll(RevocationUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, paramPKIXExtendedParameters.getNamedCRLStoreMap()));
        } catch (AnnotatedException annotatedException) {
          throw new AnnotatedException("No new delta CRL locations could be added from Freshest CRL extension.", annotatedException);
        } 
        try {
          hashSet.addAll(RevocationUtilities.getDeltaCRLs(paramDate, paramX509CRL, paramPKIXExtendedParameters.getCertStores(), arrayList));
        } catch (AnnotatedException annotatedException) {
          throw new AnnotatedException("Exception obtaining delta CRLs.", annotatedException);
        } 
      } 
    } 
    return hashSet;
  }
  
  protected static Set[] processCRLA1ii(PKIXExtendedParameters paramPKIXExtendedParameters, Date paramDate1, Date paramDate2, X509Certificate paramX509Certificate, X509CRL paramX509CRL) throws AnnotatedException {
    X509CRLSelector x509CRLSelector = new X509CRLSelector();
    x509CRLSelector.setCertificateChecking(paramX509Certificate);
    try {
      x509CRLSelector.addIssuerName(paramX509CRL.getIssuerX500Principal().getEncoded());
    } catch (IOException iOException) {
      throw new AnnotatedException("Cannot extract issuer from CRL." + iOException, iOException);
    } 
    PKIXCRLStoreSelector pKIXCRLStoreSelector = (new PKIXCRLStoreSelector.Builder(x509CRLSelector)).setCompleteCRLEnabled(true).build();
    Set set = PKIXCRLUtil.findCRLs(pKIXCRLStoreSelector, paramDate2, paramPKIXExtendedParameters.getCertStores(), paramPKIXExtendedParameters.getCRLStores());
    HashSet hashSet = new HashSet();
    if (paramPKIXExtendedParameters.isUseDeltasEnabled())
      try {
        hashSet.addAll(RevocationUtilities.getDeltaCRLs(paramDate2, paramX509CRL, paramPKIXExtendedParameters.getCertStores(), paramPKIXExtendedParameters.getCRLStores()));
      } catch (AnnotatedException annotatedException) {
        throw new AnnotatedException("Exception obtaining delta CRLs.", annotatedException);
      }  
    return new Set[] { set, hashSet };
  }
  
  protected static void processCRLC(X509CRL paramX509CRL1, X509CRL paramX509CRL2, PKIXExtendedParameters paramPKIXExtendedParameters) throws AnnotatedException {
    if (paramX509CRL1 == null)
      return; 
    IssuingDistributionPoint issuingDistributionPoint = null;
    try {
      issuingDistributionPoint = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509CRL2, Extension.issuingDistributionPoint));
    } catch (Exception exception) {
      throw new AnnotatedException("issuing distribution point extension could not be decoded.", exception);
    } 
    if (paramPKIXExtendedParameters.isUseDeltasEnabled()) {
      if (!paramX509CRL1.getIssuerX500Principal().equals(paramX509CRL2.getIssuerX500Principal()))
        throw new AnnotatedException("complete CRL issuer does not match delta CRL issuer"); 
      IssuingDistributionPoint issuingDistributionPoint1 = null;
      try {
        issuingDistributionPoint1 = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509CRL1, Extension.issuingDistributionPoint));
      } catch (Exception exception) {
        throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", exception);
      } 
      boolean bool = false;
      if (issuingDistributionPoint == null) {
        if (issuingDistributionPoint1 == null)
          bool = true; 
      } else if (issuingDistributionPoint.equals(issuingDistributionPoint1)) {
        bool = true;
      } 
      if (!bool)
        throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match."); 
      ASN1Primitive aSN1Primitive1 = null;
      try {
        aSN1Primitive1 = RevocationUtilities.getExtensionValue(paramX509CRL2, Extension.authorityKeyIdentifier);
      } catch (AnnotatedException annotatedException) {
        throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", annotatedException);
      } 
      ASN1Primitive aSN1Primitive2 = null;
      try {
        aSN1Primitive2 = RevocationUtilities.getExtensionValue(paramX509CRL1, Extension.authorityKeyIdentifier);
      } catch (AnnotatedException annotatedException) {
        throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", annotatedException);
      } 
      if (aSN1Primitive1 == null)
        throw new AnnotatedException("CRL authority key identifier is null."); 
      if (aSN1Primitive2 == null)
        throw new AnnotatedException("Delta CRL authority key identifier is null."); 
      if (!aSN1Primitive1.equals(aSN1Primitive2))
        throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier."); 
    } 
  }
  
  protected static void processCRLI(Date paramDate, X509CRL paramX509CRL, Object paramObject, CertStatus paramCertStatus, PKIXExtendedParameters paramPKIXExtendedParameters) throws AnnotatedException {
    if (paramPKIXExtendedParameters.isUseDeltasEnabled() && paramX509CRL != null)
      RevocationUtilities.getCertStatus(paramDate, paramX509CRL, paramObject, paramCertStatus); 
  }
  
  protected static void processCRLJ(Date paramDate, X509CRL paramX509CRL, Object paramObject, CertStatus paramCertStatus) throws AnnotatedException {
    if (paramCertStatus.getCertStatus() == 11)
      RevocationUtilities.getCertStatus(paramDate, paramX509CRL, paramObject, paramCertStatus); 
  }
  
  static void checkCRL(DistributionPoint paramDistributionPoint, PKIXExtendedParameters paramPKIXExtendedParameters, Date paramDate1, Date paramDate2, X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2, PublicKey paramPublicKey, CertStatus paramCertStatus, ReasonsMask paramReasonsMask, List paramList, JcaJceHelper paramJcaJceHelper) throws AnnotatedException, CRLNotFoundException {
    if (paramDate2.getTime() > paramDate1.getTime())
      throw new AnnotatedException("Validation time is in future."); 
    Set set = RevocationUtilities.getCompleteCRLs(paramDistributionPoint, paramX509Certificate1, paramDate2, paramPKIXExtendedParameters.getCertStores(), paramPKIXExtendedParameters.getCRLStores());
    boolean bool = false;
    AnnotatedException annotatedException = null;
    Iterator<X509CRL> iterator = set.iterator();
    while (iterator.hasNext() && paramCertStatus.getCertStatus() == 11 && !paramReasonsMask.isAllReasons()) {
      try {
        X509CRL x509CRL1 = iterator.next();
        ReasonsMask reasonsMask = processCRLD(x509CRL1, paramDistributionPoint);
        if (!reasonsMask.hasNewReasons(paramReasonsMask))
          continue; 
        Set set1 = processCRLF(x509CRL1, paramX509Certificate1, paramX509Certificate2, paramPublicKey, paramPKIXExtendedParameters, paramList, paramJcaJceHelper);
        PublicKey publicKey = processCRLG(x509CRL1, set1);
        X509CRL x509CRL2 = null;
        if (paramPKIXExtendedParameters.isUseDeltasEnabled()) {
          Set set3 = RevocationUtilities.getDeltaCRLs(paramDate2, x509CRL1, paramPKIXExtendedParameters.getCertStores(), paramPKIXExtendedParameters.getCRLStores());
          x509CRL2 = processCRLH(set3, publicKey);
        } 
        if (paramPKIXExtendedParameters.getValidityModel() != 1 && paramX509Certificate1.getNotAfter().getTime() < x509CRL1.getThisUpdate().getTime())
          throw new AnnotatedException("No valid CRL for current time found."); 
        processCRLB1(paramDistributionPoint, paramX509Certificate1, x509CRL1);
        processCRLB2(paramDistributionPoint, paramX509Certificate1, x509CRL1);
        processCRLC(x509CRL2, x509CRL1, paramPKIXExtendedParameters);
        processCRLI(paramDate2, x509CRL2, paramX509Certificate1, paramCertStatus, paramPKIXExtendedParameters);
        processCRLJ(paramDate2, x509CRL1, paramX509Certificate1, paramCertStatus);
        if (paramCertStatus.getCertStatus() == 8)
          paramCertStatus.setCertStatus(11); 
        paramReasonsMask.addReasons(reasonsMask);
        Set<String> set2 = x509CRL1.getCriticalExtensionOIDs();
        if (set2 != null) {
          set2 = new HashSet<>(set2);
          set2.remove(Extension.issuingDistributionPoint.getId());
          set2.remove(Extension.deltaCRLIndicator.getId());
          if (!set2.isEmpty())
            throw new AnnotatedException("CRL contains unsupported critical extensions."); 
        } 
        if (x509CRL2 != null) {
          set2 = x509CRL2.getCriticalExtensionOIDs();
          if (set2 != null) {
            set2 = new HashSet<>(set2);
            set2.remove(Extension.issuingDistributionPoint.getId());
            set2.remove(Extension.deltaCRLIndicator.getId());
            if (!set2.isEmpty())
              throw new AnnotatedException("Delta CRL contains unsupported critical extension."); 
          } 
        } 
        bool = true;
      } catch (AnnotatedException annotatedException1) {
        annotatedException = annotatedException1;
      } 
    } 
    if (!bool)
      throw annotatedException; 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\RFC3280CertPathUtilities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */