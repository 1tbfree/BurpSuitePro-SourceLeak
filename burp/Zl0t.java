package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;

public class Zl0t extends Zl04 implements Zlc8 {
  private final Zgb6 ZE;
  
  private final Zic ZT;
  
  private volatile boolean Zh;
  
  private Zz7r Za;
  
  private boolean Z_;
  
  private Ze01 ZQ;
  
  private Ze01 ZA;
  
  private Zzdy Zi;
  
  private Zzdy ZX;
  
  private Zl8w ZF;
  
  private Zm99 ZB;
  
  private Zbqc Zn;
  
  private Zbqc ZC;
  
  private Zexh Zr;
  
  private static int Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zl0t(Window paramWindow, Zgb6 paramZgb6, Zic paramZic) {
    this.ZE = paramZgb6;
    this.ZT = paramZic;
    Zg();
    this.ZB.setText(" ");
    this.ZF.setText(" ");
    this.ZF.ZH(Zlkk.BURP_ERROR);
    this.ZF.ZI(Zt00.BOLD_ITALIC_FONT);
    addWindowListener(new Zgb8(this));
    int i = Zl();
    Zmse.Zb(this.Zr, 50);
    pack();
    if (paramWindow != null) {
      Zt2m.Zy(this, paramWindow);
      if (i != 0) {
        Zbqc.Zr(new Zbqc[5]);
      } else {
        return;
      } 
    } 
    Zt2m.Zq(this, null);
  }
  
  void Zf(String paramString, Zz7r paramZz7r) {
    this.ZB.setText(a(29520, -21681));
    this.ZF.setText(paramString);
    this.ZQ.setEnabled(false);
    this.ZA.setText(a(29528, -10087));
    this.Za = paramZz7r;
    int i = Zl();
    this.Z_ = true;
    pack();
    if (Zbqc.Zwu() == null)
      Zv(++i); 
  }
  
  public boolean Zq(float paramFloat, String paramString) {
    // Byte code:
    //   0: invokestatic Zl : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield Zh : Z
    //   8: ifeq -> 31
    //   11: aload_0
    //   12: getfield ZB : Lburp/Zm99;
    //   15: sipush #29535
    //   18: sipush #26263
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual setText : (Ljava/lang/String;)V
    //   27: iload_3
    //   28: ifeq -> 77
    //   31: fload_1
    //   32: f2i
    //   33: istore #4
    //   35: aload_0
    //   36: getfield Zr : Lburp/Zexh;
    //   39: iload #4
    //   41: invokevirtual setValue : (I)V
    //   44: aload_0
    //   45: getfield ZB : Lburp/Zm99;
    //   48: iload #4
    //   50: sipush #29530
    //   53: sipush #17752
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: swap
    //   60: sipush #29521
    //   63: sipush #10456
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   74: invokevirtual setText : (Ljava/lang/String;)V
    //   77: aload_0
    //   78: getfield Zh : Z
    //   81: ifne -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: ireturn
  }
  
  public boolean ZS() {
    return this.Zh;
  }
  
  public void Zd(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  private void Za() {
    setVisible(false);
    dispose();
    if (this.Z_ && this.Za != null)
      this.Za.ZB(); 
  }
  
  private void Zg() {
    this.Zn = new Zbqc();
    this.ZB = new Zm99();
    this.Zr = new Zexh();
    this.ZQ = new Ze01();
    this.ZF = new Zl8w();
    this.ZC = new Zbqc();
    this.Zi = new Zzdy();
    this.ZX = new Zzdy();
    this.ZA = new Ze01();
    setDefaultCloseOperation(0);
    setTitle(a(29522, 22618));
    this.Zn.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.Zn.setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.Zn.add(this.ZB, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.Zn.add(this.Zr, gridBagConstraints);
    this.ZQ.setText(a(29532, 1400));
    this.ZQ.addActionListener(new Zrq4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    this.Zn.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zn.add(this.ZF, gridBagConstraints);
    this.ZC.setLayout(new GridLayout(2, 0, 0, 5));
    this.Zi.setSelected(true);
    this.Zi.setText(a(29531, 21238));
    this.Zi.addActionListener(new Zzpc(this));
    this.ZC.add(this.Zi);
    this.ZX.setSelected(true);
    this.ZX.setText(a(29533, -6354));
    this.ZX.addActionListener(new Zxlr(this));
    this.ZC.add(this.ZX);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    this.Zn.add(this.ZC, gridBagConstraints);
    this.ZA.setText(a(29534, 18125));
    this.ZA.addActionListener(new Zrzs(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    this.Zn.add(this.ZA, gridBagConstraints);
    getContentPane().add(this.Zn, a(29529, -10548));
    pack();
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    this.Zh = true;
    Za();
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    Za();
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.ZE.ZHW(this.Zi.isSelected());
    this.ZT.ZOf();
    this.ZX.setEnabled(this.Zi.isSelected());
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    this.ZE.ZHT(this.ZX.isSelected());
    this.ZT.ZOf();
  }
  
  public static void Zv(int paramInt) {
    Zc = paramInt;
  }
  
  public static int Zh() {
    return Zc;
  }
  
  public static int Zl() {
    int i = Zh();
    return (i == 0) ? 37 : 0;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ù"S-%¹8xDÌzþ[A8KfÓÀRçèÔKO8ìKE\\t=F³V Ú=F\}FKÆjG9\\bÅ\\n¤N¢]rA`z)º]À,ÐèúyH_!Õ$øù{Ö\\bÎ¯ãÈ0¬¼¿ÌU¥"çÐæg©õ½ú"8P|#²(ã¿pßñYÔØé'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: bipush #62
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zv : (I)V
    //   27: bipush #44
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'ä©P(ïw\\fÐêëÅNZÙ(Ò=Ê@ÊùÊFF\\rØ¢\\f'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #10
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #84
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zl0t.a : [Ljava/lang/String;
    //   136: bipush #11
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zl0t.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #20
    //   218: goto -> 248
    //   221: bipush #12
    //   223: goto -> 248
    //   226: bipush #114
    //   228: goto -> 248
    //   231: bipush #9
    //   233: goto -> 248
    //   236: bipush #23
    //   238: goto -> 248
    //   241: bipush #127
    //   243: goto -> 248
    //   246: bipush #97
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7358) & 0xFFFF;
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
      char c = 'û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */