package META-INF.versions.9.org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.djb.Curve25519Field;
import org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement;
import org.bouncycastle.math.ec.custom.djb.Curve25519Point;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

public class Curve25519 extends ECCurve.AbstractFp {
  public static final BigInteger q = Curve25519FieldElement.Q;
  
  private static final BigInteger C_a = new BigInteger(1, Hex.decodeStrict("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
  
  private static final BigInteger C_b = new BigInteger(1, Hex.decodeStrict("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
  
  private static final int CURVE25519_DEFAULT_COORDS = 4;
  
  private static final ECFieldElement[] CURVE25519_AFFINE_ZS = new ECFieldElement[] { (ECFieldElement)new Curve25519FieldElement(ECConstants.ONE), (ECFieldElement)new Curve25519FieldElement(C_a) };
  
  protected Curve25519Point infinity = new Curve25519Point((ECCurve)this, null, null);
  
  public Curve25519() {
    super(q);
  }
  
  protected ECCurve cloneCurve() {
    return (ECCurve)new org.bouncycastle.math.ec.custom.djb.Curve25519();
  }
  
  public boolean supportsCoordinateSystem(int paramInt) {
    switch (paramInt) {
      case 4:
        return true;
    } 
    return false;
  }
  
  public BigInteger getQ() {
    return q;
  }
  
  public int getFieldSize() {
    return q.bitLength();
  }
  
  public ECFieldElement fromBigInteger(BigInteger paramBigInteger) {
    return (ECFieldElement)new Curve25519FieldElement(paramBigInteger);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    return (ECPoint)new Curve25519Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    return (ECPoint)new Curve25519Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  public ECPoint getInfinity() {
    return (ECPoint)this.infinity;
  }
  
  public ECLookupTable createCacheSafeLookupTable(ECPoint[] paramArrayOfECPoint, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt2 * 8 * 2];
    boolean bool = false;
    for (byte b = 0; b < paramInt2; b++) {
      ECPoint eCPoint = paramArrayOfECPoint[paramInt1 + b];
      Nat256.copy(((Curve25519FieldElement)eCPoint.getRawXCoord()).x, 0, arrayOfInt, bool);
      bool += true;
      Nat256.copy(((Curve25519FieldElement)eCPoint.getRawYCoord()).x, 0, arrayOfInt, bool);
      bool += true;
    } 
    return (ECLookupTable)new Object(this, paramInt2, arrayOfInt);
  }
  
  public ECFieldElement randomFieldElement(SecureRandom paramSecureRandom) {
    int[] arrayOfInt = Nat256.create();
    Curve25519Field.random(paramSecureRandom, arrayOfInt);
    return (ECFieldElement)new Curve25519FieldElement(arrayOfInt);
  }
  
  public ECFieldElement randomFieldElementMult(SecureRandom paramSecureRandom) {
    int[] arrayOfInt = Nat256.create();
    Curve25519Field.randomMult(paramSecureRandom, arrayOfInt);
    return (ECFieldElement)new Curve25519FieldElement(arrayOfInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\djb\Curve25519.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */