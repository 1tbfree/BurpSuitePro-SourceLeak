package burp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmuh {
  private static final Pattern ZT;
  
  private final Map<Zlit, Zlsk> ZQ = new ConcurrentHashMap<>();
  
  private final Zr_4 ZA;
  
  private final Zkl6 ZZ;
  
  private final Zgb6 Zd;
  
  private final Ztdi Zw;
  
  private static String ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmuh(Zr_4 paramZr_4, Zkl6 paramZkl6, Zgb6 paramZgb6, Ztdi paramZtdi) {
    this.ZA = paramZr_4;
    this.ZZ = paramZkl6;
    this.Zd = paramZgb6;
    this.Zw = paramZtdi;
  }
  
  boolean Zh(Ztpx paramZtpx, Zs68 paramZs68, Ze3n paramZe3n, Zsoh paramZsoh, Zxs8 paramZxs8) {
    String str = Zb();
    for (Ztu8 ztu8 : paramZs68.Zd) {
      Zez3 zez3;
      if (ztu8.ZlD() != 0 || !a(-9523, 19352).equalsIgnoreCase(ztu8.ZlP().ZJ3()))
        continue; 
      Zs5n zs5n = ztu8.ZlP().ZIm(a(-9521, 29142));
      if (zs5n == null)
        continue; 
      String str1 = ztu8.ZlP().ZI2(a(-9524, 26764));
      if (str1 == null || str1.trim().isEmpty())
        continue; 
      Zlit zlit = Zry3.ZL(str1, paramZe3n.ZA().ZF(), this.ZZ.ZB());
      if (zlit == null)
        continue; 
      switch (ZT(zlit).ordinal()) {
        case 0:
          ZE((new Zen6(paramZtpx, this.ZA, paramZsoh, this.ZZ, this.Zw, this.Zd, true, paramZe3n.ZM())).ZE(zlit), paramZxs8, zs5n);
          return true;
        case 1:
        
        case 2:
          zez3 = (new Zen6(paramZtpx, this.ZA, paramZsoh, this.ZZ, this.Zw, this.Zd, true, paramZe3n.ZM())).ZE(zlit);
        default:
          Zuh.Zb(false, Zqf.Zk);
          break;
      } 
      continue;
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private Zlsk ZT(Zlit paramZlit) {
    return this.ZQ.getOrDefault(paramZlit, Zlsk.UNKNOWN);
  }
  
  private boolean Zo(Zez3 paramZez3, Zxs8 paramZxs8, Zs5n paramZs5n) {
    boolean bool = ZE(paramZez3, paramZxs8, paramZs5n);
    Zlsk zlsk = bool ? Zlsk.KNOWN_ANGULAR : Zlsk.KNOWN_NON_ANGULAR;
    this.ZQ.put(paramZez3.ZlL(), zlsk);
    return bool;
  }
  
  private boolean ZE(Zez3 paramZez3, Zxs8 paramZxs8, Zs5n paramZs5n) {
    Matcher matcher = ZT.matcher(paramZez3.ZoO().Zis());
    boolean bool = matcher.find();
    if (bool) {
      paramZxs8.ZI(Zkb.Zy(matcher.group(1)), paramZez3);
      paramZxs8.Zi(paramZs5n.ZQs(), paramZs5n.ZQc());
    } 
    return bool;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic ZX : (Ljava/lang/String;)V
    //   12: ldc '95¿.`ëiiJãÀ\\nfãêòe¯®'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: iconst_3
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #97
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 144
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 25
    //   70: ldc '|é5=èye>'
    //   72: dup
    //   73: astore_2
    //   74: invokevirtual length : ()I
    //   77: istore #4
    //   79: bipush #6
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #112
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 144
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zmuh.a : [Ljava/lang/String;
    //   134: iconst_4
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmuh.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #95
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #64
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #116
    //   234: goto -> 244
    //   237: bipush #55
    //   239: goto -> 244
    //   242: bipush #109
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 42, 0 -> 101
    //   300: sipush #-9522
    //   303: sipush #-26166
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic burp/Zmuh.ZT : Ljava/util/regex/Pattern;
    //   315: return
  }
  
  public static void ZX(String paramString) {
    ZM = paramString;
  }
  
  public static String Zb() {
    return ZM;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDACF) & 0xFFFF;
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
      char c = '´';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmuh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */