package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi {
  protected KeySpec engineGetKeySpec(Key paramKey, Class paramClass) throws InvalidKeySpecException {
    if (paramClass.isAssignableFrom(ECPublicKeySpec.class) && paramKey instanceof ECPublicKey) {
      ECPublicKey eCPublicKey = (ECPublicKey)paramKey;
      if (eCPublicKey.getParams() != null)
        return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams()); 
      ECParameterSpec eCParameterSpec = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
      return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec));
    } 
    if (paramClass.isAssignableFrom(ECPrivateKeySpec.class) && paramKey instanceof ECPrivateKey) {
      ECPrivateKey eCPrivateKey = (ECPrivateKey)paramKey;
      if (eCPrivateKey.getParams() != null)
        return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams()); 
      ECParameterSpec eCParameterSpec = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
      return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec));
    } 
    if (paramClass.isAssignableFrom(ECPublicKeySpec.class) && paramKey instanceof ECPublicKey) {
      ECPublicKey eCPublicKey = (ECPublicKey)paramKey;
      if (eCPublicKey.getParams() != null)
        return (KeySpec)new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey.getParams(), eCPublicKey.getW()), EC5Util.convertSpec(eCPublicKey.getParams())); 
      ECParameterSpec eCParameterSpec = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
      return (KeySpec)new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey.getParams(), eCPublicKey.getW()), eCParameterSpec);
    } 
    if (paramClass.isAssignableFrom(ECPrivateKeySpec.class) && paramKey instanceof ECPrivateKey) {
      ECPrivateKey eCPrivateKey = (ECPrivateKey)paramKey;
      if (eCPrivateKey.getParams() != null)
        return (KeySpec)new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(eCPrivateKey.getParams())); 
      ECParameterSpec eCParameterSpec = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
      return (KeySpec)new ECPrivateKeySpec(eCPrivateKey.getS(), eCParameterSpec);
    } 
    return super.engineGetKeySpec(paramKey, paramClass);
  }
  
  protected Key engineTranslateKey(Key paramKey) throws InvalidKeyException {
    throw new InvalidKeyException("key type unknown");
  }
  
  protected PrivateKey engineGeneratePrivate(KeySpec paramKeySpec) throws InvalidKeySpecException {
    return (paramKeySpec instanceof ECPrivateKeySpec) ? new BCECGOST3410PrivateKey((ECPrivateKeySpec)paramKeySpec) : ((paramKeySpec instanceof ECPrivateKeySpec) ? new BCECGOST3410PrivateKey((ECPrivateKeySpec)paramKeySpec) : super.engineGeneratePrivate(paramKeySpec));
  }
  
  protected PublicKey engineGeneratePublic(KeySpec paramKeySpec) throws InvalidKeySpecException {
    return (paramKeySpec instanceof ECPublicKeySpec) ? new BCECGOST3410PublicKey((ECPublicKeySpec)paramKeySpec, BouncyCastleProvider.CONFIGURATION) : ((paramKeySpec instanceof ECPublicKeySpec) ? new BCECGOST3410PublicKey((ECPublicKeySpec)paramKeySpec) : super.engineGeneratePublic(paramKeySpec));
  }
  
  public PrivateKey generatePrivate(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramPrivateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)CryptoProObjectIdentifiers.gostR3410_2001))
      return new BCECGOST3410PrivateKey(paramPrivateKeyInfo); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)CryptoProObjectIdentifiers.gostR3410_2001DH))
      return new BCECGOST3410PrivateKey(paramPrivateKeyInfo); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH))
      return new BCECGOST3410PrivateKey(paramPrivateKeyInfo); 
    throw new IOException("algorithm identifier " + aSN1ObjectIdentifier + " in key not recognised");
  }
  
  public PublicKey generatePublic(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm();
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)CryptoProObjectIdentifiers.gostR3410_2001))
      return new BCECGOST3410PublicKey(paramSubjectPublicKeyInfo); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)CryptoProObjectIdentifiers.gostR3410_2001DH))
      return new BCECGOST3410PublicKey(paramSubjectPublicKeyInfo); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH))
      return new BCECGOST3410PublicKey(paramSubjectPublicKeyInfo); 
    throw new IOException("algorithm identifier " + aSN1ObjectIdentifier + " in key not recognised");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ecgost\KeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */