package burp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zx5d {
  private final Ze97 ZD;
  
  private final ExecutorService ZA;
  
  private final Zbx7 Zr;
  
  private final Zz98 Zv;
  
  private final Ze1a Ze;
  
  private final Ztwv ZF;
  
  private final AtomicBoolean ZV;
  
  private final Object Zc;
  
  private Zmfk ZQ;
  
  private static String[] Zb;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zx5d(int paramInt, Ze97 paramZe97, Zbx7 paramZbx7, Zz98 paramZz98, Ze1a paramZe1a, Ztwv paramZtwv, Zlli<Zt13> paramZlli) {
    this.ZD = paramZe97;
    this.ZA = Executors.newCachedThreadPool(new Zrdt(String.format(a(11443, -6739), new Object[] { Integer.valueOf(paramInt) })));
    this.Zr = paramZbx7;
    this.Zv = paramZz98;
    this.Ze = paramZe1a;
    this.ZF = paramZtwv;
    this.ZV = new AtomicBoolean();
    String[] arrayOfString = ZN();
    this.Zc = new Object();
    Zts2.Zr().Zz(paramZlli, Zt13.Zd, this::lambda$new$0);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZV(Zmfk paramZmfk) {
    this.ZQ = paramZmfk;
  }
  
  public void Zi(Zz9t paramZz9t) {
    paramZz9t.ZF(a(11442, 10155), Integer.valueOf(this.ZD.Zb()));
    paramZz9t.ZF(a(11445, 29055), Integer.valueOf(this.ZD.Zw()));
    paramZz9t.ZF(a(11441, 22605), Integer.valueOf(this.Zr.Zk()));
    String[] arrayOfString = ZN();
    paramZz9t.ZF(a(11440, 18731), Boolean.valueOf(this.ZV.get()));
    this.Zv.Zk(paramZz9t);
    if (Zbqc.Zwu() == null)
      ZJ(new String[4]); 
  }
  
  public void Zj() {
    this.Zr.Zh();
  }
  
  public int Zr() {
    return this.Zr.Zk();
  }
  
  public void Zh() {
    if (this.Ze.Zy())
      Zc(); 
    this.Zv.Zh();
  }
  
  public void Zo() {
    this.Zv.Zh();
  }
  
  public void Zt() {
    this.Zv.Zj();
  }
  
  public void ZD() {
    if (this.Ze.Zr())
      Zc(); 
  }
  
  public void ZK(Zlvy paramZlvy) {
    this.Zv.ZP(paramZlvy);
  }
  
  public void Zs() {
    this.Zv.Zm();
  }
  
  public boolean Zd() {
    return this.Ze.ZI();
  }
  
  public void Zw() {
    if (this.Ze.Zs())
      Zc(); 
  }
  
  public boolean Zn() {
    return this.Ze.Zr();
  }
  
  public void ZY(Ztwh paramZtwh) {
    this.Ze.ZX(paramZtwh);
  }
  
  public void ZK() {
    synchronized (this.Zc) {
      if (this.ZV.compareAndSet(false, true)) {
        this.ZD.Zc();
        this.ZF.Zx(this::lambda$close$1);
      } 
    } 
  }
  
  private void Zc() {
    synchronized (this.Zc) {
      if (!this.ZV.get()) {
        this.Zr.ZG();
        this.ZA.execute(this.ZQ.ZU());
      } 
    } 
  }
  
  private void lambda$close$1() {
    this.ZA.shutdown();
    try {
      this.ZA.awaitTermination(20L, TimeUnit.SECONDS);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
    this.ZA.shutdownNow();
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    ZK();
  }
  
  public static void ZJ(String[] paramArrayOfString) {
    Zb = paramArrayOfString;
  }
  
  public static String[] ZN() {
    return Zb;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¸â\\b«Í9I$¦*N´:ýÛkq¸On¢Cò!]B¶i×ÿÞKI}'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #14
    //   19: istore_1
    //   20: aconst_null
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic ZJ : ([Ljava/lang/String;)V
    //   26: bipush #37
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc '¿,µ\$}©7|Ð`!fRj¿oÔÕRl8þ³¹._"ï¦j¶Ü'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #17
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #71
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zx5d.b : [Ljava/lang/String;
    //   135: iconst_5
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zx5d.c : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #114
    //   218: goto -> 248
    //   221: bipush #118
    //   223: goto -> 248
    //   226: bipush #39
    //   228: goto -> 248
    //   231: bipush #16
    //   233: goto -> 248
    //   236: bipush #30
    //   238: goto -> 248
    //   241: bipush #46
    //   243: goto -> 248
    //   246: bipush #98
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2CB1) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */