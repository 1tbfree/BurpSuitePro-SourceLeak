package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Ztwe implements Zkrr {
  private static final List<Zrtz> ZN;
  
  private final Ze3n ZK;
  
  private static Zbqc[] ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztwe(Ze3n paramZe3n) {
    this.ZK = paramZe3n;
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_GraphQlEndpointDiscovered;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: invokestatic Zk : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: getstatic burp/Zkh8.ZG : Ljava/util/List;
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore #5
    //   15: aload #5
    //   17: invokeinterface hasNext : ()Z
    //   22: ifeq -> 137
    //   25: aload #5
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast java/lang/String
    //   35: astore #6
    //   37: new java/util/LinkedList
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #7
    //   46: getstatic burp/Ztwe.ZN : Ljava/util/List;
    //   49: invokeinterface iterator : ()Ljava/util/Iterator;
    //   54: astore #8
    //   56: aload #8
    //   58: invokeinterface hasNext : ()Z
    //   63: ifeq -> 123
    //   66: aload #8
    //   68: invokeinterface next : ()Ljava/lang/Object;
    //   73: checkcast burp/Zrtz
    //   76: astore #9
    //   78: aload_0
    //   79: getfield ZK : Lburp/Ze3n;
    //   82: aload #9
    //   84: aload #6
    //   86: <illegal opcode> Zv : (Ljava/lang/String;)Lburp/Zrec;
    //   91: invokestatic Zr : (Lburp/Ze3n;Lburp/Zrtz;Lburp/Zrec;)Lburp/Zg3d;
    //   94: astore #10
    //   96: aload #10
    //   98: invokeinterface Ze : ()Lburp/Zb6q;
    //   103: invokestatic Zb : (Lburp/Zb6q;)Ljava/util/Optional;
    //   106: aload #7
    //   108: aload #10
    //   110: <illegal opcode> accept : (Ljava/util/List;Lburp/Zg3d;)Ljava/util/function/Consumer;
    //   115: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   118: aload #4
    //   120: ifnonnull -> 56
    //   123: aload_0
    //   124: aload #6
    //   126: aload #7
    //   128: aload_3
    //   129: invokevirtual Zr : (Ljava/lang/String;Ljava/util/List;Lburp/Zz4_;)V
    //   132: aload #4
    //   134: ifnonnull -> 15
    //   137: return
  }
  
  private void Zr(String paramString, List<Zg3d> paramList, Zz4_ paramZz4_) {
    if (!paramList.isEmpty()) {
      List<Zvow> list = paramList.stream().map(this::lambda$reportSuccessfulRequestsForPath$4).toList();
      paramZz4_.Zz(Zr_5.Zq(Zzu2.GRAPHQL_ENDPOINT_DISCOVERED, this.ZK.Za(), (byte)3, Zkb.Zy(paramString), list));
    } 
  }
  
  public String toString() {
    return Zp().name();
  }
  
  private Zvow lambda$reportSuccessfulRequestsForPath$4(Zg3d paramZg3d) {
    return this.ZK.ZI().ZC(paramZg3d.ZL()).Zo(paramZg3d.Ze()).ZK(Zkh8.ZG(paramZg3d.ZL()));
  }
  
  private static void lambda$doCheck$3(List<Zg3d> paramList, Zg3d paramZg3d, Byte paramByte) {
    paramList.add(paramZg3d);
  }
  
  private static Zefx lambda$doCheck$2(String paramString, Zefx paramZefx) {
    return paramZefx.ZU(paramString);
  }
  
  private static Zefx lambda$static$1(Zefx paramZefx) {
    return paramZefx.ZY(a(6362, -32208));
  }
  
  private static Zefx lambda$static$0(Zefx paramZefx) {
    return paramZefx.Zx(a(6367, -27277), a(6364, -9376));
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'Óu±¡Å­(E9W^ðÓÓ6\\fE-\\nª#Ë¢%G^f.¨Iû>tYc&VÞ ÉÏ¨~¬ÍAÅ\\fËt)onµ¶Ø¦Î-Ó'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic ZH : ([Lburp/Zbqc;)V
    //   25: bipush #17
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #113
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 149
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
    //   75: ldc '9ÿ4@Æ@<õRÈÎWBÏ¹\\næ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: iconst_4
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #95
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
    //   135: putstatic burp/Ztwe.a : [Ljava/lang/String;
    //   138: bipush #9
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Ztwe.b : [Ljava/lang/String;
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
    //   165: if_icmpgt -> 267
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #101
    //   222: goto -> 251
    //   225: bipush #118
    //   227: goto -> 251
    //   230: iconst_2
    //   231: goto -> 251
    //   234: bipush #55
    //   236: goto -> 251
    //   239: bipush #92
    //   241: goto -> 251
    //   244: bipush #103
    //   246: goto -> 251
    //   249: bipush #102
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 172
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 168
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 105
    //   308: new burp/Zrtz
    //   311: dup
    //   312: sipush #6366
    //   315: sipush #17651
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: sipush #6360
    //   324: sipush #17993
    //   327: invokestatic a : (II)Ljava/lang/String;
    //   330: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   333: <illegal opcode> Zv : ()Lburp/Zrec;
    //   338: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zrdu;Lburp/Zrec;)V
    //   341: new burp/Zrtz
    //   344: dup
    //   345: sipush #6358
    //   348: sipush #-19872
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: sipush #6363
    //   357: sipush #23176
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   366: <illegal opcode> Zv : ()Lburp/Zrec;
    //   371: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zrdu;Lburp/Zrec;)V
    //   374: new burp/Zrtz
    //   377: dup
    //   378: sipush #6358
    //   381: sipush #-19872
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: sipush #6365
    //   390: sipush #-29615
    //   393: invokestatic a : (II)Ljava/lang/String;
    //   396: getstatic burp/Zrdu.JSON_PARAM : Lburp/Zrdu;
    //   399: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zrdu;)V
    //   402: new burp/Zrtz
    //   405: dup
    //   406: sipush #6358
    //   409: sipush #-19872
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: sipush #6361
    //   418: sipush #-30654
    //   421: invokestatic a : (II)Ljava/lang/String;
    //   424: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   427: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zrdu;)V
    //   430: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   433: putstatic burp/Ztwe.ZN : Ljava/util/List;
    //   436: return
  }
  
  public static void ZH(Zbqc[] paramArrayOfZbqc) {
    ZE = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zk() {
    return ZE;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x18DE) & 0xFFFF;
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
      byte b1 = 1;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */