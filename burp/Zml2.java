package burp;

import java.math.BigInteger;

class Zml2 extends ClassLoader {
  static String Zh;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg_6.ZU : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zmfw.ZS : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   22: sipush #14244
    //   25: sipush #1877
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Ze0w
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #14249
    //   153: sipush #-29596
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifeq -> 51
    //   192: sipush #14252
    //   195: sipush #-22301
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: ldc2_w 8682522807148012
    //   354: invokestatic currentTimeMillis : ()J
    //   357: lxor
    //   358: lstore #4
    //   360: lload #4
    //   362: ldc2_w 25214903917
    //   365: lmul
    //   366: ldc2_w 11
    //   369: ladd
    //   370: ldc2_w 281474976710655
    //   373: land
    //   374: lstore #4
    //   376: lload #4
    //   378: bipush #32
    //   380: lshl
    //   381: lstore #6
    //   383: lload #4
    //   385: ldc2_w 25214903917
    //   388: lmul
    //   389: ldc2_w 11
    //   392: ladd
    //   393: ldc2_w 281474976710655
    //   396: land
    //   397: lstore #4
    //   399: lload #6
    //   401: lload #4
    //   403: ladd
    //   404: lstore #6
    //   406: bipush #16
    //   408: newarray byte
    //   410: dup
    //   411: iconst_0
    //   412: bipush #48
    //   414: bastore
    //   415: dup
    //   416: iconst_1
    //   417: bipush #49
    //   419: bastore
    //   420: dup
    //   421: iconst_2
    //   422: bipush #50
    //   424: bastore
    //   425: dup
    //   426: iconst_3
    //   427: bipush #51
    //   429: bastore
    //   430: dup
    //   431: iconst_4
    //   432: bipush #52
    //   434: bastore
    //   435: dup
    //   436: iconst_5
    //   437: bipush #53
    //   439: bastore
    //   440: dup
    //   441: bipush #6
    //   443: bipush #54
    //   445: bastore
    //   446: dup
    //   447: bipush #7
    //   449: bipush #55
    //   451: bastore
    //   452: dup
    //   453: bipush #8
    //   455: bipush #56
    //   457: bastore
    //   458: dup
    //   459: bipush #9
    //   461: bipush #57
    //   463: bastore
    //   464: dup
    //   465: bipush #10
    //   467: bipush #97
    //   469: bastore
    //   470: dup
    //   471: bipush #11
    //   473: bipush #98
    //   475: bastore
    //   476: dup
    //   477: bipush #12
    //   479: bipush #99
    //   481: bastore
    //   482: dup
    //   483: bipush #13
    //   485: bipush #100
    //   487: bastore
    //   488: dup
    //   489: bipush #14
    //   491: bipush #101
    //   493: bastore
    //   494: dup
    //   495: bipush #15
    //   497: bipush #102
    //   499: bastore
    //   500: astore #8
    //   502: bipush #64
    //   504: newarray byte
    //   506: astore #9
    //   508: bipush #64
    //   510: istore #10
    //   512: bipush #16
    //   514: istore #11
    //   516: iload #11
    //   518: iconst_1
    //   519: isub
    //   520: i2l
    //   521: lstore #12
    //   523: aload #9
    //   525: iinc #10, -1
    //   528: iload #10
    //   530: aload #8
    //   532: lload #6
    //   534: lload #12
    //   536: land
    //   537: l2i
    //   538: baload
    //   539: bastore
    //   540: lload #6
    //   542: iconst_4
    //   543: lushr
    //   544: lstore #6
    //   546: lload #6
    //   548: lconst_0
    //   549: lcmp
    //   550: ifne -> 523
    //   553: bipush #64
    //   555: iload #10
    //   557: isub
    //   558: newarray byte
    //   560: astore_3
    //   561: iconst_0
    //   562: istore #14
    //   564: iload #14
    //   566: aload_3
    //   567: arraylength
    //   568: if_icmpge -> 590
    //   571: aload_3
    //   572: iload #14
    //   574: aload #9
    //   576: iload #10
    //   578: iload #14
    //   580: iadd
    //   581: baload
    //   582: bastore
    //   583: iinc #14, 1
    //   586: iload_2
    //   587: ifeq -> 564
    //   590: aload_3
    //   591: arraylength
    //   592: bipush #10
    //   594: if_icmplt -> 360
    //   597: getstatic burp/Ztsc.ZL : Ljava/lang/String;
    //   600: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   603: checkcast java/math/BigInteger
    //   606: invokevirtual intValue : ()I
    //   609: bipush #32
    //   611: irem
    //   612: invokestatic abs : (I)I
    //   615: invokevirtual charAt : (I)C
    //   618: getstatic burp/Zzh9.ZF : Ljava/lang/String;
    //   621: getstatic burp/Zmfw.ZS : Ljava/lang/Object;
    //   624: checkcast java/math/BigInteger
    //   627: invokevirtual intValue : ()I
    //   630: bipush #32
    //   632: irem
    //   633: invokestatic abs : (I)I
    //   636: invokevirtual charAt : (I)C
    //   639: if_icmpgt -> 746
    //   642: getstatic burp/Zktq.Zc : Ljava/lang/String;
    //   645: getstatic burp/Zzb2.ZW : Ljava/lang/Object;
    //   648: checkcast java/math/BigInteger
    //   651: invokevirtual intValue : ()I
    //   654: bipush #32
    //   656: irem
    //   657: invokestatic abs : (I)I
    //   660: invokevirtual charAt : (I)C
    //   663: getstatic burp/Zevc.ZF : Ljava/lang/String;
    //   666: getstatic burp/Zrp3.Zd : Ljava/lang/Object;
    //   669: checkcast java/math/BigInteger
    //   672: invokevirtual intValue : ()I
    //   675: bipush #32
    //   677: irem
    //   678: invokestatic abs : (I)I
    //   681: invokevirtual charAt : (I)C
    //   684: if_icmpgt -> 746
    //   687: goto -> 694
    //   690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   693: athrow
    //   694: getstatic burp/Zmfw.ZV : Ljava/lang/String;
    //   697: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
    //   700: checkcast java/math/BigInteger
    //   703: invokevirtual intValue : ()I
    //   706: bipush #32
    //   708: irem
    //   709: invokestatic abs : (I)I
    //   712: invokevirtual charAt : (I)C
    //   715: getstatic burp/Zsf4.ZA : Ljava/lang/String;
    //   718: getstatic burp/Zecm.ZJ : Ljava/lang/Object;
    //   721: checkcast java/math/BigInteger
    //   724: invokevirtual intValue : ()I
    //   727: bipush #32
    //   729: irem
    //   730: invokestatic abs : (I)I
    //   733: invokevirtual charAt : (I)C
    //   736: if_icmpgt -> 754
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: iconst_1
    //   747: goto -> 755
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: iconst_0
    //   755: ireturn
    //   756: astore_3
    //   757: new java/lang/Exception
    //   760: dup
    //   761: aload_3
    //   762: invokevirtual getMessage : ()Ljava/lang/String;
    //   765: invokespecial <init> : (Ljava/lang/String;)V
    //   768: athrow
    // Exception table:
    //   from	to	target	type
    //   4	755	756	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   597	687	690	java/lang/Throwable
    //   642	739	742	java/lang/Throwable
    //   694	750	750	java/lang/Throwable
  }
  
  static void ZH(Object paramObject) {
    Zzoc.Zg = a(14248, -4068);
    Zzoc.Zx = new BigInteger(a(14255, 31811));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlwi.ZN.charAt(Math.abs(((BigInteger)Zewq.ZO).intValue() % 32)) > Zrct.ZT.charAt(Math.abs(((BigInteger)Zlwi.Zw).intValue() % 32))) {
          try {
            Zzmw.ZB(Class.forName(a(14250, 17762)));
            if (bool)
              Zz8o.ZO(Class.forName(a(14251, 3021))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz8o.ZO(Class.forName(a(14251, 3021)));
    } catch (Throwable throwable) {}
  }
  
  static void Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÉêØýÙM¢¼èB¡ªÉ_(s.X)®<Ãû$têøÌÃ*¹"MZ¥ãHÀ4!¹®»mJVðò79·êBkLÉT±=ÈíuÏu7Áà¿Nª xæÕLaºS.£ºåSà¢±§aNöé{lbÒzÃM#kIpð£pÓ»CÆÐøôNÝç=\Ò?On%Ú>Ã^ùsÌ#\\rýMrsüúAaDÿA­´ÖÞ©©K-/oY{P :ÃÏn»«ÿT8\\nô,ÚùÓië¼Ü7%û.\á\\tbm{vÈ/d'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #28
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
    //   68: ldc '3\\fÜhf\â\\túTà0õÔ²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #124
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
    //   129: putstatic burp/Zml2.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zml2.b : [Ljava/lang/String;
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
    //   212: bipush #74
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #89
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #110
    //   239: goto -> 244
    //   242: bipush #101
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
    //   300: sipush #14254
    //   303: sipush #2968
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zml2.Zh : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #14253
    //   319: sipush #-12527
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zml2.Zo : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x37AC) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zml2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */