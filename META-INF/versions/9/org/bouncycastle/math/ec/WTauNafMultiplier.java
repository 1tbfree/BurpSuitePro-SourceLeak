package META-INF.versions.9.org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECMultiplier;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.PreCompCallback;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.math.ec.WTauNafPreCompInfo;
import org.bouncycastle.math.ec.ZTauElement;

public class WTauNafMultiplier extends AbstractECMultiplier {
  static final String PRECOMP_NAME = "bc_wtnaf";
  
  protected ECPoint multiplyPositive(ECPoint paramECPoint, BigInteger paramBigInteger) {
    if (!(paramECPoint instanceof ECPoint.AbstractF2m))
      throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier"); 
    ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m)paramECPoint;
    ECCurve.AbstractF2m abstractF2m1 = (ECCurve.AbstractF2m)abstractF2m.getCurve();
    byte b1 = abstractF2m1.getA().toBigInteger().byteValue();
    byte b2 = Tnaf.getMu(b1);
    ZTauElement zTauElement = Tnaf.partModReduction(abstractF2m1, paramBigInteger, b1, b2, (byte)10);
    return (ECPoint)multiplyWTnaf(abstractF2m, zTauElement, b1, b2);
  }
  
  private ECPoint.AbstractF2m multiplyWTnaf(ECPoint.AbstractF2m paramAbstractF2m, ZTauElement paramZTauElement, byte paramByte1, byte paramByte2) {
    ZTauElement[] arrayOfZTauElement = (paramByte1 == 0) ? Tnaf.alpha0 : Tnaf.alpha1;
    BigInteger bigInteger = Tnaf.getTw(paramByte2, 4);
    byte[] arrayOfByte = Tnaf.tauAdicWNaf(paramByte2, paramZTauElement, 4, bigInteger.intValue(), arrayOfZTauElement);
    return multiplyFromWTnaf(paramAbstractF2m, arrayOfByte);
  }
  
  private static ECPoint.AbstractF2m multiplyFromWTnaf(ECPoint.AbstractF2m paramAbstractF2m, byte[] paramArrayOfbyte) {
    ECCurve.AbstractF2m abstractF2m = (ECCurve.AbstractF2m)paramAbstractF2m.getCurve();
    byte b = abstractF2m.getA().toBigInteger().byteValue();
    WTauNafPreCompInfo wTauNafPreCompInfo = (WTauNafPreCompInfo)abstractF2m.precompute((ECPoint)paramAbstractF2m, "bc_wtnaf", (PreCompCallback)new Object(paramAbstractF2m, b));
    ECPoint.AbstractF2m[] arrayOfAbstractF2m1 = wTauNafPreCompInfo.getPreComp();
    ECPoint.AbstractF2m[] arrayOfAbstractF2m2 = new ECPoint.AbstractF2m[arrayOfAbstractF2m1.length];
    for (byte b1 = 0; b1 < arrayOfAbstractF2m1.length; b1++)
      arrayOfAbstractF2m2[b1] = (ECPoint.AbstractF2m)arrayOfAbstractF2m1[b1].negate(); 
    ECPoint.AbstractF2m abstractF2m1 = (ECPoint.AbstractF2m)paramAbstractF2m.getCurve().getInfinity();
    byte b2 = 0;
    for (int i = paramArrayOfbyte.length - 1; i >= 0; i--) {
      b2++;
      byte b3 = paramArrayOfbyte[i];
      if (b3 != 0) {
        abstractF2m1 = abstractF2m1.tauPow(b2);
        b2 = 0;
        ECPoint.AbstractF2m abstractF2m2 = (b3 > 0) ? arrayOfAbstractF2m1[b3 >>> 1] : arrayOfAbstractF2m2[-b3 >>> 1];
        abstractF2m1 = (ECPoint.AbstractF2m)abstractF2m1.add((ECPoint)abstractF2m2);
      } 
    } 
    if (b2 > 0)
      abstractF2m1 = abstractF2m1.tauPow(b2); 
    return abstractF2m1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\WTauNafMultiplier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */