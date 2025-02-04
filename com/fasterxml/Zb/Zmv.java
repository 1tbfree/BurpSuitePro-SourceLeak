package com.fasterxml.Zb;

import com.fasterxml.Zc.Zm;

public enum Zmv implements Zm {
  AUTO_CLOSE_SOURCE, STRICT_DUPLICATE_DETECTION, IGNORE_UNDEFINED, INCLUDE_SOURCE_IN_LOCATION, USE_FAST_DOUBLE_PARSER, USE_FAST_BIG_NUMBER_PARSER;
  
  private final boolean ZO;
  
  private final int Ze;
  
  private final Zm Zh;
  
  private static final Zmv[] Zx;
  
  Zmv(Zm paramZm) {
    this.Zh = paramZm;
    this.Ze = paramZm.Zi();
    this.ZO = paramZm.ZA();
  }
  
  public boolean ZP() {
    return this.ZO;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.Ze) != 0);
  }
  
  public int ZV() {
    return this.Ze;
  }
  
  public Zm ZN() {
    return this.Zh;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '\\n4 ^36C3: ]": \\f%0\\rA \\n4 X4\\n4 ^50A\\n!> H?0 R5:C\\n'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #26
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: iconst_5
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 23
    //   67: ldc ')<X+9F$1B2:\\f89\\rB 4 \\nB5*D2:'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #26
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #15
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #74
    //   202: goto -> 232
    //   205: bipush #92
    //   207: goto -> 232
    //   210: bipush #116
    //   212: goto -> 232
    //   215: bipush #122
    //   217: goto -> 232
    //   220: bipush #87
    //   222: goto -> 232
    //   225: bipush #84
    //   227: goto -> 232
    //   230: bipush #8
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: new com/fasterxml/Zb/Zmv
    //   291: dup
    //   292: aload_0
    //   293: iconst_1
    //   294: aaload
    //   295: iconst_0
    //   296: getstatic com/fasterxml/Zb/Zm.AUTO_CLOSE_SOURCE : Lcom/fasterxml/Zb/Zm;
    //   299: invokespecial <init> : (Ljava/lang/String;ILcom/fasterxml/Zb/Zm;)V
    //   302: putstatic com/fasterxml/Zb/Zmv.AUTO_CLOSE_SOURCE : Lcom/fasterxml/Zb/Zmv;
    //   305: new com/fasterxml/Zb/Zmv
    //   308: dup
    //   309: aload_0
    //   310: iconst_4
    //   311: aaload
    //   312: iconst_1
    //   313: getstatic com/fasterxml/Zb/Zm.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zm;
    //   316: invokespecial <init> : (Ljava/lang/String;ILcom/fasterxml/Zb/Zm;)V
    //   319: putstatic com/fasterxml/Zb/Zmv.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zmv;
    //   322: new com/fasterxml/Zb/Zmv
    //   325: dup
    //   326: aload_0
    //   327: iconst_3
    //   328: aaload
    //   329: iconst_2
    //   330: getstatic com/fasterxml/Zb/Zm.IGNORE_UNDEFINED : Lcom/fasterxml/Zb/Zm;
    //   333: invokespecial <init> : (Ljava/lang/String;ILcom/fasterxml/Zb/Zm;)V
    //   336: putstatic com/fasterxml/Zb/Zmv.IGNORE_UNDEFINED : Lcom/fasterxml/Zb/Zmv;
    //   339: new com/fasterxml/Zb/Zmv
    //   342: dup
    //   343: aload_0
    //   344: iconst_5
    //   345: aaload
    //   346: iconst_3
    //   347: getstatic com/fasterxml/Zb/Zm.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zm;
    //   350: invokespecial <init> : (Ljava/lang/String;ILcom/fasterxml/Zb/Zm;)V
    //   353: putstatic com/fasterxml/Zb/Zmv.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zmv;
    //   356: new com/fasterxml/Zb/Zmv
    //   359: dup
    //   360: aload_0
    //   361: iconst_2
    //   362: aaload
    //   363: iconst_4
    //   364: getstatic com/fasterxml/Zb/Zm.USE_FAST_DOUBLE_PARSER : Lcom/fasterxml/Zb/Zm;
    //   367: invokespecial <init> : (Ljava/lang/String;ILcom/fasterxml/Zb/Zm;)V
    //   370: putstatic com/fasterxml/Zb/Zmv.USE_FAST_DOUBLE_PARSER : Lcom/fasterxml/Zb/Zmv;
    //   373: new com/fasterxml/Zb/Zmv
    //   376: dup
    //   377: aload_0
    //   378: iconst_0
    //   379: aaload
    //   380: iconst_5
    //   381: getstatic com/fasterxml/Zb/Zm.USE_FAST_BIG_NUMBER_PARSER : Lcom/fasterxml/Zb/Zm;
    //   384: invokespecial <init> : (Ljava/lang/String;ILcom/fasterxml/Zb/Zm;)V
    //   387: putstatic com/fasterxml/Zb/Zmv.USE_FAST_BIG_NUMBER_PARSER : Lcom/fasterxml/Zb/Zmv;
    //   390: bipush #6
    //   392: anewarray com/fasterxml/Zb/Zmv
    //   395: dup
    //   396: iconst_0
    //   397: getstatic com/fasterxml/Zb/Zmv.AUTO_CLOSE_SOURCE : Lcom/fasterxml/Zb/Zmv;
    //   400: aastore
    //   401: dup
    //   402: iconst_1
    //   403: getstatic com/fasterxml/Zb/Zmv.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zmv;
    //   406: aastore
    //   407: dup
    //   408: iconst_2
    //   409: getstatic com/fasterxml/Zb/Zmv.IGNORE_UNDEFINED : Lcom/fasterxml/Zb/Zmv;
    //   412: aastore
    //   413: dup
    //   414: iconst_3
    //   415: getstatic com/fasterxml/Zb/Zmv.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zmv;
    //   418: aastore
    //   419: dup
    //   420: iconst_4
    //   421: getstatic com/fasterxml/Zb/Zmv.USE_FAST_DOUBLE_PARSER : Lcom/fasterxml/Zb/Zmv;
    //   424: aastore
    //   425: dup
    //   426: iconst_5
    //   427: getstatic com/fasterxml/Zb/Zmv.USE_FAST_BIG_NUMBER_PARSER : Lcom/fasterxml/Zb/Zmv;
    //   430: aastore
    //   431: putstatic com/fasterxml/Zb/Zmv.Zx : [Lcom/fasterxml/Zb/Zmv;
    //   434: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zmv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */