package burp;

import java.math.BigInteger;

class Zsin extends ClassLoader {
  static String ZC;
  
  static Object Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs6g.Zq : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: iload #6
    //   22: aload_3
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: aload_3
    //   28: iload #6
    //   30: baload
    //   31: istore #7
    //   33: iload #7
    //   35: bipush #48
    //   37: if_icmplt -> 54
    //   40: iload #7
    //   42: bipush #57
    //   44: if_icmple -> 152
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: iload #7
    //   56: bipush #65
    //   58: if_icmplt -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iload #7
    //   70: bipush #90
    //   72: if_icmple -> 152
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: iload #7
    //   84: bipush #97
    //   86: if_icmplt -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #7
    //   98: bipush #122
    //   100: if_icmple -> 152
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: iload #7
    //   112: bipush #43
    //   114: if_icmpeq -> 152
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: iload #7
    //   126: bipush #47
    //   128: if_icmpeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: iload #7
    //   140: bipush #61
    //   142: if_icmpne -> 162
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: iinc #5, 1
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: iinc #6, 1
    //   165: iload_2
    //   166: ifeq -> 20
    //   169: iload #5
    //   171: newarray byte
    //   173: astore #6
    //   175: iconst_0
    //   176: istore #7
    //   178: iconst_0
    //   179: istore #8
    //   181: iload #8
    //   183: aload_3
    //   184: arraylength
    //   185: if_icmpge -> 337
    //   188: aload_3
    //   189: iload #8
    //   191: baload
    //   192: istore #9
    //   194: iload #9
    //   196: bipush #48
    //   198: if_icmplt -> 215
    //   201: iload #9
    //   203: bipush #57
    //   205: if_icmple -> 313
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: iload #9
    //   217: bipush #65
    //   219: if_icmplt -> 243
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   228: athrow
    //   229: iload #9
    //   231: bipush #90
    //   233: if_icmple -> 313
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iload #9
    //   245: bipush #97
    //   247: if_icmplt -> 271
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   256: athrow
    //   257: iload #9
    //   259: bipush #122
    //   261: if_icmple -> 313
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: iload #9
    //   273: bipush #43
    //   275: if_icmpeq -> 313
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   284: athrow
    //   285: iload #9
    //   287: bipush #47
    //   289: if_icmpeq -> 313
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: iload #9
    //   301: bipush #61
    //   303: if_icmpne -> 330
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iload #7
    //   317: iload #9
    //   319: bastore
    //   320: iinc #7, 1
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #8, 1
    //   333: iload_2
    //   334: ifeq -> 181
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: astore_3
    //   344: aload_3
    //   345: arraylength
    //   346: istore #5
    //   348: aload_3
    //   349: iload #5
    //   351: iconst_1
    //   352: isub
    //   353: baload
    //   354: bipush #61
    //   356: if_icmpne -> 366
    //   359: iinc #5, -1
    //   362: iload_2
    //   363: ifeq -> 348
    //   366: iload #5
    //   368: aload_3
    //   369: arraylength
    //   370: iconst_4
    //   371: idiv
    //   372: isub
    //   373: newarray byte
    //   375: astore #6
    //   377: iconst_0
    //   378: istore #7
    //   380: iload #7
    //   382: aload_3
    //   383: arraylength
    //   384: if_icmpge -> 646
    //   387: aload_3
    //   388: iload #7
    //   390: baload
    //   391: bipush #61
    //   393: if_icmpne -> 412
    //   396: aload_3
    //   397: iload #7
    //   399: iconst_0
    //   400: bastore
    //   401: iload_2
    //   402: ifeq -> 639
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: athrow
    //   412: aload_3
    //   413: iload #7
    //   415: baload
    //   416: bipush #47
    //   418: if_icmpne -> 445
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   427: athrow
    //   428: aload_3
    //   429: iload #7
    //   431: bipush #63
    //   433: bastore
    //   434: iload_2
    //   435: ifeq -> 639
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   444: athrow
    //   445: aload_3
    //   446: iload #7
    //   448: baload
    //   449: bipush #43
    //   451: if_icmpne -> 478
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload_3
    //   462: iload #7
    //   464: bipush #62
    //   466: bastore
    //   467: iload_2
    //   468: ifeq -> 639
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   477: athrow
    //   478: aload_3
    //   479: iload #7
    //   481: baload
    //   482: bipush #48
    //   484: if_icmplt -> 533
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload_3
    //   495: iload #7
    //   497: baload
    //   498: bipush #57
    //   500: if_icmpgt -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: aload_3
    //   511: iload #7
    //   513: aload_3
    //   514: iload #7
    //   516: baload
    //   517: bipush #-4
    //   519: isub
    //   520: i2b
    //   521: bastore
    //   522: iload_2
    //   523: ifeq -> 639
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: iload #7
    //   536: baload
    //   537: bipush #97
    //   539: if_icmplt -> 588
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #122
    //   555: if_icmpgt -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload_3
    //   566: iload #7
    //   568: aload_3
    //   569: iload #7
    //   571: baload
    //   572: bipush #71
    //   574: isub
    //   575: i2b
    //   576: bastore
    //   577: iload_2
    //   578: ifeq -> 639
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload_3
    //   589: iload #7
    //   591: baload
    //   592: bipush #65
    //   594: if_icmplt -> 639
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #90
    //   610: if_icmpgt -> 639
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload_3
    //   621: iload #7
    //   623: aload_3
    //   624: iload #7
    //   626: baload
    //   627: bipush #65
    //   629: isub
    //   630: i2b
    //   631: bastore
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iinc #7, 1
    //   642: iload_2
    //   643: ifeq -> 380
    //   646: iconst_0
    //   647: istore #7
    //   649: iconst_0
    //   650: istore #8
    //   652: iload #8
    //   654: aload #6
    //   656: arraylength
    //   657: iconst_2
    //   658: isub
    //   659: if_icmpge -> 762
    //   662: aload #6
    //   664: iload #8
    //   666: aload_3
    //   667: iload #7
    //   669: baload
    //   670: iconst_2
    //   671: ishl
    //   672: sipush #255
    //   675: iand
    //   676: aload_3
    //   677: iload #7
    //   679: iconst_1
    //   680: iadd
    //   681: baload
    //   682: iconst_4
    //   683: iushr
    //   684: iconst_3
    //   685: iand
    //   686: ior
    //   687: i2b
    //   688: bastore
    //   689: aload #6
    //   691: iload #8
    //   693: iconst_1
    //   694: iadd
    //   695: aload_3
    //   696: iload #7
    //   698: iconst_1
    //   699: iadd
    //   700: baload
    //   701: iconst_4
    //   702: ishl
    //   703: sipush #255
    //   706: iand
    //   707: aload_3
    //   708: iload #7
    //   710: iconst_2
    //   711: iadd
    //   712: baload
    //   713: iconst_2
    //   714: iushr
    //   715: bipush #15
    //   717: iand
    //   718: ior
    //   719: i2b
    //   720: bastore
    //   721: aload #6
    //   723: iload #8
    //   725: iconst_2
    //   726: iadd
    //   727: aload_3
    //   728: iload #7
    //   730: iconst_2
    //   731: iadd
    //   732: baload
    //   733: bipush #6
    //   735: ishl
    //   736: sipush #255
    //   739: iand
    //   740: aload_3
    //   741: iload #7
    //   743: iconst_3
    //   744: iadd
    //   745: baload
    //   746: bipush #63
    //   748: iand
    //   749: ior
    //   750: i2b
    //   751: bastore
    //   752: iinc #7, 4
    //   755: iinc #8, 3
    //   758: iload_2
    //   759: ifeq -> 652
    //   762: iload #8
    //   764: aload #6
    //   766: arraylength
    //   767: if_icmpge -> 804
    //   770: aload #6
    //   772: iload #8
    //   774: aload_3
    //   775: iload #7
    //   777: baload
    //   778: iconst_2
    //   779: ishl
    //   780: sipush #255
    //   783: iand
    //   784: aload_3
    //   785: iload #7
    //   787: iconst_1
    //   788: iadd
    //   789: baload
    //   790: iconst_4
    //   791: iushr
    //   792: iconst_3
    //   793: iand
    //   794: ior
    //   795: i2b
    //   796: bastore
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: iinc #8, 1
    //   807: iload #8
    //   809: aload #6
    //   811: arraylength
    //   812: if_icmpge -> 852
    //   815: aload #6
    //   817: iload #8
    //   819: aload_3
    //   820: iload #7
    //   822: iconst_1
    //   823: iadd
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: sipush #255
    //   830: iand
    //   831: aload_3
    //   832: iload #7
    //   834: iconst_2
    //   835: iadd
    //   836: baload
    //   837: iconst_2
    //   838: iushr
    //   839: bipush #15
    //   841: iand
    //   842: ior
    //   843: i2b
    //   844: bastore
    //   845: goto -> 852
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #6
    //   854: astore #4
    //   856: sipush #31876
    //   859: new java/math/BigInteger
    //   862: dup
    //   863: aload #4
    //   865: invokespecial <init> : ([B)V
    //   868: invokevirtual abs : ()Ljava/math/BigInteger;
    //   871: putstatic burp/Zty3.Zz : Ljava/lang/Object;
    //   874: sipush #20861
    //   877: invokestatic a : (II)Ljava/lang/String;
    //   880: iconst_1
    //   881: ldc burp/Zr64
    //   883: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   886: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   889: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   892: astore_3
    //   893: aload_3
    //   894: arraylength
    //   895: istore #4
    //   897: iconst_0
    //   898: istore #5
    //   900: iload #5
    //   902: iload #4
    //   904: if_icmpge -> 1041
    //   907: aload_3
    //   908: iload #5
    //   910: aaload
    //   911: astore #6
    //   913: aload #6
    //   915: invokevirtual getModifiers : ()I
    //   918: invokestatic isStatic : (I)Z
    //   921: ifne -> 931
    //   924: goto -> 1034
    //   927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   930: athrow
    //   931: aload #6
    //   933: invokevirtual getType : ()Ljava/lang/Class;
    //   936: astore #7
    //   938: aload #7
    //   940: ifnull -> 1021
    //   943: aload #7
    //   945: invokevirtual isPrimitive : ()Z
    //   948: ifne -> 1021
    //   951: goto -> 958
    //   954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   957: athrow
    //   958: aload #7
    //   960: invokevirtual getPackage : ()Ljava/lang/Package;
    //   963: ifnull -> 1021
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   972: athrow
    //   973: aload #7
    //   975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   978: invokevirtual getName : ()Ljava/lang/String;
    //   981: ifnull -> 1021
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #7
    //   993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: sipush #31873
    //   1002: sipush #13674
    //   1005: invokestatic a : (II)Ljava/lang/String;
    //   1008: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1011: ifne -> 1021
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload #6
    //   1023: iconst_1
    //   1024: invokevirtual setAccessible : (Z)V
    //   1027: aload #6
    //   1029: aconst_null
    //   1030: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1033: pop
    //   1034: iinc #5, 1
    //   1037: iload_2
    //   1038: ifeq -> 900
    //   1041: sipush #31875
    //   1044: sipush #-12170
    //   1047: invokestatic a : (II)Ljava/lang/String;
    //   1050: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1053: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1056: astore_3
    //   1057: aload_3
    //   1058: arraylength
    //   1059: istore #4
    //   1061: iconst_0
    //   1062: istore #5
    //   1064: iload #5
    //   1066: iload #4
    //   1068: if_icmpge -> 1200
    //   1071: aload_3
    //   1072: iload #5
    //   1074: aaload
    //   1075: astore #6
    //   1077: aload #6
    //   1079: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1082: pop
    //   1083: aload #6
    //   1085: invokevirtual getModifiers : ()I
    //   1088: invokestatic isStatic : (I)Z
    //   1091: ifeq -> 1186
    //   1094: aload #6
    //   1096: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1099: arraylength
    //   1100: iconst_2
    //   1101: if_icmpne -> 1186
    //   1104: goto -> 1111
    //   1107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1110: athrow
    //   1111: aload #6
    //   1113: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1116: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1122: ifeq -> 1186
    //   1125: goto -> 1132
    //   1128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1131: athrow
    //   1132: aload #6
    //   1134: iconst_1
    //   1135: invokevirtual setAccessible : (Z)V
    //   1138: aload #6
    //   1140: aconst_null
    //   1141: iconst_2
    //   1142: anewarray java/lang/Object
    //   1145: dup
    //   1146: iconst_0
    //   1147: aload_0
    //   1148: aastore
    //   1149: dup
    //   1150: iconst_1
    //   1151: aload_1
    //   1152: ifnonnull -> 1170
    //   1155: goto -> 1162
    //   1158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1161: athrow
    //   1162: aload_1
    //   1163: goto -> 1177
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: aload_1
    //   1171: checkcast [B
    //   1174: invokevirtual clone : ()Ljava/lang/Object;
    //   1177: aastore
    //   1178: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1181: pop
    //   1182: iload_2
    //   1183: ifeq -> 1200
    //   1186: iinc #5, 1
    //   1189: iload_2
    //   1190: ifeq -> 1064
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: getstatic burp/Zzvr.Zc : Ljava/lang/String;
    //   1203: getstatic burp/Zly0.ZB : Ljava/lang/Object;
    //   1206: checkcast java/math/BigInteger
    //   1209: invokevirtual intValue : ()I
    //   1212: bipush #32
    //   1214: irem
    //   1215: invokestatic abs : (I)I
    //   1218: invokevirtual charAt : (I)C
    //   1221: getstatic burp/Ztes.Zo : Ljava/lang/String;
    //   1224: getstatic burp/Zl1u.Zq : Ljava/lang/Object;
    //   1227: checkcast java/math/BigInteger
    //   1230: invokevirtual intValue : ()I
    //   1233: bipush #32
    //   1235: irem
    //   1236: invokestatic abs : (I)I
    //   1239: invokevirtual charAt : (I)C
    //   1242: if_icmpgt -> 1357
    //   1245: getstatic burp/Zlno.ZM : Ljava/lang/String;
    //   1248: getstatic burp/Zead.ZI : Ljava/lang/Object;
    //   1251: checkcast java/math/BigInteger
    //   1254: invokevirtual intValue : ()I
    //   1257: bipush #32
    //   1259: irem
    //   1260: invokestatic abs : (I)I
    //   1263: invokevirtual charAt : (I)C
    //   1266: getstatic burp/Zbxp.ZS : Ljava/lang/String;
    //   1269: getstatic burp/Zb3p.Zx : Ljava/lang/Object;
    //   1272: checkcast java/math/BigInteger
    //   1275: invokevirtual intValue : ()I
    //   1278: bipush #32
    //   1280: irem
    //   1281: invokestatic abs : (I)I
    //   1284: invokevirtual charAt : (I)C
    //   1287: if_icmpgt -> 1357
    //   1290: goto -> 1297
    //   1293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1296: athrow
    //   1297: getstatic burp/Zblv.ZF : Ljava/lang/String;
    //   1300: getstatic burp/Zrvb.ZD : Ljava/lang/Object;
    //   1303: checkcast java/math/BigInteger
    //   1306: invokevirtual intValue : ()I
    //   1309: bipush #32
    //   1311: irem
    //   1312: invokestatic abs : (I)I
    //   1315: invokevirtual charAt : (I)C
    //   1318: getstatic burp/Zxn7.ZG : Ljava/lang/String;
    //   1321: getstatic burp/Zxrd.ZL : Ljava/lang/Object;
    //   1324: checkcast java/math/BigInteger
    //   1327: invokevirtual intValue : ()I
    //   1330: bipush #32
    //   1332: irem
    //   1333: invokestatic abs : (I)I
    //   1336: invokevirtual charAt : (I)C
    //   1339: if_icmpgt -> 1357
    //   1342: goto -> 1349
    //   1345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1348: athrow
    //   1349: iconst_1
    //   1350: goto -> 1358
    //   1353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1356: athrow
    //   1357: iconst_0
    //   1358: ireturn
    //   1359: astore_3
    //   1360: new java/lang/Exception
    //   1363: dup
    //   1364: aload_3
    //   1365: invokevirtual getMessage : ()Ljava/lang/String;
    //   1368: invokespecial <init> : (Ljava/lang/String;)V
    //   1371: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1358	1359	java/lang/Throwable
    //   33	47	50	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   54	75	78	java/lang/Throwable
    //   68	89	92	java/lang/Throwable
    //   82	103	106	java/lang/Throwable
    //   96	117	120	java/lang/Throwable
    //   110	131	134	java/lang/Throwable
    //   124	145	148	java/lang/Throwable
    //   138	155	158	java/lang/Throwable
    //   194	208	211	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   215	236	239	java/lang/Throwable
    //   229	250	253	java/lang/Throwable
    //   243	264	267	java/lang/Throwable
    //   257	278	281	java/lang/Throwable
    //   271	292	295	java/lang/Throwable
    //   285	306	309	java/lang/Throwable
    //   299	323	326	java/lang/Throwable
    //   387	405	408	java/lang/Throwable
    //   396	421	424	java/lang/Throwable
    //   412	438	441	java/lang/Throwable
    //   428	454	457	java/lang/Throwable
    //   445	471	474	java/lang/Throwable
    //   461	487	490	java/lang/Throwable
    //   478	503	506	java/lang/Throwable
    //   494	526	529	java/lang/Throwable
    //   510	542	545	java/lang/Throwable
    //   533	558	561	java/lang/Throwable
    //   549	581	584	java/lang/Throwable
    //   565	597	600	java/lang/Throwable
    //   588	613	616	java/lang/Throwable
    //   604	632	635	java/lang/Throwable
    //   762	797	800	java/lang/Throwable
    //   804	845	848	java/lang/Throwable
    //   913	927	927	java/lang/Throwable
    //   938	951	954	java/lang/Throwable
    //   943	966	969	java/lang/Throwable
    //   958	984	987	java/lang/Throwable
    //   973	1014	1017	java/lang/Throwable
    //   1077	1104	1107	java/lang/Throwable
    //   1094	1125	1128	java/lang/Throwable
    //   1111	1155	1158	java/lang/Throwable
    //   1132	1166	1166	java/lang/Throwable
    //   1177	1193	1196	java/lang/Throwable
    //   1200	1290	1293	java/lang/Throwable
    //   1245	1342	1345	java/lang/Throwable
    //   1297	1353	1353	java/lang/Throwable
  }
  
  static void ZT(Object paramObject) {
    Zmiy.ZT = a(31878, 13470);
    Zmiy.Zi = new BigInteger(a(31872, -13567));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zl_9.ZP.charAt(Math.abs(((BigInteger)Zezz.Zu).intValue() % 32)) > Zgdt.Zd.charAt(Math.abs(((BigInteger)Zkvr.Zb).intValue() % 32))) {
          try {
            Zxoa.Ze(Class.forName(a(31879, 14691)));
            if (bool)
              Zgs6.Zt(Class.forName(a(31877, 7570))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgs6.Zt(Class.forName(a(31877, 7570)));
    } catch (Throwable throwable) {}
  }
  
  static void Z_(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'uä Ñ; .F°¦{Âç±ìªî - ÊWY°ÛÉß\\ttöP,Ç\\t'S"ïÊ°D¤\\tÞ@-ü¸; ?¯7$¤|Í*$»1TYS³¼;¢Nu-ÈÏ2¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #18
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc 'Üë,MçÖÈ´þÔû.>K/ÜC\\r0èlróÃ ÌÉ3C$é÷qWIKÖC¦è¢ØÇz~>æ1Ðö[3èe^TøäÞ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_4
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zsin.a : [Ljava/lang/String;
    //   130: bipush #8
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsin.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #108
    //   214: goto -> 244
    //   217: bipush #59
    //   219: goto -> 244
    //   222: bipush #71
    //   224: goto -> 244
    //   227: bipush #25
    //   229: goto -> 244
    //   232: bipush #36
    //   234: goto -> 244
    //   237: bipush #26
    //   239: goto -> 244
    //   242: bipush #78
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 97
    //   300: sipush #31874
    //   303: sipush #11115
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zsin.ZC : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #104
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #62
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #80
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-24
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #13
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-82
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #11
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #99
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #111
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-3
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #76
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #7
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-116
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-60
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #108
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-25
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #10
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-121
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #35
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-73
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #6
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-40
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #23
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #57
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-92
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-65
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-67
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #89
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #39
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-103
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #20
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-85
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zsin.Za : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7C87) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */