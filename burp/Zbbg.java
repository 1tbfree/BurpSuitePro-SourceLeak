package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;

class Zbbg extends Zbb7 {
  private Zxgv Zr;
  
  private Zm99 Zu;
  
  private Zm99 Zx;
  
  private ButtonGroup Zc;
  
  private ButtonGroup Zl;
  
  private Zzdy ZV;
  
  private Zzdy ZR;
  
  private Zzdy ZE;
  
  private Zzdy Zy;
  
  private Zzdy ZC;
  
  private Zzdy Zk;
  
  private Zzdy ZI;
  
  private Zzdy ZX;
  
  private Zl8w ZP;
  
  private Zm99 Zt;
  
  private Zbqc ZA;
  
  private Zmg2 Zf;
  
  private Zmg2 ZH;
  
  private Zmg2 Za;
  
  private Zmg2 ZD;
  
  public Zgff ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbbg(Zbyw paramZbyw, Zr_4 paramZr_4) {
    super(paramZbyw, paramZr_4);
    this.Zg = this.Zr = paramZr_4.<Zgpi>ZH(new Zgv6(paramZbyw.ZP()));
    Zk();
  }
  
  private void Zk() {
    this.Zc = new ButtonGroup();
    this.Zl = new ButtonGroup();
    this.ZK = new Zgff();
    this.ZD = new Zmg2();
    this.Za = new Zmg2();
    this.ZH = new Zmg2();
    this.Zf = new Zmg2();
    this.Zt = new Zm99();
    this.ZA = new Zbqc();
    this.ZV = new Zzdy();
    this.ZE = new Zzdy();
    this.ZC = new Zzdy();
    this.ZI = new Zzdy();
    this.ZR = new Zzdy();
    this.Zy = new Zzdy();
    this.Zk = new Zzdy();
    this.ZX = new Zzdy();
    this.Zu = new Zm99();
    this.Zx = new Zm99();
    this.ZP = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZK.setColumns(20);
    this.ZK.addKeyListener(new Zb9s(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZK, gridBagConstraints);
    this.Zc.add(this.ZD);
    this.ZD.setText(a(-23607, -18043));
    this.ZD.addActionListener(new Zmsf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZD, gridBagConstraints);
    this.Zc.add(this.Za);
    this.Za.setSelected(true);
    this.Za.setText(a(-23611, -5182));
    this.Za.addActionListener(new Zke0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Za, gridBagConstraints);
    this.Zl.add(this.ZH);
    this.ZH.setText(a(-23614, 8773));
    this.ZH.addActionListener(new Zgxk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZH, gridBagConstraints);
    this.Zl.add(this.Zf);
    this.Zf.setSelected(true);
    this.Zf.setText(a(-23615, -8858));
    this.Zf.addActionListener(new Zrl6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zf, gridBagConstraints);
    this.Zt.setText(a(-23612, 22809));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    add(this.Zt, gridBagConstraints);
    this.ZA.setLayout(new GridLayout(2, 4, 5, 5));
    this.ZV.setSelected(true);
    this.ZV.setText(a(-23613, 27610));
    this.ZV.addActionListener(new Zzz_(this));
    this.ZA.add(this.ZV);
    this.ZE.setSelected(true);
    this.ZE.setText("3");
    this.ZE.addActionListener(new Zlsz(this));
    this.ZA.add(this.ZE);
    this.ZC.setSelected(true);
    this.ZC.setText("5");
    this.ZC.addActionListener(new Zbzd(this));
    this.ZA.add(this.ZC);
    this.ZI.setSelected(true);
    this.ZI.setText("7");
    this.ZI.addActionListener(new Zg5k(this));
    this.ZA.add(this.ZI);
    this.ZR.setSelected(true);
    this.ZR.setText("2");
    this.ZR.addActionListener(new Zmpg(this));
    this.ZA.add(this.ZR);
    this.Zy.setSelected(true);
    this.Zy.setText("4");
    this.Zy.addActionListener(new Zsjr(this));
    this.ZA.add(this.Zy);
    this.Zk.setSelected(true);
    this.Zk.setText("6");
    this.Zk.addActionListener(new Zlmq(this));
    this.ZA.add(this.Zk);
    this.ZX.setSelected(true);
    this.ZX.setText(a(-23605, -25135));
    this.ZX.addActionListener(new Ztl0(this));
    this.ZA.add(this.ZX);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZA, gridBagConstraints);
    this.Zu.setText(a(-23609, 486));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.Zx.setText(a(-23616, -6265));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zx, gridBagConstraints);
    this.ZP.setText(a(-23606, 5723));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZP, gridBagConstraints);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.Zr.Zlm((String)null);
    this.Zw.Z_(-1, false);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    Zz((KeyEvent)null);
  }
  
  private void Zz(KeyEvent paramKeyEvent) {
    this.ZD.setSelected(true);
    this.Zr.Zlm(this.ZK.getText());
    this.Zw.Z_(this.Zr.Zyv(), false);
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    this.Zr.ZcF(false);
    this.Zw.Z_(this.Zr.Zyv(), false);
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    this.Zr.ZcF(true);
    this.Zw.Z_(this.Zr.Zyv(), false);
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    this.Zr.ZdH((this.ZV.isSelected() ? 1 : 0) | (this.ZR.isSelected() ? 2 : 0) | (this.ZE.isSelected() ? 4 : 0) | (this.Zy.isSelected() ? 8 : 0) | (this.ZC.isSelected() ? 16 : 0) | (this.Zk.isSelected() ? 32 : 0) | (this.ZI.isSelected() ? 64 : 0) | (this.ZX.isSelected() ? 128 : 0));
    this.Zw.Z_(this.Zr.Zyv(), false);
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(-23608, -22427) + a(-23608, -22427), this.ZK.getText());
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface Zyi : ()Lburp/Zzvm;
    //   11: astore #5
    //   13: aload #5
    //   15: aload_0
    //   16: getfield Zg : Lburp/Ze9k;
    //   19: invokeinterface Zyi : ()Lburp/Zzvm;
    //   24: if_acmpne -> 31
    //   27: iconst_1
    //   28: goto -> 32
    //   31: iconst_0
    //   32: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   35: aload #5
    //   37: getfield id : B
    //   40: i2l
    //   41: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   44: aload_0
    //   45: aload_0
    //   46: aload_1
    //   47: checkcast burp/Zxgv
    //   50: dup_x1
    //   51: putfield Zr : Lburp/Zxgv;
    //   54: putfield Zg : Lburp/Ze9k;
    //   57: aload_0
    //   58: getfield ZK : Lburp/Zgff;
    //   61: aload_2
    //   62: iload_3
    //   63: sipush #-23610
    //   66: sipush #9366
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: swap
    //   73: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   78: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   83: invokevirtual setText : (Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield Zr : Lburp/Zxgv;
    //   90: invokeinterface ZKV : ()Ljava/lang/String;
    //   95: ifnonnull -> 111
    //   98: aload_0
    //   99: getfield Za : Lburp/Zmg2;
    //   102: iconst_1
    //   103: invokevirtual setSelected : (Z)V
    //   106: aload #4
    //   108: ifnonnull -> 119
    //   111: aload_0
    //   112: getfield ZD : Lburp/Zmg2;
    //   115: iconst_1
    //   116: invokevirtual setSelected : (Z)V
    //   119: aload_0
    //   120: getfield Zr : Lburp/Zxgv;
    //   123: invokeinterface ZKx : ()Z
    //   128: ifeq -> 144
    //   131: aload_0
    //   132: getfield Zf : Lburp/Zmg2;
    //   135: iconst_1
    //   136: invokevirtual setSelected : (Z)V
    //   139: aload #4
    //   141: ifnonnull -> 152
    //   144: aload_0
    //   145: getfield ZH : Lburp/Zmg2;
    //   148: iconst_1
    //   149: invokevirtual setSelected : (Z)V
    //   152: return
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'N°eË\\rÚ¶ÀÅì _=AÔ<*áì+ê$§¯«Õ] cjVpGvt¯FUBg¿ÆNÜ-°Ù¨½ÿ¦¨=+s½O}% f²>Þ1IàËÎ!-\\t¶dÆ§Æçå\®òªÀ«5ó§Ø\\rYýINÄ'î(à^ýéûªâqDÓ _øÃáÏàïÆ9ò\\t\CK\\fÈI\\bsx¬/\Q¤»á"R©×ö¡î;UúE¡¢Ì?òV½tlejÜm¸mÞnÜjÍ¾\\r@U-u¦ú¦ºûoâ\\nx,ºÎÚÌî\\r4Þ #E;:ÓG{»¼\\bÜ'Æ7\\t7g0VÌî%2ZL³±Rf¢D\\t¸M[)/Í\\nuÓC5öD¦ÝÇî}ÿ\\t>{e¹ÄBí¬¦/yGèö»JîVe÷§hº#ßÌ%¿n7'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #86
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
    //   68: ldc 'xMnÜÈ?­mNF¾!\\f,Ò'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #50
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
    //   129: putstatic burp/Zbbg.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbbg.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #53
    //   219: goto -> 244
    //   222: bipush #85
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #74
    //   234: goto -> 244
    //   237: bipush #13
    //   239: goto -> 244
    //   242: bipush #24
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
    int i = (paramInt1 ^ 0xFFFFA3C3) & 0xFFFF;
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
      char c = 'ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */