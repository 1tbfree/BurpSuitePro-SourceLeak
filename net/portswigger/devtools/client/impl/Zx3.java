package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.browser.Zw;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zx3 implements Zw {
  private int Zd;
  
  private int ZH;
  
  private final Zn ZU;
  
  private static int ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zx3(Zn paramZn) {
    int i = ZG();
    this.ZU = Objects.<Zn>requireNonNull(paramZn);
    if (Zbqc.Zwu() == null)
      ZR(++i); 
  }
  
  public final void ZW(int paramInt1, int paramInt2) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokevirtual Zf : (II)Z
    //   6: ifeq -> 109
    //   9: aload_0
    //   10: iload_1
    //   11: putfield Zd : I
    //   14: aload_0
    //   15: iload_2
    //   16: putfield ZH : I
    //   19: aload_0
    //   20: getfield ZU : Lnet/portswigger/devtools/client/Zn;
    //   23: iload_1
    //   24: iload_2
    //   25: <illegal opcode> Zy : (II)Lnet/portswigger/devtools/client/Zs;
    //   30: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   33: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   36: pop
    //   37: goto -> 109
    //   40: invokestatic a : (Lnet/portswigger/browser/Ztk;)Lnet/portswigger/browser/Ztk;
    //   43: athrow
    //   44: astore_3
    //   45: aload_3
    //   46: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   49: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   52: new net/portswigger/browser/Ztj
    //   55: dup
    //   56: aload_3
    //   57: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   60: athrow
    //   61: astore_3
    //   62: aload_3
    //   63: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   66: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   69: new net/portswigger/browser/Zti
    //   72: dup
    //   73: aload_3
    //   74: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   77: athrow
    //   78: astore_3
    //   79: aload_3
    //   80: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   83: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   86: new net/portswigger/browser/Ztq
    //   89: dup
    //   90: aload_3
    //   91: invokespecial <init> : (Ljava/io/IOException;)V
    //   94: athrow
    //   95: astore_3
    //   96: aload_3
    //   97: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   100: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   103: invokestatic currentThread : ()Ljava/lang/Thread;
    //   106: invokevirtual interrupt : ()V
    //   109: return
    // Exception table:
    //   from	to	target	type
    //   0	40	40	net/portswigger/browser/Ztk
    //   19	37	44	net/portswigger/devtools/client/Zp
    //   19	37	61	net/portswigger/devtools/client/Z_
    //   19	37	78	net/portswigger/devtools/client/Zi
    //   19	37	95	java/lang/InterruptedException
  }
  
  public final void Zp() throws Ztk {
    try {
      this.ZU.Zz(Zk.ZA(Zx3::lambda$hideScrollbars$1));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  protected final boolean Zf(int paramInt1, int paramInt2) {
    return (paramInt1 != this.Zd || paramInt2 != this.ZH);
  }
  
  public String toString() {
    a(-14538, -11070);
    return a(-14538, -11070) + a(-14538, -11070) + this.Zd + a(-14537, -24397) + this.ZH;
  }
  
  private static CompletableFuture lambda$hideScrollbars$1(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getEmulation().setScrollbarsHidden(Boolean.valueOf(true));
  }
  
  private static CompletableFuture lambda$setDimensions$0(int paramInt1, int paramInt2, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getEmulation().setDeviceMetricsOverride(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Double.valueOf(1.0D), Boolean.valueOf(false));
  }
  
  public static void ZR(int paramInt) {
    ZW = paramInt;
  }
  
  public static int ZG() {
    return ZW;
  }
  
  public static int ZP() {
    int i = ZG();
    return (i == 0) ? 26 : 0;
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: bipush #46
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ÉÓïs)óþ¹¶)æµüc¸Ç·¾:µFªXê6nª nÆrO#Â-&à7½Ç#±¤ xû¶!Ngÿ­8dêRå'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #47
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZR : (I)V
    //   27: bipush #55
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
    //   74: putstatic net/portswigger/devtools/client/impl/Zx3.a : [Ljava/lang/String;
    //   77: iconst_2
    //   78: anewarray java/lang/String
    //   81: putstatic net/portswigger/devtools/client/impl/Zx3.b : [Ljava/lang/String;
    //   84: goto -> 230
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
    //   103: if_icmpgt -> 203
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 185, 0 -> 156, 1 -> 160, 2 -> 165, 3 -> 170, 4 -> 175, 5 -> 180
    //   156: iconst_4
    //   157: goto -> 187
    //   160: bipush #88
    //   162: goto -> 187
    //   165: bipush #31
    //   167: goto -> 187
    //   170: bipush #31
    //   172: goto -> 187
    //   175: bipush #6
    //   177: goto -> 187
    //   180: bipush #91
    //   182: goto -> 187
    //   185: bipush #126
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 110
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 106
    //   211: pop
    //   212: new java/lang/String
    //   215: dup_x1
    //   216: swap
    //   217: invokespecial <init> : ([C)V
    //   220: invokevirtual intern : ()Ljava/lang/String;
    //   223: swap
    //   224: pop
    //   225: swap
    //   226: pop
    //   227: goto -> 44
    //   230: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC736) & 0xFFFF;
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
      byte b1 = 109;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */