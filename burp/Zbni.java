package burp;

public class Zbni {
  static final Zm80 Zg;
  
  static final Zm80 Zt;
  
  static final Zm80 ZR;
  
  static final Zm80 ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static void Zc(String paramString1, String paramString2) {
    Zm(paramString1, ZA(paramString2));
  }
  
  private static void Zm(String paramString, Zkdd paramZkdd) {
    Zg.ZF(paramString, paramZkdd);
  }
  
  private static void ZL(String paramString1, String paramString2) {
    ZS(paramString1, ZA(paramString2));
  }
  
  private static void ZS(String paramString, Zkdd paramZkdd) {
    Zt.ZF(paramString, paramZkdd);
  }
  
  private static void ZZ(String paramString1, String paramString2) {
    ZY.ZF(paramString1, ZA(paramString2));
  }
  
  private static void ZA(String paramString, Zkdd paramZkdd) {
    ZR.ZF(paramString, paramZkdd);
  }
  
  private static Zkdd Zx(String paramString) {
    return new Zs3r(paramString);
  }
  
  private static Zkdd ZA(String paramString) {
    return new Ztqy(paramString);
  }
  
  public static String Zu(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return "a"; 
    switch (paramString.charAt(0)) {
      case 'a':
      case 'e':
      case 'h':
      case 'i':
      case 'o':
      case 'u':
        return a(27578, -20063);
    } 
    return "a";
  }
  
  static {
    // Byte code:
    //   0: bipush #66
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'µÅO/X±®i\\rð¦z\\nrÄª0³\\n'=BH¦©:?¥`\ÛË·È£Êµ\\b{;yeÅs¯2E~ÇhTÑF¦Çt 6h=®J«Â:dôhSòH\\n9­ÚJQL<Ûô\\f|Ã µK4cßiÅßeBº"ýs¶]he\\bSà«¹#¤­SæËÿqè}y¨µFÃÈßI¾¾-Åvy ü×ÄÍ(\\tª3ích¢ÌÄâh@½ç-æõèÞÔ\\n?(*í·ºuÙ+Qrþ0½?ÏÈ*üØâj\\bbré®Êû}¾Þª×ÛËñj½(^¥V5Í4fÖ¡±wJ4~Ç[eê«T@øåóE\\fálÓ\\nÖÄs\\t³Ï|®Uê#1£w@ÖÒþPmó8+\\b]_´sÜÛÂ½ïZ-5 ÖÔôÞÙ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #98
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '*úß\\b9ä¾Q½'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #89
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
    //   128: putstatic burp/Zbni.a : [Ljava/lang/String;
    //   131: bipush #66
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbni.b : [Ljava/lang/String;
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
    //   212: bipush #101
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #44
    //   229: goto -> 244
    //   232: bipush #70
    //   234: goto -> 244
    //   237: bipush #85
    //   239: goto -> 244
    //   242: bipush #40
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new burp/Zlye
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zbni.Zg : Lburp/Zm80;
    //   310: sipush #27572
    //   313: new burp/Zlya
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: putstatic burp/Zbni.Zt : Lburp/Zm80;
    //   323: sipush #-30919
    //   326: new burp/Zlym
    //   329: dup
    //   330: invokespecial <init> : ()V
    //   333: putstatic burp/Zbni.ZR : Lburp/Zm80;
    //   336: new burp/Zlyb
    //   339: dup
    //   340: invokespecial <init> : ()V
    //   343: putstatic burp/Zbni.ZY : Lburp/Zm80;
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: sipush #27561
    //   352: sipush #8678
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   361: sipush #27547
    //   364: sipush #20904
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: sipush #27600
    //   373: sipush #-11962
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   382: sipush #27540
    //   385: sipush #-21693
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: sipush #27564
    //   394: sipush #19207
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   403: sipush #27521
    //   406: sipush #15535
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: sipush #27564
    //   415: sipush #19207
    //   418: invokestatic a : (II)Ljava/lang/String;
    //   421: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   424: sipush #27583
    //   427: sipush #-13676
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: sipush #27564
    //   436: sipush #19207
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   445: sipush #27553
    //   448: sipush #32660
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: sipush #27580
    //   457: sipush #16504
    //   460: invokestatic a : (II)Ljava/lang/String;
    //   463: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   466: sipush #27575
    //   469: sipush #-8440
    //   472: invokestatic a : (II)Ljava/lang/String;
    //   475: sipush #27557
    //   478: sipush #9563
    //   481: invokestatic a : (II)Ljava/lang/String;
    //   484: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   487: sipush #27560
    //   490: sipush #-725
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: sipush #27541
    //   499: sipush #32668
    //   502: invokestatic a : (II)Ljava/lang/String;
    //   505: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   508: sipush #27560
    //   511: sipush #-725
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: sipush #27528
    //   520: sipush #18630
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   529: sipush #27560
    //   532: sipush #-725
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: sipush #27553
    //   541: sipush #32660
    //   544: invokestatic a : (II)Ljava/lang/String;
    //   547: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   550: sipush #27553
    //   553: sipush #32660
    //   556: invokestatic a : (II)Ljava/lang/String;
    //   559: sipush #27533
    //   562: sipush #-24834
    //   565: invokestatic a : (II)Ljava/lang/String;
    //   568: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   571: sipush #27559
    //   574: sipush #615
    //   577: invokestatic a : (II)Ljava/lang/String;
    //   580: sipush #27539
    //   583: sipush #-31028
    //   586: invokestatic a : (II)Ljava/lang/String;
    //   589: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   592: sipush #27559
    //   595: sipush #615
    //   598: invokestatic a : (II)Ljava/lang/String;
    //   601: sipush #27568
    //   604: sipush #-1861
    //   607: invokestatic a : (II)Ljava/lang/String;
    //   610: invokestatic ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   613: sipush #27526
    //   616: sipush #18104
    //   619: invokestatic a : (II)Ljava/lang/String;
    //   622: sipush #27529
    //   625: sipush #-12079
    //   628: invokestatic a : (II)Ljava/lang/String;
    //   631: invokestatic Zx : (Ljava/lang/String;)Lburp/Zkdd;
    //   634: invokestatic ZS : (Ljava/lang/String;Lburp/Zkdd;)V
    //   637: sipush #27573
    //   640: sipush #-5960
    //   643: invokestatic a : (II)Ljava/lang/String;
    //   646: sipush #27567
    //   649: sipush #9989
    //   652: invokestatic a : (II)Ljava/lang/String;
    //   655: invokestatic ZZ : (Ljava/lang/String;Ljava/lang/String;)V
    //   658: sipush #27554
    //   661: sipush #-26983
    //   664: invokestatic a : (II)Ljava/lang/String;
    //   667: sipush #27520
    //   670: sipush #240
    //   673: invokestatic a : (II)Ljava/lang/String;
    //   676: invokestatic Zx : (Ljava/lang/String;)Lburp/Zkdd;
    //   679: invokestatic ZA : (Ljava/lang/String;Lburp/Zkdd;)V
    //   682: ldc 'a'
    //   684: sipush #27546
    //   687: sipush #-28646
    //   690: invokestatic a : (II)Ljava/lang/String;
    //   693: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   696: sipush #27570
    //   699: sipush #-1600
    //   702: invokestatic a : (II)Ljava/lang/String;
    //   705: sipush #27546
    //   708: sipush #-28646
    //   711: invokestatic a : (II)Ljava/lang/String;
    //   714: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   717: sipush #27563
    //   720: sipush #-3312
    //   723: invokestatic a : (II)Ljava/lang/String;
    //   726: sipush #27546
    //   729: sipush #-28646
    //   732: invokestatic a : (II)Ljava/lang/String;
    //   735: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   738: sipush #27579
    //   741: sipush #-355
    //   744: invokestatic a : (II)Ljava/lang/String;
    //   747: sipush #27564
    //   750: sipush #19207
    //   753: invokestatic a : (II)Ljava/lang/String;
    //   756: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   759: sipush #27536
    //   762: sipush #23875
    //   765: invokestatic a : (II)Ljava/lang/String;
    //   768: sipush #27527
    //   771: sipush #24929
    //   774: invokestatic a : (II)Ljava/lang/String;
    //   777: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   780: sipush #27524
    //   783: sipush #7231
    //   786: invokestatic a : (II)Ljava/lang/String;
    //   789: sipush #27574
    //   792: sipush #-27163
    //   795: invokestatic a : (II)Ljava/lang/String;
    //   798: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   801: sipush #27525
    //   804: sipush #19517
    //   807: invokestatic a : (II)Ljava/lang/String;
    //   810: sipush #27601
    //   813: sipush #-20025
    //   816: invokestatic a : (II)Ljava/lang/String;
    //   819: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   822: sipush #27533
    //   825: sipush #-24834
    //   828: invokestatic a : (II)Ljava/lang/String;
    //   831: sipush #27528
    //   834: sipush #18630
    //   837: invokestatic a : (II)Ljava/lang/String;
    //   840: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   843: sipush #27548
    //   846: sipush #2189
    //   849: invokestatic a : (II)Ljava/lang/String;
    //   852: sipush #27534
    //   855: sipush #12575
    //   858: invokestatic a : (II)Ljava/lang/String;
    //   861: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   864: sipush #27523
    //   867: sipush #20123
    //   870: invokestatic a : (II)Ljava/lang/String;
    //   873: sipush #27558
    //   876: sipush #-15305
    //   879: invokestatic a : (II)Ljava/lang/String;
    //   882: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   885: sipush #27531
    //   888: sipush #-8377
    //   891: invokestatic a : (II)Ljava/lang/String;
    //   894: sipush #27564
    //   897: sipush #19207
    //   900: invokestatic a : (II)Ljava/lang/String;
    //   903: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   906: sipush #27535
    //   909: sipush #1976
    //   912: invokestatic a : (II)Ljava/lang/String;
    //   915: sipush #27542
    //   918: sipush #29547
    //   921: invokestatic a : (II)Ljava/lang/String;
    //   924: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   927: sipush #27576
    //   930: sipush #-12102
    //   933: invokestatic a : (II)Ljava/lang/String;
    //   936: sipush #27577
    //   939: sipush #5670
    //   942: invokestatic a : (II)Ljava/lang/String;
    //   945: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   948: sipush #27552
    //   951: sipush #17127
    //   954: invokestatic a : (II)Ljava/lang/String;
    //   957: sipush #27546
    //   960: sipush #-28646
    //   963: invokestatic a : (II)Ljava/lang/String;
    //   966: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   969: sipush #27555
    //   972: sipush #-24878
    //   975: invokestatic a : (II)Ljava/lang/String;
    //   978: sipush #27564
    //   981: sipush #19207
    //   984: invokestatic a : (II)Ljava/lang/String;
    //   987: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   990: sipush #27555
    //   993: sipush #-24878
    //   996: invokestatic a : (II)Ljava/lang/String;
    //   999: sipush #27558
    //   1002: sipush #-15305
    //   1005: invokestatic a : (II)Ljava/lang/String;
    //   1008: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1011: sipush #27544
    //   1014: sipush #30899
    //   1017: invokestatic a : (II)Ljava/lang/String;
    //   1020: sipush #27564
    //   1023: sipush #19207
    //   1026: invokestatic a : (II)Ljava/lang/String;
    //   1029: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1032: sipush #27549
    //   1035: sipush #17560
    //   1038: invokestatic a : (II)Ljava/lang/String;
    //   1041: sipush #27532
    //   1044: sipush #8364
    //   1047: invokestatic a : (II)Ljava/lang/String;
    //   1050: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1053: sipush #27556
    //   1056: sipush #-6477
    //   1059: invokestatic a : (II)Ljava/lang/String;
    //   1062: sipush #27564
    //   1065: sipush #19207
    //   1068: invokestatic a : (II)Ljava/lang/String;
    //   1071: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1074: sipush #27522
    //   1077: sipush #4148
    //   1080: invokestatic a : (II)Ljava/lang/String;
    //   1083: sipush #27534
    //   1086: sipush #12575
    //   1089: invokestatic a : (II)Ljava/lang/String;
    //   1092: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1095: sipush #27562
    //   1098: sipush #-27950
    //   1101: invokestatic a : (II)Ljava/lang/String;
    //   1104: sipush #27564
    //   1107: sipush #19207
    //   1110: invokestatic a : (II)Ljava/lang/String;
    //   1113: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1116: sipush #27550
    //   1119: sipush #16588
    //   1122: invokestatic a : (II)Ljava/lang/String;
    //   1125: sipush #27564
    //   1128: sipush #19207
    //   1131: invokestatic a : (II)Ljava/lang/String;
    //   1134: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1137: sipush #27554
    //   1140: sipush #-26983
    //   1143: invokestatic a : (II)Ljava/lang/String;
    //   1146: sipush #27551
    //   1149: sipush #20973
    //   1152: invokestatic a : (II)Ljava/lang/String;
    //   1155: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1158: sipush #27582
    //   1161: sipush #-29002
    //   1164: invokestatic a : (II)Ljava/lang/String;
    //   1167: sipush #27545
    //   1170: sipush #-21688
    //   1173: invokestatic a : (II)Ljava/lang/String;
    //   1176: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1179: sipush #27581
    //   1182: sipush #-2793
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: sipush #27564
    //   1191: sipush #19207
    //   1194: invokestatic a : (II)Ljava/lang/String;
    //   1197: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1200: sipush #27565
    //   1203: sipush #-9215
    //   1206: invokestatic a : (II)Ljava/lang/String;
    //   1209: sipush #27564
    //   1212: sipush #19207
    //   1215: invokestatic a : (II)Ljava/lang/String;
    //   1218: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1221: sipush #27543
    //   1224: sipush #4237
    //   1227: invokestatic a : (II)Ljava/lang/String;
    //   1230: sipush #27564
    //   1233: sipush #19207
    //   1236: invokestatic a : (II)Ljava/lang/String;
    //   1239: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1242: sipush #27566
    //   1245: sipush #-29649
    //   1248: invokestatic a : (II)Ljava/lang/String;
    //   1251: sipush #27564
    //   1254: sipush #19207
    //   1257: invokestatic a : (II)Ljava/lang/String;
    //   1260: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1263: sipush #27537
    //   1266: sipush #-17021
    //   1269: invokestatic a : (II)Ljava/lang/String;
    //   1272: sipush #27538
    //   1275: sipush #-22511
    //   1278: invokestatic a : (II)Ljava/lang/String;
    //   1281: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1284: sipush #27569
    //   1287: sipush #-8031
    //   1290: invokestatic a : (II)Ljava/lang/String;
    //   1293: sipush #27538
    //   1296: sipush #-22511
    //   1299: invokestatic a : (II)Ljava/lang/String;
    //   1302: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1305: sipush #27571
    //   1308: sipush #22017
    //   1311: invokestatic a : (II)Ljava/lang/String;
    //   1314: sipush #27564
    //   1317: sipush #19207
    //   1320: invokestatic a : (II)Ljava/lang/String;
    //   1323: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1326: sipush #27530
    //   1329: sipush #-22294
    //   1332: invokestatic a : (II)Ljava/lang/String;
    //   1335: sipush #27564
    //   1338: sipush #19207
    //   1341: invokestatic a : (II)Ljava/lang/String;
    //   1344: invokestatic Zc : (Ljava/lang/String;Ljava/lang/String;)V
    //   1347: sipush #27554
    //   1350: sipush #-26983
    //   1353: invokestatic a : (II)Ljava/lang/String;
    //   1356: aconst_null
    //   1357: invokestatic Zx : (Ljava/lang/String;)Lburp/Zkdd;
    //   1360: invokestatic Zm : (Ljava/lang/String;Lburp/Zkdd;)V
    //   1363: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6B90) & 0xFFFF;
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
      byte b1 = 54;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbni.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */