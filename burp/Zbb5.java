package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbb5 extends Zbb7 {
  private Zse1 Zu;
  
  private ButtonGroup ZN;
  
  private Zzdy ZL;
  
  private Zl8w Zi;
  
  private Zm99 ZB;
  
  private Zmg2 ZS;
  
  private Zmg2 ZX;
  
  public Zgff Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbb5(Zbyw paramZbyw, Zr_4 paramZr_4) {
    super(paramZbyw, paramZr_4);
    this.Zg = this.Zu = paramZr_4.<Zgpi>ZH(new Zzk2(paramZbyw.ZP().ZM()));
    Zd();
    this.Zj.setName(a(31650, -5482));
    this.Zu.ZLy(this.ZL.isSelected());
  }
  
  private void Zd() {
    this.ZN = new ButtonGroup();
    this.Zj = new Zgff();
    this.ZS = new Zmg2();
    this.ZX = new Zmg2();
    this.ZB = new Zm99();
    this.Zi = new Zl8w();
    this.ZL = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zj.setColumns(5);
    this.Zj.ZH(Zlw9.NUMBER);
    this.Zj.addKeyListener(new Zkkt(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zj, gridBagConstraints);
    this.ZN.add(this.ZS);
    this.ZS.setSelected(true);
    this.ZS.setText(a(31652, 20994));
    this.ZS.addActionListener(new Zzz5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZS, gridBagConstraints);
    this.ZN.add(this.ZX);
    this.ZX.setText(a(31655, -9661));
    this.ZX.addActionListener(new Zrb1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZX, gridBagConstraints);
    this.ZB.setText(a(31651, 30340));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZB, gridBagConstraints);
    this.Zi.setText(a(31653, -16423));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zi, gridBagConstraints);
    this.ZL.setSelected(true);
    this.ZL.setText(a(31648, -4693));
    this.ZL.addActionListener(new Zech(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZL, gridBagConstraints);
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    this.Zu.ZvH(-1);
    this.Zw.Z_(-1, false);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    ZF((KeyEvent)null);
  }
  
  private void ZF(KeyEvent paramKeyEvent) {
    int j;
    this.ZS.setSelected(true);
    int i = this.Zu.Zyv();
    try {
      j = Integer.parseInt(this.Zj.getText());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      j = 0;
    } 
    if (j)
      j = 0; 
    try {
      this.Zu.ZvH(j);
      if (j != i)
        this.Zw.Z_(j, false); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.Zu.ZLy(this.ZL.isSelected());
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(31649, -27765) + a(31649, -27765), this.Zj.getText());
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface Zyi : ()Lburp/Zzvm;
    //   11: astore #5
    //   13: aload_1
    //   14: invokeinterface Zyi : ()Lburp/Zzvm;
    //   19: aload_0
    //   20: getfield Zg : Lburp/Ze9k;
    //   23: invokeinterface Zyi : ()Lburp/Zzvm;
    //   28: if_acmpne -> 39
    //   31: iconst_1
    //   32: goto -> 40
    //   35: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   38: athrow
    //   39: iconst_0
    //   40: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   43: aload #5
    //   45: getfield id : B
    //   48: i2l
    //   49: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   52: aload_0
    //   53: aload_0
    //   54: aload_1
    //   55: checkcast burp/Zse1
    //   58: dup_x1
    //   59: putfield Zu : Lburp/Zse1;
    //   62: putfield Zg : Lburp/Ze9k;
    //   65: aload_0
    //   66: getfield Zj : Lburp/Zgff;
    //   69: aload_2
    //   70: iload_3
    //   71: sipush #31654
    //   74: sipush #20710
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: swap
    //   81: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   86: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   91: invokevirtual setText : (Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield Zu : Lburp/Zse1;
    //   98: invokeinterface Zyv : ()I
    //   103: istore #6
    //   105: iload #6
    //   107: iconst_m1
    //   108: if_icmpne -> 131
    //   111: aload_0
    //   112: getfield ZX : Lburp/Zmg2;
    //   115: iconst_1
    //   116: invokevirtual setSelected : (Z)V
    //   119: aload #4
    //   121: ifnonnull -> 146
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   130: athrow
    //   131: aload_0
    //   132: getfield ZS : Lburp/Zmg2;
    //   135: iconst_1
    //   136: invokevirtual setSelected : (Z)V
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   145: athrow
    //   146: aload_0
    //   147: getfield ZL : Lburp/Zzdy;
    //   150: aload_0
    //   151: getfield Zu : Lburp/Zse1;
    //   154: invokeinterface ZIe : ()Z
    //   159: invokevirtual setSelected : (Z)V
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   13	35	35	java/lang/NumberFormatException
    //   105	124	127	java/lang/NumberFormatException
    //   111	139	142	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Öhû¯¹ fÊFö¢é¥ðcÈ¨M\\bmß·Z¢3÷pm1\\f¶2ðyfåso0´{°´MáxúÄ0yÂÑaMsBf¹FüyáÒf\\nºÿÐê¸%0q§ö¾® \\f-¡l,ÛÀÂ$\\fJ> ¹i¶éÅýé#9­$.¬±ðÕ@Ë"f{Îì§:0ÀÎû\\f*'»ºJ⃕â7M½p#Úz|*â+ £Ë¢ÑvEPw,«Ù3:D±§.\\bF/+âgõ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #119
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'M\\f°´a»ÒÔ'ÌÍÖ*#÷KÞÕù4JÃT~WØµ0'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #36
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_3
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zbb5.a : [Ljava/lang/String;
    //   130: bipush #8
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbb5.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_2
    //   213: goto -> 243
    //   216: bipush #38
    //   218: goto -> 243
    //   221: bipush #57
    //   223: goto -> 243
    //   226: bipush #93
    //   228: goto -> 243
    //   231: bipush #73
    //   233: goto -> 243
    //   236: bipush #96
    //   238: goto -> 243
    //   241: bipush #84
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7BA6) & 0xFFFF;
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
      byte b1 = 68;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbb5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */