package org.bouncycastle.pqc.jcajce.provider.saber;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public class SABERKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
  public PrivateKey engineGeneratePrivate(KeySpec paramKeySpec) throws InvalidKeySpecException {
    if (paramKeySpec instanceof PKCS8EncodedKeySpec) {
      byte[] arrayOfByte = ((PKCS8EncodedKeySpec)paramKeySpec).getEncoded();
      try {
        return generatePrivate(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(arrayOfByte)));
      } catch (Exception exception) {
        throw new InvalidKeySpecException(exception.toString());
      } 
    } 
    throw new InvalidKeySpecException("Unsupported key specification: " + paramKeySpec.getClass() + ".");
  }
  
  public PublicKey engineGeneratePublic(KeySpec paramKeySpec) throws InvalidKeySpecException {
    if (paramKeySpec instanceof X509EncodedKeySpec) {
      byte[] arrayOfByte = ((X509EncodedKeySpec)paramKeySpec).getEncoded();
      try {
        return generatePublic(SubjectPublicKeyInfo.getInstance(arrayOfByte));
      } catch (Exception exception) {
        throw new InvalidKeySpecException(exception.toString());
      } 
    } 
    throw new InvalidKeySpecException("Unknown key specification: " + paramKeySpec + ".");
  }
  
  public final KeySpec engineGetKeySpec(Key paramKey, Class<?> paramClass) throws InvalidKeySpecException {
    if (paramKey instanceof BCSABERPrivateKey) {
      if (PKCS8EncodedKeySpec.class.isAssignableFrom(paramClass))
        return new PKCS8EncodedKeySpec(paramKey.getEncoded()); 
    } else if (paramKey instanceof BCSABERPublicKey) {
      if (X509EncodedKeySpec.class.isAssignableFrom(paramClass))
        return new X509EncodedKeySpec(paramKey.getEncoded()); 
    } else {
      throw new InvalidKeySpecException("Unsupported key type: " + paramKey.getClass() + ".");
    } 
    throw new InvalidKeySpecException("Unknown key specification: " + paramClass + ".");
  }
  
  public final Key engineTranslateKey(Key paramKey) throws InvalidKeyException {
    if (paramKey instanceof BCSABERPrivateKey || paramKey instanceof BCSABERPublicKey)
      return paramKey; 
    throw new InvalidKeyException("Unsupported key type");
  }
  
  public PrivateKey generatePrivate(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    return new BCSABERPrivateKey(paramPrivateKeyInfo);
  }
  
  public PublicKey generatePublic(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    return new BCSABERPublicKey(paramSubjectPublicKeyInfo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\saber\SABERKeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */