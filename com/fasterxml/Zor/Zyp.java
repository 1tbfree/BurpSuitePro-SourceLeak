package com.fasterxml.Zor;

import com.fasterxml.Zj.Zu;

public enum Zyp implements Zu {
  USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, USE_LONG_FOR_INTS, USE_JAVA_ARRAY_FOR_JSON_ARRAY, FAIL_ON_UNKNOWN_PROPERTIES, FAIL_ON_NULL_FOR_PRIMITIVES, FAIL_ON_NUMBERS_FOR_ENUMS, FAIL_ON_INVALID_SUBTYPE, FAIL_ON_READING_DUP_TREE_KEY, FAIL_ON_IGNORED_PROPERTIES, FAIL_ON_UNRESOLVED_OBJECT_IDS, FAIL_ON_MISSING_CREATOR_PROPERTIES, FAIL_ON_NULL_CREATOR_PROPERTIES, FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY, FAIL_ON_TRAILING_TOKENS, WRAP_EXCEPTIONS, FAIL_ON_UNEXPECTED_VIEW_PROPERTIES, ACCEPT_SINGLE_VALUE_AS_ARRAY, UNWRAP_SINGLE_VALUE_ARRAYS, UNWRAP_ROOT_VALUE, ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, ACCEPT_FLOAT_AS_INT, READ_ENUMS_USING_TO_STRING, READ_UNKNOWN_ENUM_VALUES_AS_NULL, READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, READ_DATE_TIMESTAMPS_AS_NANOSECONDS, ADJUST_DATES_TO_CONTEXT_TIME_ZONE, EAGER_DESERIALIZER_FETCH;
  
  private final boolean Zy;
  
  private final int ZW;
  
  Zyp(boolean paramBoolean) {
    this.Zy = paramBoolean;
    this.ZW = 1 << ordinal();
  }
  
  public boolean Zg() {
    return this.Zy;
  }
  
  public int Zu() {
    return this.ZW;
  }
  
  public boolean Zq(int paramInt) {
    return ((paramInt & this.ZW) != 0);
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '\\tJpnT]pr PFs~BVte\\tJpnTP{e\\fZFs~BMf"X|}RL{tMMpuKNjaRKax\\fNZvtI\\bP{vX\\b\\nXyd\\fBFtc\X|}RP{g\\bQFfdI\\f\"ZvtI\\bTeeB\\bK|BF{dQ\\b[t\\nIX|}RL{zR FecMM|tZvtI\\bUzpBF|X|}RL{c\\fNOpuR\veTX|}RW`|XFs~BLxb)X|}RT|bTFpiXXynDF|uMIpcD!]dI\\bXatBFv~IMje PCz\\f"X|}RT|bTFvc\\f\KjaRKax\\fNX|}RW`}BKjaTM|g\\fNX|}RW`}B\teO\\b\\fKza\\fO\fX|}RMgp Q^jeVJ\tuX\\tTfnN^jeB\\bK|XrtBJpc \Cpc[\\bZ}!ZvtI\\bTeeBKth\W`}BSpr \tuHWzfBLxn\\\t\fn\\bN\\bLy}KtaX\ee RX|}RKpp\\rTFqdB\pnX,\tuHWzfBLxn\\\t\fnN^ju\\f[\\tUan\\\t\\\tWbc\\bM\\bP{vX\\b\\nXyd\\fBKth\\tWbc\\bM\\bVzeKLp\\tJpnRFs~BMf\\tJpn\Ftc\_zcWWjpO'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #26
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #39
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'PtuZXzwGNmkEEt|#T|}Q Tbm\\bXE|tF Bbw [T~vQ\\f'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #26
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #47
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #123
    //   202: goto -> 232
    //   205: bipush #62
    //   207: goto -> 232
    //   210: bipush #18
    //   212: goto -> 232
    //   215: bipush #22
    //   217: goto -> 232
    //   220: bipush #110
    //   222: goto -> 232
    //   225: bipush #58
    //   227: goto -> 232
    //   230: bipush #112
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: new com/fasterxml/Zor/Zyp
    //   291: dup
    //   292: aload_0
    //   293: iconst_0
    //   294: aaload
    //   295: iconst_0
    //   296: iconst_0
    //   297: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   300: putstatic com/fasterxml/Zor/Zyp.USE_BIG_DECIMAL_FOR_FLOATS : Lcom/fasterxml/Zor/Zyp;
    //   303: new com/fasterxml/Zor/Zyp
    //   306: dup
    //   307: aload_0
    //   308: iconst_1
    //   309: aaload
    //   310: iconst_1
    //   311: iconst_0
    //   312: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   315: putstatic com/fasterxml/Zor/Zyp.USE_BIG_INTEGER_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   318: new com/fasterxml/Zor/Zyp
    //   321: dup
    //   322: aload_0
    //   323: bipush #25
    //   325: aaload
    //   326: iconst_2
    //   327: iconst_0
    //   328: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   331: putstatic com/fasterxml/Zor/Zyp.USE_LONG_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   334: new com/fasterxml/Zor/Zyp
    //   337: dup
    //   338: aload_0
    //   339: bipush #26
    //   341: aaload
    //   342: iconst_3
    //   343: iconst_0
    //   344: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   347: putstatic com/fasterxml/Zor/Zyp.USE_JAVA_ARRAY_FOR_JSON_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   350: new com/fasterxml/Zor/Zyp
    //   353: dup
    //   354: aload_0
    //   355: bipush #6
    //   357: aaload
    //   358: iconst_4
    //   359: iconst_1
    //   360: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   363: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_UNKNOWN_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   366: new com/fasterxml/Zor/Zyp
    //   369: dup
    //   370: aload_0
    //   371: bipush #13
    //   373: aaload
    //   374: iconst_5
    //   375: iconst_0
    //   376: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   379: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_FOR_PRIMITIVES : Lcom/fasterxml/Zor/Zyp;
    //   382: new com/fasterxml/Zor/Zyp
    //   385: dup
    //   386: aload_0
    //   387: bipush #9
    //   389: aaload
    //   390: bipush #6
    //   392: iconst_0
    //   393: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   396: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_NUMBERS_FOR_ENUMS : Lcom/fasterxml/Zor/Zyp;
    //   399: new com/fasterxml/Zor/Zyp
    //   402: dup
    //   403: aload_0
    //   404: iconst_4
    //   405: aaload
    //   406: bipush #7
    //   408: iconst_1
    //   409: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   412: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_INVALID_SUBTYPE : Lcom/fasterxml/Zor/Zyp;
    //   415: new com/fasterxml/Zor/Zyp
    //   418: dup
    //   419: aload_0
    //   420: bipush #21
    //   422: aaload
    //   423: bipush #8
    //   425: iconst_0
    //   426: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   429: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_READING_DUP_TREE_KEY : Lcom/fasterxml/Zor/Zyp;
    //   432: new com/fasterxml/Zor/Zyp
    //   435: dup
    //   436: aload_0
    //   437: bipush #27
    //   439: aaload
    //   440: bipush #9
    //   442: iconst_0
    //   443: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   446: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_IGNORED_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   449: new com/fasterxml/Zor/Zyp
    //   452: dup
    //   453: aload_0
    //   454: bipush #8
    //   456: aaload
    //   457: bipush #10
    //   459: iconst_1
    //   460: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   463: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_UNRESOLVED_OBJECT_IDS : Lcom/fasterxml/Zor/Zyp;
    //   466: new com/fasterxml/Zor/Zyp
    //   469: dup
    //   470: aload_0
    //   471: bipush #12
    //   473: aaload
    //   474: bipush #11
    //   476: iconst_0
    //   477: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   480: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_MISSING_CREATOR_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   483: new com/fasterxml/Zor/Zyp
    //   486: dup
    //   487: aload_0
    //   488: bipush #14
    //   490: aaload
    //   491: bipush #12
    //   493: iconst_0
    //   494: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   497: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_CREATOR_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   500: new com/fasterxml/Zor/Zyp
    //   503: dup
    //   504: aload_0
    //   505: bipush #10
    //   507: aaload
    //   508: bipush #13
    //   510: iconst_1
    //   511: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   514: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY : Lcom/fasterxml/Zor/Zyp;
    //   517: new com/fasterxml/Zor/Zyp
    //   520: dup
    //   521: aload_0
    //   522: bipush #15
    //   524: aaload
    //   525: bipush #14
    //   527: iconst_0
    //   528: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   531: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_TRAILING_TOKENS : Lcom/fasterxml/Zor/Zyp;
    //   534: new com/fasterxml/Zor/Zyp
    //   537: dup
    //   538: aload_0
    //   539: bipush #20
    //   541: aaload
    //   542: bipush #15
    //   544: iconst_1
    //   545: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   548: putstatic com/fasterxml/Zor/Zyp.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zyp;
    //   551: new com/fasterxml/Zor/Zyp
    //   554: dup
    //   555: aload_0
    //   556: iconst_2
    //   557: aaload
    //   558: bipush #16
    //   560: iconst_0
    //   561: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   564: putstatic com/fasterxml/Zor/Zyp.FAIL_ON_UNEXPECTED_VIEW_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   567: new com/fasterxml/Zor/Zyp
    //   570: dup
    //   571: aload_0
    //   572: iconst_3
    //   573: aaload
    //   574: bipush #17
    //   576: iconst_0
    //   577: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   580: putstatic com/fasterxml/Zor/Zyp.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   583: new com/fasterxml/Zor/Zyp
    //   586: dup
    //   587: aload_0
    //   588: bipush #23
    //   590: aaload
    //   591: bipush #18
    //   593: iconst_0
    //   594: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   597: putstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   600: new com/fasterxml/Zor/Zyp
    //   603: dup
    //   604: aload_0
    //   605: bipush #24
    //   607: aaload
    //   608: bipush #19
    //   610: iconst_0
    //   611: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   614: putstatic com/fasterxml/Zor/Zyp.UNWRAP_ROOT_VALUE : Lcom/fasterxml/Zor/Zyp;
    //   617: new com/fasterxml/Zor/Zyp
    //   620: dup
    //   621: aload_0
    //   622: iconst_5
    //   623: aaload
    //   624: bipush #20
    //   626: iconst_0
    //   627: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   630: putstatic com/fasterxml/Zor/Zyp.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT : Lcom/fasterxml/Zor/Zyp;
    //   633: new com/fasterxml/Zor/Zyp
    //   636: dup
    //   637: aload_0
    //   638: bipush #18
    //   640: aaload
    //   641: bipush #21
    //   643: iconst_0
    //   644: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   647: putstatic com/fasterxml/Zor/Zyp.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT : Lcom/fasterxml/Zor/Zyp;
    //   650: new com/fasterxml/Zor/Zyp
    //   653: dup
    //   654: aload_0
    //   655: bipush #7
    //   657: aaload
    //   658: bipush #22
    //   660: iconst_1
    //   661: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   664: putstatic com/fasterxml/Zor/Zyp.ACCEPT_FLOAT_AS_INT : Lcom/fasterxml/Zor/Zyp;
    //   667: new com/fasterxml/Zor/Zyp
    //   670: dup
    //   671: aload_0
    //   672: bipush #16
    //   674: aaload
    //   675: bipush #23
    //   677: iconst_0
    //   678: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   681: putstatic com/fasterxml/Zor/Zyp.READ_ENUMS_USING_TO_STRING : Lcom/fasterxml/Zor/Zyp;
    //   684: new com/fasterxml/Zor/Zyp
    //   687: dup
    //   688: aload_0
    //   689: bipush #19
    //   691: aaload
    //   692: bipush #24
    //   694: iconst_0
    //   695: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   698: putstatic com/fasterxml/Zor/Zyp.READ_UNKNOWN_ENUM_VALUES_AS_NULL : Lcom/fasterxml/Zor/Zyp;
    //   701: new com/fasterxml/Zor/Zyp
    //   704: dup
    //   705: aload_0
    //   706: bipush #22
    //   708: aaload
    //   709: bipush #25
    //   711: iconst_0
    //   712: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   715: putstatic com/fasterxml/Zor/Zyp.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE : Lcom/fasterxml/Zor/Zyp;
    //   718: new com/fasterxml/Zor/Zyp
    //   721: dup
    //   722: aload_0
    //   723: bipush #28
    //   725: aaload
    //   726: bipush #26
    //   728: iconst_1
    //   729: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   732: putstatic com/fasterxml/Zor/Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS : Lcom/fasterxml/Zor/Zyp;
    //   735: new com/fasterxml/Zor/Zyp
    //   738: dup
    //   739: aload_0
    //   740: bipush #11
    //   742: aaload
    //   743: bipush #27
    //   745: iconst_1
    //   746: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   749: putstatic com/fasterxml/Zor/Zyp.ADJUST_DATES_TO_CONTEXT_TIME_ZONE : Lcom/fasterxml/Zor/Zyp;
    //   752: new com/fasterxml/Zor/Zyp
    //   755: dup
    //   756: aload_0
    //   757: bipush #17
    //   759: aaload
    //   760: bipush #28
    //   762: iconst_1
    //   763: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   766: putstatic com/fasterxml/Zor/Zyp.EAGER_DESERIALIZER_FETCH : Lcom/fasterxml/Zor/Zyp;
    //   769: bipush #29
    //   771: anewarray com/fasterxml/Zor/Zyp
    //   774: dup
    //   775: iconst_0
    //   776: getstatic com/fasterxml/Zor/Zyp.USE_BIG_DECIMAL_FOR_FLOATS : Lcom/fasterxml/Zor/Zyp;
    //   779: aastore
    //   780: dup
    //   781: iconst_1
    //   782: getstatic com/fasterxml/Zor/Zyp.USE_BIG_INTEGER_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   785: aastore
    //   786: dup
    //   787: iconst_2
    //   788: getstatic com/fasterxml/Zor/Zyp.USE_LONG_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   791: aastore
    //   792: dup
    //   793: iconst_3
    //   794: getstatic com/fasterxml/Zor/Zyp.USE_JAVA_ARRAY_FOR_JSON_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   797: aastore
    //   798: dup
    //   799: iconst_4
    //   800: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_UNKNOWN_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   803: aastore
    //   804: dup
    //   805: iconst_5
    //   806: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_FOR_PRIMITIVES : Lcom/fasterxml/Zor/Zyp;
    //   809: aastore
    //   810: dup
    //   811: bipush #6
    //   813: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NUMBERS_FOR_ENUMS : Lcom/fasterxml/Zor/Zyp;
    //   816: aastore
    //   817: dup
    //   818: bipush #7
    //   820: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_INVALID_SUBTYPE : Lcom/fasterxml/Zor/Zyp;
    //   823: aastore
    //   824: dup
    //   825: bipush #8
    //   827: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_READING_DUP_TREE_KEY : Lcom/fasterxml/Zor/Zyp;
    //   830: aastore
    //   831: dup
    //   832: bipush #9
    //   834: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_IGNORED_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   837: aastore
    //   838: dup
    //   839: bipush #10
    //   841: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_UNRESOLVED_OBJECT_IDS : Lcom/fasterxml/Zor/Zyp;
    //   844: aastore
    //   845: dup
    //   846: bipush #11
    //   848: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_MISSING_CREATOR_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   851: aastore
    //   852: dup
    //   853: bipush #12
    //   855: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_CREATOR_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   858: aastore
    //   859: dup
    //   860: bipush #13
    //   862: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY : Lcom/fasterxml/Zor/Zyp;
    //   865: aastore
    //   866: dup
    //   867: bipush #14
    //   869: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_TRAILING_TOKENS : Lcom/fasterxml/Zor/Zyp;
    //   872: aastore
    //   873: dup
    //   874: bipush #15
    //   876: getstatic com/fasterxml/Zor/Zyp.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zyp;
    //   879: aastore
    //   880: dup
    //   881: bipush #16
    //   883: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_UNEXPECTED_VIEW_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   886: aastore
    //   887: dup
    //   888: bipush #17
    //   890: getstatic com/fasterxml/Zor/Zyp.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   893: aastore
    //   894: dup
    //   895: bipush #18
    //   897: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   900: aastore
    //   901: dup
    //   902: bipush #19
    //   904: getstatic com/fasterxml/Zor/Zyp.UNWRAP_ROOT_VALUE : Lcom/fasterxml/Zor/Zyp;
    //   907: aastore
    //   908: dup
    //   909: bipush #20
    //   911: getstatic com/fasterxml/Zor/Zyp.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT : Lcom/fasterxml/Zor/Zyp;
    //   914: aastore
    //   915: dup
    //   916: bipush #21
    //   918: getstatic com/fasterxml/Zor/Zyp.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT : Lcom/fasterxml/Zor/Zyp;
    //   921: aastore
    //   922: dup
    //   923: bipush #22
    //   925: getstatic com/fasterxml/Zor/Zyp.ACCEPT_FLOAT_AS_INT : Lcom/fasterxml/Zor/Zyp;
    //   928: aastore
    //   929: dup
    //   930: bipush #23
    //   932: getstatic com/fasterxml/Zor/Zyp.READ_ENUMS_USING_TO_STRING : Lcom/fasterxml/Zor/Zyp;
    //   935: aastore
    //   936: dup
    //   937: bipush #24
    //   939: getstatic com/fasterxml/Zor/Zyp.READ_UNKNOWN_ENUM_VALUES_AS_NULL : Lcom/fasterxml/Zor/Zyp;
    //   942: aastore
    //   943: dup
    //   944: bipush #25
    //   946: getstatic com/fasterxml/Zor/Zyp.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE : Lcom/fasterxml/Zor/Zyp;
    //   949: aastore
    //   950: dup
    //   951: bipush #26
    //   953: getstatic com/fasterxml/Zor/Zyp.READ_DATE_TIMESTAMPS_AS_NANOSECONDS : Lcom/fasterxml/Zor/Zyp;
    //   956: aastore
    //   957: dup
    //   958: bipush #27
    //   960: getstatic com/fasterxml/Zor/Zyp.ADJUST_DATES_TO_CONTEXT_TIME_ZONE : Lcom/fasterxml/Zor/Zyp;
    //   963: aastore
    //   964: dup
    //   965: bipush #28
    //   967: getstatic com/fasterxml/Zor/Zyp.EAGER_DESERIALIZER_FETCH : Lcom/fasterxml/Zor/Zyp;
    //   970: aastore
    //   971: putstatic com/fasterxml/Zor/Zyp.ZA : [Lcom/fasterxml/Zor/Zyp;
    //   974: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zyp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */