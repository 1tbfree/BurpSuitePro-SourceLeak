package burp;

import java.math.BigInteger;

class Zmir extends ClassLoader {
  static String ZI;
  
  static Object ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZR(Object paramObject) {
    Zg27.ZP = a(-14489, -21900);
    Zg27.ZQ = new BigInteger(a(-14490, 26190));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zg27.ZP.charAt(Math.abs(((BigInteger)Zmsl.ZB).intValue() % 32)) <= Zboa.Zq.charAt(Math.abs(((BigInteger)Zelz.Z_).intValue() % 32))) {
          try {
            Zgde.Zg(Class.forName(a(-14493, -16517)));
            if (!bool)
              Zx58.ZU(Class.forName(a(-14495, -15399))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zx58.ZU(Class.forName(a(-14495, -15399)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzi3.ZJ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzb2.ZW : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zkc8.ZW : Ljava/lang/Object;
    //   22: sipush #-14494
    //   25: getstatic burp/Zmz.ZW : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zk8b.ZK : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zxn7.ZU : Ljava/lang/Object;
    //   43: sipush #-2015
    //   46: getstatic burp/Zt5t.Za : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zkqx.ZW : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zg2.ZE : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zlhy
    //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   73: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   76: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   79: astore_3
    //   80: aload_3
    //   81: arraylength
    //   82: istore #4
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: iload #4
    //   91: if_icmpge -> 228
    //   94: aload_3
    //   95: iload #5
    //   97: aaload
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual getModifiers : ()I
    //   105: invokestatic isStatic : (I)Z
    //   108: ifne -> 118
    //   111: goto -> 221
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: aload #6
    //   120: invokevirtual getType : ()Ljava/lang/Class;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnull -> 208
    //   130: aload #7
    //   132: invokevirtual isPrimitive : ()Z
    //   135: ifne -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: athrow
    //   145: aload #7
    //   147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   150: ifnull -> 208
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: ifnull -> 208
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: sipush #-14496
    //   189: sipush #-22989
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifne -> 208
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: athrow
    //   208: aload #6
    //   210: iconst_1
    //   211: invokevirtual setAccessible : (Z)V
    //   214: aload #6
    //   216: aconst_null
    //   217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: iinc #5, 1
    //   224: iload_2
    //   225: ifeq -> 87
    //   228: sipush #-14492
    //   231: sipush #-1783
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   243: astore_3
    //   244: aload_3
    //   245: arraylength
    //   246: istore #4
    //   248: iconst_0
    //   249: istore #5
    //   251: iload #5
    //   253: iload #4
    //   255: if_icmpge -> 387
    //   258: aload_3
    //   259: iload #5
    //   261: aaload
    //   262: astore #6
    //   264: aload #6
    //   266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   269: pop
    //   270: aload #6
    //   272: invokevirtual getModifiers : ()I
    //   275: invokestatic isStatic : (I)Z
    //   278: ifeq -> 373
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 373
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 373
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   318: athrow
    //   319: aload #6
    //   321: iconst_1
    //   322: invokevirtual setAccessible : (Z)V
    //   325: aload #6
    //   327: aconst_null
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_1
    //   339: ifnonnull -> 357
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload_1
    //   350: goto -> 364
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: aload_1
    //   358: checkcast [B
    //   361: invokevirtual clone : ()Ljava/lang/Object;
    //   364: aastore
    //   365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: iload_2
    //   370: ifeq -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifeq -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: getstatic burp/Zr0u.Z_ : Ljava/lang/String;
    //   390: getstatic burp/Zsk4.Ze : Ljava/lang/Object;
    //   393: checkcast java/math/BigInteger
    //   396: invokevirtual intValue : ()I
    //   399: bipush #32
    //   401: irem
    //   402: invokestatic abs : (I)I
    //   405: invokevirtual charAt : (I)C
    //   408: getstatic burp/Zg4d.ZE : Ljava/lang/String;
    //   411: getstatic burp/Zm8i.Zm : Ljava/lang/Object;
    //   414: checkcast java/math/BigInteger
    //   417: invokevirtual intValue : ()I
    //   420: bipush #32
    //   422: irem
    //   423: invokestatic abs : (I)I
    //   426: invokevirtual charAt : (I)C
    //   429: if_icmple -> 544
    //   432: getstatic burp/Zlbd.Zq : Ljava/lang/String;
    //   435: getstatic burp/Zb14.ZT : Ljava/lang/Object;
    //   438: checkcast java/math/BigInteger
    //   441: invokevirtual intValue : ()I
    //   444: bipush #32
    //   446: irem
    //   447: invokestatic abs : (I)I
    //   450: invokevirtual charAt : (I)C
    //   453: getstatic burp/Zgkp.ZS : Ljava/lang/String;
    //   456: getstatic burp/Zrva.ZE : Ljava/lang/Object;
    //   459: checkcast java/math/BigInteger
    //   462: invokevirtual intValue : ()I
    //   465: bipush #32
    //   467: irem
    //   468: invokestatic abs : (I)I
    //   471: invokevirtual charAt : (I)C
    //   474: if_icmpgt -> 544
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: getstatic burp/Zkfz.Zs : Ljava/lang/String;
    //   487: getstatic burp/Zest.Zq : Ljava/lang/Object;
    //   490: checkcast java/math/BigInteger
    //   493: invokevirtual intValue : ()I
    //   496: bipush #32
    //   498: irem
    //   499: invokestatic abs : (I)I
    //   502: invokevirtual charAt : (I)C
    //   505: getstatic burp/Ztex.Zx : Ljava/lang/String;
    //   508: getstatic burp/Zsgj.ZK : Ljava/lang/Object;
    //   511: checkcast java/math/BigInteger
    //   514: invokevirtual intValue : ()I
    //   517: bipush #32
    //   519: irem
    //   520: invokestatic abs : (I)I
    //   523: invokevirtual charAt : (I)C
    //   526: if_icmple -> 544
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   535: athrow
    //   536: iconst_1
    //   537: goto -> 545
    //   540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   543: athrow
    //   544: iconst_0
    //   545: ireturn
    //   546: astore_3
    //   547: new java/lang/Exception
    //   550: dup
    //   551: aload_3
    //   552: invokevirtual getMessage : ()Ljava/lang/String;
    //   555: invokespecial <init> : (Ljava/lang/String;)V
    //   558: athrow
    // Exception table:
    //   from	to	target	type
    //   4	545	546	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	312	315	java/lang/Throwable
    //   298	342	345	java/lang/Throwable
    //   319	353	353	java/lang/Throwable
    //   364	380	383	java/lang/Throwable
    //   387	477	480	java/lang/Throwable
    //   432	529	532	java/lang/Throwable
    //   484	540	540	java/lang/Throwable
  }
  
  static void ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'A_ÁíáÑyI®ÀÓ\\t)áÌ:¯ñÕÇ÷\\tn3$`²º}í k7}MàlP3ÅÁÎìãË¿Þë²xZ~ÌaÒþ\\tÝÙR=|¨Ü¿'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'RLË~wöVo Ñ§y×wÔt®#UVÌÕ\\f´%Ä<BMÏÄáÞ^\\bq×-êÕi(OÐíºRj5!^âçìrâG5£\\\fÊ±ù¦øJ¸´<FõknûÉK$ñÝI8ÙÌ0VØ³ò`'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #45
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zmir.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmir.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #10
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #49
    //   229: goto -> 244
    //   232: bipush #81
    //   234: goto -> 244
    //   237: bipush #105
    //   239: goto -> 244
    //   242: bipush #80
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-14491
    //   303: sipush #-27223
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmir.ZI : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #31
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #43
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #100
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: iconst_3
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-43
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-39
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #30
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #79
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-85
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #26
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-117
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-82
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-82
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #16
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #14
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-79
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-60
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #76
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-59
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #120
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #111
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-109
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-32
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-73
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-28
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-86
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-98
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #32
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-83
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-54
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-124
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #90
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zmir.ZF : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC761) & 0xFFFF;
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
      char c = '¤';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmir.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */