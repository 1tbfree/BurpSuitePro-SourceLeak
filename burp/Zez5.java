package burp;

import java.util.List;

public class Zez5 extends Zez7 {
  static final List<Zz3o> Zt;
  
  private static final byte[] ZU;
  
  private final Zkl6 ZA;
  
  private final Zr69 Zu;
  
  private final Zr_4 ZE;
  
  private final Zl7h ZP;
  
  private final Zz1m<Zt35> Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zez5(byte paramByte, Zkl6 paramZkl6, Zr69 paramZr69, Zr_4 paramZr_4, Zl7h paramZl7h, Zz1m<Zt35> paramZz1m) {
    super(paramByte);
    this.ZA = paramZkl6;
    this.Zu = paramZr69;
    this.ZE = paramZr_4;
    this.ZP = paramZl7h;
    this.Zh = paramZz1m;
  }
  
  public String Zp() {
    return a(14407, -8602);
  }
  
  public boolean ZN(Zsiv paramZsiv) {
    Zxjt zxjt = this.ZP.ZVe();
    ZS(zxjt);
    this.Zu.Zi(Zez5::lambda$beforeStart$0);
    zxjt.ZR(paramZsiv, this.ZP.ZVa(), this.Zu, this.Zh);
    return !paramZsiv.ZZk();
  }
  
  private void ZS(Zxjt paramZxjt) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZHR : ()Ljava/util/List;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: ldc burp/Zs9a
    //   13: dup
    //   14: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: pop
    //   18: <illegal opcode> test : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   23: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   28: ldc burp/Zs9a
    //   30: dup
    //   31: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   34: pop
    //   35: <illegal opcode> apply : (Ljava/lang/Class;)Ljava/util/function/Function;
    //   40: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   45: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   50: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   55: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   58: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   63: checkcast java/util/Set
    //   66: astore_3
    //   67: invokestatic Zv : ()Ljava/lang/String;
    //   70: aload_3
    //   71: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   76: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   81: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   86: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   91: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   96: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   101: aload_3
    //   102: dup
    //   103: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   106: pop
    //   107: <illegal opcode> test : (Ljava/util/Set;)Ljava/util/function/Predicate;
    //   112: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   115: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   120: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   125: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   130: invokeinterface toList : ()Ljava/util/List;
    //   135: astore #4
    //   137: astore_2
    //   138: new java/util/LinkedList
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: astore #5
    //   147: aload #4
    //   149: invokeinterface iterator : ()Ljava/util/Iterator;
    //   154: astore #6
    //   156: aload #6
    //   158: invokeinterface hasNext : ()Z
    //   163: ifeq -> 331
    //   166: aload #6
    //   168: invokeinterface next : ()Ljava/lang/Object;
    //   173: checkcast burp/Zski
    //   176: astore #7
    //   178: aload_0
    //   179: getfield ZA : Lburp/Zkl6;
    //   182: invokeinterface ZH : ()Lburp/Zey9;
    //   187: astore #8
    //   189: aload #7
    //   191: invokeinterface ZyR : ()Lburp/Zlit;
    //   196: invokeinterface Zdz : ()Lburp/Zmzk;
    //   201: astore #9
    //   203: aload_0
    //   204: getfield ZA : Lburp/Zkl6;
    //   207: invokeinterface Zs : ()Lburp/Zm6e;
    //   212: invokeinterface ZO : ()Lburp/Ztom;
    //   217: aload #7
    //   219: invokeinterface ZyR : ()Lburp/Zlit;
    //   224: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   227: invokevirtual Zr : ()Lburp/Zstu;
    //   230: astore #10
    //   232: aload #8
    //   234: aload #9
    //   236: aload #10
    //   238: invokevirtual Zu : (Lburp/Zmzk;Lburp/Zstu;)Lburp/Zefx;
    //   241: astore #11
    //   243: aload_0
    //   244: getfield Zu : Lburp/Zr69;
    //   247: aload #11
    //   249: invokeinterface ZF : ()Lburp/Zlit;
    //   254: invokeinterface ZG : (Lburp/Zlit;)Z
    //   259: ifeq -> 306
    //   262: aload_0
    //   263: getfield ZE : Lburp/Zr_4;
    //   266: new burp/Zefw
    //   269: dup
    //   270: aload_1
    //   271: getstatic burp/Zz3o.ROBOTS : Lburp/Zz3o;
    //   274: aload #11
    //   276: invokestatic emptyList : ()Ljava/util/List;
    //   279: invokespecial <init> : (Lburp/Zeu9;Lburp/Zz3o;Lburp/Zefx;Ljava/util/List;)V
    //   282: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   287: checkcast burp/Zgyy
    //   290: astore #12
    //   292: aload #5
    //   294: aload #12
    //   296: invokeinterface add : (Ljava/lang/Object;)Z
    //   301: pop
    //   302: aload_2
    //   303: ifnonnull -> 327
    //   306: aload_0
    //   307: getfield Zh : Lburp/Zz1m;
    //   310: new burp/Zxr8
    //   313: dup
    //   314: getstatic burp/Zt35.ZU : Lburp/Zlnb;
    //   317: aload #11
    //   319: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   322: invokeinterface ZD : (Lburp/Zxr8;)V
    //   327: aload_2
    //   328: ifnonnull -> 156
    //   331: aload_1
    //   332: aload #5
    //   334: invokeinterface Za : (Ljava/util/List;)V
    //   339: return
  }
  
  public void Zl(Zsiv paramZsiv, Zt1g paramZt1g) {}
  
  public boolean Zg() {
    return false;
  }
  
  public String toString() {
    return a(14404, -23844);
  }
  
  private static Zax lambda$addRobotsPortalsToFoyer$2(Zmzk paramZmzk) {
    return new Zax(paramZmzk, ZU);
  }
  
  private static Zlit lambda$addRobotsPortalsToFoyer$1(Zs9a paramZs9a) {
    return paramZs9a.ZFy().ZyR();
  }
  
  private static boolean lambda$beforeStart$0(Zrp0 paramZrp0) {
    if (paramZrp0 instanceof Zbio) {
      Zbio zbio = (Zbio)paramZrp0;
      if (Zt.contains(zbio.Zt()));
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '«wcQMX¬+°ûõ³ ¤NêÞ·EÝ±C¦@ýuw.ØdI)1'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #11
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #10
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
    //   69: putstatic burp/Zez5.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zez5.b : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #44
    //   154: goto -> 184
    //   157: bipush #76
    //   159: goto -> 184
    //   162: bipush #125
    //   164: goto -> 184
    //   167: bipush #105
    //   169: goto -> 184
    //   172: bipush #52
    //   174: goto -> 184
    //   177: bipush #80
    //   179: goto -> 184
    //   182: bipush #91
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: getstatic burp/Zz3o.ROBOTS : Lburp/Zz3o;
    //   230: getstatic burp/Zz3o.SITEMAP : Lburp/Zz3o;
    //   233: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   236: putstatic burp/Zez5.Zt : Ljava/util/List;
    //   239: sipush #14405
    //   242: sipush #-10442
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: invokestatic Zy : (Ljava/lang/String;)[B
    //   251: putstatic burp/Zez5.ZU : [B
    //   254: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3845) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zez5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */