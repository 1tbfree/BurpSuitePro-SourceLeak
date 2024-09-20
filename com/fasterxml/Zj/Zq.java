package com.fasterxml.Zj;

public enum Zq {
  Array, Object, Integer, Float, Boolean, String, Binary, EmptyArray, EmptyObject, EmptyString;
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '%Pj,!Qj* * Kn?<?&O!/\\t\0Mb6>,\\fUn;-\\n&O!?F&O!\\n9Ql'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_5
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: iconst_5
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 127
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 22
    //   66: ldc '8iN%tC'
    //   68: dup
    //   69: astore_3
    //   70: invokevirtual length : ()I
    //   73: istore #5
    //   75: iconst_5
    //   76: istore_2
    //   77: iconst_m1
    //   78: istore_1
    //   79: bipush #33
    //   81: iinc #1, 1
    //   84: aload_3
    //   85: iload_1
    //   86: dup
    //   87: iload_2
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 127
    //   96: aload_0
    //   97: swap
    //   98: iload #4
    //   100: iinc #4, 1
    //   103: swap
    //   104: aastore
    //   105: iload_1
    //   106: iload_2
    //   107: iadd
    //   108: dup
    //   109: istore_1
    //   110: iload #5
    //   112: if_icmpge -> 124
    //   115: aload_3
    //   116: iload_1
    //   117: invokevirtual charAt : (I)C
    //   120: istore_2
    //   121: goto -> 79
    //   124: goto -> 284
    //   127: dup_x2
    //   128: pop
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup_x1
    //   133: arraylength
    //   134: dup_x2
    //   135: pop
    //   136: iconst_0
    //   137: istore #6
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iconst_1
    //   143: if_icmpgt -> 244
    //   146: dup2
    //   147: swap
    //   148: iload #6
    //   150: dup2_x1
    //   151: caload
    //   152: swap
    //   153: iload #6
    //   155: bipush #7
    //   157: irem
    //   158: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #102
    //   198: goto -> 228
    //   201: bipush #107
    //   203: goto -> 228
    //   206: bipush #58
    //   208: goto -> 228
    //   211: bipush #14
    //   213: goto -> 228
    //   216: bipush #93
    //   218: goto -> 228
    //   221: bipush #92
    //   223: goto -> 228
    //   226: bipush #72
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 150
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 146
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 38, 0 -> 96
    //   284: new com/fasterxml/Zj/Zq
    //   287: dup
    //   288: aload_0
    //   289: bipush #8
    //   291: aaload
    //   292: iconst_0
    //   293: invokespecial <init> : (Ljava/lang/String;I)V
    //   296: putstatic com/fasterxml/Zj/Zq.Array : Lcom/fasterxml/Zj/Zq;
    //   299: new com/fasterxml/Zj/Zq
    //   302: dup
    //   303: aload_0
    //   304: iconst_5
    //   305: aaload
    //   306: iconst_1
    //   307: invokespecial <init> : (Ljava/lang/String;I)V
    //   310: putstatic com/fasterxml/Zj/Zq.Object : Lcom/fasterxml/Zj/Zq;
    //   313: new com/fasterxml/Zj/Zq
    //   316: dup
    //   317: aload_0
    //   318: iconst_2
    //   319: aaload
    //   320: iconst_2
    //   321: invokespecial <init> : (Ljava/lang/String;I)V
    //   324: putstatic com/fasterxml/Zj/Zq.Integer : Lcom/fasterxml/Zj/Zq;
    //   327: new com/fasterxml/Zj/Zq
    //   330: dup
    //   331: aload_0
    //   332: iconst_0
    //   333: aaload
    //   334: iconst_3
    //   335: invokespecial <init> : (Ljava/lang/String;I)V
    //   338: putstatic com/fasterxml/Zj/Zq.Float : Lcom/fasterxml/Zj/Zq;
    //   341: new com/fasterxml/Zj/Zq
    //   344: dup
    //   345: aload_0
    //   346: bipush #9
    //   348: aaload
    //   349: iconst_4
    //   350: invokespecial <init> : (Ljava/lang/String;I)V
    //   353: putstatic com/fasterxml/Zj/Zq.Boolean : Lcom/fasterxml/Zj/Zq;
    //   356: new com/fasterxml/Zj/Zq
    //   359: dup
    //   360: aload_0
    //   361: iconst_4
    //   362: aaload
    //   363: iconst_5
    //   364: invokespecial <init> : (Ljava/lang/String;I)V
    //   367: putstatic com/fasterxml/Zj/Zq.String : Lcom/fasterxml/Zj/Zq;
    //   370: new com/fasterxml/Zj/Zq
    //   373: dup
    //   374: aload_0
    //   375: iconst_1
    //   376: aaload
    //   377: bipush #6
    //   379: invokespecial <init> : (Ljava/lang/String;I)V
    //   382: putstatic com/fasterxml/Zj/Zq.Binary : Lcom/fasterxml/Zj/Zq;
    //   385: new com/fasterxml/Zj/Zq
    //   388: dup
    //   389: aload_0
    //   390: bipush #6
    //   392: aaload
    //   393: bipush #7
    //   395: invokespecial <init> : (Ljava/lang/String;I)V
    //   398: putstatic com/fasterxml/Zj/Zq.EmptyArray : Lcom/fasterxml/Zj/Zq;
    //   401: new com/fasterxml/Zj/Zq
    //   404: dup
    //   405: aload_0
    //   406: iconst_3
    //   407: aaload
    //   408: bipush #8
    //   410: invokespecial <init> : (Ljava/lang/String;I)V
    //   413: putstatic com/fasterxml/Zj/Zq.EmptyObject : Lcom/fasterxml/Zj/Zq;
    //   416: new com/fasterxml/Zj/Zq
    //   419: dup
    //   420: aload_0
    //   421: bipush #7
    //   423: aaload
    //   424: bipush #9
    //   426: invokespecial <init> : (Ljava/lang/String;I)V
    //   429: putstatic com/fasterxml/Zj/Zq.EmptyString : Lcom/fasterxml/Zj/Zq;
    //   432: bipush #10
    //   434: anewarray com/fasterxml/Zj/Zq
    //   437: dup
    //   438: iconst_0
    //   439: getstatic com/fasterxml/Zj/Zq.Array : Lcom/fasterxml/Zj/Zq;
    //   442: aastore
    //   443: dup
    //   444: iconst_1
    //   445: getstatic com/fasterxml/Zj/Zq.Object : Lcom/fasterxml/Zj/Zq;
    //   448: aastore
    //   449: dup
    //   450: iconst_2
    //   451: getstatic com/fasterxml/Zj/Zq.Integer : Lcom/fasterxml/Zj/Zq;
    //   454: aastore
    //   455: dup
    //   456: iconst_3
    //   457: getstatic com/fasterxml/Zj/Zq.Float : Lcom/fasterxml/Zj/Zq;
    //   460: aastore
    //   461: dup
    //   462: iconst_4
    //   463: getstatic com/fasterxml/Zj/Zq.Boolean : Lcom/fasterxml/Zj/Zq;
    //   466: aastore
    //   467: dup
    //   468: iconst_5
    //   469: getstatic com/fasterxml/Zj/Zq.String : Lcom/fasterxml/Zj/Zq;
    //   472: aastore
    //   473: dup
    //   474: bipush #6
    //   476: getstatic com/fasterxml/Zj/Zq.Binary : Lcom/fasterxml/Zj/Zq;
    //   479: aastore
    //   480: dup
    //   481: bipush #7
    //   483: getstatic com/fasterxml/Zj/Zq.EmptyArray : Lcom/fasterxml/Zj/Zq;
    //   486: aastore
    //   487: dup
    //   488: bipush #8
    //   490: getstatic com/fasterxml/Zj/Zq.EmptyObject : Lcom/fasterxml/Zj/Zq;
    //   493: aastore
    //   494: dup
    //   495: bipush #9
    //   497: getstatic com/fasterxml/Zj/Zq.EmptyString : Lcom/fasterxml/Zj/Zq;
    //   500: aastore
    //   501: putstatic com/fasterxml/Zj/Zq.ZV : [Lcom/fasterxml/Zj/Zq;
    //   504: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */