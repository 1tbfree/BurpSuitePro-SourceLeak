package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbkw extends Zbv5 implements Zt3u {
  private final Zgb6 ZR;
  
  private final Zr1m Zd;
  
  private final Collection<String> ZW;
  
  private Zm99 Zn;
  
  private Zm99 Zk;
  
  private Zm99 ZO;
  
  private Zm99 ZD;
  
  private Zm99 Zt;
  
  private Zgff Zb;
  
  private Zgff ZB;
  
  private Zgff Zs;
  
  private Zgff Zm;
  
  private Zgff Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbkw(Zgb6 paramZgb6, Zr1m paramZr1m) {
    this.ZR = paramZgb6;
    this.Zd = paramZr1m;
    ZB();
    this.ZW = Set.of(Zjd(), a(-8710, -32405), a(-8705, 27179), a(-8732, -1960), a(-8713, -31110), a(-8712, 27081), a(-8720, 29739), a(-8736, -26124));
    setName(a(-8727, -27767));
  }
  
  public String Zjd() {
    return a(-8714, -6938);
  }
  
  public String ZjS() {
    return a(-8717, -1660);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-8719, 10963), Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_TIMEOUTS, this.Zd, new String[] { a(-8709, 28831) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZW;
  }
  
  public void Zt2() {
    this.Zb.setText(Integer.toString(this.ZR.ZfT() / 1000));
    this.ZB.setText(Integer.toString(this.ZR.ZEj() / 1000));
    this.Zr.setText(Integer.toString(this.ZR.ZfZ() / 1000));
    this.Zs.setText(Integer.toString(this.ZR.Zfl() / 1000));
    this.Zm.setText(Integer.toString(this.ZR.Zfv() / 1000));
  }
  
  private void Zv(Zgff paramZgff, Consumer<Integer> paramConsumer, String paramString) {
    try {
      int i = Zl(paramZgff.getText());
      if (i < 0)
        i = 0; 
      paramConsumer.accept(Integer.valueOf(i));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.Zd.Zl(new String[] { paramString });
    } 
  }
  
  private int Zl(String paramString) {
    int i = 0;
    try {
      if (paramString != null && !paramString.isEmpty())
        i = 1000 * Integer.parseInt(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return i;
  }
  
  private void ZB() {
    this.Zn = new Zm99();
    this.Zk = new Zm99();
    this.Zt = new Zm99();
    this.Zb = new Zgff();
    this.ZB = new Zgff();
    this.Zr = new Zgff();
    this.ZO = new Zm99();
    this.ZD = new Zm99();
    this.Zm = new Zgff();
    this.Zs = new Zgff();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zn.setText(a(-8731, 13420));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    add(this.Zn, gridBagConstraints);
    this.Zk.setText(a(-8733, -32069));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    add(this.Zk, gridBagConstraints);
    this.Zt.setText(a(-8706, 25925));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 2048;
    add(this.Zt, gridBagConstraints);
    this.Zb.setColumns(6);
    this.Zb.setToolTipText(a(-8715, -3397));
    this.Zb.addKeyListener(new Zx_8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zb, gridBagConstraints);
    this.ZB.setColumns(6);
    this.ZB.setToolTipText(a(-8729, -5870));
    this.ZB.ZH(Zlw9.NUMBER);
    this.ZB.addKeyListener(new Zk78(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    add(this.ZB, gridBagConstraints);
    this.Zr.setColumns(6);
    this.Zr.setToolTipText(a(-8708, 30110));
    this.Zr.ZH(Zlw9.NUMBER);
    this.Zr.addKeyListener(new Zbfa(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    add(this.Zr, gridBagConstraints);
    this.ZO.setText(a(-8707, 7025));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.ZO, gridBagConstraints);
    this.ZD.setText(a(-8726, 1017));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 2048;
    add(this.ZD, gridBagConstraints);
    this.Zm.setColumns(6);
    this.Zm.setToolTipText(a(-8735, -20183));
    this.Zm.ZH(Zlw9.NUMBER);
    this.Zm.addKeyListener(new Zecr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 2048;
    add(this.Zm, gridBagConstraints);
    this.Zs.setColumns(6);
    this.Zs.setToolTipText(a(-8716, 25267));
    this.Zs.ZH(Zlw9.NUMBER);
    this.Zs.addKeyListener(new Zrhf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.Zs, gridBagConstraints);
  }
  
  private void Zb(KeyEvent paramKeyEvent) {
    Objects.requireNonNull(this.ZR);
    Zv(this.Zm, this.ZR::ZJ, a(-8730, 30725));
  }
  
  private void Zi(KeyEvent paramKeyEvent) {
    Objects.requireNonNull(this.ZR);
    Zv(this.Zs, this.ZR::ZB, a(-8725, 47));
  }
  
  private void ZQ(KeyEvent paramKeyEvent) {
    Objects.requireNonNull(this.ZR);
    Zv(this.Zr, this.ZR::Zn, a(-8711, -10907));
  }
  
  private void Za(KeyEvent paramKeyEvent) {
    Objects.requireNonNull(this.ZR);
    Zv(this.ZB, this.ZR::Zw, a(-8734, -22461));
  }
  
  private void Zz(KeyEvent paramKeyEvent) {
    Objects.requireNonNull(this.ZR);
    Zv(this.Zb, this.ZR::Z_, a(-8718, 14826));
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿p\\n»ûurôL8f½K-8éèqÓ~IÓÇÑ©ÁûH&?ðnÎL@ÏØQíó|pB<Kªx0[#;ø¬¹Ä­× 9íVç\\t\\rDnÙVëåu½kGªçò}6}tùoø©L×?\\buDâØ,Ô£Kzaâ9zØ+rfy5Od?eÏ8z&)(µ7Úì ,®öúqGC£$Ø¿ënzí_yÛ<ìíM©Õ4ÙM,©G¬Å6ö6Íë\QÔ¨[Áw9Ãê×Ùc¢$nuqÛ7G`Í¥§ÎAÿâã\\bL"\\f8p»\\nÈåz¡úÞ½ùµ\ooD}·\\tñ7q }9PÎáäI½¦:o¥\\b.m4j¼¼+/XWÛDørLg:{C _»y8î-]'O±Eh\\rDÑs£Fk!´oã Ýlá= ÔL{s¦Èó»E=+'­à¤a\\bzçò­Qa7Ý1ÂJpÕà{óksJ.Éy©ázä0Ôãwº$¬F{È­£ñ@FCÛEÊ¬ßÿ:+[dFA¿¢w¡w|Ô~&\\rM@Q¬ÄKXóã@7ÙÕxøK+Ê+©v+/|Ù\\tQàþ Þ-ÒH'*ÜÊ¡¨`/s¼K]Àò^­BW¼--cx×íÖUZE å¹ÛÜ*æýAÈa8Ä\\rÌêwÃ4Ì'@Ê\\b­÷Ó¸À67 Jö*¡I¤.©nwÛ¡\\t ³>oZ\\r[cBß8Ç×­é"Äì§èðM¿ù t>ûáÓrDç©PÒûMÕu,úÚ»Ê\\t*ÌáÕð¬.ð ôÅN\\tðt4ê=0Xç>a¦PÆê»H¸VÌn1Îf8u`E]Õlò søO÷3ÿ­1wª§öº.Dèm1´)Ãñd?¡*CÏÚRÂb±ðC\\nTwã´Ä%jÁ=[¶?ê2è2ï\\nfñ÷t}gÅýÅ#îüu¯ 8_ãL7 5DSÃàcè@+±>ÉÜ×T`6Y+àÂFöQÀV¼SQiÄµsJUÁmpÞsö;ÍJ&(ò«ÝèØ®ké½RÙ@*ûaãzá"ÒL¸¢ú3«»JajZ£K¶ÓNñÎãô²*jÃ'¹0+H-~/²Æ¦Abþ9Ã\­1Í3ÛÕW @m!¼ÏçÑâ¬-Ô-ÿ¤"¡Jïiü¿ÈM3ÙZÊM\\rç«A2£äKCIä_rëÇÕÌ×ÓéWØÆäÆö\\n?@ÊÅ.2¸eç5´g/û\\r§^âoÄBè`Á\\fÝäÇáÍ2b\\b'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #191
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #61
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'C«ç`jÝ» á¿ª,·ð¹*0§;ô!~h¤Ý[ÏE¦µ¾Qê/Ultñ'Ù'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #30
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #100
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zbkw.a : [Ljava/lang/String;
    //   133: bipush #27
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zbkw.b : [Ljava/lang/String;
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
    //   212: bipush #45
    //   214: goto -> 244
    //   217: bipush #81
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #118
    //   234: goto -> 244
    //   237: bipush #29
    //   239: goto -> 244
    //   242: bipush #83
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
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDDF3) & 0xFFFF;
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
      byte b1 = 118;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */