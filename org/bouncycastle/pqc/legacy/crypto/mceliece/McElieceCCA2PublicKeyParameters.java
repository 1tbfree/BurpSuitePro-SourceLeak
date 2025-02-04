package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
  private int n;
  
  private int t;
  
  private GF2Matrix matrixG;
  
  public McElieceCCA2PublicKeyParameters(int paramInt1, int paramInt2, GF2Matrix paramGF2Matrix, String paramString) {
    super(false, paramString);
    this.n = paramInt1;
    this.t = paramInt2;
    this.matrixG = new GF2Matrix(paramGF2Matrix);
  }
  
  public int getN() {
    return this.n;
  }
  
  public int getT() {
    return this.t;
  }
  
  public GF2Matrix getG() {
    return this.matrixG;
  }
  
  public int getK() {
    return this.matrixG.getNumRows();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\mceliece\McElieceCCA2PublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */