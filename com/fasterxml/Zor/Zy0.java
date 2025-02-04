package com.fasterxml.Zor;

import com.fasterxml.Zj.Zu;

public enum Zy0 implements Zu {
  WRAP_ROOT_VALUE, INDENT_OUTPUT, FAIL_ON_EMPTY_BEANS, FAIL_ON_SELF_REFERENCES, WRAP_EXCEPTIONS, FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS, WRITE_SELF_REFERENCES_AS_NULL, CLOSE_CLOSEABLE, FLUSH_AFTER_WRITE_VALUE, WRITE_DATES_AS_TIMESTAMPS, WRITE_DATE_KEYS_AS_TIMESTAMPS, WRITE_DATES_WITH_ZONE_ID, WRITE_DATES_WITH_CONTEXT_TIME_ZONE, WRITE_DURATIONS_AS_TIMESTAMPS, WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, WRITE_ENUMS_USING_TO_STRING, WRITE_ENUMS_USING_INDEX, WRITE_ENUM_KEYS_USING_INDEX, WRITE_NULL_MAP_VALUES, WRITE_EMPTY_JSON_ARRAYS, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, WRITE_BIGDECIMAL_AS_PLAIN, WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, ORDER_MAP_ENTRIES_BY_KEYS, EAGER_SERIALIZER_FETCH, USE_EQUALITY_FOR_OBJECT_ID;
  
  private final boolean ZN;
  
  private final int ZX;
  
  Zy0(boolean paramBoolean) {
    this.ZN = paramBoolean;
    this.ZX = 1 << ordinal();
  }
  
  public boolean Zg() {
    return this.ZN;
  }
  
  public int Zu() {
    return this.ZX;
  }
  
  public boolean Zq(int paramInt) {
    return ((paramInt & this.ZX) != 0);
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'V)@N[ FO;LNB0ZU.LPA!KU;V)@N[ FO-DRP6WR-HLWG:@VA0[U$O]V*NU:LLG*[O)Z]J:D\G:HR[*PS-YVM FCG:@VA0M^=DQ[:[Y&N]M!LU0"G:@VA0[Y&NNA0M\-D]E=ZQ1Z]Q!_B)YRA+"G:@VA0LQ<LQ[8AD VAK!\U0]]P&EU7SMJ*G:@VA0LQ<LQ[8AD VXK!MO!MG:@VA0LQ<LQ[.[O<@OA<\Q%YQU)NGV0[U:@CH&RU:VDA;KXG:HR[=G_<VTE#]UG:@VA0M^=D]O*QC7\QM!OO!GFA7"V)@N[ FO=GUV.X@-M]P6XU7@FA!\Y.@GV<E;L]A>]Q$@V]0N_:VMF%MS<VK@$G:@VA0LQ<L]P&EU;]CI?[O)Z]J.F_;LAK!LCV$\QL0IV<LP[8ZY<L]R.DE-_:MGV0EQ8VGJ;ZY-Z]F6W[-PQS$FQA0K\'ZGE-DU\\rY&MGJ;W_=]RQ; G:@VA0KX)[]E=ZQ1Z]E<WZ;FL[.ZB)PQG:@VA0JY/MGG&EQ$VCW0X\)@LG:@VA0LQ<L]O*QC7HQ[;A]-ZVE"XCG:@VA0FE$E]I.XO>HNQ*[G:@VA0LE:HVM FC7HQ[;A]-ZVE"XC'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #23
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #63
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
    //   68: ldc 'kal \\nk\\n\\bw\\fqm\\nyka\\fi\\f\\n\\nt\\nwlj'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #27
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #110
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
    //   200: bipush #47
    //   202: goto -> 232
    //   205: bipush #87
    //   207: goto -> 232
    //   210: bipush #54
    //   212: goto -> 232
    //   215: bipush #61
    //   217: goto -> 232
    //   220: bipush #59
    //   222: goto -> 232
    //   225: bipush #80
    //   227: goto -> 232
    //   230: bipush #55
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
    //   288: new com/fasterxml/Zor/Zy0
    //   291: dup
    //   292: aload_0
    //   293: bipush #10
    //   295: aaload
    //   296: iconst_0
    //   297: iconst_0
    //   298: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   301: putstatic com/fasterxml/Zor/Zy0.WRAP_ROOT_VALUE : Lcom/fasterxml/Zor/Zy0;
    //   304: new com/fasterxml/Zor/Zy0
    //   307: dup
    //   308: aload_0
    //   309: bipush #18
    //   311: aaload
    //   312: iconst_1
    //   313: iconst_0
    //   314: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   317: putstatic com/fasterxml/Zor/Zy0.INDENT_OUTPUT : Lcom/fasterxml/Zor/Zy0;
    //   320: new com/fasterxml/Zor/Zy0
    //   323: dup
    //   324: aload_0
    //   325: iconst_1
    //   326: aaload
    //   327: iconst_2
    //   328: iconst_1
    //   329: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   332: putstatic com/fasterxml/Zor/Zy0.FAIL_ON_EMPTY_BEANS : Lcom/fasterxml/Zor/Zy0;
    //   335: new com/fasterxml/Zor/Zy0
    //   338: dup
    //   339: aload_0
    //   340: iconst_0
    //   341: aaload
    //   342: iconst_3
    //   343: iconst_1
    //   344: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   347: putstatic com/fasterxml/Zor/Zy0.FAIL_ON_SELF_REFERENCES : Lcom/fasterxml/Zor/Zy0;
    //   350: new com/fasterxml/Zor/Zy0
    //   353: dup
    //   354: aload_0
    //   355: iconst_3
    //   356: aaload
    //   357: iconst_4
    //   358: iconst_1
    //   359: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   362: putstatic com/fasterxml/Zor/Zy0.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zy0;
    //   365: new com/fasterxml/Zor/Zy0
    //   368: dup
    //   369: aload_0
    //   370: bipush #12
    //   372: aaload
    //   373: iconst_5
    //   374: iconst_1
    //   375: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   378: putstatic com/fasterxml/Zor/Zy0.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS : Lcom/fasterxml/Zor/Zy0;
    //   381: new com/fasterxml/Zor/Zy0
    //   384: dup
    //   385: aload_0
    //   386: iconst_2
    //   387: aaload
    //   388: bipush #6
    //   390: iconst_0
    //   391: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   394: putstatic com/fasterxml/Zor/Zy0.WRITE_SELF_REFERENCES_AS_NULL : Lcom/fasterxml/Zor/Zy0;
    //   397: new com/fasterxml/Zor/Zy0
    //   400: dup
    //   401: aload_0
    //   402: bipush #17
    //   404: aaload
    //   405: bipush #7
    //   407: iconst_0
    //   408: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   411: putstatic com/fasterxml/Zor/Zy0.CLOSE_CLOSEABLE : Lcom/fasterxml/Zor/Zy0;
    //   414: new com/fasterxml/Zor/Zy0
    //   417: dup
    //   418: aload_0
    //   419: bipush #15
    //   421: aaload
    //   422: bipush #8
    //   424: iconst_1
    //   425: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   428: putstatic com/fasterxml/Zor/Zy0.FLUSH_AFTER_WRITE_VALUE : Lcom/fasterxml/Zor/Zy0;
    //   431: new com/fasterxml/Zor/Zy0
    //   434: dup
    //   435: aload_0
    //   436: bipush #8
    //   438: aaload
    //   439: bipush #9
    //   441: iconst_1
    //   442: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   445: putstatic com/fasterxml/Zor/Zy0.WRITE_DATES_AS_TIMESTAMPS : Lcom/fasterxml/Zor/Zy0;
    //   448: new com/fasterxml/Zor/Zy0
    //   451: dup
    //   452: aload_0
    //   453: bipush #21
    //   455: aaload
    //   456: bipush #10
    //   458: iconst_0
    //   459: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   462: putstatic com/fasterxml/Zor/Zy0.WRITE_DATE_KEYS_AS_TIMESTAMPS : Lcom/fasterxml/Zor/Zy0;
    //   465: new com/fasterxml/Zor/Zy0
    //   468: dup
    //   469: aload_0
    //   470: bipush #7
    //   472: aaload
    //   473: bipush #11
    //   475: iconst_0
    //   476: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   479: putstatic com/fasterxml/Zor/Zy0.WRITE_DATES_WITH_ZONE_ID : Lcom/fasterxml/Zor/Zy0;
    //   482: new com/fasterxml/Zor/Zy0
    //   485: dup
    //   486: aload_0
    //   487: bipush #6
    //   489: aaload
    //   490: bipush #12
    //   492: iconst_1
    //   493: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   496: putstatic com/fasterxml/Zor/Zy0.WRITE_DATES_WITH_CONTEXT_TIME_ZONE : Lcom/fasterxml/Zor/Zy0;
    //   499: new com/fasterxml/Zor/Zy0
    //   502: dup
    //   503: aload_0
    //   504: bipush #23
    //   506: aaload
    //   507: bipush #13
    //   509: iconst_1
    //   510: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   513: putstatic com/fasterxml/Zor/Zy0.WRITE_DURATIONS_AS_TIMESTAMPS : Lcom/fasterxml/Zor/Zy0;
    //   516: new com/fasterxml/Zor/Zy0
    //   519: dup
    //   520: aload_0
    //   521: bipush #19
    //   523: aaload
    //   524: bipush #14
    //   526: iconst_0
    //   527: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   530: putstatic com/fasterxml/Zor/Zy0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   533: new com/fasterxml/Zor/Zy0
    //   536: dup
    //   537: aload_0
    //   538: bipush #24
    //   540: aaload
    //   541: bipush #15
    //   543: iconst_0
    //   544: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   547: putstatic com/fasterxml/Zor/Zy0.WRITE_ENUMS_USING_TO_STRING : Lcom/fasterxml/Zor/Zy0;
    //   550: new com/fasterxml/Zor/Zy0
    //   553: dup
    //   554: aload_0
    //   555: iconst_4
    //   556: aaload
    //   557: bipush #16
    //   559: iconst_0
    //   560: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   563: putstatic com/fasterxml/Zor/Zy0.WRITE_ENUMS_USING_INDEX : Lcom/fasterxml/Zor/Zy0;
    //   566: new com/fasterxml/Zor/Zy0
    //   569: dup
    //   570: aload_0
    //   571: bipush #11
    //   573: aaload
    //   574: bipush #17
    //   576: iconst_0
    //   577: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   580: putstatic com/fasterxml/Zor/Zy0.WRITE_ENUM_KEYS_USING_INDEX : Lcom/fasterxml/Zor/Zy0;
    //   583: new com/fasterxml/Zor/Zy0
    //   586: dup
    //   587: aload_0
    //   588: bipush #22
    //   590: aaload
    //   591: bipush #18
    //   593: iconst_1
    //   594: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   597: putstatic com/fasterxml/Zor/Zy0.WRITE_NULL_MAP_VALUES : Lcom/fasterxml/Zor/Zy0;
    //   600: new com/fasterxml/Zor/Zy0
    //   603: dup
    //   604: aload_0
    //   605: bipush #25
    //   607: aaload
    //   608: bipush #19
    //   610: iconst_1
    //   611: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   614: putstatic com/fasterxml/Zor/Zy0.WRITE_EMPTY_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   617: new com/fasterxml/Zor/Zy0
    //   620: dup
    //   621: aload_0
    //   622: iconst_5
    //   623: aaload
    //   624: bipush #20
    //   626: iconst_0
    //   627: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   630: putstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   633: new com/fasterxml/Zor/Zy0
    //   636: dup
    //   637: aload_0
    //   638: bipush #20
    //   640: aaload
    //   641: bipush #21
    //   643: iconst_0
    //   644: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   647: putstatic com/fasterxml/Zor/Zy0.WRITE_BIGDECIMAL_AS_PLAIN : Lcom/fasterxml/Zor/Zy0;
    //   650: new com/fasterxml/Zor/Zy0
    //   653: dup
    //   654: aload_0
    //   655: bipush #14
    //   657: aaload
    //   658: bipush #22
    //   660: iconst_1
    //   661: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   664: putstatic com/fasterxml/Zor/Zy0.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS : Lcom/fasterxml/Zor/Zy0;
    //   667: new com/fasterxml/Zor/Zy0
    //   670: dup
    //   671: aload_0
    //   672: bipush #16
    //   674: aaload
    //   675: bipush #23
    //   677: iconst_0
    //   678: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   681: putstatic com/fasterxml/Zor/Zy0.ORDER_MAP_ENTRIES_BY_KEYS : Lcom/fasterxml/Zor/Zy0;
    //   684: new com/fasterxml/Zor/Zy0
    //   687: dup
    //   688: aload_0
    //   689: bipush #9
    //   691: aaload
    //   692: bipush #24
    //   694: iconst_1
    //   695: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   698: putstatic com/fasterxml/Zor/Zy0.EAGER_SERIALIZER_FETCH : Lcom/fasterxml/Zor/Zy0;
    //   701: new com/fasterxml/Zor/Zy0
    //   704: dup
    //   705: aload_0
    //   706: bipush #13
    //   708: aaload
    //   709: bipush #25
    //   711: iconst_0
    //   712: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   715: putstatic com/fasterxml/Zor/Zy0.USE_EQUALITY_FOR_OBJECT_ID : Lcom/fasterxml/Zor/Zy0;
    //   718: bipush #26
    //   720: anewarray com/fasterxml/Zor/Zy0
    //   723: dup
    //   724: iconst_0
    //   725: getstatic com/fasterxml/Zor/Zy0.WRAP_ROOT_VALUE : Lcom/fasterxml/Zor/Zy0;
    //   728: aastore
    //   729: dup
    //   730: iconst_1
    //   731: getstatic com/fasterxml/Zor/Zy0.INDENT_OUTPUT : Lcom/fasterxml/Zor/Zy0;
    //   734: aastore
    //   735: dup
    //   736: iconst_2
    //   737: getstatic com/fasterxml/Zor/Zy0.FAIL_ON_EMPTY_BEANS : Lcom/fasterxml/Zor/Zy0;
    //   740: aastore
    //   741: dup
    //   742: iconst_3
    //   743: getstatic com/fasterxml/Zor/Zy0.FAIL_ON_SELF_REFERENCES : Lcom/fasterxml/Zor/Zy0;
    //   746: aastore
    //   747: dup
    //   748: iconst_4
    //   749: getstatic com/fasterxml/Zor/Zy0.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zy0;
    //   752: aastore
    //   753: dup
    //   754: iconst_5
    //   755: getstatic com/fasterxml/Zor/Zy0.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS : Lcom/fasterxml/Zor/Zy0;
    //   758: aastore
    //   759: dup
    //   760: bipush #6
    //   762: getstatic com/fasterxml/Zor/Zy0.WRITE_SELF_REFERENCES_AS_NULL : Lcom/fasterxml/Zor/Zy0;
    //   765: aastore
    //   766: dup
    //   767: bipush #7
    //   769: getstatic com/fasterxml/Zor/Zy0.CLOSE_CLOSEABLE : Lcom/fasterxml/Zor/Zy0;
    //   772: aastore
    //   773: dup
    //   774: bipush #8
    //   776: getstatic com/fasterxml/Zor/Zy0.FLUSH_AFTER_WRITE_VALUE : Lcom/fasterxml/Zor/Zy0;
    //   779: aastore
    //   780: dup
    //   781: bipush #9
    //   783: getstatic com/fasterxml/Zor/Zy0.WRITE_DATES_AS_TIMESTAMPS : Lcom/fasterxml/Zor/Zy0;
    //   786: aastore
    //   787: dup
    //   788: bipush #10
    //   790: getstatic com/fasterxml/Zor/Zy0.WRITE_DATE_KEYS_AS_TIMESTAMPS : Lcom/fasterxml/Zor/Zy0;
    //   793: aastore
    //   794: dup
    //   795: bipush #11
    //   797: getstatic com/fasterxml/Zor/Zy0.WRITE_DATES_WITH_ZONE_ID : Lcom/fasterxml/Zor/Zy0;
    //   800: aastore
    //   801: dup
    //   802: bipush #12
    //   804: getstatic com/fasterxml/Zor/Zy0.WRITE_DATES_WITH_CONTEXT_TIME_ZONE : Lcom/fasterxml/Zor/Zy0;
    //   807: aastore
    //   808: dup
    //   809: bipush #13
    //   811: getstatic com/fasterxml/Zor/Zy0.WRITE_DURATIONS_AS_TIMESTAMPS : Lcom/fasterxml/Zor/Zy0;
    //   814: aastore
    //   815: dup
    //   816: bipush #14
    //   818: getstatic com/fasterxml/Zor/Zy0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   821: aastore
    //   822: dup
    //   823: bipush #15
    //   825: getstatic com/fasterxml/Zor/Zy0.WRITE_ENUMS_USING_TO_STRING : Lcom/fasterxml/Zor/Zy0;
    //   828: aastore
    //   829: dup
    //   830: bipush #16
    //   832: getstatic com/fasterxml/Zor/Zy0.WRITE_ENUMS_USING_INDEX : Lcom/fasterxml/Zor/Zy0;
    //   835: aastore
    //   836: dup
    //   837: bipush #17
    //   839: getstatic com/fasterxml/Zor/Zy0.WRITE_ENUM_KEYS_USING_INDEX : Lcom/fasterxml/Zor/Zy0;
    //   842: aastore
    //   843: dup
    //   844: bipush #18
    //   846: getstatic com/fasterxml/Zor/Zy0.WRITE_NULL_MAP_VALUES : Lcom/fasterxml/Zor/Zy0;
    //   849: aastore
    //   850: dup
    //   851: bipush #19
    //   853: getstatic com/fasterxml/Zor/Zy0.WRITE_EMPTY_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   856: aastore
    //   857: dup
    //   858: bipush #20
    //   860: getstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   863: aastore
    //   864: dup
    //   865: bipush #21
    //   867: getstatic com/fasterxml/Zor/Zy0.WRITE_BIGDECIMAL_AS_PLAIN : Lcom/fasterxml/Zor/Zy0;
    //   870: aastore
    //   871: dup
    //   872: bipush #22
    //   874: getstatic com/fasterxml/Zor/Zy0.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS : Lcom/fasterxml/Zor/Zy0;
    //   877: aastore
    //   878: dup
    //   879: bipush #23
    //   881: getstatic com/fasterxml/Zor/Zy0.ORDER_MAP_ENTRIES_BY_KEYS : Lcom/fasterxml/Zor/Zy0;
    //   884: aastore
    //   885: dup
    //   886: bipush #24
    //   888: getstatic com/fasterxml/Zor/Zy0.EAGER_SERIALIZER_FETCH : Lcom/fasterxml/Zor/Zy0;
    //   891: aastore
    //   892: dup
    //   893: bipush #25
    //   895: getstatic com/fasterxml/Zor/Zy0.USE_EQUALITY_FOR_OBJECT_ID : Lcom/fasterxml/Zor/Zy0;
    //   898: aastore
    //   899: putstatic com/fasterxml/Zor/Zy0.Zp : [Lcom/fasterxml/Zor/Zy0;
    //   902: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */