package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Collection;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbac extends Zbv5 implements Zt3u {
  private final Zz0n Zj;
  
  private final Zgb6 ZL;
  
  private final Zg1j ZH;
  
  private final Zr1m ZC;
  
  private final Set<String> ZJ;
  
  private Zl8w ZY;
  
  private Zl8w Za;
  
  private Zm99 Z_;
  
  private Zbqc Zq;
  
  private Ze01 Zf;
  
  private Zzdy ZT;
  
  private Zzdy Zk;
  
  private Ze01 ZE;
  
  private Ze01 Zv;
  
  private Zbqc ZG;
  
  private Zg85 ZS;
  
  private Zg85 Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbac(Zz0n paramZz0n, Zgb6 paramZgb6, Zg1j paramZg1j, Zr1m paramZr1m) {
    Zuh.Zv((paramZgb6 != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZg1j != null), Zqf.Zv, 2L);
    this.Zj = paramZz0n;
    this.ZL = paramZgb6;
    this.ZH = paramZg1j;
    this.ZC = paramZr1m;
    ZQ();
    this.ZJ = Set.of(Zjd(), a(-12310, -30959), a(-12305, 53), a(-12294, -15832), a(-12316, 16999));
    setName(a(-12290, 13829));
    this.Zx.setText(paramZg1j.ZY());
    this.Zx.Zt(false);
    ZT();
  }
  
  public String Zjd() {
    return a(-12313, -32279);
  }
  
  public String ZjS() {
    return a(-12319, 29019);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-12289, -16257), Zk97.DESKTOP_SETTINGS_SUITE_PERFORMANCE_FEEDBACK, this.ZC, new String[] { a(-12312, -19348), a(-12318, 5139) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZJ;
  }
  
  private void ZT() {
    ZR();
    ZE();
    Zd();
  }
  
  private void ZR() {
    this.Zk.setSelected(this.ZL.Zqj());
  }
  
  private void Zd() {
    this.ZT.setSelected(this.ZL.ZfQ());
  }
  
  private void ZE() {
    this.ZS.setText(this.ZL.Zfy());
  }
  
  private void Zq() {
    Window window = Zt2m.ZF(this);
    File file = Zs6n.Zc(Zg1m.PROJECT, window, 1, a(-12308, 17775));
    if (file == null)
      return; 
    if (!file.isDirectory()) {
      Zx6o.Zv(window, a(-12320, -8025), a(-12317, -17883));
      return;
    } 
    this.ZL.ZM(file.getAbsolutePath());
    ZE();
  }
  
  private void ZQ() {
    this.Zk = new Zzdy();
    this.ZY = new Zl8w();
    this.Zv = new Ze01();
    this.ZG = new Zbqc();
    this.Z_ = new Zm99();
    this.Zx = new Zg85();
    this.ZE = new Ze01();
    this.Zq = new Zbqc();
    this.ZT = new Zzdy();
    this.ZS = new Zg85();
    this.Zf = new Ze01();
    this.Za = new Zl8w();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zk.setText(a(-12311, 13023));
    this.Zk.addActionListener(new Zeec(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 15, 0, 0);
    add(this.Zk, gridBagConstraints);
    this.ZY.setText(a(-12306, 15881));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZY, gridBagConstraints);
    this.Zv.setText(a(-12315, 15240));
    this.Zv.setToolTipText("");
    this.Zv.addActionListener(new Zzns(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.insets = new Insets(10, 0, 10, 0);
    add(this.Zv, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZG.setLayout(gridBagLayout2);
    this.Z_.setText(a(-12314, 30677));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 2048;
    this.ZG.add(this.Z_, gridBagConstraints);
    this.Zx.setColumns(20);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 2048;
    this.ZG.add(this.Zx, gridBagConstraints);
    this.ZE.setText(a(-12309, 30917));
    this.ZE.setActionCommand(a(-12296, -19774));
    this.ZE.addActionListener(new Ztmk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    this.ZG.add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 9, 0);
    add(this.ZG, gridBagConstraints);
    this.Zq.setLayout(new GridBagLayout());
    this.ZT.setText(a(-12295, 29910));
    this.ZT.setToolTipText((String)null);
    this.ZT.setName("");
    this.ZT.addActionListener(new Zlnp(this));
    this.Zq.add(this.ZT, new GridBagConstraints());
    this.ZS.setEditable(false);
    this.ZS.setColumns(20);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.Zq.add(this.ZS, gridBagConstraints);
    this.Zf.setText(a(-12307, 27003));
    this.Zf.addActionListener(new Zefi(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    this.Zq.add(this.Zf, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 15, 0, 0);
    add(this.Zq, gridBagConstraints);
    this.Za.setText(a(-12293, -17060));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Za, gridBagConstraints);
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    this.ZL.ZHg(this.Zk.isSelected());
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.Zj.ZD().ZR(this.Zx.getText());
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    Zztm.Zi(Zt2m.ZF(this), this.ZH, this.Zj);
  }
  
  private void Zk(ActionEvent paramActionEvent) {
    this.ZL.ZHN(this.ZT.isSelected());
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    Zq();
  }
  
  public void Zt2() {
    ZT();
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ëçï\\bfÕ\Ø E6kµ"N(æó»0`<y¨=84éU\\r"-¨P<8@ °Ü5ÍTÒ ó!ïÉ)åóû.Q[(à> %7·÷rñ¦OË'wðêR\\b9Áh+d|uê)fçj+ÿ$\\thÀ¿Õ»ù>kM8«#ÑªãßRï)¹«éëãùs×6§Â¸^Y£&PCv$fÁ¯]bëÔ×Û³¡&$J~Ìk Ê3Í"m¢MëÁ»)ÔÕÓcSÿâ*3ÐÍ©3Tý^1²f þ\\\fÝ ¸+Þ¨D®5zÙ"Lg;·~±ù\\féeÛXïÜG¨ûÿfªÜÜ(âîÓ$ôÇ']÷}7=a./+NÛÒËöâe§LwcûOoWíi8¬Ãâ(\nå?î*Â/ÞdÕÒLtlºE¸\\rå»FóÙe8B³à.§ç_¢÷úZ[&o$ízÃ­?ôÊæ7-ßùumCk°òÜºñÅµjBx¬TGeî+eV×¡è_RSDÝ0j¯tæXüãîc)9üSËaDöö¡Jàõ\\bÜ*æ'~«FxA/Ø~lÚ¨3vT07©¦c\\bøzÆyÎ~þ#½ÞÁÙV¶èÉ1ÐÁE¡Üws9 8bkÚøØH¬i3:çDÙq~qñpNTÛ¬ó·>w[·laÁ@Bæy¬ª\\t¿Zµ*öÝnð×Ïá¿´Ãïxüñ"0°Û&6è`kÎ/N¦å?sK¨Ùðãxß¤ÇÃìxQO\\nS7h3¹\\tfYt\\rúæò[Æ¬3ü]¿¾®uâJC½Ft;ë¾â¼ü=o\\nïtíkZLµLíK¾©MáÉ²»ÉÕ9,û­õ"×®Sÿy(L¬lW1Ç ùöP³,qißy;Sûê«hðõþÇª8ZhË! m­d]VÁ¢ÎØuÝ $,`â}Úí#ðRû{gyZ»Ø,:QÏ¿æÇ\E²6ó{°_Î¨<Ã,¨ýEe¢+È±~[Üo¬§á!C¤ Õó_£knpöBx!åæÝDKð\\rùÕÂu<x²¢æ7k0¯L'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
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
    //   67: ldc ')ÏOñvÊyÐKæÈ7£ìK"nË5ÐT»ßßN.w3ºvÒ×­['
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #20
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #114
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
    //   128: putstatic burp/Zbac.a : [Ljava/lang/String;
    //   131: bipush #22
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbac.b : [Ljava/lang/String;
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
    //   212: bipush #96
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #86
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #35
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
    int i = (paramInt1 ^ 0xFFFFCFEB) & 0xFFFF;
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
      char c = 'Ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbac.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */