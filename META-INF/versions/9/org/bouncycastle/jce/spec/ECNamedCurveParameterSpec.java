package META-INF.versions.9.org.bouncycastle.jce.spec;

import java.math.BigInteger;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECNamedCurveParameterSpec extends ECParameterSpec {
  private String name;
  
  public ECNamedCurveParameterSpec(String paramString, ECCurve paramECCurve, ECPoint paramECPoint, BigInteger paramBigInteger) {
    super(paramECCurve, paramECPoint, paramBigInteger);
    this.name = paramString;
  }
  
  public ECNamedCurveParameterSpec(String paramString, ECCurve paramECCurve, ECPoint paramECPoint, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    super(paramECCurve, paramECPoint, paramBigInteger1, paramBigInteger2);
    this.name = paramString;
  }
  
  public ECNamedCurveParameterSpec(String paramString, ECCurve paramECCurve, ECPoint paramECPoint, BigInteger paramBigInteger1, BigInteger paramBigInteger2, byte[] paramArrayOfbyte) {
    super(paramECCurve, paramECPoint, paramBigInteger1, paramBigInteger2, paramArrayOfbyte);
    this.name = paramString;
  }
  
  public String getName() {
    return this.name;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jce\spec\ECNamedCurveParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */