package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zeh3 {
  private static final String[] ZE;
  
  private static final String[][] ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zlwx Zq(Zrgr paramZrgr) {
    Zzqp zzqp = new Zzqp();
    zzqp.Zj(a(-25192, 18803), paramZrgr.Zt());
    int i = Zrgr.Zi();
    zzqp.Zm(a(-25208, -19900), Zevj.Zh[paramZrgr.ZW()].toLowerCase());
    zzqp.Zm(a(-25160, 27575), ZE[paramZrgr.Zd()]);
    zzqp.Zm(a(-25198, -15256), ZN[paramZrgr.Zd()][paramZrgr.ZC()]);
    zzqp.Zd(a(-25191, 29850), paramZrgr.Zf());
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
    return zzqp;
  }
  
  public static Zrgr Zh(Zvt paramZvt, Zr_4 paramZr_4, Zr1j paramZr1j) {
    Zgpe zgpe = ZP(paramZvt, paramZr_4);
    return (zgpe == null) ? null : Zf(zgpe, paramZr1j);
  }
  
  public static Zgpe ZP(Zvt paramZvt, Zr_4 paramZr_4) {
    boolean bool;
    int i;
    int j;
    int k;
    String str;
    try {
      bool = paramZvt.Zc(a(-25154, -13540), true);
      i = paramZvt.ZT(a(-25202, 27285), Zevj.Zh);
      j = paramZvt.ZT(a(-25162, -8880), ZE);
      k = ZT(paramZvt.ZC(a(-25179, 16440)));
      str = paramZvt.Zf(a(-25158, 3464), "");
    } catch (Zzam zzam) {
      Zah.Zl(zzam, Zk_.USER_ERROR);
      return null;
    } 
    return paramZr_4.<Zgpe>ZH(new Zz_0(bool, i, j, k, str));
  }
  
  private static int ZT(String paramString) throws Zzam {
    String[][] arrayOfString = ZN;
    int j = arrayOfString.length;
    byte b = 0;
    int i = Zrgr.ZU();
    while (b < j) {
      String[] arrayOfString1 = arrayOfString[b];
      byte b1 = 0;
      while (b1 < arrayOfString1.length) {
        try {
          if (paramString.toLowerCase().equals(arrayOfString1[b1].toLowerCase()))
            return b1; 
        } catch (Zzam zzam) {
          throw a(null);
        } 
        b1++;
        if (i != 0)
          break; 
      } 
      b++;
      if (i != 0)
        break; 
    } 
    throw new Zzam(a(-25163, 1638));
  }
  
  private static Zrgr Zf(Zgpe paramZgpe, Zr1j paramZr1j) {
    Zrgr zrgr = null;
    try {
      zrgr = Zevj.Zl(paramZgpe, paramZr1j);
    } catch (Ztrx ztrx) {
      Zah.Zl(ztrx, Zk_.USER_ERROR);
    } 
    return zrgr;
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '®LkµãgDD3½Ê2)vN3W·5ÍæP©¿%M¢j$`Û´ûDcÞs$¸Å²~\\fàµc×RYÖ8ÒÀiü7ØrÀ¡ðÕk·Î#J[~4>_[÷[üLp8[¼ÿL¶\\f¦±g¶\\rHp aX*Íë;WaªÅ \\rÔ²[j£ßðgL¯\\n³H¿D^óv¢\\tö´ï·LÃtAÃü¼9èPDåõÈ­Ì!§ôvÞ*ðwúÎ³\\bpwá\îÈ$_kXPõÜÅºfV\\nZñ¨\·Iß6ÍlQ/q@fÔï·ÏÄ#¡Ât±û\\fªþÁñ4¸õàAeÆÇPk¶S*TÏÕ=Ëb$Wôw\\nÐiÒ­AØì¼ÔKã\\bYÎ¯ÓüFóúZX k}@8%ÆÜ7Ð¡·ï¿x1[y¨Í%4KA³}Fé}¯çU@8ìÒ/¡\\fwü+WYÓ*V+¿Á®¬}ø³eöÝÅQÕúh0R\\n9ÞÈ.¬X¶7ïÔÓüÎè lYb=z\\rñ}]ªªðÂÚrïrÏÀ4Xo~á#M1Ì%oÍyô`÷\\tlkÔâ)[Ü)·Ñ{\\n\\tÄÌwª¶öªµ,6³lÈQz/N@Úm\\bÀí¯´Ö±7\\t%\è¦qËòZÜ)/×ùÃ8Úr/ÉÄÃÀ(8mpXdXûEsÄ¯xSër6 µÉÁnoà¶SéÙÏ\\n\\bA]½±Nñn)t^SÐ\\nÚ«ÀÔ{c¨Ö5§ÆåSX&IÐióXË\\n\\fSg\\t$³ È{öyè£lã´=D½ÕÑË\\rÎÅ.'´Oé\\f[ rÙ´´çK oÒCØ:t6ª\\rl¿ôÁï®!¬öC£$ôfZz¼þìxQL~%Ñq®qDë,¯£¦_0Öø\\ndºRÉRJÄ0P¯å[\\fëüèßô+Á1 V)2a\\r-4£äP9¢ÌÏ5>þ\\rS¹tâctÖÇ<»°­6°oJ¤øQÏfpN°Eg>0¾¨´Å+-¹4Ø-ºÃ1_îaÉ×%ÊÉèþÇ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #66
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'RA01drñ¯ËbQ`®LY'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #72
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
    //   128: putstatic burp/Zeh3.a : [Ljava/lang/String;
    //   131: bipush #62
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zeh3.b : [Ljava/lang/String;
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
    //   212: bipush #68
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #118
    //   224: goto -> 244
    //   227: bipush #71
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #105
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: bipush #18
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #-25153
    //   310: sipush #-25112
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #-25205
    //   322: sipush #26630
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #-25211
    //   334: sipush #19735
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #-25197
    //   346: sipush #19870
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #-25190
    //   358: sipush #-10815
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #-25210
    //   370: sipush #-20920
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #6
    //   380: sipush #-25161
    //   383: sipush #-579
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aastore
    //   390: dup
    //   391: bipush #7
    //   393: sipush #-25204
    //   396: sipush #7662
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #8
    //   406: sipush #-25216
    //   409: sipush #1979
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #9
    //   419: sipush #-25200
    //   422: sipush #30733
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #10
    //   432: sipush #-25189
    //   435: sipush #-1495
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: bipush #11
    //   445: sipush #-25183
    //   448: sipush #8360
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush #12
    //   458: sipush #-25175
    //   461: sipush #-3255
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: bipush #13
    //   471: sipush #-25188
    //   474: sipush #22067
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: aastore
    //   481: dup
    //   482: bipush #14
    //   484: sipush #-25167
    //   487: sipush #31302
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: aastore
    //   494: dup
    //   495: bipush #15
    //   497: sipush #-25156
    //   500: sipush #-28072
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: aastore
    //   507: dup
    //   508: bipush #16
    //   510: sipush #-25214
    //   513: sipush #-18175
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: aastore
    //   520: dup
    //   521: bipush #17
    //   523: sipush #-25201
    //   526: sipush #-2327
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aastore
    //   533: putstatic burp/Zeh3.ZE : [Ljava/lang/String;
    //   536: bipush #18
    //   538: anewarray [Ljava/lang/String;
    //   541: dup
    //   542: iconst_0
    //   543: iconst_2
    //   544: anewarray java/lang/String
    //   547: dup
    //   548: iconst_0
    //   549: sipush #-25155
    //   552: sipush #9287
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aastore
    //   559: dup
    //   560: iconst_1
    //   561: sipush #-25174
    //   564: sipush #-13547
    //   567: invokestatic a : (II)Ljava/lang/String;
    //   570: aastore
    //   571: aastore
    //   572: dup
    //   573: iconst_1
    //   574: iconst_2
    //   575: anewarray java/lang/String
    //   578: dup
    //   579: iconst_0
    //   580: sipush #-25185
    //   583: sipush #2330
    //   586: invokestatic a : (II)Ljava/lang/String;
    //   589: aastore
    //   590: dup
    //   591: iconst_1
    //   592: sipush #-25159
    //   595: sipush #-16774
    //   598: invokestatic a : (II)Ljava/lang/String;
    //   601: aastore
    //   602: aastore
    //   603: dup
    //   604: iconst_2
    //   605: iconst_2
    //   606: anewarray java/lang/String
    //   609: dup
    //   610: iconst_0
    //   611: sipush #-25168
    //   614: sipush #-2961
    //   617: invokestatic a : (II)Ljava/lang/String;
    //   620: aastore
    //   621: dup
    //   622: iconst_1
    //   623: sipush #-25186
    //   626: sipush #-27487
    //   629: invokestatic a : (II)Ljava/lang/String;
    //   632: aastore
    //   633: aastore
    //   634: dup
    //   635: iconst_3
    //   636: iconst_2
    //   637: anewarray java/lang/String
    //   640: dup
    //   641: iconst_0
    //   642: sipush #-25172
    //   645: sipush #16507
    //   648: invokestatic a : (II)Ljava/lang/String;
    //   651: aastore
    //   652: dup
    //   653: iconst_1
    //   654: sipush #-25184
    //   657: sipush #-22288
    //   660: invokestatic a : (II)Ljava/lang/String;
    //   663: aastore
    //   664: aastore
    //   665: dup
    //   666: iconst_4
    //   667: iconst_3
    //   668: anewarray java/lang/String
    //   671: dup
    //   672: iconst_0
    //   673: sipush #-25172
    //   676: sipush #16507
    //   679: invokestatic a : (II)Ljava/lang/String;
    //   682: aastore
    //   683: dup
    //   684: iconst_1
    //   685: sipush #-25184
    //   688: sipush #-22288
    //   691: invokestatic a : (II)Ljava/lang/String;
    //   694: aastore
    //   695: dup
    //   696: iconst_2
    //   697: sipush #-25181
    //   700: sipush #-20704
    //   703: invokestatic a : (II)Ljava/lang/String;
    //   706: aastore
    //   707: aastore
    //   708: dup
    //   709: iconst_5
    //   710: iconst_2
    //   711: anewarray java/lang/String
    //   714: dup
    //   715: iconst_0
    //   716: sipush #-25172
    //   719: sipush #16507
    //   722: invokestatic a : (II)Ljava/lang/String;
    //   725: aastore
    //   726: dup
    //   727: iconst_1
    //   728: sipush #-25184
    //   731: sipush #-22288
    //   734: invokestatic a : (II)Ljava/lang/String;
    //   737: aastore
    //   738: aastore
    //   739: dup
    //   740: bipush #6
    //   742: bipush #8
    //   744: anewarray java/lang/String
    //   747: dup
    //   748: iconst_0
    //   749: sipush #-25178
    //   752: sipush #10814
    //   755: invokestatic a : (II)Ljava/lang/String;
    //   758: aastore
    //   759: dup
    //   760: iconst_1
    //   761: sipush #-25206
    //   764: sipush #-16020
    //   767: invokestatic a : (II)Ljava/lang/String;
    //   770: aastore
    //   771: dup
    //   772: iconst_2
    //   773: sipush #-25194
    //   776: sipush #-21277
    //   779: invokestatic a : (II)Ljava/lang/String;
    //   782: aastore
    //   783: dup
    //   784: iconst_3
    //   785: sipush #-25212
    //   788: sipush #-16252
    //   791: invokestatic a : (II)Ljava/lang/String;
    //   794: aastore
    //   795: dup
    //   796: iconst_4
    //   797: sipush #-25196
    //   800: sipush #28735
    //   803: invokestatic a : (II)Ljava/lang/String;
    //   806: aastore
    //   807: dup
    //   808: iconst_5
    //   809: sipush #-25182
    //   812: sipush #-24997
    //   815: invokestatic a : (II)Ljava/lang/String;
    //   818: aastore
    //   819: dup
    //   820: bipush #6
    //   822: sipush #-25177
    //   825: sipush #31181
    //   828: invokestatic a : (II)Ljava/lang/String;
    //   831: aastore
    //   832: dup
    //   833: bipush #7
    //   835: sipush #-25187
    //   838: sipush #30628
    //   841: invokestatic a : (II)Ljava/lang/String;
    //   844: aastore
    //   845: aastore
    //   846: dup
    //   847: bipush #7
    //   849: iconst_4
    //   850: anewarray java/lang/String
    //   853: dup
    //   854: iconst_0
    //   855: sipush #-25199
    //   858: sipush #17115
    //   861: invokestatic a : (II)Ljava/lang/String;
    //   864: aastore
    //   865: dup
    //   866: iconst_1
    //   867: sipush #-25209
    //   870: sipush #-10276
    //   873: invokestatic a : (II)Ljava/lang/String;
    //   876: aastore
    //   877: dup
    //   878: iconst_2
    //   879: sipush #-25166
    //   882: sipush #19524
    //   885: invokestatic a : (II)Ljava/lang/String;
    //   888: aastore
    //   889: dup
    //   890: iconst_3
    //   891: sipush #-25203
    //   894: sipush #997
    //   897: invokestatic a : (II)Ljava/lang/String;
    //   900: aastore
    //   901: aastore
    //   902: dup
    //   903: bipush #8
    //   905: iconst_4
    //   906: anewarray java/lang/String
    //   909: dup
    //   910: iconst_0
    //   911: sipush #-25193
    //   914: sipush #-10956
    //   917: invokestatic a : (II)Ljava/lang/String;
    //   920: aastore
    //   921: dup
    //   922: iconst_1
    //   923: sipush #-25173
    //   926: sipush #17871
    //   929: invokestatic a : (II)Ljava/lang/String;
    //   932: aastore
    //   933: dup
    //   934: iconst_2
    //   935: sipush #-25157
    //   938: sipush #27407
    //   941: invokestatic a : (II)Ljava/lang/String;
    //   944: aastore
    //   945: dup
    //   946: iconst_3
    //   947: sipush #-25164
    //   950: sipush #-30722
    //   953: invokestatic a : (II)Ljava/lang/String;
    //   956: aastore
    //   957: aastore
    //   958: dup
    //   959: bipush #9
    //   961: iconst_4
    //   962: anewarray java/lang/String
    //   965: dup
    //   966: iconst_0
    //   967: sipush #-25195
    //   970: sipush #-2318
    //   973: invokestatic a : (II)Ljava/lang/String;
    //   976: aastore
    //   977: dup
    //   978: iconst_1
    //   979: sipush #-25213
    //   982: sipush #-9680
    //   985: invokestatic a : (II)Ljava/lang/String;
    //   988: aastore
    //   989: dup
    //   990: iconst_2
    //   991: sipush #-25171
    //   994: sipush #-9245
    //   997: invokestatic a : (II)Ljava/lang/String;
    //   1000: aastore
    //   1001: dup
    //   1002: iconst_3
    //   1003: sipush #-25215
    //   1006: sipush #2478
    //   1009: invokestatic a : (II)Ljava/lang/String;
    //   1012: aastore
    //   1013: aastore
    //   1014: dup
    //   1015: bipush #10
    //   1017: iconst_2
    //   1018: anewarray java/lang/String
    //   1021: dup
    //   1022: iconst_0
    //   1023: sipush #-25172
    //   1026: sipush #16507
    //   1029: invokestatic a : (II)Ljava/lang/String;
    //   1032: aastore
    //   1033: dup
    //   1034: iconst_1
    //   1035: sipush #-25184
    //   1038: sipush #-22288
    //   1041: invokestatic a : (II)Ljava/lang/String;
    //   1044: aastore
    //   1045: aastore
    //   1046: dup
    //   1047: bipush #11
    //   1049: iconst_2
    //   1050: anewarray java/lang/String
    //   1053: dup
    //   1054: iconst_0
    //   1055: sipush #-25172
    //   1058: sipush #16507
    //   1061: invokestatic a : (II)Ljava/lang/String;
    //   1064: aastore
    //   1065: dup
    //   1066: iconst_1
    //   1067: sipush #-25184
    //   1070: sipush #-22288
    //   1073: invokestatic a : (II)Ljava/lang/String;
    //   1076: aastore
    //   1077: aastore
    //   1078: dup
    //   1079: bipush #12
    //   1081: iconst_2
    //   1082: anewarray java/lang/String
    //   1085: dup
    //   1086: iconst_0
    //   1087: sipush #-25172
    //   1090: sipush #16507
    //   1093: invokestatic a : (II)Ljava/lang/String;
    //   1096: aastore
    //   1097: dup
    //   1098: iconst_1
    //   1099: sipush #-25184
    //   1102: sipush #-22288
    //   1105: invokestatic a : (II)Ljava/lang/String;
    //   1108: aastore
    //   1109: aastore
    //   1110: dup
    //   1111: bipush #13
    //   1113: iconst_2
    //   1114: anewarray java/lang/String
    //   1117: dup
    //   1118: iconst_0
    //   1119: sipush #-25172
    //   1122: sipush #16507
    //   1125: invokestatic a : (II)Ljava/lang/String;
    //   1128: aastore
    //   1129: dup
    //   1130: iconst_1
    //   1131: sipush #-25184
    //   1134: sipush #-22288
    //   1137: invokestatic a : (II)Ljava/lang/String;
    //   1140: aastore
    //   1141: aastore
    //   1142: dup
    //   1143: bipush #14
    //   1145: iconst_2
    //   1146: anewarray java/lang/String
    //   1149: dup
    //   1150: iconst_0
    //   1151: sipush #-25172
    //   1154: sipush #16507
    //   1157: invokestatic a : (II)Ljava/lang/String;
    //   1160: aastore
    //   1161: dup
    //   1162: iconst_1
    //   1163: sipush #-25184
    //   1166: sipush #-22288
    //   1169: invokestatic a : (II)Ljava/lang/String;
    //   1172: aastore
    //   1173: aastore
    //   1174: dup
    //   1175: bipush #15
    //   1177: iconst_2
    //   1178: anewarray java/lang/String
    //   1181: dup
    //   1182: iconst_0
    //   1183: sipush #-25172
    //   1186: sipush #16507
    //   1189: invokestatic a : (II)Ljava/lang/String;
    //   1192: aastore
    //   1193: dup
    //   1194: iconst_1
    //   1195: sipush #-25184
    //   1198: sipush #-22288
    //   1201: invokestatic a : (II)Ljava/lang/String;
    //   1204: aastore
    //   1205: aastore
    //   1206: dup
    //   1207: bipush #16
    //   1209: iconst_4
    //   1210: anewarray java/lang/String
    //   1213: dup
    //   1214: iconst_0
    //   1215: sipush #-25193
    //   1218: sipush #-10956
    //   1221: invokestatic a : (II)Ljava/lang/String;
    //   1224: aastore
    //   1225: dup
    //   1226: iconst_1
    //   1227: sipush #-25173
    //   1230: sipush #17871
    //   1233: invokestatic a : (II)Ljava/lang/String;
    //   1236: aastore
    //   1237: dup
    //   1238: iconst_2
    //   1239: sipush #-25157
    //   1242: sipush #27407
    //   1245: invokestatic a : (II)Ljava/lang/String;
    //   1248: aastore
    //   1249: dup
    //   1250: iconst_3
    //   1251: sipush #-25164
    //   1254: sipush #-30722
    //   1257: invokestatic a : (II)Ljava/lang/String;
    //   1260: aastore
    //   1261: aastore
    //   1262: dup
    //   1263: bipush #17
    //   1265: iconst_4
    //   1266: anewarray java/lang/String
    //   1269: dup
    //   1270: iconst_0
    //   1271: sipush #-25180
    //   1274: sipush #-30724
    //   1277: invokestatic a : (II)Ljava/lang/String;
    //   1280: aastore
    //   1281: dup
    //   1282: iconst_1
    //   1283: sipush #-25176
    //   1286: sipush #23789
    //   1289: invokestatic a : (II)Ljava/lang/String;
    //   1292: aastore
    //   1293: dup
    //   1294: iconst_2
    //   1295: sipush #-25165
    //   1298: sipush #27975
    //   1301: invokestatic a : (II)Ljava/lang/String;
    //   1304: aastore
    //   1305: dup
    //   1306: iconst_3
    //   1307: sipush #-25207
    //   1310: sipush #11178
    //   1313: invokestatic a : (II)Ljava/lang/String;
    //   1316: aastore
    //   1317: aastore
    //   1318: putstatic burp/Zeh3.ZN : [[Ljava/lang/String;
    //   1321: return
  }
  
  private static Zzam a(Zzam paramZzam) {
    return paramZzam;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9D90) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeh3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */