package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

public class CramerShoupParameters implements CipherParameters {
  private BigInteger p;
  
  private BigInteger g1;
  
  private BigInteger g2;
  
  private Digest H;
  
  public CramerShoupParameters(BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, Digest paramDigest) {
    this.p = paramBigInteger1;
    this.g1 = paramBigInteger2;
    this.g2 = paramBigInteger3;
    this.H = (Digest)((Memoable)paramDigest).copy();
    this.H.reset();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof CramerShoupParameters))
      return false; 
    CramerShoupParameters cramerShoupParameters = (CramerShoupParameters)paramObject;
    return (cramerShoupParameters.getP().equals(this.p) && cramerShoupParameters.getG1().equals(this.g1) && cramerShoupParameters.getG2().equals(this.g2));
  }
  
  public int hashCode() {
    return getP().hashCode() ^ getG1().hashCode() ^ getG2().hashCode();
  }
  
  public BigInteger getG1() {
    return this.g1;
  }
  
  public BigInteger getG2() {
    return this.g2;
  }
  
  public BigInteger getP() {
    return this.p;
  }
  
  public Digest getH() {
    return (Digest)((Memoable)this.H).copy();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\CramerShoupParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */