package burp;

import java.math.BigInteger;

class Zggi extends ClassLoader {
  static String ZS;
  
  static Object Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zy(Object paramObject) {
    Zzxa.Zl = a(-16925, -66);
    Zzxa.ZI = new BigInteger(a(-16926, -6581));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxtc.Zo.charAt(Math.abs(((BigInteger)Zz8o.Zg).intValue() % 32)) <= Ztod.Zj.charAt(Math.abs(((BigInteger)Zg4w.ZR).intValue() % 32))) {
          try {
            Zzh0.ZM(Class.forName(a(-16924, -15008)));
            if (!bool)
              Zrfl.Zo(Class.forName(a(-16921, 16373))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrfl.Zo(Class.forName(a(-16921, 16373)));
    } catch (Throwable throwable) {}
  }
  
  static void ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #-16928
    //   7: sipush #32689
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   19: astore_3
    //   20: aload_3
    //   21: arraylength
    //   22: istore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload #4
    //   31: if_icmpge -> 118
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #6
    //   40: aload #6
    //   42: invokevirtual getModifiers : ()I
    //   45: invokestatic isStatic : (I)Z
    //   48: ifeq -> 111
    //   51: aload #6
    //   53: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   56: arraylength
    //   57: iconst_2
    //   58: if_icmpne -> 111
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: aload #6
    //   70: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   73: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   76: if_acmpne -> 111
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: aload #6
    //   88: aconst_null
    //   89: iconst_2
    //   90: anewarray java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_0
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: aload_1
    //   100: aastore
    //   101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   104: checkcast java/lang/Boolean
    //   107: invokevirtual booleanValue : ()Z
    //   110: ireturn
    //   111: iinc #5, 1
    //   114: iload_2
    //   115: ifne -> 27
    //   118: sipush #-16927
    //   121: sipush #10286
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: iconst_1
    //   128: ldc burp/Zb9d
    //   130: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   133: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   136: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   139: astore_3
    //   140: aload_3
    //   141: arraylength
    //   142: istore #4
    //   144: iconst_0
    //   145: istore #5
    //   147: iload #5
    //   149: iload #4
    //   151: if_icmpge -> 288
    //   154: aload_3
    //   155: iload #5
    //   157: aaload
    //   158: astore #6
    //   160: aload #6
    //   162: invokevirtual getModifiers : ()I
    //   165: invokestatic isStatic : (I)Z
    //   168: ifne -> 178
    //   171: goto -> 281
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #6
    //   180: invokevirtual getType : ()Ljava/lang/Class;
    //   183: astore #7
    //   185: aload #7
    //   187: ifnull -> 268
    //   190: aload #7
    //   192: invokevirtual isPrimitive : ()Z
    //   195: ifne -> 268
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload #7
    //   207: invokevirtual getPackage : ()Ljava/lang/Package;
    //   210: ifnull -> 268
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   219: athrow
    //   220: aload #7
    //   222: invokevirtual getPackage : ()Ljava/lang/Package;
    //   225: invokevirtual getName : ()Ljava/lang/String;
    //   228: ifnull -> 268
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   237: athrow
    //   238: aload #7
    //   240: invokevirtual getPackage : ()Ljava/lang/Package;
    //   243: invokevirtual getName : ()Ljava/lang/String;
    //   246: sipush #-16922
    //   249: sipush #-17441
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   258: ifne -> 268
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   267: athrow
    //   268: aload #6
    //   270: iconst_1
    //   271: invokevirtual setAccessible : (Z)V
    //   274: aload #6
    //   276: aconst_null
    //   277: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   280: pop
    //   281: iinc #5, 1
    //   284: iload_2
    //   285: ifne -> 147
    //   288: sipush #-16914
    //   291: sipush #23810
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   300: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   303: astore_3
    //   304: aload_3
    //   305: arraylength
    //   306: istore #4
    //   308: iconst_0
    //   309: istore #5
    //   311: iload #5
    //   313: iload #4
    //   315: if_icmpge -> 447
    //   318: aload_3
    //   319: iload #5
    //   321: aaload
    //   322: astore #6
    //   324: aload #6
    //   326: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   329: pop
    //   330: aload #6
    //   332: invokevirtual getModifiers : ()I
    //   335: invokestatic isStatic : (I)Z
    //   338: ifeq -> 433
    //   341: aload #6
    //   343: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   346: arraylength
    //   347: iconst_2
    //   348: if_icmpne -> 433
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   357: athrow
    //   358: aload #6
    //   360: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   363: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   366: invokevirtual equals : (Ljava/lang/Object;)Z
    //   369: ifeq -> 433
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   378: athrow
    //   379: aload #6
    //   381: iconst_1
    //   382: invokevirtual setAccessible : (Z)V
    //   385: aload #6
    //   387: aconst_null
    //   388: iconst_2
    //   389: anewarray java/lang/Object
    //   392: dup
    //   393: iconst_0
    //   394: aload_0
    //   395: aastore
    //   396: dup
    //   397: iconst_1
    //   398: aload_1
    //   399: ifnonnull -> 417
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   408: athrow
    //   409: aload_1
    //   410: goto -> 424
    //   413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   416: athrow
    //   417: aload_1
    //   418: checkcast [B
    //   421: invokevirtual clone : ()Ljava/lang/Object;
    //   424: aastore
    //   425: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   428: pop
    //   429: iload_2
    //   430: ifne -> 447
    //   433: iinc #5, 1
    //   436: iload_2
    //   437: ifne -> 311
    //   440: goto -> 447
    //   443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   446: athrow
    //   447: getstatic burp/Zsf4.ZA : Ljava/lang/String;
    //   450: getstatic burp/Zeju.Zk : Ljava/lang/Object;
    //   453: checkcast java/math/BigInteger
    //   456: invokevirtual intValue : ()I
    //   459: bipush #32
    //   461: irem
    //   462: invokestatic abs : (I)I
    //   465: invokevirtual charAt : (I)C
    //   468: getstatic burp/Zms1.ZZ : Ljava/lang/String;
    //   471: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   474: checkcast java/math/BigInteger
    //   477: invokevirtual intValue : ()I
    //   480: bipush #32
    //   482: irem
    //   483: invokestatic abs : (I)I
    //   486: invokevirtual charAt : (I)C
    //   489: if_icmpgt -> 596
    //   492: getstatic burp/Zkfb.ZV : Ljava/lang/String;
    //   495: getstatic burp/Zbsc.ZA : Ljava/lang/Object;
    //   498: checkcast java/math/BigInteger
    //   501: invokevirtual intValue : ()I
    //   504: bipush #32
    //   506: irem
    //   507: invokestatic abs : (I)I
    //   510: invokevirtual charAt : (I)C
    //   513: getstatic burp/Zre4.Zh : Ljava/lang/String;
    //   516: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   519: checkcast java/math/BigInteger
    //   522: invokevirtual intValue : ()I
    //   525: bipush #32
    //   527: irem
    //   528: invokestatic abs : (I)I
    //   531: invokevirtual charAt : (I)C
    //   534: if_icmple -> 596
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   543: athrow
    //   544: getstatic burp/Zth8.ZN : Ljava/lang/String;
    //   547: getstatic burp/Zgl2.ZS : Ljava/lang/Object;
    //   550: checkcast java/math/BigInteger
    //   553: invokevirtual intValue : ()I
    //   556: bipush #32
    //   558: irem
    //   559: invokestatic abs : (I)I
    //   562: invokevirtual charAt : (I)C
    //   565: getstatic burp/Ztsc.ZL : Ljava/lang/String;
    //   568: getstatic burp/Zml2.Zo : Ljava/lang/Object;
    //   571: checkcast java/math/BigInteger
    //   574: invokevirtual intValue : ()I
    //   577: bipush #32
    //   579: irem
    //   580: invokestatic abs : (I)I
    //   583: invokevirtual charAt : (I)C
    //   586: if_icmple -> 604
    //   589: goto -> 596
    //   592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   595: athrow
    //   596: iconst_1
    //   597: goto -> 605
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: iconst_0
    //   605: ireturn
    //   606: astore_3
    //   607: new java/lang/Exception
    //   610: dup
    //   611: aload_3
    //   612: invokevirtual getMessage : ()Ljava/lang/String;
    //   615: invokespecial <init> : (Ljava/lang/String;)V
    //   618: athrow
    // Exception table:
    //   from	to	target	type
    //   4	110	606	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   51	79	82	java/lang/Throwable
    //   111	605	606	java/lang/Throwable
    //   160	174	174	java/lang/Throwable
    //   185	198	201	java/lang/Throwable
    //   190	213	216	java/lang/Throwable
    //   205	231	234	java/lang/Throwable
    //   220	261	264	java/lang/Throwable
    //   324	351	354	java/lang/Throwable
    //   341	372	375	java/lang/Throwable
    //   358	402	405	java/lang/Throwable
    //   379	413	413	java/lang/Throwable
    //   424	440	443	java/lang/Throwable
    //   447	537	540	java/lang/Throwable
    //   492	589	592	java/lang/Throwable
    //   544	600	600	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'A8x¹\\tëÐÃìqq¯\\t]¥û\\néÕÜ{ sávE9®¤a·ç865C:Ë^éRü`h6M Ý%qù¸.ºÖm'ï·r¤y³¯ÐÌUà.\\bau£¡DÓÐaµ¸ràñ°º­ö¥B\w«Þõ"BwëWºÒþ`´  LbûìÅ¸øv/fTRºÄÌ"mCý= ùûÕ\\t!tïiãÜ¤'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #31
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '§ôÁEËYå¢o\\t¡O2Ó·æ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #119
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zggi.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zggi.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #68
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #120
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #105
    //   239: goto -> 244
    //   242: bipush #116
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #-16923
    //   303: sipush #-6191
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zggi.ZS : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #22
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-26
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-77
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #44
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-89
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-43
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #61
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-99
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-22
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #39
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-15
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-15
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-111
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-57
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #100
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #56
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #85
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #84
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-30
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #54
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-82
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #126
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #93
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-51
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #95
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-97
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #87
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #67
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-10
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-47
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #49
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #46
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zggi.Zc : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBDE6) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'Ö';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */