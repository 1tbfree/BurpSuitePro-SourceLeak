package burp;

import java.math.BigInteger;

class Zkbf extends ClassLoader {
  static String Zv;
  
  static Object Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZH(Object paramObject) {
    Zxfu.Zo = a(7713, 28456);
    Zxfu.ZA = new BigInteger(a(7714, 17093));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlhm.Zx.charAt(Math.abs(((BigInteger)Zgw0.ZM).intValue() % 32)) <= Zbsr.Zq.charAt(Math.abs(((BigInteger)Zlhm.ZT).intValue() % 32))) {
          try {
            Zexu.Zk(Class.forName(a(7719, -21809)));
            if (!bool)
              Zb8v.ZL(Class.forName(a(7716, 13017))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb8v.ZL(Class.forName(a(7716, 13017)));
    } catch (Throwable throwable) {}
  }
  
  static void Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zod.ZP : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zxk9.ZI : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zshq.ZK : Ljava/lang/Object;
    //   22: sipush #7717
    //   25: getstatic burp/Zl_u.ZR : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zzk9.ZK : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Ztuj.Ze : Ljava/lang/Object;
    //   43: sipush #31065
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zmji
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
    //   73: if_icmpge -> 209
    //   76: aload_3
    //   77: iload #5
    //   79: aaload
    //   80: astore #6
    //   82: aload #6
    //   84: invokevirtual getModifiers : ()I
    //   87: invokestatic isStatic : (I)Z
    //   90: ifne -> 100
    //   93: goto -> 202
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: aload #6
    //   102: invokevirtual getType : ()Ljava/lang/Class;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 189
    //   112: aload #7
    //   114: invokevirtual isPrimitive : ()Z
    //   117: ifne -> 189
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #7
    //   129: invokevirtual getPackage : ()Ljava/lang/Package;
    //   132: ifnull -> 189
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: ifnull -> 189
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: sipush #7715
    //   171: bipush #85
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   179: ifne -> 189
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   188: athrow
    //   189: aload #6
    //   191: iconst_1
    //   192: invokevirtual setAccessible : (Z)V
    //   195: aload #6
    //   197: aconst_null
    //   198: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: iinc #5, 1
    //   205: iload_2
    //   206: ifeq -> 69
    //   209: sipush #7712
    //   212: sipush #19017
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   221: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   224: astore_3
    //   225: aload_3
    //   226: arraylength
    //   227: istore #4
    //   229: iconst_0
    //   230: istore #5
    //   232: iload #5
    //   234: iload #4
    //   236: if_icmpge -> 368
    //   239: aload_3
    //   240: iload #5
    //   242: aaload
    //   243: astore #6
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: pop
    //   251: aload #6
    //   253: invokevirtual getModifiers : ()I
    //   256: invokestatic isStatic : (I)Z
    //   259: ifeq -> 354
    //   262: aload #6
    //   264: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   267: arraylength
    //   268: iconst_2
    //   269: if_icmpne -> 354
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload #6
    //   281: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   284: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   287: invokevirtual equals : (Ljava/lang/Object;)Z
    //   290: ifeq -> 354
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   299: athrow
    //   300: aload #6
    //   302: iconst_1
    //   303: invokevirtual setAccessible : (Z)V
    //   306: aload #6
    //   308: aconst_null
    //   309: iconst_2
    //   310: anewarray java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload_0
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: aload_1
    //   320: ifnonnull -> 338
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: aload_1
    //   331: goto -> 345
    //   334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   337: athrow
    //   338: aload_1
    //   339: checkcast [B
    //   342: invokevirtual clone : ()Ljava/lang/Object;
    //   345: aastore
    //   346: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   349: pop
    //   350: iload_2
    //   351: ifeq -> 368
    //   354: iinc #5, 1
    //   357: iload_2
    //   358: ifeq -> 232
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   367: athrow
    //   368: getstatic burp/Zz1k.ZC : Ljava/lang/String;
    //   371: getstatic burp/Zk9s.ZY : Ljava/lang/Object;
    //   374: checkcast java/math/BigInteger
    //   377: invokevirtual intValue : ()I
    //   380: bipush #32
    //   382: irem
    //   383: invokestatic abs : (I)I
    //   386: invokevirtual charAt : (I)C
    //   389: getstatic burp/Zzqj.Zk : Ljava/lang/String;
    //   392: getstatic burp/Zxo6.Zw : Ljava/lang/Object;
    //   395: checkcast java/math/BigInteger
    //   398: invokevirtual intValue : ()I
    //   401: bipush #32
    //   403: irem
    //   404: invokestatic abs : (I)I
    //   407: invokevirtual charAt : (I)C
    //   410: if_icmpgt -> 525
    //   413: getstatic burp/Zr8h.Zk : Ljava/lang/String;
    //   416: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   419: checkcast java/math/BigInteger
    //   422: invokevirtual intValue : ()I
    //   425: bipush #32
    //   427: irem
    //   428: invokestatic abs : (I)I
    //   431: invokevirtual charAt : (I)C
    //   434: getstatic burp/Ztbf.Zf : Ljava/lang/String;
    //   437: getstatic burp/Ze3j.Ze : Ljava/lang/Object;
    //   440: checkcast java/math/BigInteger
    //   443: invokevirtual intValue : ()I
    //   446: bipush #32
    //   448: irem
    //   449: invokestatic abs : (I)I
    //   452: invokevirtual charAt : (I)C
    //   455: if_icmple -> 525
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   464: athrow
    //   465: getstatic burp/Ze7q.ZW : Ljava/lang/String;
    //   468: getstatic burp/Zkbm.Zp : Ljava/lang/Object;
    //   471: checkcast java/math/BigInteger
    //   474: invokevirtual intValue : ()I
    //   477: bipush #32
    //   479: irem
    //   480: invokestatic abs : (I)I
    //   483: invokevirtual charAt : (I)C
    //   486: getstatic burp/Zlos.Zp : Ljava/lang/String;
    //   489: getstatic burp/Zkyc.ZD : Ljava/lang/Object;
    //   492: checkcast java/math/BigInteger
    //   495: invokevirtual intValue : ()I
    //   498: bipush #32
    //   500: irem
    //   501: invokestatic abs : (I)I
    //   504: invokevirtual charAt : (I)C
    //   507: if_icmpgt -> 525
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   516: athrow
    //   517: iconst_1
    //   518: goto -> 526
    //   521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   524: athrow
    //   525: iconst_0
    //   526: ireturn
    //   527: astore_3
    //   528: new java/lang/Exception
    //   531: dup
    //   532: aload_3
    //   533: invokevirtual getMessage : ()Ljava/lang/String;
    //   536: invokespecial <init> : (Ljava/lang/String;)V
    //   539: athrow
    // Exception table:
    //   from	to	target	type
    //   4	526	527	java/lang/Throwable
    //   82	96	96	java/lang/Throwable
    //   107	120	123	java/lang/Throwable
    //   112	135	138	java/lang/Throwable
    //   127	153	156	java/lang/Throwable
    //   142	182	185	java/lang/Throwable
    //   245	272	275	java/lang/Throwable
    //   262	293	296	java/lang/Throwable
    //   279	323	326	java/lang/Throwable
    //   300	334	334	java/lang/Throwable
    //   345	361	364	java/lang/Throwable
    //   368	458	461	java/lang/Throwable
    //   413	510	513	java/lang/Throwable
    //   465	521	521	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '&ìåIg¬öªðqÂª?r2ÄTâ< ©EÒÆpÚ!L.Ãê¤õuS¦¦ööÏ7àD}TL<jåíî F\\nÔâ6\\t©Ó»&# c>UiGO¥fOLRú°©r¾f¸{áÕº r®Ï.=eø#½®DÂqö=ÄñTSck@%$h\\tØÖ¸vðïÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #76
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #112
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
    //   68: ldc 'MÝ´©Ïª\Ó\\t\\t@cûóÉ¤Ó'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #109
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
    //   129: putstatic burp/Zkbf.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zkbf.b : [Ljava/lang/String;
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
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #11
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #24
    //   229: goto -> 244
    //   232: bipush #103
    //   234: goto -> 244
    //   237: bipush #120
    //   239: goto -> 244
    //   242: bipush #20
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
    //   300: sipush #7718
    //   303: sipush #-607
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zkbf.Zv : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #113
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #122
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-42
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-12
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #14
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-73
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #44
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #58
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-114
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #117
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #102
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #29
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-18
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-99
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-14
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: iconst_3
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-126
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-59
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-74
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #105
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #115
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #106
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-22
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-110
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #95
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-126
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #50
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #115
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-46
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-8
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #46
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #100
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zkbf.Zx : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1E22) & 0xFFFF;
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
      byte b1 = 7;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */