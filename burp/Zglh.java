package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zglh {
  private static final Map<Zlug, Zlic> ZA;
  
  private static final Map<Zlug, Zlic> ZV;
  
  private static final Map<Zlug, Zlic> ZP;
  
  private static final List<Map<Zlug, Zlic>> Zs;
  
  private static final Zkt9 ZZ;
  
  private final Zbnt Zp;
  
  private final List<Zl1r> Zo = new ArrayList<>();
  
  private final List<Zl1r> Zv = new ArrayList<>();
  
  public Zglh(Zbnt paramZbnt, Zstu paramZstu1, Zstu paramZstu2, Collection<Zlug> paramCollection) {
    this.Zp = paramZbnt;
    Zf(paramZstu1, paramZstu2, paramCollection);
  }
  
  public List<Zl1r> ZC() {
    return this.Zo;
  }
  
  public List<Zl1r> Zo() {
    return this.Zv;
  }
  
  private void Zf(Zstu paramZstu1, Zstu paramZstu2, Collection<Zlug> paramCollection) {
    Zs68 zs681 = Zbwc.Zt((Zlit)null, paramZstu1, Zt0k.HTML_ANALYSIS, this.Zp);
    Zs68 zs682 = Zbwc.Zt((Zlit)null, paramZstu2, Zt0k.HTML_ANALYSIS, this.Zp);
    int[] arrayOfInt = Zgim.ZP();
    for (Map<Zlug, Zlic> map : Zs) {
      if (ZU(paramZstu1, paramZstu2, paramCollection, zs681, zs682, map) || arrayOfInt != null)
        break; 
    } 
    Zl8v.ZM(this.Zo, paramZstu1.Zpu());
    Zl8v.ZM(this.Zv, paramZstu2.Zpu());
  }
  
  private boolean ZU(Zstu paramZstu1, Zstu paramZstu2, Collection<Zlug> paramCollection, Zs68 paramZs681, Zs68 paramZs682, Map<Zlug, Zlic> paramMap) {
    boolean bool = false;
    Iterator<Zlug> iterator = paramCollection.iterator();
    int[] arrayOfInt = Zgim.ZP();
    while (iterator.hasNext()) {
      Zlug zlug = iterator.next();
      Zlic zlic = paramMap.get(zlug);
      if (zlic != null) {
        bool = true;
        zlic.Zf(paramZstu1, paramZs681, paramZstu2, paramZs682, this.Zo, this.Zv);
        if (zlic == ZZ)
          return true; 
      } 
      if (arrayOfInt != null)
        break; 
    } 
    return bool;
  }
  
  private static void Zg(Zlug paramZlug, Zlic paramZlic) {
    ZA.put(paramZlug, paramZlic);
  }
  
  private static void ZS(Zlug paramZlug, Zlic paramZlic) {
    ZV.put(paramZlug, paramZlic);
  }
  
  private static void ZD(Zlug paramZlug, Zlic paramZlic) {
    ZP.put(paramZlug, paramZlic);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'w+i-ip9(h:mm{*q0f>\\rx%t-! kp-a0i\\t\\bx+d8xkz'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #16
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #29
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
    //   68: ldc 'GAoU\EGAoUD[u '
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #12
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #113
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
    //   200: bipush #9
    //   202: goto -> 232
    //   205: bipush #89
    //   207: goto -> 232
    //   210: bipush #26
    //   212: goto -> 232
    //   215: bipush #68
    //   217: goto -> 232
    //   220: bipush #17
    //   222: goto -> 232
    //   225: bipush #112
    //   227: goto -> 232
    //   230: bipush #25
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
    //   288: new java/util/EnumMap
    //   291: dup
    //   292: ldc burp/Zlug
    //   294: invokespecial <init> : (Ljava/lang/Class;)V
    //   297: putstatic burp/Zglh.ZA : Ljava/util/Map;
    //   300: new java/util/EnumMap
    //   303: dup
    //   304: ldc burp/Zlug
    //   306: invokespecial <init> : (Ljava/lang/Class;)V
    //   309: putstatic burp/Zglh.ZV : Ljava/util/Map;
    //   312: new java/util/EnumMap
    //   315: dup
    //   316: ldc burp/Zlug
    //   318: invokespecial <init> : (Ljava/lang/Class;)V
    //   321: putstatic burp/Zglh.ZP : Ljava/util/Map;
    //   324: iconst_3
    //   325: anewarray java/util/Map
    //   328: dup
    //   329: iconst_0
    //   330: getstatic burp/Zglh.ZA : Ljava/util/Map;
    //   333: aastore
    //   334: dup
    //   335: iconst_1
    //   336: getstatic burp/Zglh.ZV : Ljava/util/Map;
    //   339: aastore
    //   340: dup
    //   341: iconst_2
    //   342: getstatic burp/Zglh.ZP : Ljava/util/Map;
    //   345: aastore
    //   346: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   349: putstatic burp/Zglh.Zs : Ljava/util/List;
    //   352: new burp/Zkt9
    //   355: dup
    //   356: invokespecial <init> : ()V
    //   359: putstatic burp/Zglh.ZZ : Lburp/Zkt9;
    //   362: getstatic burp/Zlug.ETAG_HEADER : Lburp/Zlug;
    //   365: new burp/Zzer
    //   368: dup
    //   369: aload_0
    //   370: iconst_1
    //   371: aaload
    //   372: invokespecial <init> : (Ljava/lang/String;)V
    //   375: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   378: getstatic burp/Zlug.LAST_MODIFIED_HEADER : Lburp/Zlug;
    //   381: new burp/Zzer
    //   384: dup
    //   385: aload_0
    //   386: iconst_2
    //   387: aaload
    //   388: invokespecial <init> : (Ljava/lang/String;)V
    //   391: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   394: getstatic burp/Zlug.CONTENT_TYPE : Lburp/Zlug;
    //   397: new burp/Zzer
    //   400: dup
    //   401: aload_0
    //   402: iconst_4
    //   403: aaload
    //   404: invokespecial <init> : (Ljava/lang/String;)V
    //   407: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   410: getstatic burp/Zlug.CONTENT_LENGTH : Lburp/Zlug;
    //   413: new burp/Zzer
    //   416: dup
    //   417: aload_0
    //   418: iconst_5
    //   419: aaload
    //   420: invokespecial <init> : (Ljava/lang/String;)V
    //   423: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   426: getstatic burp/Zlug.LOCATION : Lburp/Zlug;
    //   429: new burp/Zzer
    //   432: dup
    //   433: aload_0
    //   434: iconst_3
    //   435: aaload
    //   436: invokespecial <init> : (Ljava/lang/String;)V
    //   439: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   442: getstatic burp/Zlug.CONTENT_LOCATION : Lburp/Zlug;
    //   445: new burp/Zzer
    //   448: dup
    //   449: aload_0
    //   450: iconst_0
    //   451: aaload
    //   452: invokespecial <init> : (Ljava/lang/String;)V
    //   455: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   458: getstatic burp/Zlug.STATUS_CODE : Lburp/Zlug;
    //   461: new burp/Zzao
    //   464: dup
    //   465: invokespecial <init> : ()V
    //   468: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   471: getstatic burp/Zlug.PAGE_TITLE : Lburp/Zlug;
    //   474: new burp/Zzey
    //   477: dup
    //   478: invokespecial <init> : ()V
    //   481: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   484: getstatic burp/Zlug.FIRST_HEADER_TAG : Lburp/Zlug;
    //   487: new burp/Zzeg
    //   490: dup
    //   491: invokespecial <init> : ()V
    //   494: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   497: getstatic burp/Zlug.HEADER_TAGS : Lburp/Zlug;
    //   500: new burp/Zlnh
    //   503: dup
    //   504: new burp/Zgms
    //   507: dup
    //   508: invokespecial <init> : ()V
    //   511: invokespecial <init> : (Lburp/Ztoo;)V
    //   514: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   517: getstatic burp/Zlug.TAG_NAMES : Lburp/Zlug;
    //   520: new burp/Zg3t
    //   523: dup
    //   524: invokespecial <init> : ()V
    //   527: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   530: getstatic burp/Zlug.COOKIE_NAMES : Lburp/Zlug;
    //   533: new burp/Zz30
    //   536: dup
    //   537: invokespecial <init> : ()V
    //   540: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   543: getstatic burp/Zlug.TAG_IDS : Lburp/Zlug;
    //   546: new burp/Zlnh
    //   549: dup
    //   550: new burp/Zgm1
    //   553: dup
    //   554: invokespecial <init> : ()V
    //   557: invokespecial <init> : (Lburp/Ztoo;)V
    //   560: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   563: getstatic burp/Zlug.DIV_IDS : Lburp/Zlug;
    //   566: new burp/Zlnh
    //   569: dup
    //   570: new burp/Zgmp
    //   573: dup
    //   574: invokespecial <init> : ()V
    //   577: invokespecial <init> : (Lburp/Ztoo;)V
    //   580: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   583: getstatic burp/Zlug.COMMENTS : Lburp/Zlug;
    //   586: new burp/Zlnh
    //   589: dup
    //   590: new burp/Zgm0
    //   593: dup
    //   594: invokespecial <init> : ()V
    //   597: invokespecial <init> : (Lburp/Ztoo;)V
    //   600: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   603: getstatic burp/Zlug.INITIAL_CONTENT : Lburp/Zlug;
    //   606: new burp/Zxzn
    //   609: dup
    //   610: invokespecial <init> : ()V
    //   613: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   616: getstatic burp/Zlug.CANONICAL_LINK : Lburp/Zlug;
    //   619: new burp/Zlz
    //   622: dup
    //   623: invokespecial <init> : ()V
    //   626: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   629: getstatic burp/Zlug.ANCHOR_LABELS : Lburp/Zlug;
    //   632: new burp/Zlnh
    //   635: dup
    //   636: new burp/Zgmn
    //   639: dup
    //   640: invokespecial <init> : ()V
    //   643: invokespecial <init> : (Lburp/Ztoo;)V
    //   646: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   649: getstatic burp/Zlug.INPUT_SUBMIT_LABELS : Lburp/Zlug;
    //   652: new burp/Zlnh
    //   655: dup
    //   656: new burp/Zgm3
    //   659: dup
    //   660: invokespecial <init> : ()V
    //   663: invokespecial <init> : (Lburp/Ztoo;)V
    //   666: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   669: getstatic burp/Zlug.BUTTON_SUBMIT_LABELS : Lburp/Zlug;
    //   672: new burp/Zlnh
    //   675: dup
    //   676: new burp/Zgm_
    //   679: dup
    //   680: invokespecial <init> : ()V
    //   683: invokespecial <init> : (Lburp/Ztoo;)V
    //   686: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   689: getstatic burp/Zlug.CSS_CLASSES : Lburp/Zlug;
    //   692: new burp/Zlnh
    //   695: dup
    //   696: new burp/Zgm4
    //   699: dup
    //   700: invokespecial <init> : ()V
    //   703: invokespecial <init> : (Lburp/Ztoo;)V
    //   706: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   709: getstatic burp/Zlug.OUTBOUND_EDGE_COUNT : Lburp/Zlug;
    //   712: new burp/Zlnh
    //   715: dup
    //   716: new burp/Zetc
    //   719: dup
    //   720: invokespecial <init> : ()V
    //   723: iconst_1
    //   724: invokespecial <init> : (Lburp/Ztoo;Z)V
    //   727: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   730: getstatic burp/Zlug.OUTBOUND_EDGE_TAG_NAMES : Lburp/Zlug;
    //   733: new burp/Zlnh
    //   736: dup
    //   737: new burp/Zzbu
    //   740: dup
    //   741: invokespecial <init> : ()V
    //   744: invokespecial <init> : (Lburp/Ztoo;)V
    //   747: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   750: getstatic burp/Zlug.INPUT_IMAGE_LABELS : Lburp/Zlug;
    //   753: new burp/Zlnh
    //   756: dup
    //   757: new burp/Zkdp
    //   760: dup
    //   761: invokespecial <init> : ()V
    //   764: invokespecial <init> : (Lburp/Ztoo;)V
    //   767: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   770: getstatic burp/Zlug.VISIBLE_TEXT : Lburp/Zlug;
    //   773: new burp/Zlnh
    //   776: dup
    //   777: new burp/Zgmi
    //   780: dup
    //   781: invokespecial <init> : ()V
    //   784: invokespecial <init> : (Lburp/Ztoo;)V
    //   787: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   790: getstatic burp/Zlug.CREDIT_CARD_COUNT : Lburp/Zlug;
    //   793: new burp/Zzec
    //   796: dup
    //   797: invokespecial <init> : ()V
    //   800: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   803: getstatic burp/Zlug.EMAIL_ADDRESS_COUNT : Lburp/Zlug;
    //   806: new burp/Zzed
    //   809: dup
    //   810: invokespecial <init> : ()V
    //   813: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   816: getstatic burp/Zlug.SOCIAL_SECURITY_NUMBER_COUNT : Lburp/Zlug;
    //   819: new burp/Zze5
    //   822: dup
    //   823: invokespecial <init> : ()V
    //   826: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   829: getstatic burp/Zlug.JSON_NODE_COUNT : Lburp/Zlug;
    //   832: new burp/Zzet
    //   835: dup
    //   836: invokespecial <init> : ()V
    //   839: invokestatic Zg : (Lburp/Zlug;Lburp/Zlic;)V
    //   842: getstatic burp/Zlug.LIMITED_BODY_CONTENT : Lburp/Zlug;
    //   845: new burp/Zry4
    //   848: dup
    //   849: invokespecial <init> : ()V
    //   852: invokestatic ZS : (Lburp/Zlug;Lburp/Zlic;)V
    //   855: getstatic burp/Zlug.VISIBLE_WORD_COUNT : Lburp/Zlug;
    //   858: getstatic burp/Zglh.ZZ : Lburp/Zkt9;
    //   861: invokestatic ZD : (Lburp/Zlug;Lburp/Zlic;)V
    //   864: getstatic burp/Zlug.BODY_CONTENT : Lburp/Zlug;
    //   867: getstatic burp/Zglh.ZZ : Lburp/Zkt9;
    //   870: invokestatic ZD : (Lburp/Zlug;Lburp/Zlic;)V
    //   873: getstatic burp/Zlug.WORD_COUNT : Lburp/Zlug;
    //   876: getstatic burp/Zglh.ZZ : Lburp/Zkt9;
    //   879: invokestatic ZD : (Lburp/Zlug;Lburp/Zlic;)V
    //   882: getstatic burp/Zlug.LINE_COUNT : Lburp/Zlug;
    //   885: getstatic burp/Zglh.ZZ : Lburp/Zkt9;
    //   888: invokestatic ZD : (Lburp/Zlug;Lburp/Zlic;)V
    //   891: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */