package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Vector;

public final class McElieceCCA2Primitives {
  public static GF2Vector encryptionPrimitive(BCMcElieceCCA2PublicKey paramBCMcElieceCCA2PublicKey, GF2Vector paramGF2Vector1, GF2Vector paramGF2Vector2) {
    GF2Matrix gF2Matrix = paramBCMcElieceCCA2PublicKey.getG();
    Vector vector = gF2Matrix.leftMultiplyLeftCompactForm((Vector)paramGF2Vector1);
    return (GF2Vector)vector.add((Vector)paramGF2Vector2);
  }
  
  public static GF2Vector encryptionPrimitive(McElieceCCA2PublicKeyParameters paramMcElieceCCA2PublicKeyParameters, GF2Vector paramGF2Vector1, GF2Vector paramGF2Vector2) {
    GF2Matrix gF2Matrix = paramMcElieceCCA2PublicKeyParameters.getG();
    Vector vector = gF2Matrix.leftMultiplyLeftCompactForm((Vector)paramGF2Vector1);
    return (GF2Vector)vector.add((Vector)paramGF2Vector2);
  }
  
  public static GF2Vector[] decryptionPrimitive(BCMcElieceCCA2PrivateKey paramBCMcElieceCCA2PrivateKey, GF2Vector paramGF2Vector) {
    int i = paramBCMcElieceCCA2PrivateKey.getK();
    Permutation permutation1 = paramBCMcElieceCCA2PrivateKey.getP();
    GF2mField gF2mField = paramBCMcElieceCCA2PrivateKey.getField();
    PolynomialGF2mSmallM polynomialGF2mSmallM = paramBCMcElieceCCA2PrivateKey.getGoppaPoly();
    GF2Matrix gF2Matrix = paramBCMcElieceCCA2PrivateKey.getH();
    PolynomialGF2mSmallM[] arrayOfPolynomialGF2mSmallM = paramBCMcElieceCCA2PrivateKey.getQInv();
    Permutation permutation2 = permutation1.computeInverse();
    GF2Vector gF2Vector1 = (GF2Vector)paramGF2Vector.multiply(permutation2);
    GF2Vector gF2Vector2 = (GF2Vector)gF2Matrix.rightMultiply((Vector)gF2Vector1);
    GF2Vector gF2Vector3 = GoppaCode.syndromeDecode(gF2Vector2, gF2mField, polynomialGF2mSmallM, arrayOfPolynomialGF2mSmallM);
    GF2Vector gF2Vector4 = (GF2Vector)gF2Vector1.add((Vector)gF2Vector3);
    gF2Vector4 = (GF2Vector)gF2Vector4.multiply(permutation1);
    gF2Vector3 = (GF2Vector)gF2Vector3.multiply(permutation1);
    GF2Vector gF2Vector5 = gF2Vector4.extractRightVector(i);
    return new GF2Vector[] { gF2Vector5, gF2Vector3 };
  }
  
  public static GF2Vector[] decryptionPrimitive(McElieceCCA2PrivateKeyParameters paramMcElieceCCA2PrivateKeyParameters, GF2Vector paramGF2Vector) {
    int i = paramMcElieceCCA2PrivateKeyParameters.getK();
    Permutation permutation1 = paramMcElieceCCA2PrivateKeyParameters.getP();
    GF2mField gF2mField = paramMcElieceCCA2PrivateKeyParameters.getField();
    PolynomialGF2mSmallM polynomialGF2mSmallM = paramMcElieceCCA2PrivateKeyParameters.getGoppaPoly();
    GF2Matrix gF2Matrix = paramMcElieceCCA2PrivateKeyParameters.getH();
    PolynomialGF2mSmallM[] arrayOfPolynomialGF2mSmallM = paramMcElieceCCA2PrivateKeyParameters.getQInv();
    Permutation permutation2 = permutation1.computeInverse();
    GF2Vector gF2Vector1 = (GF2Vector)paramGF2Vector.multiply(permutation2);
    GF2Vector gF2Vector2 = (GF2Vector)gF2Matrix.rightMultiply((Vector)gF2Vector1);
    GF2Vector gF2Vector3 = GoppaCode.syndromeDecode(gF2Vector2, gF2mField, polynomialGF2mSmallM, arrayOfPolynomialGF2mSmallM);
    GF2Vector gF2Vector4 = (GF2Vector)gF2Vector1.add((Vector)gF2Vector3);
    gF2Vector4 = (GF2Vector)gF2Vector4.multiply(permutation1);
    gF2Vector3 = (GF2Vector)gF2Vector3.multiply(permutation1);
    GF2Vector gF2Vector5 = gF2Vector4.extractRightVector(i);
    return new GF2Vector[] { gF2Vector5, gF2Vector3 };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\mceliece\McElieceCCA2Primitives.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */