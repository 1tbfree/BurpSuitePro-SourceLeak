package burp;

import java.awt.Window;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zlo;

class Zz9c implements Zzxq {
  private Zbiw ZT;
  
  private final Zxei ZQ;
  
  private final Zxc8 ZM;
  
  private volatile boolean ZX;
  
  private boolean ZS;
  
  private Zkvo ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zz9c(Window paramWindow, Zxei paramZxei, Zzxi paramZzxi, Zt90 paramZt90, int paramInt, Zkce paramZkce) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zr : ()Ljava/lang/String;
    //   7: aload_0
    //   8: aload_2
    //   9: putfield ZQ : Lburp/Zxei;
    //   12: aconst_null
    //   13: astore #8
    //   15: astore #7
    //   17: aload_3
    //   18: invokevirtual Zm : ()Z
    //   21: ifne -> 34
    //   24: aload #4
    //   26: invokeinterface Zc : ()Z
    //   31: ifeq -> 80
    //   34: iload #5
    //   36: iconst_1
    //   37: if_icmpne -> 57
    //   40: new burp/Zbtj
    //   43: dup
    //   44: aload_0
    //   45: aload #4
    //   47: aload #6
    //   49: invokespecial <init> : (Lburp/Zz9c;Lburp/Zt90;Lburp/Zkce;)V
    //   52: astore #8
    //   54: goto -> 107
    //   57: iload #5
    //   59: iconst_2
    //   60: if_icmpne -> 107
    //   63: new burp/Zbtl
    //   66: dup
    //   67: aload_0
    //   68: aload #4
    //   70: aload #6
    //   72: invokespecial <init> : (Lburp/Zz9c;Lburp/Zt90;Lburp/Zkce;)V
    //   75: astore #8
    //   77: goto -> 107
    //   80: new burp/Zbtf
    //   83: dup
    //   84: aload_0
    //   85: aload_2
    //   86: invokeinterface Zn : ()Lburp/Zb_j;
    //   91: aload #4
    //   93: iload #5
    //   95: aload #6
    //   97: invokespecial <init> : (Lburp/Zz9c;Lburp/Zb_j;Lburp/Zt90;ILburp/Zkce;)V
    //   100: astore #8
    //   102: aload_0
    //   103: iconst_1
    //   104: putfield ZS : Z
    //   107: aload_0
    //   108: invokestatic ZG : ()Z
    //   111: ifeq -> 120
    //   114: getstatic burp/Zxc8.HEADLESS_WIZARD : Lburp/Zxc8;
    //   117: goto -> 123
    //   120: getstatic burp/Zxc8.WIZARD : Lburp/Zxc8;
    //   123: putfield ZM : Lburp/Zxc8;
    //   126: aload #4
    //   128: aload_0
    //   129: aload_0
    //   130: getfield ZM : Lburp/Zxc8;
    //   133: invokeinterface Zf : (Lburp/Zzxq;Lburp/Zxc8;)V
    //   138: aload_0
    //   139: getfield ZX : Z
    //   142: ifeq -> 146
    //   145: return
    //   146: invokestatic ZG : ()Z
    //   149: ifeq -> 186
    //   152: aload #8
    //   154: astore #9
    //   156: aload_2
    //   157: invokeinterface Zi : ()Lburp/Zz0n;
    //   162: invokeinterface Zj : ()Lburp/Ztwv;
    //   167: aload_0
    //   168: aload #9
    //   170: <illegal opcode> run : (Lburp/Zz9c;Lburp/Ztep;)Ljava/lang/Runnable;
    //   175: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   180: pop
    //   181: aload #7
    //   183: ifnonnull -> 213
    //   186: aload_0
    //   187: new burp/Zl0a
    //   190: dup
    //   191: aload_1
    //   192: sipush #-12605
    //   195: sipush #-19281
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: bipush #75
    //   203: bipush #25
    //   205: aload #8
    //   207: invokespecial <init> : (Ljava/awt/Window;Ljava/lang/String;IILburp/Zsic;)V
    //   210: putfield ZT : Lburp/Zbiw;
    //   213: return
  }
  
  boolean ZM() {
    return this.ZX;
  }
  
  void Zf() {
    this.ZX = true;
    synchronized (this) {
      notifyAll();
    } 
  }
  
  Zl04 ZU() {
    return this.ZT.Zu();
  }
  
  Zxei ZD() {
    return this.ZQ;
  }
  
  Zxc8 ZL() {
    return this.ZM;
  }
  
  void Zn(Zsic paramZsic) {
    this.ZT.Zf(paramZsic);
  }
  
  Zg33 Zl() {
    if (!this.ZX)
      synchronized (this) {
        try {
          if (!this.ZX)
            wait(); 
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
        } 
      }  
    return new Zg33(this.ZA, this.ZS);
  }
  
  public void Zv(Ztph paramZtph) {
    String str = Ztph.Zr();
    if (paramZtph.ZB == Zlo.LICENSE_ACTIVATED) {
      this.ZA = paramZtph.Zd;
      if (Zb12.ZG() && paramZtph.ZG != Zxc8.HEADLESS_WIZARD)
        System.out.println(a(-12606, -10611)); 
      if (paramZtph.ZG != Zxc8.WIZARD && paramZtph.ZG != Zxc8.HEADLESS_WIZARD) {
        if (Zb12.ZG()) {
          Zf();
          if (str == null) {
            this.ZT.ZS();
            return;
          } 
          return;
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    this.ZT.ZS();
  }
  
  private void lambda$new$0(Ztep paramZtep) {
    this.ZT = new Zlc1(paramZtep);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÖEô6ï7´2=üí6Dú*£#5KõVòüØÀá7r$@H}µ§?´Ì°5v 5¹ <Ô}¼I¹v}àÓ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #23
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #34
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zz9c.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zz9c.b : [Ljava/lang/String;
    //   79: goto -> 225
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 198
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 171, 5 -> 176
    //   152: bipush #15
    //   154: goto -> 182
    //   157: bipush #99
    //   159: goto -> 182
    //   162: bipush #96
    //   164: goto -> 182
    //   167: iconst_4
    //   168: goto -> 182
    //   171: bipush #88
    //   173: goto -> 182
    //   176: bipush #99
    //   178: goto -> 182
    //   181: iconst_3
    //   182: ixor
    //   183: ixor
    //   184: i2c
    //   185: castore
    //   186: iinc #6, 1
    //   189: dup
    //   190: ifne -> 198
    //   193: dup2
    //   194: dup_x1
    //   195: goto -> 105
    //   198: dup2_x1
    //   199: pop2
    //   200: dup_x2
    //   201: iload #6
    //   203: if_icmpgt -> 101
    //   206: pop
    //   207: new java/lang/String
    //   210: dup_x1
    //   211: swap
    //   212: invokespecial <init> : ([C)V
    //   215: invokevirtual intern : ()Ljava/lang/String;
    //   218: swap
    //   219: pop
    //   220: swap
    //   221: pop
    //   222: goto -> 39
    //   225: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCEC3) & 0xFFFF;
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
      byte b1 = 14;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */