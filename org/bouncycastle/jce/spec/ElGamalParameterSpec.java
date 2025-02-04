package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class ElGamalParameterSpec implements AlgorithmParameterSpec {
  private BigInteger p;
  
  private BigInteger g;
  
  public ElGamalParameterSpec(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    this.p = paramBigInteger1;
    this.g = paramBigInteger2;
  }
  
  public BigInteger getP() {
    return this.p;
  }
  
  public BigInteger getG() {
    return this.g;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\spec\ElGamalParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */