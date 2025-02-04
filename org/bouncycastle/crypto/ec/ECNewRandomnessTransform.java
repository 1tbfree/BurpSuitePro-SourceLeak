package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

public class ECNewRandomnessTransform implements ECPairFactorTransform {
  private ECPublicKeyParameters key;
  
  private SecureRandom random;
  
  private BigInteger lastK;
  
  public void init(CipherParameters paramCipherParameters) {
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters))
        throw new IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform."); 
      this.key = (ECPublicKeyParameters)parametersWithRandom.getParameters();
      this.random = parametersWithRandom.getRandom();
    } else {
      if (!(paramCipherParameters instanceof ECPublicKeyParameters))
        throw new IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform."); 
      this.key = (ECPublicKeyParameters)paramCipherParameters;
      this.random = CryptoServicesRegistrar.getSecureRandom();
    } 
  }
  
  public ECPair transform(ECPair paramECPair) {
    if (this.key == null)
      throw new IllegalStateException("ECNewRandomnessTransform not initialised"); 
    ECDomainParameters eCDomainParameters = this.key.getParameters();
    BigInteger bigInteger1 = eCDomainParameters.getN();
    ECMultiplier eCMultiplier = createBasePointMultiplier();
    BigInteger bigInteger2 = ECUtil.generateK(bigInteger1, this.random);
    ECPoint[] arrayOfECPoint = { eCMultiplier.multiply(eCDomainParameters.getG(), bigInteger2).add(ECAlgorithms.cleanPoint(eCDomainParameters.getCurve(), paramECPair.getX())), this.key.getQ().multiply(bigInteger2).add(ECAlgorithms.cleanPoint(eCDomainParameters.getCurve(), paramECPair.getY())) };
    eCDomainParameters.getCurve().normalizeAll(arrayOfECPoint);
    this.lastK = bigInteger2;
    return new ECPair(arrayOfECPoint[0], arrayOfECPoint[1]);
  }
  
  public BigInteger getTransformValue() {
    return this.lastK;
  }
  
  protected ECMultiplier createBasePointMultiplier() {
    return (ECMultiplier)new FixedPointCombMultiplier();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\ec\ECNewRandomnessTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */