package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbbt extends Zbb7 {
  private Zrq9 ZG;
  
  private Zl8w ZA;
  
  private Zm99 ZV;
  
  private Zm99 ZI;
  
  private Zm99 ZU;
  
  private Zm99 Zn;
  
  public Zgff ZP;
  
  public Zgff Zo;
  
  public Zgff ZN;
  
  public Zgff Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbbt(Zbyw paramZbyw, Zr_4 paramZr_4) {
    super(paramZbyw, paramZr_4);
    this.Zg = this.ZG = paramZr_4.<Zgpi>ZH(new Zgee(paramZbyw.ZP()));
    ZI();
    try {
      String str = this.Zd.getText();
      this.ZG.ZjA(str);
      this.ZG.ZHB(Integer.parseInt(this.Zo.getText()));
      this.ZG.ZHN(Integer.parseInt(this.ZP.getText()));
      this.ZG.ZH5(Integer.parseInt(this.ZN.getText()));
      this.ZG.ZyK();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZI() {
    this.ZP = new Zgff();
    this.ZV = new Zm99();
    this.ZN = new Zgff();
    this.ZI = new Zm99();
    this.Zo = new Zgff();
    this.ZU = new Zm99();
    this.Zd = new Zgff();
    this.Zn = new Zm99();
    this.ZA = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZP.setColumns(5);
    this.ZP.setText(a(7288, -152));
    this.ZP.ZH(Zlw9.NUMBER);
    this.ZP.addKeyListener(new Zeqs(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZP, gridBagConstraints);
    this.ZV.setText(a(7282, 17944));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    this.ZN.setColumns(5);
    this.ZN.setText(a(7284, 32006));
    this.ZN.ZH(Zlw9.NUMBER);
    this.ZN.addKeyListener(new Zlpf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZN, gridBagConstraints);
    this.ZI.setText(a(7290, 16929));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.ZI, gridBagConstraints);
    this.Zo.setColumns(5);
    this.Zo.setText(a(7283, -18650));
    this.Zo.ZH(Zlw9.NUMBER);
    this.Zo.addKeyListener(new Zlrk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zo, gridBagConstraints);
    this.ZU.setText(a(7294, -16282));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZU, gridBagConstraints);
    this.Zd.setColumns(5);
    this.Zd.setText("A");
    this.Zd.addKeyListener(new Zgpr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.Zn.setText(a(7285, -19746));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zn, gridBagConstraints);
    this.ZA.setText(a(7287, 16676));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZA, gridBagConstraints);
  }
  
  private void Zr(KeyEvent paramKeyEvent) {
    try {
      this.ZG.ZH5(Integer.parseInt(this.ZN.getText()));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZG.ZH5(0);
    } 
    this.ZG.ZyK();
    this.Zw.Z_(this.ZG.Zyv(), false);
  }
  
  private void Za(KeyEvent paramKeyEvent) {
    try {
      this.ZG.ZHN(Integer.parseInt(this.ZP.getText()));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZG.ZHN(0);
    } 
    this.ZG.ZyK();
    this.Zw.Z_(this.ZG.Zyv(), false);
  }
  
  private void Zc(KeyEvent paramKeyEvent) {
    try {
      this.ZG.ZHB(Integer.parseInt(this.Zo.getText()));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZG.ZHB(0);
    } 
    this.ZG.ZyK();
    this.Zw.Z_(this.ZG.Zyv(), false);
  }
  
  private void ZP(KeyEvent paramKeyEvent) {
    String str = this.Zd.getText();
    this.ZG.ZjA(str);
    this.ZG.ZyK();
    this.Zw.Z_(this.ZG.Zyv(), false);
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(7295, 23859) + a(7295, 23859), this.Zd.getText());
    paramZmjc.Zt(a(7281, -1289) + a(7281, -1289), this.Zo.getText());
    paramZmjc.Zt(a(7292, 646) + a(7292, 646), this.ZP.getText());
    paramZmjc.Zt(a(7286, 21743) + a(7286, 21743), this.ZN.getText());
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    Zzvm zzvm = paramZe9k.Zyi();
    Zuh.Zv((paramZe9k.Zyi() == this.Zg.Zyi()), Zqf.Zk, zzvm.id);
    this.Zg = this.ZG = (Zrq9)paramZe9k;
    this.Zd.setText(paramZsh8.ZMm(a(7289, 26420) + a(7289, 26420)));
    this.Zo.setText(paramZsh8.ZMm(a(7280, 15211) + a(7280, 15211)));
    this.ZP.setText(paramZsh8.ZMm(a(7291, 32464) + a(7291, 32464)));
    this.ZN.setText(paramZsh8.ZMm(a(7293, -9855) + a(7293, -9855)));
    this.ZG.ZyK();
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '­´îÁÿûæ\\t ÿÇí»g¨ó âDUtB£uHÆ)@¶\\f³çTs¡¼Öª2y{ zTø¤hé.\ª@%Od÷>·0õ¼]àQý§½;{ôg@²Áÿªh¿\\b@@ßGbr¾UÌße¥ÏDZ\\r.÷2ýøí&cªþ­UÔ7GVé¹;ß!Ëv¼  àp0kðY"x ¦K±åAù)¢þÕnä;M¬×$JO×Âêª[\\f6;Ãw¦M\\bÞ}ó¢Vdêª)T\\r½ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #169
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #56
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 143
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
    //   69: ldc 'ÛýiX'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: iconst_2
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #109
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
    //   129: putstatic burp/Zbbt.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbbt.b : [Ljava/lang/String;
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
    //   212: bipush #78
    //   214: goto -> 244
    //   217: bipush #72
    //   219: goto -> 244
    //   222: bipush #26
    //   224: goto -> 244
    //   227: bipush #119
    //   229: goto -> 244
    //   232: bipush #68
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #57
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
    //   283: tableswitch default -> 41, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1C77) & 0xFFFF;
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
      byte b1 = 107;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */