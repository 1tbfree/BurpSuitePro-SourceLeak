package burp;

import java.util.Map;

public class Zsqw {
  public static final int Zz;
  
  private static final Map<Integer, String> Zv;
  
  private static final Map<String, Integer> ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZO(int paramInt1, int paramInt2) {
    return Zs(paramInt1) + Zs(paramInt1);
  }
  
  private static String Zs(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    if ((paramInt & Zz) != 0)
      stringBuilder.append(a(1270, -24439)); 
    if ((paramInt & 0x1) != 0)
      stringBuilder.append(a(1221, -19197)); 
    if ((paramInt & 0x8) != 0)
      stringBuilder.append(a(1210, 16079)); 
    return stringBuilder.toString();
  }
  
  private static int ZF(String paramString) {
    int i = 0;
    if (paramString.startsWith(a(1031, 26287))) {
      i |= Zz;
      paramString = paramString.substring(5);
    } 
    if (paramString.startsWith(a(1163, -3043))) {
      i |= 0x1;
      paramString = paramString.substring(6);
    } 
    if (paramString.startsWith(a(1026, 9595)))
      i |= 0x8; 
    return i;
  }
  
  private static String ZL(int paramInt) {
    if ((paramInt >= 48 && paramInt <= 57) || (paramInt >= 65 && paramInt <= 90))
      return String.valueOf((char)paramInt); 
    String str = Zv.get(Integer.valueOf(paramInt));
    return (str != null) ? str : (((paramInt & 0x1000000) != 0) ? String.valueOf((char)(paramInt ^ 0x1000000)) : (a(1155, -31701) + a(1155, -31701)));
  }
  
  private static int Zg(String paramString) {
    if (paramString.isEmpty())
      return 0; 
    if (paramString.length() == 1) {
      char c = paramString.charAt(0);
      if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z'))
        return c; 
    } 
    Integer integer = ZJ.get(paramString);
    return (integer != null) ? integer.intValue() : (paramString.startsWith(a(1265, -21334)) ? Integer.parseInt(paramString.substring(2), 16) : (paramString.charAt(0) | 0x1000000));
  }
  
  static {
    // Byte code:
    //   0: sipush #159
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ÓÔöÒù|\\tWc|*ëÿ6\\b<V¯×¾ ûÉ\\n¿ª]kw.Wñ\\b]Æ%wN\\têpÐyBJ¥=J¡§5\\b|§|µi¡[Á+ôGLÍ÷ó$L\\fùX9{ý$_¶¢öÿcJ3(=HÆzc`öÅ *ñ².js Ö¹0q*ü8\\b¦-üÈù¶Õ(\\f\\b¯Ý]ÝQ}£å\ãé±^}\\f3MÏ&Á)à\\\f)hþbÖR0~vVEgÇ§RÂµÍ\\b­v!r=¬¯|Tõ¹I8|êºoÁ\\bØveaKÎ\\n\\r= ¨ÕæZÝNjéåf±'gáÀÚpÛ¹ã_£\\n K44­SãY\\tñ\\t§×ÍXu'Ï¿öÍ\\n#+.Ëý´g£ñKvöü`°]4µ¦6ÐáÓH\\b<Èêòª3³Ñøí¦ç\KËÊèä"|\\bÍUÇTW`\\fPB¾¿ÅÔÛ[ÓÔ\\r\\fþ\\nñ4[¡çàþ j¦ýk¯Hú1bèøgEùÿÈnÏÙD!Õvt®ù`oßW²`²¤ðâÜ éÎò\\bÜ6³«Úè ù\\fPÊ aØÉäGÀ4ä[ÖâT Ó*jÎÃ\\fLUcU\\n'\\nOôââD»+L?QX9»i©þõfsÚð}è=çC¡3àÓü%àï<ÖËÄ5e±G¦FÿmMmAj(5Ê«;à<¥Geq±ù0sÖ*öÏòÌ%®ÊßL!OÁXÁæ¸gNA{ZKB45YG®6\\tM^vì´ZÒ#õèðcãº G±½%%q²ñÔÚxôQPÐGcòåi/+ælºTL@ìÃv\\f\\n¬Ø? ;O§))·À\\b\\n¨¡toÃÄ¤×A\\bÏè{=R\\nÚÒ4,J~á_\\b½kF®Thå\\tz:Y«ü"<õ2E:Uu[±ÖüâKn,þK\\b¢6|«éÚÚ¼\\nuZÚd0q¼lÍ0lK%pv>­]Ð±yEéj¶Ê-#³Æí¨m\\t tDs\\rñÃQ3[ÑöP«§sí£ÌCpi6æ¨]ý\\n/îî±¶Ël;\\tWáòÎB×e½-JËì$°iÉóDÇÒpíM]vzÆ 6°C\\b±Ý¥^}\\bïÕ¾Üx|în÷¬¥1@ICG±9]Ä&¶îµË?úß=Sí8\\n¶/M$'wÓf?\\f\\nøK\\fÂßÁú+h0AjS\\bJÎ/v-\\nÒô5Õ\\fFdbÊ\\r.ÅCÌH5\\bÔàÜMxN\\rm¦$y¥§ØÞ)áY\\bdi¤@ò§¹+Q>\\n\\nW9ç9p"\\f¢;¨Í/rdBµ\\bÄÓGä§­1¾^4¤Í> \\r­*1?¢Þà?ó{â!±pSr;\\nn¹f÷$8_7ÎÃ>ã*\\b½ØvaXÔ?\\teLÃÂÒh=]Rãk\\b»c_[C æñcá@ä_û® äs0'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: iconst_2
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #125
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   68: ldc '_~?Ó3O¹uÚ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #88
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 144
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
    //   129: putstatic burp/Zsqw.a : [Ljava/lang/String;
    //   132: sipush #159
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zsqw.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #83
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #122
    //   224: goto -> 244
    //   227: bipush #115
    //   229: goto -> 244
    //   232: bipush #90
    //   234: goto -> 244
    //   237: bipush #45
    //   239: goto -> 244
    //   242: bipush #19
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
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
    //   300: iconst_2
    //   301: invokestatic isHeadless : ()Z
    //   304: ifeq -> 311
    //   307: iconst_0
    //   308: goto -> 317
    //   311: invokestatic getDefaultToolkit : ()Ljava/awt/Toolkit;
    //   314: invokevirtual getMenuShortcutKeyMask : ()I
    //   317: ior
    //   318: putstatic burp/Zsqw.Zz : I
    //   321: new java/util/HashMap
    //   324: dup
    //   325: invokespecial <init> : ()V
    //   328: putstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   331: new java/util/HashMap
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: putstatic burp/Zsqw.ZJ : Ljava/util/Map;
    //   341: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   344: bipush #10
    //   346: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   349: sipush #1052
    //   352: sipush #10480
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   363: pop
    //   364: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   367: bipush #8
    //   369: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   372: sipush #1203
    //   375: sipush #3450
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   386: pop
    //   387: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   390: bipush #9
    //   392: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   395: sipush #1055
    //   398: sipush #31997
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   409: pop
    //   410: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   413: iconst_3
    //   414: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   417: sipush #1027
    //   420: sipush #-4996
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   431: pop
    //   432: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   435: bipush #12
    //   437: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   440: sipush #1279
    //   443: sipush #16036
    //   446: invokestatic a : (II)Ljava/lang/String;
    //   449: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   454: pop
    //   455: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   458: ldc 65312
    //   460: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   463: sipush #1046
    //   466: sipush #21706
    //   469: invokestatic a : (II)Ljava/lang/String;
    //   472: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   477: pop
    //   478: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   481: bipush #19
    //   483: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   486: sipush #1154
    //   489: sipush #26327
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   500: pop
    //   501: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   504: bipush #20
    //   506: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   509: sipush #1171
    //   512: sipush #-19251
    //   515: invokestatic a : (II)Ljava/lang/String;
    //   518: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   523: pop
    //   524: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   527: bipush #27
    //   529: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   532: sipush #1239
    //   535: sipush #-11937
    //   538: invokestatic a : (II)Ljava/lang/String;
    //   541: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   546: pop
    //   547: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   550: bipush #32
    //   552: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   555: sipush #1256
    //   558: sipush #16086
    //   561: invokestatic a : (II)Ljava/lang/String;
    //   564: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   569: pop
    //   570: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   573: bipush #33
    //   575: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   578: sipush #1225
    //   581: sipush #-32492
    //   584: invokestatic a : (II)Ljava/lang/String;
    //   587: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   592: pop
    //   593: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   596: bipush #34
    //   598: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   601: sipush #1257
    //   604: sipush #20915
    //   607: invokestatic a : (II)Ljava/lang/String;
    //   610: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   615: pop
    //   616: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   619: bipush #35
    //   621: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   624: sipush #1205
    //   627: sipush #9427
    //   630: invokestatic a : (II)Ljava/lang/String;
    //   633: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   638: pop
    //   639: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   642: bipush #36
    //   644: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   647: sipush #1169
    //   650: sipush #1448
    //   653: invokestatic a : (II)Ljava/lang/String;
    //   656: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   661: pop
    //   662: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   665: bipush #37
    //   667: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   670: sipush #1202
    //   673: sipush #14924
    //   676: invokestatic a : (II)Ljava/lang/String;
    //   679: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   684: pop
    //   685: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   688: bipush #38
    //   690: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   693: sipush #1193
    //   696: sipush #-16766
    //   699: invokestatic a : (II)Ljava/lang/String;
    //   702: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   707: pop
    //   708: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   711: bipush #39
    //   713: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   716: sipush #1188
    //   719: sipush #-20839
    //   722: invokestatic a : (II)Ljava/lang/String;
    //   725: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   730: pop
    //   731: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   734: bipush #40
    //   736: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   739: sipush #1237
    //   742: sipush #-32013
    //   745: invokestatic a : (II)Ljava/lang/String;
    //   748: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   753: pop
    //   754: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   757: ldc 65368
    //   759: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   762: sipush #1045
    //   765: sipush #13550
    //   768: invokestatic a : (II)Ljava/lang/String;
    //   771: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   776: pop
    //   777: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   780: bipush #16
    //   782: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   785: sipush #1158
    //   788: sipush #-31539
    //   791: invokestatic a : (II)Ljava/lang/String;
    //   794: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   799: pop
    //   800: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   803: bipush #17
    //   805: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   808: sipush #1204
    //   811: sipush #-21914
    //   814: invokestatic a : (II)Ljava/lang/String;
    //   817: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   822: pop
    //   823: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   826: bipush #18
    //   828: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   831: sipush #1278
    //   834: sipush #-6414
    //   837: invokestatic a : (II)Ljava/lang/String;
    //   840: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   845: pop
    //   846: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   849: sipush #157
    //   852: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   855: sipush #1162
    //   858: sipush #27427
    //   861: invokestatic a : (II)Ljava/lang/String;
    //   864: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   869: pop
    //   870: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   873: ldc 65406
    //   875: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   878: sipush #1224
    //   881: sipush #9939
    //   884: invokestatic a : (II)Ljava/lang/String;
    //   887: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   892: pop
    //   893: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   896: bipush #44
    //   898: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   901: sipush #1217
    //   904: sipush #3721
    //   907: invokestatic a : (II)Ljava/lang/String;
    //   910: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   915: pop
    //   916: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   919: bipush #46
    //   921: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   924: sipush #1161
    //   927: sipush #30339
    //   930: invokestatic a : (II)Ljava/lang/String;
    //   933: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   938: pop
    //   939: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   942: bipush #47
    //   944: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   947: sipush #1229
    //   950: sipush #32142
    //   953: invokestatic a : (II)Ljava/lang/String;
    //   956: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   961: pop
    //   962: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   965: bipush #59
    //   967: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   970: sipush #1176
    //   973: sipush #-13388
    //   976: invokestatic a : (II)Ljava/lang/String;
    //   979: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   984: pop
    //   985: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   988: bipush #61
    //   990: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   993: sipush #1247
    //   996: sipush #10992
    //   999: invokestatic a : (II)Ljava/lang/String;
    //   1002: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1007: pop
    //   1008: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1011: bipush #91
    //   1013: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1016: sipush #1241
    //   1019: sipush #27681
    //   1022: invokestatic a : (II)Ljava/lang/String;
    //   1025: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1030: pop
    //   1031: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1034: bipush #92
    //   1036: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1039: sipush #1240
    //   1042: sipush #-30553
    //   1045: invokestatic a : (II)Ljava/lang/String;
    //   1048: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1053: pop
    //   1054: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1057: bipush #93
    //   1059: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1062: sipush #1049
    //   1065: sipush #-14821
    //   1068: invokestatic a : (II)Ljava/lang/String;
    //   1071: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1076: pop
    //   1077: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1080: bipush #106
    //   1082: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1085: sipush #1168
    //   1088: sipush #31208
    //   1091: invokestatic a : (II)Ljava/lang/String;
    //   1094: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1099: pop
    //   1100: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1103: bipush #107
    //   1105: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1108: sipush #1276
    //   1111: sipush #7643
    //   1114: invokestatic a : (II)Ljava/lang/String;
    //   1117: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1122: pop
    //   1123: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1126: bipush #108
    //   1128: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1131: sipush #1053
    //   1134: sipush #32295
    //   1137: invokestatic a : (II)Ljava/lang/String;
    //   1140: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1145: pop
    //   1146: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1149: bipush #109
    //   1151: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1154: sipush #1251
    //   1157: sipush #-18791
    //   1160: invokestatic a : (II)Ljava/lang/String;
    //   1163: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1168: pop
    //   1169: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1172: bipush #110
    //   1174: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1177: sipush #1209
    //   1180: sipush #10785
    //   1183: invokestatic a : (II)Ljava/lang/String;
    //   1186: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1191: pop
    //   1192: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1195: bipush #111
    //   1197: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1200: sipush #1051
    //   1203: sipush #14974
    //   1206: invokestatic a : (II)Ljava/lang/String;
    //   1209: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1214: pop
    //   1215: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1218: bipush #127
    //   1220: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1223: sipush #1255
    //   1226: sipush #-19593
    //   1229: invokestatic a : (II)Ljava/lang/String;
    //   1232: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1237: pop
    //   1238: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1241: sipush #144
    //   1244: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1247: sipush #1183
    //   1250: sipush #-31877
    //   1253: invokestatic a : (II)Ljava/lang/String;
    //   1256: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1261: pop
    //   1262: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1265: sipush #145
    //   1268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1271: sipush #1235
    //   1274: sipush #13530
    //   1277: invokestatic a : (II)Ljava/lang/String;
    //   1280: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1285: pop
    //   1286: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1289: sipush #524
    //   1292: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1295: sipush #1238
    //   1298: sipush #-30609
    //   1301: invokestatic a : (II)Ljava/lang/String;
    //   1304: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1309: pop
    //   1310: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1313: sipush #525
    //   1316: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1319: sipush #1252
    //   1322: sipush #-24150
    //   1325: invokestatic a : (II)Ljava/lang/String;
    //   1328: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1333: pop
    //   1334: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1337: bipush #112
    //   1339: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1342: sipush #1211
    //   1345: sipush #1161
    //   1348: invokestatic a : (II)Ljava/lang/String;
    //   1351: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1356: pop
    //   1357: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1360: bipush #113
    //   1362: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1365: sipush #1044
    //   1368: sipush #15111
    //   1371: invokestatic a : (II)Ljava/lang/String;
    //   1374: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1379: pop
    //   1380: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1383: bipush #114
    //   1385: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1388: sipush #1246
    //   1391: sipush #-8254
    //   1394: invokestatic a : (II)Ljava/lang/String;
    //   1397: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1402: pop
    //   1403: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1406: bipush #115
    //   1408: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1411: sipush #1034
    //   1414: sipush #9096
    //   1417: invokestatic a : (II)Ljava/lang/String;
    //   1420: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1425: pop
    //   1426: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1429: bipush #116
    //   1431: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1434: sipush #1178
    //   1437: sipush #-32642
    //   1440: invokestatic a : (II)Ljava/lang/String;
    //   1443: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1448: pop
    //   1449: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1452: bipush #117
    //   1454: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1457: sipush #1025
    //   1460: sipush #21682
    //   1463: invokestatic a : (II)Ljava/lang/String;
    //   1466: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1471: pop
    //   1472: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1475: bipush #118
    //   1477: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1480: sipush #1179
    //   1483: sipush #-22337
    //   1486: invokestatic a : (II)Ljava/lang/String;
    //   1489: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1494: pop
    //   1495: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1498: bipush #119
    //   1500: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1503: sipush #1181
    //   1506: sipush #6345
    //   1509: invokestatic a : (II)Ljava/lang/String;
    //   1512: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1517: pop
    //   1518: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1521: bipush #120
    //   1523: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1526: sipush #1166
    //   1529: sipush #18238
    //   1532: invokestatic a : (II)Ljava/lang/String;
    //   1535: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1540: pop
    //   1541: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1544: bipush #121
    //   1546: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1549: sipush #1226
    //   1552: sipush #16633
    //   1555: invokestatic a : (II)Ljava/lang/String;
    //   1558: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1563: pop
    //   1564: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1567: bipush #122
    //   1569: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1572: sipush #1214
    //   1575: sipush #28806
    //   1578: invokestatic a : (II)Ljava/lang/String;
    //   1581: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1586: pop
    //   1587: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1590: bipush #123
    //   1592: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1595: sipush #1231
    //   1598: sipush #12330
    //   1601: invokestatic a : (II)Ljava/lang/String;
    //   1604: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1609: pop
    //   1610: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1613: ldc 61440
    //   1615: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1618: sipush #1201
    //   1621: sipush #28395
    //   1624: invokestatic a : (II)Ljava/lang/String;
    //   1627: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1632: pop
    //   1633: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1636: ldc 61441
    //   1638: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1641: sipush #1033
    //   1644: sipush #-23855
    //   1647: invokestatic a : (II)Ljava/lang/String;
    //   1650: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1655: pop
    //   1656: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1659: ldc 61442
    //   1661: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1664: sipush #1219
    //   1667: sipush #-30191
    //   1670: invokestatic a : (II)Ljava/lang/String;
    //   1673: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1678: pop
    //   1679: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1682: ldc 61443
    //   1684: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1687: sipush #1271
    //   1690: sipush #8295
    //   1693: invokestatic a : (II)Ljava/lang/String;
    //   1696: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1701: pop
    //   1702: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1705: ldc 61444
    //   1707: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1710: sipush #1156
    //   1713: sipush #2536
    //   1716: invokestatic a : (II)Ljava/lang/String;
    //   1719: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1724: pop
    //   1725: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1728: ldc 61445
    //   1730: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1733: sipush #1195
    //   1736: sipush #6910
    //   1739: invokestatic a : (II)Ljava/lang/String;
    //   1742: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1747: pop
    //   1748: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1751: ldc 61446
    //   1753: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1756: sipush #1173
    //   1759: sipush #-17860
    //   1762: invokestatic a : (II)Ljava/lang/String;
    //   1765: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1770: pop
    //   1771: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1774: ldc 61447
    //   1776: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1779: sipush #1054
    //   1782: sipush #17392
    //   1785: invokestatic a : (II)Ljava/lang/String;
    //   1788: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1793: pop
    //   1794: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1797: ldc 61448
    //   1799: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1802: sipush #1160
    //   1805: sipush #21517
    //   1808: invokestatic a : (II)Ljava/lang/String;
    //   1811: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1816: pop
    //   1817: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1820: ldc 61449
    //   1822: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1825: sipush #1230
    //   1828: sipush #5585
    //   1831: invokestatic a : (II)Ljava/lang/String;
    //   1834: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1839: pop
    //   1840: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1843: ldc 61450
    //   1845: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1848: sipush #1024
    //   1851: sipush #-25773
    //   1854: invokestatic a : (II)Ljava/lang/String;
    //   1857: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1862: pop
    //   1863: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1866: ldc 61451
    //   1868: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1871: sipush #1043
    //   1874: sipush #-6618
    //   1877: invokestatic a : (II)Ljava/lang/String;
    //   1880: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1885: pop
    //   1886: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1889: sipush #154
    //   1892: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1895: sipush #1198
    //   1898: sipush #25055
    //   1901: invokestatic a : (II)Ljava/lang/String;
    //   1904: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1909: pop
    //   1910: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1913: sipush #155
    //   1916: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1919: sipush #1215
    //   1922: sipush #-6085
    //   1925: invokestatic a : (II)Ljava/lang/String;
    //   1928: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1933: pop
    //   1934: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1937: sipush #156
    //   1940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1943: sipush #1197
    //   1946: sipush #-10463
    //   1949: invokestatic a : (II)Ljava/lang/String;
    //   1952: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1957: pop
    //   1958: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1961: sipush #192
    //   1964: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1967: sipush #1035
    //   1970: sipush #-16092
    //   1973: invokestatic a : (II)Ljava/lang/String;
    //   1976: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1981: pop
    //   1982: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   1985: sipush #222
    //   1988: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1991: sipush #1185
    //   1994: sipush #27847
    //   1997: invokestatic a : (II)Ljava/lang/String;
    //   2000: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2005: pop
    //   2006: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2009: sipush #224
    //   2012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2015: sipush #1266
    //   2018: sipush #-596
    //   2021: invokestatic a : (II)Ljava/lang/String;
    //   2024: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2029: pop
    //   2030: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2033: sipush #225
    //   2036: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2039: sipush #1253
    //   2042: sipush #-25633
    //   2045: invokestatic a : (II)Ljava/lang/String;
    //   2048: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2053: pop
    //   2054: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2057: sipush #226
    //   2060: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2063: sipush #1250
    //   2066: sipush #-2258
    //   2069: invokestatic a : (II)Ljava/lang/String;
    //   2072: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2077: pop
    //   2078: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2081: sipush #227
    //   2084: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2087: sipush #1248
    //   2090: sipush #19204
    //   2093: invokestatic a : (II)Ljava/lang/String;
    //   2096: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2101: pop
    //   2102: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2105: sipush #128
    //   2108: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2111: sipush #1182
    //   2114: sipush #18696
    //   2117: invokestatic a : (II)Ljava/lang/String;
    //   2120: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2125: pop
    //   2126: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2129: sipush #129
    //   2132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2135: sipush #1200
    //   2138: sipush #16512
    //   2141: invokestatic a : (II)Ljava/lang/String;
    //   2144: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2149: pop
    //   2150: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2153: sipush #130
    //   2156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2159: sipush #1047
    //   2162: sipush #-28241
    //   2165: invokestatic a : (II)Ljava/lang/String;
    //   2168: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2173: pop
    //   2174: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2177: sipush #131
    //   2180: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2183: sipush #1050
    //   2186: sipush #-15708
    //   2189: invokestatic a : (II)Ljava/lang/String;
    //   2192: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2197: pop
    //   2198: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2201: sipush #132
    //   2204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2207: sipush #1030
    //   2210: sipush #19683
    //   2213: invokestatic a : (II)Ljava/lang/String;
    //   2216: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2221: pop
    //   2222: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2225: sipush #133
    //   2228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2231: sipush #1222
    //   2234: sipush #-15495
    //   2237: invokestatic a : (II)Ljava/lang/String;
    //   2240: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2245: pop
    //   2246: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2249: sipush #134
    //   2252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2255: sipush #1175
    //   2258: sipush #12865
    //   2261: invokestatic a : (II)Ljava/lang/String;
    //   2264: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2269: pop
    //   2270: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2273: sipush #135
    //   2276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2279: sipush #1048
    //   2282: sipush #30596
    //   2285: invokestatic a : (II)Ljava/lang/String;
    //   2288: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2293: pop
    //   2294: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2297: sipush #136
    //   2300: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2303: sipush #1189
    //   2306: sipush #-1184
    //   2309: invokestatic a : (II)Ljava/lang/String;
    //   2312: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2317: pop
    //   2318: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2321: sipush #137
    //   2324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2327: sipush #1268
    //   2330: sipush #-16776
    //   2333: invokestatic a : (II)Ljava/lang/String;
    //   2336: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2341: pop
    //   2342: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2345: sipush #138
    //   2348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2351: sipush #1274
    //   2354: sipush #-31933
    //   2357: invokestatic a : (II)Ljava/lang/String;
    //   2360: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2365: pop
    //   2366: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2369: sipush #139
    //   2372: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2375: sipush #1041
    //   2378: sipush #22241
    //   2381: invokestatic a : (II)Ljava/lang/String;
    //   2384: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2389: pop
    //   2390: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2393: sipush #140
    //   2396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2399: sipush #1152
    //   2402: sipush #23622
    //   2405: invokestatic a : (II)Ljava/lang/String;
    //   2408: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2413: pop
    //   2414: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2417: sipush #141
    //   2420: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2423: sipush #1038
    //   2426: sipush #-8834
    //   2429: invokestatic a : (II)Ljava/lang/String;
    //   2432: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2437: pop
    //   2438: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2441: sipush #142
    //   2444: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2447: sipush #1249
    //   2450: sipush #-4120
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2461: pop
    //   2462: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2465: sipush #143
    //   2468: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2471: sipush #1245
    //   2474: sipush #32541
    //   2477: invokestatic a : (II)Ljava/lang/String;
    //   2480: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2485: pop
    //   2486: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2489: sipush #150
    //   2492: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2495: sipush #1272
    //   2498: sipush #-7192
    //   2501: invokestatic a : (II)Ljava/lang/String;
    //   2504: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2509: pop
    //   2510: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2513: sipush #151
    //   2516: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2519: sipush #1040
    //   2522: sipush #-23448
    //   2525: invokestatic a : (II)Ljava/lang/String;
    //   2528: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2533: pop
    //   2534: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2537: sipush #152
    //   2540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2543: sipush #1174
    //   2546: sipush #20208
    //   2549: invokestatic a : (II)Ljava/lang/String;
    //   2552: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2557: pop
    //   2558: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2561: sipush #153
    //   2564: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2567: sipush #1223
    //   2570: sipush #21922
    //   2573: invokestatic a : (II)Ljava/lang/String;
    //   2576: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2581: pop
    //   2582: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2585: sipush #160
    //   2588: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2591: sipush #1218
    //   2594: sipush #8005
    //   2597: invokestatic a : (II)Ljava/lang/String;
    //   2600: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2605: pop
    //   2606: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2609: sipush #161
    //   2612: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2615: sipush #1220
    //   2618: sipush #-20233
    //   2621: invokestatic a : (II)Ljava/lang/String;
    //   2624: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2629: pop
    //   2630: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2633: sipush #162
    //   2636: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2639: sipush #1277
    //   2642: sipush #4505
    //   2645: invokestatic a : (II)Ljava/lang/String;
    //   2648: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2653: pop
    //   2654: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2657: sipush #512
    //   2660: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2663: sipush #1039
    //   2666: sipush #-803
    //   2669: invokestatic a : (II)Ljava/lang/String;
    //   2672: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2677: pop
    //   2678: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2681: sipush #513
    //   2684: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2687: sipush #1207
    //   2690: sipush #29720
    //   2693: invokestatic a : (II)Ljava/lang/String;
    //   2696: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2701: pop
    //   2702: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2705: sipush #514
    //   2708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2711: sipush #1254
    //   2714: sipush #23606
    //   2717: invokestatic a : (II)Ljava/lang/String;
    //   2720: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2725: pop
    //   2726: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2729: sipush #515
    //   2732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2735: sipush #1263
    //   2738: sipush #-14428
    //   2741: invokestatic a : (II)Ljava/lang/String;
    //   2744: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2749: pop
    //   2750: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2753: sipush #516
    //   2756: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2759: sipush #1184
    //   2762: sipush #21873
    //   2765: invokestatic a : (II)Ljava/lang/String;
    //   2768: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2773: pop
    //   2774: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2777: sipush #517
    //   2780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2783: sipush #1234
    //   2786: sipush #-349
    //   2789: invokestatic a : (II)Ljava/lang/String;
    //   2792: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2797: pop
    //   2798: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2801: sipush #518
    //   2804: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2807: sipush #1191
    //   2810: sipush #19925
    //   2813: invokestatic a : (II)Ljava/lang/String;
    //   2816: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2821: pop
    //   2822: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2825: sipush #519
    //   2828: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2831: sipush #1172
    //   2834: sipush #-29276
    //   2837: invokestatic a : (II)Ljava/lang/String;
    //   2840: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2845: pop
    //   2846: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2849: sipush #520
    //   2852: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2855: sipush #1164
    //   2858: sipush #8461
    //   2861: invokestatic a : (II)Ljava/lang/String;
    //   2864: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2869: pop
    //   2870: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2873: bipush #45
    //   2875: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2878: sipush #1037
    //   2881: sipush #-22679
    //   2884: invokestatic a : (II)Ljava/lang/String;
    //   2887: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2892: pop
    //   2893: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2896: sipush #521
    //   2899: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2902: sipush #1170
    //   2905: sipush #12299
    //   2908: invokestatic a : (II)Ljava/lang/String;
    //   2911: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2916: pop
    //   2917: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2920: sipush #522
    //   2923: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2926: sipush #1186
    //   2929: sipush #20082
    //   2932: invokestatic a : (II)Ljava/lang/String;
    //   2935: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2940: pop
    //   2941: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2944: sipush #523
    //   2947: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2950: sipush #1212
    //   2953: sipush #-18149
    //   2956: invokestatic a : (II)Ljava/lang/String;
    //   2959: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2964: pop
    //   2965: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2968: bipush #24
    //   2970: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2973: sipush #1206
    //   2976: sipush #4990
    //   2979: invokestatic a : (II)Ljava/lang/String;
    //   2982: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2987: pop
    //   2988: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   2991: bipush #28
    //   2993: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2996: sipush #1244
    //   2999: sipush #15893
    //   3002: invokestatic a : (II)Ljava/lang/String;
    //   3005: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3010: pop
    //   3011: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3014: bipush #29
    //   3016: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3019: sipush #1196
    //   3022: sipush #-1682
    //   3025: invokestatic a : (II)Ljava/lang/String;
    //   3028: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3033: pop
    //   3034: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3037: bipush #30
    //   3039: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3042: sipush #1042
    //   3045: sipush #21617
    //   3048: invokestatic a : (II)Ljava/lang/String;
    //   3051: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3056: pop
    //   3057: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3060: bipush #31
    //   3062: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3065: sipush #1259
    //   3068: sipush #-31990
    //   3071: invokestatic a : (II)Ljava/lang/String;
    //   3074: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3079: pop
    //   3080: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3083: bipush #21
    //   3085: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3088: sipush #1242
    //   3091: sipush #553
    //   3094: invokestatic a : (II)Ljava/lang/String;
    //   3097: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3102: pop
    //   3103: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3106: bipush #25
    //   3108: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3111: sipush #1261
    //   3114: sipush #10957
    //   3117: invokestatic a : (II)Ljava/lang/String;
    //   3120: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3125: pop
    //   3126: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3129: sipush #240
    //   3132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3135: sipush #1153
    //   3138: sipush #-3339
    //   3141: invokestatic a : (II)Ljava/lang/String;
    //   3144: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3149: pop
    //   3150: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3153: sipush #241
    //   3156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3159: sipush #1159
    //   3162: sipush #-21982
    //   3165: invokestatic a : (II)Ljava/lang/String;
    //   3168: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3173: pop
    //   3174: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3177: sipush #242
    //   3180: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3183: sipush #1273
    //   3186: sipush #23537
    //   3189: invokestatic a : (II)Ljava/lang/String;
    //   3192: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3197: pop
    //   3198: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3201: sipush #243
    //   3204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3207: sipush #1267
    //   3210: sipush #-25262
    //   3213: invokestatic a : (II)Ljava/lang/String;
    //   3216: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3221: pop
    //   3222: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3225: sipush #244
    //   3228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3231: sipush #1258
    //   3234: sipush #-21556
    //   3237: invokestatic a : (II)Ljava/lang/String;
    //   3240: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3245: pop
    //   3246: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3249: sipush #245
    //   3252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3255: sipush #1213
    //   3258: sipush #11030
    //   3261: invokestatic a : (II)Ljava/lang/String;
    //   3264: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3269: pop
    //   3270: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3273: sipush #256
    //   3276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3279: sipush #1233
    //   3282: sipush #16086
    //   3285: invokestatic a : (II)Ljava/lang/String;
    //   3288: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3293: pop
    //   3294: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3297: sipush #257
    //   3300: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3303: sipush #1228
    //   3306: sipush #13742
    //   3309: invokestatic a : (II)Ljava/lang/String;
    //   3312: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3317: pop
    //   3318: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3321: sipush #258
    //   3324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3327: sipush #1208
    //   3330: sipush #-19337
    //   3333: invokestatic a : (II)Ljava/lang/String;
    //   3336: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3341: pop
    //   3342: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3345: sipush #259
    //   3348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3351: sipush #1192
    //   3354: sipush #-29379
    //   3357: invokestatic a : (II)Ljava/lang/String;
    //   3360: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3365: pop
    //   3366: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3369: sipush #260
    //   3372: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3375: sipush #1262
    //   3378: sipush #30613
    //   3381: invokestatic a : (II)Ljava/lang/String;
    //   3384: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3389: pop
    //   3390: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3393: sipush #261
    //   3396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3399: sipush #1227
    //   3402: sipush #24454
    //   3405: invokestatic a : (II)Ljava/lang/String;
    //   3408: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3413: pop
    //   3414: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3417: sipush #262
    //   3420: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3423: sipush #1269
    //   3426: sipush #25462
    //   3429: invokestatic a : (II)Ljava/lang/String;
    //   3432: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3437: pop
    //   3438: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3441: sipush #263
    //   3444: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3447: sipush #1264
    //   3450: sipush #-9790
    //   3453: invokestatic a : (II)Ljava/lang/String;
    //   3456: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3461: pop
    //   3462: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3465: ldc 65481
    //   3467: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3470: sipush #1216
    //   3473: sipush #-12900
    //   3476: invokestatic a : (II)Ljava/lang/String;
    //   3479: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3484: pop
    //   3485: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3488: ldc 65483
    //   3490: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3493: sipush #1243
    //   3496: sipush #-30064
    //   3499: invokestatic a : (II)Ljava/lang/String;
    //   3502: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3507: pop
    //   3508: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3511: ldc 65485
    //   3513: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3516: sipush #1232
    //   3519: sipush #9731
    //   3522: invokestatic a : (II)Ljava/lang/String;
    //   3525: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3530: pop
    //   3531: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3534: ldc 65487
    //   3536: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3539: sipush #1187
    //   3542: sipush #20782
    //   3545: invokestatic a : (II)Ljava/lang/String;
    //   3548: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3553: pop
    //   3554: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3557: ldc 65489
    //   3559: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3562: sipush #1177
    //   3565: sipush #24823
    //   3568: invokestatic a : (II)Ljava/lang/String;
    //   3571: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3576: pop
    //   3577: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3580: ldc 65488
    //   3582: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3585: sipush #1236
    //   3588: sipush #11322
    //   3591: invokestatic a : (II)Ljava/lang/String;
    //   3594: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3599: pop
    //   3600: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3603: ldc 65482
    //   3605: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3608: sipush #1157
    //   3611: sipush #-26473
    //   3614: invokestatic a : (II)Ljava/lang/String;
    //   3617: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3622: pop
    //   3623: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3626: ldc 65480
    //   3628: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3631: sipush #1029
    //   3634: sipush #11994
    //   3637: invokestatic a : (II)Ljava/lang/String;
    //   3640: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3645: pop
    //   3646: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3649: bipush #96
    //   3651: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3654: sipush #1199
    //   3657: sipush #23971
    //   3660: invokestatic a : (II)Ljava/lang/String;
    //   3663: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3668: pop
    //   3669: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3672: bipush #97
    //   3674: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3677: sipush #1165
    //   3680: sipush #21102
    //   3683: invokestatic a : (II)Ljava/lang/String;
    //   3686: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3691: pop
    //   3692: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3695: bipush #98
    //   3697: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3700: sipush #1167
    //   3703: sipush #-29388
    //   3706: invokestatic a : (II)Ljava/lang/String;
    //   3709: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3714: pop
    //   3715: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3718: bipush #99
    //   3720: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3723: sipush #1260
    //   3726: sipush #5166
    //   3729: invokestatic a : (II)Ljava/lang/String;
    //   3732: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3737: pop
    //   3738: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3741: bipush #100
    //   3743: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3746: sipush #1032
    //   3749: sipush #243
    //   3752: invokestatic a : (II)Ljava/lang/String;
    //   3755: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3760: pop
    //   3761: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3764: bipush #101
    //   3766: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3769: sipush #1180
    //   3772: sipush #-30967
    //   3775: invokestatic a : (II)Ljava/lang/String;
    //   3778: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3783: pop
    //   3784: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3787: bipush #102
    //   3789: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3792: sipush #1036
    //   3795: sipush #-25305
    //   3798: invokestatic a : (II)Ljava/lang/String;
    //   3801: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3806: pop
    //   3807: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3810: bipush #103
    //   3812: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3815: sipush #1190
    //   3818: sipush #18689
    //   3821: invokestatic a : (II)Ljava/lang/String;
    //   3824: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3829: pop
    //   3830: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3833: bipush #104
    //   3835: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3838: sipush #1194
    //   3841: sipush #23990
    //   3844: invokestatic a : (II)Ljava/lang/String;
    //   3847: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3852: pop
    //   3853: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3856: bipush #105
    //   3858: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3861: sipush #1275
    //   3864: sipush #27090
    //   3867: invokestatic a : (II)Ljava/lang/String;
    //   3870: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3875: pop
    //   3876: getstatic burp/Zsqw.Zv : Ljava/util/Map;
    //   3879: invokeinterface entrySet : ()Ljava/util/Set;
    //   3884: invokeinterface iterator : ()Ljava/util/Iterator;
    //   3889: astore #7
    //   3891: aload #7
    //   3893: invokeinterface hasNext : ()Z
    //   3898: ifeq -> 3945
    //   3901: aload #7
    //   3903: invokeinterface next : ()Ljava/lang/Object;
    //   3908: checkcast java/util/Map$Entry
    //   3911: astore #8
    //   3913: getstatic burp/Zsqw.ZJ : Ljava/util/Map;
    //   3916: aload #8
    //   3918: invokeinterface getValue : ()Ljava/lang/Object;
    //   3923: checkcast java/lang/String
    //   3926: aload #8
    //   3928: invokeinterface getKey : ()Ljava/lang/Object;
    //   3933: checkcast java/lang/Integer
    //   3936: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3941: pop
    //   3942: goto -> 3891
    //   3945: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49B) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsqw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */