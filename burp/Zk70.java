package burp;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk70 implements Zgd8<Zzp3> {
  private static final String[] ZI;
  
  private static final DateFormat ZJ;
  
  private static final DateFormat ZV;
  
  private static final DateFormat Zz;
  
  static final DateFormat Za;
  
  static final long[] Zg;
  
  static final Set<Byte> Zk;
  
  static final String[] Zv;
  
  private static final String[] ZC;
  
  private final Zzp3 ZN;
  
  long ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zk70(long paramLong, byte paramByte1, int paramInt, byte paramByte2, String paramString, boolean paramBoolean, byte paramByte3, Zr_4 paramZr_4) {
    this(paramZr_4.<Zzp3>ZH(new Zxjx(paramLong, paramByte1, paramInt, paramByte2, paramString, paramBoolean, paramByte3)));
  }
  
  public Zk70(Zzp3 paramZzp3) {
    this.ZN = paramZzp3;
    this.ZA = paramZzp3.ZoS() * Zg[paramZzp3.Zoc()];
  }
  
  String Zs() {
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    calendar2.setTime(new Date(ZG()));
    return (calendar1.get(1) == calendar2.get(1)) ? ((calendar1.get(6) == calendar2.get(6)) ? ZJ.format(calendar2.getTime()) : ZV.format(calendar2.getTime())) : Zz.format(calendar2.getTime());
  }
  
  String ZC() {
    if (this.ZA == 0L)
      return ""; 
    switch (Zl()) {
      case 0:
        return (ZQ() == 1) ? a(-16977, 6262) : (a(-17001, 21490) + a(-17001, 21490) + ZQ());
      case 1:
        return (ZQ() == 1) ? a(-16993, -5496) : (a(-16978, 16194) + a(-16978, 16194) + ZQ());
      case 2:
        return (ZQ() == 1) ? a(-16998, 5622) : (a(-16978, 16194) + a(-16978, 16194) + ZQ());
    } 
    Zuh.Zv(false, Zqf.Zk, Zl());
    return "";
  }
  
  String ZX() {
    switch (Zf()) {
      case 7:
        return a(-17017, 24741);
      case 8:
        return a(-17009, 31563);
    } 
    Zuh.Zv(false, Zqf.Zk, Zf());
    return "";
  }
  
  void ZP(long paramLong) {
    int[] arrayOfInt = Zte.Zj();
    Zq(ZG() + (paramLong - ZG()) / this.ZA * this.ZA);
    while (ZG() < paramLong) {
      Zq(ZG() + this.ZA);
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public long ZG() {
    return this.ZN.Zo_();
  }
  
  void Zq(long paramLong) {
    this.ZN.Zb(paramLong);
  }
  
  byte Zl() {
    return this.ZN.Zoc();
  }
  
  void ZB(int paramInt) {
    this.ZN.Zm((byte)paramInt);
  }
  
  int ZQ() {
    return this.ZN.ZoS();
  }
  
  void Zv(int paramInt) {
    this.ZN.ZSV(paramInt);
  }
  
  public byte Zf() {
    return this.ZN.Zog();
  }
  
  public void Zr(byte paramByte) {
    this.ZN.Za(paramByte);
  }
  
  String Zh() {
    return this.ZN.Zo4();
  }
  
  boolean Ze() {
    return this.ZN.Zo8();
  }
  
  public byte Zx() {
    return this.ZN.ZoV();
  }
  
  public void ZE(byte paramByte) {
    this.ZN.ZQ(paramByte);
  }
  
  public Zzp3 ZK() {
    return this.ZN;
  }
  
  Zlwx ZM() {
    Zzqp zzqp = new Zzqp();
    zzqp.Zm(a(-17011, 27839), Za.format(new Date(ZG())));
    zzqp.Zm(a(-17002, 2079), ZI[Zl()]);
    zzqp.ZU(a(-17021, 13086), ZQ());
    zzqp.Zm(a(-16981, 9388), ZC[Zf()]);
    zzqp.Zd(a(-17000, 23564), Zh());
    zzqp.Zz(a(-17023, -3905), Ze());
    return zzqp;
  }
  
  static Zk70 ZL(Zvt paramZvt, Zr_4 paramZr_4) throws Zzam {
    long l;
    String str1 = paramZvt.ZC(a(-17012, -5126));
    byte b1 = (byte)paramZvt.ZT(a(-16983, 16372), ZI);
    int i = paramZvt.Zk(a(-17003, 14463));
    byte b2 = (byte)paramZvt.ZT(a(-17015, -9062), ZC);
    String str2 = paramZvt.Zf(a(-16982, -1134), "");
    boolean bool = paramZvt.Zc(a(-16999, -23988), false);
    try {
      l = Za.parse(str1).getTime();
    } catch (ParseException parseException) {
      Zah.Zl(parseException, Zk_.RETHROWN);
      throw new Zzam(String.format(a(-17005, -8308), new Object[] { str1, a(-17024, -14479) }));
    } 
    return new Zk70(l, b1, i, b2, str2, bool, (byte)0, paramZr_4);
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'f.^«æÿF==|{=@/ÊUÙéA,!ªóøð}3%édxb§ÜeëjKnù¹Â­.#÷vÔ¿Dç¢Ê\\tuÒ¸ûrvöê5órgÚíp,¢{£-`¶/´wé5|êÅ c]ÅwÅÓÎ¬9ñ\Ýioµ$ü6²Te\\rK\wäÓwÂn 2ñwÀ|Óe³;Ù#\\r\\r\\tçÏ¢=5²¹ Gsz¥là/y¬IÚCÉJ\\räªñ¥Õ*+5£DrÞá]/1°ÉÁp®=æq\\t¾âzäï\ \\rgÎo?1B2±mM¸rá_Þ\\n;<ÿ¹òU§èa¨ÆÓ¤ù\\n«×ïÙV7:ÍÆ]p0~þdé,o;¾ÞBöÃZNT_ Ô[ÀÛe\\n\\b&:'è.8Í¬+Òöí?ízPËñìÃÕÒd&§ú#³ý{\\rzÈ¦×¥\\b \\fR+l\\rÀaéÐ±Ïé ±åÊ0S&`ÒÝ\\nµt,­.:õêr]¿W{àOÿÍx»NV1Ê°Í=Ñº}ÅÁ²:ÿWãÆ~ÐÌÿzöæ:è1³òwÛïPÜ("z³±/dö'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #8
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
    //   68: ldc '¬ñ¬¨º²\\fNòðÈ1¾#\\nâÊ}'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #33
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
    //   129: putstatic burp/Zk70.a : [Ljava/lang/String;
    //   132: bipush #40
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk70.b : [Ljava/lang/String;
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
    //   212: bipush #15
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #85
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #48
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #61
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
    //   300: iconst_3
    //   301: anewarray java/lang/String
    //   304: dup
    //   305: iconst_0
    //   306: sipush #-17004
    //   309: sipush #20581
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: aastore
    //   316: dup
    //   317: iconst_1
    //   318: sipush #-16984
    //   321: sipush #25801
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: aastore
    //   328: dup
    //   329: iconst_2
    //   330: sipush #-17010
    //   333: sipush #-31958
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: aastore
    //   340: putstatic burp/Zk70.ZI : [Ljava/lang/String;
    //   343: new java/text/SimpleDateFormat
    //   346: dup
    //   347: sipush #-16994
    //   350: sipush #3858
    //   353: invokestatic a : (II)Ljava/lang/String;
    //   356: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   359: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   362: putstatic burp/Zk70.ZJ : Ljava/text/DateFormat;
    //   365: new java/text/SimpleDateFormat
    //   368: dup
    //   369: sipush #-17019
    //   372: sipush #29433
    //   375: invokestatic a : (II)Ljava/lang/String;
    //   378: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   381: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   384: putstatic burp/Zk70.ZV : Ljava/text/DateFormat;
    //   387: new java/text/SimpleDateFormat
    //   390: dup
    //   391: sipush #-16997
    //   394: sipush #23526
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   403: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   406: putstatic burp/Zk70.Zz : Ljava/text/DateFormat;
    //   409: new java/text/SimpleDateFormat
    //   412: dup
    //   413: sipush #-17018
    //   416: sipush #-7236
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: invokespecial <init> : (Ljava/lang/String;)V
    //   425: putstatic burp/Zk70.Za : Ljava/text/DateFormat;
    //   428: iconst_3
    //   429: newarray long
    //   431: dup
    //   432: iconst_0
    //   433: ldc2_w 60000
    //   436: lastore
    //   437: dup
    //   438: iconst_1
    //   439: ldc2_w 3600000
    //   442: lastore
    //   443: dup
    //   444: iconst_2
    //   445: ldc2_w 86400000
    //   448: lastore
    //   449: putstatic burp/Zk70.Zg : [J
    //   452: bipush #7
    //   454: anewarray java/lang/Byte
    //   457: dup
    //   458: iconst_0
    //   459: iconst_0
    //   460: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   463: aastore
    //   464: dup
    //   465: iconst_1
    //   466: iconst_1
    //   467: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   470: aastore
    //   471: dup
    //   472: iconst_2
    //   473: iconst_2
    //   474: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   477: aastore
    //   478: dup
    //   479: iconst_3
    //   480: iconst_3
    //   481: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   484: aastore
    //   485: dup
    //   486: iconst_4
    //   487: iconst_4
    //   488: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   491: aastore
    //   492: dup
    //   493: iconst_5
    //   494: iconst_5
    //   495: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   498: aastore
    //   499: dup
    //   500: bipush #6
    //   502: bipush #6
    //   504: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   507: aastore
    //   508: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   511: putstatic burp/Zk70.Zk : Ljava/util/Set;
    //   514: bipush #9
    //   516: anewarray java/lang/String
    //   519: dup
    //   520: iconst_0
    //   521: sipush #-17020
    //   524: sipush #-31426
    //   527: invokestatic a : (II)Ljava/lang/String;
    //   530: aastore
    //   531: dup
    //   532: iconst_1
    //   533: sipush #-17016
    //   536: sipush #-7699
    //   539: invokestatic a : (II)Ljava/lang/String;
    //   542: aastore
    //   543: dup
    //   544: iconst_2
    //   545: sipush #-17007
    //   548: sipush #-21688
    //   551: invokestatic a : (II)Ljava/lang/String;
    //   554: aastore
    //   555: dup
    //   556: iconst_3
    //   557: sipush #-17008
    //   560: sipush #-13136
    //   563: invokestatic a : (II)Ljava/lang/String;
    //   566: aastore
    //   567: dup
    //   568: iconst_4
    //   569: sipush #-16980
    //   572: sipush #8857
    //   575: invokestatic a : (II)Ljava/lang/String;
    //   578: aastore
    //   579: dup
    //   580: iconst_5
    //   581: sipush #-17022
    //   584: sipush #-6456
    //   587: invokestatic a : (II)Ljava/lang/String;
    //   590: aastore
    //   591: dup
    //   592: bipush #6
    //   594: sipush #-16995
    //   597: sipush #10336
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: aastore
    //   604: dup
    //   605: bipush #7
    //   607: sipush #-17013
    //   610: sipush #-29121
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: aastore
    //   617: dup
    //   618: bipush #8
    //   620: sipush #-16979
    //   623: sipush #31079
    //   626: invokestatic a : (II)Ljava/lang/String;
    //   629: aastore
    //   630: putstatic burp/Zk70.Zv : [Ljava/lang/String;
    //   633: getstatic burp/Zk70.Zv : [Ljava/lang/String;
    //   636: arraylength
    //   637: anewarray java/lang/String
    //   640: putstatic burp/Zk70.ZC : [Ljava/lang/String;
    //   643: iconst_0
    //   644: istore #7
    //   646: iload #7
    //   648: getstatic burp/Zk70.Zv : [Ljava/lang/String;
    //   651: arraylength
    //   652: if_icmpge -> 683
    //   655: getstatic burp/Zk70.ZC : [Ljava/lang/String;
    //   658: iload #7
    //   660: getstatic burp/Zk70.Zv : [Ljava/lang/String;
    //   663: iload #7
    //   665: aaload
    //   666: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   669: bipush #32
    //   671: bipush #95
    //   673: invokevirtual replace : (CC)Ljava/lang/String;
    //   676: aastore
    //   677: iinc #7, 1
    //   680: goto -> 646
    //   683: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBD88) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk70.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */