package META-INF.versions.9.org.bouncycastle.math.ec.custom.gm;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.custom.gm.SM2P256V1Field;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class SM2P256V1FieldElement extends ECFieldElement.AbstractFp {
  public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
  
  protected int[] x;
  
  public SM2P256V1FieldElement(BigInteger paramBigInteger) {
    if (paramBigInteger == null || paramBigInteger.signum() < 0 || paramBigInteger.compareTo(Q) >= 0)
      throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement"); 
    this.x = SM2P256V1Field.fromBigInteger(paramBigInteger);
  }
  
  public SM2P256V1FieldElement() {
    this.x = Nat256.create();
  }
  
  protected SM2P256V1FieldElement(int[] paramArrayOfint) {
    this.x = paramArrayOfint;
  }
  
  public boolean isZero() {
    return Nat256.isZero(this.x);
  }
  
  public boolean isOne() {
    return Nat256.isOne(this.x);
  }
  
  public boolean testBitZero() {
    return (Nat256.getBit(this.x, 0) == 1);
  }
  
  public BigInteger toBigInteger() {
    return Nat256.toBigInteger(this.x);
  }
  
  public String getFieldName() {
    return "SM2P256V1Field";
  }
  
  public int getFieldSize() {
    return Q.bitLength();
  }
  
  public ECFieldElement add(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.add(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement addOne() {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.addOne(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement subtract(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement multiply(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement divide(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.inv(((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement)paramECFieldElement).x, arrayOfInt);
    SM2P256V1Field.multiply(arrayOfInt, this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement negate() {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.negate(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement square() {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.square(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement invert() {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.inv(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement sqrt() {
    int[] arrayOfInt1 = this.x;
    if (Nat256.isZero(arrayOfInt1) || Nat256.isOne(arrayOfInt1))
      return (ECFieldElement)this; 
    int[] arrayOfInt2 = Nat256.create();
    SM2P256V1Field.square(arrayOfInt1, arrayOfInt2);
    SM2P256V1Field.multiply(arrayOfInt2, arrayOfInt1, arrayOfInt2);
    int[] arrayOfInt3 = Nat256.create();
    SM2P256V1Field.squareN(arrayOfInt2, 2, arrayOfInt3);
    SM2P256V1Field.multiply(arrayOfInt3, arrayOfInt2, arrayOfInt3);
    int[] arrayOfInt4 = Nat256.create();
    SM2P256V1Field.squareN(arrayOfInt3, 2, arrayOfInt4);
    SM2P256V1Field.multiply(arrayOfInt4, arrayOfInt2, arrayOfInt4);
    int[] arrayOfInt5 = arrayOfInt2;
    SM2P256V1Field.squareN(arrayOfInt4, 6, arrayOfInt5);
    SM2P256V1Field.multiply(arrayOfInt5, arrayOfInt4, arrayOfInt5);
    int[] arrayOfInt6 = Nat256.create();
    SM2P256V1Field.squareN(arrayOfInt5, 12, arrayOfInt6);
    SM2P256V1Field.multiply(arrayOfInt6, arrayOfInt5, arrayOfInt6);
    int[] arrayOfInt7 = arrayOfInt5;
    SM2P256V1Field.squareN(arrayOfInt6, 6, arrayOfInt7);
    SM2P256V1Field.multiply(arrayOfInt7, arrayOfInt4, arrayOfInt7);
    int[] arrayOfInt8 = arrayOfInt4;
    SM2P256V1Field.square(arrayOfInt7, arrayOfInt8);
    SM2P256V1Field.multiply(arrayOfInt8, arrayOfInt1, arrayOfInt8);
    int[] arrayOfInt9 = arrayOfInt6;
    SM2P256V1Field.squareN(arrayOfInt8, 31, arrayOfInt9);
    int[] arrayOfInt10 = arrayOfInt7;
    SM2P256V1Field.multiply(arrayOfInt9, arrayOfInt8, arrayOfInt10);
    SM2P256V1Field.squareN(arrayOfInt9, 32, arrayOfInt9);
    SM2P256V1Field.multiply(arrayOfInt9, arrayOfInt10, arrayOfInt9);
    SM2P256V1Field.squareN(arrayOfInt9, 62, arrayOfInt9);
    SM2P256V1Field.multiply(arrayOfInt9, arrayOfInt10, arrayOfInt9);
    SM2P256V1Field.squareN(arrayOfInt9, 4, arrayOfInt9);
    SM2P256V1Field.multiply(arrayOfInt9, arrayOfInt3, arrayOfInt9);
    SM2P256V1Field.squareN(arrayOfInt9, 32, arrayOfInt9);
    SM2P256V1Field.multiply(arrayOfInt9, arrayOfInt1, arrayOfInt9);
    SM2P256V1Field.squareN(arrayOfInt9, 62, arrayOfInt9);
    int[] arrayOfInt11 = arrayOfInt3;
    SM2P256V1Field.square(arrayOfInt9, arrayOfInt11);
    return Nat256.eq(arrayOfInt1, arrayOfInt11) ? (ECFieldElement)new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(arrayOfInt9) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement))
      return false; 
    org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement sM2P256V1FieldElement = (org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement)paramObject;
    return Nat256.eq(this.x, sM2P256V1FieldElement.x);
  }
  
  public int hashCode() {
    return Q.hashCode() ^ Arrays.hashCode(this.x, 0, 8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\gm\SM2P256V1FieldElement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */