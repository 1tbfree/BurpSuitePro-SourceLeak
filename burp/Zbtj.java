package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbtj extends Zbg2 implements Ztep {
  private final Zz9c ZY;
  
  private final Zt90 Zb;
  
  private String Zm;
  
  private Ze01 Zs;
  
  private Zbup ZX;
  
  private Zbkc ZM;
  
  private Zl86 Zf;
  
  private Zl8w Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtj(Zz9c paramZz9c, Zt90 paramZt90, Zkce paramZkce) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zr : ()Ljava/lang/String;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield ZY : Lburp/Zz9c;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield Zb : Lburp/Zt90;
    //   17: astore #4
    //   19: aload_0
    //   20: sipush #-24642
    //   23: bipush #8
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: invokevirtual setName : (Ljava/lang/String;)V
    //   31: invokestatic ZG : ()Z
    //   34: ifeq -> 52
    //   37: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   40: aload_3
    //   41: invokevirtual ZD : ()Ljava/lang/String;
    //   44: invokevirtual println : (Ljava/lang/String;)V
    //   47: aload #4
    //   49: ifnonnull -> 71
    //   52: aload_0
    //   53: invokevirtual ZY : ()V
    //   56: aload_0
    //   57: invokevirtual Zq : ()V
    //   60: aload_0
    //   61: getfield Z_ : Lburp/Zl8w;
    //   64: aload_3
    //   65: invokevirtual ZD : ()Ljava/lang/String;
    //   68: invokevirtual setText : (Ljava/lang/String;)V
    //   71: aload_0
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: dup
    //   77: iconst_0
    //   78: sipush #-24641
    //   81: sipush #31379
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: aastore
    //   88: dup
    //   89: iconst_1
    //   90: sipush #-24655
    //   93: bipush #93
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: aastore
    //   99: putfield ZB : [Ljava/lang/String;
    //   102: aload_0
    //   103: iconst_2
    //   104: newarray boolean
    //   106: dup
    //   107: iconst_0
    //   108: iconst_1
    //   109: bastore
    //   110: dup
    //   111: iconst_1
    //   112: iconst_1
    //   113: bastore
    //   114: putfield ZA : [Z
    //   117: aload_0
    //   118: iconst_1
    //   119: putfield Zh : I
    //   122: return
  }
  
  private void Zq() {
    this.Zf.setName(a(-24645, -7709));
  }
  
  public Zsic Zn(int paramInt) {
    String str;
    if (this.ZY.ZM())
      return null; 
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.ZY.ZU(), a(-24656, -22443)) ? null : this;
      case 1:
        str = Zb12.ZG() ? this.Zm : this.Zf.getText();
        if (str.isEmpty())
          return this; 
        switch (Zr0j.ZL[this.Zb.Zi(str, this.ZY.ZL()).ordinal()]) {
          case 1:
            return new Zbtw(this.ZY, this.Zb, Zkce.SUCCESS.ZD());
          case 2:
            return new Zbtl(this.ZY, this.Zb, Zkce.ONLINE_ACTIVATE);
          case 3:
            return new Zbtj(this.ZY, this.Zb, Zkce.ENTER_LICENSE_SUPPLIED_LICENSE_WRONG_BUILD);
          case 4:
            return new Zbtj(this.ZY, this.Zb, Zkce.ENTER_LICENSE_OLD_LICENSE_EXPIRED);
        } 
        return new Zbtj(this.ZY, this.Zb, Zkce.ENTER_LICENSE_SUPPLIED_LICENSE_STRING_INVALID);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  public void Zc() {
    this.ZY.Zf();
  }
  
  private void ZY() {
    this.ZX = new Zbup();
    this.Zf = new Zl86();
    this.Zs = new Ze01();
    this.ZM = new Zbkc();
    this.Z_ = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zf.setColumns(20);
    this.Zf.setLineWrap(true);
    this.Zf.setRows(5);
    this.ZX.setViewportView(this.Zf);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.Zs.setText(a(-24647, 16846));
    this.Zs.addActionListener(new Zrci(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.ZM.Zx(a(-24648, -26823));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Z_, gridBagConstraints);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    String str = Ztph.Zr();
    File file = Zs6n.Zp(Zg1m.LICENSING, Zmjm.ZW, this, 0, a(-24646, -11527));
    if (file != null)
      try {
        this.Zf.setText("");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String str1;
        while ((str1 = bufferedReader.readLine()) != null) {
          stringBuilder.append(str1);
          if (str == null)
            break; 
        } 
        bufferedReader.close();
        this.Zf.setText(stringBuilder.toString());
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      }  
  }
  
  public Zsic Zp(String paramString) {
    this.Zm = paramString;
    return Zn(1);
  }
  
  public boolean Zu() {
    return true;
  }
  
  public List<Component> ZA() {
    Zm9b zm9b = (new Zgw6(a(-24643, -7932))).ZW(a(-24644, -8951)).Zr();
    return Collections.singletonList(zm9b);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\CÒ3#îÍþ¡Amqã)³*ªTVÎø2æoÅQgIî³¬7+ùú!\\t£«#9(îúMùÐ·è ø\\r~øûÏJZ£×,¯M=Èþ ÅOs*AÉi¸V6òtq°å¨ì5¾S=&ÜâýÄ³ïãØÓÁI3ûXQnùl$vÕKÕ­ÓïìüO=c`5\\fØR\\rûßIà=,Èø}%âÙdqè,2Ücq %ùË^}zVïÕ3TëX6y^i/¥Y§§,d+ ûE>Zñ\:Î c'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #24
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
    //   68: ldc 'ZgüHÍÖUýkuåÓ>åî*$fõlo]Dð4rP#N'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #51
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
    //   128: putstatic burp/Zbtj.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbtj.b : [Ljava/lang/String;
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
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #14
    //   219: goto -> 244
    //   222: bipush #36
    //   224: goto -> 244
    //   227: bipush #100
    //   229: goto -> 244
    //   232: bipush #70
    //   234: goto -> 244
    //   237: bipush #83
    //   239: goto -> 244
    //   242: bipush #116
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
    int i = (paramInt1 ^ 0xFFFF9FB9) & 0xFFFF;
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
      byte b1 = 102;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */