package org.bouncycastle.math.ec;

public class ScaleXPointMap implements ECPointMap {
  protected final ECFieldElement scale;
  
  public ScaleXPointMap(ECFieldElement paramECFieldElement) {
    this.scale = paramECFieldElement;
  }
  
  public ECPoint map(ECPoint paramECPoint) {
    return paramECPoint.scaleX(this.scale);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\ScaleXPointMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */