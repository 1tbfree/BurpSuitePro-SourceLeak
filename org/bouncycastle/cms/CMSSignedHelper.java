package org.bouncycastle.cms;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.OtherRevocationInfoFormat;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

class CMSSignedHelper {
  static final CMSSignedHelper INSTANCE = new CMSSignedHelper();
  
  private static final Map encryptionAlgs = new HashMap<>();
  
  private static void addEntries(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    encryptionAlgs.put(paramASN1ObjectIdentifier.getId(), paramString);
  }
  
  String getEncryptionAlgName(String paramString) {
    String str = (String)encryptionAlgs.get(paramString);
    return (str != null) ? str : paramString;
  }
  
  AlgorithmIdentifier fixDigestAlgID(AlgorithmIdentifier paramAlgorithmIdentifier, DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder) {
    ASN1Encodable aSN1Encodable = paramAlgorithmIdentifier.getParameters();
    return (aSN1Encodable == null || DERNull.INSTANCE.equals(aSN1Encodable)) ? paramDigestAlgorithmIdentifierFinder.find(paramAlgorithmIdentifier.getAlgorithm()) : paramAlgorithmIdentifier;
  }
  
  void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    addEntries(paramASN1ObjectIdentifier, paramString);
  }
  
  Store getCertificates(ASN1Set paramASN1Set) {
    if (paramASN1Set != null) {
      ArrayList<X509CertificateHolder> arrayList = new ArrayList(paramASN1Set.size());
      Enumeration<ASN1Encodable> enumeration = paramASN1Set.getObjects();
      while (enumeration.hasMoreElements()) {
        ASN1Primitive aSN1Primitive = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive();
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence)
          arrayList.add(new X509CertificateHolder(Certificate.getInstance(aSN1Primitive))); 
      } 
      return (Store)new CollectionStore(arrayList);
    } 
    return (Store)new CollectionStore(new ArrayList());
  }
  
  Store getAttributeCertificates(ASN1Set paramASN1Set) {
    if (paramASN1Set != null) {
      ArrayList<X509AttributeCertificateHolder> arrayList = new ArrayList(paramASN1Set.size());
      Enumeration<ASN1Encodable> enumeration = paramASN1Set.getObjects();
      while (enumeration.hasMoreElements()) {
        ASN1Primitive aSN1Primitive = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive();
        if (aSN1Primitive instanceof ASN1TaggedObject) {
          ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)aSN1Primitive;
          if (aSN1TaggedObject.getTagNo() == 1 || aSN1TaggedObject.getTagNo() == 2)
            arrayList.add(new X509AttributeCertificateHolder(AttributeCertificate.getInstance(aSN1TaggedObject.getBaseUniversal(false, 16)))); 
        } 
      } 
      return (Store)new CollectionStore(arrayList);
    } 
    return (Store)new CollectionStore(new ArrayList());
  }
  
  Store getCRLs(ASN1Set paramASN1Set) {
    if (paramASN1Set != null) {
      ArrayList<X509CRLHolder> arrayList = new ArrayList(paramASN1Set.size());
      Enumeration<ASN1Encodable> enumeration = paramASN1Set.getObjects();
      while (enumeration.hasMoreElements()) {
        ASN1Primitive aSN1Primitive = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive();
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence)
          arrayList.add(new X509CRLHolder(CertificateList.getInstance(aSN1Primitive))); 
      } 
      return (Store)new CollectionStore(arrayList);
    } 
    return (Store)new CollectionStore(new ArrayList());
  }
  
  Store getOtherRevocationInfo(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Set paramASN1Set) {
    if (paramASN1Set != null) {
      ArrayList<ASN1Encodable> arrayList = new ArrayList(paramASN1Set.size());
      Enumeration<ASN1Encodable> enumeration = paramASN1Set.getObjects();
      while (enumeration.hasMoreElements()) {
        ASN1Primitive aSN1Primitive = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive();
        if (aSN1Primitive instanceof ASN1TaggedObject) {
          ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Primitive);
          if (aSN1TaggedObject.hasContextTag(1)) {
            OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(aSN1TaggedObject, false);
            if (paramASN1ObjectIdentifier.equals((ASN1Primitive)otherRevocationInfoFormat.getInfoFormat()))
              arrayList.add(otherRevocationInfoFormat.getInfo()); 
          } 
        } 
      } 
      return (Store)new CollectionStore(arrayList);
    } 
    return (Store)new CollectionStore(new ArrayList());
  }
  
  static {
    addEntries(NISTObjectIdentifiers.dsa_with_sha224, "DSA");
    addEntries(NISTObjectIdentifiers.dsa_with_sha256, "DSA");
    addEntries(NISTObjectIdentifiers.dsa_with_sha384, "DSA");
    addEntries(NISTObjectIdentifiers.dsa_with_sha512, "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_224, "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_256, "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_384, "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_512, "DSA");
    addEntries(OIWObjectIdentifiers.dsaWithSHA1, "DSA");
    addEntries(OIWObjectIdentifiers.md4WithRSA, "RSA");
    addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, "RSA");
    addEntries(OIWObjectIdentifiers.md5WithRSA, "RSA");
    addEntries(OIWObjectIdentifiers.sha1WithRSA, "RSA");
    addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, "RSA");
    addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, "RSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, "ECDSA");
    addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, "DSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, "RSA");
    addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, "RSA");
    addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1, "RSAandMGF1");
    addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, "RSAandMGF1");
    addEntries(X9ObjectIdentifiers.id_dsa, "DSA");
    addEntries(PKCSObjectIdentifiers.rsaEncryption, "RSA");
    addEntries(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, "RSA");
    addEntries(X509ObjectIdentifiers.id_ea_rsa, "RSA");
    addEntries(PKCSObjectIdentifiers.id_RSASSA_PSS, "RSAandMGF1");
    addEntries(CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
    addEntries(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
    addEntries(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
    addEntries(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
    addEntries(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012-256");
    addEntries(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012-512");
    addEntries(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "ECGOST3410");
    addEntries(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3410");
    addEntries(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "ECGOST3410-2012-256");
    addEntries(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "ECGOST3410-2012-512");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSSignedHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */