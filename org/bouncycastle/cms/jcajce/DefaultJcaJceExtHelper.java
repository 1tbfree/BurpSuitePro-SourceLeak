package org.bouncycastle.cms.jcajce;

import java.security.PrivateKey;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.SymmetricKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceSymmetricKeyUnwrapper;

class DefaultJcaJceExtHelper extends DefaultJcaJceHelper implements JcaJceExtHelper {
  public JceAsymmetricKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier paramAlgorithmIdentifier, PrivateKey paramPrivateKey) {
    paramPrivateKey = CMSUtils.cleanPrivateKey(paramPrivateKey);
    return new JceAsymmetricKeyUnwrapper(paramAlgorithmIdentifier, paramPrivateKey);
  }
  
  public JceKTSKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier paramAlgorithmIdentifier, PrivateKey paramPrivateKey, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    paramPrivateKey = CMSUtils.cleanPrivateKey(paramPrivateKey);
    return new JceKTSKeyUnwrapper(paramAlgorithmIdentifier, paramPrivateKey, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public SymmetricKeyUnwrapper createSymmetricUnwrapper(AlgorithmIdentifier paramAlgorithmIdentifier, SecretKey paramSecretKey) {
    return (SymmetricKeyUnwrapper)new JceSymmetricKeyUnwrapper(paramAlgorithmIdentifier, paramSecretKey);
  }
  
  public AsymmetricKeyUnwrapper createKEMUnwrapper(AlgorithmIdentifier paramAlgorithmIdentifier, PrivateKey paramPrivateKey) {
    return new JceCMSKEMKeyUnwrapper(paramAlgorithmIdentifier, paramPrivateKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\DefaultJcaJceExtHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */