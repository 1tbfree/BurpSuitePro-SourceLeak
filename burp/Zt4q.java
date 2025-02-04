package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zt4q implements Zbql {
  private final AtomicInteger Ze = new AtomicInteger();
  
  protected final Zl7h ZR;
  
  protected final Zr69 Zv;
  
  protected final Zr_4 Zu;
  
  protected final Zkl6 Zn;
  
  protected final Ztos<Zt35> Zd;
  
  private static int[] Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt4q(Zl7h paramZl7h, Zr69 paramZr69, Zz1m<Zt18> paramZz1m, Zr_4 paramZr_4, Zkl6 paramZkl6, Ztos<Zt35> paramZtos) {
    this.ZR = paramZl7h;
    int[] arrayOfInt = Zh();
    this.Zv = paramZr69;
    this.Zu = paramZr_4;
    this.Zn = paramZkl6;
    this.Zd = Objects.<Ztos<Zt35>>requireNonNull(paramZtos);
    Zsiv zsiv = paramZl7h.ZVv();
    if (paramZl7h.ZVG()) {
      Zm2.Zo(Zze0.CRAWL_RESTARTED_FROM_PERSISTENCE);
      if (paramZl7h.ZVT() != Zrfd.ZD())
        Zm2.ZB(Zec3.CRAWL_RESTARTED_FROM_DIFFERENT_VERSION, String.valueOf(paramZl7h.ZVT())); 
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.RESTART_FROM_PERSISTED, new Object[0]);
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.NUM_ROOMS, new Object[] { Integer.valueOf(paramZl7h.ZVP().ZXY()) });
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.PENDING_EXITS, new Object[] { zsiv });
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.SCENE_CHECKPOINT, new Object[] { Integer.valueOf(paramZl7h.ZVJ()) });
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.REQUEST_COUNT, new Object[] { Integer.valueOf(paramZl7h.ZVI()) });
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.ERROR_COUNT, new Object[] { Integer.valueOf(paramZl7h.ZVp()) });
    } 
    (new Zs84(paramZl7h.ZVP())).ZG(paramZtos);
    (new Zewz(paramZl7h.ZV4())).ZF(paramZtos);
    (new Ztkv(paramZl7h.ZVe(), paramZr69)).Zb(paramZtos);
    (new Zr_b(zsiv, paramZl7h.ZVa(), paramZz1m, paramZr69, paramZkl6)).ZB(paramZtos);
    (new Zmtn(paramZl7h.ZVx())).ZA(paramZtos);
    (new Ztcj(paramZl7h.ZVb(), paramZl7h.ZVP(), paramZr69.ZD())).Zy(paramZtos);
    (new Zllb(paramZl7h.ZVu(), paramZr69, paramZkl6)).Za(paramZtos);
    paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.USING_STRATEGY, new Object[] { paramZr69.ZL() });
    if (paramZr69.Zk()) {
      a(-4441, -31009);
      (new Object[10])[0] = a(-4441, -31009) + a(-4441, -31009) + paramZr69.Zr().toMillis();
      a(-4444, -328);
      paramZr69.ZD().Zy(Zrp6.DEBUG, Zlq7.CUSTOMIZED_STRATEGY, new Object[] { null, a(-4444, -328) + a(-4444, -328) + paramZr69.ZH().toMillis(), a(-4442, -23626) + a(-4442, -23626), a(-4440, 8345) + a(-4440, 8345), a(-4439, -32746) + a(-4439, -32746), paramZr69.ZX().toString(), a(-4447, -6434) + a(-4447, -6434), a(-4448, 26553) + a(-4448, 26553), a(-4443, -22979) + a(-4443, -22979), a(-4445, 9280) + a(-4445, 9280) });
    } 
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZM() {}
  
  public void Zx() {}
  
  public Ztos<Zt35> ZH() {
    return this.Zd;
  }
  
  protected List<Zez7> ZC(Zez7 paramZez7) {
    LinkedList<Zez7> linkedList = new LinkedList();
    linkedList.add(paramZez7);
    AtomicBoolean atomicBoolean = new AtomicBoolean();
    byte b = 0;
    int[] arrayOfInt = Zh();
    while (b < this.Zv.Za()) {
      linkedList.add(new Zezy(Zj(), paramZez7, this.Zv, this.ZR, this.Zd, atomicBoolean, b));
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return linkedList;
  }
  
  protected byte Zj() {
    int i = this.Ze.getAndIncrement();
    Zuh.ZT((i <= 127), Zqf.Zs, a(-4438, -13792));
    return (byte)i;
  }
  
  protected void Zt(Queue<Zez7> paramQueue) {
    paramQueue.addAll(ZC(new Zezr(Zj(), this.Zv, this.Zd, this.Zn, this.ZR, this.ZR.ZVf().ZA().orElse(null))));
    if (this.Zv.ZZ())
      paramQueue.addAll(ZC(new Zez5(Zj(), this.Zn, this.Zv, this.Zu, this.ZR, this.Zd))); 
  }
  
  protected void Zg(Queue<Zez7> paramQueue) {
    paramQueue.addAll(ZC(new Zezc(Zj(), this.Zv, this.Zd, this.ZR, this.ZR.ZVf().ZA().filter(this::lambda$addAllUnauthenticatedScenes$0).orElse(null))));
  }
  
  protected void Zr(Queue<Zez7> paramQueue) {
    if (this.Zv.ZI())
      paramQueue.addAll(ZC(new Zexo(Zj(), this.Zv, this.ZR, this.Zd))); 
  }
  
  protected void ZZ(Queue<Zez7> paramQueue) {
    if (this.Zv.Zo())
      paramQueue.addAll(ZC(new Zeza(Zj(), this.Zv, this.ZR, this.Zd, this.Zu, this.Zn))); 
  }
  
  private boolean lambda$addAllUnauthenticatedScenes$0(Zg_f paramZg_f) {
    return !this.Zv.ZV();
  }
  
  public static void Zg(int[] paramArrayOfint) {
    Zy = paramArrayOfint;
  }
  
  public static int[] Zh() {
    return Zy;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc '>3¢)|\\tÂS¶¶¹©ÞQº²$Â ]*£°Û,P8\\fx{ ½ðÚPÌb`A¼Ëµê¤34\\rã@yy ©!9\\n8Û8­ã\\bz³q+¯K%øæ5ÃC3g;¥á\\nØO\\fVêÂQÄËjoh¾Âß\\f¥\\rì¯^¹²0ÞwÆ"^ÿþ UÑ3{õ$oÌ?x¿½ËÊ qRÄÈ·\\rgNÈµ0á ¾÷C 0¦`¨»{ÑG$_?¸ÐE«<5îFÐÂdþ<°dçâZÎ/Ì¬û!¶9m`å",×çPÀA»ÃB\\bv'ÄÎ¾ùádè¯¦'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zg : ([I)V
    //   22: bipush #24
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #85
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc '"i¸CùMÛ0¶ü\\bE\\fc\üBÐBØ2þ\\r¢wÂ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_2
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #97
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
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
    //   132: putstatic burp/Zt4q.a : [Ljava/lang/String;
    //   135: bipush #12
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zt4q.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #107
    //   218: goto -> 248
    //   221: bipush #114
    //   223: goto -> 248
    //   226: bipush #79
    //   228: goto -> 248
    //   231: bipush #116
    //   233: goto -> 248
    //   236: bipush #113
    //   238: goto -> 248
    //   241: bipush #49
    //   243: goto -> 248
    //   246: bipush #37
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEEA1) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */