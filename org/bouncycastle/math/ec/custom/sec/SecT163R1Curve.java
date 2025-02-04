package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat192;

public class SecT163R1Curve extends ECCurve.AbstractF2m {
  private static final int SECT163R1_DEFAULT_COORDS = 6;
  
  private static final ECFieldElement[] SECT163R1_AFFINE_ZS = new ECFieldElement[] { (ECFieldElement)new SecT163FieldElement(ECConstants.ONE) };
  
  protected SecT163R1Point infinity = new SecT163R1Point((ECCurve)this, null, null);
  
  public SecT163R1Curve() {
    super(163, 3, 6, 7);
  }
  
  protected ECCurve cloneCurve() {
    return (ECCurve)new SecT163R1Curve();
  }
  
  public boolean supportsCoordinateSystem(int paramInt) {
    switch (paramInt) {
      case 6:
        return true;
    } 
    return false;
  }
  
  public int getFieldSize() {
    return 163;
  }
  
  public ECFieldElement fromBigInteger(BigInteger paramBigInteger) {
    return (ECFieldElement)new SecT163FieldElement(paramBigInteger);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    return (ECPoint)new SecT163R1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2);
  }
  
  protected ECPoint createRawPoint(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    return (ECPoint)new SecT163R1Point((ECCurve)this, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  public ECPoint getInfinity() {
    return (ECPoint)this.infinity;
  }
  
  public boolean isKoblitz() {
    return false;
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
  
  public ECLookupTable createCacheSafeLookupTable(ECPoint[] paramArrayOfECPoint, int paramInt1, final int len) {
    final long[] table = new long[len * 3 * 2];
    boolean bool = false;
    for (byte b = 0; b < len; b++) {
      ECPoint eCPoint = paramArrayOfECPoint[paramInt1 + b];
      Nat192.copy64(((SecT163FieldElement)eCPoint.getRawXCoord()).x, 0, arrayOfLong, bool);
      bool += true;
      Nat192.copy64(((SecT163FieldElement)eCPoint.getRawYCoord()).x, 0, arrayOfLong, bool);
      bool += true;
    } 
    return (ECLookupTable)new AbstractECLookupTable() {
        public int getSize() {
          return len;
        }
        
        public ECPoint lookup(int param1Int) {
          long[] arrayOfLong1 = Nat192.create64();
          long[] arrayOfLong2 = Nat192.create64();
          byte b1 = 0;
          for (byte b2 = 0; b2 < len; b2++) {
            long l = ((b2 ^ param1Int) - 1 >> 31);
            for (byte b = 0; b < 3; b++) {
              arrayOfLong1[b] = arrayOfLong1[b] ^ table[b1 + b] & l;
              arrayOfLong2[b] = arrayOfLong2[b] ^ table[b1 + 3 + b] & l;
            } 
            b1 += 6;
          } 
          return createPoint(arrayOfLong1, arrayOfLong2);
        }
        
        public ECPoint lookupVar(int param1Int) {
          long[] arrayOfLong1 = Nat192.create64();
          long[] arrayOfLong2 = Nat192.create64();
          int i = param1Int * 3 * 2;
          for (byte b = 0; b < 3; b++) {
            arrayOfLong1[b] = table[i + b];
            arrayOfLong2[b] = table[i + 3 + b];
          } 
          return createPoint(arrayOfLong1, arrayOfLong2);
        }
        
        private ECPoint createPoint(long[] param1ArrayOflong1, long[] param1ArrayOflong2) {
          return SecT163R1Curve.this.createRawPoint((ECFieldElement)new SecT163FieldElement(param1ArrayOflong1), (ECFieldElement)new SecT163FieldElement(param1ArrayOflong2), SecT163R1Curve.SECT163R1_AFFINE_ZS);
        }
      };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\custom\sec\SecT163R1Curve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */