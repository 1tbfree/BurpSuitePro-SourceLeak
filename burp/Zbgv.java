package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.ButtonGroup;
import net.portswigger.Zvh;

class Zbgv extends Zbg2 {
  private final Zt4u Zo;
  
  private final Zr5w Zi;
  
  private Zm2o Zv;
  
  private ButtonGroup ZR;
  
  private Ze01 Zb;
  
  private Zm99 ZJ;
  
  private Zl8w Zg;
  
  private Zm9v Z_;
  
  private Zm99 Zn;
  
  private Zmg2 Zs;
  
  private Zmg2 ZC;
  
  public Zg85 ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbgv(Zt4u paramZt4u, Zr5w paramZr5w) {
    this.Zo = paramZt4u;
    this.Zi = paramZr5w;
    Zl();
    this.Z_.setVisible(false);
    this.ZB = new String[] { a(-21620, -6460), a(-21618, -20307) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
    if (!Zvh.ZU.ZE()) {
      this.Zs.setText(this.Zs.getText() + this.Zs.getText());
      this.Zs.setEnabled(false);
      this.ZC.setSelected(true);
    } 
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 121, 0 -> 32, 1 -> 41
    //   32: aload_0
    //   33: getfield Zi : Lburp/Zr5w;
    //   36: aload_0
    //   37: invokevirtual ZP : (Lburp/Zsic;)Lburp/Zsic;
    //   40: areturn
    //   41: iconst_0
    //   42: istore_3
    //   43: aload_0
    //   44: getfield ZC : Lburp/Zmg2;
    //   47: invokevirtual isSelected : ()Z
    //   50: ifeq -> 104
    //   53: aload_0
    //   54: getfield ZG : Lburp/Zg85;
    //   57: invokevirtual getText : ()Ljava/lang/String;
    //   60: invokestatic Zi : (Ljava/lang/String;)Z
    //   63: ifne -> 96
    //   66: aload_0
    //   67: getfield Z_ : Lburp/Zm9v;
    //   70: sipush #-21624
    //   73: sipush #19453
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual setText : (Ljava/lang/String;)V
    //   82: aload_0
    //   83: getfield Z_ : Lburp/Zm9v;
    //   86: iconst_1
    //   87: invokevirtual setVisible : (Z)V
    //   90: iconst_1
    //   91: istore_3
    //   92: aload_2
    //   93: ifnull -> 104
    //   96: aload_0
    //   97: getfield Z_ : Lburp/Zm9v;
    //   100: iconst_0
    //   101: invokevirtual setVisible : (Z)V
    //   104: iload_3
    //   105: ifeq -> 112
    //   108: aload_0
    //   109: goto -> 120
    //   112: aload_0
    //   113: getfield Zi : Lburp/Zr5w;
    //   116: aload_0
    //   117: invokevirtual Zu : (Lburp/Zsic;)Lburp/Zsic;
    //   120: areturn
    //   121: iconst_0
    //   122: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   125: iload_1
    //   126: i2l
    //   127: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   130: aload_0
    //   131: areturn
  }
  
  int ZY() {
    return this.ZC.isSelected() ? 0 : (this.Zs.isSelected() ? 1 : -1);
  }
  
  String ZG() {
    return this.ZG.getText();
  }
  
  private void Zl() {
    this.ZR = new ButtonGroup();
    this.Zg = new Zl8w();
    this.Zv = new Zm2o();
    this.ZJ = new Zm99();
    this.ZG = new Zg85();
    this.Z_ = new Zm9v();
    this.Zb = new Ze01();
    this.Zs = new Zmg2();
    this.ZC = new Zmg2();
    this.Zn = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zg.setText(a(-21621, 21837));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zg, gridBagConstraints);
    this.Zv.Zi(Zk97.DESKTOP_SETTINGS_NETWORK_TLS_CLIENT_TLS_CERTIFICATES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zv, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZJ, gridBagConstraints);
    this.ZG.setEditable(false);
    this.ZG.setColumns(20);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.Z_.setText(a(-21622, 17039));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.Z_, gridBagConstraints);
    this.Zb.setText(a(-21626, -8158));
    this.Zb.addActionListener(new Zrxh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    add(this.Zb, gridBagConstraints);
    this.ZR.add(this.Zs);
    this.Zs.setSelected(true);
    this.Zs.setText(a(-21619, 16414));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.ZR.add(this.ZC);
    this.ZC.setText(a(-21625, 9935));
    this.ZC.addActionListener(new Zzau(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZC, gridBagConstraints);
    this.Zn.setText(a(-21628, 6143));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    add(this.Zn, gridBagConstraints);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    this.ZC.setSelected(true);
    File file = Zs6n.Zp(Zg1m.CONFIG, this.Zo, this, 0, a(-21617, -25501));
    if (file != null) {
      this.ZG.setText(file.getPath());
      this.Z_.setVisible(false);
    } 
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    if (this.ZG.getText().isEmpty())
      ZX(paramActionEvent); 
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¯­ä!ÁÙº=J8oÀ¼F.n¬J2çöüpr;ëÐú:´Þ_ÍDÓC0 ±½u«ý däª\\bHÌk0!ÛAÕK8&ÙÍÒT*R#ZnÍ»¦ÅàFKgC=ÊB¹"7I-=Ë5´SAS´ÎåïXjîÚµ*jÑ¢ä0Ó,Â³Óm±Ø´Â¿@1=ÅÒ»ì¤xNF/Ø§¼#J¾µ6W´Ï n³é4«Ãuá±6<~Ö±Pr%Ú¶þUÊûUö©nMÅs_èÿíÀL¬¨Ú.C]ÞxÙ¹=}be­ÁûÊ HsëßKpnl÷70¤4QºÇ_v5OÇ&<v·Hn _¡$ÑF1nV%µÑå'ÐGVÅC 3ÜòtË£Ìaf}\\ræ²$ååï°cÿ<U6>·b.ÅµÚÞE:)k\\rWë2êbÏóÄÇw¬søã"F´¢<×ïl@±¶Þ\%'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #112
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '\ïÎÍd;ÐS¿ÙÆ%¹áËmVd®¸'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #24
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #113
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
    //   128: putstatic burp/Zbgv.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbgv.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #37
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAB8E) & 0xFFFF;
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
      char c = 'Î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */