package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Objects;
import net.portswigger.Zm2;

public class Zbet extends Zbv5 implements Zsnh {
  private final Zkcw ZB;
  
  private boolean Zo;
  
  private boolean ZG;
  
  private Zzdy Z_;
  
  private Zzdy Zj;
  
  private Zzdy ZD;
  
  private Zzdy Zq;
  
  private Zl8w ZQ;
  
  private Zm9v ZC;
  
  private Zm9v ZX;
  
  private Zm99 ZV;
  
  private Zm99 ZF;
  
  private Zbkc Zr;
  
  private Zgfo Zd;
  
  private Zgfo Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbet(Zkcw paramZkcw) {
    this.ZB = paramZkcw;
    Zt();
    Objects.requireNonNull(paramZkcw);
    this.Zd.Zu(paramZkcw::ZVC, this::Zm, 1, 2147483647);
    Objects.requireNonNull(paramZkcw);
    this.Za.Zu(paramZkcw::ZV2, this::Zl, 1, 2147483647);
  }
  
  public String ZZ() {
    return this.Zr.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_AUDIT_OPTIONS_JAVASCRIPT_ANALYSIS_OPTIONS;
  }
  
  public String Zq() {
    return a(25958, 4791);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.ZB.Zl(zzkm);
    return zzkm.ZV(new String[] { a(25956, 31199) });
  }
  
  public String ZE() {
    return a(25966, 5132);
  }
  
  public void Zt2() {
    this.Zj.setSelected(this.ZB.ZEE());
    this.Z_.setSelected(this.ZB.ZEI());
    this.ZD.setSelected(this.ZB.ZEo());
    this.Zq.setSelected(this.ZB.ZEb());
    this.Za.setText("" + this.ZB.ZEG());
    this.Zd.setText("" + this.ZB.ZE6());
    this.ZC.setVisible(false);
    this.ZX.setVisible(false);
  }
  
  public String Zd() {
    return this.Zo ? a(25955, -1248) : (this.ZG ? a(25954, -20311) : "");
  }
  
  private void Zm(boolean paramBoolean) {
    this.Zo = !paramBoolean;
    this.ZC.setVisible(!paramBoolean);
    if (paramBoolean)
      Zm2.ZC(Zrrh.SCANNER_SAST_MAXIMUM_ANALYSIS_TIME_MODIFIED); 
  }
  
  private void Zl(boolean paramBoolean) {
    this.ZG = !paramBoolean;
    this.ZX.setVisible(!paramBoolean);
    if (paramBoolean)
      Zm2.ZC(Zrrh.SCANNER_SAST_MAXIMUM_ANALYSIS_TIME_MODIFIED); 
  }
  
  private void Zj(boolean paramBoolean) {
    this.ZV.setEnabled(paramBoolean);
    this.Zd.setEnabled(paramBoolean);
    this.ZC.setVisible((paramBoolean && this.Zo));
  }
  
  private void Za(boolean paramBoolean) {
    this.ZF.setEnabled(paramBoolean);
    this.Za.setEnabled(paramBoolean);
    this.ZX.setVisible((paramBoolean && this.ZG));
  }
  
  private void Zt() {
    this.Zr = new Zbkc();
    this.ZQ = new Zl8w();
    this.Zj = new Zzdy();
    this.Z_ = new Zzdy();
    this.ZD = new Zzdy();
    this.Zq = new Zzdy();
    this.ZV = new Zm99();
    this.Zd = new Zgfo();
    this.ZC = new Zm9v();
    this.ZF = new Zm99();
    this.Za = new Zgfo();
    this.ZX = new Zm9v();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zr.Zx(a(25963, -30443));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 21;
    add(this.Zr, gridBagConstraints);
    this.ZQ.setText(a(25959, -25396));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZQ, gridBagConstraints);
    this.Zj.setText(a(25961, 1036));
    this.Zj.addActionListener(new Zg5g(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.Zj, gridBagConstraints);
    this.Z_.setText(a(25964, -9523));
    this.Z_.addActionListener(new Zljm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.Z_, gridBagConstraints);
    this.ZD.setText(a(25965, -23587));
    this.ZD.addActionListener(new Zgnh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZD, gridBagConstraints);
    this.Zq.setText(a(25953, -14897));
    this.Zq.addActionListener(new Zlmd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zq, gridBagConstraints);
    this.ZV.setText(a(25960, -20232));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    this.Zd.setColumns(8);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.ZC.setText(a(25967, -30948));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    add(this.ZC, gridBagConstraints);
    this.ZF.setText(a(25962, 25966));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZF, gridBagConstraints);
    this.Za.setColumns(8);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    add(this.Za, gridBagConstraints);
    this.ZX.setText(a(25952, -10883));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.ZX, gridBagConstraints);
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    boolean bool = this.Zj.isSelected();
    this.Z_.setSelected(bool);
    this.Z_.setEnabled(bool);
    this.ZB.Znk(bool);
    this.ZB.Zn7(bool);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    this.ZB.Zn7(this.Z_.isSelected());
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    boolean bool = this.ZD.isSelected();
    if (!bool && !this.Zq.isSelected()) {
      this.Zq.setSelected(true);
      Za(true);
      this.ZB.ZnR(true);
    } 
    this.ZB.ZnV(bool);
    Zj(bool);
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    boolean bool = this.Zq.isSelected();
    if (!bool && !this.ZD.isSelected()) {
      this.ZD.setSelected(true);
      Zj(true);
      this.ZB.ZnV(true);
    } 
    this.ZB.ZnR(bool);
    Za(bool);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '0\\nGqnuZXÆcÊÂÕ/r\\nÿ$Ó¯Ã©\\frÜÒ/¯ ÇÆÌ$HMxjîÓ ÁZfÄd û°!c-ï=ÿ{ úö4¢ÛK$Ò<²fÖ^qAÂÃY1QZGj£èHj&9àökKñs²ê¬((WP²^\\b2æúý»p æ¶¡nÒ8$ +Ý \\bo´Ûñ5¡¤á zT¸í'm~9Á® JKï·ÀÜ£ÃØÍ¢Ù½½S\\nHE¼Ã\\tê¡\\rÇ`3Ú.õUÉq¡îÓHg_âN\ÕzëaEú;rÈ#b$õÏ¾Îý:BÃ \\ròþdÝr»è¸%¼Å©qVIcz.hÿGÂ)[À@M¬î¼ì@,J|þw;±X¼âÿÆ¢Õÿg8Îx¬$l]F}WÐr¶öFúvá xô¯ëÔÎÄiÝ\\f:ûôk&ïö%1.íõÌ.îE\\f&zêG}3ªjëªZ©*Í¦áPX\\rÔL)'µmêmù£! c-J re\\nÜ³[O·¹8ÅéÄoDý¢çpÕã±Y^Mm¾×JrmR÷ 1;¬r'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #51
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #12
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
    //   68: ldc '¨ÙVÜ[(àí{{Å¸ìîØÄô´±õZþ?ÅoÃ¡¦M$pºñ\\b=Z#Þ¹àÒ#Sb3Þ íXÉ"\\b+=²­G¡ÊúCKZò7fÌ·6åB=ó÷xÃØ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #74
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #38
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
    //   129: putstatic burp/Zbet.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbet.b : [Ljava/lang/String;
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
    //   212: bipush #27
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #51
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #118
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
    int i = (paramInt1 ^ 0x656A) & 0xFFFF;
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
      char c = 'ß';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbet.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */