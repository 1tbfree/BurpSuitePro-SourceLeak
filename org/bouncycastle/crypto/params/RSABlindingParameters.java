package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class RSABlindingParameters implements CipherParameters {
  private RSAKeyParameters publicKey;
  
  private BigInteger blindingFactor;
  
  public RSABlindingParameters(RSAKeyParameters paramRSAKeyParameters, BigInteger paramBigInteger) {
    if (paramRSAKeyParameters instanceof RSAPrivateCrtKeyParameters)
      throw new IllegalArgumentException("RSA parameters should be for a public key"); 
    this.publicKey = paramRSAKeyParameters;
    this.blindingFactor = paramBigInteger;
  }
  
  public RSAKeyParameters getPublicKey() {
    return this.publicKey;
  }
  
  public BigInteger getBlindingFactor() {
    return this.blindingFactor;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\RSABlindingParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */