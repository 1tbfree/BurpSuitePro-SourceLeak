package burp;

import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zg2g extends Zg2b<Zto7> {
  public static Zmk7<Zto7> Zw;
  
  public static Zmk7<Zto7> Zd;
  
  public static Zmk7<Zto7> Zc;
  
  public static Zmk7<Zto7> Zg;
  
  public static Zmk7<Zto7> ZR;
  
  public static Zmk7<Zto7> ZP;
  
  public static Zmk7<Zto7> Zp;
  
  public static Zmk7<Zto7> ZO;
  
  public static Zmk7<Zto7> Zv;
  
  public static Zmk7<Zto7> Zi;
  
  public static Zmk7<Zto7> Zt;
  
  public static Zmk7<Zto7> Zj;
  
  public static Zmk7<Zto7> ZS;
  
  public static Zmk7<Zto7> ZW;
  
  public static Zmk7<Zto7> ZU;
  
  public static Zmk7<Zto7> Zh;
  
  public static Zmk7<Zto7> Zf;
  
  public static Zmk7<Zto7> ZC;
  
  public static Zmk7<Zto7> Zr;
  
  public static Zmk7<Zto7> ZE;
  
  public static Zmk7<Zto7> Zz;
  
  public static Zmk7<Zto7> Zb;
  
  public Zg2g() {
    super(new Zgjg<>((Zmk7<Zto7>[])new Zmk7[] { 
            Zw, Zd, Zc, Zg, ZR, ZP, Zp, ZO, Zv, Zi, 
            Zt, Zj, ZS, ZW, ZU, Zh, Zf, ZC, Zr, ZE, 
            Zz, Zb }));
    if (Zbqc.Zwu() == null)
      Zmu5.ZD(++i); 
  }
  
  private static void lambda$static$10(Zto7 paramZto7, Object paramObject) {
    paramZto7.Zxg((String)paramObject);
  }
  
  private static Object lambda$static$9(Zto7 paramZto7) {
    return Integer.valueOf(paramZto7.Zl7());
  }
  
  private static Object lambda$static$8(Zto7 paramZto7) {
    return Zkb.ZG(paramZto7.ZlL().ZdC());
  }
  
  private static Object lambda$static$7(Zto7 paramZto7) {
    return Zkb.ZG(paramZto7.ZlL().Zd4());
  }
  
  private static Object lambda$static$6(Zto7 paramZto7) {
    return paramZto7.ZlL().Zdz().ZJE();
  }
  
  private static Object lambda$static$5(Zto7 paramZto7) {
    return paramZto7.ZlL().toString();
  }
  
  private static Object lambda$static$4(Zto7 paramZto7) {
    return Integer.valueOf(paramZto7.ZlL().Zda());
  }
  
  private static Object lambda$static$3(Zto7 paramZto7) {
    return paramZto7.ZlL().Zd1();
  }
  
  private static Object lambda$static$2(Zto7 paramZto7) {
    return paramZto7.ZlL().Zdq();
  }
  
  private static Object lambda$static$1(Zto7 paramZto7) {
    return (paramZto7.Ze2()).toolName;
  }
  
  private static void lambda$static$0(Zto7 paramZto7, Object paramObject) {
    byte b = ((Byte)paramObject).byteValue();
    paramZto7.ZB(b);
    Zlxk.ZS = paramZto7.ZaP();
    Zm2.Zi(Zv8r.LOGGER_TABLE_HIGHLIGHT, b);
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '+Sq/]j.I{,HUSz/Sl*nR2YjB\\t:DjUWR\\b/NqEQ\\t2uS6ARGY:RzSCMSp JQ{6l\\n/]yARWP{+Us7Sm,HLOnU[_HwT/]l\\f]Ip3YpN\\r<SpEJSpS(b'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_4
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #17
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'a.CYr 1OQ[\\rC\\f&]'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #7
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #76
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #110
    //   202: goto -> 232
    //   205: bipush #45
    //   207: goto -> 232
    //   210: bipush #15
    //   212: goto -> 232
    //   215: bipush #98
    //   217: goto -> 232
    //   220: bipush #112
    //   222: goto -> 232
    //   225: bipush #55
    //   227: goto -> 232
    //   230: bipush #47
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   293: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   296: ldc '#'
    //   298: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   301: ldc java/lang/Long
    //   303: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   306: bipush #6
    //   308: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   311: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   316: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   319: new burp/Zlxk
    //   322: dup
    //   323: invokespecial <init> : ()V
    //   326: invokevirtual Zb : ()Ljavax/swing/table/TableCellEditor;
    //   329: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   332: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   335: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   338: invokevirtual ZH : ()Lburp/Zmk7;
    //   341: putstatic burp/Zg2g.Zw : Lburp/Zmk7;
    //   344: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   349: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   352: aload_0
    //   353: bipush #13
    //   355: aaload
    //   356: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   359: ldc java/lang/Long
    //   361: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   364: bipush #20
    //   366: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   369: new burp/Zmqw
    //   372: dup
    //   373: invokespecial <init> : ()V
    //   376: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   379: invokevirtual ZH : ()Lburp/Zmk7;
    //   382: putstatic burp/Zg2g.Zd : Lburp/Zmk7;
    //   385: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   390: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   393: aload_0
    //   394: iconst_0
    //   395: aaload
    //   396: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   399: ldc java/lang/String
    //   401: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   404: bipush #10
    //   406: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   409: invokevirtual ZH : ()Lburp/Zmk7;
    //   412: putstatic burp/Zg2g.Zc : Lburp/Zmk7;
    //   415: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   420: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   423: aload_0
    //   424: bipush #6
    //   426: aaload
    //   427: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   430: ldc java/lang/String
    //   432: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   435: bipush #8
    //   437: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   440: invokevirtual ZH : ()Lburp/Zmk7;
    //   443: putstatic burp/Zg2g.Zg : Lburp/Zmk7;
    //   446: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   451: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   454: aload_0
    //   455: bipush #8
    //   457: aaload
    //   458: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   461: ldc java/lang/String
    //   463: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   466: bipush #8
    //   468: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   471: iconst_0
    //   472: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   475: invokevirtual ZH : ()Lburp/Zmk7;
    //   478: putstatic burp/Zg2g.ZR : Lburp/Zmk7;
    //   481: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   486: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   489: aload_0
    //   490: bipush #14
    //   492: aaload
    //   493: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   496: ldc java/lang/String
    //   498: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   501: bipush #20
    //   503: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   506: invokevirtual ZH : ()Lburp/Zmk7;
    //   509: putstatic burp/Zg2g.ZP : Lburp/Zmk7;
    //   512: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   517: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   520: aload_0
    //   521: iconst_4
    //   522: aaload
    //   523: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   526: ldc java/lang/Integer
    //   528: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   531: bipush #6
    //   533: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   536: iconst_0
    //   537: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   540: invokevirtual ZH : ()Lburp/Zmk7;
    //   543: putstatic burp/Zg2g.Zp : Lburp/Zmk7;
    //   546: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   551: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   554: aload_0
    //   555: iconst_5
    //   556: aaload
    //   557: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   560: ldc java/lang/String
    //   562: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   565: bipush #30
    //   567: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   570: iconst_0
    //   571: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   574: invokevirtual ZH : ()Lburp/Zmk7;
    //   577: putstatic burp/Zg2g.ZO : Lburp/Zmk7;
    //   580: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   585: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   588: aload_0
    //   589: bipush #11
    //   591: aaload
    //   592: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   595: ldc java/lang/String
    //   597: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   600: bipush #16
    //   602: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   605: iconst_0
    //   606: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   609: invokevirtual ZH : ()Lburp/Zmk7;
    //   612: putstatic burp/Zg2g.Zv : Lburp/Zmk7;
    //   615: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   620: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   623: aload_0
    //   624: iconst_1
    //   625: aaload
    //   626: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   629: ldc java/lang/String
    //   631: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   634: bipush #20
    //   636: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   639: invokevirtual ZH : ()Lburp/Zmk7;
    //   642: putstatic burp/Zg2g.Zi : Lburp/Zmk7;
    //   645: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   650: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   653: aload_0
    //   654: iconst_2
    //   655: aaload
    //   656: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   659: ldc java/lang/String
    //   661: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   664: bipush #20
    //   666: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   669: invokevirtual ZH : ()Lburp/Zmk7;
    //   672: putstatic burp/Zg2g.Zt : Lburp/Zmk7;
    //   675: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   680: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   683: aload_0
    //   684: bipush #16
    //   686: aaload
    //   687: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   690: ldc java/lang/Integer
    //   692: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   695: bipush #14
    //   697: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   700: invokevirtual ZH : ()Lburp/Zmk7;
    //   703: putstatic burp/Zg2g.Zj : Lburp/Zmk7;
    //   706: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   711: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   714: aload_0
    //   715: bipush #20
    //   717: aaload
    //   718: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   721: ldc java/lang/String
    //   723: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   726: bipush #20
    //   728: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   731: iconst_0
    //   732: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   735: invokevirtual ZH : ()Lburp/Zmk7;
    //   738: putstatic burp/Zg2g.ZS : Lburp/Zmk7;
    //   741: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   746: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   749: aload_0
    //   750: iconst_3
    //   751: aaload
    //   752: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   755: ldc java/lang/Integer
    //   757: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   760: bipush #12
    //   762: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   765: new burp/Zmqp
    //   768: dup
    //   769: invokespecial <init> : ()V
    //   772: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   775: new burp/Zs46
    //   778: dup
    //   779: invokespecial <init> : ()V
    //   782: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   785: invokevirtual ZH : ()Lburp/Zmk7;
    //   788: putstatic burp/Zg2g.ZW : Lburp/Zmk7;
    //   791: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   796: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   799: aload_0
    //   800: bipush #17
    //   802: aaload
    //   803: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   806: ldc java/lang/Integer
    //   808: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   811: bipush #8
    //   813: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   816: new burp/Zmqp
    //   819: dup
    //   820: invokespecial <init> : ()V
    //   823: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   826: new burp/Zs46
    //   829: dup
    //   830: invokespecial <init> : ()V
    //   833: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   836: invokevirtual ZH : ()Lburp/Zmk7;
    //   839: putstatic burp/Zg2g.ZU : Lburp/Zmk7;
    //   842: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   847: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   850: aload_0
    //   851: bipush #9
    //   853: aaload
    //   854: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   857: ldc java/lang/String
    //   859: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   862: bipush #10
    //   864: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   867: iconst_0
    //   868: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   871: invokevirtual ZH : ()Lburp/Zmk7;
    //   874: putstatic burp/Zg2g.Zh : Lburp/Zmk7;
    //   877: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   882: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   885: aload_0
    //   886: bipush #7
    //   888: aaload
    //   889: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   892: ldc java/lang/String
    //   894: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   897: bipush #10
    //   899: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   902: iconst_0
    //   903: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   906: invokevirtual ZH : ()Lburp/Zmk7;
    //   909: putstatic burp/Zg2g.Zf : Lburp/Zmk7;
    //   912: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   917: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   920: aload_0
    //   921: bipush #12
    //   923: aaload
    //   924: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   927: ldc java/lang/String
    //   929: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   932: bipush #20
    //   934: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   937: iconst_0
    //   938: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   941: invokevirtual ZH : ()Lburp/Zmk7;
    //   944: putstatic burp/Zg2g.ZC : Lburp/Zmk7;
    //   947: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   952: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   955: aload_0
    //   956: bipush #15
    //   958: aaload
    //   959: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   962: ldc java/lang/Integer
    //   964: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   967: bipush #20
    //   969: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   972: new burp/Zmqp
    //   975: dup
    //   976: invokespecial <init> : ()V
    //   979: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   982: new burp/Zs46
    //   985: dup
    //   986: invokespecial <init> : ()V
    //   989: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   992: invokevirtual ZH : ()Lburp/Zmk7;
    //   995: putstatic burp/Zg2g.Zr : Lburp/Zmk7;
    //   998: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1003: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1006: aload_0
    //   1007: bipush #10
    //   1009: aaload
    //   1010: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1013: ldc java/lang/Integer
    //   1015: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1018: bipush #20
    //   1020: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1023: iconst_0
    //   1024: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   1027: new burp/Zmqp
    //   1030: dup
    //   1031: invokespecial <init> : ()V
    //   1034: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1037: new burp/Zs46
    //   1040: dup
    //   1041: invokespecial <init> : ()V
    //   1044: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   1047: invokevirtual ZH : ()Lburp/Zmk7;
    //   1050: putstatic burp/Zg2g.ZE : Lburp/Zmk7;
    //   1053: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1058: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1061: aload_0
    //   1062: bipush #19
    //   1064: aaload
    //   1065: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1068: ldc java/lang/String
    //   1070: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1073: bipush #15
    //   1075: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1078: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   1083: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   1086: invokevirtual ZH : ()Lburp/Zmk7;
    //   1089: putstatic burp/Zg2g.Zz : Lburp/Zmk7;
    //   1092: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1097: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1100: aload_0
    //   1101: bipush #18
    //   1103: aaload
    //   1104: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1107: ldc java/lang/Long
    //   1109: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1112: bipush #12
    //   1114: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1117: iconst_0
    //   1118: invokevirtual ZP : (Z)Lburp/Zz_2;
    //   1121: new burp/Zmqp
    //   1124: dup
    //   1125: invokespecial <init> : ()V
    //   1128: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1131: new burp/Zs46
    //   1134: dup
    //   1135: invokespecial <init> : ()V
    //   1138: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   1141: invokevirtual ZH : ()Lburp/Zmk7;
    //   1144: putstatic burp/Zg2g.Zb : Lburp/Zmk7;
    //   1147: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */