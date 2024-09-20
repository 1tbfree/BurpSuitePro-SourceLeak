package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.ec.custom.sec.SecT163FieldElement;
import org.bouncycastle.math.ec.custom.sec.SecT163K1Point;
import org.bouncycastle.math.raw.Nat192;

public class SecT163K1Curve extends ECCurve.AbstractF2m {
  private static final int SECT163K1_DEFAULT_COORDS = 6;
  
  private static final ECFieldElement[] SECT163K1_AFFINE_ZS = new ECFieldElement[] { (ECFieldElement)new SecT163FieldElement(ECConstants.ONE) };
  
  protected SecT163K1Point infinity = new SecT163K1Point((ECCurve)this, null, null);
  
  public SecT163K1Curve() {
    super(163, 3, 6, 7);
  }
  
  protected ECCurve cloneCurve() {
    return (ECCurve)new org.bouncycastle.math.ec.custom.sec.SecT163K1Curve();
  }
  
  public boolean supportsCoordinateSystem(int paramInt) {
    switch (paramInt) {
      case 6:
        return true;
    } 
    return false;
  }
  
  protected ECMultiplier createDefaultMultiplier() {
    return (ECMultiplier)new WTauNafMultiplier();
  }
  
  public int getFieldSize() {
    return 163;
  }
  
  public ECFieldElement fromBigInteger(BigInteger paramBigInteger) {
    return (ECFieldElement)new SecT163FieldElement(paramBigInteger);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    return (ECPoint)new SecT163K1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    return (ECPoint)new SecT163K1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  public ECPoint getInfinity() {
    return (ECPoint)this.infinity;
  }
  
  public boolean isKoblitz() {
    return true;
  }
  
  public int getM() {
    return 163;
  }
  
  public boolean isTrinomial() {
    return false;
  }
  
  public int getK1() {
    return 3;
  }
  
  public int getK2() {
    return 6;
  }
  
  public int getK3() {
    return 7;
  }
  
  public ECLookupTable createCacheSafeLookupTable(ECPoint[] paramArrayOfECPoint, int paramInt1, int paramInt2) {
    long[] arrayOfLong = new long[paramInt2 * 3 * 2];
    boolean bool = false;
    for (byte b = 0; b < paramInt2; b++) {
      ECPoint eCPoint = paramArrayOfECPoint[paramInt1 + b];
      Nat192.copy64(((SecT163FieldElement)eCPoint.getRawXCoord()).x, 0, arrayOfLong, bool);
      bool += true;
      Nat192.copy64(((SecT163FieldElement)eCPoint.getRawYCoord()).x, 0, arrayOfLong, bool);
      bool += true;
    } 
    return (ECLookupTable)new Object(this, paramInt2, arrayOfLong);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecT163K1Curve.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */