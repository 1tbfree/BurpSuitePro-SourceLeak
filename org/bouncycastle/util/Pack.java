package org.bouncycastle.util;

public abstract class Pack {
  public static short bigEndianToShort(byte[] paramArrayOfbyte, int paramInt) {
    int i = (paramArrayOfbyte[paramInt] & 0xFF) << 8;
    i |= paramArrayOfbyte[++paramInt] & 0xFF;
    return (short)i;
  }
  
  public static int bigEndianToInt(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] << 24;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 16;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= paramArrayOfbyte[++paramInt] & 0xFF;
    return i;
  }
  
  public static void bigEndianToInt(byte[] paramArrayOfbyte, int paramInt, int[] paramArrayOfint) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      paramArrayOfint[b] = bigEndianToInt(paramArrayOfbyte, paramInt);
      paramInt += 4;
    } 
  }
  
  public static void bigEndianToInt(byte[] paramArrayOfbyte, int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++) {
      paramArrayOfint[paramInt2 + b] = bigEndianToInt(paramArrayOfbyte, paramInt1);
      paramInt1 += 4;
    } 
  }
  
  public static byte[] intToBigEndian(int paramInt) {
    byte[] arrayOfByte = new byte[4];
    intToBigEndian(paramInt, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void intToBigEndian(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)(paramInt1 >>> 24);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 16);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 8);
    paramArrayOfbyte[++paramInt2] = (byte)paramInt1;
  }
  
  public static byte[] intToBigEndian(int[] paramArrayOfint) {
    byte[] arrayOfByte = new byte[4 * paramArrayOfint.length];
    intToBigEndian(paramArrayOfint, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void intToBigEndian(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      intToBigEndian(paramArrayOfint[b], paramArrayOfbyte, paramInt);
      paramInt += 4;
    } 
  }
  
  public static void intToBigEndian(int[] paramArrayOfint, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++) {
      intToBigEndian(paramArrayOfint[paramInt1 + b], paramArrayOfbyte, paramInt3);
      paramInt3 += 4;
    } 
  }
  
  public static long bigEndianToLong(byte[] paramArrayOfbyte, int paramInt) {
    int i = bigEndianToInt(paramArrayOfbyte, paramInt);
    int j = bigEndianToInt(paramArrayOfbyte, paramInt + 4);
    return (i & 0xFFFFFFFFL) << 32L | j & 0xFFFFFFFFL;
  }
  
  public static void bigEndianToLong(byte[] paramArrayOfbyte, int paramInt, long[] paramArrayOflong) {
    for (byte b = 0; b < paramArrayOflong.length; b++) {
      paramArrayOflong[b] = bigEndianToLong(paramArrayOfbyte, paramInt);
      paramInt += 8;
    } 
  }
  
  public static void bigEndianToLong(byte[] paramArrayOfbyte, int paramInt1, long[] paramArrayOflong, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++) {
      paramArrayOflong[paramInt2 + b] = bigEndianToLong(paramArrayOfbyte, paramInt1);
      paramInt1 += 8;
    } 
  }
  
  public static byte[] longToBigEndian(long paramLong) {
    byte[] arrayOfByte = new byte[8];
    longToBigEndian(paramLong, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void longToBigEndian(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    intToBigEndian((int)(paramLong >>> 32L), paramArrayOfbyte, paramInt);
    intToBigEndian((int)(paramLong & 0xFFFFFFFFL), paramArrayOfbyte, paramInt + 4);
  }
  
  public static byte[] longToBigEndian(long[] paramArrayOflong) {
    byte[] arrayOfByte = new byte[8 * paramArrayOflong.length];
    longToBigEndian(paramArrayOflong, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void longToBigEndian(long[] paramArrayOflong, byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < paramArrayOflong.length; b++) {
      longToBigEndian(paramArrayOflong[b], paramArrayOfbyte, paramInt);
      paramInt += 8;
    } 
  }
  
  public static void longToBigEndian(long[] paramArrayOflong, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++) {
      longToBigEndian(paramArrayOflong[paramInt1 + b], paramArrayOfbyte, paramInt3);
      paramInt3 += 8;
    } 
  }
  
  public static void longToBigEndian(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (int i = paramInt2 - 1; i >= 0; i--) {
      paramArrayOfbyte[i + paramInt1] = (byte)(int)(paramLong & 0xFFL);
      paramLong >>>= 8L;
    } 
  }
  
  public static short littleEndianToShort(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] & 0xFF;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    return (short)i;
  }
  
  public static int littleEndianToInt(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] & 0xFF;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 16;
    i |= paramArrayOfbyte[++paramInt] << 24;
    return i;
  }
  
  public static int littleEndianToInt_High(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return littleEndianToInt_Low(paramArrayOfbyte, paramInt1, paramInt2) << 4 - paramInt2 << 3;
  }
  
  public static int littleEndianToInt_Low(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramArrayOfbyte[paramInt1] & 0xFF;
    byte b1 = 0;
    for (byte b2 = 1; b2 < paramInt2; b2++) {
      b1 += true;
      i |= (paramArrayOfbyte[paramInt1 + b2] & 0xFF) << b1;
    } 
    return i;
  }
  
  public static void littleEndianToInt(byte[] paramArrayOfbyte, int paramInt, int[] paramArrayOfint) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      paramArrayOfint[b] = littleEndianToInt(paramArrayOfbyte, paramInt);
      paramInt += 4;
    } 
  }
  
  public static void littleEndianToInt(byte[] paramArrayOfbyte, int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++) {
      paramArrayOfint[paramInt2 + b] = littleEndianToInt(paramArrayOfbyte, paramInt1);
      paramInt1 += 4;
    } 
  }
  
  public static int[] littleEndianToInt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt2];
    for (byte b = 0; b < arrayOfInt.length; b++) {
      arrayOfInt[b] = littleEndianToInt(paramArrayOfbyte, paramInt1);
      paramInt1 += 4;
    } 
    return arrayOfInt;
  }
  
  public static byte[] shortToLittleEndian(short paramShort) {
    byte[] arrayOfByte = new byte[2];
    shortToLittleEndian(paramShort, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void shortToLittleEndian(short paramShort, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)paramShort;
    paramArrayOfbyte[++paramInt] = (byte)(paramShort >>> 8);
  }
  
  public static byte[] shortToBigEndian(short paramShort) {
    byte[] arrayOfByte = new byte[2];
    shortToBigEndian(paramShort, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void shortToBigEndian(short paramShort, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)(paramShort >>> 8);
    paramArrayOfbyte[++paramInt] = (byte)paramShort;
  }
  
  public static byte[] intToLittleEndian(int paramInt) {
    byte[] arrayOfByte = new byte[4];
    intToLittleEndian(paramInt, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void intToLittleEndian(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)paramInt1;
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 8);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 16);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >>> 24);
  }
  
  public static byte[] intToLittleEndian(int[] paramArrayOfint) {
    byte[] arrayOfByte = new byte[4 * paramArrayOfint.length];
    intToLittleEndian(paramArrayOfint, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void intToLittleEndian(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      intToLittleEndian(paramArrayOfint[b], paramArrayOfbyte, paramInt);
      paramInt += 4;
    } 
  }
  
  public static void intToLittleEndian(int[] paramArrayOfint, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++) {
      intToLittleEndian(paramArrayOfint[paramInt1 + b], paramArrayOfbyte, paramInt3);
      paramInt3 += 4;
    } 
  }
  
  public static long littleEndianToLong(byte[] paramArrayOfbyte, int paramInt) {
    int i = littleEndianToInt(paramArrayOfbyte, paramInt);
    int j = littleEndianToInt(paramArrayOfbyte, paramInt + 4);
    return (j & 0xFFFFFFFFL) << 32L | i & 0xFFFFFFFFL;
  }
  
  public static void littleEndianToLong(byte[] paramArrayOfbyte, int paramInt, long[] paramArrayOflong) {
    for (byte b = 0; b < paramArrayOflong.length; b++) {
      paramArrayOflong[b] = littleEndianToLong(paramArrayOfbyte, paramInt);
      paramInt += 8;
    } 
  }
  
  public static void littleEndianToLong(byte[] paramArrayOfbyte, int paramInt1, long[] paramArrayOflong, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++) {
      paramArrayOflong[paramInt2 + b] = littleEndianToLong(paramArrayOfbyte, paramInt1);
      paramInt1 += 8;
    } 
  }
  
  public static void longToLittleEndian_High(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b1 = 56;
    paramArrayOfbyte[paramInt1] = (byte)(int)(paramLong >>> b1);
    for (byte b2 = 1; b2 < paramInt2; b2++) {
      b1 -= 8;
      paramArrayOfbyte[paramInt1 + b2] = (byte)(int)(paramLong >>> b1);
    } 
  }
  
  public static long littleEndianToLong_High(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return littleEndianToLong_Low(paramArrayOfbyte, paramInt1, paramInt2) << 8 - paramInt2 << 3;
  }
  
  public static long littleEndianToLong_Low(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = (paramArrayOfbyte[paramInt1] & 0xFF);
    for (byte b = 1; b < paramInt2; b++) {
      l <<= 8L;
      l |= (paramArrayOfbyte[paramInt1 + b] & 0xFF);
    } 
    return l;
  }
  
  public static byte[] longToLittleEndian(long paramLong) {
    byte[] arrayOfByte = new byte[8];
    longToLittleEndian(paramLong, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void longToLittleEndian(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    intToLittleEndian((int)(paramLong & 0xFFFFFFFFL), paramArrayOfbyte, paramInt);
    intToLittleEndian((int)(paramLong >>> 32L), paramArrayOfbyte, paramInt + 4);
  }
  
  public static byte[] longToLittleEndian(long[] paramArrayOflong) {
    byte[] arrayOfByte = new byte[8 * paramArrayOflong.length];
    longToLittleEndian(paramArrayOflong, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void longToLittleEndian(long[] paramArrayOflong, byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < paramArrayOflong.length; b++) {
      longToLittleEndian(paramArrayOflong[b], paramArrayOfbyte, paramInt);
      paramInt += 8;
    } 
  }
  
  public static void longToLittleEndian(long[] paramArrayOflong, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++) {
      longToLittleEndian(paramArrayOflong[paramInt1 + b], paramArrayOfbyte, paramInt3);
      paramInt3 += 8;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\Pack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */