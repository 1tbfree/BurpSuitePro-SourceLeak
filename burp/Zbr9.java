package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbr9 extends Zbg2 {
  private final Zr45 Zq;
  
  private Zm2o ZV;
  
  private Zl8w ZQ;
  
  private Zm99 Zk;
  
  private Zm99 Zc;
  
  private ButtonGroup Zx;
  
  private Zmg2 Zr;
  
  private Zmg2 ZR;
  
  private Zmg2 ZC;
  
  private Zmg2 ZZ;
  
  private Zmg2 ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbr9(Zr45 paramZr45) {
    this.Zq = paramZr45;
    ZG();
    this.Zk.ZE(Zt00.BOLD_FONT);
    this.Zk.Ze(Zlkk.BURP_TITLE);
    this.Zc.ZE(Zt00.BOLD_FONT);
    this.Zc.Ze(Zlkk.BURP_TITLE);
    this.ZB = new String[] { a(-18834, 17790), a(-18835, 31725) };
    this.ZA = new boolean[] { true, true };
    Zbqc[] arrayOfZbqc = Zr45.Zi();
    this.Zh = 1;
    if (Zbqc.Zwu() == null)
      Zr45.ZV(new Zbqc[3]); 
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.Zq.ZT(), a(-18837, 18330)) ? null : this;
      case 1:
        return (-1 == Zv()) ? this : this.Zq.Zs(this);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  int Zv() {
    return this.Zr.isSelected() ? 0 : (this.ZR.isSelected() ? 1 : (this.ZC.isSelected() ? 2 : (this.ZZ.isSelected() ? 3 : (this.ZG.isSelected() ? 4 : -1))));
  }
  
  private void ZG() {
    this.Zx = new ButtonGroup();
    this.ZQ = new Zl8w();
    this.ZV = new Zm2o();
    this.Zr = new Zmg2();
    this.ZR = new Zmg2();
    this.ZC = new Zmg2();
    this.ZZ = new Zmg2();
    this.ZG = new Zmg2();
    this.Zk = new Zm99();
    this.Zc = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZQ.setText(a(-18845, 14029));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZQ, gridBagConstraints);
    this.ZV.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_EXPORTING_AND_IMPORTING_THE_CA_CERTIFICATE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZV, gridBagConstraints);
    this.Zx.add(this.Zr);
    this.Zr.setText(a(-18836, -24472));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zr, gridBagConstraints);
    this.Zx.add(this.ZR);
    this.ZR.setText(a(-18846, 24648));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZR, gridBagConstraints);
    this.Zx.add(this.ZC);
    this.ZC.setText(a(-18847, -29528));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZC, gridBagConstraints);
    this.Zx.add(this.ZZ);
    this.ZZ.setText(a(-18839, -8774));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZZ, gridBagConstraints);
    this.Zx.add(this.ZG);
    this.ZG.setText(a(-18833, -30488));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZG, gridBagConstraints);
    this.Zk.setText(a(-18838, -30150));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zk, gridBagConstraints);
    this.Zc.setText(a(-18840, -10912));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zc, gridBagConstraints);
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'øÓØ=Ï³lÈè-ÇæþÐsÕOf¯Pt'õmûºM£¿«¡&w¬G)ÓèÕ,y¡.µ9ØIH$zÜ¹^&2áfc´Ë9Å"y?AÑxó¥VÜc1±8¤á¥ÿ/q-Öm-QËD*6¥U?oöû¢ #¿jýp¨PÉb($¬!2äÉÿ·Tm±'¤µPñÉ¥·|Füv`2/LOL@¨õ¼ÇxĖç0Ú9\\rº6µºåç|é5ÁÐ6â´#ôò}ßcîó©&¸«êêßN!«2xÏ\\bòP}¯/;oÉCùõÆÍ#<ÃnôC^Ée-\¨âs10Y÷^ê@òaí>t¹T.Ç^æ)Ån£´#çÆ"Fæ£à±\\rÅÎÄ44¤øâ¥)ÒáOîy|wÂîs!tËZ 3õîÖrfý<É*Ü[·ê/NÈ»#0\\b1(<d¿öýI]UøêD>Àÿ»~©dÓút§üýç\}D­0Ò¦Z¢F&ê 3<mòx(º@³0ÿfç¶M#°^F ­;ÙkõVðÊéU!0'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #41
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
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
    //   68: ldc '(=ÜÙbÏ»ÜÕ°4_æ+s¦%CQ Ö/©mn<d%V½*UA®²;)Ä|ã3ÉS+§ 6uêxïÛûjîöx\\r¶H'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #25
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #116
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
    //   129: putstatic burp/Zbr9.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbr9.b : [Ljava/lang/String;
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
    //   212: bipush #59
    //   214: goto -> 244
    //   217: bipush #116
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #103
    //   239: goto -> 244
    //   242: bipush #72
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
    int i = (paramInt1 ^ 0xFFFFB66B) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbr9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */