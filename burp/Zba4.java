package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zba4 extends Zbv5 implements Zt3u {
  private final Zzy9 ZH;
  
  private final Zr1m Zx;
  
  private final Zbo9 Zg;
  
  private final Collection<String> ZN;
  
  private Zzdy Zf;
  
  private Ze01 ZQ;
  
  private Ze01 Zy;
  
  private Zm99 ZL;
  
  private Zm99 ZV;
  
  private Zbqc Zo;
  
  private Zg85 Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zba4(Zzy9 paramZzy9, Zr1m paramZr1m, Zbo9 paramZbo9) {
    Zuh.Zv((paramZzy9 != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZr1m != null), Zqf.Zv, 2L);
    this.ZH = paramZzy9;
    this.Zx = paramZr1m;
    this.Zg = paramZbo9;
    this.ZN = Set.of(Zjd(), a(29205, 11374), a(29204, 23713), a(29185, 16994), a(29207, -26186), a(29191, -5747));
    ZR();
    setName(a(29200, 5310));
  }
  
  public String Zjd() {
    return a(29211, -12930);
  }
  
  public String ZjS() {
    return a(29186, 17362);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_SETTINGS_TOOLS_BURPS_BROWSER_SETTINGS_HISTORY, this.Zx, new String[] { a(29213, -24947) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZN;
  }
  
  public void Zt2() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Lburp/Zzy9;
    //   4: invokeinterface ZK2 : ()Z
    //   9: istore_1
    //   10: aload_0
    //   11: getfield Zf : Lburp/Zzdy;
    //   14: iload_1
    //   15: invokevirtual setSelected : (Z)V
    //   18: aload_0
    //   19: getfield Zd : Lburp/Zg85;
    //   22: aload_0
    //   23: getfield ZH : Lburp/Zzy9;
    //   26: invokeinterface ZKz : ()Ljava/lang/String;
    //   31: invokevirtual setText : (Ljava/lang/String;)V
    //   34: aload_0
    //   35: iload_1
    //   36: <illegal opcode> run : (Lburp/Zba4;Z)Ljava/lang/Runnable;
    //   41: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   44: return
  }
  
  private void Zd(boolean paramBoolean) {
    this.ZL.setEnabled(paramBoolean);
    this.Zd.setEnabled(paramBoolean);
    this.Zy.setEnabled(paramBoolean);
    this.ZV.setEnabled(paramBoolean);
    this.ZQ.setEnabled(paramBoolean);
  }
  
  private void ZR() {
    this.Zf = new Zzdy();
    this.Zo = new Zbqc();
    this.ZL = new Zm99();
    this.Zd = new Zg85();
    this.Zy = new Ze01();
    this.ZV = new Zm99();
    this.ZQ = new Ze01();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zf.setText(a(29206, -11994));
    this.Zf.addActionListener(new Zm_5(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zf, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.Zo.setLayout(gridBagLayout2);
    this.ZL.setText(a(29208, -1060));
    this.ZL.setToolTipText("");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zo.add(this.ZL, gridBagConstraints);
    this.Zd.setEditable(false);
    this.Zd.setColumns(35);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    this.Zo.add(this.Zd, gridBagConstraints);
    this.Zy.setText(a(29212, -1941));
    this.Zy.addActionListener(new Zsnj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.Zo.add(this.Zy, gridBagConstraints);
    this.ZV.setText(a(29202, -19812));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 10, 0);
    this.Zo.add(this.ZV, gridBagConstraints);
    this.ZQ.setText(a(29214, 22756));
    this.ZQ.addActionListener(new Zeg8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    this.Zo.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    add(this.Zo, gridBagConstraints);
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    boolean bool = this.Zf.isSelected();
    this.ZH.Zgs(bool);
    Zd(bool);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    try {
      File file = Zs6n.Zc(Zg1m.DATA, this, 0, a(29201, 17149));
      try {
        if (file != null) {
          this.ZH.Zi(file.getAbsolutePath());
          this.Zd.setText(file.getAbsolutePath());
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = (Zx6o.Zc(Zt2m.ZF(this), a(29187, 145), a(29209, -19486), new String[] { a(29203, 8321), a(29210, -31726) }1) == 0) ? true : false;
    try {
      if (!bool)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.Zg.Zz();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      Zx6o.Zt(Zt2m.ZF(this), a(29184, -27895), String.format(a(29215, -10185), new Object[] { iOException.getMessage() }));
    } 
  }
  
  private void lambda$configChanged$0(boolean paramBoolean) {
    Zd(paramBoolean);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '743Q\\b½*1ß×ÅE\\fL Pß¨U72©a\\bôhþt3v à-µ¹WFU"áÞügÇ/Cî\\fS\\ntè±tV÷BªuJÐFK¦Pl°dÏTÑ¬¨Îs¿ë<Ô))bg¬Eá»a aJò´Ó"³Ó6i$åÒ¼û#zb(ÈÞ´Zö(ÎÑD¸¾¤Û\\bþ]´0J\\fõÈ$nÚÚcd0NÖ:úÿìm3þ:(qÿ(¢ó®ÁçH\\n1­+p¤JÓ{\\tÑV)ÝÌãäÆ<©Ð¨L¯);Êxºïº ¿¹Êùe3ÂCÂ1^,$'ã180c¡å\\t½zóøèæ":s: jT^ì=®1\\r))H\\bnñ|Pò)¤Y,¯_¸AH¦ ùz¦Ã»ÛXAÿ EÜ¨¿¯Ú7>ç[Ì\\bMÿDÚ'MsÎ^p¤*ý%ÆückU«aaÕ?FYtËëf)S´[þÓÀe¹eÓìïJ4ÇbÉM­yEA¦èY±1QÅpw dÁçãö\\r®Ð(øÚ{ÍîÈ¢¼jbTÃ¤F\\n'úfÌaMÒyªA[èæù1Õ©â¸s&¸¬·aÞêÚ!õ>#8¿lq\\téØ°w\\t-\\rÄ\\f!xÚøïó#ó'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #113
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
    //   67: ldc 'òÌ\\rüKS.%£­Ï¨'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #57
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
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zba4.a : [Ljava/lang/String;
    //   130: bipush #21
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zba4.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #109
    //   214: goto -> 244
    //   217: bipush #49
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #90
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7213) & 0xFFFF;
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
      byte b1 = 18;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */