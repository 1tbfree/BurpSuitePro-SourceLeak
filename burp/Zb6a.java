package burp;

import java.math.BigInteger;

class Zb6a extends ClassLoader {
  static String ZY;
  
  static Object Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zlbt.ZF : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zez0.ZT : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsow.ZV : Ljava/lang/Object;
    //   22: sipush #19103
    //   25: getstatic burp/Zzco.ZC : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zlo4.ZC : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zb4m.Zp : Ljava/lang/Object;
    //   43: sipush #5484
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zlb6
    //   52: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   55: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   58: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   61: astore_3
    //   62: aload_3
    //   63: arraylength
    //   64: istore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload #4
    //   73: if_icmpge -> 210
    //   76: aload_3
    //   77: iload #5
    //   79: aaload
    //   80: astore #6
    //   82: aload #6
    //   84: invokevirtual getModifiers : ()I
    //   87: invokestatic isStatic : (I)Z
    //   90: ifne -> 100
    //   93: goto -> 203
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: aload #6
    //   102: invokevirtual getType : ()Ljava/lang/Class;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 190
    //   112: aload #7
    //   114: invokevirtual isPrimitive : ()Z
    //   117: ifne -> 190
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #7
    //   129: invokevirtual getPackage : ()Ljava/lang/Package;
    //   132: ifnull -> 190
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: ifnull -> 190
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: sipush #19101
    //   171: sipush #-25348
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   180: ifne -> 190
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   189: athrow
    //   190: aload #6
    //   192: iconst_1
    //   193: invokevirtual setAccessible : (Z)V
    //   196: aload #6
    //   198: aconst_null
    //   199: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: iinc #5, 1
    //   206: iload_2
    //   207: ifne -> 69
    //   210: sipush #19097
    //   213: sipush #-19192
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   222: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   225: astore_3
    //   226: aload_3
    //   227: arraylength
    //   228: istore #4
    //   230: iconst_0
    //   231: istore #5
    //   233: iload #5
    //   235: iload #4
    //   237: if_icmpge -> 369
    //   240: aload_3
    //   241: iload #5
    //   243: aaload
    //   244: astore #6
    //   246: aload #6
    //   248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   251: pop
    //   252: aload #6
    //   254: invokevirtual getModifiers : ()I
    //   257: invokestatic isStatic : (I)Z
    //   260: ifeq -> 355
    //   263: aload #6
    //   265: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   268: arraylength
    //   269: iconst_2
    //   270: if_icmpne -> 355
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   285: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   288: invokevirtual equals : (Ljava/lang/Object;)Z
    //   291: ifeq -> 355
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   300: athrow
    //   301: aload #6
    //   303: iconst_1
    //   304: invokevirtual setAccessible : (Z)V
    //   307: aload #6
    //   309: aconst_null
    //   310: iconst_2
    //   311: anewarray java/lang/Object
    //   314: dup
    //   315: iconst_0
    //   316: aload_0
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: aload_1
    //   321: ifnonnull -> 339
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload_1
    //   332: goto -> 346
    //   335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   338: athrow
    //   339: aload_1
    //   340: checkcast [B
    //   343: invokevirtual clone : ()Ljava/lang/Object;
    //   346: aastore
    //   347: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: iload_2
    //   352: ifne -> 369
    //   355: iinc #5, 1
    //   358: iload_2
    //   359: ifne -> 233
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: getstatic burp/Ztsj.ZU : Ljava/lang/String;
    //   372: getstatic burp/Zxo4.ZV : Ljava/lang/Object;
    //   375: checkcast java/math/BigInteger
    //   378: invokevirtual intValue : ()I
    //   381: bipush #32
    //   383: irem
    //   384: invokestatic abs : (I)I
    //   387: invokevirtual charAt : (I)C
    //   390: getstatic burp/Ze57.ZV : Ljava/lang/String;
    //   393: getstatic burp/Zro2.Zu : Ljava/lang/Object;
    //   396: checkcast java/math/BigInteger
    //   399: invokevirtual intValue : ()I
    //   402: bipush #32
    //   404: irem
    //   405: invokestatic abs : (I)I
    //   408: invokevirtual charAt : (I)C
    //   411: if_icmple -> 526
    //   414: getstatic burp/Zl8i.Zb : Ljava/lang/String;
    //   417: getstatic burp/Zro2.Zu : Ljava/lang/Object;
    //   420: checkcast java/math/BigInteger
    //   423: invokevirtual intValue : ()I
    //   426: bipush #32
    //   428: irem
    //   429: invokestatic abs : (I)I
    //   432: invokevirtual charAt : (I)C
    //   435: getstatic burp/Zml.ZN : Ljava/lang/String;
    //   438: getstatic burp/Zgre.ZD : Ljava/lang/Object;
    //   441: checkcast java/math/BigInteger
    //   444: invokevirtual intValue : ()I
    //   447: bipush #32
    //   449: irem
    //   450: invokestatic abs : (I)I
    //   453: invokevirtual charAt : (I)C
    //   456: if_icmple -> 526
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: getstatic burp/Zkht.Zd : Ljava/lang/String;
    //   469: getstatic burp/Zmu6.Zb : Ljava/lang/Object;
    //   472: checkcast java/math/BigInteger
    //   475: invokevirtual intValue : ()I
    //   478: bipush #32
    //   480: irem
    //   481: invokestatic abs : (I)I
    //   484: invokevirtual charAt : (I)C
    //   487: getstatic burp/Ze57.ZV : Ljava/lang/String;
    //   490: getstatic burp/Zll8.ZE : Ljava/lang/Object;
    //   493: checkcast java/math/BigInteger
    //   496: invokevirtual intValue : ()I
    //   499: bipush #32
    //   501: irem
    //   502: invokestatic abs : (I)I
    //   505: invokevirtual charAt : (I)C
    //   508: if_icmpgt -> 526
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   517: athrow
    //   518: iconst_1
    //   519: goto -> 527
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: iconst_0
    //   527: ireturn
    //   528: astore_3
    //   529: new java/lang/Exception
    //   532: dup
    //   533: aload_3
    //   534: invokevirtual getMessage : ()Ljava/lang/String;
    //   537: invokespecial <init> : (Ljava/lang/String;)V
    //   540: athrow
    // Exception table:
    //   from	to	target	type
    //   4	527	528	java/lang/Throwable
    //   82	96	96	java/lang/Throwable
    //   107	120	123	java/lang/Throwable
    //   112	135	138	java/lang/Throwable
    //   127	153	156	java/lang/Throwable
    //   142	183	186	java/lang/Throwable
    //   246	273	276	java/lang/Throwable
    //   263	294	297	java/lang/Throwable
    //   280	324	327	java/lang/Throwable
    //   301	335	335	java/lang/Throwable
    //   346	362	365	java/lang/Throwable
    //   369	459	462	java/lang/Throwable
    //   414	511	514	java/lang/Throwable
    //   466	522	522	java/lang/Throwable
  }
  
  static void Zp(Object paramObject) {
    Zstf.ZZ = a(19099, -7875);
    Zstf.ZA = new BigInteger(a(19096, -9072));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zeuz.Zb.charAt(Math.abs(((BigInteger)Zkqx.ZW).intValue() % 32)) <= Zf.Zd.charAt(Math.abs(((BigInteger)Ztp.Zp).intValue() % 32))) {
          try {
            Zzco.Zs(Class.forName(a(19098, -10810)));
            if (bool)
              Zss6.Zx(Class.forName(a(19102, 23617))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zss6.Zx(Class.forName(a(19102, 23617)));
    } catch (Throwable throwable) {}
  }
  
  static void ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥4ü¾?ìöíñËYVz~eF÷õÃ3ÈÂ:è©H\\r0Ó2]úÉþèÞÝ-íô+ó3kXô¯\y¿O}ZÂ #¹wµ´\\tÝpðQ9«ÿo\\tZ ='&!Áð ¿2CZmÑ*j½þs!'"¼Ö#\\tB]7 ÙÅÕ)G|j,:{Ù÷ªôtö¶ Â.ÅMN'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #90
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
    //   68: ldc 'ªÏ9'ý(\\t!àHd\\t*Þx'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #48
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
    //   129: putstatic burp/Zb6a.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb6a.b : [Ljava/lang/String;
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
    //   212: bipush #123
    //   214: goto -> 244
    //   217: bipush #20
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #103
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #88
    //   239: goto -> 244
    //   242: bipush #100
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
    //   300: sipush #19100
    //   303: sipush #-24757
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zb6a.ZY : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #89
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-93
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #8
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-39
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-17
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-108
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #81
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #27
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-45
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #40
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-88
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-27
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #23
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #89
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-42
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-93
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #110
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #85
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #109
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #122
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-78
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-58
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-25
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-2
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-74
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-119
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-83
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #121
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-15
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #31
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-95
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-122
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zb6a.Zz : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4A98) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */