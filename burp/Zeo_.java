package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zeo_ {
  private final Zei6 ZK;
  
  private final Zgb6 Zm;
  
  private final Zrgd ZJ;
  
  private final Zr1j ZL;
  
  private final Zkh7 Zz;
  
  private final Zgr_ Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zeo_(Zei6 paramZei6, Zgb6 paramZgb6, Zrgd paramZrgd, Zr1j paramZr1j, Zkh7 paramZkh7, Zgr_ paramZgr_) {
    this.ZK = paramZei6;
    this.Zm = paramZgb6;
    this.ZJ = paramZrgd;
    this.ZL = paramZr1j;
    this.Zz = paramZkh7;
    this.Zw = paramZgr_;
  }
  
  List<Component> ZM(Zz6e<?> paramZz6e) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: istore_2
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: aload_1
    //   13: ifnull -> 107
    //   16: getstatic burp/Zluh.ZT : [I
    //   19: aload_1
    //   20: invokeinterface Za : ()Lburp/Zgu3;
    //   25: invokevirtual ordinal : ()I
    //   28: iaload
    //   29: tableswitch default -> 107, 1 -> 56, 2 -> 82, 3 -> 107
    //   56: aload_3
    //   57: aload_0
    //   58: invokevirtual ZR : ()Lburp/Zztv;
    //   61: invokeinterface add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload_3
    //   68: aload_0
    //   69: invokevirtual Zn : ()Lburp/Zztv;
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: iload_2
    //   79: ifne -> 107
    //   82: aload_3
    //   83: aload_0
    //   84: invokevirtual ZG : ()Lburp/Zztv;
    //   87: invokeinterface add : (Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload_3
    //   94: aload_0
    //   95: invokevirtual ZR : ()Lburp/Zztv;
    //   98: invokeinterface add : (Ljava/lang/Object;)Z
    //   103: pop
    //   104: goto -> 107
    //   107: aload_3
    //   108: areturn
  }
  
  private Zztv ZR() {
    Zepe zepe1 = new Zepe(a(-2951, -9693));
    zepe1.addActionListener(this::lambda$buildDontInterceptRequestsMenu$0);
    Zepe zepe2 = new Zepe(a(-2959, 7158));
    zepe2.addActionListener(this::lambda$buildDontInterceptRequestsMenu$1);
    Zepe zepe3 = new Zepe(a(-2953, 26473));
    zepe3.addActionListener(this::lambda$buildDontInterceptRequestsMenu$2);
    Zepe zepe4 = new Zepe(a(-2970, -20250));
    zepe4.addActionListener(this::lambda$buildDontInterceptRequestsMenu$3);
    Zztv zztv = new Zztv(a(-2948, -22624));
    zztv.add(zepe1);
    zztv.add(zepe2);
    zztv.add(zepe3);
    zztv.add(zepe4);
    return zztv;
  }
  
  private Zztv ZG() {
    Zepe zepe1 = new Zepe(a(-2950, 27235));
    zepe1.addActionListener(this::lambda$buildDontInterceptResponsesMenu$4);
    Zepe zepe2 = new Zepe(a(-2946, -1455));
    zepe2.addActionListener(this::lambda$buildDontInterceptResponsesMenu$5);
    Zepe zepe3 = new Zepe(a(-2958, 17423));
    zepe3.addActionListener(this::lambda$buildDontInterceptResponsesMenu$6);
    Zepe zepe4 = new Zepe(a(-2956, 11353));
    zepe4.addActionListener(this::lambda$buildDontInterceptResponsesMenu$7);
    Zztv zztv = new Zztv(a(-2960, -21676));
    zztv.add(zepe1);
    zztv.add(zepe2);
    zztv.add(zepe3);
    zztv.add(zepe4);
    return zztv;
  }
  
  private Zztv Zn() {
    Zepe zepe = new Zepe(a(-2947, -16789));
    zepe.addActionListener(this::lambda$buildDoInterceptMenu$8);
    Zztv zztv = new Zztv(a(-2969, -31537));
    zztv.add(zepe);
    return zztv;
  }
  
  private void ZL() {
    try {
      this.Zw.ZC(true, true, 0, 0, 1, "^" + this.ZK.Zy().ZJ().ZJ1().replaceAll(a(-2945, -7436), a(-2952, 20349)) + "$");
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZZ() {
    try {
      InetAddress inetAddress = this.ZK.Zy().ZJ().Zx(this.Zm, this.ZJ, this.ZL, this.Zz);
      try {
        if (inetAddress != null)
          this.Zw.ZC(true, true, 0, 1, 1, inetAddress.getHostAddress()); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zc() {
    try {
      String str = this.ZK.Zy().Z_();
      try {
        if (str != null)
          this.Zw.ZC(true, true, 0, 5, 1, "^" + str + "$"); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zy() {
    try {
      String str = (this.ZK.Zy().ZS()).Zo.toString();
      int i = str.lastIndexOf('/');
      if (i == -1)
        i = 0; 
      this.Zw.ZC(true, true, 0, 4, 1, "^" + "^" + str.substring(0, ++i));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zm() {
    try {
      this.Zw.ZC(true, false, 0, 0, 1, "^" + this.ZK.Zy().ZJ().ZJ1().replaceAll(a(-2954, -13025), a(-2949, 23008)) + "$");
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zh() {
    try {
      InetAddress inetAddress = this.ZK.Zy().ZJ().Zx(this.Zm, this.ZJ, this.ZL, this.Zz);
      try {
        if (inetAddress != null)
          this.Zw.ZC(true, false, 0, 1, 1, inetAddress.getHostAddress()); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zl() {
    try {
      short s = (this.ZK.Zy().ZU()).Zb;
      try {
        if (s > 0)
          this.Zw.ZC(true, false, 0, 12, 1, "^" + s + "$"); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zx() {
    try {
      String str = Zgyj.ZZ((this.ZK.Zy().ZU()).ZP, a(-2955, -16580), false);
      if (str != null) {
        String str1 = str.substring(13).trim();
        this.Zw.ZC(true, false, 0, 13, 1, "^" + str1 + "$");
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZM() {
    this.ZK.Zy().Zd(true);
  }
  
  private void lambda$buildDoInterceptMenu$8(ActionEvent paramActionEvent) {
    ZM();
  }
  
  private void lambda$buildDontInterceptResponsesMenu$7(ActionEvent paramActionEvent) {
    Zx();
  }
  
  private void lambda$buildDontInterceptResponsesMenu$6(ActionEvent paramActionEvent) {
    Zl();
  }
  
  private void lambda$buildDontInterceptResponsesMenu$5(ActionEvent paramActionEvent) {
    Zh();
  }
  
  private void lambda$buildDontInterceptResponsesMenu$4(ActionEvent paramActionEvent) {
    Zm();
  }
  
  private void lambda$buildDontInterceptRequestsMenu$3(ActionEvent paramActionEvent) {
    Zy();
  }
  
  private void lambda$buildDontInterceptRequestsMenu$2(ActionEvent paramActionEvent) {
    Zc();
  }
  
  private void lambda$buildDontInterceptRequestsMenu$1(ActionEvent paramActionEvent) {
    ZZ();
  }
  
  private void lambda$buildDontInterceptRequestsMenu$0(ActionEvent paramActionEvent) {
    ZL();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\8>ññ°7Ãö®"bþVý\\nh,ö\\r=ã­IÌ\\bÐz$»çÕKZÌäy£4_Ö=ÂõÃÌ!Ì;¦¿¡{`wåJÑè @Ø4oÐFw¥]Ðæ¡Ú Þ<ÿ¦tIG{.:DêÍPÛ¨öH«ÊVgJß)1½èæ{= é.û¢i!í=ê§¼{iãû¬¢¯óú$f%é½ëâúb²ÕØïP@+1ÇÉãº¥à¸Ô]=!m¼cÆàL\\fÌõôÈw]ÄY\\n'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #48
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
    //   68: ldc 'Àqq°°²#/98NðLg^pnöLæÇiTaµ!8'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #63
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
    //   129: putstatic burp/Zeo_.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zeo_.b : [Ljava/lang/String;
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
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #110
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #96
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #64
    //   239: goto -> 244
    //   242: bipush #79
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
    int i = (paramInt1 ^ 0xFFFFF477) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */