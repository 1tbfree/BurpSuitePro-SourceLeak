package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;
import net.portswigger.Zqe;

public class Zbm9 extends Zbv5 implements Zeq, Zeru {
  private final Zmwq ZF;
  
  private final Zbvi Zh;
  
  private final Zbws Zx;
  
  private final Zbup Zl;
  
  private Zm2o Zd;
  
  private Zl8w ZJ;
  
  private Zbkc Za;
  
  private Ze01 Zk;
  
  private Ze01 ZI;
  
  private Zbvt ZX;
  
  private JSeparator ZV;
  
  private Zm99 ZD;
  
  private Zbqc ZR;
  
  private Zgf8 Zq;
  
  private Zmyz Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbm9(Zmwq paramZmwq, Zlli<Zt1f> paramZlli, Zrn7 paramZrn7) {
    this.ZF = paramZmwq;
    this.ZF.Zi(this);
    Z_();
    this.Zq.Zv(new Zswp(this), 20);
    this.Zw.Za(90);
    this.Zx = new Zbws(paramZmwq.Zo());
    this.Zx.setName(a(25332, 10290));
    this.Zx.Zc(this);
    this.Zx.getSelectionModel().setSelectionMode(0);
    this.Zw.setLeftComponent(new Zbup(this.Zx));
    this.Zh = new Zbvi(paramZmwq, paramZrn7);
    this.Zh.setName(a(25329, -10679));
    this.Zl = new Zbup(this.Zh);
    this.Zw.setRightComponent(this.Zl);
    this.ZX.Zl(Zlkk.CUMULATIVE_PERFORMANCE_INDICATOR);
    paramZlli.ZE(Zt1f.Zc, this::lambda$new$1);
    paramZlli.ZE(Zt1f.Zb, this::lambda$new$3);
  }
  
  public void ZH() {
    ZK(0, 0);
  }
  
  public void Zh(Zscl paramZscl) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 14
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zbm9;Lburp/Zscl;)Ljava/lang/Runnable;
    //   11: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   14: return
  }
  
  public void ZU(String paramString, boolean paramBoolean) {
    this.ZD.setText(paramString);
    this.ZD.Ze(paramBoolean ? Zlkk.BURP_ERROR : Zlkk.FOREGROUND);
    this.ZD.ZE(paramBoolean ? Zt00.BOLD_ITALIC_FONT : Zt00.DEFAULT_FONT);
  }
  
  public void ZS() {
    int i = this.Zx.getSelectedRow();
    if (i != -1) {
      Zu(i);
      ZY();
    } 
  }
  
  public void Zj(boolean paramBoolean) {
    this.ZI.setEnabled(paramBoolean);
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    Zu(paramInt1);
    Zv();
  }
  
  private void Zv() {
    SwingUtilities.invokeLater(this::lambda$scrollToTop$5);
  }
  
  private void ZY() {
    SwingUtilities.invokeLater(this::lambda$scrollToBottom$6);
  }
  
  private void Zu(int paramInt) {
    this.Zx.getSelectionModel().setSelectionInterval(paramInt, paramInt);
    int i = this.Zx.convertRowIndexToModel(paramInt);
    Zscl zscl = this.ZF.Z_(i);
    if (zscl != null)
      Zh(zscl); 
    if (i != 0)
      Zm2.Zo(Zze0.EXTENDER_BAPP_STORE_ITEM_VIEWED); 
  }
  
  private void Z_() {
    this.ZV = new JSeparator();
    this.ZR = new Zbqc();
    this.ZX = new Zbvt();
    this.Za = new Zbkc();
    this.ZJ = new Zl8w();
    this.Zd = new Zm2o();
    this.Zq = new Zgf8();
    this.Zw = new Zmyz();
    this.ZI = new Ze01();
    this.ZD = new Zm99();
    this.Zk = new Ze01();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    add(this.ZV, gridBagConstraints);
    this.ZR.Zl(Zlkk.CUMULATIVE_PERFORMANCE_INDICATOR);
    this.ZR.setBorder(new Zr6s(new Insets(10, 10, 10, 10)));
    this.ZR.setLayout(new GridBagLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    this.ZR.add(this.ZX, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.ZR, gridBagConstraints);
    this.Za.Zx(a(25331, 3388));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.Za, gridBagConstraints);
    this.ZJ.setText(a(25333, 13234));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZJ, gridBagConstraints);
    this.Zd.Zi(Zk97.DESKTOP_TOOLS_EXTENDER_BAPP_STORE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 24;
    add(this.Zd, gridBagConstraints);
    this.Zq.setName(a(25328, -18250));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 13;
    add(this.Zq, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zw, gridBagConstraints);
    this.ZI.setText(a(25335, 23912));
    this.ZI.addActionListener(new Zr32(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 25;
    add(this.ZI, gridBagConstraints);
    this.ZD.setName(a(25334, -3854));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 26;
    add(this.ZD, gridBagConstraints);
    this.Zk.setText(a(25330, 21132));
    this.Zk.addActionListener(new Zsx9(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    add(this.Zk, gridBagConstraints);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    this.ZF.Zd();
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    this.ZF.ZK(this);
  }
  
  private void lambda$scrollToBottom$6() {
    JScrollBar jScrollBar = this.Zl.getVerticalScrollBar();
    jScrollBar.setValue(jScrollBar.getMaximum());
  }
  
  private void lambda$scrollToTop$5() {
    this.Zl.getVerticalScrollBar().setValue(0);
  }
  
  private void lambda$showBappDetails$4(Zscl paramZscl) {
    this.Zh.ZQ(paramZscl);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$2);
  }
  
  private void lambda$new$2(Zqe paramZqe) {
    this.ZX.Zo(paramZqe);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$0);
  }
  
  private void lambda$new$0(Zqe paramZqe) {
    this.ZX.ZU(paramZqe);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÙpO'g¶úÝßþÐ·P¡F8Ç4{0\\fMï«ç\\nÌËÉ×CÃ.µ%FG¶Ë\\fßqyebÞuÍC(z¢°¤Ìð¶ íV+êÀ±×ûwoØ]õÍ*þ`nÞõéBn5"\\r1Ã¡4°ºÎsMÍí7$¾qRZÏeÏ6\°P|µÁju8¦x/I(^@sòhõÝh­e#0³üi@UjèRUÿÚ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_1
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
    //   64: goto -> 23
    //   67: ldc '\\b?_áÚíËwÿÐ¾vF°HÅßÌÌhtDÃéÖ¯òSNc·tªN'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #12
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #67
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
    //   128: putstatic burp/Zbm9.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbm9.b : [Ljava/lang/String;
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
    //   212: bipush #51
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #120
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #21
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
    int i = (paramInt1 ^ 0x62F1) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */