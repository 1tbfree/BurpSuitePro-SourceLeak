package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbby extends Zbb7 {
  private Zzcx ZT;
  
  private Zm99 Zi;
  
  private ButtonGroup Z_;
  
  private Zl8w Za;
  
  private Zmg2 ZS;
  
  private Zmg2 Zt;
  
  public Zgff Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbby(Zbyw paramZbyw, Zr_4 paramZr_4) {
    super(paramZbyw, paramZr_4);
    this.Zg = this.ZT = paramZr_4.<Zgpi>ZH(new Zet(paramZbyw.ZP().ZM()));
    Zl();
  }
  
  private void Zl() {
    this.Z_ = new ButtonGroup();
    this.Zs = new Zgff();
    this.Zt = new Zmg2();
    this.ZS = new Zmg2();
    this.Za = new Zl8w();
    this.Zi = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zs.setColumns(20);
    this.Zs.addKeyListener(new Zz5o(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zs, gridBagConstraints);
    this.Z_.add(this.Zt);
    this.Zt.setText(a(-16626, -1202));
    this.Zt.addActionListener(new Zmof(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zt, gridBagConstraints);
    this.Z_.add(this.ZS);
    this.ZS.setSelected(true);
    this.ZS.setText(a(-16628, 7136));
    this.ZS.addActionListener(new Zbu_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZS, gridBagConstraints);
    this.Za.setText(a(-16630, 4562));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Za, gridBagConstraints);
    this.Zi.setText(a(-16629, 27122));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zi, gridBagConstraints);
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    this.ZT.ZEG(null);
    this.Zw.Z_(-1, false);
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    ZJ((KeyEvent)null);
  }
  
  private void ZJ(KeyEvent paramKeyEvent) {
    this.Zt.setSelected(true);
    String str = this.Zs.getText();
    this.ZT.ZEG(str);
    this.Zw.Z_(str.length(), false);
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(-16627, 30372) + a(-16627, 30372), this.Zs.getText());
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    String[] arrayOfString = Zbb7.ZS();
    Zzvm zzvm = paramZe9k.Zyi();
    Zuh.Zv((paramZe9k.Zyi() == this.Zg.Zyi()), Zqf.Zk, zzvm.id);
    this.Zg = this.ZT = (Zzcx)paramZe9k;
    this.Zs.setText(paramZsh8.ZMm(a(-16625, 21091) + a(-16625, 21091)));
    if (this.ZT.Zk_() == null) {
      this.ZS.setSelected(true);
      if (arrayOfString == null) {
        this.Zt.setSelected(true);
        return;
      } 
      return;
    } 
    this.Zt.setSelected(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '÷~h2Fú$éÍ¥ÆWÉ<9û ¶ù¾+g+Z\\\fM¾Åq=å\\n¬ÀÕlÖ|'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
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
    //   68: ldc 'F<|½n¢÷PN«±!ýer4M@;¤¸±uÓoúÃ;ât|;··)½Ý¨§ðxõ`fíçTBÁ\\ntÔµ9Å6×èþÓUGáµ²7þ©n%@Ü9½»1÷øîìÖÒð,6%üÝÎâv|£=DÔþþ ¡Ù°6åDÆk)!hÆOfOgcëÉ`z\\rÅëè¸Ðú¸]DçËÐ¼Ünà§rb¸¿÷óU®ÁËê%g­\\tO0®ÖÇ!Ó;Rá´¯9À{$'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #209
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #32
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
    //   130: putstatic burp/Zbby.a : [Ljava/lang/String;
    //   133: bipush #6
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zbby.b : [Ljava/lang/String;
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
    //   160: if_icmpgt -> 258
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #32
    //   214: goto -> 242
    //   217: bipush #37
    //   219: goto -> 242
    //   222: bipush #35
    //   224: goto -> 242
    //   227: iconst_4
    //   228: goto -> 242
    //   231: bipush #22
    //   233: goto -> 242
    //   236: bipush #104
    //   238: goto -> 242
    //   241: iconst_2
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 167
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 163
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBF0E) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbby.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */