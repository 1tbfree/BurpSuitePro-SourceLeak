package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkjm {
  private static final String[] ZG;
  
  private final Zxp8 Zg;
  
  private final Zm4r Zi;
  
  private static int Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkjm(Zxp8 paramZxp8, Zm4r paramZm4r) {
    this.Zg = paramZxp8;
    this.Zi = paramZm4r;
  }
  
  public String toString() {
    return "" + Zn() + ":" + Zn() + ":" + Zk() + ":" + ZK() + ":" + Zd();
  }
  
  public boolean Zx() {
    switch (Zn()) {
      case 2:
      case 3:
      
    } 
    return false;
  }
  
  public int Zn() {
    return this.Zg.Zk0();
  }
  
  public String Zk() {
    return this.Zg.Zkh();
  }
  
  public String ZK() {
    return new String(this.Zi.ZS());
  }
  
  public String ZL() {
    return this.Zi.Zg();
  }
  
  public String ZZ() {
    return this.Zg.Zki();
  }
  
  public String Zd() {
    return this.Zg.Zkg();
  }
  
  public String ZJ() {
    return this.Zg.ZkQ();
  }
  
  public byte[] ZQ() {
    return this.Zg.Zkx();
  }
  
  public byte[] Zb() {
    return this.Zg.ZkC();
  }
  
  public boolean Zr() {
    return this.Zg.Zkv();
  }
  
  public Zxp8 ZF() {
    return this.Zg;
  }
  
  public static int ZS(String paramString) {
    int i = ZG();
    byte b = 0;
    while (b < ZG.length) {
      if (ZG[b].equals(paramString))
        return b; 
      b++;
      if (i == 0)
        break; 
    } 
    return 0;
  }
  
  public void ZN(Zzqp paramZzqp) {
    Zt(paramZzqp, false);
  }
  
  public void Zt(Zzqp paramZzqp, boolean paramBoolean) {
    paramZzqp.Zm(a(18405, -7168), ZG[Zn()]);
    paramZzqp.Zd(a(18402, 29189), Zk());
    paramZzqp.Zd(a(18409, 15191), ZL());
    paramZzqp.Zd(a(18415, 14525), Zd());
    paramZzqp.Zd(a(18410, -14148), ZJ());
    if (!paramBoolean)
      paramZzqp.Zj(a(18411, 9004), Zr()); 
  }
  
  public static Zkjm Zl(Zvt paramZvt, Zecc paramZecc, String paramString, Zlal paramZlal) {
    int i = paramZvt.ZI(a(18400, 26494), ZG, 0);
    String str1 = paramZvt.Zf(a(18404, 19281), "");
    String str2 = paramZvt.Zf(a(18413, 8307), "");
    String str3 = paramZvt.Zf(a(18414, -24809), "");
    String str4 = paramZvt.Zf(a(18401, 26859), "");
    boolean bool = paramZvt.Zc(a(18412, -20782), true);
    String str5 = paramZlal.ZI(str2, paramString, str4, str1);
    try {
      return paramZecc.Ze(i, str1, str5, str3, str4, paramString, bool);
    } catch (Zxt3 zxt3) {
      Zah.Zl(zxt3, Zk_.USER_ERROR);
      return null;
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: bipush #103
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc '¸9g×ú]pØ\\ba±\QGoXX¢%­°tóÝPÕÍ'ù?W·`øY¨¦Á\\b=ô:-¿}¡|g*Ái¶ªÚÌÝ\\tÒí{­¸¼qáL\\b£ ÒØ^ÇÞoYg\\bKõÏr,àµbáÑ|á´¡:6FE­|'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic Zg : (I)V
    //   23: bipush #6
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #42
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 147
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '­¯éÈ8s} ]Ñtjfo'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #9
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: iconst_3
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 87
    //   131: aload #5
    //   133: putstatic burp/Zkjm.a : [Ljava/lang/String;
    //   136: bipush #17
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zkjm.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 262
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 235, 5 -> 240
    //   216: bipush #113
    //   218: goto -> 246
    //   221: bipush #126
    //   223: goto -> 246
    //   226: bipush #89
    //   228: goto -> 246
    //   231: iconst_3
    //   232: goto -> 246
    //   235: bipush #54
    //   237: goto -> 246
    //   240: bipush #23
    //   242: goto -> 246
    //   245: iconst_2
    //   246: ixor
    //   247: ixor
    //   248: i2c
    //   249: castore
    //   250: iinc #6, 1
    //   253: dup
    //   254: ifne -> 262
    //   257: dup2
    //   258: dup_x1
    //   259: goto -> 170
    //   262: dup2_x1
    //   263: pop2
    //   264: dup_x2
    //   265: iload #6
    //   267: if_icmpgt -> 166
    //   270: pop
    //   271: new java/lang/String
    //   274: dup_x1
    //   275: swap
    //   276: invokespecial <init> : ([C)V
    //   279: invokevirtual intern : ()Ljava/lang/String;
    //   282: swap
    //   283: pop
    //   284: swap
    //   285: tableswitch default -> 45, 0 -> 103
    //   304: iconst_5
    //   305: anewarray java/lang/String
    //   308: dup
    //   309: iconst_0
    //   310: sipush #18406
    //   313: sipush #18291
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: sipush #18407
    //   325: sipush #-14318
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: aastore
    //   332: dup
    //   333: iconst_2
    //   334: sipush #18408
    //   337: sipush #9708
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: aastore
    //   344: dup
    //   345: iconst_3
    //   346: sipush #18431
    //   349: sipush #13469
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: aastore
    //   356: dup
    //   357: iconst_4
    //   358: sipush #18403
    //   361: sipush #-12059
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: aastore
    //   368: putstatic burp/Zkjm.ZG : [Ljava/lang/String;
    //   371: return
  }
  
  public static void Zg(int paramInt) {
    Z_ = paramInt;
  }
  
  public static int ZG() {
    return Z_;
  }
  
  public static int Zg() {
    int i = ZG();
    return (i == 0) ? 69 : 0;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x47EF) & 0xFFFF;
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
      char c = 'ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkjm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */