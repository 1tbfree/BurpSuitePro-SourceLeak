package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbbh extends Zbv5 implements Zt3u {
  private final Zgdq Zx;
  
  private final Zbjj Zc;
  
  private final Collection<String> Za;
  
  private final Ztnd ZS;
  
  private String[] ZU;
  
  private Ze01 Zn;
  
  private Ze01 Zi;
  
  private Box.Filler Zf;
  
  private ButtonGroup Zd;
  
  private Zmg2 Zu;
  
  private Zmg2 ZR;
  
  private Zbup Zo;
  
  public Zg85 Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbbh(Zmjj paramZmjj) {
    this.Zx = paramZmjj;
    this.Zc = paramZmjj;
    this.Za = Set.of(Zjd(), a(-21717, 31565), a(-21727, 16573), a(-21719, 26882));
    ZP();
    this.ZS = new Ztnd(this);
    String str = Zbb2.Zd();
    Zt2();
    Zbws zbws = new Zbws(this.ZS);
    this.Zo.setViewportView(zbws);
    setName(a(-21720, -6034));
    if (Zbqc.Zwu() == null)
      Zbb2.Zc("rV9dTb"); 
  }
  
  public String Zjd() {
    return a(-21723, -30964);
  }
  
  public String ZjS() {
    return a(-21718, 25581);
  }
  
  public Component ZjY() {
    Zbkk zbkk = new Zbkk();
    zbkk.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_PAYLOADS_TYPES_PREDEFINED_PAYLOAD_LISTS, this.Zx, Zjd().toLowerCase(Locale.ENGLISH));
    return zbkk;
  }
  
  public Collection<String> ZjD() {
    return this.Za;
  }
  
  public void Zt2() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zc : Lburp/Zbjj;
    //   4: invokeinterface Za : ()Ljava/lang/String;
    //   9: astore_2
    //   10: invokestatic Zd : ()Ljava/lang/String;
    //   13: aload_0
    //   14: getfield Zk : Lburp/Zg85;
    //   17: aload_2
    //   18: invokevirtual setText : (Ljava/lang/String;)V
    //   21: astore_1
    //   22: aload_2
    //   23: ifnonnull -> 53
    //   26: aload_0
    //   27: getfield Zu : Lburp/Zmg2;
    //   30: iconst_1
    //   31: invokevirtual setSelected : (Z)V
    //   34: aload_0
    //   35: invokestatic Zl : ()[Ljava/lang/String;
    //   38: putfield ZU : [Ljava/lang/String;
    //   41: aload_0
    //   42: getfield Zi : Lburp/Ze01;
    //   45: iconst_0
    //   46: invokevirtual setEnabled : (Z)V
    //   49: aload_1
    //   50: ifnonnull -> 76
    //   53: aload_0
    //   54: getfield ZR : Lburp/Zmg2;
    //   57: iconst_1
    //   58: invokevirtual setSelected : (Z)V
    //   61: aload_0
    //   62: invokestatic ZU : ()[Ljava/lang/String;
    //   65: putfield ZU : [Ljava/lang/String;
    //   68: aload_0
    //   69: getfield Zi : Lburp/Ze01;
    //   72: iconst_1
    //   73: invokevirtual setEnabled : (Z)V
    //   76: aload_0
    //   77: getfield ZS : Lburp/Ztnd;
    //   80: invokevirtual fireTableDataChanged : ()V
    //   83: return
  }
  
  private void ZP() {
    this.Zd = new ButtonGroup();
    this.Zu = new Zmg2();
    this.ZR = new Zmg2();
    this.Zn = new Ze01();
    this.Zk = new Zg85();
    this.Zo = new Zbup();
    this.Zi = new Ze01();
    this.Zf = new Box.Filler(new Dimension(20, 0), new Dimension(20, 0), new Dimension(20, 32767));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zd.add(this.Zu);
    this.Zu.setText(a(-21724, 10902));
    this.Zu.addActionListener(new Zrd(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zu, gridBagConstraints);
    this.Zd.add(this.ZR);
    this.ZR.setText(a(-21714, -2164));
    this.ZR.addActionListener(new Zl17(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZR, gridBagConstraints);
    this.Zn.setText(a(-21716, -6624));
    this.Zn.setToolTipText(a(-21726, 11048));
    this.Zn.addActionListener(new Zbsm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zn, gridBagConstraints);
    this.Zk.setEditable(false);
    this.Zk.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zo, gridBagConstraints);
    this.Zi.setText(a(-21715, 5064));
    this.Zi.setToolTipText(a(-21725, -19540));
    this.Zi.addActionListener(new Zm71(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    add(this.Zf, gridBagConstraints);
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    this.Zc.ZE();
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    File file = new File(this.Zk.getText());
    if (!file.exists()) {
      Z_((ActionEvent)null);
      return;
    } 
    this.Zc.Zy(file.getAbsolutePath());
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    File file = Zs6n.Zc(Zg1m.CONFIG, this, 0, a(-21713, -7434));
    if (file != null && file.isDirectory())
      this.Zc.Zy(file.getPath()); 
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    try {
      if (!Zx6o.ZY(this, a(-21722, 22526)))
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      File file = new File(this.Zk.getText());
      try {
        if (!Zk5p.Zd(file))
          throw new Exception(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Zx6o.Zf(this, "", a(-21728, -8304));
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zx6o.Zv(this, "", a(-21705, 21708));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      Zx6o.Zv(this, "", a(-21721, 6453));
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'þ1uÏHRÉ\\nñdØyÓuªÈºU:ºöXÈÛ¬Ú«ñ¯F\\t-Tøµí¤ßÓ^ÅdÙ4'§¨ÀIºj å%§pETØVYSnPZ:u=ÆÄ#ChyìUçéh\\rò|=;­éßqÏ \\f]ÐF²­?En£ë<>éIÆ»º\\fnºJÄúi½*ûÐbonxv]Ï#T5\¬ð\\bþeæµÖ<ÉëË¹ßr&1f ÆÕ>O»XLþLÐ,ÌÎ÷ÚHöob³ÈËâà¢nQÃäÂë.2ÏëRßÎFgTÿ]¼7¶(lrû»eBv./ùx"`w±9Ä£-:îFü`ý5Y4ï Á©iã[öÐºD\\rmÁ+w7¥Kå¿\\fÐ³ØÕâf6*8§£¹M}¸F@¶!»O3\\bU'5"ï@yµ*!gÎÍG!IÒs²Ý`À´6M<dX]§ýAåk LÊ3.0\\b%ÓxóúýNÙ_]²§MKuek|ÏÐTK\Ù¬\\bÌeÇæ}ÏR}ÆËëÂ1V7q%ã:PÓ§ïYñOÈ\viq¶À\\ni\\r#ãÉÉ_ÏS1BûX¿'{}ÔäÓ9!1¯êöÏ-s©üÕò¯pLn[ ¼üø_dS ó¤ÒHÏ.iPt^Ø~A´°X¬|ãz'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #39
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #95
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
    //   68: ldc '\\rÊýªýæù)®0Dá5Ì?ùÒ®Úôì¡¡úM´'·º!Êt¾oèÆxÅìeÓÍ9Ñp,DÅ­NjQw``µ²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #38
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #32
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
    //   129: putstatic burp/Zbbh.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbbh.b : [Ljava/lang/String;
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
    //   212: bipush #120
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #87
    //   229: goto -> 244
    //   232: bipush #26
    //   234: goto -> 244
    //   237: bipush #94
    //   239: goto -> 244
    //   242: bipush #102
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
    int i = (paramInt1 ^ 0xFFFFAB27) & 0xFFFF;
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
      byte b1 = 65;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */