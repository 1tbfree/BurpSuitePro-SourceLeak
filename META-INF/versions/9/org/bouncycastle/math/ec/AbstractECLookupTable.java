package META-INF.versions.9.org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;

public abstract class AbstractECLookupTable implements ECLookupTable {
  public ECPoint lookupVar(int paramInt) {
    return lookup(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\AbstractECLookupTable.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */