package com.fasterxml;

public enum Zqg {
  ALWAYS, NON_NULL, NON_ABSENT, NON_EMPTY, NON_DEFAULT, CUSTOM, USE_DEFAULTS;
  
  private static final Zqg[] Zs;
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'z\\tR9nY.lY2\\na\\tR<j\\ba\\tR3ca\\tR9nY'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #12
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #93
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
    //   68: ldc 'h [1\\tr\\ngE-'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #9
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #84
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
    //   200: bipush #114
    //   202: goto -> 232
    //   205: bipush #7
    //   207: goto -> 232
    //   210: bipush #26
    //   212: goto -> 232
    //   215: bipush #80
    //   217: goto -> 232
    //   220: bipush #32
    //   222: goto -> 232
    //   225: bipush #12
    //   227: goto -> 232
    //   230: bipush #13
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
    //   288: new com/fasterxml/Zqg
    //   291: dup
    //   292: aload_0
    //   293: bipush #6
    //   295: aaload
    //   296: iconst_0
    //   297: invokespecial <init> : (Ljava/lang/String;I)V
    //   300: putstatic com/fasterxml/Zqg.ALWAYS : Lcom/fasterxml/Zqg;
    //   303: new com/fasterxml/Zqg
    //   306: dup
    //   307: aload_0
    //   308: iconst_3
    //   309: aaload
    //   310: iconst_1
    //   311: invokespecial <init> : (Ljava/lang/String;I)V
    //   314: putstatic com/fasterxml/Zqg.NON_NULL : Lcom/fasterxml/Zqg;
    //   317: new com/fasterxml/Zqg
    //   320: dup
    //   321: aload_0
    //   322: iconst_2
    //   323: aaload
    //   324: iconst_2
    //   325: invokespecial <init> : (Ljava/lang/String;I)V
    //   328: putstatic com/fasterxml/Zqg.NON_ABSENT : Lcom/fasterxml/Zqg;
    //   331: new com/fasterxml/Zqg
    //   334: dup
    //   335: aload_0
    //   336: iconst_5
    //   337: aaload
    //   338: iconst_3
    //   339: invokespecial <init> : (Ljava/lang/String;I)V
    //   342: putstatic com/fasterxml/Zqg.NON_EMPTY : Lcom/fasterxml/Zqg;
    //   345: new com/fasterxml/Zqg
    //   348: dup
    //   349: aload_0
    //   350: iconst_4
    //   351: aaload
    //   352: iconst_4
    //   353: invokespecial <init> : (Ljava/lang/String;I)V
    //   356: putstatic com/fasterxml/Zqg.NON_DEFAULT : Lcom/fasterxml/Zqg;
    //   359: new com/fasterxml/Zqg
    //   362: dup
    //   363: aload_0
    //   364: iconst_1
    //   365: aaload
    //   366: iconst_5
    //   367: invokespecial <init> : (Ljava/lang/String;I)V
    //   370: putstatic com/fasterxml/Zqg.CUSTOM : Lcom/fasterxml/Zqg;
    //   373: new com/fasterxml/Zqg
    //   376: dup
    //   377: aload_0
    //   378: iconst_0
    //   379: aaload
    //   380: bipush #6
    //   382: invokespecial <init> : (Ljava/lang/String;I)V
    //   385: putstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   388: bipush #7
    //   390: anewarray com/fasterxml/Zqg
    //   393: dup
    //   394: iconst_0
    //   395: getstatic com/fasterxml/Zqg.ALWAYS : Lcom/fasterxml/Zqg;
    //   398: aastore
    //   399: dup
    //   400: iconst_1
    //   401: getstatic com/fasterxml/Zqg.NON_NULL : Lcom/fasterxml/Zqg;
    //   404: aastore
    //   405: dup
    //   406: iconst_2
    //   407: getstatic com/fasterxml/Zqg.NON_ABSENT : Lcom/fasterxml/Zqg;
    //   410: aastore
    //   411: dup
    //   412: iconst_3
    //   413: getstatic com/fasterxml/Zqg.NON_EMPTY : Lcom/fasterxml/Zqg;
    //   416: aastore
    //   417: dup
    //   418: iconst_4
    //   419: getstatic com/fasterxml/Zqg.NON_DEFAULT : Lcom/fasterxml/Zqg;
    //   422: aastore
    //   423: dup
    //   424: iconst_5
    //   425: getstatic com/fasterxml/Zqg.CUSTOM : Lcom/fasterxml/Zqg;
    //   428: aastore
    //   429: dup
    //   430: bipush #6
    //   432: getstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   435: aastore
    //   436: putstatic com/fasterxml/Zqg.Zs : [Lcom/fasterxml/Zqg;
    //   439: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */