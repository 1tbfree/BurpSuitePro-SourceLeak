package burp;

import java.math.BigInteger;

class Zmzh extends ClassLoader {
  static Object Zk;
  
  static String Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zz75.ZX : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zeyd.Zl : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zlo2.ZM : Ljava/lang/Object;
    //   22: sipush #-15715
    //   25: sipush #-21869
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zgwq
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
    //   150: sipush #-15714
    //   153: sipush #1429
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
    //   192: sipush #-15718
    //   195: sipush #14214
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
    //   219: if_icmpge -> 348
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
    //   242: ifeq -> 334
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 334
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   270: if_acmpne -> 334
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: iconst_1
    //   283: invokevirtual setAccessible : (Z)V
    //   286: aload #6
    //   288: aconst_null
    //   289: iconst_2
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_1
    //   300: ifnonnull -> 318
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload_1
    //   311: goto -> 325
    //   314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   317: athrow
    //   318: aload_1
    //   319: checkcast [B
    //   322: invokevirtual clone : ()Ljava/lang/Object;
    //   325: aastore
    //   326: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   329: pop
    //   330: iload_2
    //   331: ifeq -> 348
    //   334: iinc #5, 1
    //   337: iload_2
    //   338: ifeq -> 215
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: sipush #-15725
    //   351: sipush #17434
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: iconst_1
    //   358: ldc burp/Zrdo
    //   360: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   363: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   366: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   369: astore_3
    //   370: aload_3
    //   371: arraylength
    //   372: istore #4
    //   374: iconst_0
    //   375: istore #5
    //   377: iload #5
    //   379: iload #4
    //   381: if_icmpge -> 518
    //   384: aload_3
    //   385: iload #5
    //   387: aaload
    //   388: astore #6
    //   390: aload #6
    //   392: invokevirtual getModifiers : ()I
    //   395: invokestatic isStatic : (I)Z
    //   398: ifne -> 408
    //   401: goto -> 511
    //   404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   407: athrow
    //   408: aload #6
    //   410: invokevirtual getType : ()Ljava/lang/Class;
    //   413: astore #7
    //   415: aload #7
    //   417: ifnull -> 498
    //   420: aload #7
    //   422: invokevirtual isPrimitive : ()Z
    //   425: ifne -> 498
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   434: athrow
    //   435: aload #7
    //   437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   440: ifnull -> 498
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: invokevirtual getName : ()Ljava/lang/String;
    //   458: ifnull -> 498
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   467: athrow
    //   468: aload #7
    //   470: invokevirtual getPackage : ()Ljava/lang/Package;
    //   473: invokevirtual getName : ()Ljava/lang/String;
    //   476: sipush #-15719
    //   479: sipush #-29670
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   488: ifne -> 498
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   497: athrow
    //   498: aload #6
    //   500: iconst_1
    //   501: invokevirtual setAccessible : (Z)V
    //   504: aload #6
    //   506: aconst_null
    //   507: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   510: pop
    //   511: iinc #5, 1
    //   514: iload_2
    //   515: ifeq -> 377
    //   518: sipush #-15728
    //   521: sipush #7942
    //   524: invokestatic a : (II)Ljava/lang/String;
    //   527: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   530: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   533: astore_3
    //   534: aload_3
    //   535: arraylength
    //   536: istore #4
    //   538: iconst_0
    //   539: istore #5
    //   541: iload #5
    //   543: iload #4
    //   545: if_icmpge -> 677
    //   548: aload_3
    //   549: iload #5
    //   551: aaload
    //   552: astore #6
    //   554: aload #6
    //   556: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   559: pop
    //   560: aload #6
    //   562: invokevirtual getModifiers : ()I
    //   565: invokestatic isStatic : (I)Z
    //   568: ifeq -> 663
    //   571: aload #6
    //   573: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   576: arraylength
    //   577: iconst_2
    //   578: if_icmpne -> 663
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload #6
    //   590: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   593: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   599: ifeq -> 663
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: aload #6
    //   611: iconst_1
    //   612: invokevirtual setAccessible : (Z)V
    //   615: aload #6
    //   617: aconst_null
    //   618: iconst_2
    //   619: anewarray java/lang/Object
    //   622: dup
    //   623: iconst_0
    //   624: aload_0
    //   625: aastore
    //   626: dup
    //   627: iconst_1
    //   628: aload_1
    //   629: ifnonnull -> 647
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: aload_1
    //   640: goto -> 654
    //   643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   646: athrow
    //   647: aload_1
    //   648: checkcast [B
    //   651: invokevirtual clone : ()Ljava/lang/Object;
    //   654: aastore
    //   655: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   658: pop
    //   659: iload_2
    //   660: ifeq -> 677
    //   663: iinc #5, 1
    //   666: iload_2
    //   667: ifeq -> 541
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: getstatic burp/Zrvb.ZU : Ljava/lang/String;
    //   680: getstatic burp/Zzy5.ZG : Ljava/lang/Object;
    //   683: checkcast java/math/BigInteger
    //   686: invokevirtual intValue : ()I
    //   689: bipush #32
    //   691: irem
    //   692: invokestatic abs : (I)I
    //   695: invokevirtual charAt : (I)C
    //   698: getstatic burp/Zzc7.ZN : Ljava/lang/String;
    //   701: getstatic burp/Ze3t.Zp : Ljava/lang/Object;
    //   704: checkcast java/math/BigInteger
    //   707: invokevirtual intValue : ()I
    //   710: bipush #32
    //   712: irem
    //   713: invokestatic abs : (I)I
    //   716: invokevirtual charAt : (I)C
    //   719: if_icmple -> 826
    //   722: getstatic burp/Zvof.ZR : Ljava/lang/String;
    //   725: getstatic burp/Zxn7.ZU : Ljava/lang/Object;
    //   728: checkcast java/math/BigInteger
    //   731: invokevirtual intValue : ()I
    //   734: bipush #32
    //   736: irem
    //   737: invokestatic abs : (I)I
    //   740: invokevirtual charAt : (I)C
    //   743: getstatic burp/Zrfh.ZH : Ljava/lang/String;
    //   746: getstatic burp/Zebj.Zf : Ljava/lang/Object;
    //   749: checkcast java/math/BigInteger
    //   752: invokevirtual intValue : ()I
    //   755: bipush #32
    //   757: irem
    //   758: invokestatic abs : (I)I
    //   761: invokevirtual charAt : (I)C
    //   764: if_icmple -> 826
    //   767: goto -> 774
    //   770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   773: athrow
    //   774: getstatic burp/Zmhx.ZD : Ljava/lang/String;
    //   777: getstatic burp/Zgvf.Zd : Ljava/lang/Object;
    //   780: checkcast java/math/BigInteger
    //   783: invokevirtual intValue : ()I
    //   786: bipush #32
    //   788: irem
    //   789: invokestatic abs : (I)I
    //   792: invokevirtual charAt : (I)C
    //   795: getstatic burp/Zkgp.ZM : Ljava/lang/String;
    //   798: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
    //   801: checkcast java/math/BigInteger
    //   804: invokevirtual intValue : ()I
    //   807: bipush #32
    //   809: irem
    //   810: invokestatic abs : (I)I
    //   813: invokevirtual charAt : (I)C
    //   816: if_icmpgt -> 834
    //   819: goto -> 826
    //   822: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   825: athrow
    //   826: iconst_1
    //   827: goto -> 835
    //   830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   833: athrow
    //   834: iconst_0
    //   835: ireturn
    //   836: astore_3
    //   837: new java/lang/Exception
    //   840: dup
    //   841: aload_3
    //   842: invokevirtual getMessage : ()Ljava/lang/String;
    //   845: invokespecial <init> : (Ljava/lang/String;)V
    //   848: athrow
    // Exception table:
    //   from	to	target	type
    //   4	835	836	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	273	276	java/lang/Throwable
    //   262	303	306	java/lang/Throwable
    //   280	314	314	java/lang/Throwable
    //   325	341	344	java/lang/Throwable
    //   390	404	404	java/lang/Throwable
    //   415	428	431	java/lang/Throwable
    //   420	443	446	java/lang/Throwable
    //   435	461	464	java/lang/Throwable
    //   450	491	494	java/lang/Throwable
    //   554	581	584	java/lang/Throwable
    //   571	602	605	java/lang/Throwable
    //   588	632	635	java/lang/Throwable
    //   609	643	643	java/lang/Throwable
    //   654	670	673	java/lang/Throwable
    //   677	767	770	java/lang/Throwable
    //   722	819	822	java/lang/Throwable
    //   774	830	830	java/lang/Throwable
  }
  
  static void ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZB(Object paramObject) {
    Zejj.ZQ = a(-15716, 23490);
    Zejj.Zy = new BigInteger(a(-15717, 23751));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlav.ZW.charAt(Math.abs(((BigInteger)Zr9b.ZF).intValue() % 32)) > Zb2k.Zu.charAt(Math.abs(((BigInteger)Zx_s.ZX).intValue() % 32))) {
          try {
            Zsdn.Zx(Class.forName(a(-15726, 28103)));
            if (bool)
              Zrhu.Zz(Class.forName(a(-15713, 23618))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrhu.Zz(Class.forName(a(-15713, 23618)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÃXsHJNÏM%â´&ºJÂï ÞZ¼¬¾\\t%ÁWòù=¨n +\\råXº´MTKÑBivMMNt¡®ä~\\b`5Óìóá(\êË -\\rdä6QËÞåç8\\b<ßvõçuÍ+Á'éØ&cx/\\t$J\\n¤ÄL P¥4u(¿ð§WÀ{Í·Ød1þqà\\nb^dT¬\\tFéÞ2=Í"\\t+(&æ=uß\\tØîáÓÈÈ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
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
    //   68: ldc 'Ç¤HlQuq×MÆYUÞb¦Ð®¯9Ì[£á"þ²þAÚ¿¬rSAÝ#ÂÓTxýµö¥«r®ÆÙLw±Öð6Df\.dïÆÅ_l¿ý '
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zmzh.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmzh.b : [Ljava/lang/String;
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
    //   212: bipush #98
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #39
    //   224: goto -> 244
    //   227: bipush #115
    //   229: goto -> 244
    //   232: bipush #41
    //   234: goto -> 244
    //   237: bipush #53
    //   239: goto -> 244
    //   242: bipush #127
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #-15727
    //   307: sipush #22032
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zmzh.Zk : Ljava/lang/Object;
    //   319: sipush #-15720
    //   322: sipush #-20642
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zmzh.Zm : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC29A) & 0xFFFF;
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
      char c = '¡';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */