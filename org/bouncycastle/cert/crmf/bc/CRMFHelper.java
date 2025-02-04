package org.bouncycastle.cert.crmf.bc;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.AlgorithmIdentifierFactory;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.crypto.util.CipherKeyGeneratorFactory;

class CRMFHelper {
  CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier paramASN1ObjectIdentifier, SecureRandom paramSecureRandom) throws CRMFException {
    try {
      return CipherKeyGeneratorFactory.createKeyGenerator(paramASN1ObjectIdentifier, paramSecureRandom);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CRMFException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  static Object createContentCipher(boolean paramBoolean, CipherParameters paramCipherParameters, AlgorithmIdentifier paramAlgorithmIdentifier) throws CRMFException {
    try {
      return CipherFactory.createContentCipher(paramBoolean, paramCipherParameters, paramAlgorithmIdentifier);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CRMFException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  AlgorithmIdentifier generateEncryptionAlgID(ASN1ObjectIdentifier paramASN1ObjectIdentifier, KeyParameter paramKeyParameter, SecureRandom paramSecureRandom) throws CRMFException {
    try {
      return AlgorithmIdentifierFactory.generateEncryptionAlgID(paramASN1ObjectIdentifier, (paramKeyParameter.getKey()).length * 8, paramSecureRandom);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CRMFException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\bc\CRMFHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */