package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ztc6 implements Iterable<Zxs9> {
  private final Zszw Zt;
  
  private final List<Zxs9> Zi;
  
  private static Zbqc[] Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Ztc6(Zszw paramZszw, List<Zxs9> paramList) {
    this.Zt = paramZszw;
    this.Zi = paramList;
  }
  
  public static Ztc6 ZD(Zszw paramZszw, List<Zxs9> paramList) {
    return new Ztc6(paramZszw, paramList);
  }
  
  Ztc6 ZZ(Zxs9 paramZxs9) {
    ArrayList<Zxs9> arrayList = new ArrayList<>(this.Zi);
    arrayList.add(paramZxs9);
    return new Ztc6(this.Zt, arrayList);
  }
  
  public int Zr() {
    return this.Zi.size();
  }
  
  public boolean ZB() {
    return this.Zi.isEmpty();
  }
  
  public Zszw Zy() {
    return this.Zt;
  }
  
  public Zxs9 ZQ(int paramInt) {
    return this.Zi.get(paramInt);
  }
  
  public Zxs9 ZV() {
    return this.Zi.getLast();
  }
  
  public boolean ZQ() {
    Zrp0 zrp0 = ZQ(0).ZXL();
    return (zrp0 instanceof Zs9a || zrp0.Znq() instanceof Zxjt);
  }
  
  public Iterator<Zxs9> iterator() {
    return this.Zi.iterator();
  }
  
  public Stream<Zxs9> Zu() {
    return this.Zi.stream();
  }
  
  public String ZY() {
    return a(-16658, -30148) + a(-16658, -30148);
  }
  
  public String toString() {
    if (this.Zi.isEmpty())
      return a(-16661, -13791); 
    StringBuilder stringBuilder = new StringBuilder(ZQ() ? a(-16659, -26691) : "");
    stringBuilder.append(this.Zi.stream().map(Zxs9::ZXI).collect(Collectors.joining(a(-16660, 24862))));
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Ztc6 ztc6 = (Ztc6)paramObject;
    return Objects.equals(this.Zi, ztc6.Zi);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zi });
  }
  
  public static void Zc(Zbqc[] paramArrayOfZbqc) {
    Zn = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZG() {
    return Zn;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'çï8Aõkæ':{4ût)ï-×\\fÛ3Ç40³çn+'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: invokestatic Zc : ([Lburp/Zbqc;)V
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #60
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 143
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
    //   70: ldc 'ÆE[\\n0\\nv¼1×«F'
    //   72: dup
    //   73: astore_2
    //   74: invokevirtual length : ()I
    //   77: istore #4
    //   79: iconst_4
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #67
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 143
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Ztc6.a : [Ljava/lang/String;
    //   133: iconst_5
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztc6.b : [Ljava/lang/String;
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
    //   212: bipush #110
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #127
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #63
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #76
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
    //   283: tableswitch default -> 42, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBEEF) & 0xFFFF;
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
      byte b1 = 77;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztc6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */