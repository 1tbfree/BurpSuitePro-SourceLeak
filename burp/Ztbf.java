package burp;

import java.math.BigInteger;

class Ztbf extends ClassLoader {
  static String Zf;
  
  static Object Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zm(Object paramObject) {
    Zm__.Zf = a(-12486, -14859);
    Zm__.Zz = new BigInteger(a(-12481, -17287));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgmt.Zu.charAt(Math.abs(((BigInteger)Zxzd.ZD).intValue() % 32)) > Zxzd.ZM.charAt(Math.abs(((BigInteger)Zxzj.ZO).intValue() % 32))) {
          try {
            Zkbf.ZH(Class.forName(a(-12501, 13339)));
            if (bool)
              Ztzh.ZO(Class.forName(a(-12500, -24472))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztzh.ZO(Class.forName(a(-12500, -24472)));
    } catch (Throwable throwable) {}
  }
  
  static void Zj(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic burp/Zl2q.ZI : Ljava/lang/String;
    //   15: astore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: aload #4
    //   24: invokevirtual length : ()I
    //   27: if_icmpge -> 57
    //   30: aload_3
    //   31: aload #4
    //   33: iload #5
    //   35: iload #5
    //   37: iconst_2
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: bipush #16
    //   44: invokestatic parseInt : (Ljava/lang/String;I)I
    //   47: invokevirtual write : (I)V
    //   50: iinc #5, 2
    //   53: iload_2
    //   54: ifeq -> 20
    //   57: aload_3
    //   58: invokevirtual toByteArray : ()[B
    //   61: astore #5
    //   63: getstatic burp/Zxk9.ZI : Ljava/lang/Object;
    //   66: checkcast java/math/BigInteger
    //   69: invokevirtual toByteArray : ()[B
    //   72: astore #6
    //   74: sipush #256
    //   77: newarray byte
    //   79: astore #8
    //   81: sipush #256
    //   84: newarray int
    //   86: astore #9
    //   88: sipush #256
    //   91: newarray int
    //   93: astore #10
    //   95: sipush #256
    //   98: newarray int
    //   100: astore #11
    //   102: sipush #256
    //   105: newarray int
    //   107: astore #12
    //   109: bipush #10
    //   111: newarray int
    //   113: astore #13
    //   115: sipush #283
    //   118: istore #14
    //   120: iconst_0
    //   121: istore #16
    //   123: iload #16
    //   125: sipush #256
    //   128: if_icmpge -> 362
    //   131: sipush #-12505
    //   134: sipush #-8074
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: iload #16
    //   142: iconst_1
    //   143: iushr
    //   144: invokevirtual charAt : (I)C
    //   147: istore #25
    //   149: iload #16
    //   151: iconst_1
    //   152: iand
    //   153: ifne -> 168
    //   156: iload #25
    //   158: bipush #8
    //   160: iushr
    //   161: goto -> 170
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: iload #25
    //   170: i2b
    //   171: sipush #255
    //   174: iand
    //   175: istore #15
    //   177: iload #16
    //   179: iconst_1
    //   180: ishl
    //   181: istore #17
    //   183: iload #17
    //   185: sipush #256
    //   188: if_icmplt -> 198
    //   191: iload #17
    //   193: iload #14
    //   195: ixor
    //   196: istore #17
    //   198: iload #17
    //   200: iconst_1
    //   201: ishl
    //   202: istore #18
    //   204: iload #18
    //   206: sipush #256
    //   209: if_icmplt -> 219
    //   212: iload #18
    //   214: iload #14
    //   216: ixor
    //   217: istore #18
    //   219: iload #18
    //   221: iconst_1
    //   222: ishl
    //   223: istore #19
    //   225: iload #19
    //   227: sipush #256
    //   230: if_icmplt -> 240
    //   233: iload #19
    //   235: iload #14
    //   237: ixor
    //   238: istore #19
    //   240: iload #19
    //   242: iload #16
    //   244: ixor
    //   245: istore #20
    //   247: iload #20
    //   249: iload #17
    //   251: ixor
    //   252: istore #21
    //   254: iload #20
    //   256: iload #18
    //   258: ixor
    //   259: istore #22
    //   261: iload #19
    //   263: iload #18
    //   265: ixor
    //   266: iload #17
    //   268: ixor
    //   269: istore #23
    //   271: aload #8
    //   273: iload #16
    //   275: iload #15
    //   277: i2b
    //   278: bastore
    //   279: aload #9
    //   281: iload #15
    //   283: iload #23
    //   285: bipush #24
    //   287: ishl
    //   288: iload #20
    //   290: bipush #16
    //   292: ishl
    //   293: ior
    //   294: iload #22
    //   296: bipush #8
    //   298: ishl
    //   299: ior
    //   300: iload #21
    //   302: ior
    //   303: dup
    //   304: istore #24
    //   306: iastore
    //   307: aload #10
    //   309: iload #15
    //   311: iload #24
    //   313: bipush #8
    //   315: iushr
    //   316: iload #24
    //   318: bipush #24
    //   320: ishl
    //   321: ior
    //   322: iastore
    //   323: aload #11
    //   325: iload #15
    //   327: iload #24
    //   329: bipush #16
    //   331: iushr
    //   332: iload #24
    //   334: bipush #16
    //   336: ishl
    //   337: ior
    //   338: iastore
    //   339: aload #12
    //   341: iload #15
    //   343: iload #24
    //   345: bipush #24
    //   347: iushr
    //   348: iload #24
    //   350: bipush #8
    //   352: ishl
    //   353: ior
    //   354: iastore
    //   355: iinc #16, 1
    //   358: iload_2
    //   359: ifeq -> 123
    //   362: iconst_1
    //   363: istore #25
    //   365: aload #13
    //   367: iconst_0
    //   368: iload #25
    //   370: bipush #24
    //   372: ishl
    //   373: iastore
    //   374: iconst_1
    //   375: istore #26
    //   377: iload #26
    //   379: bipush #10
    //   381: if_icmpge -> 422
    //   384: iload #25
    //   386: iconst_1
    //   387: ishl
    //   388: istore #25
    //   390: iload #25
    //   392: sipush #256
    //   395: if_icmplt -> 405
    //   398: iload #25
    //   400: iload #14
    //   402: ixor
    //   403: istore #25
    //   405: aload #13
    //   407: iload #26
    //   409: iload #25
    //   411: bipush #24
    //   413: ishl
    //   414: iastore
    //   415: iinc #26, 1
    //   418: iload_2
    //   419: ifeq -> 377
    //   422: iconst_4
    //   423: istore #26
    //   425: iload #26
    //   427: bipush #6
    //   429: iadd
    //   430: istore #27
    //   432: iconst_4
    //   433: iload #27
    //   435: iconst_1
    //   436: iadd
    //   437: imul
    //   438: istore #28
    //   440: iload #28
    //   442: newarray int
    //   444: astore #29
    //   446: iload #28
    //   448: newarray int
    //   450: astore #30
    //   452: iconst_0
    //   453: istore #25
    //   455: iconst_0
    //   456: istore #32
    //   458: iconst_0
    //   459: istore #33
    //   461: iload #32
    //   463: iload #26
    //   465: if_icmpge -> 533
    //   468: aload #29
    //   470: iload #32
    //   472: aload #5
    //   474: iload #33
    //   476: baload
    //   477: bipush #24
    //   479: ishl
    //   480: aload #5
    //   482: iload #33
    //   484: iconst_1
    //   485: iadd
    //   486: baload
    //   487: sipush #255
    //   490: iand
    //   491: bipush #16
    //   493: ishl
    //   494: ior
    //   495: aload #5
    //   497: iload #33
    //   499: iconst_2
    //   500: iadd
    //   501: baload
    //   502: sipush #255
    //   505: iand
    //   506: bipush #8
    //   508: ishl
    //   509: ior
    //   510: aload #5
    //   512: iload #33
    //   514: iconst_3
    //   515: iadd
    //   516: baload
    //   517: sipush #255
    //   520: iand
    //   521: ior
    //   522: iastore
    //   523: iinc #32, 1
    //   526: iinc #33, 4
    //   529: iload_2
    //   530: ifeq -> 461
    //   533: iload #26
    //   535: istore #32
    //   537: iconst_0
    //   538: istore #33
    //   540: iload #32
    //   542: iload #28
    //   544: if_icmpge -> 671
    //   547: aload #29
    //   549: iload #32
    //   551: iconst_1
    //   552: isub
    //   553: iaload
    //   554: istore #31
    //   556: iload #33
    //   558: ifne -> 645
    //   561: iload #26
    //   563: istore #33
    //   565: aload #8
    //   567: iload #31
    //   569: bipush #16
    //   571: iushr
    //   572: sipush #255
    //   575: iand
    //   576: baload
    //   577: bipush #24
    //   579: ishl
    //   580: aload #8
    //   582: iload #31
    //   584: bipush #8
    //   586: iushr
    //   587: sipush #255
    //   590: iand
    //   591: baload
    //   592: sipush #255
    //   595: iand
    //   596: bipush #16
    //   598: ishl
    //   599: ior
    //   600: aload #8
    //   602: iload #31
    //   604: sipush #255
    //   607: iand
    //   608: baload
    //   609: sipush #255
    //   612: iand
    //   613: bipush #8
    //   615: ishl
    //   616: ior
    //   617: aload #8
    //   619: iload #31
    //   621: bipush #24
    //   623: iushr
    //   624: baload
    //   625: sipush #255
    //   628: iand
    //   629: ior
    //   630: istore #31
    //   632: iload #31
    //   634: aload #13
    //   636: iload #25
    //   638: iinc #25, 1
    //   641: iaload
    //   642: ixor
    //   643: istore #31
    //   645: aload #29
    //   647: iload #32
    //   649: aload #29
    //   651: iload #32
    //   653: iload #26
    //   655: isub
    //   656: iaload
    //   657: iload #31
    //   659: ixor
    //   660: iastore
    //   661: iinc #32, 1
    //   664: iinc #33, -1
    //   667: iload_2
    //   668: ifeq -> 540
    //   671: iconst_0
    //   672: istore #32
    //   674: iconst_4
    //   675: iload #27
    //   677: imul
    //   678: istore #33
    //   680: aload #30
    //   682: iload #32
    //   684: aload #29
    //   686: iload #33
    //   688: iaload
    //   689: iastore
    //   690: aload #30
    //   692: iload #32
    //   694: iconst_1
    //   695: iadd
    //   696: aload #29
    //   698: iload #33
    //   700: iconst_1
    //   701: iadd
    //   702: iaload
    //   703: iastore
    //   704: aload #30
    //   706: iload #32
    //   708: iconst_2
    //   709: iadd
    //   710: aload #29
    //   712: iload #33
    //   714: iconst_2
    //   715: iadd
    //   716: iaload
    //   717: iastore
    //   718: aload #30
    //   720: iload #32
    //   722: iconst_3
    //   723: iadd
    //   724: aload #29
    //   726: iload #33
    //   728: iconst_3
    //   729: iadd
    //   730: iaload
    //   731: iastore
    //   732: iinc #32, 4
    //   735: iinc #33, -4
    //   738: iconst_1
    //   739: istore #35
    //   741: iload #35
    //   743: iload #27
    //   745: if_icmpge -> 1109
    //   748: aload #29
    //   750: iload #33
    //   752: iaload
    //   753: istore #34
    //   755: aload #30
    //   757: iload #32
    //   759: aload #9
    //   761: aload #8
    //   763: iload #34
    //   765: bipush #24
    //   767: iushr
    //   768: baload
    //   769: sipush #255
    //   772: iand
    //   773: iaload
    //   774: aload #10
    //   776: aload #8
    //   778: iload #34
    //   780: bipush #16
    //   782: iushr
    //   783: sipush #255
    //   786: iand
    //   787: baload
    //   788: sipush #255
    //   791: iand
    //   792: iaload
    //   793: ixor
    //   794: aload #11
    //   796: aload #8
    //   798: iload #34
    //   800: bipush #8
    //   802: iushr
    //   803: sipush #255
    //   806: iand
    //   807: baload
    //   808: sipush #255
    //   811: iand
    //   812: iaload
    //   813: ixor
    //   814: aload #12
    //   816: aload #8
    //   818: iload #34
    //   820: sipush #255
    //   823: iand
    //   824: baload
    //   825: sipush #255
    //   828: iand
    //   829: iaload
    //   830: ixor
    //   831: iastore
    //   832: aload #29
    //   834: iload #33
    //   836: iconst_1
    //   837: iadd
    //   838: iaload
    //   839: istore #34
    //   841: aload #30
    //   843: iload #32
    //   845: iconst_1
    //   846: iadd
    //   847: aload #9
    //   849: aload #8
    //   851: iload #34
    //   853: bipush #24
    //   855: iushr
    //   856: baload
    //   857: sipush #255
    //   860: iand
    //   861: iaload
    //   862: aload #10
    //   864: aload #8
    //   866: iload #34
    //   868: bipush #16
    //   870: iushr
    //   871: sipush #255
    //   874: iand
    //   875: baload
    //   876: sipush #255
    //   879: iand
    //   880: iaload
    //   881: ixor
    //   882: aload #11
    //   884: aload #8
    //   886: iload #34
    //   888: bipush #8
    //   890: iushr
    //   891: sipush #255
    //   894: iand
    //   895: baload
    //   896: sipush #255
    //   899: iand
    //   900: iaload
    //   901: ixor
    //   902: aload #12
    //   904: aload #8
    //   906: iload #34
    //   908: sipush #255
    //   911: iand
    //   912: baload
    //   913: sipush #255
    //   916: iand
    //   917: iaload
    //   918: ixor
    //   919: iastore
    //   920: aload #29
    //   922: iload #33
    //   924: iconst_2
    //   925: iadd
    //   926: iaload
    //   927: istore #34
    //   929: aload #30
    //   931: iload #32
    //   933: iconst_2
    //   934: iadd
    //   935: aload #9
    //   937: aload #8
    //   939: iload #34
    //   941: bipush #24
    //   943: iushr
    //   944: baload
    //   945: sipush #255
    //   948: iand
    //   949: iaload
    //   950: aload #10
    //   952: aload #8
    //   954: iload #34
    //   956: bipush #16
    //   958: iushr
    //   959: sipush #255
    //   962: iand
    //   963: baload
    //   964: sipush #255
    //   967: iand
    //   968: iaload
    //   969: ixor
    //   970: aload #11
    //   972: aload #8
    //   974: iload #34
    //   976: bipush #8
    //   978: iushr
    //   979: sipush #255
    //   982: iand
    //   983: baload
    //   984: sipush #255
    //   987: iand
    //   988: iaload
    //   989: ixor
    //   990: aload #12
    //   992: aload #8
    //   994: iload #34
    //   996: sipush #255
    //   999: iand
    //   1000: baload
    //   1001: sipush #255
    //   1004: iand
    //   1005: iaload
    //   1006: ixor
    //   1007: iastore
    //   1008: aload #29
    //   1010: iload #33
    //   1012: iconst_3
    //   1013: iadd
    //   1014: iaload
    //   1015: istore #34
    //   1017: aload #30
    //   1019: iload #32
    //   1021: iconst_3
    //   1022: iadd
    //   1023: aload #9
    //   1025: aload #8
    //   1027: iload #34
    //   1029: bipush #24
    //   1031: iushr
    //   1032: baload
    //   1033: sipush #255
    //   1036: iand
    //   1037: iaload
    //   1038: aload #10
    //   1040: aload #8
    //   1042: iload #34
    //   1044: bipush #16
    //   1046: iushr
    //   1047: sipush #255
    //   1050: iand
    //   1051: baload
    //   1052: sipush #255
    //   1055: iand
    //   1056: iaload
    //   1057: ixor
    //   1058: aload #11
    //   1060: aload #8
    //   1062: iload #34
    //   1064: bipush #8
    //   1066: iushr
    //   1067: sipush #255
    //   1070: iand
    //   1071: baload
    //   1072: sipush #255
    //   1075: iand
    //   1076: iaload
    //   1077: ixor
    //   1078: aload #12
    //   1080: aload #8
    //   1082: iload #34
    //   1084: sipush #255
    //   1087: iand
    //   1088: baload
    //   1089: sipush #255
    //   1092: iand
    //   1093: iaload
    //   1094: ixor
    //   1095: iastore
    //   1096: iinc #32, 4
    //   1099: iinc #33, -4
    //   1102: iinc #35, 1
    //   1105: iload_2
    //   1106: ifeq -> 741
    //   1109: aload #30
    //   1111: iload #32
    //   1113: aload #29
    //   1115: iload #33
    //   1117: iaload
    //   1118: iastore
    //   1119: aload #30
    //   1121: iload #32
    //   1123: iconst_1
    //   1124: iadd
    //   1125: aload #29
    //   1127: iload #33
    //   1129: iconst_1
    //   1130: iadd
    //   1131: iaload
    //   1132: iastore
    //   1133: aload #30
    //   1135: iload #32
    //   1137: iconst_2
    //   1138: iadd
    //   1139: aload #29
    //   1141: iload #33
    //   1143: iconst_2
    //   1144: iadd
    //   1145: iaload
    //   1146: iastore
    //   1147: aload #30
    //   1149: iload #32
    //   1151: iconst_3
    //   1152: iadd
    //   1153: aload #29
    //   1155: iload #33
    //   1157: iconst_3
    //   1158: iadd
    //   1159: iaload
    //   1160: iastore
    //   1161: iconst_0
    //   1162: newarray byte
    //   1164: astore #35
    //   1166: aload #6
    //   1168: arraylength
    //   1169: bipush #16
    //   1171: irem
    //   1172: ifeq -> 1196
    //   1175: new java/lang/Exception
    //   1178: dup
    //   1179: sipush #-12490
    //   1182: sipush #16097
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: invokespecial <init> : (Ljava/lang/String;)V
    //   1191: athrow
    //   1192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1195: athrow
    //   1196: bipush #10
    //   1198: istore #36
    //   1200: sipush #-12508
    //   1203: sipush #256
    //   1206: newarray byte
    //   1208: astore #37
    //   1210: sipush #31136
    //   1213: sipush #256
    //   1216: newarray int
    //   1218: astore #38
    //   1220: sipush #256
    //   1223: newarray int
    //   1225: astore #39
    //   1227: sipush #256
    //   1230: newarray int
    //   1232: astore #40
    //   1234: sipush #256
    //   1237: newarray int
    //   1239: astore #41
    //   1241: sipush #283
    //   1244: istore #14
    //   1246: invokestatic a : (II)Ljava/lang/String;
    //   1249: astore #42
    //   1251: iconst_0
    //   1252: istore #16
    //   1254: iload #16
    //   1256: sipush #256
    //   1259: if_icmpge -> 1486
    //   1262: aload #42
    //   1264: iload #16
    //   1266: iconst_1
    //   1267: iushr
    //   1268: invokevirtual charAt : (I)C
    //   1271: istore #43
    //   1273: iload #16
    //   1275: iconst_1
    //   1276: iand
    //   1277: ifne -> 1292
    //   1280: iload #43
    //   1282: bipush #8
    //   1284: iushr
    //   1285: goto -> 1294
    //   1288: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1291: athrow
    //   1292: iload #43
    //   1294: i2b
    //   1295: sipush #255
    //   1298: iand
    //   1299: istore #15
    //   1301: iload #16
    //   1303: iconst_1
    //   1304: ishl
    //   1305: istore #17
    //   1307: iload #17
    //   1309: sipush #256
    //   1312: if_icmplt -> 1322
    //   1315: iload #17
    //   1317: iload #14
    //   1319: ixor
    //   1320: istore #17
    //   1322: iload #17
    //   1324: iconst_1
    //   1325: ishl
    //   1326: istore #18
    //   1328: iload #18
    //   1330: sipush #256
    //   1333: if_icmplt -> 1343
    //   1336: iload #18
    //   1338: iload #14
    //   1340: ixor
    //   1341: istore #18
    //   1343: iload #18
    //   1345: iconst_1
    //   1346: ishl
    //   1347: istore #19
    //   1349: iload #19
    //   1351: sipush #256
    //   1354: if_icmplt -> 1364
    //   1357: iload #19
    //   1359: iload #14
    //   1361: ixor
    //   1362: istore #19
    //   1364: iload #19
    //   1366: iload #16
    //   1368: ixor
    //   1369: istore #20
    //   1371: iload #20
    //   1373: iload #17
    //   1375: ixor
    //   1376: istore #21
    //   1378: iload #20
    //   1380: iload #18
    //   1382: ixor
    //   1383: istore #22
    //   1385: iload #19
    //   1387: iload #18
    //   1389: ixor
    //   1390: iload #17
    //   1392: ixor
    //   1393: istore #23
    //   1395: aload #37
    //   1397: iload #15
    //   1399: iload #16
    //   1401: i2b
    //   1402: bastore
    //   1403: aload #38
    //   1405: iload #15
    //   1407: iload #23
    //   1409: bipush #24
    //   1411: ishl
    //   1412: iload #20
    //   1414: bipush #16
    //   1416: ishl
    //   1417: ior
    //   1418: iload #22
    //   1420: bipush #8
    //   1422: ishl
    //   1423: ior
    //   1424: iload #21
    //   1426: ior
    //   1427: dup
    //   1428: istore #24
    //   1430: iastore
    //   1431: aload #39
    //   1433: iload #15
    //   1435: iload #24
    //   1437: bipush #8
    //   1439: iushr
    //   1440: iload #24
    //   1442: bipush #24
    //   1444: ishl
    //   1445: ior
    //   1446: iastore
    //   1447: aload #40
    //   1449: iload #15
    //   1451: iload #24
    //   1453: bipush #16
    //   1455: iushr
    //   1456: iload #24
    //   1458: bipush #16
    //   1460: ishl
    //   1461: ior
    //   1462: iastore
    //   1463: aload #41
    //   1465: iload #15
    //   1467: iload #24
    //   1469: bipush #24
    //   1471: iushr
    //   1472: iload #24
    //   1474: bipush #8
    //   1476: ishl
    //   1477: ior
    //   1478: iastore
    //   1479: iinc #16, 1
    //   1482: iload_2
    //   1483: ifeq -> 1254
    //   1486: aload #6
    //   1488: arraylength
    //   1489: newarray byte
    //   1491: astore #43
    //   1493: iconst_0
    //   1494: istore #44
    //   1496: iload #44
    //   1498: aload #6
    //   1500: arraylength
    //   1501: bipush #16
    //   1503: idiv
    //   1504: if_icmpge -> 2418
    //   1507: bipush #16
    //   1509: newarray byte
    //   1511: astore #45
    //   1513: bipush #16
    //   1515: newarray byte
    //   1517: astore #46
    //   1519: iconst_0
    //   1520: istore #47
    //   1522: iload #47
    //   1524: bipush #16
    //   1526: if_icmpge -> 1552
    //   1529: aload #45
    //   1531: iload #47
    //   1533: aload #6
    //   1535: iload #47
    //   1537: iload #44
    //   1539: bipush #16
    //   1541: imul
    //   1542: iadd
    //   1543: baload
    //   1544: bastore
    //   1545: iinc #47, 1
    //   1548: iload_2
    //   1549: ifeq -> 1522
    //   1552: iconst_0
    //   1553: istore #47
    //   1555: aload #45
    //   1557: iconst_0
    //   1558: baload
    //   1559: bipush #24
    //   1561: ishl
    //   1562: aload #45
    //   1564: iconst_1
    //   1565: baload
    //   1566: sipush #255
    //   1569: iand
    //   1570: bipush #16
    //   1572: ishl
    //   1573: ior
    //   1574: aload #45
    //   1576: iconst_2
    //   1577: baload
    //   1578: sipush #255
    //   1581: iand
    //   1582: bipush #8
    //   1584: ishl
    //   1585: ior
    //   1586: aload #45
    //   1588: iconst_3
    //   1589: baload
    //   1590: sipush #255
    //   1593: iand
    //   1594: ior
    //   1595: aload #30
    //   1597: iconst_0
    //   1598: iaload
    //   1599: ixor
    //   1600: istore #49
    //   1602: aload #45
    //   1604: iconst_4
    //   1605: baload
    //   1606: bipush #24
    //   1608: ishl
    //   1609: aload #45
    //   1611: iconst_5
    //   1612: baload
    //   1613: sipush #255
    //   1616: iand
    //   1617: bipush #16
    //   1619: ishl
    //   1620: ior
    //   1621: aload #45
    //   1623: bipush #6
    //   1625: baload
    //   1626: sipush #255
    //   1629: iand
    //   1630: bipush #8
    //   1632: ishl
    //   1633: ior
    //   1634: aload #45
    //   1636: bipush #7
    //   1638: baload
    //   1639: sipush #255
    //   1642: iand
    //   1643: ior
    //   1644: aload #30
    //   1646: iconst_1
    //   1647: iaload
    //   1648: ixor
    //   1649: istore #50
    //   1651: aload #45
    //   1653: bipush #8
    //   1655: baload
    //   1656: bipush #24
    //   1658: ishl
    //   1659: aload #45
    //   1661: bipush #9
    //   1663: baload
    //   1664: sipush #255
    //   1667: iand
    //   1668: bipush #16
    //   1670: ishl
    //   1671: ior
    //   1672: aload #45
    //   1674: bipush #10
    //   1676: baload
    //   1677: sipush #255
    //   1680: iand
    //   1681: bipush #8
    //   1683: ishl
    //   1684: ior
    //   1685: aload #45
    //   1687: bipush #11
    //   1689: baload
    //   1690: sipush #255
    //   1693: iand
    //   1694: ior
    //   1695: aload #30
    //   1697: iconst_2
    //   1698: iaload
    //   1699: ixor
    //   1700: istore #51
    //   1702: aload #45
    //   1704: bipush #12
    //   1706: baload
    //   1707: bipush #24
    //   1709: ishl
    //   1710: aload #45
    //   1712: bipush #13
    //   1714: baload
    //   1715: sipush #255
    //   1718: iand
    //   1719: bipush #16
    //   1721: ishl
    //   1722: ior
    //   1723: aload #45
    //   1725: bipush #14
    //   1727: baload
    //   1728: sipush #255
    //   1731: iand
    //   1732: bipush #8
    //   1734: ishl
    //   1735: ior
    //   1736: aload #45
    //   1738: bipush #15
    //   1740: baload
    //   1741: sipush #255
    //   1744: iand
    //   1745: ior
    //   1746: aload #30
    //   1748: iconst_3
    //   1749: iaload
    //   1750: ixor
    //   1751: istore #52
    //   1753: iconst_1
    //   1754: istore #53
    //   1756: iload #53
    //   1758: iload #36
    //   1760: if_icmpge -> 2003
    //   1763: iinc #47, 4
    //   1766: aload #38
    //   1768: iload #49
    //   1770: bipush #24
    //   1772: iushr
    //   1773: iaload
    //   1774: aload #39
    //   1776: iload #52
    //   1778: bipush #16
    //   1780: iushr
    //   1781: sipush #255
    //   1784: iand
    //   1785: iaload
    //   1786: ixor
    //   1787: aload #40
    //   1789: iload #51
    //   1791: bipush #8
    //   1793: iushr
    //   1794: sipush #255
    //   1797: iand
    //   1798: iaload
    //   1799: ixor
    //   1800: aload #41
    //   1802: iload #50
    //   1804: sipush #255
    //   1807: iand
    //   1808: iaload
    //   1809: ixor
    //   1810: aload #30
    //   1812: iload #47
    //   1814: iaload
    //   1815: ixor
    //   1816: istore #54
    //   1818: aload #38
    //   1820: iload #50
    //   1822: bipush #24
    //   1824: iushr
    //   1825: iaload
    //   1826: aload #39
    //   1828: iload #49
    //   1830: bipush #16
    //   1832: iushr
    //   1833: sipush #255
    //   1836: iand
    //   1837: iaload
    //   1838: ixor
    //   1839: aload #40
    //   1841: iload #52
    //   1843: bipush #8
    //   1845: iushr
    //   1846: sipush #255
    //   1849: iand
    //   1850: iaload
    //   1851: ixor
    //   1852: aload #41
    //   1854: iload #51
    //   1856: sipush #255
    //   1859: iand
    //   1860: iaload
    //   1861: ixor
    //   1862: aload #30
    //   1864: iload #47
    //   1866: iconst_1
    //   1867: iadd
    //   1868: iaload
    //   1869: ixor
    //   1870: istore #55
    //   1872: aload #38
    //   1874: iload #51
    //   1876: bipush #24
    //   1878: iushr
    //   1879: iaload
    //   1880: aload #39
    //   1882: iload #50
    //   1884: bipush #16
    //   1886: iushr
    //   1887: sipush #255
    //   1890: iand
    //   1891: iaload
    //   1892: ixor
    //   1893: aload #40
    //   1895: iload #49
    //   1897: bipush #8
    //   1899: iushr
    //   1900: sipush #255
    //   1903: iand
    //   1904: iaload
    //   1905: ixor
    //   1906: aload #41
    //   1908: iload #52
    //   1910: sipush #255
    //   1913: iand
    //   1914: iaload
    //   1915: ixor
    //   1916: aload #30
    //   1918: iload #47
    //   1920: iconst_2
    //   1921: iadd
    //   1922: iaload
    //   1923: ixor
    //   1924: istore #56
    //   1926: aload #38
    //   1928: iload #52
    //   1930: bipush #24
    //   1932: iushr
    //   1933: iaload
    //   1934: aload #39
    //   1936: iload #51
    //   1938: bipush #16
    //   1940: iushr
    //   1941: sipush #255
    //   1944: iand
    //   1945: iaload
    //   1946: ixor
    //   1947: aload #40
    //   1949: iload #50
    //   1951: bipush #8
    //   1953: iushr
    //   1954: sipush #255
    //   1957: iand
    //   1958: iaload
    //   1959: ixor
    //   1960: aload #41
    //   1962: iload #49
    //   1964: sipush #255
    //   1967: iand
    //   1968: iaload
    //   1969: ixor
    //   1970: aload #30
    //   1972: iload #47
    //   1974: iconst_3
    //   1975: iadd
    //   1976: iaload
    //   1977: ixor
    //   1978: istore #57
    //   1980: iload #54
    //   1982: istore #49
    //   1984: iload #55
    //   1986: istore #50
    //   1988: iload #56
    //   1990: istore #51
    //   1992: iload #57
    //   1994: istore #52
    //   1996: iinc #53, 1
    //   1999: iload_2
    //   2000: ifeq -> 1756
    //   2003: iinc #47, 4
    //   2006: aload #30
    //   2008: iload #47
    //   2010: iaload
    //   2011: istore #48
    //   2013: aload #46
    //   2015: iconst_0
    //   2016: aload #37
    //   2018: iload #49
    //   2020: bipush #24
    //   2022: iushr
    //   2023: baload
    //   2024: iload #48
    //   2026: bipush #24
    //   2028: iushr
    //   2029: ixor
    //   2030: i2b
    //   2031: bastore
    //   2032: aload #46
    //   2034: iconst_1
    //   2035: aload #37
    //   2037: iload #52
    //   2039: bipush #16
    //   2041: iushr
    //   2042: sipush #255
    //   2045: iand
    //   2046: baload
    //   2047: iload #48
    //   2049: bipush #16
    //   2051: iushr
    //   2052: ixor
    //   2053: i2b
    //   2054: bastore
    //   2055: aload #46
    //   2057: iconst_2
    //   2058: aload #37
    //   2060: iload #51
    //   2062: bipush #8
    //   2064: iushr
    //   2065: sipush #255
    //   2068: iand
    //   2069: baload
    //   2070: iload #48
    //   2072: bipush #8
    //   2074: iushr
    //   2075: ixor
    //   2076: i2b
    //   2077: bastore
    //   2078: aload #46
    //   2080: iconst_3
    //   2081: aload #37
    //   2083: iload #50
    //   2085: sipush #255
    //   2088: iand
    //   2089: baload
    //   2090: iload #48
    //   2092: ixor
    //   2093: i2b
    //   2094: bastore
    //   2095: aload #30
    //   2097: iload #47
    //   2099: iconst_1
    //   2100: iadd
    //   2101: iaload
    //   2102: istore #48
    //   2104: aload #46
    //   2106: iconst_4
    //   2107: aload #37
    //   2109: iload #50
    //   2111: bipush #24
    //   2113: iushr
    //   2114: baload
    //   2115: iload #48
    //   2117: bipush #24
    //   2119: iushr
    //   2120: ixor
    //   2121: i2b
    //   2122: bastore
    //   2123: aload #46
    //   2125: iconst_5
    //   2126: aload #37
    //   2128: iload #49
    //   2130: bipush #16
    //   2132: iushr
    //   2133: sipush #255
    //   2136: iand
    //   2137: baload
    //   2138: iload #48
    //   2140: bipush #16
    //   2142: iushr
    //   2143: ixor
    //   2144: i2b
    //   2145: bastore
    //   2146: aload #46
    //   2148: bipush #6
    //   2150: aload #37
    //   2152: iload #52
    //   2154: bipush #8
    //   2156: iushr
    //   2157: sipush #255
    //   2160: iand
    //   2161: baload
    //   2162: iload #48
    //   2164: bipush #8
    //   2166: iushr
    //   2167: ixor
    //   2168: i2b
    //   2169: bastore
    //   2170: aload #46
    //   2172: bipush #7
    //   2174: aload #37
    //   2176: iload #51
    //   2178: sipush #255
    //   2181: iand
    //   2182: baload
    //   2183: iload #48
    //   2185: ixor
    //   2186: i2b
    //   2187: bastore
    //   2188: aload #30
    //   2190: iload #47
    //   2192: iconst_2
    //   2193: iadd
    //   2194: iaload
    //   2195: istore #48
    //   2197: aload #46
    //   2199: bipush #8
    //   2201: aload #37
    //   2203: iload #51
    //   2205: bipush #24
    //   2207: iushr
    //   2208: baload
    //   2209: iload #48
    //   2211: bipush #24
    //   2213: iushr
    //   2214: ixor
    //   2215: i2b
    //   2216: bastore
    //   2217: aload #46
    //   2219: bipush #9
    //   2221: aload #37
    //   2223: iload #50
    //   2225: bipush #16
    //   2227: iushr
    //   2228: sipush #255
    //   2231: iand
    //   2232: baload
    //   2233: iload #48
    //   2235: bipush #16
    //   2237: iushr
    //   2238: ixor
    //   2239: i2b
    //   2240: bastore
    //   2241: aload #46
    //   2243: bipush #10
    //   2245: aload #37
    //   2247: iload #49
    //   2249: bipush #8
    //   2251: iushr
    //   2252: sipush #255
    //   2255: iand
    //   2256: baload
    //   2257: iload #48
    //   2259: bipush #8
    //   2261: iushr
    //   2262: ixor
    //   2263: i2b
    //   2264: bastore
    //   2265: aload #46
    //   2267: bipush #11
    //   2269: aload #37
    //   2271: iload #52
    //   2273: sipush #255
    //   2276: iand
    //   2277: baload
    //   2278: iload #48
    //   2280: ixor
    //   2281: i2b
    //   2282: bastore
    //   2283: aload #30
    //   2285: iload #47
    //   2287: iconst_3
    //   2288: iadd
    //   2289: iaload
    //   2290: istore #48
    //   2292: aload #46
    //   2294: bipush #12
    //   2296: aload #37
    //   2298: iload #52
    //   2300: bipush #24
    //   2302: iushr
    //   2303: baload
    //   2304: iload #48
    //   2306: bipush #24
    //   2308: iushr
    //   2309: ixor
    //   2310: i2b
    //   2311: bastore
    //   2312: aload #46
    //   2314: bipush #13
    //   2316: aload #37
    //   2318: iload #51
    //   2320: bipush #16
    //   2322: iushr
    //   2323: sipush #255
    //   2326: iand
    //   2327: baload
    //   2328: iload #48
    //   2330: bipush #16
    //   2332: iushr
    //   2333: ixor
    //   2334: i2b
    //   2335: bastore
    //   2336: aload #46
    //   2338: bipush #14
    //   2340: aload #37
    //   2342: iload #50
    //   2344: bipush #8
    //   2346: iushr
    //   2347: sipush #255
    //   2350: iand
    //   2351: baload
    //   2352: iload #48
    //   2354: bipush #8
    //   2356: iushr
    //   2357: ixor
    //   2358: i2b
    //   2359: bastore
    //   2360: aload #46
    //   2362: bipush #15
    //   2364: aload #37
    //   2366: iload #49
    //   2368: sipush #255
    //   2371: iand
    //   2372: baload
    //   2373: iload #48
    //   2375: ixor
    //   2376: i2b
    //   2377: bastore
    //   2378: iconst_0
    //   2379: istore #53
    //   2381: iload #53
    //   2383: bipush #16
    //   2385: if_icmpge -> 2411
    //   2388: aload #43
    //   2390: iload #53
    //   2392: iload #44
    //   2394: bipush #16
    //   2396: imul
    //   2397: iadd
    //   2398: aload #46
    //   2400: iload #53
    //   2402: baload
    //   2403: bastore
    //   2404: iinc #53, 1
    //   2407: iload_2
    //   2408: ifeq -> 2381
    //   2411: iinc #44, 1
    //   2414: iload_2
    //   2415: ifeq -> 1496
    //   2418: aload #43
    //   2420: arraylength
    //   2421: ifle -> 2502
    //   2424: aload #43
    //   2426: aload #43
    //   2428: arraylength
    //   2429: iconst_1
    //   2430: isub
    //   2431: baload
    //   2432: istore #44
    //   2434: iload #44
    //   2436: bipush #16
    //   2438: if_icmple -> 2449
    //   2441: aload #43
    //   2443: astore #35
    //   2445: iload_2
    //   2446: ifeq -> 2502
    //   2449: aload #43
    //   2451: arraylength
    //   2452: iload #44
    //   2454: isub
    //   2455: newarray byte
    //   2457: astore #35
    //   2459: iconst_0
    //   2460: istore #45
    //   2462: iload #45
    //   2464: aload #35
    //   2466: arraylength
    //   2467: if_icmpge -> 2502
    //   2470: iload #45
    //   2472: aload #43
    //   2474: arraylength
    //   2475: if_icmpge -> 2502
    //   2478: aload #35
    //   2480: iload #45
    //   2482: aload #43
    //   2484: iload #45
    //   2486: baload
    //   2487: bastore
    //   2488: iinc #45, 1
    //   2491: iload_2
    //   2492: ifeq -> 2462
    //   2495: goto -> 2502
    //   2498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2501: athrow
    //   2502: aload #35
    //   2504: astore #7
    //   2506: sipush #-12507
    //   2509: new java/math/BigInteger
    //   2512: dup
    //   2513: aload #7
    //   2515: invokespecial <init> : ([B)V
    //   2518: invokevirtual abs : ()Ljava/math/BigInteger;
    //   2521: putstatic burp/Zsxm.Zv : Ljava/lang/Object;
    //   2524: sipush #21453
    //   2527: invokestatic a : (II)Ljava/lang/String;
    //   2530: iconst_1
    //   2531: ldc burp/Zkgp
    //   2533: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2536: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2539: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2542: astore_3
    //   2543: aload_3
    //   2544: arraylength
    //   2545: istore #4
    //   2547: iconst_0
    //   2548: istore #5
    //   2550: iload #5
    //   2552: iload #4
    //   2554: if_icmpge -> 2691
    //   2557: aload_3
    //   2558: iload #5
    //   2560: aaload
    //   2561: astore #6
    //   2563: aload #6
    //   2565: invokevirtual getModifiers : ()I
    //   2568: invokestatic isStatic : (I)Z
    //   2571: ifne -> 2581
    //   2574: goto -> 2684
    //   2577: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2580: athrow
    //   2581: aload #6
    //   2583: invokevirtual getType : ()Ljava/lang/Class;
    //   2586: astore #7
    //   2588: aload #7
    //   2590: ifnull -> 2671
    //   2593: aload #7
    //   2595: invokevirtual isPrimitive : ()Z
    //   2598: ifne -> 2671
    //   2601: goto -> 2608
    //   2604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2607: athrow
    //   2608: aload #7
    //   2610: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2613: ifnull -> 2671
    //   2616: goto -> 2623
    //   2619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2622: athrow
    //   2623: aload #7
    //   2625: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2628: invokevirtual getName : ()Ljava/lang/String;
    //   2631: ifnull -> 2671
    //   2634: goto -> 2641
    //   2637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2640: athrow
    //   2641: aload #7
    //   2643: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2646: invokevirtual getName : ()Ljava/lang/String;
    //   2649: sipush #-12510
    //   2652: sipush #17179
    //   2655: invokestatic a : (II)Ljava/lang/String;
    //   2658: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2661: ifne -> 2671
    //   2664: goto -> 2671
    //   2667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2670: athrow
    //   2671: aload #6
    //   2673: iconst_1
    //   2674: invokevirtual setAccessible : (Z)V
    //   2677: aload #6
    //   2679: aconst_null
    //   2680: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2683: pop
    //   2684: iinc #5, 1
    //   2687: iload_2
    //   2688: ifeq -> 2550
    //   2691: sipush #-12497
    //   2694: sipush #-25447
    //   2697: invokestatic a : (II)Ljava/lang/String;
    //   2700: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2703: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2706: astore_3
    //   2707: aload_3
    //   2708: arraylength
    //   2709: istore #4
    //   2711: iconst_0
    //   2712: istore #5
    //   2714: iload #5
    //   2716: iload #4
    //   2718: if_icmpge -> 2850
    //   2721: aload_3
    //   2722: iload #5
    //   2724: aaload
    //   2725: astore #6
    //   2727: aload #6
    //   2729: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2732: pop
    //   2733: aload #6
    //   2735: invokevirtual getModifiers : ()I
    //   2738: invokestatic isStatic : (I)Z
    //   2741: ifeq -> 2836
    //   2744: aload #6
    //   2746: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2749: arraylength
    //   2750: iconst_2
    //   2751: if_icmpne -> 2836
    //   2754: goto -> 2761
    //   2757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2760: athrow
    //   2761: aload #6
    //   2763: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2766: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2769: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2772: ifeq -> 2836
    //   2775: goto -> 2782
    //   2778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2781: athrow
    //   2782: aload #6
    //   2784: iconst_1
    //   2785: invokevirtual setAccessible : (Z)V
    //   2788: aload #6
    //   2790: aconst_null
    //   2791: iconst_2
    //   2792: anewarray java/lang/Object
    //   2795: dup
    //   2796: iconst_0
    //   2797: aload_0
    //   2798: aastore
    //   2799: dup
    //   2800: iconst_1
    //   2801: aload_1
    //   2802: ifnonnull -> 2820
    //   2805: goto -> 2812
    //   2808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2811: athrow
    //   2812: aload_1
    //   2813: goto -> 2827
    //   2816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2819: athrow
    //   2820: aload_1
    //   2821: checkcast [B
    //   2824: invokevirtual clone : ()Ljava/lang/Object;
    //   2827: aastore
    //   2828: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2831: pop
    //   2832: iload_2
    //   2833: ifeq -> 2850
    //   2836: iinc #5, 1
    //   2839: iload_2
    //   2840: ifeq -> 2714
    //   2843: goto -> 2850
    //   2846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2849: athrow
    //   2850: iconst_0
    //   2851: istore_3
    //   2852: getstatic burp/Zm0s.Zm : Ljava/lang/String;
    //   2855: getstatic burp/Zgss.Zl : Ljava/lang/Object;
    //   2858: checkcast java/math/BigInteger
    //   2861: invokevirtual intValue : ()I
    //   2864: bipush #32
    //   2866: irem
    //   2867: invokestatic abs : (I)I
    //   2870: invokevirtual charAt : (I)C
    //   2873: getstatic burp/Zt4g.Zj : Ljava/lang/String;
    //   2876: getstatic burp/Zx54.Zn : Ljava/lang/Object;
    //   2879: checkcast java/math/BigInteger
    //   2882: invokevirtual intValue : ()I
    //   2885: bipush #32
    //   2887: irem
    //   2888: invokestatic abs : (I)I
    //   2891: invokevirtual charAt : (I)C
    //   2894: if_icmpgt -> 3238
    //   2897: sipush #-12489
    //   2900: sipush #-28629
    //   2903: invokestatic a : (II)Ljava/lang/String;
    //   2906: iconst_1
    //   2907: ldc burp/Zlzs
    //   2909: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2912: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2915: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2918: astore #4
    //   2920: aload #4
    //   2922: arraylength
    //   2923: istore #5
    //   2925: iconst_0
    //   2926: istore #6
    //   2928: iload #6
    //   2930: iload #5
    //   2932: if_icmpge -> 3070
    //   2935: aload #4
    //   2937: iload #6
    //   2939: aaload
    //   2940: astore #7
    //   2942: aload #7
    //   2944: invokevirtual getModifiers : ()I
    //   2947: invokestatic isStatic : (I)Z
    //   2950: ifne -> 2960
    //   2953: goto -> 3063
    //   2956: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2959: athrow
    //   2960: aload #7
    //   2962: invokevirtual getType : ()Ljava/lang/Class;
    //   2965: astore #8
    //   2967: aload #8
    //   2969: ifnull -> 3050
    //   2972: aload #8
    //   2974: invokevirtual isPrimitive : ()Z
    //   2977: ifne -> 3050
    //   2980: goto -> 2987
    //   2983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2986: athrow
    //   2987: aload #8
    //   2989: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2992: ifnull -> 3050
    //   2995: goto -> 3002
    //   2998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3001: athrow
    //   3002: aload #8
    //   3004: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3007: invokevirtual getName : ()Ljava/lang/String;
    //   3010: ifnull -> 3050
    //   3013: goto -> 3020
    //   3016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3019: athrow
    //   3020: aload #8
    //   3022: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3025: invokevirtual getName : ()Ljava/lang/String;
    //   3028: sipush #-12492
    //   3031: sipush #6502
    //   3034: invokestatic a : (II)Ljava/lang/String;
    //   3037: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3040: ifne -> 3050
    //   3043: goto -> 3050
    //   3046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3049: athrow
    //   3050: aload #7
    //   3052: iconst_1
    //   3053: invokevirtual setAccessible : (Z)V
    //   3056: aload #7
    //   3058: aconst_null
    //   3059: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3062: pop
    //   3063: iinc #6, 1
    //   3066: iload_2
    //   3067: ifeq -> 2928
    //   3070: sipush #-12485
    //   3073: sipush #-31283
    //   3076: invokestatic a : (II)Ljava/lang/String;
    //   3079: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3082: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3085: astore #4
    //   3087: aload #4
    //   3089: arraylength
    //   3090: istore #5
    //   3092: iconst_0
    //   3093: istore #6
    //   3095: iload #6
    //   3097: iload #5
    //   3099: if_icmpge -> 3235
    //   3102: aload #4
    //   3104: iload #6
    //   3106: aaload
    //   3107: astore #7
    //   3109: aload #7
    //   3111: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3114: pop
    //   3115: aload #7
    //   3117: invokevirtual getModifiers : ()I
    //   3120: invokestatic isStatic : (I)Z
    //   3123: ifeq -> 3221
    //   3126: aload #7
    //   3128: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3131: arraylength
    //   3132: iconst_2
    //   3133: if_icmpne -> 3221
    //   3136: goto -> 3143
    //   3139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3142: athrow
    //   3143: aload #7
    //   3145: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3148: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3151: if_acmpne -> 3221
    //   3154: goto -> 3161
    //   3157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3160: athrow
    //   3161: aload #7
    //   3163: iconst_1
    //   3164: invokevirtual setAccessible : (Z)V
    //   3167: aload #7
    //   3169: aconst_null
    //   3170: iconst_2
    //   3171: anewarray java/lang/Object
    //   3174: dup
    //   3175: iconst_0
    //   3176: aload_0
    //   3177: aastore
    //   3178: dup
    //   3179: iconst_1
    //   3180: aload_1
    //   3181: ifnonnull -> 3199
    //   3184: goto -> 3191
    //   3187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3190: athrow
    //   3191: aload_1
    //   3192: goto -> 3206
    //   3195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3198: athrow
    //   3199: aload_1
    //   3200: checkcast [B
    //   3203: invokevirtual clone : ()Ljava/lang/Object;
    //   3206: aastore
    //   3207: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3210: checkcast java/lang/Boolean
    //   3213: invokevirtual booleanValue : ()Z
    //   3216: istore_3
    //   3217: iload_2
    //   3218: ifeq -> 3235
    //   3221: iinc #6, 1
    //   3224: iload_2
    //   3225: ifeq -> 3095
    //   3228: goto -> 3235
    //   3231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3234: athrow
    //   3235: goto -> 3576
    //   3238: sipush #-12493
    //   3241: sipush #4785
    //   3244: invokestatic a : (II)Ljava/lang/String;
    //   3247: iconst_1
    //   3248: ldc burp/Zein
    //   3250: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3253: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3256: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3259: astore #4
    //   3261: aload #4
    //   3263: arraylength
    //   3264: istore #5
    //   3266: iconst_0
    //   3267: istore #6
    //   3269: iload #6
    //   3271: iload #5
    //   3273: if_icmpge -> 3411
    //   3276: aload #4
    //   3278: iload #6
    //   3280: aaload
    //   3281: astore #7
    //   3283: aload #7
    //   3285: invokevirtual getModifiers : ()I
    //   3288: invokestatic isStatic : (I)Z
    //   3291: ifne -> 3301
    //   3294: goto -> 3404
    //   3297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3300: athrow
    //   3301: aload #7
    //   3303: invokevirtual getType : ()Ljava/lang/Class;
    //   3306: astore #8
    //   3308: aload #8
    //   3310: ifnull -> 3391
    //   3313: aload #8
    //   3315: invokevirtual isPrimitive : ()Z
    //   3318: ifne -> 3391
    //   3321: goto -> 3328
    //   3324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3327: athrow
    //   3328: aload #8
    //   3330: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3333: ifnull -> 3391
    //   3336: goto -> 3343
    //   3339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3342: athrow
    //   3343: aload #8
    //   3345: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3348: invokevirtual getName : ()Ljava/lang/String;
    //   3351: ifnull -> 3391
    //   3354: goto -> 3361
    //   3357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3360: athrow
    //   3361: aload #8
    //   3363: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3366: invokevirtual getName : ()Ljava/lang/String;
    //   3369: sipush #-12492
    //   3372: sipush #6502
    //   3375: invokestatic a : (II)Ljava/lang/String;
    //   3378: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3381: ifne -> 3391
    //   3384: goto -> 3391
    //   3387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3390: athrow
    //   3391: aload #7
    //   3393: iconst_1
    //   3394: invokevirtual setAccessible : (Z)V
    //   3397: aload #7
    //   3399: aconst_null
    //   3400: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3403: pop
    //   3404: iinc #6, 1
    //   3407: iload_2
    //   3408: ifeq -> 3269
    //   3411: sipush #-12488
    //   3414: sipush #-12409
    //   3417: invokestatic a : (II)Ljava/lang/String;
    //   3420: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3423: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3426: astore #4
    //   3428: aload #4
    //   3430: arraylength
    //   3431: istore #5
    //   3433: iconst_0
    //   3434: istore #6
    //   3436: iload #6
    //   3438: iload #5
    //   3440: if_icmpge -> 3576
    //   3443: aload #4
    //   3445: iload #6
    //   3447: aaload
    //   3448: astore #7
    //   3450: aload #7
    //   3452: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3455: pop
    //   3456: aload #7
    //   3458: invokevirtual getModifiers : ()I
    //   3461: invokestatic isStatic : (I)Z
    //   3464: ifeq -> 3562
    //   3467: aload #7
    //   3469: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3472: arraylength
    //   3473: iconst_2
    //   3474: if_icmpne -> 3562
    //   3477: goto -> 3484
    //   3480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3483: athrow
    //   3484: aload #7
    //   3486: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3489: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3492: if_acmpne -> 3562
    //   3495: goto -> 3502
    //   3498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3501: athrow
    //   3502: aload #7
    //   3504: iconst_1
    //   3505: invokevirtual setAccessible : (Z)V
    //   3508: aload #7
    //   3510: aconst_null
    //   3511: iconst_2
    //   3512: anewarray java/lang/Object
    //   3515: dup
    //   3516: iconst_0
    //   3517: aload_0
    //   3518: aastore
    //   3519: dup
    //   3520: iconst_1
    //   3521: aload_1
    //   3522: ifnonnull -> 3540
    //   3525: goto -> 3532
    //   3528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3531: athrow
    //   3532: aload_1
    //   3533: goto -> 3547
    //   3536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3539: athrow
    //   3540: aload_1
    //   3541: checkcast [B
    //   3544: invokevirtual clone : ()Ljava/lang/Object;
    //   3547: aastore
    //   3548: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3551: checkcast java/lang/Boolean
    //   3554: invokevirtual booleanValue : ()Z
    //   3557: istore_3
    //   3558: iload_2
    //   3559: ifeq -> 3576
    //   3562: iinc #6, 1
    //   3565: iload_2
    //   3566: ifeq -> 3436
    //   3569: goto -> 3576
    //   3572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3575: athrow
    //   3576: iload_3
    //   3577: ifeq -> 3582
    //   3580: iload_3
    //   3581: ireturn
    //   3582: getstatic burp/Zg7p.ZA : Ljava/lang/String;
    //   3585: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
    //   3588: checkcast java/math/BigInteger
    //   3591: invokevirtual intValue : ()I
    //   3594: bipush #32
    //   3596: irem
    //   3597: invokestatic abs : (I)I
    //   3600: invokevirtual charAt : (I)C
    //   3603: getstatic burp/Zxo6.Z_ : Ljava/lang/String;
    //   3606: getstatic burp/Zlos.Zk : Ljava/lang/Object;
    //   3609: checkcast java/math/BigInteger
    //   3612: invokevirtual intValue : ()I
    //   3615: bipush #32
    //   3617: irem
    //   3618: invokestatic abs : (I)I
    //   3621: invokevirtual charAt : (I)C
    //   3624: if_icmpgt -> 3969
    //   3627: sipush #-12491
    //   3630: sipush #19117
    //   3633: invokestatic a : (II)Ljava/lang/String;
    //   3636: iconst_1
    //   3637: ldc burp/Zgdj
    //   3639: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3642: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3645: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3648: astore #4
    //   3650: aload #4
    //   3652: arraylength
    //   3653: istore #5
    //   3655: iconst_0
    //   3656: istore #6
    //   3658: iload #6
    //   3660: iload #5
    //   3662: if_icmpge -> 3800
    //   3665: aload #4
    //   3667: iload #6
    //   3669: aaload
    //   3670: astore #7
    //   3672: aload #7
    //   3674: invokevirtual getModifiers : ()I
    //   3677: invokestatic isStatic : (I)Z
    //   3680: ifne -> 3690
    //   3683: goto -> 3793
    //   3686: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3689: athrow
    //   3690: aload #7
    //   3692: invokevirtual getType : ()Ljava/lang/Class;
    //   3695: astore #8
    //   3697: aload #8
    //   3699: ifnull -> 3780
    //   3702: aload #8
    //   3704: invokevirtual isPrimitive : ()Z
    //   3707: ifne -> 3780
    //   3710: goto -> 3717
    //   3713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3716: athrow
    //   3717: aload #8
    //   3719: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3722: ifnull -> 3780
    //   3725: goto -> 3732
    //   3728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3731: athrow
    //   3732: aload #8
    //   3734: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3737: invokevirtual getName : ()Ljava/lang/String;
    //   3740: ifnull -> 3780
    //   3743: goto -> 3750
    //   3746: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3749: athrow
    //   3750: aload #8
    //   3752: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3755: invokevirtual getName : ()Ljava/lang/String;
    //   3758: sipush #-12492
    //   3761: sipush #6502
    //   3764: invokestatic a : (II)Ljava/lang/String;
    //   3767: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3770: ifne -> 3780
    //   3773: goto -> 3780
    //   3776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3779: athrow
    //   3780: aload #7
    //   3782: iconst_1
    //   3783: invokevirtual setAccessible : (Z)V
    //   3786: aload #7
    //   3788: aconst_null
    //   3789: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3792: pop
    //   3793: iinc #6, 1
    //   3796: iload_2
    //   3797: ifeq -> 3658
    //   3800: sipush #-12494
    //   3803: sipush #15389
    //   3806: invokestatic a : (II)Ljava/lang/String;
    //   3809: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3812: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3815: astore #4
    //   3817: aload #4
    //   3819: arraylength
    //   3820: istore #5
    //   3822: iconst_0
    //   3823: istore #6
    //   3825: iload #6
    //   3827: iload #5
    //   3829: if_icmpge -> 3965
    //   3832: aload #4
    //   3834: iload #6
    //   3836: aaload
    //   3837: astore #7
    //   3839: aload #7
    //   3841: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3844: pop
    //   3845: aload #7
    //   3847: invokevirtual getModifiers : ()I
    //   3850: invokestatic isStatic : (I)Z
    //   3853: ifeq -> 3951
    //   3856: aload #7
    //   3858: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3861: arraylength
    //   3862: iconst_2
    //   3863: if_icmpne -> 3951
    //   3866: goto -> 3873
    //   3869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3872: athrow
    //   3873: aload #7
    //   3875: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3878: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3881: if_acmpne -> 3951
    //   3884: goto -> 3891
    //   3887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3890: athrow
    //   3891: aload #7
    //   3893: iconst_1
    //   3894: invokevirtual setAccessible : (Z)V
    //   3897: aload #7
    //   3899: aconst_null
    //   3900: iconst_2
    //   3901: anewarray java/lang/Object
    //   3904: dup
    //   3905: iconst_0
    //   3906: aload_0
    //   3907: aastore
    //   3908: dup
    //   3909: iconst_1
    //   3910: aload_1
    //   3911: ifnonnull -> 3929
    //   3914: goto -> 3921
    //   3917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3920: athrow
    //   3921: aload_1
    //   3922: goto -> 3936
    //   3925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3928: athrow
    //   3929: aload_1
    //   3930: checkcast [B
    //   3933: invokevirtual clone : ()Ljava/lang/Object;
    //   3936: aastore
    //   3937: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3940: checkcast java/lang/Boolean
    //   3943: invokevirtual booleanValue : ()Z
    //   3946: istore_3
    //   3947: iload_2
    //   3948: ifeq -> 3965
    //   3951: iinc #6, 1
    //   3954: iload_2
    //   3955: ifeq -> 3825
    //   3958: goto -> 3965
    //   3961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3964: athrow
    //   3965: iload_2
    //   3966: ifeq -> 4307
    //   3969: sipush #-12509
    //   3972: sipush #26238
    //   3975: invokestatic a : (II)Ljava/lang/String;
    //   3978: iconst_1
    //   3979: ldc burp/Zg7w
    //   3981: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3984: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3987: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3990: astore #4
    //   3992: aload #4
    //   3994: arraylength
    //   3995: istore #5
    //   3997: iconst_0
    //   3998: istore #6
    //   4000: iload #6
    //   4002: iload #5
    //   4004: if_icmpge -> 4142
    //   4007: aload #4
    //   4009: iload #6
    //   4011: aaload
    //   4012: astore #7
    //   4014: aload #7
    //   4016: invokevirtual getModifiers : ()I
    //   4019: invokestatic isStatic : (I)Z
    //   4022: ifne -> 4032
    //   4025: goto -> 4135
    //   4028: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4031: athrow
    //   4032: aload #7
    //   4034: invokevirtual getType : ()Ljava/lang/Class;
    //   4037: astore #8
    //   4039: aload #8
    //   4041: ifnull -> 4122
    //   4044: aload #8
    //   4046: invokevirtual isPrimitive : ()Z
    //   4049: ifne -> 4122
    //   4052: goto -> 4059
    //   4055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4058: athrow
    //   4059: aload #8
    //   4061: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4064: ifnull -> 4122
    //   4067: goto -> 4074
    //   4070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4073: athrow
    //   4074: aload #8
    //   4076: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4079: invokevirtual getName : ()Ljava/lang/String;
    //   4082: ifnull -> 4122
    //   4085: goto -> 4092
    //   4088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4091: athrow
    //   4092: aload #8
    //   4094: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4097: invokevirtual getName : ()Ljava/lang/String;
    //   4100: sipush #-12492
    //   4103: sipush #6502
    //   4106: invokestatic a : (II)Ljava/lang/String;
    //   4109: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4112: ifne -> 4122
    //   4115: goto -> 4122
    //   4118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4121: athrow
    //   4122: aload #7
    //   4124: iconst_1
    //   4125: invokevirtual setAccessible : (Z)V
    //   4128: aload #7
    //   4130: aconst_null
    //   4131: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4134: pop
    //   4135: iinc #6, 1
    //   4138: iload_2
    //   4139: ifeq -> 4000
    //   4142: sipush #-12482
    //   4145: sipush #13731
    //   4148: invokestatic a : (II)Ljava/lang/String;
    //   4151: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4154: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4157: astore #4
    //   4159: aload #4
    //   4161: arraylength
    //   4162: istore #5
    //   4164: iconst_0
    //   4165: istore #6
    //   4167: iload #6
    //   4169: iload #5
    //   4171: if_icmpge -> 4307
    //   4174: aload #4
    //   4176: iload #6
    //   4178: aaload
    //   4179: astore #7
    //   4181: aload #7
    //   4183: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4186: pop
    //   4187: aload #7
    //   4189: invokevirtual getModifiers : ()I
    //   4192: invokestatic isStatic : (I)Z
    //   4195: ifeq -> 4293
    //   4198: aload #7
    //   4200: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4203: arraylength
    //   4204: iconst_2
    //   4205: if_icmpne -> 4293
    //   4208: goto -> 4215
    //   4211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4214: athrow
    //   4215: aload #7
    //   4217: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4220: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4223: if_acmpne -> 4293
    //   4226: goto -> 4233
    //   4229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4232: athrow
    //   4233: aload #7
    //   4235: iconst_1
    //   4236: invokevirtual setAccessible : (Z)V
    //   4239: aload #7
    //   4241: aconst_null
    //   4242: iconst_2
    //   4243: anewarray java/lang/Object
    //   4246: dup
    //   4247: iconst_0
    //   4248: aload_0
    //   4249: aastore
    //   4250: dup
    //   4251: iconst_1
    //   4252: aload_1
    //   4253: ifnonnull -> 4271
    //   4256: goto -> 4263
    //   4259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4262: athrow
    //   4263: aload_1
    //   4264: goto -> 4278
    //   4267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4270: athrow
    //   4271: aload_1
    //   4272: checkcast [B
    //   4275: invokevirtual clone : ()Ljava/lang/Object;
    //   4278: aastore
    //   4279: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4282: checkcast java/lang/Boolean
    //   4285: invokevirtual booleanValue : ()Z
    //   4288: istore_3
    //   4289: iload_2
    //   4290: ifeq -> 4307
    //   4293: iinc #6, 1
    //   4296: iload_2
    //   4297: ifeq -> 4167
    //   4300: goto -> 4307
    //   4303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4306: athrow
    //   4307: iload_3
    //   4308: ifeq -> 4313
    //   4311: iload_3
    //   4312: ireturn
    //   4313: getstatic burp/Zm0s.Zm : Ljava/lang/String;
    //   4316: getstatic burp/Zsm3.ZC : Ljava/lang/Object;
    //   4319: checkcast java/math/BigInteger
    //   4322: invokevirtual intValue : ()I
    //   4325: bipush #32
    //   4327: irem
    //   4328: invokestatic abs : (I)I
    //   4331: invokevirtual charAt : (I)C
    //   4334: getstatic burp/Zk9s.ZM : Ljava/lang/String;
    //   4337: getstatic burp/Zxso.ZF : Ljava/lang/Object;
    //   4340: checkcast java/math/BigInteger
    //   4343: invokevirtual intValue : ()I
    //   4346: bipush #32
    //   4348: irem
    //   4349: invokestatic abs : (I)I
    //   4352: invokevirtual charAt : (I)C
    //   4355: if_icmpgt -> 4700
    //   4358: sipush #-12506
    //   4361: sipush #23941
    //   4364: invokestatic a : (II)Ljava/lang/String;
    //   4367: iconst_1
    //   4368: ldc burp/Zk7o
    //   4370: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4373: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4376: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4379: astore #4
    //   4381: aload #4
    //   4383: arraylength
    //   4384: istore #5
    //   4386: iconst_0
    //   4387: istore #6
    //   4389: iload #6
    //   4391: iload #5
    //   4393: if_icmpge -> 4531
    //   4396: aload #4
    //   4398: iload #6
    //   4400: aaload
    //   4401: astore #7
    //   4403: aload #7
    //   4405: invokevirtual getModifiers : ()I
    //   4408: invokestatic isStatic : (I)Z
    //   4411: ifne -> 4421
    //   4414: goto -> 4524
    //   4417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4420: athrow
    //   4421: aload #7
    //   4423: invokevirtual getType : ()Ljava/lang/Class;
    //   4426: astore #8
    //   4428: aload #8
    //   4430: ifnull -> 4511
    //   4433: aload #8
    //   4435: invokevirtual isPrimitive : ()Z
    //   4438: ifne -> 4511
    //   4441: goto -> 4448
    //   4444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4447: athrow
    //   4448: aload #8
    //   4450: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4453: ifnull -> 4511
    //   4456: goto -> 4463
    //   4459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4462: athrow
    //   4463: aload #8
    //   4465: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4468: invokevirtual getName : ()Ljava/lang/String;
    //   4471: ifnull -> 4511
    //   4474: goto -> 4481
    //   4477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4480: athrow
    //   4481: aload #8
    //   4483: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4486: invokevirtual getName : ()Ljava/lang/String;
    //   4489: sipush #-12492
    //   4492: sipush #6502
    //   4495: invokestatic a : (II)Ljava/lang/String;
    //   4498: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4501: ifne -> 4511
    //   4504: goto -> 4511
    //   4507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4510: athrow
    //   4511: aload #7
    //   4513: iconst_1
    //   4514: invokevirtual setAccessible : (Z)V
    //   4517: aload #7
    //   4519: aconst_null
    //   4520: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4523: pop
    //   4524: iinc #6, 1
    //   4527: iload_2
    //   4528: ifeq -> 4389
    //   4531: sipush #-12496
    //   4534: sipush #5394
    //   4537: invokestatic a : (II)Ljava/lang/String;
    //   4540: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4543: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4546: astore #4
    //   4548: aload #4
    //   4550: arraylength
    //   4551: istore #5
    //   4553: iconst_0
    //   4554: istore #6
    //   4556: iload #6
    //   4558: iload #5
    //   4560: if_icmpge -> 4696
    //   4563: aload #4
    //   4565: iload #6
    //   4567: aaload
    //   4568: astore #7
    //   4570: aload #7
    //   4572: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4575: pop
    //   4576: aload #7
    //   4578: invokevirtual getModifiers : ()I
    //   4581: invokestatic isStatic : (I)Z
    //   4584: ifeq -> 4682
    //   4587: aload #7
    //   4589: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4592: arraylength
    //   4593: iconst_2
    //   4594: if_icmpne -> 4682
    //   4597: goto -> 4604
    //   4600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4603: athrow
    //   4604: aload #7
    //   4606: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4609: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4612: if_acmpne -> 4682
    //   4615: goto -> 4622
    //   4618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4621: athrow
    //   4622: aload #7
    //   4624: iconst_1
    //   4625: invokevirtual setAccessible : (Z)V
    //   4628: aload #7
    //   4630: aconst_null
    //   4631: iconst_2
    //   4632: anewarray java/lang/Object
    //   4635: dup
    //   4636: iconst_0
    //   4637: aload_0
    //   4638: aastore
    //   4639: dup
    //   4640: iconst_1
    //   4641: aload_1
    //   4642: ifnonnull -> 4660
    //   4645: goto -> 4652
    //   4648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4651: athrow
    //   4652: aload_1
    //   4653: goto -> 4667
    //   4656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4659: athrow
    //   4660: aload_1
    //   4661: checkcast [B
    //   4664: invokevirtual clone : ()Ljava/lang/Object;
    //   4667: aastore
    //   4668: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4671: checkcast java/lang/Boolean
    //   4674: invokevirtual booleanValue : ()Z
    //   4677: istore_3
    //   4678: iload_2
    //   4679: ifeq -> 4696
    //   4682: iinc #6, 1
    //   4685: iload_2
    //   4686: ifeq -> 4556
    //   4689: goto -> 4696
    //   4692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4695: athrow
    //   4696: iload_2
    //   4697: ifeq -> 5038
    //   4700: sipush #-12498
    //   4703: sipush #25599
    //   4706: invokestatic a : (II)Ljava/lang/String;
    //   4709: iconst_1
    //   4710: ldc burp/Ztfh
    //   4712: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4715: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4718: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4721: astore #4
    //   4723: aload #4
    //   4725: arraylength
    //   4726: istore #5
    //   4728: iconst_0
    //   4729: istore #6
    //   4731: iload #6
    //   4733: iload #5
    //   4735: if_icmpge -> 4873
    //   4738: aload #4
    //   4740: iload #6
    //   4742: aaload
    //   4743: astore #7
    //   4745: aload #7
    //   4747: invokevirtual getModifiers : ()I
    //   4750: invokestatic isStatic : (I)Z
    //   4753: ifne -> 4763
    //   4756: goto -> 4866
    //   4759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4762: athrow
    //   4763: aload #7
    //   4765: invokevirtual getType : ()Ljava/lang/Class;
    //   4768: astore #8
    //   4770: aload #8
    //   4772: ifnull -> 4853
    //   4775: aload #8
    //   4777: invokevirtual isPrimitive : ()Z
    //   4780: ifne -> 4853
    //   4783: goto -> 4790
    //   4786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4789: athrow
    //   4790: aload #8
    //   4792: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4795: ifnull -> 4853
    //   4798: goto -> 4805
    //   4801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4804: athrow
    //   4805: aload #8
    //   4807: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4810: invokevirtual getName : ()Ljava/lang/String;
    //   4813: ifnull -> 4853
    //   4816: goto -> 4823
    //   4819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4822: athrow
    //   4823: aload #8
    //   4825: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4828: invokevirtual getName : ()Ljava/lang/String;
    //   4831: sipush #-12492
    //   4834: sipush #6502
    //   4837: invokestatic a : (II)Ljava/lang/String;
    //   4840: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4843: ifne -> 4853
    //   4846: goto -> 4853
    //   4849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4852: athrow
    //   4853: aload #7
    //   4855: iconst_1
    //   4856: invokevirtual setAccessible : (Z)V
    //   4859: aload #7
    //   4861: aconst_null
    //   4862: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4865: pop
    //   4866: iinc #6, 1
    //   4869: iload_2
    //   4870: ifeq -> 4731
    //   4873: sipush #-12483
    //   4876: sipush #-22001
    //   4879: invokestatic a : (II)Ljava/lang/String;
    //   4882: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4885: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4888: astore #4
    //   4890: aload #4
    //   4892: arraylength
    //   4893: istore #5
    //   4895: iconst_0
    //   4896: istore #6
    //   4898: iload #6
    //   4900: iload #5
    //   4902: if_icmpge -> 5038
    //   4905: aload #4
    //   4907: iload #6
    //   4909: aaload
    //   4910: astore #7
    //   4912: aload #7
    //   4914: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4917: pop
    //   4918: aload #7
    //   4920: invokevirtual getModifiers : ()I
    //   4923: invokestatic isStatic : (I)Z
    //   4926: ifeq -> 5024
    //   4929: aload #7
    //   4931: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4934: arraylength
    //   4935: iconst_2
    //   4936: if_icmpne -> 5024
    //   4939: goto -> 4946
    //   4942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4945: athrow
    //   4946: aload #7
    //   4948: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4951: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4954: if_acmpne -> 5024
    //   4957: goto -> 4964
    //   4960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4963: athrow
    //   4964: aload #7
    //   4966: iconst_1
    //   4967: invokevirtual setAccessible : (Z)V
    //   4970: aload #7
    //   4972: aconst_null
    //   4973: iconst_2
    //   4974: anewarray java/lang/Object
    //   4977: dup
    //   4978: iconst_0
    //   4979: aload_0
    //   4980: aastore
    //   4981: dup
    //   4982: iconst_1
    //   4983: aload_1
    //   4984: ifnonnull -> 5002
    //   4987: goto -> 4994
    //   4990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4993: athrow
    //   4994: aload_1
    //   4995: goto -> 5009
    //   4998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5001: athrow
    //   5002: aload_1
    //   5003: checkcast [B
    //   5006: invokevirtual clone : ()Ljava/lang/Object;
    //   5009: aastore
    //   5010: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5013: checkcast java/lang/Boolean
    //   5016: invokevirtual booleanValue : ()Z
    //   5019: istore_3
    //   5020: iload_2
    //   5021: ifeq -> 5038
    //   5024: iinc #6, 1
    //   5027: iload_2
    //   5028: ifeq -> 4898
    //   5031: goto -> 5038
    //   5034: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5037: athrow
    //   5038: iload_3
    //   5039: ifeq -> 5044
    //   5042: iload_3
    //   5043: ireturn
    //   5044: getstatic burp/Zxfu.Zo : Ljava/lang/String;
    //   5047: getstatic burp/Zrnu.Zs : Ljava/lang/Object;
    //   5050: checkcast java/math/BigInteger
    //   5053: invokevirtual intValue : ()I
    //   5056: bipush #32
    //   5058: irem
    //   5059: invokestatic abs : (I)I
    //   5062: invokevirtual charAt : (I)C
    //   5065: getstatic burp/Zter.ZE : Ljava/lang/String;
    //   5068: getstatic burp/Zzqj.Zq : Ljava/lang/Object;
    //   5071: checkcast java/math/BigInteger
    //   5074: invokevirtual intValue : ()I
    //   5077: bipush #32
    //   5079: irem
    //   5080: invokestatic abs : (I)I
    //   5083: invokevirtual charAt : (I)C
    //   5086: if_icmple -> 5431
    //   5089: sipush #-12484
    //   5092: sipush #-850
    //   5095: invokestatic a : (II)Ljava/lang/String;
    //   5098: iconst_1
    //   5099: ldc burp/Zlzs
    //   5101: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5104: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5107: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5110: astore #4
    //   5112: aload #4
    //   5114: arraylength
    //   5115: istore #5
    //   5117: iconst_0
    //   5118: istore #6
    //   5120: iload #6
    //   5122: iload #5
    //   5124: if_icmpge -> 5262
    //   5127: aload #4
    //   5129: iload #6
    //   5131: aaload
    //   5132: astore #7
    //   5134: aload #7
    //   5136: invokevirtual getModifiers : ()I
    //   5139: invokestatic isStatic : (I)Z
    //   5142: ifne -> 5152
    //   5145: goto -> 5255
    //   5148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5151: athrow
    //   5152: aload #7
    //   5154: invokevirtual getType : ()Ljava/lang/Class;
    //   5157: astore #8
    //   5159: aload #8
    //   5161: ifnull -> 5242
    //   5164: aload #8
    //   5166: invokevirtual isPrimitive : ()Z
    //   5169: ifne -> 5242
    //   5172: goto -> 5179
    //   5175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5178: athrow
    //   5179: aload #8
    //   5181: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5184: ifnull -> 5242
    //   5187: goto -> 5194
    //   5190: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5193: athrow
    //   5194: aload #8
    //   5196: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5199: invokevirtual getName : ()Ljava/lang/String;
    //   5202: ifnull -> 5242
    //   5205: goto -> 5212
    //   5208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5211: athrow
    //   5212: aload #8
    //   5214: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5217: invokevirtual getName : ()Ljava/lang/String;
    //   5220: sipush #-12492
    //   5223: sipush #6502
    //   5226: invokestatic a : (II)Ljava/lang/String;
    //   5229: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5232: ifne -> 5242
    //   5235: goto -> 5242
    //   5238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5241: athrow
    //   5242: aload #7
    //   5244: iconst_1
    //   5245: invokevirtual setAccessible : (Z)V
    //   5248: aload #7
    //   5250: aconst_null
    //   5251: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5254: pop
    //   5255: iinc #6, 1
    //   5258: iload_2
    //   5259: ifeq -> 5120
    //   5262: sipush #-12511
    //   5265: sipush #7266
    //   5268: invokestatic a : (II)Ljava/lang/String;
    //   5271: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5274: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5277: astore #4
    //   5279: aload #4
    //   5281: arraylength
    //   5282: istore #5
    //   5284: iconst_0
    //   5285: istore #6
    //   5287: iload #6
    //   5289: iload #5
    //   5291: if_icmpge -> 5427
    //   5294: aload #4
    //   5296: iload #6
    //   5298: aaload
    //   5299: astore #7
    //   5301: aload #7
    //   5303: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5306: pop
    //   5307: aload #7
    //   5309: invokevirtual getModifiers : ()I
    //   5312: invokestatic isStatic : (I)Z
    //   5315: ifeq -> 5413
    //   5318: aload #7
    //   5320: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5323: arraylength
    //   5324: iconst_2
    //   5325: if_icmpne -> 5413
    //   5328: goto -> 5335
    //   5331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5334: athrow
    //   5335: aload #7
    //   5337: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5340: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5343: if_acmpne -> 5413
    //   5346: goto -> 5353
    //   5349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5352: athrow
    //   5353: aload #7
    //   5355: iconst_1
    //   5356: invokevirtual setAccessible : (Z)V
    //   5359: aload #7
    //   5361: aconst_null
    //   5362: iconst_2
    //   5363: anewarray java/lang/Object
    //   5366: dup
    //   5367: iconst_0
    //   5368: aload_0
    //   5369: aastore
    //   5370: dup
    //   5371: iconst_1
    //   5372: aload_1
    //   5373: ifnonnull -> 5391
    //   5376: goto -> 5383
    //   5379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5382: athrow
    //   5383: aload_1
    //   5384: goto -> 5398
    //   5387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5390: athrow
    //   5391: aload_1
    //   5392: checkcast [B
    //   5395: invokevirtual clone : ()Ljava/lang/Object;
    //   5398: aastore
    //   5399: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5402: checkcast java/lang/Boolean
    //   5405: invokevirtual booleanValue : ()Z
    //   5408: istore_3
    //   5409: iload_2
    //   5410: ifeq -> 5427
    //   5413: iinc #6, 1
    //   5416: iload_2
    //   5417: ifeq -> 5287
    //   5420: goto -> 5427
    //   5423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5426: athrow
    //   5427: iload_2
    //   5428: ifeq -> 5769
    //   5431: sipush #-12512
    //   5434: sipush #26852
    //   5437: invokestatic a : (II)Ljava/lang/String;
    //   5440: iconst_1
    //   5441: ldc burp/Zlid
    //   5443: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5446: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5449: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5452: astore #4
    //   5454: aload #4
    //   5456: arraylength
    //   5457: istore #5
    //   5459: iconst_0
    //   5460: istore #6
    //   5462: iload #6
    //   5464: iload #5
    //   5466: if_icmpge -> 5604
    //   5469: aload #4
    //   5471: iload #6
    //   5473: aaload
    //   5474: astore #7
    //   5476: aload #7
    //   5478: invokevirtual getModifiers : ()I
    //   5481: invokestatic isStatic : (I)Z
    //   5484: ifne -> 5494
    //   5487: goto -> 5597
    //   5490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5493: athrow
    //   5494: aload #7
    //   5496: invokevirtual getType : ()Ljava/lang/Class;
    //   5499: astore #8
    //   5501: aload #8
    //   5503: ifnull -> 5584
    //   5506: aload #8
    //   5508: invokevirtual isPrimitive : ()Z
    //   5511: ifne -> 5584
    //   5514: goto -> 5521
    //   5517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5520: athrow
    //   5521: aload #8
    //   5523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5526: ifnull -> 5584
    //   5529: goto -> 5536
    //   5532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5535: athrow
    //   5536: aload #8
    //   5538: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5541: invokevirtual getName : ()Ljava/lang/String;
    //   5544: ifnull -> 5584
    //   5547: goto -> 5554
    //   5550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5553: athrow
    //   5554: aload #8
    //   5556: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5559: invokevirtual getName : ()Ljava/lang/String;
    //   5562: sipush #-12492
    //   5565: sipush #6502
    //   5568: invokestatic a : (II)Ljava/lang/String;
    //   5571: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5574: ifne -> 5584
    //   5577: goto -> 5584
    //   5580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5583: athrow
    //   5584: aload #7
    //   5586: iconst_1
    //   5587: invokevirtual setAccessible : (Z)V
    //   5590: aload #7
    //   5592: aconst_null
    //   5593: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5596: pop
    //   5597: iinc #6, 1
    //   5600: iload_2
    //   5601: ifeq -> 5462
    //   5604: sipush #-12499
    //   5607: sipush #-3595
    //   5610: invokestatic a : (II)Ljava/lang/String;
    //   5613: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5616: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5619: astore #4
    //   5621: aload #4
    //   5623: arraylength
    //   5624: istore #5
    //   5626: iconst_0
    //   5627: istore #6
    //   5629: iload #6
    //   5631: iload #5
    //   5633: if_icmpge -> 5769
    //   5636: aload #4
    //   5638: iload #6
    //   5640: aaload
    //   5641: astore #7
    //   5643: aload #7
    //   5645: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5648: pop
    //   5649: aload #7
    //   5651: invokevirtual getModifiers : ()I
    //   5654: invokestatic isStatic : (I)Z
    //   5657: ifeq -> 5755
    //   5660: aload #7
    //   5662: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5665: arraylength
    //   5666: iconst_2
    //   5667: if_icmpne -> 5755
    //   5670: goto -> 5677
    //   5673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5676: athrow
    //   5677: aload #7
    //   5679: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5682: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5685: if_acmpne -> 5755
    //   5688: goto -> 5695
    //   5691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5694: athrow
    //   5695: aload #7
    //   5697: iconst_1
    //   5698: invokevirtual setAccessible : (Z)V
    //   5701: aload #7
    //   5703: aconst_null
    //   5704: iconst_2
    //   5705: anewarray java/lang/Object
    //   5708: dup
    //   5709: iconst_0
    //   5710: aload_0
    //   5711: aastore
    //   5712: dup
    //   5713: iconst_1
    //   5714: aload_1
    //   5715: ifnonnull -> 5733
    //   5718: goto -> 5725
    //   5721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5724: athrow
    //   5725: aload_1
    //   5726: goto -> 5740
    //   5729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5732: athrow
    //   5733: aload_1
    //   5734: checkcast [B
    //   5737: invokevirtual clone : ()Ljava/lang/Object;
    //   5740: aastore
    //   5741: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5744: checkcast java/lang/Boolean
    //   5747: invokevirtual booleanValue : ()Z
    //   5750: istore_3
    //   5751: iload_2
    //   5752: ifeq -> 5769
    //   5755: iinc #6, 1
    //   5758: iload_2
    //   5759: ifeq -> 5629
    //   5762: goto -> 5769
    //   5765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5768: athrow
    //   5769: iload_3
    //   5770: ireturn
    //   5771: astore_3
    //   5772: new java/lang/Exception
    //   5775: dup
    //   5776: aload_3
    //   5777: invokevirtual getMessage : ()Ljava/lang/String;
    //   5780: invokespecial <init> : (Ljava/lang/String;)V
    //   5783: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3581	5771	java/lang/Throwable
    //   149	164	164	java/lang/Throwable
    //   1166	1192	1192	java/lang/Throwable
    //   1273	1288	1288	java/lang/Throwable
    //   2470	2495	2498	java/lang/Throwable
    //   2563	2577	2577	java/lang/Throwable
    //   2588	2601	2604	java/lang/Throwable
    //   2593	2616	2619	java/lang/Throwable
    //   2608	2634	2637	java/lang/Throwable
    //   2623	2664	2667	java/lang/Throwable
    //   2727	2754	2757	java/lang/Throwable
    //   2744	2775	2778	java/lang/Throwable
    //   2761	2805	2808	java/lang/Throwable
    //   2782	2816	2816	java/lang/Throwable
    //   2827	2843	2846	java/lang/Throwable
    //   2942	2956	2956	java/lang/Throwable
    //   2967	2980	2983	java/lang/Throwable
    //   2972	2995	2998	java/lang/Throwable
    //   2987	3013	3016	java/lang/Throwable
    //   3002	3043	3046	java/lang/Throwable
    //   3109	3136	3139	java/lang/Throwable
    //   3126	3154	3157	java/lang/Throwable
    //   3143	3184	3187	java/lang/Throwable
    //   3161	3195	3195	java/lang/Throwable
    //   3217	3228	3231	java/lang/Throwable
    //   3283	3297	3297	java/lang/Throwable
    //   3308	3321	3324	java/lang/Throwable
    //   3313	3336	3339	java/lang/Throwable
    //   3328	3354	3357	java/lang/Throwable
    //   3343	3384	3387	java/lang/Throwable
    //   3450	3477	3480	java/lang/Throwable
    //   3467	3495	3498	java/lang/Throwable
    //   3484	3525	3528	java/lang/Throwable
    //   3502	3536	3536	java/lang/Throwable
    //   3558	3569	3572	java/lang/Throwable
    //   3582	4312	5771	java/lang/Throwable
    //   3672	3686	3686	java/lang/Throwable
    //   3697	3710	3713	java/lang/Throwable
    //   3702	3725	3728	java/lang/Throwable
    //   3717	3743	3746	java/lang/Throwable
    //   3732	3773	3776	java/lang/Throwable
    //   3839	3866	3869	java/lang/Throwable
    //   3856	3884	3887	java/lang/Throwable
    //   3873	3914	3917	java/lang/Throwable
    //   3891	3925	3925	java/lang/Throwable
    //   3947	3958	3961	java/lang/Throwable
    //   4014	4028	4028	java/lang/Throwable
    //   4039	4052	4055	java/lang/Throwable
    //   4044	4067	4070	java/lang/Throwable
    //   4059	4085	4088	java/lang/Throwable
    //   4074	4115	4118	java/lang/Throwable
    //   4181	4208	4211	java/lang/Throwable
    //   4198	4226	4229	java/lang/Throwable
    //   4215	4256	4259	java/lang/Throwable
    //   4233	4267	4267	java/lang/Throwable
    //   4289	4300	4303	java/lang/Throwable
    //   4313	5043	5771	java/lang/Throwable
    //   4403	4417	4417	java/lang/Throwable
    //   4428	4441	4444	java/lang/Throwable
    //   4433	4456	4459	java/lang/Throwable
    //   4448	4474	4477	java/lang/Throwable
    //   4463	4504	4507	java/lang/Throwable
    //   4570	4597	4600	java/lang/Throwable
    //   4587	4615	4618	java/lang/Throwable
    //   4604	4645	4648	java/lang/Throwable
    //   4622	4656	4656	java/lang/Throwable
    //   4678	4689	4692	java/lang/Throwable
    //   4745	4759	4759	java/lang/Throwable
    //   4770	4783	4786	java/lang/Throwable
    //   4775	4798	4801	java/lang/Throwable
    //   4790	4816	4819	java/lang/Throwable
    //   4805	4846	4849	java/lang/Throwable
    //   4912	4939	4942	java/lang/Throwable
    //   4929	4957	4960	java/lang/Throwable
    //   4946	4987	4990	java/lang/Throwable
    //   4964	4998	4998	java/lang/Throwable
    //   5020	5031	5034	java/lang/Throwable
    //   5044	5770	5771	java/lang/Throwable
    //   5134	5148	5148	java/lang/Throwable
    //   5159	5172	5175	java/lang/Throwable
    //   5164	5187	5190	java/lang/Throwable
    //   5179	5205	5208	java/lang/Throwable
    //   5194	5235	5238	java/lang/Throwable
    //   5301	5328	5331	java/lang/Throwable
    //   5318	5346	5349	java/lang/Throwable
    //   5335	5376	5379	java/lang/Throwable
    //   5353	5387	5387	java/lang/Throwable
    //   5409	5420	5423	java/lang/Throwable
    //   5476	5490	5490	java/lang/Throwable
    //   5501	5514	5517	java/lang/Throwable
    //   5506	5529	5532	java/lang/Throwable
    //   5521	5547	5550	java/lang/Throwable
    //   5536	5577	5580	java/lang/Throwable
    //   5643	5670	5673	java/lang/Throwable
    //   5660	5688	5691	java/lang/Throwable
    //   5677	5718	5721	java/lang/Throwable
    //   5695	5729	5729	java/lang/Throwable
    //   5751	5762	5765	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '·W½ÀofqãÅÓr'BP¦5Ý§µ×úç¿\\t«>HwgÛüTÔ \\tÎt¤êÔ#C\\tùÃtRV4N³* côÑnÙ[Ã«I¡`\\rc,Ö¾TQþ:ã¦Ûrkëvp\\t0(M/q¼\ùL¤á(Å _sóÉ¶nIÑ®Ñ="Û\\bìÇ cN­-n·üh*>´ûÅ®Áý«Î@øÍóçCä;z»pÈN(«ñLeÞ\\tM¤â¾©@,\\bð[4³øî6\\tHBOÞ#\\tÍòëST6 ÈG)y+ÿÉ((IÉ³ð3þbÙuÕdZíMÚdí-1wP\\ttªþ¤\1ð³ÌNT!Ý¦àiÁ»-ó¼(Ù``¯Ê'Ûc²§\\f³HVïÖ Ä'Oå% ¶K ·QÏ\\t\º¡Jt7W提睍濹み朳︅ꬂ쪛즒啕䞺귓ꈊ鳌牏띃鎖㛟㒚焎ㅈф⎷᡻׋ݥ胆늒ओⳉᯣ媜剰횃⤰⿻匒 뇌檞븑䫧墩탊ꪤ䎒㎂䗎ː偹鼾八䁡鈰㠦뱔?ဉ춹Ꮡ徬䒖쐍縆擳ᦽ怞俷⊒遫䛏뢼?்㫙䧬␰싔갧醱㜧赺仑波攻긞며◸ᲃ뒦瑔䬈讦瀩딵䡋憾圞蛟᷏頱槽踀鮉螵캥⣡豾褂뼽䉎䅞⶿끩뮛\\tÅöóô¦àW'ê\\tÍXò!Z_2揨眊漑ゟ朮︙ꮡ쨘짦降䜴귝ꋛ鰍牵띻鏑㛘㑺焒㇫Ӈ⏃᠋Յݫ耗늨फⲎᯤ婴劐횞⤬⽘厑î⁹녂檐뻀䨦墓탲ꫣ䎕㍪䔮ˍ健龝凨䀕鉀㢨뱚?჈춁᎖徫䑾쓭縛擯ᤞ悝侃⋢郥䛁롭?௷㪞䧫ⓘ숴갺醭㝓贊也泬旺긤멈▿ᲄ둎瑉䬔謅炪땁䠻憰埏蘞᷵顶槺軨魩螨캹⡂賽襶뽍䋀䅐⵮남뮡\\t?L¬£M\\n$}OÝ®ðÿ\\t)hn'2lm\\tSÌ!³ü\\b{\\tÚÆòÚ Ô}\\bÖqêþÅö\\t;\,¡]J;3\\b'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #13
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
    //   68: ldc 'ÉTOË\\tææËªýwy'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #54
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
    //   129: putstatic burp/Ztbf.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztbf.b : [Ljava/lang/String;
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
    //   212: bipush #23
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #89
    //   224: goto -> 244
    //   227: bipush #78
    //   229: goto -> 244
    //   232: bipush #77
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #25
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
    //   300: sipush #-12495
    //   303: sipush #30704
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztbf.Zf : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-12487
    //   319: sipush #15084
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Ztbf.Zv : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCF37) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */