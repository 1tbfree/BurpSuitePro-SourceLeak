package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class SecP521R1FieldElement extends ECFieldElement.AbstractFp {
  public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
  
  protected int[] x;
  
  public SecP521R1FieldElement(BigInteger paramBigInteger) {
    if (paramBigInteger == null || paramBigInteger.signum() < 0 || paramBigInteger.compareTo(Q) >= 0)
      throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement"); 
    this.x = SecP521R1Field.fromBigInteger(paramBigInteger);
  }
  
  public SecP521R1FieldElement() {
    this.x = Nat.create(17);
  }
  
  protected SecP521R1FieldElement(int[] paramArrayOfint) {
    this.x = paramArrayOfint;
  }
  
  public boolean isZero() {
    return Nat.isZero(17, this.x);
  }
  
  public boolean isOne() {
    return Nat.isOne(17, this.x);
  }
  
  public boolean testBitZero() {
    return (Nat.getBit(this.x, 0) == 1);
  }
  
  public BigInteger toBigInteger() {
    return Nat.toBigInteger(17, this.x);
  }
  
  public String getFieldName() {
    return "SecP521R1Field";
  }
  
  public int getFieldSize() {
    return Q.bitLength();
  }
  
  public ECFieldElement add(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement addOne() {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.addOne(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement subtract(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement multiply(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement divide(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement)paramECFieldElement).x, arrayOfInt);
    SecP521R1Field.multiply(arrayOfInt, this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement negate() {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.negate(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement square() {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.square(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement invert() {
    int[] arrayOfInt = Nat.create(17);
    SecP521R1Field.inv(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement sqrt() {
    int[] arrayOfInt1 = this.x;
    if (Nat.isZero(17, arrayOfInt1) || Nat.isOne(17, arrayOfInt1))
      return (ECFieldElement)this; 
    int[] arrayOfInt2 = Nat.create(33);
    int[] arrayOfInt3 = Nat.create(17);
    int[] arrayOfInt4 = Nat.create(17);
    SecP521R1Field.squareN(arrayOfInt1, 519, arrayOfInt3, arrayOfInt2);
    SecP521R1Field.square(arrayOfInt3, arrayOfInt4, arrayOfInt2);
    return Nat.eq(17, arrayOfInt1, arrayOfInt4) ? (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement(arrayOfInt3) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement))
      return false; 
    org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement secP521R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement)paramObject;
    return Nat.eq(17, this.x, secP521R1FieldElement.x);
  }
  
  public int hashCode() {
    return Q.hashCode() ^ Arrays.hashCode(this.x, 0, 17);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP521R1FieldElement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */