package net.portswigger.browser;

import burp.Zbqc;
import burp.Zgrn;
import burp.Zlli;
import burp.Zxr8;
import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zje implements Zt {
  private final Duration Zz;
  
  private final boolean Zi;
  
  private Zc Zx;
  
  private List<Zgrn> ZA;
  
  private final AtomicBoolean ZQ = new AtomicBoolean();
  
  private static String Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zje(Duration paramDuration, boolean paramBoolean) {
    this.Zz = Objects.<Duration>requireNonNull(paramDuration);
    this.Zi = paramBoolean;
  }
  
  public static Zje ZR(Duration paramDuration) {
    return new Zje(paramDuration, true);
  }
  
  public static Zje Zr(Duration paramDuration) {
    return new Zje(paramDuration, false);
  }
  
  public void ZQ(Zjw paramZjw) {
    String str = ZU();
    try {
      if (this.ZQ.getAndSet(true))
        throw new IllegalStateException(a(-2216, 25890)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Ztw ztw = paramZjw.ZG().ZB();
    Zlli<Zcq> zlli = paramZjw.Zk();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.Zx = this.Zi ? Zc.Zs(ztw, this.Zz) : Zc.Zq(ztw, this.Zz);
      this.ZA = List.of(zlli.ZE(Zcq.Zg, this::lambda$initialise$0), zlli.ZE(Zcq.ZR, this::lambda$initialise$1), zlli.ZE(Zcq.ZL, this::lambda$initialise$3));
      if (str == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void ZA(Zjw paramZjw) throws InterruptedException {
    Objects.requireNonNull(this.Zx, a(-2215, 22266));
    this.Zx.ZW();
  }
  
  public void Zs() {
    Objects.requireNonNull(this.ZA, a(-2214, 20124));
    this.ZA.forEach(Zgrn::ZZ);
  }
  
  private void lambda$initialise$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$initialise$2);
  }
  
  private void lambda$initialise$2(Zdo paramZdo) {
    this.Zx.ZX(paramZdo.ZZz(), paramZdo.ZZV());
  }
  
  private void lambda$initialise$1(Zxr8 paramZxr8) {
    Objects.requireNonNull(this.Zx);
    paramZxr8.ZP(this.Zx::Zl);
  }
  
  private void lambda$initialise$0(Zxr8 paramZxr8) {
    Objects.requireNonNull(this.Zx);
    paramZxr8.ZP(this.Zx::ZN);
  }
  
  public static void Zp(String paramString) {
    Zo = paramString;
  }
  
  public static String ZU() {
    return Zo;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '÷ÿ&|x#äÔX ¶z»Éj¯n/Âöáï:YÁ%9MíÓ!ÿF`\\bè*`SÉ!_âéÙj_hIw´i(6-³ÔÍ£÷Á¯v¤M^Óø 5£d\'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: ldc 'LVTaMb'
    //   19: bipush #45
    //   21: istore_1
    //   22: invokestatic Zp : (Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #91
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: aload #5
    //   74: putstatic net/portswigger/browser/Zje.a : [Ljava/lang/String;
    //   77: iconst_3
    //   78: anewarray java/lang/String
    //   81: putstatic net/portswigger/browser/Zje.b : [Ljava/lang/String;
    //   84: goto -> 231
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 204
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #106
    //   158: goto -> 188
    //   161: bipush #25
    //   163: goto -> 188
    //   166: bipush #18
    //   168: goto -> 188
    //   171: bipush #127
    //   173: goto -> 188
    //   176: bipush #86
    //   178: goto -> 188
    //   181: bipush #94
    //   183: goto -> 188
    //   186: bipush #87
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 110
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 106
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 44
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF758) & 0xFFFF;
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
      byte b1 = 34;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zje.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */