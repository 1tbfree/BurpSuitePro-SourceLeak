package net.portswigger;

import java.util.Random;

public class Zs6<T extends Random> {
  private static final char[] ZT;
  
  private static final char[] ZU;
  
  private static final char[] ZH;
  
  private static final char[] ZX;
  
  private static final char[] Zq;
  
  private static final char[] Zv;
  
  private static final char[] ZL;
  
  private static final char[] ZJ;
  
  private final T ZQ;
  
  private static int[] Z_;
  
  public Zs6(T paramT) {
    this.ZQ = paramT;
  }
  
  public static long ZP(byte[] paramArrayOfbyte) {
    long l = 0L;
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    int[] arrayOfInt = ZC();
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      l += b1;
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return l;
  }
  
  public Zk5 Zi() {
    return new Zk5(this);
  }
  
  public Zit ZU() {
    return new Zit(this);
  }
  
  public Zne ZP() {
    return new Zne(this);
  }
  
  public Zad ZF() {
    return new Zad(this);
  }
  
  public double Zg() {
    return this.ZQ.nextDouble();
  }
  
  public String Z_(int paramInt) {
    Zk5 zk51 = Zi();
    Zk5 zk52 = Zi();
    return zk51.Zq().ZK(1) + zk51.Zq().ZK(1);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: aconst_null
    //   10: ldc 'GOLVmALFC_fHU]Z@SRTQI7`68=%>k3golvMa:lfcFh=u}z`_s$rtqi43golvMa:lfcFh=u}z`_s$rtqijDAINTcON@E]dVW_\F}Q\\n\V>3golvMa:lfcFh=u}z`_s$rtqijDAINTcON@E]dVW_\F}Q\\n\V9!2g3;0*\\tc7?<&1j<$3golvMa:lfcFh=u}z`_s$rtqi7`68=%>k'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: invokestatic ZZ : ([I)V
    //   22: bipush #36
    //   24: istore_2
    //   25: iconst_m1
    //   26: istore_1
    //   27: bipush #96
    //   29: iinc #1, 1
    //   32: aload_3
    //   33: iload_1
    //   34: dup
    //   35: iload_2
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 134
    //   44: aload_0
    //   45: swap
    //   46: iload #4
    //   48: iinc #4, 1
    //   51: swap
    //   52: aastore
    //   53: iload_1
    //   54: iload_2
    //   55: iadd
    //   56: dup
    //   57: istore_1
    //   58: iload #5
    //   60: if_icmpge -> 72
    //   63: aload_3
    //   64: iload_1
    //   65: invokevirtual charAt : (I)C
    //   68: istore_2
    //   69: goto -> 27
    //   72: ldc 'T \\b*]!Z8C\\n%sy|`Yw"zr'
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: bipush #26
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #39
    //   88: iinc #1, 1
    //   91: aload_3
    //   92: iload_1
    //   93: dup
    //   94: iload_2
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 134
    //   103: aload_0
    //   104: swap
    //   105: iload #4
    //   107: iinc #4, 1
    //   110: swap
    //   111: aastore
    //   112: iload_1
    //   113: iload_2
    //   114: iadd
    //   115: dup
    //   116: istore_1
    //   117: iload #5
    //   119: if_icmpge -> 131
    //   122: aload_3
    //   123: iload_1
    //   124: invokevirtual charAt : (I)C
    //   127: istore_2
    //   128: goto -> 86
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #50
    //   206: goto -> 236
    //   209: bipush #101
    //   211: goto -> 236
    //   214: bipush #108
    //   216: goto -> 236
    //   219: bipush #104
    //   221: goto -> 236
    //   224: bipush #115
    //   226: goto -> 236
    //   229: bipush #75
    //   231: goto -> 236
    //   234: bipush #102
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 44, 0 -> 103
    //   292: aload_0
    //   293: iconst_2
    //   294: aaload
    //   295: invokevirtual toCharArray : ()[C
    //   298: putstatic net/portswigger/Zs6.ZT : [C
    //   301: aload_0
    //   302: iconst_1
    //   303: aaload
    //   304: invokevirtual toCharArray : ()[C
    //   307: putstatic net/portswigger/Zs6.ZU : [C
    //   310: aload_0
    //   311: bipush #6
    //   313: aaload
    //   314: invokevirtual toCharArray : ()[C
    //   317: putstatic net/portswigger/Zs6.ZH : [C
    //   320: aload_0
    //   321: iconst_5
    //   322: aaload
    //   323: invokevirtual toCharArray : ()[C
    //   326: putstatic net/portswigger/Zs6.ZX : [C
    //   329: aload_0
    //   330: iconst_0
    //   331: aaload
    //   332: invokevirtual toCharArray : ()[C
    //   335: putstatic net/portswigger/Zs6.Zq : [C
    //   338: aload_0
    //   339: iconst_3
    //   340: aaload
    //   341: invokevirtual toCharArray : ()[C
    //   344: putstatic net/portswigger/Zs6.Zv : [C
    //   347: aload_0
    //   348: bipush #7
    //   350: aaload
    //   351: invokevirtual toCharArray : ()[C
    //   354: putstatic net/portswigger/Zs6.ZL : [C
    //   357: aload_0
    //   358: iconst_4
    //   359: aaload
    //   360: invokevirtual toCharArray : ()[C
    //   363: putstatic net/portswigger/Zs6.ZJ : [C
    //   366: return
  }
  
  public static void ZZ(int[] paramArrayOfint) {
    Z_ = paramArrayOfint;
  }
  
  public static int[] ZC() {
    return Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zs6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */