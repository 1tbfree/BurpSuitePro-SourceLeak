package com.fasterxml.Zv;

import com.fasterxml.Zb.Zh;

public enum Zu implements Zh {
  WRITE_DOC_START_MARKER, USE_NATIVE_OBJECT_ID, USE_NATIVE_TYPE_ID, CANONICAL_OUTPUT, SPLIT_LINES, MINIMIZE_QUOTES, ALWAYS_QUOTE_NUMBERS_AS_STRINGS, LITERAL_BLOCK_STYLE, INDENT_ARRAYS, INDENT_ARRAYS_WITH_INDICATOR, USE_PLATFORM_LINE_BREAKS, ALLOW_LONG_KEYS;
  
  protected final boolean Zp;
  
  protected final int Zq;
  
  private static final Zu[] Zh;
  
  private static boolean Zv;
  
  public static int ZX() {
    int i = 0;
    for (Zu zu : values()) {
      if (zu.ZP())
        i |= zu.ZV(); 
    } 
    return i;
  }
  
  Zu(boolean paramBoolean) {
    this.Zp = paramBoolean;
    this.Zq = 1 << ordinal();
  }
  
  public boolean ZP() {
    return this.Zp;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.Zq) != 0);
  }
  
  public int ZV() {
    return this.Zq;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: iconst_0
    //   8: istore #4
    //   10: ldc '\\tS\T>\\nF@X/WWT>\\fAQU(\\r[QX-A\\nWWF-\\r]FL>^@\\fMUK @HX-MGU$\\r\\fMKF5\\tMJE+\\nMLCWKS>\\r\\fS\T>\\nZZN/SQH3[HN; GJS$\\fMKF5\\tMQ^1 V\\rF@X%AQF3 SWL$ ]KN"]PS1'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: bipush #31
    //   21: istore_2
    //   22: iconst_m1
    //   23: istore_1
    //   24: invokestatic Zz : (Z)V
    //   27: bipush #49
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
    //   72: ldc '&,'jvn.01nai../`oe ,$ps<'
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: bipush #13
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #12
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
    //   204: bipush #99
    //   206: goto -> 236
    //   209: bipush #110
    //   211: goto -> 236
    //   214: bipush #111
    //   216: goto -> 236
    //   219: bipush #35
    //   221: goto -> 236
    //   224: bipush #52
    //   226: goto -> 236
    //   229: bipush #54
    //   231: goto -> 236
    //   234: bipush #80
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
    //   292: new com/fasterxml/Zv/Zu
    //   295: dup
    //   296: aload_0
    //   297: bipush #8
    //   299: aaload
    //   300: iconst_0
    //   301: iconst_1
    //   302: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   305: putstatic com/fasterxml/Zv/Zu.WRITE_DOC_START_MARKER : Lcom/fasterxml/Zv/Zu;
    //   308: new com/fasterxml/Zv/Zu
    //   311: dup
    //   312: aload_0
    //   313: iconst_4
    //   314: aaload
    //   315: iconst_1
    //   316: iconst_1
    //   317: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   320: putstatic com/fasterxml/Zv/Zu.USE_NATIVE_OBJECT_ID : Lcom/fasterxml/Zv/Zu;
    //   323: new com/fasterxml/Zv/Zu
    //   326: dup
    //   327: aload_0
    //   328: bipush #7
    //   330: aaload
    //   331: iconst_2
    //   332: iconst_1
    //   333: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   336: putstatic com/fasterxml/Zv/Zu.USE_NATIVE_TYPE_ID : Lcom/fasterxml/Zv/Zu;
    //   339: new com/fasterxml/Zv/Zu
    //   342: dup
    //   343: aload_0
    //   344: bipush #9
    //   346: aaload
    //   347: iconst_3
    //   348: iconst_0
    //   349: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   352: putstatic com/fasterxml/Zv/Zu.CANONICAL_OUTPUT : Lcom/fasterxml/Zv/Zu;
    //   355: new com/fasterxml/Zv/Zu
    //   358: dup
    //   359: aload_0
    //   360: iconst_1
    //   361: aaload
    //   362: iconst_4
    //   363: iconst_1
    //   364: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   367: putstatic com/fasterxml/Zv/Zu.SPLIT_LINES : Lcom/fasterxml/Zv/Zu;
    //   370: new com/fasterxml/Zv/Zu
    //   373: dup
    //   374: aload_0
    //   375: bipush #6
    //   377: aaload
    //   378: iconst_5
    //   379: iconst_0
    //   380: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   383: putstatic com/fasterxml/Zv/Zu.MINIMIZE_QUOTES : Lcom/fasterxml/Zv/Zu;
    //   386: new com/fasterxml/Zv/Zu
    //   389: dup
    //   390: aload_0
    //   391: iconst_0
    //   392: aaload
    //   393: bipush #6
    //   395: iconst_0
    //   396: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   399: putstatic com/fasterxml/Zv/Zu.ALWAYS_QUOTE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zv/Zu;
    //   402: new com/fasterxml/Zv/Zu
    //   405: dup
    //   406: aload_0
    //   407: iconst_2
    //   408: aaload
    //   409: bipush #7
    //   411: iconst_0
    //   412: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   415: putstatic com/fasterxml/Zv/Zu.LITERAL_BLOCK_STYLE : Lcom/fasterxml/Zv/Zu;
    //   418: new com/fasterxml/Zv/Zu
    //   421: dup
    //   422: aload_0
    //   423: bipush #10
    //   425: aaload
    //   426: bipush #8
    //   428: iconst_0
    //   429: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   432: putstatic com/fasterxml/Zv/Zu.INDENT_ARRAYS : Lcom/fasterxml/Zv/Zu;
    //   435: new com/fasterxml/Zv/Zu
    //   438: dup
    //   439: aload_0
    //   440: iconst_5
    //   441: aaload
    //   442: bipush #9
    //   444: iconst_0
    //   445: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   448: putstatic com/fasterxml/Zv/Zu.INDENT_ARRAYS_WITH_INDICATOR : Lcom/fasterxml/Zv/Zu;
    //   451: new com/fasterxml/Zv/Zu
    //   454: dup
    //   455: aload_0
    //   456: iconst_3
    //   457: aaload
    //   458: bipush #10
    //   460: iconst_0
    //   461: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   464: putstatic com/fasterxml/Zv/Zu.USE_PLATFORM_LINE_BREAKS : Lcom/fasterxml/Zv/Zu;
    //   467: new com/fasterxml/Zv/Zu
    //   470: dup
    //   471: aload_0
    //   472: bipush #11
    //   474: aaload
    //   475: bipush #11
    //   477: iconst_0
    //   478: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   481: putstatic com/fasterxml/Zv/Zu.ALLOW_LONG_KEYS : Lcom/fasterxml/Zv/Zu;
    //   484: bipush #12
    //   486: anewarray com/fasterxml/Zv/Zu
    //   489: dup
    //   490: iconst_0
    //   491: getstatic com/fasterxml/Zv/Zu.WRITE_DOC_START_MARKER : Lcom/fasterxml/Zv/Zu;
    //   494: aastore
    //   495: dup
    //   496: iconst_1
    //   497: getstatic com/fasterxml/Zv/Zu.USE_NATIVE_OBJECT_ID : Lcom/fasterxml/Zv/Zu;
    //   500: aastore
    //   501: dup
    //   502: iconst_2
    //   503: getstatic com/fasterxml/Zv/Zu.USE_NATIVE_TYPE_ID : Lcom/fasterxml/Zv/Zu;
    //   506: aastore
    //   507: dup
    //   508: iconst_3
    //   509: getstatic com/fasterxml/Zv/Zu.CANONICAL_OUTPUT : Lcom/fasterxml/Zv/Zu;
    //   512: aastore
    //   513: dup
    //   514: iconst_4
    //   515: getstatic com/fasterxml/Zv/Zu.SPLIT_LINES : Lcom/fasterxml/Zv/Zu;
    //   518: aastore
    //   519: dup
    //   520: iconst_5
    //   521: getstatic com/fasterxml/Zv/Zu.MINIMIZE_QUOTES : Lcom/fasterxml/Zv/Zu;
    //   524: aastore
    //   525: dup
    //   526: bipush #6
    //   528: getstatic com/fasterxml/Zv/Zu.ALWAYS_QUOTE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zv/Zu;
    //   531: aastore
    //   532: dup
    //   533: bipush #7
    //   535: getstatic com/fasterxml/Zv/Zu.LITERAL_BLOCK_STYLE : Lcom/fasterxml/Zv/Zu;
    //   538: aastore
    //   539: dup
    //   540: bipush #8
    //   542: getstatic com/fasterxml/Zv/Zu.INDENT_ARRAYS : Lcom/fasterxml/Zv/Zu;
    //   545: aastore
    //   546: dup
    //   547: bipush #9
    //   549: getstatic com/fasterxml/Zv/Zu.INDENT_ARRAYS_WITH_INDICATOR : Lcom/fasterxml/Zv/Zu;
    //   552: aastore
    //   553: dup
    //   554: bipush #10
    //   556: getstatic com/fasterxml/Zv/Zu.USE_PLATFORM_LINE_BREAKS : Lcom/fasterxml/Zv/Zu;
    //   559: aastore
    //   560: dup
    //   561: bipush #11
    //   563: getstatic com/fasterxml/Zv/Zu.ALLOW_LONG_KEYS : Lcom/fasterxml/Zv/Zu;
    //   566: aastore
    //   567: putstatic com/fasterxml/Zv/Zu.Zh : [Lcom/fasterxml/Zv/Zu;
    //   570: return
  }
  
  public static void Zz(boolean paramBoolean) {
    Zv = paramBoolean;
  }
  
  public static boolean Zn() {
    return Zv;
  }
  
  public static boolean Zr() {
    boolean bool = Zn();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */