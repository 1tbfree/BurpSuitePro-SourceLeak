package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DSAPublicKeyParameters extends DSAKeyParameters {
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private static final BigInteger TWO = BigInteger.valueOf(2L);
  
  private BigInteger y;
  
  public DSAPublicKeyParameters(BigInteger paramBigInteger, DSAParameters paramDSAParameters) {
    super(false, paramDSAParameters);
    this.y = validate(paramBigInteger, paramDSAParameters);
  }
  
  private BigInteger validate(BigInteger paramBigInteger, DSAParameters paramDSAParameters) {
    if (paramDSAParameters != null) {
      if (TWO.compareTo(paramBigInteger) <= 0 && paramDSAParameters.getP().subtract(TWO).compareTo(paramBigInteger) >= 0 && ONE.equals(paramBigInteger.modPow(paramDSAParameters.getQ(), paramDSAParameters.getP())))
        return paramBigInteger; 
      throw new IllegalArgumentException("y value does not appear to be in correct group");
    } 
    return paramBigInteger;
  }
  
  public BigInteger getY() {
    return this.y;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\DSAPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */