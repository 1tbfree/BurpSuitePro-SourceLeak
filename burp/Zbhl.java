package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;

class Zbhl extends Zbqc {
  private final Zsnh ZT;
  
  private final Zbc9 Zf;
  
  private final String Zr;
  
  private Zm95 ZV;
  
  private Zbqc ZM;
  
  private Zbkt ZI;
  
  private Zbqc ZR;
  
  private Zbkc ZC;
  
  private Zm99 Zn;
  
  private Zbqc Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbhl(Zsnh paramZsnh, Zs4c paramZs4c, Zmf_ paramZmf_) {
    this.ZT = paramZsnh;
    Ze();
    int i = Zbho.Zm();
    String str = paramZsnh.Zq();
    this.Zr = ZO(paramZs4c, str);
    this.ZC.Zx(paramZsnh.ZZ());
    this.ZV.Zq(this::Zo);
    this.ZV.setName(paramZsnh.ZE());
    this.ZI.ZE(this::ZE, paramZsnh.ZR());
    this.Zi.add(paramZsnh.Zz());
    this.ZR.setBorder(new Zr43(Zlkk.EXPANDABLE_CONFIG_PANEL_BORDER, 2, new Insets(12, 12, 12, 12)));
    this.ZM.setBorder(new Zr43(Zlkk.EXPANDABLE_CONFIG_PANEL_BORDER, 2, new Insets(12, 12, 12, 12)));
    this.Zf = new Zbc9(new Component[] { this.ZR, this.ZM });
    remove(this.ZR);
    remove(this.ZM);
    add(this.Zf);
    if (paramZmf_.ZV(new String[] { str }).ZH() == null) {
      this.Zf.ZP(this.ZM);
      if (i == 0) {
        Zbqc.Zr(new Zbqc[4]);
      } else {
        return;
      } 
    } 
    this.Zf.ZP(this.ZR);
  }
  
  private String ZO(Zs4c paramZs4c, String paramString) {
    Zzkm zzkm = new Zzkm();
    zzkm.ZM(paramZs4c.ZD(new String[] { paramString }));
    int i = Zbho.Zu();
    if (paramString.equals(a(-26960, 27142))) {
      zzkm.Zh(a(-26948, 15732), Zbq0.NORMAL.incyWincy);
      zzkm.Zh(a(-26959, 12986), Zbq0.NORMAL.useAccessibleTextForVisibleText);
      zzkm.ZD(a(-26962, 13775), Zbq0.NORMAL.incomingNavigableSignpostFingerprintingThreshold);
      zzkm.ZD(a(-26967, 32752), Zbq0.NORMAL.incomingClickableSignpostFingerprintingThreshold);
      zzkm.ZD(a(-26974, 25845), Zbq0.NORMAL.loopbackSignpostFingerprintingThreshold);
      zzkm.ZD(a(-26949, -12678), Zbq0.NORMAL.minimumKeyRingSizeBeforeDiscontinuationStrategyApplied);
      zzkm.ZD(a(-26957, -10072), Zbq0.NORMAL.totalUnmatchedSignpostTolerance);
      zzkm.ZD(a(-26954, 32310), Zbq0.NORMAL.unmatchedAnchorTolerance);
      zzkm.ZD(a(-26956, 17072), Zbq0.NORMAL.unmatchedIFrameTolerance);
      zzkm.ZD(a(-26950, 10764), Zbq0.NORMAL.unmatchedFrameTolerance);
      zzkm.ZD(a(-26965, -4964), Zbq0.NORMAL.unmatchedFormTolerance);
      zzkm.ZD(a(-26953, -12906), Zbq0.NORMAL.unmatchedRedirectTolerance);
      zzkm.ZD(a(-26970, -10968), Zbq0.NORMAL.unmatchedImageAreaMapTolerance);
      zzkm.ZD(a(-26951, -10463), (int)Zbq0.NORMAL.networkIdleThreshold.toMillis());
      zzkm.ZD(a(-26975, -2923), (int)Zbq0.NORMAL.domIdleThreshold.toMillis());
      zzkm.ZD(a(-26971, -2202), (int)Zbq0.NORMAL.awaitNavigationTimeout.toMillis());
      zzkm.ZD(a(-26955, 9553), Zbq0.NORMAL.maximumNumberOfKeysGeneratedPerSignpost);
      zzkm.ZD(a(-26973, 26658), Zbq0.NORMAL.roomDiscoveryKeyRingDiscontinuationThreshold);
      zzkm.ZD(a(-26966, 29873), Zbq0.NORMAL.maximumNumberOfKeysGeneratedPerNavigationalControl);
      zzkm.Zh(a(-26972, 12410), Zbq0.NORMAL.alwaysSubmitGuessKeys);
      zzkm.Zh(a(-26961, -12830), true);
      zzkm.Zh(a(-26969, 12002), true);
      if (i != 0) {
        if (paramString.equalsIgnoreCase(a(-26963, -17273)))
          zzkm.ZD(a(-26964, -30561), 10); 
        return (new Ztsd(zzkm.ZR())).Zh();
      } 
      return (new Ztsd(zzkm.ZR())).Zh();
    } 
    if (paramString.equalsIgnoreCase(a(-26963, -17273)))
      zzkm.ZD(a(-26964, -30561), 10); 
    return (new Ztsd(zzkm.ZR())).Zh();
  }
  
  public void Zo() {
    this.Zf.ZP(this.ZR);
  }
  
  public void ZE() {
    this.Zf.ZP(this.ZM);
    ZN();
  }
  
  void ZP() {
    this.ZI.ZU();
    this.Zf.ZP(this.ZR);
  }
  
  void ZZ(Zzkm paramZzkm) {
    if (this.ZR.isVisible())
      paramZzkm.ZM(this.ZT.Zn()); 
  }
  
  String Zp() {
    return this.ZT.Zd();
  }
  
  private void ZN() {
    int i = Zbho.Zm();
    String str = (new Ztsd(this.ZT.Zn().ZR())).Zh();
    if (str.equals(this.Zr)) {
      this.Zn.setText(a(-26952, 2359));
      this.Zn.Ze(Zlkk.FOREGROUND);
      this.Zn.ZE(Zt00.DEFAULT_FONT);
      if (i == 0) {
        this.Zn.setText(a(-26976, 4047));
        this.Zn.Ze(Zlkk.BURP_ERROR);
        this.Zn.ZE(Zt00.BOLD_ITALIC_FONT);
        return;
      } 
      return;
    } 
    this.Zn.setText(a(-26976, 4047));
    this.Zn.Ze(Zlkk.BURP_ERROR);
    this.Zn.ZE(Zt00.BOLD_ITALIC_FONT);
  }
  
  private void Ze() {
    this.ZM = new Zbqc();
    this.ZV = new Zm95();
    this.Zn = new Zm99();
    this.ZC = new Zbkc();
    this.ZR = new Zbqc();
    this.ZI = new Zbkt();
    this.Zi = new Zbqc();
    setLayout(new BoxLayout(this, 2));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0 };
    this.ZM.setLayout(gridBagLayout1);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZM.add(this.ZV, gridBagConstraints);
    this.Zn.setText(a(-26968, -2084));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weighty = 1.0D;
    this.ZM.add(this.Zn, gridBagConstraints);
    this.ZC.Zx(a(-26958, 26787));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    this.ZM.add(this.ZC, gridBagConstraints);
    add(this.ZM);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZR.setLayout(gridBagLayout2);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZR.add(this.ZI, gridBagConstraints);
    this.Zi.setLayout(new BoxLayout(this.Zi, 1));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZR.add(this.Zi, gridBagConstraints);
    add(this.ZR);
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '÷×èI]¨Sâ\o;th-¦åRT¥WìTà~èå-Ír1Ìá ¶èÍº3]Ã\\t"pR£]OëK\ýCcR-¬¯-ñÍ>AµÊ>Û ÂÉoFJe-s]Ë»§cÀLÚÕS$kD6ýWvS·ÁSýe PCk[»hkEäòk÷N5BTK\\b®¸_Õ¯XÇÔ ?9sOÍºo~rÛGÑª®×ï±Cl41¬+7>½tL±ºá}×¥B° 7Ãð³ÙÏ±h\\br¦ã°£îÑÍäÈôºÍw{²£¿¨²²øTEÇ\´óGDbq'83¡¼P©¤.ëbÐ(Åý¯}Ç3«F·:{Þ¦+)´é5xãêÑÿÎÄ¨ü£UãAQ$¢yø¾!¨¸Èz¼_IAð{>­yø¯Æ71»òÌ9ù;_£ÝÜÕ­t­ú/}BY/<ô²¼)0bÎ´|Q¡BÒ¡ø)ÁÊÞóÏlÒvñÜÏ\\n¢ i§{k»e°¢=ÙN³K±Ð¼©l6R>ï×#\\fÒÒzß"Ctðø#À-\\fç/s=ÆylZ^©/ß-âSà:ê§Õv}w%ô¿ú(§ äÊí1uãl AíÿA&ê\\nÌ#\\fB«DÌÁÒO$}}ý0×gv°^;VBRó{ïQýÕ`B©Xëzìñ½üëS½nn6+[¦ÐÂIÓ5Öç\\n¶ëÍ|o>É0'ß~S\\né¬\\ríAéñ?ÝB«º#DBÔsG1¦ñòZÐäb±gégÇEræ_z?7²9TÄ/;`¯²Õæ^8#8æÀe=lØ*¶!\\tÜN ¡£gT.Ö\\t3÷7õ~cËL\\t!so(Fw"ôþ[!\\n)%i[,l¢gíf,òúùò[bl=åï ?H+àªòú3b½Ë*ð§Ó);×srì$»IÝµNÙJ«ê&}ó\\f?$¬\\fF[Búv i©IêÑø*Á4P%YéÌñpñàá¸]&À·-ÐÔl=F¬[©ÏU%ÌÇø k#ªÀ{vãÌóM"Q¥lñQwS÷<ÖXXÌ²Ç\,]átÄ+»`¯°ÕÔæV5To²c0ÏTþìÇ}àHaäÇ0¤J@=.MnGàÖc}ÁËçY õuÖ\\ról²dpéÌîN5Te1ü-ÍÎ2Å&È-âw{§ÿÃéÚÀ4P|\\rx1-\\bTÞr~^ºJô¾üHïÐ?É0ÑêÉcéõ¸{¸KTÒÁM=¹¨µÒÐp$q# ¯øPÔò±\\rc :Ã»¡µça±Axº]< dÌ\òYH]2*{7ûRj?à)§UM 8:xà¢x÷ÔîD¬à6Oæ+©ùâÃºcS\\n:J")XE{ûXb² ­¶¢CÒ;\\f=,.®jÑÚìþZÑ1%ó,üB&ÂUfÕk\\t=Ù+»!$FÜrT¶<ÛÜ×áã²õF6áoTyÆÐ<:Ï>M kUÀÎÇ!]4u÷Æ]³-ºLuÉlêZµÖuaþ':í'Í£ú{{ ¦i\\nÌ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #36
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
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
    //   68: ldc '$Æ[ÕúX«¾°­*õþ¶<Koû\\fÀár\DgØºæ®½²_£Ðläe:\\tIJ^íÈÞ7zS%5âäñreº:DéÜ;ÜSòó´v È# ]]Â¦\\nðÚo'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #65
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #53
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
    //   129: putstatic burp/Zbhl.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbhl.b : [Ljava/lang/String;
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
    //   212: bipush #68
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #89
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #107
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF96A0) & 0xFFFF;
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
      char c = 'Ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */