package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbt2 extends Zbg2 {
  private final Zzlr ZO;
  
  private final Zbiw ZG;
  
  private Zm2o Za;
  
  private Zbkc Zw;
  
  private Zbkc ZN;
  
  private Zbqc Zk;
  
  private ButtonGroup Zu;
  
  private Zzdy ZF;
  
  private Zbqc Zc;
  
  private Zm99 Zq;
  
  private Zbqc Zf;
  
  private Zbqc Zy;
  
  private Zbqc Zz;
  
  private Zm99 ZU;
  
  private Zm99 ZE;
  
  private Zm99 Zl;
  
  private Zmyz Zo;
  
  private Zbqc ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbt2(Zzlr paramZzlr, Zbiw paramZbiw) {
    this.ZO = paramZzlr;
    this.ZG = paramZbiw;
    ZY();
    this.Zo.Za(45);
    this.ZB = new String[] { a(10797, -6068), a(10795, -25258) };
    this.ZA = new boolean[] { true, true };
    Zrau zrau = paramZzlr.ZD();
    this.ZL.add(zrau.ZA[0].ZC(), a(10799, -30764));
    this.Zk.add(zrau.ZA[1].ZC(), a(10791, 29476));
    ZK((ActionEvent)null);
    zrau.ZA[0].ZR();
    this.Zc.add(zrau.Zd.Zu(), a(10791, 29476));
    ZJ(this.Zl, Zlkk.COMPARER_MODIFIED);
    ZJ(this.ZE, Zlkk.COMPARER_DELETED);
    ZJ(this.ZU, Zlkk.COMPARER_ADDED);
  }
  
  private static void ZJ(Zm99 paramZm99, Zlkk paramZlkk) {
    paramZm99.Ze(Zlkk.COMPARER_FOREGROUND);
    paramZm99.ZO(paramZlkk);
  }
  
  private void ZY() {
    this.Zu = new ButtonGroup();
    this.Zo = new Zmyz();
    this.ZL = new Zbqc();
    this.Zf = new Zbqc();
    this.Zw = new Zbkc();
    this.Zk = new Zbqc();
    this.Zy = new Zbqc();
    this.ZN = new Zbkc();
    this.Zc = new Zbqc();
    this.Zz = new Zbqc();
    this.Zq = new Zm99();
    this.Zl = new Zm99();
    this.ZE = new Zm99();
    this.ZU = new Zm99();
    this.ZF = new Zzdy();
    this.Za = new Zm2o();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zo.setBorder((Border)null);
    this.Zo.setOrientation(0);
    this.Zo.setPreferredSize(new Dimension(1, 1));
    this.ZL.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    this.ZL.setLayout(new BorderLayout(0, 5));
    this.Zf.setLayout(new BorderLayout());
    this.Zw.Zx(a(10785, -31202));
    this.Zf.add(this.Zw, a(10789, -4463));
    this.ZL.add(this.Zf, a(10792, 10334));
    this.Zo.setTopComponent(this.ZL);
    this.Zk.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    this.Zk.setLayout(new BorderLayout(0, 5));
    this.Zy.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    this.Zy.setLayout(new BorderLayout());
    this.ZN.Zx(a(10787, -5188));
    this.Zy.add(this.ZN, a(10784, -31047));
    this.Zk.add(this.Zy, a(10806, -14243));
    this.Zo.setBottomComponent(this.Zk);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zo, gridBagConstraints);
    this.Zc.setLayout(new BorderLayout());
    this.Zz.setBorder(BorderFactory.createEmptyBorder(7, 10, 5, 0));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zz.setLayout(gridBagLayout2);
    this.Zq.setText(a(10796, 27729));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.Zz.add(this.Zq, gridBagConstraints);
    this.Zl.setText(a(10798, -14622));
    this.Zl.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.Zz.add(this.Zl, gridBagConstraints);
    this.ZE.setText(a(10793, -28437));
    this.ZE.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    this.Zz.add(this.ZE, gridBagConstraints);
    this.ZU.setText(a(10790, 11063));
    this.ZU.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    this.Zz.add(this.ZU, gridBagConstraints);
    this.ZF.setSelected(true);
    this.ZF.setText(a(10786, -18366));
    this.ZF.addActionListener(new Zbp3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    this.Zz.add(this.ZF, gridBagConstraints);
    this.Zc.add(this.Zz, a(10807, 3270));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    add(this.Zc, gridBagConstraints);
    this.Za.Zi(Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_COMPARING_COMPARISON_RESULTS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Za, gridBagConstraints);
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    boolean bool = this.ZF.isSelected();
    Zrau zrau = this.ZO.ZD();
    zrau.ZA[0].Zp(bool);
    zrau.ZA[1].Zp(bool);
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.ZG.Zu(), a(10794, -18764)) ? this.ZO.Zw(this) : this;
      case 1:
        return Zx6o.ZY(this.ZG.Zu(), a(10788, -1177)) ? null : this;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  public void Zc() {
    this.ZO.ZX().Zj().Z_((this.ZO.ZD()).Zd);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '@l¯¢ÖL¤.gÚ{1Ò'TÒ<¾ã=î@`M+6dÝ£«Ø$ :Fy±õ (ib+àJg³êè&+¦8âF@vQDIUÏUEÉ d²jÀ«Û\M££á\\n>lÌ¼á_­åÛÁÙ'¿D04~¶{`zÍ$ðæ Cq=Å0Ò»[y]OWx²µq)/>Ê×õ«Ïü^+êE=ìò-º¯\\n«§ÂIÎ¨Ù\\rg7¶åSÅB$«1á¾Î/-¬\\tåU5S(Xr'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
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
    //   37: goto -> 142
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
    //   68: ldc '»@£³<9Ò.'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbt2.a : [Ljava/lang/String;
    //   131: bipush #18
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbt2.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #62
    //   219: goto -> 244
    //   222: bipush #7
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #51
    //   234: goto -> 244
    //   237: bipush #87
    //   239: goto -> 244
    //   242: bipush #77
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2A26) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbt2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */