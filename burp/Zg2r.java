package burp;

import net.portswigger.Zm2;

public class Zg2r extends Zg2b<Zzme> {
  static final Zmk7<Zzme> ZG;
  
  static final Zmk7<Zzme> ZP;
  
  static final Zmk7<Zzme> Ze;
  
  static final Zmk7<Zzme> Za;
  
  static final Zmk7<Zzme> Zg;
  
  static final Zmk7<Zzme> ZT;
  
  static final Zmk7<Zzme> Zh;
  
  static final Zmk7<Zzme> ZM;
  
  static final Zmk7<Zzme> ZK;
  
  static final Zmk7<Zzme> ZZ;
  
  static final Zmk7<Zzme> ZF;
  
  static final Zmk7<Zzme> Zw;
  
  public Zg2r() {
    super(new Zgjg<>((Zmk7<Zzme>[])new Zmk7[] { 
            ZG, ZP, Ze, Za, Zg, ZT, Zh, ZM, ZK, ZZ, 
            ZF, Zw }));
    if (Zbqc.Zwu() == null)
      Zmio.ZT(!bool); 
  }
  
  private static Object lambda$static$3(Zzme paramZzme) {
    return (paramZzme.ZH7()).toolName;
  }
  
  private static int lambda$static$2(Zzsm paramZzsm) {
    return paramZzsm.comparisonOrderIndex;
  }
  
  private static void lambda$static$1(Zzme paramZzme, Object paramObject) {
    Zzsm zzsm = (Zzsm)paramObject;
    paramZzme.Zh(zzsm);
    Zm2.ZB(Zec3.ORGANIZER_ENTRY_STATUS_CHANGED, zzsm.displayLabel);
  }
  
  private static void lambda$static$0(Zzme paramZzme, Object paramObject) {
    byte b = ((Byte)paramObject).byteValue();
    paramZzme.ZB(b);
    Zlxk.ZS = paramZzme.ZaP();
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '}"fS,i>sh1s s#su=bh1s s#si5uy$oh1s ] s4bu=by>`\\rs$by>`}$o}"fS,i>s\\rs$bh1s ] s4bs?ks?k}$o'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #11
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #59
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
    //   68: ldc '{\\fQlbg@ z'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #6
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #78
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
    //   200: bipush #120
    //   202: goto -> 232
    //   205: bipush #39
    //   207: goto -> 232
    //   210: bipush #107
    //   212: goto -> 232
    //   215: bipush #60
    //   217: goto -> 232
    //   220: bipush #77
    //   222: goto -> 232
    //   225: bipush #72
    //   227: goto -> 232
    //   230: bipush #70
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
    //   288: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   293: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   296: ldc '#'
    //   298: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   301: ldc '#'
    //   303: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   306: bipush #7
    //   308: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   311: ldc java/lang/Integer
    //   313: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   316: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   321: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   324: new burp/Zlxk
    //   327: dup
    //   328: invokespecial <init> : ()V
    //   331: invokevirtual Zb : ()Ljavax/swing/table/TableCellEditor;
    //   334: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   337: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   340: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   343: invokevirtual ZH : ()Lburp/Zmk7;
    //   346: putstatic burp/Zg2r.ZG : Lburp/Zmk7;
    //   349: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   354: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   357: aload_0
    //   358: bipush #9
    //   360: aaload
    //   361: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   364: aload_0
    //   365: iconst_3
    //   366: aaload
    //   367: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   370: bipush #20
    //   372: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   375: ldc java/lang/Long
    //   377: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   380: new burp/Zmqw
    //   383: dup
    //   384: invokespecial <init> : ()V
    //   387: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   390: invokevirtual ZH : ()Lburp/Zmk7;
    //   393: putstatic burp/Zg2r.ZP : Lburp/Zmk7;
    //   396: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   401: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   404: aload_0
    //   405: iconst_4
    //   406: aaload
    //   407: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   410: aload_0
    //   411: iconst_1
    //   412: aaload
    //   413: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   416: bipush #16
    //   418: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   421: ldc java/lang/String
    //   423: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   426: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   431: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   434: new burp/Zmql
    //   437: dup
    //   438: invokespecial <init> : ()V
    //   441: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   444: invokestatic Zi : ()Ljavax/swing/DefaultCellEditor;
    //   447: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   450: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   455: invokestatic comparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   458: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   461: invokevirtual ZH : ()Lburp/Zmk7;
    //   464: putstatic burp/Zg2r.Ze : Lburp/Zmk7;
    //   467: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   472: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   475: aload_0
    //   476: bipush #17
    //   478: aaload
    //   479: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   482: aload_0
    //   483: bipush #18
    //   485: aaload
    //   486: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   489: bipush #20
    //   491: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   494: ldc java/lang/String
    //   496: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   499: invokevirtual ZH : ()Lburp/Zmk7;
    //   502: putstatic burp/Zg2r.Za : Lburp/Zmk7;
    //   505: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   510: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   513: aload_0
    //   514: bipush #20
    //   516: aaload
    //   517: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   520: aload_0
    //   521: bipush #7
    //   523: aaload
    //   524: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   527: bipush #8
    //   529: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   532: ldc java/lang/String
    //   534: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   537: invokevirtual ZH : ()Lburp/Zmk7;
    //   540: putstatic burp/Zg2r.Zg : Lburp/Zmk7;
    //   543: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   548: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   551: aload_0
    //   552: iconst_2
    //   553: aaload
    //   554: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   557: aload_0
    //   558: iconst_5
    //   559: aaload
    //   560: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   563: bipush #20
    //   565: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   568: ldc java/lang/String
    //   570: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   573: invokevirtual ZH : ()Lburp/Zmk7;
    //   576: putstatic burp/Zg2r.ZT : Lburp/Zmk7;
    //   579: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   584: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   587: aload_0
    //   588: bipush #19
    //   590: aaload
    //   591: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   594: aload_0
    //   595: bipush #13
    //   597: aaload
    //   598: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   601: bipush #20
    //   603: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   606: ldc java/lang/String
    //   608: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   611: invokevirtual ZH : ()Lburp/Zmk7;
    //   614: putstatic burp/Zg2r.Zh : Lburp/Zmk7;
    //   617: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   622: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   625: aload_0
    //   626: bipush #6
    //   628: aaload
    //   629: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   632: aload_0
    //   633: bipush #21
    //   635: aaload
    //   636: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   639: bipush #20
    //   641: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   644: ldc java/lang/String
    //   646: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   649: invokevirtual ZH : ()Lburp/Zmk7;
    //   652: putstatic burp/Zg2r.ZM : Lburp/Zmk7;
    //   655: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   660: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   663: aload_0
    //   664: bipush #14
    //   666: aaload
    //   667: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   670: aload_0
    //   671: iconst_0
    //   672: aaload
    //   673: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   676: bipush #14
    //   678: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   681: ldc java/lang/Integer
    //   683: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   686: invokevirtual ZH : ()Lburp/Zmk7;
    //   689: putstatic burp/Zg2r.ZK : Lburp/Zmk7;
    //   692: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   697: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   700: aload_0
    //   701: bipush #8
    //   703: aaload
    //   704: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   707: aload_0
    //   708: bipush #16
    //   710: aaload
    //   711: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   714: bipush #14
    //   716: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   719: ldc java/lang/Integer
    //   721: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   724: new burp/Zmqp
    //   727: dup
    //   728: invokespecial <init> : ()V
    //   731: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   734: new burp/Zs46
    //   737: dup
    //   738: invokespecial <init> : ()V
    //   741: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   744: invokevirtual ZH : ()Lburp/Zmk7;
    //   747: putstatic burp/Zg2r.ZZ : Lburp/Zmk7;
    //   750: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   755: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   758: aload_0
    //   759: bipush #12
    //   761: aaload
    //   762: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   765: aload_0
    //   766: bipush #10
    //   768: aaload
    //   769: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   772: bipush #8
    //   774: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   777: ldc java/lang/Integer
    //   779: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   782: new burp/Zmqp
    //   785: dup
    //   786: invokespecial <init> : ()V
    //   789: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   792: new burp/Zs46
    //   795: dup
    //   796: invokespecial <init> : ()V
    //   799: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   802: invokevirtual ZH : ()Lburp/Zmk7;
    //   805: putstatic burp/Zg2r.ZF : Lburp/Zmk7;
    //   808: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   813: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   816: aload_0
    //   817: bipush #11
    //   819: aaload
    //   820: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   823: aload_0
    //   824: bipush #15
    //   826: aaload
    //   827: invokevirtual Z_ : (Ljava/lang/Object;)Lburp/Zz_2;
    //   830: bipush #20
    //   832: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   835: ldc java/lang/String
    //   837: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   840: invokevirtual ZH : ()Lburp/Zmk7;
    //   843: putstatic burp/Zg2r.Zw : Lburp/Zmk7;
    //   846: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */