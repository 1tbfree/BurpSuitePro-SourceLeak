package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class SecP160R2FieldElement extends ECFieldElement.AbstractFp {
  public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
  
  protected int[] x;
  
  public SecP160R2FieldElement(BigInteger paramBigInteger) {
    if (paramBigInteger == null || paramBigInteger.signum() < 0 || paramBigInteger.compareTo(Q) >= 0)
      throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement"); 
    this.x = SecP160R2Field.fromBigInteger(paramBigInteger);
  }
  
  public SecP160R2FieldElement() {
    this.x = Nat160.create();
  }
  
  protected SecP160R2FieldElement(int[] paramArrayOfint) {
    this.x = paramArrayOfint;
  }
  
  public boolean isZero() {
    return Nat160.isZero(this.x);
  }
  
  public boolean isOne() {
    return Nat160.isOne(this.x);
  }
  
  public boolean testBitZero() {
    return (Nat160.getBit(this.x, 0) == 1);
  }
  
  public BigInteger toBigInteger() {
    return Nat160.toBigInteger(this.x);
  }
  
  public String getFieldName() {
    return "SecP160R2Field";
  }
  
  public int getFieldSize() {
    return Q.bitLength();
  }
  
  public ECFieldElement add(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement addOne() {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.addOne(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement subtract(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement multiply(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement divide(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement)paramECFieldElement).x, arrayOfInt);
    SecP160R2Field.multiply(arrayOfInt, this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement negate() {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.negate(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement square() {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.square(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement invert() {
    int[] arrayOfInt = Nat160.create();
    SecP160R2Field.inv(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt);
  }
  
  public ECFieldElement sqrt() {
    int[] arrayOfInt1 = this.x;
    if (Nat160.isZero(arrayOfInt1) || Nat160.isOne(arrayOfInt1))
      return (ECFieldElement)this; 
    int[] arrayOfInt2 = Nat160.create();
    SecP160R2Field.square(arrayOfInt1, arrayOfInt2);
    SecP160R2Field.multiply(arrayOfInt2, arrayOfInt1, arrayOfInt2);
    int[] arrayOfInt3 = Nat160.create();
    SecP160R2Field.square(arrayOfInt2, arrayOfInt3);
    SecP160R2Field.multiply(arrayOfInt3, arrayOfInt1, arrayOfInt3);
    int[] arrayOfInt4 = Nat160.create();
    SecP160R2Field.square(arrayOfInt3, arrayOfInt4);
    SecP160R2Field.multiply(arrayOfInt4, arrayOfInt1, arrayOfInt4);
    int[] arrayOfInt5 = Nat160.create();
    SecP160R2Field.squareN(arrayOfInt4, 3, arrayOfInt5);
    SecP160R2Field.multiply(arrayOfInt5, arrayOfInt3, arrayOfInt5);
    int[] arrayOfInt6 = arrayOfInt4;
    SecP160R2Field.squareN(arrayOfInt5, 7, arrayOfInt6);
    SecP160R2Field.multiply(arrayOfInt6, arrayOfInt5, arrayOfInt6);
    int[] arrayOfInt7 = arrayOfInt5;
    SecP160R2Field.squareN(arrayOfInt6, 3, arrayOfInt7);
    SecP160R2Field.multiply(arrayOfInt7, arrayOfInt3, arrayOfInt7);
    int[] arrayOfInt8 = Nat160.create();
    SecP160R2Field.squareN(arrayOfInt7, 14, arrayOfInt8);
    SecP160R2Field.multiply(arrayOfInt8, arrayOfInt6, arrayOfInt8);
    int[] arrayOfInt9 = arrayOfInt6;
    SecP160R2Field.squareN(arrayOfInt8, 31, arrayOfInt9);
    SecP160R2Field.multiply(arrayOfInt9, arrayOfInt8, arrayOfInt9);
    int[] arrayOfInt10 = arrayOfInt8;
    SecP160R2Field.squareN(arrayOfInt9, 62, arrayOfInt10);
    SecP160R2Field.multiply(arrayOfInt10, arrayOfInt9, arrayOfInt10);
    int[] arrayOfInt11 = arrayOfInt9;
    SecP160R2Field.squareN(arrayOfInt10, 3, arrayOfInt11);
    SecP160R2Field.multiply(arrayOfInt11, arrayOfInt3, arrayOfInt11);
    int[] arrayOfInt12 = arrayOfInt11;
    SecP160R2Field.squareN(arrayOfInt12, 18, arrayOfInt12);
    SecP160R2Field.multiply(arrayOfInt12, arrayOfInt7, arrayOfInt12);
    SecP160R2Field.squareN(arrayOfInt12, 2, arrayOfInt12);
    SecP160R2Field.multiply(arrayOfInt12, arrayOfInt1, arrayOfInt12);
    SecP160R2Field.squareN(arrayOfInt12, 3, arrayOfInt12);
    SecP160R2Field.multiply(arrayOfInt12, arrayOfInt2, arrayOfInt12);
    SecP160R2Field.squareN(arrayOfInt12, 6, arrayOfInt12);
    SecP160R2Field.multiply(arrayOfInt12, arrayOfInt3, arrayOfInt12);
    SecP160R2Field.squareN(arrayOfInt12, 2, arrayOfInt12);
    SecP160R2Field.multiply(arrayOfInt12, arrayOfInt1, arrayOfInt12);
    int[] arrayOfInt13 = arrayOfInt2;
    SecP160R2Field.square(arrayOfInt12, arrayOfInt13);
    return Nat160.eq(arrayOfInt1, arrayOfInt13) ? (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(arrayOfInt12) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement))
      return false; 
    org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement secP160R2FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement)paramObject;
    return Nat160.eq(this.x, secP160R2FieldElement.x);
  }
  
  public int hashCode() {
    return Q.hashCode() ^ Arrays.hashCode(this.x, 0, 5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP160R2FieldElement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */