package org.bouncycastle.pkix.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
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
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

class RevocationUtilities {
  protected static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
  
  protected static Date getValidityDate(PKIXExtendedParameters paramPKIXExtendedParameters, Date paramDate) {
    Date date = paramPKIXExtendedParameters.getValidityDate();
    return (null == date) ? paramDate : date;
  }
  
  protected static ASN1Primitive getExtensionValue(X509Extension paramX509Extension, ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws AnnotatedException {
    byte[] arrayOfByte = paramX509Extension.getExtensionValue(paramASN1ObjectIdentifier.getId());
    return (null == arrayOfByte) ? null : getObject(paramASN1ObjectIdentifier, arrayOfByte);
  }
  
  private static ASN1Primitive getObject(ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte) throws AnnotatedException {
    try {
      return ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(paramArrayOfbyte).getOctets());
    } catch (Exception exception) {
      throw new AnnotatedException("exception processing extension " + paramASN1ObjectIdentifier, exception);
    } 
  }
  
  protected static void findCertificates(LinkedHashSet paramLinkedHashSet, PKIXCertStoreSelector paramPKIXCertStoreSelector, List paramList) throws AnnotatedException {
    for (Store store : paramList) {
      if (store instanceof Store) {
        Store store1 = store;
        try {
          paramLinkedHashSet.addAll(store1.getMatches((Selector)paramPKIXCertStoreSelector));
        } catch (StoreException storeException) {
          throw new AnnotatedException("Problem while picking certificates from X.509 store.", storeException);
        } 
        continue;
      } 
      CertStore certStore = (CertStore)store;
      try {
        paramLinkedHashSet.addAll(PKIXCertStoreSelector.getCertificates(paramPKIXCertStoreSelector, certStore));
      } catch (CertStoreException certStoreException) {
        throw new AnnotatedException("Problem while picking certificates from certificate store.", certStoreException);
      } 
    } 
  }
  
  static List<PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(CRLDistPoint paramCRLDistPoint, Map<GeneralName, PKIXCRLStore> paramMap) throws AnnotatedException {
    DistributionPoint[] arrayOfDistributionPoint;
    if (paramCRLDistPoint == null)
      return Collections.emptyList(); 
    try {
      arrayOfDistributionPoint = paramCRLDistPoint.getDistributionPoints();
    } catch (Exception exception) {
      throw new AnnotatedException("Distribution points could not be read.", exception);
    } 
    ArrayList<PKIXCRLStore> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfDistributionPoint.length; b++) {
      DistributionPointName distributionPointName = arrayOfDistributionPoint[b].getDistributionPoint();
      if (distributionPointName != null && distributionPointName.getType() == 0) {
        GeneralName[] arrayOfGeneralName = GeneralNames.getInstance(distributionPointName.getName()).getNames();
        for (byte b1 = 0; b1 < arrayOfGeneralName.length; b1++) {
          PKIXCRLStore pKIXCRLStore = paramMap.get(arrayOfGeneralName[b1]);
          if (pKIXCRLStore != null)
            arrayList.add(pKIXCRLStore); 
        } 
      } 
    } 
    return arrayList;
  }
  
  protected static void getCRLIssuersFromDistributionPoint(DistributionPoint paramDistributionPoint, Collection paramCollection, X509CRLSelector paramX509CRLSelector) throws AnnotatedException {
    ArrayList<X500Name> arrayList = new ArrayList();
    if (paramDistributionPoint.getCRLIssuer() != null) {
      GeneralName[] arrayOfGeneralName = paramDistributionPoint.getCRLIssuer().getNames();
      for (byte b = 0; b < arrayOfGeneralName.length; b++) {
        if (arrayOfGeneralName[b].getTagNo() == 4)
          try {
            arrayList.add(X500Name.getInstance(arrayOfGeneralName[b].getName()));
          } catch (IllegalArgumentException illegalArgumentException) {
            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", illegalArgumentException);
          }  
      } 
    } else {
      if (paramDistributionPoint.getDistributionPoint() == null)
        throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present."); 
      Iterator<X500Name> iterator1 = paramCollection.iterator();
      while (iterator1.hasNext())
        arrayList.add(iterator1.next()); 
    } 
    Iterator<X500Name> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      try {
        paramX509CRLSelector.addIssuerName(((X500Name)iterator.next()).getEncoded());
      } catch (IOException iOException) {
        throw new AnnotatedException("Cannot decode CRL issuer information.", iOException);
      } 
    } 
  }
  
  protected static void getCertStatus(Date paramDate, X509CRL paramX509CRL, Object paramObject, CertStatus paramCertStatus) throws AnnotatedException {
    boolean bool;
    try {
      bool = isIndirectCRL(paramX509CRL);
    } catch (CRLException cRLException) {
      throw new AnnotatedException("Failed check for indirect CRL.", cRLException);
    } 
    X509Certificate x509Certificate = (X509Certificate)paramObject;
    X500Name x500Name = getIssuer(x509Certificate);
    if (!bool) {
      X500Name x500Name1 = getIssuer(paramX509CRL);
      if (!x500Name.equals(x500Name1))
        return; 
    } 
    X509CRLEntry x509CRLEntry = paramX509CRL.getRevokedCertificate(x509Certificate.getSerialNumber());
    if (null == x509CRLEntry)
      return; 
    if (bool) {
      X500Name x500Name1;
      X500Principal x500Principal = x509CRLEntry.getCertificateIssuer();
      if (null == x500Principal) {
        x500Name1 = getIssuer(paramX509CRL);
      } else {
        x500Name1 = getX500Name(x500Principal);
      } 
      if (!x500Name.equals(x500Name1))
        return; 
    } 
    int i = 0;
    if (x509CRLEntry.hasExtensions())
      try {
        ASN1Primitive aSN1Primitive = getExtensionValue(x509CRLEntry, Extension.reasonCode);
        ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(aSN1Primitive);
        if (null != aSN1Enumerated)
          i = aSN1Enumerated.intValueExact(); 
      } catch (Exception exception) {
        throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", exception);
      }  
    Date date = x509CRLEntry.getRevocationDate();
    if (paramDate.before(date))
      switch (i) {
        case 0:
        case 1:
        case 2:
        case 10:
          break;
        default:
          return;
      }  
    paramCertStatus.setCertStatus(i);
    paramCertStatus.setRevocationDate(date);
  }
  
  protected static Set getDeltaCRLs(Date paramDate, X509CRL paramX509CRL, List<CertStore> paramList, List<PKIXCRLStore> paramList1) throws AnnotatedException {
    byte[] arrayOfByte;
    X509CRLSelector x509CRLSelector = new X509CRLSelector();
    try {
      x509CRLSelector.addIssuerName(paramX509CRL.getIssuerX500Principal().getEncoded());
    } catch (IOException iOException) {
      throw new AnnotatedException("cannot extract issuer from CRL.", iOException);
    } 
    BigInteger bigInteger = null;
    try {
      ASN1Primitive aSN1Primitive = getExtensionValue(paramX509CRL, Extension.cRLNumber);
      if (aSN1Primitive != null)
        bigInteger = ASN1Integer.getInstance(aSN1Primitive).getPositiveValue(); 
    } catch (Exception exception) {
      throw new AnnotatedException("cannot extract CRL number extension from CRL", exception);
    } 
    try {
      arrayOfByte = paramX509CRL.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
    } catch (Exception exception) {
      throw new AnnotatedException("issuing distribution point extension value could not be read", exception);
    } 
    x509CRLSelector.setMinCRLNumber((bigInteger == null) ? null : bigInteger.add(BigInteger.valueOf(1L)));
    PKIXCRLStoreSelector.Builder builder = new PKIXCRLStoreSelector.Builder(x509CRLSelector);
    builder.setIssuingDistributionPoint(arrayOfByte);
    builder.setIssuingDistributionPointEnabled(true);
    builder.setMaxBaseCRLNumber(bigInteger);
    PKIXCRLStoreSelector pKIXCRLStoreSelector = builder.build();
    Set set = PKIXCRLUtil.findCRLs(pKIXCRLStoreSelector, paramDate, paramList, paramList1);
    HashSet<X509CRL> hashSet = new HashSet();
    for (X509CRL x509CRL : set) {
      if (isDeltaCRL(x509CRL))
        hashSet.add(x509CRL); 
    } 
    return hashSet;
  }
  
  private static boolean isDeltaCRL(X509CRL paramX509CRL) {
    Set<String> set = paramX509CRL.getCriticalExtensionOIDs();
    return (null == set) ? false : set.contains(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
  }
  
  protected static Set getCompleteCRLs(DistributionPoint paramDistributionPoint, Object paramObject, Date paramDate, List paramList1, List paramList2) throws AnnotatedException, CRLNotFoundException {
    X509CRLSelector x509CRLSelector = new X509CRLSelector();
    try {
      HashSet<X500Name> hashSet = new HashSet();
      hashSet.add(getIssuer((X509Certificate)paramObject));
      getCRLIssuersFromDistributionPoint(paramDistributionPoint, hashSet, x509CRLSelector);
    } catch (AnnotatedException annotatedException) {
      throw new AnnotatedException("Could not get issuer information from distribution point.", annotatedException);
    } 
    if (paramObject instanceof X509Certificate)
      x509CRLSelector.setCertificateChecking((X509Certificate)paramObject); 
    PKIXCRLStoreSelector pKIXCRLStoreSelector = (new PKIXCRLStoreSelector.Builder(x509CRLSelector)).setCompleteCRLEnabled(true).build();
    Set set = PKIXCRLUtil.findCRLs(pKIXCRLStoreSelector, paramDate, paramList1, paramList2);
    checkCRLsNotEmpty(set, paramObject);
    return set;
  }
  
  protected static PublicKey getNextWorkingKey(List<Certificate> paramList, int paramInt, JcaJceHelper paramJcaJceHelper) throws CertPathValidatorException {
    Certificate certificate = paramList.get(paramInt);
    PublicKey publicKey = certificate.getPublicKey();
    if (!(publicKey instanceof DSAPublicKey))
      return publicKey; 
    DSAPublicKey dSAPublicKey = (DSAPublicKey)publicKey;
    if (dSAPublicKey.getParams() != null)
      return dSAPublicKey; 
    int i = paramInt + 1;
    while (i < paramList.size()) {
      X509Certificate x509Certificate = (X509Certificate)paramList.get(i);
      publicKey = x509Certificate.getPublicKey();
      if (!(publicKey instanceof DSAPublicKey))
        throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate."); 
      DSAPublicKey dSAPublicKey1 = (DSAPublicKey)publicKey;
      if (dSAPublicKey1.getParams() == null) {
        i++;
        continue;
      } 
      DSAParams dSAParams = dSAPublicKey1.getParams();
      DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(dSAPublicKey.getY(), dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
      try {
        KeyFactory keyFactory = paramJcaJceHelper.createKeyFactory("DSA");
        return keyFactory.generatePublic(dSAPublicKeySpec);
      } catch (Exception exception) {
        throw new RuntimeException(exception.getMessage());
      } 
    } 
    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
  }
  
  static void checkCRLsNotEmpty(Set paramSet, Object paramObject) throws CRLNotFoundException {
    if (paramSet.isEmpty()) {
      X500Name x500Name = getIssuer((X509Certificate)paramObject);
      throw new CRLNotFoundException("No CRLs found for issuer \"" + RFC4519Style.INSTANCE.toString(x500Name) + "\"");
    } 
  }
  
  public static boolean isIndirectCRL(X509CRL paramX509CRL) throws CRLException {
    try {
      byte[] arrayOfByte = paramX509CRL.getExtensionValue(Extension.issuingDistributionPoint.getId());
      return (arrayOfByte != null && IssuingDistributionPoint.getInstance(ASN1OctetString.getInstance(arrayOfByte).getOctets()).isIndirectCRL());
    } catch (Exception exception) {
      throw new CRLException("exception reading IssuingDistributionPoint", exception);
    } 
  }
  
  private static X500Name getIssuer(X509Certificate paramX509Certificate) {
    return getX500Name(paramX509Certificate.getIssuerX500Principal());
  }
  
  private static X500Name getIssuer(X509CRL paramX509CRL) {
    return getX500Name(paramX509CRL.getIssuerX500Principal());
  }
  
  private static X500Name getX500Name(X500Principal paramX500Principal) {
    return X500Name.getInstance(paramX500Principal.getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\RevocationUtilities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */