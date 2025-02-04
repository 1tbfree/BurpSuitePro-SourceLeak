package com.fasterxml.Zb;

public enum Zi {
  AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, FLUSH_PASSED_TO_STREAM, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS, ESCAPE_NON_ASCII, WRITE_NUMBERS_AS_STRINGS, WRITE_BIGDECIMAL_AS_PLAIN, STRICT_DUPLICATE_DETECTION, IGNORE_UNKNOWN, USE_FAST_DOUBLE_WRITER, WRITE_HEX_UPPER_CASE, ESCAPE_FORWARD_SLASHES;
  
  private final boolean ZT;
  
  private final int Zf;
  
  private static final Zi[] ZU;
  
  public static int ZN() {
    int i = 0;
    for (Zi zi : values()) {
      if (zi.Zv())
        i |= zi.Zf(); 
    } 
    return i;
  }
  
  Zi(boolean paramBoolean) {
    this.ZT = paramBoolean;
    this.Zf = 1 << ordinal();
  }
  
  public boolean Zv() {
    return this.ZT;
  }
  
  public boolean Zw(int paramInt) {
    return ((paramInt & this.Zf) != 0);
  }
  
  public int Zf() {
    return this.Zf;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'K7lEhhT<}Rdy\\bJ!kTeo^-U+kHhv\\bJ-}DhrF-lRrg\\fJ=yPryV0gAde PL1lEhhW!vUzcP=gNbk\,kK7lEhn\\fA!mPgcF=ySrK7lEhd ^:}C~k\\bU!yShvX7v\\bL*w_tjJ;gTvt\* ^0wRryW5vO`h\\fJ=yPryV,oAebJ2ySc\\bL*w_tjJ;gJdiF=wNccMM,qCcy\\rL.tItg\!|Ecc\\nM7wN'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #24
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #70
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
    //   68: ldc 'V q-\\f<?W\\fp=? F\\fc ))QR{&"*Jx63-Ng'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #22
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #12
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
    //   200: bipush #15
    //   202: goto -> 232
    //   205: bipush #95
    //   207: goto -> 232
    //   210: bipush #56
    //   212: goto -> 232
    //   215: bipush #126
    //   217: goto -> 232
    //   220: bipush #70
    //   222: goto -> 232
    //   225: bipush #113
    //   227: goto -> 232
    //   230: bipush #96
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
    //   288: new com/fasterxml/Zb/Zi
    //   291: dup
    //   292: aload_0
    //   293: bipush #6
    //   295: aaload
    //   296: iconst_0
    //   297: iconst_1
    //   298: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   301: putstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_TARGET : Lcom/fasterxml/Zb/Zi;
    //   304: new com/fasterxml/Zb/Zi
    //   307: dup
    //   308: aload_0
    //   309: bipush #9
    //   311: aaload
    //   312: iconst_1
    //   313: iconst_1
    //   314: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   317: putstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_JSON_CONTENT : Lcom/fasterxml/Zb/Zi;
    //   320: new com/fasterxml/Zb/Zi
    //   323: dup
    //   324: aload_0
    //   325: iconst_1
    //   326: aaload
    //   327: iconst_2
    //   328: iconst_1
    //   329: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   332: putstatic com/fasterxml/Zb/Zi.FLUSH_PASSED_TO_STREAM : Lcom/fasterxml/Zb/Zi;
    //   335: new com/fasterxml/Zb/Zi
    //   338: dup
    //   339: aload_0
    //   340: bipush #12
    //   342: aaload
    //   343: iconst_3
    //   344: iconst_1
    //   345: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   348: putstatic com/fasterxml/Zb/Zi.QUOTE_FIELD_NAMES : Lcom/fasterxml/Zb/Zi;
    //   351: new com/fasterxml/Zb/Zi
    //   354: dup
    //   355: aload_0
    //   356: iconst_3
    //   357: aaload
    //   358: iconst_4
    //   359: iconst_1
    //   360: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   363: putstatic com/fasterxml/Zb/Zi.QUOTE_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zb/Zi;
    //   366: new com/fasterxml/Zb/Zi
    //   369: dup
    //   370: aload_0
    //   371: iconst_2
    //   372: aaload
    //   373: iconst_5
    //   374: iconst_0
    //   375: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   378: putstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   381: new com/fasterxml/Zb/Zi
    //   384: dup
    //   385: aload_0
    //   386: iconst_0
    //   387: aaload
    //   388: bipush #6
    //   390: iconst_0
    //   391: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   394: putstatic com/fasterxml/Zb/Zi.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zb/Zi;
    //   397: new com/fasterxml/Zb/Zi
    //   400: dup
    //   401: aload_0
    //   402: iconst_5
    //   403: aaload
    //   404: bipush #7
    //   406: iconst_0
    //   407: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   410: putstatic com/fasterxml/Zb/Zi.WRITE_BIGDECIMAL_AS_PLAIN : Lcom/fasterxml/Zb/Zi;
    //   413: new com/fasterxml/Zb/Zi
    //   416: dup
    //   417: aload_0
    //   418: bipush #10
    //   420: aaload
    //   421: bipush #8
    //   423: iconst_0
    //   424: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   427: putstatic com/fasterxml/Zb/Zi.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zi;
    //   430: new com/fasterxml/Zb/Zi
    //   433: dup
    //   434: aload_0
    //   435: bipush #7
    //   437: aaload
    //   438: bipush #9
    //   440: iconst_0
    //   441: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   444: putstatic com/fasterxml/Zb/Zi.IGNORE_UNKNOWN : Lcom/fasterxml/Zb/Zi;
    //   447: new com/fasterxml/Zb/Zi
    //   450: dup
    //   451: aload_0
    //   452: bipush #11
    //   454: aaload
    //   455: bipush #10
    //   457: iconst_0
    //   458: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   461: putstatic com/fasterxml/Zb/Zi.USE_FAST_DOUBLE_WRITER : Lcom/fasterxml/Zb/Zi;
    //   464: new com/fasterxml/Zb/Zi
    //   467: dup
    //   468: aload_0
    //   469: iconst_4
    //   470: aaload
    //   471: bipush #11
    //   473: iconst_1
    //   474: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   477: putstatic com/fasterxml/Zb/Zi.WRITE_HEX_UPPER_CASE : Lcom/fasterxml/Zb/Zi;
    //   480: new com/fasterxml/Zb/Zi
    //   483: dup
    //   484: aload_0
    //   485: bipush #8
    //   487: aaload
    //   488: bipush #12
    //   490: iconst_0
    //   491: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   494: putstatic com/fasterxml/Zb/Zi.ESCAPE_FORWARD_SLASHES : Lcom/fasterxml/Zb/Zi;
    //   497: bipush #13
    //   499: anewarray com/fasterxml/Zb/Zi
    //   502: dup
    //   503: iconst_0
    //   504: getstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_TARGET : Lcom/fasterxml/Zb/Zi;
    //   507: aastore
    //   508: dup
    //   509: iconst_1
    //   510: getstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_JSON_CONTENT : Lcom/fasterxml/Zb/Zi;
    //   513: aastore
    //   514: dup
    //   515: iconst_2
    //   516: getstatic com/fasterxml/Zb/Zi.FLUSH_PASSED_TO_STREAM : Lcom/fasterxml/Zb/Zi;
    //   519: aastore
    //   520: dup
    //   521: iconst_3
    //   522: getstatic com/fasterxml/Zb/Zi.QUOTE_FIELD_NAMES : Lcom/fasterxml/Zb/Zi;
    //   525: aastore
    //   526: dup
    //   527: iconst_4
    //   528: getstatic com/fasterxml/Zb/Zi.QUOTE_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zb/Zi;
    //   531: aastore
    //   532: dup
    //   533: iconst_5
    //   534: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   537: aastore
    //   538: dup
    //   539: bipush #6
    //   541: getstatic com/fasterxml/Zb/Zi.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zb/Zi;
    //   544: aastore
    //   545: dup
    //   546: bipush #7
    //   548: getstatic com/fasterxml/Zb/Zi.WRITE_BIGDECIMAL_AS_PLAIN : Lcom/fasterxml/Zb/Zi;
    //   551: aastore
    //   552: dup
    //   553: bipush #8
    //   555: getstatic com/fasterxml/Zb/Zi.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zi;
    //   558: aastore
    //   559: dup
    //   560: bipush #9
    //   562: getstatic com/fasterxml/Zb/Zi.IGNORE_UNKNOWN : Lcom/fasterxml/Zb/Zi;
    //   565: aastore
    //   566: dup
    //   567: bipush #10
    //   569: getstatic com/fasterxml/Zb/Zi.USE_FAST_DOUBLE_WRITER : Lcom/fasterxml/Zb/Zi;
    //   572: aastore
    //   573: dup
    //   574: bipush #11
    //   576: getstatic com/fasterxml/Zb/Zi.WRITE_HEX_UPPER_CASE : Lcom/fasterxml/Zb/Zi;
    //   579: aastore
    //   580: dup
    //   581: bipush #12
    //   583: getstatic com/fasterxml/Zb/Zi.ESCAPE_FORWARD_SLASHES : Lcom/fasterxml/Zb/Zi;
    //   586: aastore
    //   587: putstatic com/fasterxml/Zb/Zi.ZU : [Lcom/fasterxml/Zb/Zi;
    //   590: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */