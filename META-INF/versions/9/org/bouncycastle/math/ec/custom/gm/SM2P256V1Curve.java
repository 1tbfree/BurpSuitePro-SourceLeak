package META-INF.versions.9.org.bouncycastle.math.ec.custom.gm;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.gm.SM2P256V1Field;
import org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement;
import org.bouncycastle.math.ec.custom.gm.SM2P256V1Point;
import org.bouncycastle.math.raw.Nat256;

public class SM2P256V1Curve extends ECCurve.AbstractFp {
  public static final BigInteger q = SM2P256V1FieldElement.Q;
  
  private static final int SM2P256V1_DEFAULT_COORDS = 2;
  
  private static final ECFieldElement[] SM2P256V1_AFFINE_ZS = new ECFieldElement[] { (ECFieldElement)new SM2P256V1FieldElement(ECConstants.ONE) };
  
  protected SM2P256V1Point infinity = new SM2P256V1Point((ECCurve)this, null, null);
  
  public SM2P256V1Curve() {
    super(q);
  }
  
  protected ECCurve cloneCurve() {
    return (ECCurve)new org.bouncycastle.math.ec.custom.gm.SM2P256V1Curve();
  }
  
  public boolean supportsCoordinateSystem(int paramInt) {
    switch (paramInt) {
      case 2:
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
    return (ECFieldElement)new SM2P256V1FieldElement(paramBigInteger);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    return (ECPoint)new SM2P256V1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    return (ECPoint)new SM2P256V1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  public ECPoint getInfinity() {
    return (ECPoint)this.infinity;
  }
  
  public ECLookupTable createCacheSafeLookupTable(ECPoint[] paramArrayOfECPoint, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt2 * 8 * 2];
    boolean bool = false;
    for (byte b = 0; b < paramInt2; b++) {
      ECPoint eCPoint = paramArrayOfECPoint[paramInt1 + b];
      Nat256.copy(((SM2P256V1FieldElement)eCPoint.getRawXCoord()).x, 0, arrayOfInt, bool);
      bool += true;
      Nat256.copy(((SM2P256V1FieldElement)eCPoint.getRawYCoord()).x, 0, arrayOfInt, bool);
      bool += true;
    } 
    return (ECLookupTable)new Object(this, paramInt2, arrayOfInt);
  }
  
  public ECFieldElement randomFieldElement(SecureRandom paramSecureRandom) {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.random(paramSecureRandom, arrayOfInt);
    return (ECFieldElement)new SM2P256V1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement randomFieldElementMult(SecureRandom paramSecureRandom) {
    int[] arrayOfInt = Nat256.create();
    SM2P256V1Field.randomMult(paramSecureRandom, arrayOfInt);
    return (ECFieldElement)new SM2P256V1FieldElement(arrayOfInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\gm\SM2P256V1Curve.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */