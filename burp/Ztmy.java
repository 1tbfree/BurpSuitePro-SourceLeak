package burp;

import java.math.BigInteger;

class Ztmy extends ClassLoader {
  static String ZF;
  
  static Object ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #-21260
    //   7: sipush #-9360
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZY : (Ljava/lang/Object;)V
    //   19: sipush #-21254
    //   22: getstatic burp/Zram.ZF : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Ze0w.ZU : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   40: sipush #-28220
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: iconst_1
    //   47: ldc burp/Zgnp
    //   49: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   52: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   55: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   58: astore_3
    //   59: aload_3
    //   60: arraylength
    //   61: istore #4
    //   63: iconst_0
    //   64: istore #5
    //   66: iload #5
    //   68: iload #4
    //   70: if_icmpge -> 207
    //   73: aload_3
    //   74: iload #5
    //   76: aaload
    //   77: astore #6
    //   79: aload #6
    //   81: invokevirtual getModifiers : ()I
    //   84: invokestatic isStatic : (I)Z
    //   87: ifne -> 97
    //   90: goto -> 200
    //   93: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   96: athrow
    //   97: aload #6
    //   99: invokevirtual getType : ()Ljava/lang/Class;
    //   102: astore #7
    //   104: aload #7
    //   106: ifnull -> 187
    //   109: aload #7
    //   111: invokevirtual isPrimitive : ()Z
    //   114: ifne -> 187
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: ifnull -> 187
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: athrow
    //   139: aload #7
    //   141: invokevirtual getPackage : ()Ljava/lang/Package;
    //   144: invokevirtual getName : ()Ljava/lang/String;
    //   147: ifnull -> 187
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   156: athrow
    //   157: aload #7
    //   159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   162: invokevirtual getName : ()Ljava/lang/String;
    //   165: sipush #-21263
    //   168: sipush #1290
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   177: ifne -> 187
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   186: athrow
    //   187: aload #6
    //   189: iconst_1
    //   190: invokevirtual setAccessible : (Z)V
    //   193: aload #6
    //   195: aconst_null
    //   196: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: iinc #5, 1
    //   203: iload_2
    //   204: ifne -> 66
    //   207: sipush #-21278
    //   210: sipush #-9878
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   219: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   222: astore_3
    //   223: aload_3
    //   224: arraylength
    //   225: istore #4
    //   227: iconst_0
    //   228: istore #5
    //   230: iload #5
    //   232: iload #4
    //   234: if_icmpge -> 366
    //   237: aload_3
    //   238: iload #5
    //   240: aaload
    //   241: astore #6
    //   243: aload #6
    //   245: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   248: pop
    //   249: aload #6
    //   251: invokevirtual getModifiers : ()I
    //   254: invokestatic isStatic : (I)Z
    //   257: ifeq -> 352
    //   260: aload #6
    //   262: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   265: arraylength
    //   266: iconst_2
    //   267: if_icmpne -> 352
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   276: athrow
    //   277: aload #6
    //   279: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   282: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   288: ifeq -> 352
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: iconst_1
    //   301: invokevirtual setAccessible : (Z)V
    //   304: aload #6
    //   306: aconst_null
    //   307: iconst_2
    //   308: anewarray java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_0
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: aload_1
    //   318: ifnonnull -> 336
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload_1
    //   329: goto -> 343
    //   332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   335: athrow
    //   336: aload_1
    //   337: checkcast [B
    //   340: invokevirtual clone : ()Ljava/lang/Object;
    //   343: aastore
    //   344: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   347: pop
    //   348: iload_2
    //   349: ifne -> 366
    //   352: iinc #5, 1
    //   355: iload_2
    //   356: ifne -> 230
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: getstatic burp/Zbqo.Zb : Ljava/lang/Object;
    //   369: checkcast java/math/BigInteger
    //   372: invokevirtual toByteArray : ()[B
    //   375: astore_3
    //   376: aload_3
    //   377: arraylength
    //   378: bipush #8
    //   380: iadd
    //   381: bipush #6
    //   383: ishr
    //   384: iconst_1
    //   385: iadd
    //   386: bipush #16
    //   388: imul
    //   389: newarray int
    //   391: astore #5
    //   393: iconst_0
    //   394: istore #6
    //   396: iload #6
    //   398: aload_3
    //   399: arraylength
    //   400: if_icmpge -> 443
    //   403: aload_3
    //   404: iload #6
    //   406: baload
    //   407: sipush #255
    //   410: iand
    //   411: istore #7
    //   413: aload #5
    //   415: iload #6
    //   417: iconst_2
    //   418: ishr
    //   419: dup2
    //   420: iaload
    //   421: iload #7
    //   423: bipush #24
    //   425: iload #6
    //   427: iconst_4
    //   428: irem
    //   429: bipush #8
    //   431: imul
    //   432: isub
    //   433: ishl
    //   434: ior
    //   435: iastore
    //   436: iinc #6, 1
    //   439: iload_2
    //   440: ifne -> 396
    //   443: aload #5
    //   445: iload #6
    //   447: iconst_2
    //   448: ishr
    //   449: dup2
    //   450: iaload
    //   451: sipush #128
    //   454: bipush #24
    //   456: iload #6
    //   458: iconst_4
    //   459: irem
    //   460: bipush #8
    //   462: imul
    //   463: isub
    //   464: ishl
    //   465: ior
    //   466: iastore
    //   467: aload #5
    //   469: aload #5
    //   471: arraylength
    //   472: iconst_1
    //   473: isub
    //   474: aload_3
    //   475: arraylength
    //   476: bipush #8
    //   478: imul
    //   479: iastore
    //   480: bipush #80
    //   482: newarray int
    //   484: astore #7
    //   486: ldc 1732584193
    //   488: istore #8
    //   490: ldc -271733879
    //   492: istore #9
    //   494: ldc -1732584194
    //   496: istore #10
    //   498: ldc 271733878
    //   500: istore #11
    //   502: ldc -1009589776
    //   504: istore #12
    //   506: iconst_0
    //   507: istore #6
    //   509: iload #6
    //   511: aload #5
    //   513: arraylength
    //   514: if_icmpge -> 836
    //   517: iload #8
    //   519: istore #13
    //   521: iload #9
    //   523: istore #14
    //   525: iload #10
    //   527: istore #15
    //   529: iload #11
    //   531: istore #16
    //   533: iload #12
    //   535: istore #17
    //   537: iconst_0
    //   538: istore #18
    //   540: iload #18
    //   542: bipush #80
    //   544: if_icmpge -> 794
    //   547: iload #18
    //   549: bipush #16
    //   551: if_icmpge -> 578
    //   554: aload #7
    //   556: iload #18
    //   558: aload #5
    //   560: iload #6
    //   562: iload #18
    //   564: iadd
    //   565: iaload
    //   566: iastore
    //   567: iload_2
    //   568: ifne -> 633
    //   571: goto -> 578
    //   574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   577: athrow
    //   578: aload #7
    //   580: iload #18
    //   582: iconst_3
    //   583: isub
    //   584: iaload
    //   585: aload #7
    //   587: iload #18
    //   589: bipush #8
    //   591: isub
    //   592: iaload
    //   593: ixor
    //   594: aload #7
    //   596: iload #18
    //   598: bipush #14
    //   600: isub
    //   601: iaload
    //   602: ixor
    //   603: aload #7
    //   605: iload #18
    //   607: bipush #16
    //   609: isub
    //   610: iaload
    //   611: ixor
    //   612: istore #19
    //   614: iload #19
    //   616: iconst_1
    //   617: ishl
    //   618: iload #19
    //   620: bipush #31
    //   622: iushr
    //   623: ior
    //   624: istore #20
    //   626: aload #7
    //   628: iload #18
    //   630: iload #20
    //   632: iastore
    //   633: iload #8
    //   635: iconst_5
    //   636: ishl
    //   637: iload #8
    //   639: bipush #27
    //   641: iushr
    //   642: ior
    //   643: istore #19
    //   645: iload #19
    //   647: iload #12
    //   649: iadd
    //   650: aload #7
    //   652: iload #18
    //   654: iaload
    //   655: iadd
    //   656: iload #18
    //   658: bipush #20
    //   660: if_icmpge -> 686
    //   663: ldc 1518500249
    //   665: iload #9
    //   667: iload #10
    //   669: iand
    //   670: iload #9
    //   672: iconst_m1
    //   673: ixor
    //   674: iload #11
    //   676: iand
    //   677: ior
    //   678: iadd
    //   679: goto -> 756
    //   682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   685: athrow
    //   686: iload #18
    //   688: bipush #40
    //   690: if_icmpge -> 711
    //   693: ldc 1859775393
    //   695: iload #9
    //   697: iload #10
    //   699: ixor
    //   700: iload #11
    //   702: ixor
    //   703: iadd
    //   704: goto -> 756
    //   707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   710: athrow
    //   711: iload #18
    //   713: bipush #60
    //   715: if_icmpge -> 745
    //   718: ldc -1894007588
    //   720: iload #9
    //   722: iload #10
    //   724: iand
    //   725: iload #9
    //   727: iload #11
    //   729: iand
    //   730: ior
    //   731: iload #10
    //   733: iload #11
    //   735: iand
    //   736: ior
    //   737: iadd
    //   738: goto -> 756
    //   741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   744: athrow
    //   745: ldc -899497514
    //   747: iload #9
    //   749: iload #10
    //   751: ixor
    //   752: iload #11
    //   754: ixor
    //   755: iadd
    //   756: iadd
    //   757: istore #20
    //   759: iload #11
    //   761: istore #12
    //   763: iload #10
    //   765: istore #11
    //   767: iload #9
    //   769: bipush #30
    //   771: ishl
    //   772: iload #9
    //   774: iconst_2
    //   775: iushr
    //   776: ior
    //   777: istore #10
    //   779: iload #8
    //   781: istore #9
    //   783: iload #20
    //   785: istore #8
    //   787: iinc #18, 1
    //   790: iload_2
    //   791: ifne -> 540
    //   794: iload #8
    //   796: iload #13
    //   798: iadd
    //   799: istore #8
    //   801: iload #9
    //   803: iload #14
    //   805: iadd
    //   806: istore #9
    //   808: iload #10
    //   810: iload #15
    //   812: iadd
    //   813: istore #10
    //   815: iload #11
    //   817: iload #16
    //   819: iadd
    //   820: istore #11
    //   822: iload #12
    //   824: iload #17
    //   826: iadd
    //   827: istore #12
    //   829: iinc #6, 16
    //   832: iload_2
    //   833: ifne -> 509
    //   836: iconst_5
    //   837: newarray int
    //   839: dup
    //   840: iconst_0
    //   841: iload #8
    //   843: iastore
    //   844: dup
    //   845: iconst_1
    //   846: iload #9
    //   848: iastore
    //   849: dup
    //   850: iconst_2
    //   851: iload #10
    //   853: iastore
    //   854: dup
    //   855: iconst_3
    //   856: iload #11
    //   858: iastore
    //   859: dup
    //   860: iconst_4
    //   861: iload #12
    //   863: iastore
    //   864: astore #13
    //   866: bipush #20
    //   868: newarray byte
    //   870: astore #14
    //   872: iconst_0
    //   873: istore #15
    //   875: iload #15
    //   877: bipush #20
    //   879: if_icmpge -> 920
    //   882: aload #13
    //   884: iload #15
    //   886: iconst_4
    //   887: idiv
    //   888: iaload
    //   889: istore #16
    //   891: iconst_3
    //   892: iload #15
    //   894: iconst_4
    //   895: irem
    //   896: isub
    //   897: bipush #8
    //   899: imul
    //   900: istore #17
    //   902: aload #14
    //   904: iload #15
    //   906: iload #16
    //   908: iload #17
    //   910: iushr
    //   911: i2b
    //   912: bastore
    //   913: iinc #15, 1
    //   916: iload_2
    //   917: ifne -> 875
    //   920: aload #14
    //   922: astore #4
    //   924: iconst_0
    //   925: istore_3
    //   926: getstatic burp/Zsq5.ZA : Ljava/lang/String;
    //   929: getstatic burp/Zmh5.ZN : Ljava/lang/Object;
    //   932: checkcast java/math/BigInteger
    //   935: invokevirtual intValue : ()I
    //   938: bipush #32
    //   940: irem
    //   941: invokestatic abs : (I)I
    //   944: invokevirtual charAt : (I)C
    //   947: getstatic burp/Zero.ZL : Ljava/lang/String;
    //   950: getstatic burp/Zexu.ZI : Ljava/lang/Object;
    //   953: checkcast java/math/BigInteger
    //   956: invokevirtual intValue : ()I
    //   959: bipush #32
    //   961: irem
    //   962: invokestatic abs : (I)I
    //   965: invokevirtual charAt : (I)C
    //   968: if_icmple -> 1312
    //   971: sipush #-21258
    //   974: sipush #-24230
    //   977: invokestatic a : (II)Ljava/lang/String;
    //   980: iconst_1
    //   981: ldc burp/Zlzs
    //   983: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   986: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   989: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   992: astore #4
    //   994: aload #4
    //   996: arraylength
    //   997: istore #5
    //   999: iconst_0
    //   1000: istore #6
    //   1002: iload #6
    //   1004: iload #5
    //   1006: if_icmpge -> 1144
    //   1009: aload #4
    //   1011: iload #6
    //   1013: aaload
    //   1014: astore #7
    //   1016: aload #7
    //   1018: invokevirtual getModifiers : ()I
    //   1021: invokestatic isStatic : (I)Z
    //   1024: ifne -> 1034
    //   1027: goto -> 1137
    //   1030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1033: athrow
    //   1034: aload #7
    //   1036: invokevirtual getType : ()Ljava/lang/Class;
    //   1039: astore #8
    //   1041: aload #8
    //   1043: ifnull -> 1124
    //   1046: aload #8
    //   1048: invokevirtual isPrimitive : ()Z
    //   1051: ifne -> 1124
    //   1054: goto -> 1061
    //   1057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1060: athrow
    //   1061: aload #8
    //   1063: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1066: ifnull -> 1124
    //   1069: goto -> 1076
    //   1072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1075: athrow
    //   1076: aload #8
    //   1078: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1081: invokevirtual getName : ()Ljava/lang/String;
    //   1084: ifnull -> 1124
    //   1087: goto -> 1094
    //   1090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1093: athrow
    //   1094: aload #8
    //   1096: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1099: invokevirtual getName : ()Ljava/lang/String;
    //   1102: sipush #-21259
    //   1105: sipush #17611
    //   1108: invokestatic a : (II)Ljava/lang/String;
    //   1111: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1114: ifne -> 1124
    //   1117: goto -> 1124
    //   1120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1123: athrow
    //   1124: aload #7
    //   1126: iconst_1
    //   1127: invokevirtual setAccessible : (Z)V
    //   1130: aload #7
    //   1132: aconst_null
    //   1133: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1136: pop
    //   1137: iinc #6, 1
    //   1140: iload_2
    //   1141: ifne -> 1002
    //   1144: sipush #-21273
    //   1147: sipush #-8780
    //   1150: invokestatic a : (II)Ljava/lang/String;
    //   1153: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1156: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1159: astore #4
    //   1161: aload #4
    //   1163: arraylength
    //   1164: istore #5
    //   1166: iconst_0
    //   1167: istore #6
    //   1169: iload #6
    //   1171: iload #5
    //   1173: if_icmpge -> 1309
    //   1176: aload #4
    //   1178: iload #6
    //   1180: aaload
    //   1181: astore #7
    //   1183: aload #7
    //   1185: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1188: pop
    //   1189: aload #7
    //   1191: invokevirtual getModifiers : ()I
    //   1194: invokestatic isStatic : (I)Z
    //   1197: ifeq -> 1295
    //   1200: aload #7
    //   1202: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1205: arraylength
    //   1206: iconst_2
    //   1207: if_icmpne -> 1295
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1216: athrow
    //   1217: aload #7
    //   1219: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1222: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1225: if_acmpne -> 1295
    //   1228: goto -> 1235
    //   1231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1234: athrow
    //   1235: aload #7
    //   1237: iconst_1
    //   1238: invokevirtual setAccessible : (Z)V
    //   1241: aload #7
    //   1243: aconst_null
    //   1244: iconst_2
    //   1245: anewarray java/lang/Object
    //   1248: dup
    //   1249: iconst_0
    //   1250: aload_0
    //   1251: aastore
    //   1252: dup
    //   1253: iconst_1
    //   1254: aload_1
    //   1255: ifnonnull -> 1273
    //   1258: goto -> 1265
    //   1261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1264: athrow
    //   1265: aload_1
    //   1266: goto -> 1280
    //   1269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1272: athrow
    //   1273: aload_1
    //   1274: checkcast [B
    //   1277: invokevirtual clone : ()Ljava/lang/Object;
    //   1280: aastore
    //   1281: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1284: checkcast java/lang/Boolean
    //   1287: invokevirtual booleanValue : ()Z
    //   1290: istore_3
    //   1291: iload_2
    //   1292: ifne -> 1309
    //   1295: iinc #6, 1
    //   1298: iload_2
    //   1299: ifne -> 1169
    //   1302: goto -> 1309
    //   1305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1308: athrow
    //   1309: goto -> 1650
    //   1312: sipush #-21255
    //   1315: sipush #17332
    //   1318: invokestatic a : (II)Ljava/lang/String;
    //   1321: iconst_1
    //   1322: ldc burp/Zkbf
    //   1324: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1327: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1330: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1333: astore #4
    //   1335: aload #4
    //   1337: arraylength
    //   1338: istore #5
    //   1340: iconst_0
    //   1341: istore #6
    //   1343: iload #6
    //   1345: iload #5
    //   1347: if_icmpge -> 1485
    //   1350: aload #4
    //   1352: iload #6
    //   1354: aaload
    //   1355: astore #7
    //   1357: aload #7
    //   1359: invokevirtual getModifiers : ()I
    //   1362: invokestatic isStatic : (I)Z
    //   1365: ifne -> 1375
    //   1368: goto -> 1478
    //   1371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1374: athrow
    //   1375: aload #7
    //   1377: invokevirtual getType : ()Ljava/lang/Class;
    //   1380: astore #8
    //   1382: aload #8
    //   1384: ifnull -> 1465
    //   1387: aload #8
    //   1389: invokevirtual isPrimitive : ()Z
    //   1392: ifne -> 1465
    //   1395: goto -> 1402
    //   1398: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1401: athrow
    //   1402: aload #8
    //   1404: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1407: ifnull -> 1465
    //   1410: goto -> 1417
    //   1413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1416: athrow
    //   1417: aload #8
    //   1419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1422: invokevirtual getName : ()Ljava/lang/String;
    //   1425: ifnull -> 1465
    //   1428: goto -> 1435
    //   1431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1434: athrow
    //   1435: aload #8
    //   1437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1440: invokevirtual getName : ()Ljava/lang/String;
    //   1443: sipush #-21259
    //   1446: sipush #17611
    //   1449: invokestatic a : (II)Ljava/lang/String;
    //   1452: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1455: ifne -> 1465
    //   1458: goto -> 1465
    //   1461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1464: athrow
    //   1465: aload #7
    //   1467: iconst_1
    //   1468: invokevirtual setAccessible : (Z)V
    //   1471: aload #7
    //   1473: aconst_null
    //   1474: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1477: pop
    //   1478: iinc #6, 1
    //   1481: iload_2
    //   1482: ifne -> 1343
    //   1485: sipush #-21262
    //   1488: sipush #7355
    //   1491: invokestatic a : (II)Ljava/lang/String;
    //   1494: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1497: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1500: astore #4
    //   1502: aload #4
    //   1504: arraylength
    //   1505: istore #5
    //   1507: iconst_0
    //   1508: istore #6
    //   1510: iload #6
    //   1512: iload #5
    //   1514: if_icmpge -> 1650
    //   1517: aload #4
    //   1519: iload #6
    //   1521: aaload
    //   1522: astore #7
    //   1524: aload #7
    //   1526: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1529: pop
    //   1530: aload #7
    //   1532: invokevirtual getModifiers : ()I
    //   1535: invokestatic isStatic : (I)Z
    //   1538: ifeq -> 1636
    //   1541: aload #7
    //   1543: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1546: arraylength
    //   1547: iconst_2
    //   1548: if_icmpne -> 1636
    //   1551: goto -> 1558
    //   1554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1557: athrow
    //   1558: aload #7
    //   1560: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1563: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1566: if_acmpne -> 1636
    //   1569: goto -> 1576
    //   1572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1575: athrow
    //   1576: aload #7
    //   1578: iconst_1
    //   1579: invokevirtual setAccessible : (Z)V
    //   1582: aload #7
    //   1584: aconst_null
    //   1585: iconst_2
    //   1586: anewarray java/lang/Object
    //   1589: dup
    //   1590: iconst_0
    //   1591: aload_0
    //   1592: aastore
    //   1593: dup
    //   1594: iconst_1
    //   1595: aload_1
    //   1596: ifnonnull -> 1614
    //   1599: goto -> 1606
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: aload_1
    //   1607: goto -> 1621
    //   1610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1613: athrow
    //   1614: aload_1
    //   1615: checkcast [B
    //   1618: invokevirtual clone : ()Ljava/lang/Object;
    //   1621: aastore
    //   1622: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1625: checkcast java/lang/Boolean
    //   1628: invokevirtual booleanValue : ()Z
    //   1631: istore_3
    //   1632: iload_2
    //   1633: ifne -> 1650
    //   1636: iinc #6, 1
    //   1639: iload_2
    //   1640: ifne -> 1510
    //   1643: goto -> 1650
    //   1646: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1649: athrow
    //   1650: iload_3
    //   1651: ifeq -> 1656
    //   1654: iload_3
    //   1655: ireturn
    //   1656: getstatic burp/Zlhz.Zo : Ljava/lang/String;
    //   1659: getstatic burp/Ztev.Zr : Ljava/lang/Object;
    //   1662: checkcast java/math/BigInteger
    //   1665: invokevirtual intValue : ()I
    //   1668: bipush #32
    //   1670: irem
    //   1671: invokestatic abs : (I)I
    //   1674: invokevirtual charAt : (I)C
    //   1677: getstatic burp/Zeno.ZL : Ljava/lang/String;
    //   1680: getstatic burp/Zlp7.ZM : Ljava/lang/Object;
    //   1683: checkcast java/math/BigInteger
    //   1686: invokevirtual intValue : ()I
    //   1689: bipush #32
    //   1691: irem
    //   1692: invokestatic abs : (I)I
    //   1695: invokevirtual charAt : (I)C
    //   1698: if_icmple -> 2043
    //   1701: sipush #-21256
    //   1704: sipush #1040
    //   1707: invokestatic a : (II)Ljava/lang/String;
    //   1710: iconst_1
    //   1711: ldc burp/Zmy4
    //   1713: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1716: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1719: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1722: astore #4
    //   1724: aload #4
    //   1726: arraylength
    //   1727: istore #5
    //   1729: iconst_0
    //   1730: istore #6
    //   1732: iload #6
    //   1734: iload #5
    //   1736: if_icmpge -> 1874
    //   1739: aload #4
    //   1741: iload #6
    //   1743: aaload
    //   1744: astore #7
    //   1746: aload #7
    //   1748: invokevirtual getModifiers : ()I
    //   1751: invokestatic isStatic : (I)Z
    //   1754: ifne -> 1764
    //   1757: goto -> 1867
    //   1760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1763: athrow
    //   1764: aload #7
    //   1766: invokevirtual getType : ()Ljava/lang/Class;
    //   1769: astore #8
    //   1771: aload #8
    //   1773: ifnull -> 1854
    //   1776: aload #8
    //   1778: invokevirtual isPrimitive : ()Z
    //   1781: ifne -> 1854
    //   1784: goto -> 1791
    //   1787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1790: athrow
    //   1791: aload #8
    //   1793: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1796: ifnull -> 1854
    //   1799: goto -> 1806
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: aload #8
    //   1808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1811: invokevirtual getName : ()Ljava/lang/String;
    //   1814: ifnull -> 1854
    //   1817: goto -> 1824
    //   1820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1823: athrow
    //   1824: aload #8
    //   1826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1829: invokevirtual getName : ()Ljava/lang/String;
    //   1832: sipush #-21259
    //   1835: sipush #17611
    //   1838: invokestatic a : (II)Ljava/lang/String;
    //   1841: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1844: ifne -> 1854
    //   1847: goto -> 1854
    //   1850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1853: athrow
    //   1854: aload #7
    //   1856: iconst_1
    //   1857: invokevirtual setAccessible : (Z)V
    //   1860: aload #7
    //   1862: aconst_null
    //   1863: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1866: pop
    //   1867: iinc #6, 1
    //   1870: iload_2
    //   1871: ifne -> 1732
    //   1874: sipush #-21264
    //   1877: sipush #14186
    //   1880: invokestatic a : (II)Ljava/lang/String;
    //   1883: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1886: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1889: astore #4
    //   1891: aload #4
    //   1893: arraylength
    //   1894: istore #5
    //   1896: iconst_0
    //   1897: istore #6
    //   1899: iload #6
    //   1901: iload #5
    //   1903: if_icmpge -> 2039
    //   1906: aload #4
    //   1908: iload #6
    //   1910: aaload
    //   1911: astore #7
    //   1913: aload #7
    //   1915: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1918: pop
    //   1919: aload #7
    //   1921: invokevirtual getModifiers : ()I
    //   1924: invokestatic isStatic : (I)Z
    //   1927: ifeq -> 2025
    //   1930: aload #7
    //   1932: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1935: arraylength
    //   1936: iconst_2
    //   1937: if_icmpne -> 2025
    //   1940: goto -> 1947
    //   1943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1946: athrow
    //   1947: aload #7
    //   1949: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1952: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1955: if_acmpne -> 2025
    //   1958: goto -> 1965
    //   1961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1964: athrow
    //   1965: aload #7
    //   1967: iconst_1
    //   1968: invokevirtual setAccessible : (Z)V
    //   1971: aload #7
    //   1973: aconst_null
    //   1974: iconst_2
    //   1975: anewarray java/lang/Object
    //   1978: dup
    //   1979: iconst_0
    //   1980: aload_0
    //   1981: aastore
    //   1982: dup
    //   1983: iconst_1
    //   1984: aload_1
    //   1985: ifnonnull -> 2003
    //   1988: goto -> 1995
    //   1991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1994: athrow
    //   1995: aload_1
    //   1996: goto -> 2010
    //   1999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2002: athrow
    //   2003: aload_1
    //   2004: checkcast [B
    //   2007: invokevirtual clone : ()Ljava/lang/Object;
    //   2010: aastore
    //   2011: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2014: checkcast java/lang/Boolean
    //   2017: invokevirtual booleanValue : ()Z
    //   2020: istore_3
    //   2021: iload_2
    //   2022: ifne -> 2039
    //   2025: iinc #6, 1
    //   2028: iload_2
    //   2029: ifne -> 1899
    //   2032: goto -> 2039
    //   2035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2038: athrow
    //   2039: iload_2
    //   2040: ifne -> 2381
    //   2043: sipush #-21279
    //   2046: sipush #-29709
    //   2049: invokestatic a : (II)Ljava/lang/String;
    //   2052: iconst_1
    //   2053: ldc burp/Zl4v
    //   2055: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2058: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2061: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2064: astore #4
    //   2066: aload #4
    //   2068: arraylength
    //   2069: istore #5
    //   2071: iconst_0
    //   2072: istore #6
    //   2074: iload #6
    //   2076: iload #5
    //   2078: if_icmpge -> 2216
    //   2081: aload #4
    //   2083: iload #6
    //   2085: aaload
    //   2086: astore #7
    //   2088: aload #7
    //   2090: invokevirtual getModifiers : ()I
    //   2093: invokestatic isStatic : (I)Z
    //   2096: ifne -> 2106
    //   2099: goto -> 2209
    //   2102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2105: athrow
    //   2106: aload #7
    //   2108: invokevirtual getType : ()Ljava/lang/Class;
    //   2111: astore #8
    //   2113: aload #8
    //   2115: ifnull -> 2196
    //   2118: aload #8
    //   2120: invokevirtual isPrimitive : ()Z
    //   2123: ifne -> 2196
    //   2126: goto -> 2133
    //   2129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2132: athrow
    //   2133: aload #8
    //   2135: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2138: ifnull -> 2196
    //   2141: goto -> 2148
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: aload #8
    //   2150: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2153: invokevirtual getName : ()Ljava/lang/String;
    //   2156: ifnull -> 2196
    //   2159: goto -> 2166
    //   2162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2165: athrow
    //   2166: aload #8
    //   2168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2171: invokevirtual getName : ()Ljava/lang/String;
    //   2174: sipush #-21259
    //   2177: sipush #17611
    //   2180: invokestatic a : (II)Ljava/lang/String;
    //   2183: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2186: ifne -> 2196
    //   2189: goto -> 2196
    //   2192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2195: athrow
    //   2196: aload #7
    //   2198: iconst_1
    //   2199: invokevirtual setAccessible : (Z)V
    //   2202: aload #7
    //   2204: aconst_null
    //   2205: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2208: pop
    //   2209: iinc #6, 1
    //   2212: iload_2
    //   2213: ifne -> 2074
    //   2216: sipush #-21249
    //   2219: sipush #20500
    //   2222: invokestatic a : (II)Ljava/lang/String;
    //   2225: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2228: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2231: astore #4
    //   2233: aload #4
    //   2235: arraylength
    //   2236: istore #5
    //   2238: iconst_0
    //   2239: istore #6
    //   2241: iload #6
    //   2243: iload #5
    //   2245: if_icmpge -> 2381
    //   2248: aload #4
    //   2250: iload #6
    //   2252: aaload
    //   2253: astore #7
    //   2255: aload #7
    //   2257: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2260: pop
    //   2261: aload #7
    //   2263: invokevirtual getModifiers : ()I
    //   2266: invokestatic isStatic : (I)Z
    //   2269: ifeq -> 2367
    //   2272: aload #7
    //   2274: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2277: arraylength
    //   2278: iconst_2
    //   2279: if_icmpne -> 2367
    //   2282: goto -> 2289
    //   2285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2288: athrow
    //   2289: aload #7
    //   2291: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2294: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2297: if_acmpne -> 2367
    //   2300: goto -> 2307
    //   2303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2306: athrow
    //   2307: aload #7
    //   2309: iconst_1
    //   2310: invokevirtual setAccessible : (Z)V
    //   2313: aload #7
    //   2315: aconst_null
    //   2316: iconst_2
    //   2317: anewarray java/lang/Object
    //   2320: dup
    //   2321: iconst_0
    //   2322: aload_0
    //   2323: aastore
    //   2324: dup
    //   2325: iconst_1
    //   2326: aload_1
    //   2327: ifnonnull -> 2345
    //   2330: goto -> 2337
    //   2333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2336: athrow
    //   2337: aload_1
    //   2338: goto -> 2352
    //   2341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2344: athrow
    //   2345: aload_1
    //   2346: checkcast [B
    //   2349: invokevirtual clone : ()Ljava/lang/Object;
    //   2352: aastore
    //   2353: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2356: checkcast java/lang/Boolean
    //   2359: invokevirtual booleanValue : ()Z
    //   2362: istore_3
    //   2363: iload_2
    //   2364: ifne -> 2381
    //   2367: iinc #6, 1
    //   2370: iload_2
    //   2371: ifne -> 2241
    //   2374: goto -> 2381
    //   2377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2380: athrow
    //   2381: iload_3
    //   2382: ifeq -> 2387
    //   2385: iload_3
    //   2386: ireturn
    //   2387: getstatic burp/Zezn.Ze : Ljava/lang/String;
    //   2390: getstatic burp/Zl7k.ZS : Ljava/lang/Object;
    //   2393: checkcast java/math/BigInteger
    //   2396: invokevirtual intValue : ()I
    //   2399: bipush #32
    //   2401: irem
    //   2402: invokestatic abs : (I)I
    //   2405: invokevirtual charAt : (I)C
    //   2408: getstatic burp/Zrpx.ZM : Ljava/lang/String;
    //   2411: getstatic burp/Zlp7.ZM : Ljava/lang/Object;
    //   2414: checkcast java/math/BigInteger
    //   2417: invokevirtual intValue : ()I
    //   2420: bipush #32
    //   2422: irem
    //   2423: invokestatic abs : (I)I
    //   2426: invokevirtual charAt : (I)C
    //   2429: if_icmpgt -> 2774
    //   2432: sipush #-21261
    //   2435: sipush #23372
    //   2438: invokestatic a : (II)Ljava/lang/String;
    //   2441: iconst_1
    //   2442: ldc burp/Ze3j
    //   2444: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2447: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2450: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2453: astore #4
    //   2455: aload #4
    //   2457: arraylength
    //   2458: istore #5
    //   2460: iconst_0
    //   2461: istore #6
    //   2463: iload #6
    //   2465: iload #5
    //   2467: if_icmpge -> 2605
    //   2470: aload #4
    //   2472: iload #6
    //   2474: aaload
    //   2475: astore #7
    //   2477: aload #7
    //   2479: invokevirtual getModifiers : ()I
    //   2482: invokestatic isStatic : (I)Z
    //   2485: ifne -> 2495
    //   2488: goto -> 2598
    //   2491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2494: athrow
    //   2495: aload #7
    //   2497: invokevirtual getType : ()Ljava/lang/Class;
    //   2500: astore #8
    //   2502: aload #8
    //   2504: ifnull -> 2585
    //   2507: aload #8
    //   2509: invokevirtual isPrimitive : ()Z
    //   2512: ifne -> 2585
    //   2515: goto -> 2522
    //   2518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2521: athrow
    //   2522: aload #8
    //   2524: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2527: ifnull -> 2585
    //   2530: goto -> 2537
    //   2533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2536: athrow
    //   2537: aload #8
    //   2539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2542: invokevirtual getName : ()Ljava/lang/String;
    //   2545: ifnull -> 2585
    //   2548: goto -> 2555
    //   2551: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2554: athrow
    //   2555: aload #8
    //   2557: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2560: invokevirtual getName : ()Ljava/lang/String;
    //   2563: sipush #-21259
    //   2566: sipush #17611
    //   2569: invokestatic a : (II)Ljava/lang/String;
    //   2572: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2575: ifne -> 2585
    //   2578: goto -> 2585
    //   2581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2584: athrow
    //   2585: aload #7
    //   2587: iconst_1
    //   2588: invokevirtual setAccessible : (Z)V
    //   2591: aload #7
    //   2593: aconst_null
    //   2594: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2597: pop
    //   2598: iinc #6, 1
    //   2601: iload_2
    //   2602: ifne -> 2463
    //   2605: sipush #-21251
    //   2608: sipush #-10755
    //   2611: invokestatic a : (II)Ljava/lang/String;
    //   2614: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2617: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2620: astore #4
    //   2622: aload #4
    //   2624: arraylength
    //   2625: istore #5
    //   2627: iconst_0
    //   2628: istore #6
    //   2630: iload #6
    //   2632: iload #5
    //   2634: if_icmpge -> 2770
    //   2637: aload #4
    //   2639: iload #6
    //   2641: aaload
    //   2642: astore #7
    //   2644: aload #7
    //   2646: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2649: pop
    //   2650: aload #7
    //   2652: invokevirtual getModifiers : ()I
    //   2655: invokestatic isStatic : (I)Z
    //   2658: ifeq -> 2756
    //   2661: aload #7
    //   2663: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2666: arraylength
    //   2667: iconst_2
    //   2668: if_icmpne -> 2756
    //   2671: goto -> 2678
    //   2674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2677: athrow
    //   2678: aload #7
    //   2680: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2683: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2686: if_acmpne -> 2756
    //   2689: goto -> 2696
    //   2692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2695: athrow
    //   2696: aload #7
    //   2698: iconst_1
    //   2699: invokevirtual setAccessible : (Z)V
    //   2702: aload #7
    //   2704: aconst_null
    //   2705: iconst_2
    //   2706: anewarray java/lang/Object
    //   2709: dup
    //   2710: iconst_0
    //   2711: aload_0
    //   2712: aastore
    //   2713: dup
    //   2714: iconst_1
    //   2715: aload_1
    //   2716: ifnonnull -> 2734
    //   2719: goto -> 2726
    //   2722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2725: athrow
    //   2726: aload_1
    //   2727: goto -> 2741
    //   2730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2733: athrow
    //   2734: aload_1
    //   2735: checkcast [B
    //   2738: invokevirtual clone : ()Ljava/lang/Object;
    //   2741: aastore
    //   2742: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2745: checkcast java/lang/Boolean
    //   2748: invokevirtual booleanValue : ()Z
    //   2751: istore_3
    //   2752: iload_2
    //   2753: ifne -> 2770
    //   2756: iinc #6, 1
    //   2759: iload_2
    //   2760: ifne -> 2630
    //   2763: goto -> 2770
    //   2766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2769: athrow
    //   2770: iload_2
    //   2771: ifne -> 3112
    //   2774: sipush #-21275
    //   2777: sipush #16996
    //   2780: invokestatic a : (II)Ljava/lang/String;
    //   2783: iconst_1
    //   2784: ldc burp/Zl88
    //   2786: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2789: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2792: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2795: astore #4
    //   2797: aload #4
    //   2799: arraylength
    //   2800: istore #5
    //   2802: iconst_0
    //   2803: istore #6
    //   2805: iload #6
    //   2807: iload #5
    //   2809: if_icmpge -> 2947
    //   2812: aload #4
    //   2814: iload #6
    //   2816: aaload
    //   2817: astore #7
    //   2819: aload #7
    //   2821: invokevirtual getModifiers : ()I
    //   2824: invokestatic isStatic : (I)Z
    //   2827: ifne -> 2837
    //   2830: goto -> 2940
    //   2833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2836: athrow
    //   2837: aload #7
    //   2839: invokevirtual getType : ()Ljava/lang/Class;
    //   2842: astore #8
    //   2844: aload #8
    //   2846: ifnull -> 2927
    //   2849: aload #8
    //   2851: invokevirtual isPrimitive : ()Z
    //   2854: ifne -> 2927
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2863: athrow
    //   2864: aload #8
    //   2866: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2869: ifnull -> 2927
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: aload #8
    //   2881: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2884: invokevirtual getName : ()Ljava/lang/String;
    //   2887: ifnull -> 2927
    //   2890: goto -> 2897
    //   2893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2896: athrow
    //   2897: aload #8
    //   2899: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2902: invokevirtual getName : ()Ljava/lang/String;
    //   2905: sipush #-21259
    //   2908: sipush #17611
    //   2911: invokestatic a : (II)Ljava/lang/String;
    //   2914: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2917: ifne -> 2927
    //   2920: goto -> 2927
    //   2923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2926: athrow
    //   2927: aload #7
    //   2929: iconst_1
    //   2930: invokevirtual setAccessible : (Z)V
    //   2933: aload #7
    //   2935: aconst_null
    //   2936: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2939: pop
    //   2940: iinc #6, 1
    //   2943: iload_2
    //   2944: ifne -> 2805
    //   2947: sipush #-21276
    //   2950: sipush #18593
    //   2953: invokestatic a : (II)Ljava/lang/String;
    //   2956: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2959: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2962: astore #4
    //   2964: aload #4
    //   2966: arraylength
    //   2967: istore #5
    //   2969: iconst_0
    //   2970: istore #6
    //   2972: iload #6
    //   2974: iload #5
    //   2976: if_icmpge -> 3112
    //   2979: aload #4
    //   2981: iload #6
    //   2983: aaload
    //   2984: astore #7
    //   2986: aload #7
    //   2988: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2991: pop
    //   2992: aload #7
    //   2994: invokevirtual getModifiers : ()I
    //   2997: invokestatic isStatic : (I)Z
    //   3000: ifeq -> 3098
    //   3003: aload #7
    //   3005: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3008: arraylength
    //   3009: iconst_2
    //   3010: if_icmpne -> 3098
    //   3013: goto -> 3020
    //   3016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3019: athrow
    //   3020: aload #7
    //   3022: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3025: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3028: if_acmpne -> 3098
    //   3031: goto -> 3038
    //   3034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3037: athrow
    //   3038: aload #7
    //   3040: iconst_1
    //   3041: invokevirtual setAccessible : (Z)V
    //   3044: aload #7
    //   3046: aconst_null
    //   3047: iconst_2
    //   3048: anewarray java/lang/Object
    //   3051: dup
    //   3052: iconst_0
    //   3053: aload_0
    //   3054: aastore
    //   3055: dup
    //   3056: iconst_1
    //   3057: aload_1
    //   3058: ifnonnull -> 3076
    //   3061: goto -> 3068
    //   3064: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3067: athrow
    //   3068: aload_1
    //   3069: goto -> 3083
    //   3072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3075: athrow
    //   3076: aload_1
    //   3077: checkcast [B
    //   3080: invokevirtual clone : ()Ljava/lang/Object;
    //   3083: aastore
    //   3084: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3087: checkcast java/lang/Boolean
    //   3090: invokevirtual booleanValue : ()Z
    //   3093: istore_3
    //   3094: iload_2
    //   3095: ifne -> 3112
    //   3098: iinc #6, 1
    //   3101: iload_2
    //   3102: ifne -> 2972
    //   3105: goto -> 3112
    //   3108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3111: athrow
    //   3112: iload_3
    //   3113: ifeq -> 3118
    //   3116: iload_3
    //   3117: ireturn
    //   3118: getstatic burp/Zkcd.Zj : Ljava/lang/String;
    //   3121: getstatic burp/Zsun.ZP : Ljava/lang/Object;
    //   3124: checkcast java/math/BigInteger
    //   3127: invokevirtual intValue : ()I
    //   3130: bipush #32
    //   3132: irem
    //   3133: invokestatic abs : (I)I
    //   3136: invokevirtual charAt : (I)C
    //   3139: getstatic burp/Zgj5.ZH : Ljava/lang/String;
    //   3142: getstatic burp/Zdm.ZA : Ljava/lang/Object;
    //   3145: checkcast java/math/BigInteger
    //   3148: invokevirtual intValue : ()I
    //   3151: bipush #32
    //   3153: irem
    //   3154: invokestatic abs : (I)I
    //   3157: invokevirtual charAt : (I)C
    //   3160: if_icmpgt -> 3505
    //   3163: sipush #-21250
    //   3166: sipush #-32126
    //   3169: invokestatic a : (II)Ljava/lang/String;
    //   3172: iconst_1
    //   3173: ldc burp/Zlr2
    //   3175: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3178: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3181: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3184: astore #4
    //   3186: aload #4
    //   3188: arraylength
    //   3189: istore #5
    //   3191: iconst_0
    //   3192: istore #6
    //   3194: iload #6
    //   3196: iload #5
    //   3198: if_icmpge -> 3336
    //   3201: aload #4
    //   3203: iload #6
    //   3205: aaload
    //   3206: astore #7
    //   3208: aload #7
    //   3210: invokevirtual getModifiers : ()I
    //   3213: invokestatic isStatic : (I)Z
    //   3216: ifne -> 3226
    //   3219: goto -> 3329
    //   3222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3225: athrow
    //   3226: aload #7
    //   3228: invokevirtual getType : ()Ljava/lang/Class;
    //   3231: astore #8
    //   3233: aload #8
    //   3235: ifnull -> 3316
    //   3238: aload #8
    //   3240: invokevirtual isPrimitive : ()Z
    //   3243: ifne -> 3316
    //   3246: goto -> 3253
    //   3249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3252: athrow
    //   3253: aload #8
    //   3255: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3258: ifnull -> 3316
    //   3261: goto -> 3268
    //   3264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3267: athrow
    //   3268: aload #8
    //   3270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3273: invokevirtual getName : ()Ljava/lang/String;
    //   3276: ifnull -> 3316
    //   3279: goto -> 3286
    //   3282: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3285: athrow
    //   3286: aload #8
    //   3288: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3291: invokevirtual getName : ()Ljava/lang/String;
    //   3294: sipush #-21259
    //   3297: sipush #17611
    //   3300: invokestatic a : (II)Ljava/lang/String;
    //   3303: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3306: ifne -> 3316
    //   3309: goto -> 3316
    //   3312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3315: athrow
    //   3316: aload #7
    //   3318: iconst_1
    //   3319: invokevirtual setAccessible : (Z)V
    //   3322: aload #7
    //   3324: aconst_null
    //   3325: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3328: pop
    //   3329: iinc #6, 1
    //   3332: iload_2
    //   3333: ifne -> 3194
    //   3336: sipush #-21269
    //   3339: sipush #-28924
    //   3342: invokestatic a : (II)Ljava/lang/String;
    //   3345: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3348: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3351: astore #4
    //   3353: aload #4
    //   3355: arraylength
    //   3356: istore #5
    //   3358: iconst_0
    //   3359: istore #6
    //   3361: iload #6
    //   3363: iload #5
    //   3365: if_icmpge -> 3501
    //   3368: aload #4
    //   3370: iload #6
    //   3372: aaload
    //   3373: astore #7
    //   3375: aload #7
    //   3377: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3380: pop
    //   3381: aload #7
    //   3383: invokevirtual getModifiers : ()I
    //   3386: invokestatic isStatic : (I)Z
    //   3389: ifeq -> 3487
    //   3392: aload #7
    //   3394: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3397: arraylength
    //   3398: iconst_2
    //   3399: if_icmpne -> 3487
    //   3402: goto -> 3409
    //   3405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3408: athrow
    //   3409: aload #7
    //   3411: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3414: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3417: if_acmpne -> 3487
    //   3420: goto -> 3427
    //   3423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3426: athrow
    //   3427: aload #7
    //   3429: iconst_1
    //   3430: invokevirtual setAccessible : (Z)V
    //   3433: aload #7
    //   3435: aconst_null
    //   3436: iconst_2
    //   3437: anewarray java/lang/Object
    //   3440: dup
    //   3441: iconst_0
    //   3442: aload_0
    //   3443: aastore
    //   3444: dup
    //   3445: iconst_1
    //   3446: aload_1
    //   3447: ifnonnull -> 3465
    //   3450: goto -> 3457
    //   3453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3456: athrow
    //   3457: aload_1
    //   3458: goto -> 3472
    //   3461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3464: athrow
    //   3465: aload_1
    //   3466: checkcast [B
    //   3469: invokevirtual clone : ()Ljava/lang/Object;
    //   3472: aastore
    //   3473: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3476: checkcast java/lang/Boolean
    //   3479: invokevirtual booleanValue : ()Z
    //   3482: istore_3
    //   3483: iload_2
    //   3484: ifne -> 3501
    //   3487: iinc #6, 1
    //   3490: iload_2
    //   3491: ifne -> 3361
    //   3494: goto -> 3501
    //   3497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3500: athrow
    //   3501: iload_2
    //   3502: ifne -> 3843
    //   3505: sipush #-21274
    //   3508: sipush #5490
    //   3511: invokestatic a : (II)Ljava/lang/String;
    //   3514: iconst_1
    //   3515: ldc burp/Zlzs
    //   3517: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3520: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3523: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3526: astore #4
    //   3528: aload #4
    //   3530: arraylength
    //   3531: istore #5
    //   3533: iconst_0
    //   3534: istore #6
    //   3536: iload #6
    //   3538: iload #5
    //   3540: if_icmpge -> 3678
    //   3543: aload #4
    //   3545: iload #6
    //   3547: aaload
    //   3548: astore #7
    //   3550: aload #7
    //   3552: invokevirtual getModifiers : ()I
    //   3555: invokestatic isStatic : (I)Z
    //   3558: ifne -> 3568
    //   3561: goto -> 3671
    //   3564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3567: athrow
    //   3568: aload #7
    //   3570: invokevirtual getType : ()Ljava/lang/Class;
    //   3573: astore #8
    //   3575: aload #8
    //   3577: ifnull -> 3658
    //   3580: aload #8
    //   3582: invokevirtual isPrimitive : ()Z
    //   3585: ifne -> 3658
    //   3588: goto -> 3595
    //   3591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3594: athrow
    //   3595: aload #8
    //   3597: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3600: ifnull -> 3658
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: aload #8
    //   3612: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3615: invokevirtual getName : ()Ljava/lang/String;
    //   3618: ifnull -> 3658
    //   3621: goto -> 3628
    //   3624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3627: athrow
    //   3628: aload #8
    //   3630: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3633: invokevirtual getName : ()Ljava/lang/String;
    //   3636: sipush #-21259
    //   3639: sipush #17611
    //   3642: invokestatic a : (II)Ljava/lang/String;
    //   3645: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3648: ifne -> 3658
    //   3651: goto -> 3658
    //   3654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3657: athrow
    //   3658: aload #7
    //   3660: iconst_1
    //   3661: invokevirtual setAccessible : (Z)V
    //   3664: aload #7
    //   3666: aconst_null
    //   3667: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3670: pop
    //   3671: iinc #6, 1
    //   3674: iload_2
    //   3675: ifne -> 3536
    //   3678: sipush #-21270
    //   3681: sipush #-20821
    //   3684: invokestatic a : (II)Ljava/lang/String;
    //   3687: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3690: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3693: astore #4
    //   3695: aload #4
    //   3697: arraylength
    //   3698: istore #5
    //   3700: iconst_0
    //   3701: istore #6
    //   3703: iload #6
    //   3705: iload #5
    //   3707: if_icmpge -> 3843
    //   3710: aload #4
    //   3712: iload #6
    //   3714: aaload
    //   3715: astore #7
    //   3717: aload #7
    //   3719: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3722: pop
    //   3723: aload #7
    //   3725: invokevirtual getModifiers : ()I
    //   3728: invokestatic isStatic : (I)Z
    //   3731: ifeq -> 3829
    //   3734: aload #7
    //   3736: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3739: arraylength
    //   3740: iconst_2
    //   3741: if_icmpne -> 3829
    //   3744: goto -> 3751
    //   3747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3750: athrow
    //   3751: aload #7
    //   3753: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3756: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3759: if_acmpne -> 3829
    //   3762: goto -> 3769
    //   3765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3768: athrow
    //   3769: aload #7
    //   3771: iconst_1
    //   3772: invokevirtual setAccessible : (Z)V
    //   3775: aload #7
    //   3777: aconst_null
    //   3778: iconst_2
    //   3779: anewarray java/lang/Object
    //   3782: dup
    //   3783: iconst_0
    //   3784: aload_0
    //   3785: aastore
    //   3786: dup
    //   3787: iconst_1
    //   3788: aload_1
    //   3789: ifnonnull -> 3807
    //   3792: goto -> 3799
    //   3795: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3798: athrow
    //   3799: aload_1
    //   3800: goto -> 3814
    //   3803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3806: athrow
    //   3807: aload_1
    //   3808: checkcast [B
    //   3811: invokevirtual clone : ()Ljava/lang/Object;
    //   3814: aastore
    //   3815: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3818: checkcast java/lang/Boolean
    //   3821: invokevirtual booleanValue : ()Z
    //   3824: istore_3
    //   3825: iload_2
    //   3826: ifne -> 3843
    //   3829: iinc #6, 1
    //   3832: iload_2
    //   3833: ifne -> 3703
    //   3836: goto -> 3843
    //   3839: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3842: athrow
    //   3843: iload_3
    //   3844: ireturn
    //   3845: astore_3
    //   3846: new java/lang/Exception
    //   3849: dup
    //   3850: aload_3
    //   3851: invokevirtual getMessage : ()Ljava/lang/String;
    //   3854: invokespecial <init> : (Ljava/lang/String;)V
    //   3857: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1655	3845	java/lang/Throwable
    //   79	93	93	java/lang/Throwable
    //   104	117	120	java/lang/Throwable
    //   109	132	135	java/lang/Throwable
    //   124	150	153	java/lang/Throwable
    //   139	180	183	java/lang/Throwable
    //   243	270	273	java/lang/Throwable
    //   260	291	294	java/lang/Throwable
    //   277	321	324	java/lang/Throwable
    //   298	332	332	java/lang/Throwable
    //   343	359	362	java/lang/Throwable
    //   547	571	574	java/lang/Throwable
    //   645	682	682	java/lang/Throwable
    //   686	707	707	java/lang/Throwable
    //   711	741	741	java/lang/Throwable
    //   1016	1030	1030	java/lang/Throwable
    //   1041	1054	1057	java/lang/Throwable
    //   1046	1069	1072	java/lang/Throwable
    //   1061	1087	1090	java/lang/Throwable
    //   1076	1117	1120	java/lang/Throwable
    //   1183	1210	1213	java/lang/Throwable
    //   1200	1228	1231	java/lang/Throwable
    //   1217	1258	1261	java/lang/Throwable
    //   1235	1269	1269	java/lang/Throwable
    //   1291	1302	1305	java/lang/Throwable
    //   1357	1371	1371	java/lang/Throwable
    //   1382	1395	1398	java/lang/Throwable
    //   1387	1410	1413	java/lang/Throwable
    //   1402	1428	1431	java/lang/Throwable
    //   1417	1458	1461	java/lang/Throwable
    //   1524	1551	1554	java/lang/Throwable
    //   1541	1569	1572	java/lang/Throwable
    //   1558	1599	1602	java/lang/Throwable
    //   1576	1610	1610	java/lang/Throwable
    //   1632	1643	1646	java/lang/Throwable
    //   1656	2386	3845	java/lang/Throwable
    //   1746	1760	1760	java/lang/Throwable
    //   1771	1784	1787	java/lang/Throwable
    //   1776	1799	1802	java/lang/Throwable
    //   1791	1817	1820	java/lang/Throwable
    //   1806	1847	1850	java/lang/Throwable
    //   1913	1940	1943	java/lang/Throwable
    //   1930	1958	1961	java/lang/Throwable
    //   1947	1988	1991	java/lang/Throwable
    //   1965	1999	1999	java/lang/Throwable
    //   2021	2032	2035	java/lang/Throwable
    //   2088	2102	2102	java/lang/Throwable
    //   2113	2126	2129	java/lang/Throwable
    //   2118	2141	2144	java/lang/Throwable
    //   2133	2159	2162	java/lang/Throwable
    //   2148	2189	2192	java/lang/Throwable
    //   2255	2282	2285	java/lang/Throwable
    //   2272	2300	2303	java/lang/Throwable
    //   2289	2330	2333	java/lang/Throwable
    //   2307	2341	2341	java/lang/Throwable
    //   2363	2374	2377	java/lang/Throwable
    //   2387	3117	3845	java/lang/Throwable
    //   2477	2491	2491	java/lang/Throwable
    //   2502	2515	2518	java/lang/Throwable
    //   2507	2530	2533	java/lang/Throwable
    //   2522	2548	2551	java/lang/Throwable
    //   2537	2578	2581	java/lang/Throwable
    //   2644	2671	2674	java/lang/Throwable
    //   2661	2689	2692	java/lang/Throwable
    //   2678	2719	2722	java/lang/Throwable
    //   2696	2730	2730	java/lang/Throwable
    //   2752	2763	2766	java/lang/Throwable
    //   2819	2833	2833	java/lang/Throwable
    //   2844	2857	2860	java/lang/Throwable
    //   2849	2872	2875	java/lang/Throwable
    //   2864	2890	2893	java/lang/Throwable
    //   2879	2920	2923	java/lang/Throwable
    //   2986	3013	3016	java/lang/Throwable
    //   3003	3031	3034	java/lang/Throwable
    //   3020	3061	3064	java/lang/Throwable
    //   3038	3072	3072	java/lang/Throwable
    //   3094	3105	3108	java/lang/Throwable
    //   3118	3844	3845	java/lang/Throwable
    //   3208	3222	3222	java/lang/Throwable
    //   3233	3246	3249	java/lang/Throwable
    //   3238	3261	3264	java/lang/Throwable
    //   3253	3279	3282	java/lang/Throwable
    //   3268	3309	3312	java/lang/Throwable
    //   3375	3402	3405	java/lang/Throwable
    //   3392	3420	3423	java/lang/Throwable
    //   3409	3450	3453	java/lang/Throwable
    //   3427	3461	3461	java/lang/Throwable
    //   3483	3494	3497	java/lang/Throwable
    //   3550	3564	3564	java/lang/Throwable
    //   3575	3588	3591	java/lang/Throwable
    //   3580	3603	3606	java/lang/Throwable
    //   3595	3621	3624	java/lang/Throwable
    //   3610	3651	3654	java/lang/Throwable
    //   3717	3744	3747	java/lang/Throwable
    //   3734	3762	3765	java/lang/Throwable
    //   3751	3792	3795	java/lang/Throwable
    //   3769	3803	3803	java/lang/Throwable
    //   3825	3836	3839	java/lang/Throwable
  }
  
  static void Zo(Object paramObject) {
    Zexu.Zp = a(-21257, -31048);
    Zexu.ZI = new BigInteger(a(-21253, -9309));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zl7k.ZX.charAt(Math.abs(((BigInteger)Zlhz.Zy).intValue() % 32)) > Zr9p.Za.charAt(Math.abs(((BigInteger)Zexu.ZI).intValue() % 32))) {
          try {
            Zrnu.ZT(Class.forName(a(-21252, -15522)));
            if (!bool)
              Zl3n.Zz(Class.forName(a(-21277, -16257))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl3n.Zz(Class.forName(a(-21277, -16257)));
    } catch (Throwable throwable) {}
  }
  
  static void ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '!)do»Ì\\t¶îLÈX²º|Å\\ts.i[Ø*µò à¼ÝÿVâBÝ£UCÜDNlwÑ-FßnzJ8Ó\\t0*°Méã\\t«a?\\t)}eå2IFMÜªÄòóÃp«4IICùC\\nÜsæ0Vü}Üâm½rÒVUA¹ºò|Ç9áæ×ëtF03Ï)íÂæ`ãsa|ojØÀlÍ¹x?¥\\trìuË\\r5\\b ¦D&8\\t¸üâ×Ïz\\t¹¼wÝpNF0_\\bjS\\r ?ñ¹\\t3â&Z7¥\\bk¹-};Z.ã\\tõ1ô¸kTÅf\\ts».=[R5òý\\tW áÙÅ¬ ÎA]®5A¡Ð<!À[òJDÙ'Û8<Ø\\t @DB½HÙ\\tØ[õ¶öqF\\t±Ø¨î]u&\\tï¯·k%È)'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #14
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
    //   68: ldc '\\r©/H¿\\t-¯uZë±'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #114
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
    //   129: putstatic burp/Ztmy.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztmy.b : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #122
    //   219: goto -> 244
    //   222: bipush #89
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #104
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #13
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
    //   300: sipush #-21280
    //   303: sipush #25680
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztmy.ZF : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #61
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-60
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #108
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-81
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-90
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #9
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-90
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #119
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #11
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-69
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-59
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-54
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-44
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-67
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #88
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-25
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-9
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #67
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: iconst_4
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #83
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-109
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #75
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #84
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-99
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #8
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #21
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #35
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #56
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #34
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #34
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-60
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #119
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Ztmy.ZH : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFACF3) & 0xFFFF;
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
      byte b1 = 44;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */