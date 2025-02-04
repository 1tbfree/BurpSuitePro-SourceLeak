package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

public class EC5Util {
  public static ECCurve getCurve(ProviderConfiguration paramProviderConfiguration, X962Parameters paramX962Parameters) {
    ECCurve eCCurve;
    Set set = paramProviderConfiguration.getAcceptableNamedCurves();
    if (paramX962Parameters.isNamedCurve()) {
      ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(paramX962Parameters.getParameters());
      if (set.isEmpty() || set.contains(aSN1ObjectIdentifier)) {
        X9ECParameters x9ECParameters = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
        if (x9ECParameters == null)
          x9ECParameters = (X9ECParameters)paramProviderConfiguration.getAdditionalECParameters().get(aSN1ObjectIdentifier); 
        eCCurve = x9ECParameters.getCurve();
      } else {
        throw new IllegalStateException("named curve not acceptable");
      } 
    } else if (paramX962Parameters.isImplicitlyCA()) {
      eCCurve = paramProviderConfiguration.getEcImplicitlyCa().getCurve();
    } else {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramX962Parameters.getParameters());
      if (set.isEmpty()) {
        if (aSN1Sequence.size() > 3) {
          X9ECParameters x9ECParameters = X9ECParameters.getInstance(aSN1Sequence);
          eCCurve = x9ECParameters.getCurve();
        } else {
          ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
          eCCurve = ECGOST3410NamedCurves.getByOIDX9(aSN1ObjectIdentifier).getCurve();
        } 
      } else {
        throw new IllegalStateException("encoded parameters not acceptable");
      } 
    } 
    return eCCurve;
  }
  
  public static ECDomainParameters getDomainParameters(ProviderConfiguration paramProviderConfiguration, ECParameterSpec paramECParameterSpec) {
    ECDomainParameters eCDomainParameters;
    if (paramECParameterSpec == null) {
      ECParameterSpec eCParameterSpec = paramProviderConfiguration.getEcImplicitlyCa();
      eCDomainParameters = new ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH(), eCParameterSpec.getSeed());
    } else {
      eCDomainParameters = ECUtil.getDomainParameters(paramProviderConfiguration, convertSpec(paramECParameterSpec));
    } 
    return eCDomainParameters;
  }
  
  public static ECParameterSpec convertToSpec(X962Parameters paramX962Parameters, ECCurve paramECCurve) {
    ECNamedCurveSpec eCNamedCurveSpec;
    if (paramX962Parameters.isNamedCurve()) {
      ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier)paramX962Parameters.getParameters();
      X9ECParameters x9ECParameters = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
      if (x9ECParameters == null) {
        Map map = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
        if (!map.isEmpty())
          x9ECParameters = (X9ECParameters)map.get(aSN1ObjectIdentifier); 
      } 
      EllipticCurve ellipticCurve = convertCurve(paramECCurve, x9ECParameters.getSeed());
      eCNamedCurveSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), ellipticCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH());
    } else if (paramX962Parameters.isImplicitlyCA()) {
      eCNamedCurveSpec = null;
    } else {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramX962Parameters.getParameters());
      if (aSN1Sequence.size() > 3) {
        X9ECParameters x9ECParameters = X9ECParameters.getInstance(aSN1Sequence);
        EllipticCurve ellipticCurve = convertCurve(paramECCurve, x9ECParameters.getSeed());
        if (x9ECParameters.getH() != null) {
          ECParameterSpec eCParameterSpec = new ECParameterSpec(ellipticCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        } else {
          ECParameterSpec eCParameterSpec = new ECParameterSpec(ellipticCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), 1);
        } 
      } else {
        GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(aSN1Sequence);
        ECNamedCurveParameterSpec eCNamedCurveParameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
        paramECCurve = eCNamedCurveParameterSpec.getCurve();
        EllipticCurve ellipticCurve = convertCurve(paramECCurve, eCNamedCurveParameterSpec.getSeed());
        eCNamedCurveSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()), ellipticCurve, convertPoint(eCNamedCurveParameterSpec.getG()), eCNamedCurveParameterSpec.getN(), eCNamedCurveParameterSpec.getH());
      } 
    } 
    return (ECParameterSpec)eCNamedCurveSpec;
  }
  
  public static ECParameterSpec convertToSpec(X9ECParameters paramX9ECParameters) {
    return new ECParameterSpec(convertCurve(paramX9ECParameters.getCurve(), null), convertPoint(paramX9ECParameters.getG()), paramX9ECParameters.getN(), paramX9ECParameters.getH().intValue());
  }
  
  public static ECParameterSpec convertToSpec(ECDomainParameters paramECDomainParameters) {
    return new ECParameterSpec(convertCurve(paramECDomainParameters.getCurve(), null), convertPoint(paramECDomainParameters.getG()), paramECDomainParameters.getN(), paramECDomainParameters.getH().intValue());
  }
  
  public static EllipticCurve convertCurve(ECCurve paramECCurve, byte[] paramArrayOfbyte) {
    ECField eCField = convertField(paramECCurve.getField());
    BigInteger bigInteger1 = paramECCurve.getA().toBigInteger();
    BigInteger bigInteger2 = paramECCurve.getB().toBigInteger();
    return new EllipticCurve(eCField, bigInteger1, bigInteger2, null);
  }
  
  public static ECCurve convertCurve(EllipticCurve paramEllipticCurve) {
    ECField eCField = paramEllipticCurve.getField();
    BigInteger bigInteger1 = paramEllipticCurve.getA();
    BigInteger bigInteger2 = paramEllipticCurve.getB();
    if (eCField instanceof ECFieldFp)
      return CustomCurves.substitute((ECCurve)new ECCurve.Fp(((ECFieldFp)eCField).getP(), bigInteger1, bigInteger2, null, null)); 
    ECFieldF2m eCFieldF2m = (ECFieldF2m)eCField;
    int i = eCFieldF2m.getM();
    int[] arrayOfInt = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
    return (ECCurve)new ECCurve.F2m(i, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], bigInteger1, bigInteger2, null, null);
  }
  
  public static ECField convertField(FiniteField paramFiniteField) {
    if (ECAlgorithms.isFpField(paramFiniteField))
      return new ECFieldFp(paramFiniteField.getCharacteristic()); 
    Polynomial polynomial = ((PolynomialExtensionField)paramFiniteField).getMinimalPolynomial();
    int[] arrayOfInt1 = polynomial.getExponentsPresent();
    int[] arrayOfInt2 = Arrays.reverseInPlace(Arrays.copyOfRange(arrayOfInt1, 1, arrayOfInt1.length - 1));
    return new ECFieldF2m(polynomial.getDegree(), arrayOfInt2);
  }
  
  public static ECParameterSpec convertSpec(EllipticCurve paramEllipticCurve, ECParameterSpec paramECParameterSpec) {
    ECPoint eCPoint = convertPoint(paramECParameterSpec.getG());
    if (paramECParameterSpec instanceof ECNamedCurveParameterSpec) {
      String str = ((ECNamedCurveParameterSpec)paramECParameterSpec).getName();
      return (ECParameterSpec)new ECNamedCurveSpec(str, paramEllipticCurve, eCPoint, paramECParameterSpec.getN(), paramECParameterSpec.getH());
    } 
    return new ECParameterSpec(paramEllipticCurve, eCPoint, paramECParameterSpec.getN(), paramECParameterSpec.getH().intValue());
  }
  
  public static ECParameterSpec convertSpec(ECParameterSpec paramECParameterSpec) {
    ECCurve eCCurve = convertCurve(paramECParameterSpec.getCurve());
    ECPoint eCPoint = convertPoint(eCCurve, paramECParameterSpec.getGenerator());
    BigInteger bigInteger1 = paramECParameterSpec.getOrder();
    BigInteger bigInteger2 = BigInteger.valueOf(paramECParameterSpec.getCofactor());
    byte[] arrayOfByte = paramECParameterSpec.getCurve().getSeed();
    return (ECParameterSpec)((paramECParameterSpec instanceof ECNamedCurveSpec) ? new ECNamedCurveParameterSpec(((ECNamedCurveSpec)paramECParameterSpec).getName(), eCCurve, eCPoint, bigInteger1, bigInteger2, arrayOfByte) : new ECParameterSpec(eCCurve, eCPoint, bigInteger1, bigInteger2, arrayOfByte));
  }
  
  public static ECPoint convertPoint(ECParameterSpec paramECParameterSpec, ECPoint paramECPoint) {
    return convertPoint(convertCurve(paramECParameterSpec.getCurve()), paramECPoint);
  }
  
  public static ECPoint convertPoint(ECCurve paramECCurve, ECPoint paramECPoint) {
    return paramECCurve.createPoint(paramECPoint.getAffineX(), paramECPoint.getAffineY());
  }
  
  public static ECPoint convertPoint(ECPoint paramECPoint) {
    paramECPoint = paramECPoint.normalize();
    return new ECPoint(paramECPoint.getAffineXCoord().toBigInteger(), paramECPoint.getAffineYCoord().toBigInteger());
  }
  
  private static class CustomCurves {
    private static Map CURVE_MAP = createCurveMap();
    
    private static Map createCurveMap() {
      HashMap<Object, Object> hashMap = new HashMap<>();
      Enumeration<String> enumeration = CustomNamedCurves.getNames();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        X9ECParametersHolder x9ECParametersHolder = ECNamedCurveTable.getByNameLazy(str);
        if (x9ECParametersHolder != null) {
          ECCurve eCCurve1 = x9ECParametersHolder.getCurve();
          if (ECAlgorithms.isFpCurve(eCCurve1))
            hashMap.put(eCCurve1, CustomNamedCurves.getByNameLazy(str).getCurve()); 
        } 
      } 
      ECCurve eCCurve = CustomNamedCurves.getByNameLazy("Curve25519").getCurve();
      hashMap.put(new ECCurve.Fp(eCCurve.getField().getCharacteristic(), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), eCCurve.getOrder(), eCCurve.getCofactor(), true), eCCurve);
      return hashMap;
    }
    
    static ECCurve substitute(ECCurve param1ECCurve) {
      ECCurve eCCurve = (ECCurve)CURVE_MAP.get(param1ECCurve);
      return (null != eCCurve) ? eCCurve : param1ECCurve;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetri\\util\EC5Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */