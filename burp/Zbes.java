package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import net.portswigger.Zm2;

public class Zbes extends Zbv5 implements Zky2, Zt3u {
  private final Zz0n Zg;
  
  private final Zt4u Zr;
  
  private final Zbw_<?> Zi;
  
  private final Zskh Zo;
  
  private final Zr1m Zz;
  
  private final Set<String> Zj;
  
  private final Zbws ZV;
  
  private Zl8w ZK;
  
  private Zmyw ZI;
  
  private Ze01 ZO;
  
  private Ze01 Zl;
  
  private Ze01 Zk;
  
  private Ze01 Zv;
  
  private Ze01 ZP;
  
  private Zbup Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbes(Zz0n paramZz0n, Zt4u paramZt4u, Zbw_<?> paramZbw_, Zskh paramZskh, Zt_4 paramZt_4, Zr1m paramZr1m) {
    this.Zg = paramZz0n;
    this.Zr = paramZt4u;
    this.Zi = paramZbw_;
    this.Zo = paramZskh;
    this.Zz = paramZr1m;
    this.Zj = Set.of(Zjd(), a(-8215, -6036), a(-8196, 20232), a(-8200, 26497), a(-8221, 2376), a(-8222, 15129), a(-8199, 28583), a(-8212, -21935), a(-8211, 23265));
    ZF();
    setName(a(-8194, 6916));
    this.ZV = new Zbws(paramZt_4);
    this.ZV.Zk(this);
    this.ZV.setName(a(-8216, 1909));
    this.Za.setViewportView(this.ZV);
  }
  
  public String Zjd() {
    return a(-8219, -32003);
  }
  
  public String ZjS() {
    return a(-8197, 30362);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_PROXY_LISTENERS, this.Zz, new String[] { a(-8218, -21068) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zj;
  }
  
  public void Zt2() {}
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zr7c.Zv();
    if (paramInt2 == 0) {
      this.Zi.Zz(this.ZV.convertRowIndexToModel(paramInt1), Zt2m.ZF(this));
      if (arrayOfInt != null) {
        if (paramInt2 == 6)
          this.Zi.ZM(this.ZV.convertRowIndexToModel(paramInt1)); 
        return;
      } 
      return;
    } 
    if (paramInt2 == 6)
      this.Zi.ZM(this.ZV.convertRowIndexToModel(paramInt1)); 
  }
  
  private void ZF() {
    this.ZO = new Ze01();
    this.Zl = new Ze01();
    this.ZP = new Ze01();
    this.ZI = new Zmyw();
    this.Za = new Zbup();
    this.ZK = new Zl8w();
    this.Zk = new Ze01();
    this.Zv = new Ze01();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZO.setText(a(-8209, -9929));
    this.ZO.setToolTipText(a(-8220, 28758));
    this.ZO.addActionListener(new Zb_k(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZO, gridBagConstraints);
    this.Zl.setText(a(-8193, -12476));
    this.Zl.setToolTipText(a(-8195, -26488));
    this.Zl.addActionListener(new Zgmv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zl, gridBagConstraints);
    this.ZP.setText(a(-8210, 9770));
    this.ZP.setToolTipText(a(-8217, -22459));
    this.ZP.addActionListener(new Zzoh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZP, gridBagConstraints);
    this.ZI.setLeftComponent(this.Za);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZI, gridBagConstraints);
    this.ZK.setText(a(-8198, -9963));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZK, gridBagConstraints);
    this.Zk.setText(a(-8213, 27630));
    this.Zk.addActionListener(new Zbzx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zk, gridBagConstraints);
    this.Zv.setText(a(-8214, 3461));
    this.Zv.addActionListener(new Zs9j(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    add(this.Zv, gridBagConstraints);
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    int i = this.ZV.getSelectedRow();
    if (i == -1)
      return; 
    if (!Zx6o.ZY(Zt2m.ZF(this), a(-8224, -18258)))
      return; 
    this.Zi.Zp(this.ZV.convertRowIndexToModel(i));
    if (i >= this.ZV.getRowCount())
      i--; 
    if (i >= 0 && i < this.ZV.getRowCount())
      this.ZV.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    int i = this.ZV.getSelectedRow();
    if (i == -1)
      return; 
    Zm2.Zo(Zze0.PROXY_OPTIONS_LISTENER_MODIFIED);
    this.Zi.ZE(this.ZV.convertRowIndexToModel(i), false);
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    Zm2.Zo(Zze0.PROXY_OPTIONS_LISTENER_ADDED);
    this.Zi.ZFf();
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    new Zr45(Zt2m.ZF(this), this.Zr, this.Zo, this.Zg.ZM());
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    boolean bool = Zx6o.ZY(Zt2m.ZF(this), a(-8223, -29308));
    if (!bool)
      return; 
    Zm2.ZC(Zrrh.PROXY_OPTIONS_CA_CERT_REGENERATED);
    Zbng.Zg();
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\r©nÃ8´´pR\\nCâÌ¢ÿh\\r=O¶§~!Å.ï?Wiqrò`º ñ¥Óu­+;¯%`Ú9c­ÏPÊ/Ñ¤uÑ®=:+áL4cq×,%ÄËoY\\tMn£²\\rXB@²¡CHd£s;³õd:y[¹Í\\bN/ÓÙß]Q0í¢ÌÈc-iðæ¹,@=OµîÈ/9p þ¿üÖê-òè7H\\rA½Wrwâ\\fS4§ÓÞë\\b8Hv>úIinÒxròÈruÚ-RÞ¾%Ð×« ò7Ç±Ù.ëÞ×#Î°£1hóÐºC@ÿªûUâ>Jä£xOÓýv­ h·æ¶TÄÆÿT(ÞñFN²oµ _2xõÆn¬3\\r\\n×qík#àtÜ`´S¯W`éÆ8!´zãV½åÎÀ¢;by.ª@As¤Þ]íìj0Çº5ÁwTz\\tFZ6¿Ï½Ä÷6ê­Wb,ïKÃï7 Ñë=äªB«(6½XAf¾²öô ¾Þ´¸ÇÖÚsõm=õìVw×ì\\bíqR'wÁ0ÓgL@= 8>q´¦§Ù@v7ä@¸Í­¨×ðÄØÖ9Gt\\f^tÒÃ)ZS*£¹®\\r/÷öxKõ6EcÄx[]ß5é®ûÊ\4x«\\fjºJ!2M¹¢tF­QQ,?/áôrÌÚãR½»³Ôâ2Ymx\\n.ïAoÜE£r+6hJ£\\th}z-Èîìõ\\r¯ÉøL =Êº[:áT±ê6nÛ{>ü©ÇPÍ©vítøêh ³w³ ÁN68wÈ¬¶»*Éÿ2Ï¨ÖJPÞbQeà©ø¾®èß/:/\\f¨è³õj}j F¡©Pr|Ö¨È\\r$=Ôã,è91ª¬)CT¦4ðú¬ð½mUFõTf4øµl-pK',é6= æáÞ_¤oÐ5?,"Q· ßÞþ-mG ó¡PºzÑ!âè·,^½Nvµfãw»ý¹Rä_'\\fK®®.Ä®O,s0ðEÒÄÂïàºP¿øgÃ­ÿ²TØuTs½~jNãÊÿäQÇïmî*hýÛHíi·ïvyçé²3µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #30
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #27
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
    //   68: ldc '¹ÉÄ}¤ªì½kúâ·}&²Óx$æÌ\\fI¿rêY )úÊ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #26
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #82
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
    //   129: putstatic burp/Zbes.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbes.b : [Ljava/lang/String;
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
    //   217: bipush #81
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #11
    //   229: goto -> 244
    //   232: bipush #76
    //   234: goto -> 244
    //   237: bipush #35
    //   239: goto -> 244
    //   242: bipush #94
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
    int i = (paramInt1 ^ 0xFFFFDFEB) & 0xFFFF;
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
      char c = '»';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */