package com.fasterxml.Zg;

public enum Zfr {
  ARRAY, BINARY, BOOLEAN, MISSING, NULL, NUMBER, OBJECT, POJO, STRING;
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'K2X;\\n"/G)Y)I9A- 8U/Y!\\r+V4A'D4D$-&D2E)5'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #7
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #45
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
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
    //   68: ldc 'uuq]e'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_4
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #118
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
    //   200: bipush #43
    //   202: goto -> 232
    //   205: bipush #86
    //   207: goto -> 232
    //   210: bipush #38
    //   212: goto -> 232
    //   215: bipush #69
    //   217: goto -> 232
    //   220: bipush #110
    //   222: goto -> 232
    //   225: bipush #65
    //   227: goto -> 232
    //   230: bipush #69
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
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: new com/fasterxml/Zg/Zfr
    //   291: dup
    //   292: aload_0
    //   293: iconst_1
    //   294: aaload
    //   295: iconst_0
    //   296: invokespecial <init> : (Ljava/lang/String;I)V
    //   299: putstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   302: new com/fasterxml/Zg/Zfr
    //   305: dup
    //   306: aload_0
    //   307: bipush #6
    //   309: aaload
    //   310: iconst_1
    //   311: invokespecial <init> : (Ljava/lang/String;I)V
    //   314: putstatic com/fasterxml/Zg/Zfr.BINARY : Lcom/fasterxml/Zg/Zfr;
    //   317: new com/fasterxml/Zg/Zfr
    //   320: dup
    //   321: aload_0
    //   322: iconst_5
    //   323: aaload
    //   324: iconst_2
    //   325: invokespecial <init> : (Ljava/lang/String;I)V
    //   328: putstatic com/fasterxml/Zg/Zfr.BOOLEAN : Lcom/fasterxml/Zg/Zfr;
    //   331: new com/fasterxml/Zg/Zfr
    //   334: dup
    //   335: aload_0
    //   336: iconst_0
    //   337: aaload
    //   338: iconst_3
    //   339: invokespecial <init> : (Ljava/lang/String;I)V
    //   342: putstatic com/fasterxml/Zg/Zfr.MISSING : Lcom/fasterxml/Zg/Zfr;
    //   345: new com/fasterxml/Zg/Zfr
    //   348: dup
    //   349: aload_0
    //   350: bipush #7
    //   352: aaload
    //   353: iconst_4
    //   354: invokespecial <init> : (Ljava/lang/String;I)V
    //   357: putstatic com/fasterxml/Zg/Zfr.NULL : Lcom/fasterxml/Zg/Zfr;
    //   360: new com/fasterxml/Zg/Zfr
    //   363: dup
    //   364: aload_0
    //   365: bipush #8
    //   367: aaload
    //   368: iconst_5
    //   369: invokespecial <init> : (Ljava/lang/String;I)V
    //   372: putstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   375: new com/fasterxml/Zg/Zfr
    //   378: dup
    //   379: aload_0
    //   380: iconst_2
    //   381: aaload
    //   382: bipush #6
    //   384: invokespecial <init> : (Ljava/lang/String;I)V
    //   387: putstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   390: new com/fasterxml/Zg/Zfr
    //   393: dup
    //   394: aload_0
    //   395: iconst_4
    //   396: aaload
    //   397: bipush #7
    //   399: invokespecial <init> : (Ljava/lang/String;I)V
    //   402: putstatic com/fasterxml/Zg/Zfr.POJO : Lcom/fasterxml/Zg/Zfr;
    //   405: new com/fasterxml/Zg/Zfr
    //   408: dup
    //   409: aload_0
    //   410: iconst_3
    //   411: aaload
    //   412: bipush #8
    //   414: invokespecial <init> : (Ljava/lang/String;I)V
    //   417: putstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   420: bipush #9
    //   422: anewarray com/fasterxml/Zg/Zfr
    //   425: dup
    //   426: iconst_0
    //   427: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   430: aastore
    //   431: dup
    //   432: iconst_1
    //   433: getstatic com/fasterxml/Zg/Zfr.BINARY : Lcom/fasterxml/Zg/Zfr;
    //   436: aastore
    //   437: dup
    //   438: iconst_2
    //   439: getstatic com/fasterxml/Zg/Zfr.BOOLEAN : Lcom/fasterxml/Zg/Zfr;
    //   442: aastore
    //   443: dup
    //   444: iconst_3
    //   445: getstatic com/fasterxml/Zg/Zfr.MISSING : Lcom/fasterxml/Zg/Zfr;
    //   448: aastore
    //   449: dup
    //   450: iconst_4
    //   451: getstatic com/fasterxml/Zg/Zfr.NULL : Lcom/fasterxml/Zg/Zfr;
    //   454: aastore
    //   455: dup
    //   456: iconst_5
    //   457: getstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   460: aastore
    //   461: dup
    //   462: bipush #6
    //   464: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   467: aastore
    //   468: dup
    //   469: bipush #7
    //   471: getstatic com/fasterxml/Zg/Zfr.POJO : Lcom/fasterxml/Zg/Zfr;
    //   474: aastore
    //   475: dup
    //   476: bipush #8
    //   478: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   481: aastore
    //   482: putstatic com/fasterxml/Zg/Zfr.ZR : [Lcom/fasterxml/Zg/Zfr;
    //   485: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zfr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */