package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.agreement.ECVKOAgreement;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;

public class KeyAgreementSpi extends BaseAgreementSpi {
  private static final X9IntegerConverter converter = new X9IntegerConverter();
  
  private String kaAlgorithm;
  
  private ECDomainParameters parameters;
  
  private ECVKOAgreement agreement;
  
  private byte[] result;
  
  protected KeyAgreementSpi(String paramString, ECVKOAgreement paramECVKOAgreement, DerivationFunction paramDerivationFunction) {
    super(paramString, paramDerivationFunction);
    this.kaAlgorithm = paramString;
    this.agreement = paramECVKOAgreement;
  }
  
  protected Key engineDoPhase(Key paramKey, boolean paramBoolean) throws InvalidKeyException, IllegalStateException {
    if (this.parameters == null)
      throw new IllegalStateException(this.kaAlgorithm + " not initialised."); 
    if (!paramBoolean)
      throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties."); 
    if (!(paramKey instanceof PublicKey))
      throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(ECPublicKey.class) + " for doPhase"); 
    AsymmetricKeyParameter asymmetricKeyParameter = generatePublicKeyParameter((PublicKey)paramKey);
    try {
      this.result = this.agreement.calculateAgreement((CipherParameters)asymmetricKeyParameter);
    } catch (Exception exception) {
      throw new InvalidKeyException("calculation failed: " + exception.getMessage()) {
          public Throwable getCause() {
            return e;
          }
        };
    } 
    return null;
  }
  
  protected void doInitFromKey(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    if (!(paramKey instanceof PrivateKey))
      throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(ECPrivateKey.class) + " for initialisation"); 
    if (paramAlgorithmParameterSpec != null && !(paramAlgorithmParameterSpec instanceof UserKeyingMaterialSpec))
      throw new InvalidAlgorithmParameterException("No algorithm parameters supported"); 
    ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters)ECUtil.generatePrivateKeyParameter((PrivateKey)paramKey);
    this.parameters = eCPrivateKeyParameters.getParameters();
    this.ukmParameters = (paramAlgorithmParameterSpec instanceof UserKeyingMaterialSpec) ? ((UserKeyingMaterialSpec)paramAlgorithmParameterSpec).getUserKeyingMaterial() : null;
    this.agreement.init((CipherParameters)new ParametersWithUKM((CipherParameters)eCPrivateKeyParameters, this.ukmParameters));
  }
  
  private static String getSimpleName(Class paramClass) {
    String str = paramClass.getName();
    return str.substring(str.lastIndexOf('.') + 1);
  }
  
  protected byte[] doCalcSecret() {
    return this.result;
  }
  
  static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey paramPublicKey) throws InvalidKeyException {
    return (paramPublicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey) ? (AsymmetricKeyParameter)((BCECGOST3410PublicKey)paramPublicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(paramPublicKey);
  }
  
  public static class ECVKO extends KeyAgreementSpi {
    public ECVKO() {
      super("ECGOST3410", new ECVKOAgreement((Digest)new GOST3411Digest()), null);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ecgost\KeyAgreementSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */