package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Pack;

public class SecP224K1Field {
  static final int[] P = new int[] { -6803, -2, -1, -1, -1, -1, -1 };
  
  private static final int[] PExt = new int[] { 
      46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, 
      -1, -1, -1, -1 };
  
  private static final int[] PExtInv = new int[] { -46280809, -13607, -2, -1, -1, -1, -1, 13605, 2 };
  
  private static final int P6 = -1;
  
  private static final int PExt13 = -1;
  
  private static final int PInv33 = 6803;
  
  public static void add(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = Nat224.add(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3);
    if (i != 0 || (paramArrayOfint3[6] == -1 && Nat224.gte(paramArrayOfint3, P)))
      Nat.add33To(7, 6803, paramArrayOfint3); 
  }
  
  public static void addExt(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = Nat.add(14, paramArrayOfint1, paramArrayOfint2, paramArrayOfint3);
    if ((i != 0 || (paramArrayOfint3[13] == -1 && Nat.gte(14, paramArrayOfint3, PExt))) && Nat.addTo(PExtInv.length, PExtInv, paramArrayOfint3) != 0)
      Nat.incAt(14, paramArrayOfint3, PExtInv.length); 
  }
  
  public static void addOne(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = Nat.inc(7, paramArrayOfint1, paramArrayOfint2);
    if (i != 0 || (paramArrayOfint2[6] == -1 && Nat224.gte(paramArrayOfint2, P)))
      Nat.add33To(7, 6803, paramArrayOfint2); 
  }
  
  public static int[] fromBigInteger(BigInteger paramBigInteger) {
    int[] arrayOfInt = Nat224.fromBigInteger(paramBigInteger);
    if (arrayOfInt[6] == -1 && Nat224.gte(arrayOfInt, P))
      Nat.add33To(7, 6803, arrayOfInt); 
    return arrayOfInt;
  }
  
  public static void half(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if ((paramArrayOfint1[0] & 0x1) == 0) {
      Nat.shiftDownBit(7, paramArrayOfint1, 0, paramArrayOfint2);
    } else {
      int i = Nat224.add(paramArrayOfint1, P, paramArrayOfint2);
      Nat.shiftDownBit(7, paramArrayOfint2, i);
    } 
  }
  
  public static void inv(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    Mod.checkedModOddInverse(P, paramArrayOfint1, paramArrayOfint2);
  }
  
  public static int isZero(int[] paramArrayOfint) {
    int i = 0;
    for (byte b = 0; b < 7; b++)
      i |= paramArrayOfint[b]; 
    i = i >>> 1 | i & 0x1;
    return i - 1 >> 31;
  }
  
  public static void multiply(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt = Nat224.createExt();
    Nat224.mul(paramArrayOfint1, paramArrayOfint2, arrayOfInt);
    reduce(arrayOfInt, paramArrayOfint3);
  }
  
  public static void multiplyAddToExt(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = Nat224.mulAddTo(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3);
    if ((i != 0 || (paramArrayOfint3[13] == -1 && Nat.gte(14, paramArrayOfint3, PExt))) && Nat.addTo(PExtInv.length, PExtInv, paramArrayOfint3) != 0)
      Nat.incAt(14, paramArrayOfint3, PExtInv.length); 
  }
  
  public static void negate(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (0 != isZero(paramArrayOfint1)) {
      Nat224.sub(P, P, paramArrayOfint2);
    } else {
      Nat224.sub(P, paramArrayOfint1, paramArrayOfint2);
    } 
  }
  
  public static void random(SecureRandom paramSecureRandom, int[] paramArrayOfint) {
    byte[] arrayOfByte = new byte[28];
    do {
      paramSecureRandom.nextBytes(arrayOfByte);
      Pack.littleEndianToInt(arrayOfByte, 0, paramArrayOfint, 0, 7);
    } while (0 == Nat.lessThan(7, paramArrayOfint, P));
  }
  
  public static void randomMult(SecureRandom paramSecureRandom, int[] paramArrayOfint) {
    do {
      random(paramSecureRandom, paramArrayOfint);
    } while (0 != isZero(paramArrayOfint));
  }
  
  public static void reduce(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    long l = Nat224.mul33Add(6803, paramArrayOfint1, 7, paramArrayOfint1, 0, paramArrayOfint2, 0);
    int i = Nat224.mul33DWordAdd(6803, l, paramArrayOfint2, 0);
    if (i != 0 || (paramArrayOfint2[6] == -1 && Nat224.gte(paramArrayOfint2, P)))
      Nat.add33To(7, 6803, paramArrayOfint2); 
  }
  
  public static void reduce32(int paramInt, int[] paramArrayOfint) {
    if ((paramInt != 0 && Nat224.mul33WordAdd(6803, paramInt, paramArrayOfint, 0) != 0) || (paramArrayOfint[6] == -1 && Nat224.gte(paramArrayOfint, P)))
      Nat.add33To(7, 6803, paramArrayOfint); 
  }
  
  public static void square(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int[] arrayOfInt = Nat224.createExt();
    Nat224.square(paramArrayOfint1, arrayOfInt);
    reduce(arrayOfInt, paramArrayOfint2);
  }
  
  public static void squareN(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    int[] arrayOfInt = Nat224.createExt();
    Nat224.square(paramArrayOfint1, arrayOfInt);
    reduce(arrayOfInt, paramArrayOfint2);
    while (--paramInt > 0) {
      Nat224.square(paramArrayOfint2, arrayOfInt);
      reduce(arrayOfInt, paramArrayOfint2);
    } 
  }
  
  public static void subtract(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = Nat224.sub(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3);
    if (i != 0)
      Nat.sub33From(7, 6803, paramArrayOfint3); 
  }
  
  public static void subtractExt(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int i = Nat.sub(14, paramArrayOfint1, paramArrayOfint2, paramArrayOfint3);
    if (i != 0 && Nat.subFrom(PExtInv.length, PExtInv, paramArrayOfint3) != 0)
      Nat.decAt(14, paramArrayOfint3, PExtInv.length); 
  }
  
  public static void twice(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = Nat.shiftUpBit(7, paramArrayOfint1, 0, paramArrayOfint2);
    if (i != 0 || (paramArrayOfint2[6] == -1 && Nat224.gte(paramArrayOfint2, P)))
      Nat.add33To(7, 6803, paramArrayOfint2); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\custom\sec\SecP224K1Field.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */