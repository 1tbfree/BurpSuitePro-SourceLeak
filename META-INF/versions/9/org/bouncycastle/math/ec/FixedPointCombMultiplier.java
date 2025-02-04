package META-INF.versions.9.org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECMultiplier;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointPreCompInfo;
import org.bouncycastle.math.ec.FixedPointUtil;
import org.bouncycastle.math.raw.Nat;

public class FixedPointCombMultiplier extends AbstractECMultiplier {
  protected ECPoint multiplyPositive(ECPoint paramECPoint, BigInteger paramBigInteger) {
    ECCurve eCCurve = paramECPoint.getCurve();
    int i = FixedPointUtil.getCombSize(eCCurve);
    if (paramBigInteger.bitLength() > i)
      throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order"); 
    FixedPointPreCompInfo fixedPointPreCompInfo = FixedPointUtil.precompute(paramECPoint);
    ECLookupTable eCLookupTable = fixedPointPreCompInfo.getLookupTable();
    int j = fixedPointPreCompInfo.getWidth();
    int k = (i + j - 1) / j;
    ECPoint eCPoint = eCCurve.getInfinity();
    int m = k * j;
    int[] arrayOfInt = Nat.fromBigInteger(m, paramBigInteger);
    int n = m - 1;
    for (byte b = 0; b < k; b++) {
      int i1 = 0;
      int i2;
      for (i2 = n - b; i2 >= 0; i2 -= k) {
        int i3 = arrayOfInt[i2 >>> 5] >>> (i2 & 0x1F);
        i1 ^= i3 >>> 1;
        i1 <<= 1;
        i1 ^= i3;
      } 
      ECPoint eCPoint1 = eCLookupTable.lookup(i1);
      eCPoint = eCPoint.twicePlus(eCPoint1);
    } 
    return eCPoint.add(fixedPointPreCompInfo.getOffset());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\FixedPointCombMultiplier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */