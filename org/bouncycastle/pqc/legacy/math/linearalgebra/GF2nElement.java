package org.bouncycastle.pqc.legacy.math.linearalgebra;

public abstract class GF2nElement implements GFElement {
  protected GF2nField mField;
  
  protected int mDegree;
  
  public abstract Object clone();
  
  abstract void assignZero();
  
  abstract void assignOne();
  
  public abstract boolean testRightmostBit();
  
  abstract boolean testBit(int paramInt);
  
  public final GF2nField getField() {
    return this.mField;
  }
  
  public abstract GF2nElement increase();
  
  public abstract void increaseThis();
  
  public final GFElement subtract(GFElement paramGFElement) {
    return add(paramGFElement);
  }
  
  public final void subtractFromThis(GFElement paramGFElement) {
    addToThis(paramGFElement);
  }
  
  public abstract GF2nElement square();
  
  public abstract void squareThis();
  
  public abstract GF2nElement squareRoot();
  
  public abstract void squareRootThis();
  
  public final GF2nElement convert(GF2nField paramGF2nField) {
    return this.mField.convert(this, paramGF2nField);
  }
  
  public abstract int trace();
  
  public abstract GF2nElement solveQuadraticEquation() throws RuntimeException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\linearalgebra\GF2nElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */