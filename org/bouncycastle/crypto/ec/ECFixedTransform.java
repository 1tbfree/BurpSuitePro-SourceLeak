package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

public class ECFixedTransform implements ECPairFactorTransform {
  private ECPublicKeyParameters key;
  
  private BigInteger k;
  
  public ECFixedTransform(BigInteger paramBigInteger) {
    this.k = paramBigInteger;
  }
  
  public void init(CipherParameters paramCipherParameters) {
    if (!(paramCipherParameters instanceof ECPublicKeyParameters))
      throw new IllegalArgumentException("ECPublicKeyParameters are required for fixed transform."); 
    this.key = (ECPublicKeyParameters)paramCipherParameters;
  }
  
  public ECPair transform(ECPair paramECPair) {
    if (this.key == null)
      throw new IllegalStateException("ECFixedTransform not initialised"); 
    ECDomainParameters eCDomainParameters = this.key.getParameters();
    BigInteger bigInteger1 = eCDomainParameters.getN();
    ECMultiplier eCMultiplier = createBasePointMultiplier();
    BigInteger bigInteger2 = this.k.mod(bigInteger1);
    ECPoint[] arrayOfECPoint = { eCMultiplier.multiply(eCDomainParameters.getG(), bigInteger2).add(ECAlgorithms.cleanPoint(eCDomainParameters.getCurve(), paramECPair.getX())), this.key.getQ().multiply(bigInteger2).add(ECAlgorithms.cleanPoint(eCDomainParameters.getCurve(), paramECPair.getY())) };
    eCDomainParameters.getCurve().normalizeAll(arrayOfECPoint);
    return new ECPair(arrayOfECPoint[0], arrayOfECPoint[1]);
  }
  
  public BigInteger getTransformValue() {
    return this.k;
  }
  
  protected ECMultiplier createBasePointMultiplier() {
    return (ECMultiplier)new FixedPointCombMultiplier();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\ec\ECFixedTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */