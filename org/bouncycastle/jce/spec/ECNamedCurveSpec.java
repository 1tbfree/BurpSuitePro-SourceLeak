package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

public class ECNamedCurveSpec extends ECParameterSpec {
  private String name;
  
  private static EllipticCurve convertCurve(ECCurve paramECCurve, byte[] paramArrayOfbyte) {
    ECField eCField = convertField(paramECCurve.getField());
    BigInteger bigInteger1 = paramECCurve.getA().toBigInteger();
    BigInteger bigInteger2 = paramECCurve.getB().toBigInteger();
    return new EllipticCurve(eCField, bigInteger1, bigInteger2, paramArrayOfbyte);
  }
  
  private static ECField convertField(FiniteField paramFiniteField) {
    if (ECAlgorithms.isFpField(paramFiniteField))
      return new ECFieldFp(paramFiniteField.getCharacteristic()); 
    Polynomial polynomial = ((PolynomialExtensionField)paramFiniteField).getMinimalPolynomial();
    int[] arrayOfInt1 = polynomial.getExponentsPresent();
    int[] arrayOfInt2 = Arrays.reverseInPlace(Arrays.copyOfRange(arrayOfInt1, 1, arrayOfInt1.length - 1));
    return new ECFieldF2m(polynomial.getDegree(), arrayOfInt2);
  }
  
  public ECNamedCurveSpec(String paramString, ECCurve paramECCurve, ECPoint paramECPoint, BigInteger paramBigInteger) {
    super(convertCurve(paramECCurve, null), EC5Util.convertPoint(paramECPoint), paramBigInteger, 1);
    this.name = paramString;
  }
  
  public ECNamedCurveSpec(String paramString, EllipticCurve paramEllipticCurve, ECPoint paramECPoint, BigInteger paramBigInteger) {
    super(paramEllipticCurve, paramECPoint, paramBigInteger, 1);
    this.name = paramString;
  }
  
  public ECNamedCurveSpec(String paramString, ECCurve paramECCurve, ECPoint paramECPoint, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    super(convertCurve(paramECCurve, null), EC5Util.convertPoint(paramECPoint), paramBigInteger1, paramBigInteger2.intValue());
    this.name = paramString;
  }
  
  public ECNamedCurveSpec(String paramString, EllipticCurve paramEllipticCurve, ECPoint paramECPoint, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    super(paramEllipticCurve, paramECPoint, paramBigInteger1, paramBigInteger2.intValue());
    this.name = paramString;
  }
  
  public ECNamedCurveSpec(String paramString, ECCurve paramECCurve, ECPoint paramECPoint, BigInteger paramBigInteger1, BigInteger paramBigInteger2, byte[] paramArrayOfbyte) {
    super(convertCurve(paramECCurve, paramArrayOfbyte), EC5Util.convertPoint(paramECPoint), paramBigInteger1, paramBigInteger2.intValue());
    this.name = paramString;
  }
  
  public String getName() {
    return this.name;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\spec\ECNamedCurveSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */