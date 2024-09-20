package META-INF.versions.9.org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.PreCompInfo;

public class WTauNafPreCompInfo implements PreCompInfo {
  protected ECPoint.AbstractF2m[] preComp = null;
  
  public ECPoint.AbstractF2m[] getPreComp() {
    return this.preComp;
  }
  
  public void setPreComp(ECPoint.AbstractF2m[] paramArrayOfAbstractF2m) {
    this.preComp = paramArrayOfAbstractF2m;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\WTauNafPreCompInfo.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */