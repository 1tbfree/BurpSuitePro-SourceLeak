package burp;

import java.util.ArrayList;
import java.util.List;

public class Zken {
  private int Zr = 200;
  
  private String ZN = a(23433, 31757);
  
  private final List<String> Zp = new ArrayList<>();
  
  private String ZX;
  
  private static int[] Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static Zken Zg() {
    return (new Zken()).ZY(200).ZX(a(23427, -3230));
  }
  
  static Zken Zr() {
    return (new Zken()).ZY(400).ZX(a(23432, -5653));
  }
  
  static Zken ZG() {
    return (new Zken()).ZY(403).ZX(a(23426, 21349));
  }
  
  static Zken ZK() {
    return (new Zken()).ZY(404).ZX(a(23431, -25793));
  }
  
  private Zken ZT(String paramString) {
    this.Zp.add(paramString);
    return this;
  }
  
  Zken ZG(String paramString) {
    this.ZX = paramString;
    return ZT(a(23429, 9442));
  }
  
  Zken ZB(String paramString) {
    this.ZX = paramString;
    return ZT(a(23424, -27371));
  }
  
  Zken Za(String paramString) {
    this.ZX = paramString;
    return ZT(a(23435, 8647));
  }
  
  Zken ZJ(String paramString) {
    this.ZX = paramString;
    return ZT(a(23434, 31623));
  }
  
  Zken ZN(String paramString1, String paramString2) {
    this.ZX = paramString1;
    return ZT(a(23437, -4137) + a(23437, -4137));
  }
  
  Zken Zp(Zmdk paramZmdk) {
    a(23425, -32738);
    return ZT(a(23425, -32738) + a(23425, -32738));
  }
  
  Zken Zp(int paramInt) {
    return ZT(a(23439, 20709) + a(23439, 20709));
  }
  
  Zken ZL() {
    return ZT(a(23438, -1376));
  }
  
  private Zken ZY(int paramInt) {
    this.Zr = paramInt;
    return this;
  }
  
  private Zken ZX(String paramString) {
    this.ZN = paramString;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(1024);
    int[] arrayOfInt = Zd();
    stringBuilder.append(a(23436, -1573)).append(this.Zr).append(" ").append(this.ZN).append(a(23430, 839));
    for (String str : this.Zp) {
      stringBuilder.append(str);
      stringBuilder.append(a(23428, -4529));
      if (arrayOfInt == null)
        break; 
    } 
    if (this.ZX != null)
      stringBuilder.append(a(23453, 14047)).append(this.ZX.length()).append(a(23428, -4529)); 
    stringBuilder.append(a(23428, -4529));
    if (this.ZX != null)
      stringBuilder.append(this.ZX); 
    return stringBuilder.toString();
  }
  
  public static void Ze(int[] paramArrayOfint) {
    Zu = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return Zu;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_2
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Ze : ([I)V
    //   15: ldc 'wÔ¤*÷h:Ù\\tÌ5¯4,ç¾Õ£Ë(7oVCû,âR¦±E7^ó¶°öáà¬âm ¤o:p#>9ª\\nvÚ¾§T3ö1"ncwÇñL;É`f1þl;Ïª­Õ& ð(DßMÅ±8 s'¥,`°ä¨pÔKÉÿjC\\t³\\r+ÕaÊÕR¸¿@6\\tFÏÞùëWzïÖfùíÔùÍ@p°\\tõu\\bz!²Í·É±´±5cãè\\bÇq\\tûá%4tÊÖ¦bÖ"e&{©!_E';%K¥½qy/ý¢\\rSBMa¤|³»ÖiY\\f '
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #14
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #106
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '¤#£8ó,ËMWd(cDfítqOj;'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #9
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #87
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zken.a : [Ljava/lang/String;
    //   138: bipush #17
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zken.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #82
    //   222: goto -> 252
    //   225: bipush #13
    //   227: goto -> 252
    //   230: bipush #127
    //   232: goto -> 252
    //   235: bipush #15
    //   237: goto -> 252
    //   240: bipush #48
    //   242: goto -> 252
    //   245: bipush #74
    //   247: goto -> 252
    //   250: bipush #28
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5B8D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zken.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */