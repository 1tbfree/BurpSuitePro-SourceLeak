package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;

class Zgox extends Zbqc {
  private final Zzr6 ZG;
  
  private final Zgo0 Zm;
  
  private Zz92 Zy;
  
  private boolean Zr;
  
  private Zm9e ZU;
  
  private ButtonGroup ZN;
  
  private JScrollPane ZC;
  
  private Zm99 Zn;
  
  private Zbkc ZX;
  
  Zl8w Zx;
  
  private Zbkc ZR;
  
  private Zl8w Zv;
  
  private Zmg2 ZD;
  
  private Zmg2 Zq;
  
  private Zm99 Zc;
  
  private Zl86 ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgox(Zzr6 paramZzr6, Zgo0 paramZgo0) {
    this.ZG = paramZzr6;
    this.Zm = paramZgo0;
    String[] arrayOfString = Zgoz.ZQ();
    ZT();
    this.ZU.Zr(a(1580, -20861), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_PRESSED), this::Ze);
    this.Zx.setVisible(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(paramZgo0, gridBagConstraints);
    if (Zbqc.Zwu() == null)
      Zgoz.ZE(new String[4]); 
  }
  
  private void Ze() {
    this.ZU.Zr(a(1582, -27738), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_COLLAPSE_SMALL_PRESSED), this::Zu);
    this.ZG.Zn(true);
    this.Zr = true;
  }
  
  private void Zu() {
    this.ZU.Zr(a(1582, -27738), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_HOVER), Zbz3.ZK(Zxpj.PANEL_EXPAND_SMALL_PRESSED), this::Ze);
    this.ZG.Zn(false);
    this.Zr = false;
  }
  
  void Zn(List<String> paramList) {
    String[] arrayOfString = Zgoz.ZQ();
    this.ZF.setText(ZZ(paramList));
    if (this.Zy == null) {
      this.Zy = new Zz92(this, this.ZF);
      this.ZF.addFocusListener(this.Zy);
      if (arrayOfString != null) {
        this.Zy.Zo();
        return;
      } 
      return;
    } 
    this.Zy.Zo();
  }
  
  void Zx(boolean paramBoolean) {
    this.ZD.setSelected(paramBoolean);
    this.Zq.setSelected(!paramBoolean);
  }
  
  void Zs() {
    this.ZF.setEnabled(false);
    this.ZX.setVisible(false);
    this.ZD.setVisible(false);
    this.Zq.setVisible(false);
    this.Zm.Ze();
  }
  
  void Zg() {
    this.Zm.Zk();
    this.ZG.Zb(ZY(this.ZF.getText()));
    this.Zm.Zk();
  }
  
  private List<String> ZY(String paramString) {
    return Zb99.Zh(paramString.split(a(1583, -4217)));
  }
  
  private String ZZ(List<String> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<String> iterator = paramList.iterator();
    String[] arrayOfString = Zgoz.ZQ();
    while (iterator.hasNext()) {
      String str = iterator.next();
      stringBuilder.append(str).append('\n');
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private void ZR() {
    String[] arrayOfString = Zgoz.ZQ();
    if (this.Zr) {
      Zu();
      if (arrayOfString != null) {
        Ze();
        return;
      } 
      return;
    } 
    Ze();
  }
  
  private void ZT() {
    this.ZN = new ButtonGroup();
    this.ZR = new Zbkc();
    this.Zv = new Zl8w();
    this.ZC = new JScrollPane();
    this.ZF = new Zl86();
    this.ZX = new Zbkc();
    this.ZD = new Zmg2();
    this.Zq = new Zmg2();
    this.ZU = new Zm9e();
    this.Zn = new Zm99();
    this.Zx = new Zl8w();
    this.Zc = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZR.Zx(a(1569, 1941));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZR, gridBagConstraints);
    this.Zv.setText(a(1574, 12123));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.Zv, gridBagConstraints);
    this.ZF.setRows(10);
    this.ZF.setName(a(1573, -23883));
    this.ZC.setViewportView(this.ZF);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZC, gridBagConstraints);
    this.ZX.Zx(a(1571, -16715));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZX, gridBagConstraints);
    this.ZN.add(this.ZD);
    this.ZD.setText(a(1568, -13237));
    this.ZD.setName(a(1572, 4141));
    this.ZD.addActionListener(new Zkjn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZD, gridBagConstraints);
    this.ZN.add(this.Zq);
    this.Zq.setText(a(1570, 26775));
    this.Zq.setName(a(1575, -7571));
    this.Zq.addActionListener(new Zo7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    add(this.Zq, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZU, gridBagConstraints);
    this.Zn.setText(a(1582, -27738));
    this.Zn.addMouseListener(new Ze04(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.Zn, gridBagConstraints);
    this.Zx.setText(a(1581, -20934));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 5, 0);
    add(this.Zx, gridBagConstraints);
    this.Zc.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zc, gridBagConstraints);
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.ZG.Zs(this.ZD.isSelected());
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    this.ZG.Zs(!this.Zq.isSelected());
  }
  
  private void Zc(MouseEvent paramMouseEvent) {
    if (this.Zn.contains(paramMouseEvent.getPoint()))
      ZR(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '§}-Û£ýÄ@þÆ%-çÜ£x\\tÐRÝøh2Þ¶A¡]Fè9é~-Ü5=F«®Ý:Ú"e(Ì¥q²íÉ'4§VEÐS+.§ ®ùû& zQ3¾naÍ_Ý$1ªóçæ¨ÙþV]¨ÜÛðìJhø&C¦;¦ºr·@­«,bâÄÙz/¹Â%ø\\nþ÷mk+Ó]êQð°^u\\b­Bä¯b­²×õÍ°Ô¦wÊ8æiv"û_:l&¾æsÞ¤@rùåçðËÐ2¬.Üüç@!(<R£ÏkÕAÚûÓEò£)°íáßCÀ¦prÊ\\fuSâàÃkÖ%EðjÏú@ÿ$rVéNÕVÀrÑiìÖõ.Eí)gbFq;Û#ùµ ¡¦ùÅH'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #120
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
    //   68: ldc '8Í{uHsÿËz¹¸ÀªÞ|;½W×¢ÏÊ ]d´sH¡¸ngø#¿²¯{­7¡IØ:îó± ×ÞEN$Ò&Hëdÿ¾_°.&kúN0úÎÑIT9{7$*ÂwR¼ö¥Òä¼G#ÖoíÿxÃMHä¹zå÷úK=àâráø¼(t1Î­üÃ}>ÁîíÜ×cþÎÙ\\nê$}Û¤ó¹8Q±È¤àÂÞ¸{rÙ¹ÂGKìrcëÏ?;2åk\\r¿Úyâ½¯n*À{ó¼²aBïw/njÒ!iúdØ\\r+WÀ{Ø½Úh>9C'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #230
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #74
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
    //   130: putstatic burp/Zgox.a : [Ljava/lang/String;
    //   133: bipush #12
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zgox.b : [Ljava/lang/String;
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
    //   160: if_icmpgt -> 259
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #90
    //   214: goto -> 243
    //   217: bipush #13
    //   219: goto -> 243
    //   222: bipush #51
    //   224: goto -> 243
    //   227: bipush #53
    //   229: goto -> 243
    //   232: bipush #36
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #41
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 167
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 163
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x627) & 0xFFFF;
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
      char c = 'ï';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */