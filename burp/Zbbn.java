package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;

public class Zbbn extends Zbv5 implements Ztow {
  private final Zr_4 ZV;
  
  private Zzdy ZT;
  
  private Zl8w ZR;
  
  private Zbkk Zi;
  
  private Zbqc Zg;
  
  private Zzgo Zn;
  
  private Zbkc Zm;
  
  private static boolean ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbbn(Zr_4 paramZr_4) {
    this.ZV = paramZr_4;
    ZC();
    this.Zi.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_OPTIONS_HTTP2, this, a(25487, 32098));
    boolean bool = Zn();
    this.Zn.setName(a(25481, 28838));
    this.ZT.setName(a(25485, 18545));
    ZNH();
    if (Zbqc.Zwu() == null)
      ZQ(!bool); 
  }
  
  private void Zc() {
    this.ZT.setEnabled(this.Zn.isSelected());
  }
  
  private void ZH() {
    Zc();
  }
  
  public void ZNH() {
    this.Zn.setSelected(false);
    this.ZT.setSelected(true);
    Zc();
  }
  
  public void Zr(Zsh8 paramZsh8) {
    Zsh0 zsh0 = paramZsh8.ZPY();
    if (zsh0 != null) {
      this.Zn.setSelected(zsh0.Zjo());
      this.ZT.setSelected(zsh0.Zj7());
      Zc();
    } 
  }
  
  public void ZX(Zsh8 paramZsh8) {
    Zsh0 zsh0 = paramZsh8.ZPY();
    if (zsh0 == null) {
      zsh0 = this.ZV.<Zsh0>ZH(new Zsgi());
      paramZsh8.Zv(zsh0);
    } 
    zsh0.Zre(this.Zn.isSelected());
    zsh0.Zrj(this.ZT.isSelected());
  }
  
  public void ZP(Zb_j paramZb_j) {}
  
  public void Zs(Zb_j paramZb_j) {}
  
  private void ZC() {
    this.Zi = new Zbkk();
    this.Zm = new Zbkc();
    this.ZR = new Zl8w();
    this.Zg = new Zbqc();
    this.Zn = new Zzgo();
    this.ZT = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.anchor = 23;
    add(this.Zi, gridBagConstraints);
    this.Zm.Zx(a(25486, 10281));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zm, gridBagConstraints);
    this.ZR.setColumns(20);
    this.ZR.setRows(1);
    this.ZR.setText(a(25482, 20061));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    add(this.ZR, gridBagConstraints);
    this.Zg.Zl(Zlkk.TABLE_BACKGROUND);
    this.Zg.setBorder(BorderFactory.createCompoundBorder(new Zr43(Zlkk.KEYLINE), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    this.Zg.setLayout(new BorderLayout());
    this.Zn.setText(a(25484, 29640));
    this.Zn.setIconTextGap(10);
    this.Zn.addActionListener(new Zei2(this));
    this.Zg.add(this.Zn, a(25483, -3420));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zg, gridBagConstraints);
    this.ZT.setText(a(25480, -7716));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 15, 0, 0);
    add(this.ZT, gridBagConstraints);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    ZH();
  }
  
  public static void ZQ(boolean paramBoolean) {
    ZE = paramBoolean;
  }
  
  public static boolean Zn() {
    return ZE;
  }
  
  public static boolean Zw() {
    boolean bool = Zn();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZQ : (Z)V
    //   13: ldc 'C:ÒI'×Cûc1ÌVàë'!êò¿÷#Ý¸ví=¬ÖÞ±u5óÝiìcG\\rUÉÇ,@xòUÕÂD?òIË8NS¿m2ÒÃh ÅD!¹¼UsÁ<óvÔÇ/áÔ\\rÜäv¸fÍuK:q§9`·`VÚÄ4#,úî±S+×£pïn¹Ö\\b3¤@\\réàLûªÀ#bZÔ¡@»ë.Á»²\\r>á! =EÍB3ÅÒP)kj#ÍêLe £cÚÞÕ\\fÙîÿCµÃÑ\\ft»I]\v^»'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: sipush #132
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #91
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'ÅÁÜüß d3ÁçJÄ\\rWw«¬ÊÂÏÿCjZÕ¸,ÑØZ'_S;Hè#W)È@;¥²ÌP÷Ìt#M¡5Êà¡=ÂÙ!»vrGë'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #41
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #54
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zbbn.a : [Ljava/lang/String;
    //   137: bipush #8
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zbbn.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #98
    //   218: goto -> 248
    //   221: bipush #50
    //   223: goto -> 248
    //   226: bipush #92
    //   228: goto -> 248
    //   231: bipush #69
    //   233: goto -> 248
    //   236: bipush #123
    //   238: goto -> 248
    //   241: bipush #42
    //   243: goto -> 248
    //   246: bipush #107
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x638A) & 0xFFFF;
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
      byte b1 = 29;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */