package burp;

import java.util.List;
import javax.swing.SortOrder;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zgqz extends Zg2b<Zz_1> {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgqz(Zl2z paramZl2z, Ztdi paramZtdi, Ztwv paramZtwv) {
    super(new Zgjg<>((Zmk7<Zz_1>[])new Zmk7[] { 
            Zn(paramZtdi, paramZtwv), Z_(paramZl2z), ZX(paramZl2z), Zs(paramZl2z), ZR(paramZl2z), Zo(paramZl2z), Zr(paramZl2z), ZT(paramZl2z), ZN(paramZl2z), Zb(paramZl2z), 
            Zh(paramZl2z) }));
  }
  
  private static Zmk7<Zz_1> Zn(Ztdi paramZtdi, Ztwv paramZtwv) {
    // Byte code:
    //   0: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   5: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   8: sipush #-18114
    //   11: sipush #18963
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   20: ldc burp/Zmzk
    //   22: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   25: bipush #20
    //   27: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   30: new burp/Ztwu
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   40: aload_0
    //   41: aload_1
    //   42: <illegal opcode> ZG : (Lburp/Ztdi;Lburp/Ztwv;)Lburp/Zzbi;
    //   47: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   50: new burp/Zlxk
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: invokevirtual Zb : ()Ljavax/swing/table/TableCellEditor;
    //   60: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   63: invokevirtual ZH : ()Lburp/Zmk7;
    //   66: areturn
  }
  
  private static Zmk7<Zz_1> Z_(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$method$2).ZL(a(-18116, 125)).Zg(String.class).ZZ(8).ZM(new Zmqt(paramZl2z)).ZH();
  }
  
  private static Zmk7<Zz_1> ZX(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$url$3).ZL(a(-18125, 8209)).Zg(String.class).ZZ(20).ZM(new Zmqt(paramZl2z)).ZV(SortOrder.ASCENDING).ZH();
  }
  
  private static Zmk7<Zz_1> ZR(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$params$4).ZL(a(-18127, 18242)).Zg(Boolean.class).ZM(new Zbg9(paramZl2z)).ZZ(8).ZH();
  }
  
  private static Zmk7<Zz_1> Zo(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$status$5).ZL(a(-18120, 30038)).Zg(Integer.class).ZZ(13).ZM(new Zmqt(paramZl2z)).Zh(new Zs46()).ZH();
  }
  
  private static Zmk7<Zz_1> Zr(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$responseLength$6).ZL(a(-18119, 23294)).Zg(Integer.class).ZZ(8).ZM(new Zmqt(paramZl2z)).Zh(new Zs46()).ZH();
  }
  
  private static Zmk7<Zz_1> ZT(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$mimeType$7).ZL(a(-18126, -11028)).Zg(String.class).ZZ(12).ZM(new Zmqt(paramZl2z)).ZH();
  }
  
  private static Zmk7<Zz_1> ZN(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$pageTitle$8).ZL(a(-18113, 11865)).Zg(String.class).ZZ(20).ZM(new Zmqt(paramZl2z)).ZH();
  }
  
  private static Zmk7<Zz_1> Zb(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$notes$9).ZL(a(-18117, -18294)).Zg(String.class).ZZ(20).ZM(new Zmqt(paramZl2z)).ZH();
  }
  
  private static Zmk7<Zz_1> Zh(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(Zgqz::lambda$requestTime$10).ZL(a(-18115, 15116)).Zg(Long.class).ZZ(12).ZM(new Zmq_(paramZl2z)).Zh(new Zs46()).ZH();
  }
  
  public static Zmk7<Zz_1> Zs(Zl2z paramZl2z) {
    return Zmk7.<Zz_1>Zh(ZW(paramZl2z)).ZL(a(-18118, 24359)).Zg(Integer.class).ZZ(12).ZM(new Zmqt(paramZl2z)).ZH();
  }
  
  private static Zkuq<Zz_1> ZW(Zl2z paramZl2z) {
    return paramZl2z::lambda$getDiffValue$11;
  }
  
  private static void Zf(Ztdi paramZtdi, Zz_1 paramZz_1, Ztwv paramZtwv) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Ztdi;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   8: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   13: pop
    //   14: return
  }
  
  private static void lambda$notifyMapManagerOfUpdate$12(Ztdi paramZtdi, Zz_1 paramZz_1) {
    paramZtdi.ZR(((Zxya)paramZz_1.Z_()).ZX);
  }
  
  private static Object lambda$getDiffValue$11(Zl2z paramZl2z, Zz_1 paramZz_1) {
    try {
      List<Ztsm> list = paramZl2z.ZU(((Zxya)paramZz_1.Z_()).ZX).Zz();
      return (list == null) ? Integer.valueOf(0) : Integer.valueOf(list.size());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return Integer.valueOf(0);
    } 
  }
  
  private static Object lambda$requestTime$10(Zz_1 paramZz_1) {
    return Long.valueOf(((Zxya)paramZz_1.Z_()).ZM);
  }
  
  private static Object lambda$notes$9(Zz_1 paramZz_1) {
    return (((Zxya)paramZz_1.Z_()).ZAs() == null) ? "" : ((Zxya)paramZz_1.Z_()).ZAs();
  }
  
  private static Object lambda$pageTitle$8(Zz_1 paramZz_1) {
    String str = ((Zxya)paramZz_1.Z_()).Zl;
    return (str == null) ? "" : str;
  }
  
  private static Object lambda$mimeType$7(Zz_1 paramZz_1) {
    return Zk8m.Zz(((Zxya)paramZz_1.Z_()).ZY);
  }
  
  private static Object lambda$responseLength$6(Zz_1 paramZz_1) {
    return Integer.valueOf(((Zxya)paramZz_1.Z_()).Zs);
  }
  
  private static Object lambda$status$5(Zz_1 paramZz_1) {
    return Integer.valueOf(((Zxya)paramZz_1.Z_()).ZD);
  }
  
  private static Object lambda$params$4(Zz_1 paramZz_1) {
    return Boolean.valueOf(((Zxya)paramZz_1.Z_()).ZF());
  }
  
  private static Object lambda$url$3(Zz_1 paramZz_1) {
    return Zkb.ZG(((Zxya)paramZz_1.Z_()).Zq().ZdH());
  }
  
  private static Object lambda$method$2(Zz_1 paramZz_1) {
    return ((Zxya)paramZz_1.Z_()).Zr;
  }
  
  private static void lambda$host$1(Ztdi paramZtdi, Ztwv paramZtwv, Zz_1 paramZz_1, Object paramObject) {
    try {
      byte b = ((Byte)paramObject).byteValue();
      ((Zxya)paramZz_1.Z_()).ZB(b);
      Zlxk.ZS = ((Zxya)paramZz_1.Z_()).ZL();
      Zf(paramZtdi, paramZz_1, paramZtwv);
      Zm2.Zi(Zv8r.TARGET_SITE_MAP_HIGHLIGHT, Zlxk.ZS);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static Object lambda$host$0(Zz_1 paramZz_1) {
    return ((Zxya)paramZz_1.Z_()).Zq().Zdz();
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'àBÍ\\nùË««*³n[H> ßÖÓ B`WÔðêOöÚ@*ñõ~0ý7(^(©Ä¨ á°Ò·ÒÇk'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #17
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '.ù¦S+ä~¯¯º\\f'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #39
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zgqz.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgqz.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #23
    //   214: goto -> 243
    //   217: bipush #20
    //   219: goto -> 243
    //   222: bipush #83
    //   224: goto -> 243
    //   227: bipush #7
    //   229: goto -> 243
    //   232: iconst_1
    //   233: goto -> 243
    //   236: bipush #69
    //   238: goto -> 243
    //   241: bipush #48
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB93B) & 0xFFFF;
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
      byte b1 = 21;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgqz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */