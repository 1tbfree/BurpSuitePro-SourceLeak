package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.sec.SecT409FieldElement;
import org.bouncycastle.math.ec.custom.sec.SecT409R1Point;
import org.bouncycastle.math.raw.Nat448;

public class SecT409R1Curve extends ECCurve.AbstractF2m {
  private static final int SECT409R1_DEFAULT_COORDS = 6;
  
  private static final ECFieldElement[] SECT409R1_AFFINE_ZS = new ECFieldElement[] { (ECFieldElement)new SecT409FieldElement(ECConstants.ONE) };
  
  protected SecT409R1Point infinity = new SecT409R1Point((ECCurve)this, null, null);
  
  public SecT409R1Curve() {
    super(409, 87, 0, 0);
  }
  
  protected ECCurve cloneCurve() {
    return (ECCurve)new org.bouncycastle.math.ec.custom.sec.SecT409R1Curve();
  }
  
  public boolean supportsCoordinateSystem(int paramInt) {
    switch (paramInt) {
      case 6:
        return true;
    } 
    return false;
  }
  
  public int getFieldSize() {
    return 409;
  }
  
  public ECFieldElement fromBigInteger(BigInteger paramBigInteger) {
    return (ECFieldElement)new SecT409FieldElement(paramBigInteger);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    return (ECPoint)new SecT409R1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    return (ECPoint)new SecT409R1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  public ECPoint getInfinity() {
    return (ECPoint)this.infinity;
  }
  
  public boolean isKoblitz() {
    return false;
  }
  
  public int getM() {
    return 409;
  }
  
  public boolean isTrinomial() {
    return true;
  }
  
  public int getK1() {
    return 87;
  }
  
  public int getK2() {
    return 0;
  }
  
  public int getK3() {
    return 0;
  }
  
  public ECLookupTable createCacheSafeLookupTable(ECPoint[] paramArrayOfECPoint, int paramInt1, int paramInt2) {
    long[] arrayOfLong = new long[paramInt2 * 7 * 2];
    boolean bool = false;
    for (byte b = 0; b < paramInt2; b++) {
      ECPoint eCPoint = paramArrayOfECPoint[paramInt1 + b];
      Nat448.copy64(((SecT409FieldElement)eCPoint.getRawXCoord()).x, 0, arrayOfLong, bool);
      bool += true;
      Nat448.copy64(((SecT409FieldElement)eCPoint.getRawYCoord()).x, 0, arrayOfLong, bool);
      bool += true;
    } 
    return (ECLookupTable)new Object(this, paramInt2, arrayOfLong);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecT409R1Curve.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */