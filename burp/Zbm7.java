package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Collection;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbm7 extends Zbv5 implements Zedo, Zt3u {
  private final Zt4u Zn;
  
  private final Zrv ZN;
  
  private final Zr1m ZA;
  
  private final Collection<String> Zt;
  
  private Zm99 ZD;
  
  private Zm99 ZY;
  
  private Ze01 Zw;
  
  private Ze01 ZV;
  
  private Zm9v ZJ;
  
  private Zm9v ZQ;
  
  public Zg85 ZK;
  
  private Zg85 Zi;
  
  private static Zbqc[] Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbm7(Zt4u paramZt4u, Zrv paramZrv, Zr1m paramZr1m) {
    this.Zn = paramZt4u;
    this.ZN = paramZrv;
    this.ZA = paramZr1m;
    this.Zt = Set.of(Zjd(), a(-29939, 31851), a(-29944, 19369), a(-29928, 13026), a(-29943, -13233), a(-29946, -12565));
    ZE();
    setName(a(-29948, 14334));
  }
  
  public String Zjd() {
    return a(-29950, 20295);
  }
  
  public String ZjS() {
    return a(-29949, 5576);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd(), Zk97.DESKTOP_TOOLS_EXTENDER_PYTHON_ENVIRONMENT, this.ZA, new String[] { a(-29952, -14527) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zt;
  }
  
  public void Zt2() {
    this.ZK.setText(this.ZN.ZG());
    this.Zi.setText(this.ZN.ZW());
    this.ZJ.setVisible(false);
    this.ZQ.setVisible(false);
  }
  
  private void ZE() {
    this.ZK = new Zg85();
    this.ZJ = new Zm9v();
    this.Zw = new Ze01();
    this.ZD = new Zm99();
    this.ZY = new Zm99();
    this.Zi = new Zg85();
    this.ZV = new Ze01();
    this.ZQ = new Zm9v();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZK.setColumns(35);
    this.ZK.setEditable(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZK, gridBagConstraints);
    this.ZJ.setText(a(-29942, 20861));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZJ, gridBagConstraints);
    this.Zw.setText(a(-29940, 2916));
    this.Zw.setName(a(-29947, -32682));
    this.Zw.addActionListener(new Zbf2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zw, gridBagConstraints);
    this.ZD.setText(a(-29951, 6585));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZD, gridBagConstraints);
    this.ZY.setText(a(-29937, 1898));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZY, gridBagConstraints);
    this.Zi.setColumns(35);
    this.Zi.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    add(this.Zi, gridBagConstraints);
    this.ZV.setText(a(-29927, -4733));
    this.ZV.addActionListener(new Ztah(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 18;
    add(this.ZV, gridBagConstraints);
    this.ZQ.setText(a(-29945, 829));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZQ, gridBagConstraints);
  }
  
  private void Zk(ActionEvent paramActionEvent) {
    try {
      File file = Zs6n.Zp(Zg1m.EXTENSIONS, this.Zn, this, 0, a(-29941, -476));
      if (file == null)
        return; 
      String str = file.getPath();
      try {
        this.ZK.setText(str);
        if (!file.exists())
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZJ.setVisible(false);
      this.ZN.ZV(str);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.ZJ.setVisible(true);
    } 
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    try {
      File file = Zs6n.Zc(Zg1m.EXTENSIONS, this, 0, a(-29938, -31974));
      if (file == null)
        return; 
      String str = file.getPath();
      try {
        this.Zi.setText(str);
        if (file.exists()) {
          try {
            if (!file.isDirectory())
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          throw new Exception();
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZQ.setVisible(false);
      this.ZN.Zh(str);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.ZQ.setVisible(true);
    } 
  }
  
  public static void ZR(Zbqc[] paramArrayOfZbqc) {
    Zg = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZY() {
    return Zg;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_5
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'vAÕè°5MÄ`X&:iÆHî_¿QÝ:ïèGÇlùè,MÓ_=< nZu h\\nàÅ='Ên¨çö?Ñ(yc4²úÕRw¸{)oöqµè¸ØãUvð¬Tdq»,ÄÙn|3äkÂÕ3|hÐ°Lbj5ø=LÉÈýøÑaü&+)è&Î\\nò`%­ä¤ùÇ/MÞæ?²¡y:ùµ»ôHNØPGÀ·sÆâ8'¢ì\\bp´0QÆB=Ñ9÷]Ø'(ãjXrdê1X£í'_ÀÊDnÑ"ÏBü!u¸äµLðÇä\lY\çýß'Xlä°1ìßbÛ\\tÈÕd¿Võ\\n5«±ì§\\n ç fÒ*-\,«Æñ °m¬ }ªdì\\bE«eaÝ4½HE¸G_U^?9².E 3íÇ\\r-D}"p¡{ðe/b"ºGÚÈû^Ðc~!5ª[!vÜßâôþEVèdÊ;Í%ÄÐôh®\\f¯(\\r`XÔ +{ZÚ90½5: ©=àcó©î\\fafÕ¾ÙÂQ cL;ì(0ãð­±þÞÂÙÍº=õñ¨TðÛ1ïXV²á·4+­ôØÙ²x#PI"«YwKoÑüÞeÄÊ"ÎfÉLb6gbÚÖ¢ìÚsuË'/+±vÞ×t@TóF['
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #9
    //   24: istore_1
    //   25: invokestatic ZR : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #71
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc '%ß<Ô/9¹YþÈíX£ª!DÜ%¼'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #9
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #112
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zbm7.a : [Ljava/lang/String;
    //   139: bipush #18
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zbm7.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #83
    //   222: goto -> 252
    //   225: bipush #27
    //   227: goto -> 252
    //   230: bipush #12
    //   232: goto -> 252
    //   235: bipush #11
    //   237: goto -> 252
    //   240: bipush #106
    //   242: goto -> 252
    //   245: bipush #125
    //   247: goto -> 252
    //   250: bipush #93
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8B08) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */