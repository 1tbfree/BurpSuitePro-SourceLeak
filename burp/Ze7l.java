package burp;

import net.portswigger.Zkb;
import net.portswigger.Zsy;

class Ze7l {
  private static final String[] ZE;
  
  private static final String[] Zq;
  
  private static final String[] Zd;
  
  private final Zsy ZH;
  
  private final String ZA;
  
  private final String ZR;
  
  private final String ZY;
  
  private int ZV;
  
  private int Zc;
  
  private int ZK;
  
  Ze7l(String paramString, Zsy paramZsy) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_2
    //   6: putfield ZH : Lnet/portswigger/Zsy;
    //   9: invokestatic ZN : ()[Lburp/Zbqc;
    //   12: aload_1
    //   13: bipush #47
    //   15: invokevirtual lastIndexOf : (I)I
    //   18: aload_1
    //   19: bipush #92
    //   21: invokevirtual lastIndexOf : (I)I
    //   24: invokestatic max : (II)I
    //   27: istore #4
    //   29: astore_3
    //   30: iload #4
    //   32: iflt -> 64
    //   35: aload_0
    //   36: aload_1
    //   37: iconst_0
    //   38: iload #4
    //   40: iconst_1
    //   41: iadd
    //   42: invokevirtual substring : (II)Ljava/lang/String;
    //   45: putfield ZA : Ljava/lang/String;
    //   48: aload_0
    //   49: aload_1
    //   50: iload #4
    //   52: iconst_1
    //   53: iadd
    //   54: invokevirtual substring : (I)Ljava/lang/String;
    //   57: putfield ZR : Ljava/lang/String;
    //   60: aload_3
    //   61: ifnonnull -> 75
    //   64: aload_0
    //   65: ldc ''
    //   67: putfield ZA : Ljava/lang/String;
    //   70: aload_0
    //   71: aload_1
    //   72: putfield ZR : Ljava/lang/String;
    //   75: aload_0
    //   76: aload_1
    //   77: ldc '/'
    //   79: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   82: ifne -> 99
    //   85: aload_1
    //   86: ldc '\'
    //   88: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   91: ifeq -> 99
    //   94: ldc '\'
    //   96: goto -> 101
    //   99: ldc '/'
    //   101: putfield ZY : Ljava/lang/String;
    //   104: return
  }
  
  byte[] ZF() {
    return ZZ(ZE, this.ZV++, null, null);
  }
  
  byte[] ZQ() {
    return ZZ(Zq, this.Zc++, Zz(), null);
  }
  
  byte[] ZP() {
    return ZZ(Zd, this.ZK++, Zz(), Zz());
  }
  
  private byte[] ZZ(String[] paramArrayOfString, int paramInt, String paramString1, String paramString2) {
    return Zkb.Zy(this.ZA + this.ZA);
  }
  
  private String Zz() {
    return this.ZH.Zi().Zq().ZK(3);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '5g.\\n6(c qy\\\b5g.\\n4(c> ry\))!0x#> ry\))!0s\\n6(c qy\> ry\"?4Vflt"> ry\">4V>mx#5g.'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #12
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #127
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc '0|wR,0:X%0|wR,1:Xhbz'*>v-q0hbz,0|wR,0:X'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #9
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #113
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #111
    //   202: goto -> 232
    //   205: bipush #90
    //   207: goto -> 232
    //   210: bipush #60
    //   212: goto -> 232
    //   215: bipush #34
    //   217: goto -> 232
    //   220: bipush #80
    //   222: goto -> 232
    //   225: bipush #120
    //   227: goto -> 232
    //   230: bipush #115
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: iconst_3
    //   289: anewarray java/lang/String
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: bipush #6
    //   297: aaload
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: aload_0
    //   302: iconst_2
    //   303: aaload
    //   304: aastore
    //   305: dup
    //   306: iconst_2
    //   307: aload_0
    //   308: iconst_3
    //   309: aaload
    //   310: aastore
    //   311: putstatic burp/Ze7l.ZE : [Ljava/lang/String;
    //   314: iconst_3
    //   315: anewarray java/lang/String
    //   318: dup
    //   319: iconst_0
    //   320: aload_0
    //   321: iconst_5
    //   322: aaload
    //   323: aastore
    //   324: dup
    //   325: iconst_1
    //   326: aload_0
    //   327: iconst_0
    //   328: aaload
    //   329: aastore
    //   330: dup
    //   331: iconst_2
    //   332: aload_0
    //   333: iconst_1
    //   334: aaload
    //   335: aastore
    //   336: putstatic burp/Ze7l.Zq : [Ljava/lang/String;
    //   339: iconst_2
    //   340: anewarray java/lang/String
    //   343: dup
    //   344: iconst_0
    //   345: aload_0
    //   346: iconst_4
    //   347: aaload
    //   348: aastore
    //   349: dup
    //   350: iconst_1
    //   351: aload_0
    //   352: bipush #7
    //   354: aaload
    //   355: aastore
    //   356: putstatic burp/Ze7l.Zd : [Ljava/lang/String;
    //   359: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */