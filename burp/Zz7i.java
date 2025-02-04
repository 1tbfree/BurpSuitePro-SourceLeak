package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import net.portswigger.Zm2;

public class Zz7i {
  private final Zrfd ZM;
  
  private final Zkrj Zn;
  
  private final Zrag Zt;
  
  private final Ztwv ZK;
  
  private final Zgyw Zs;
  
  private final Zgyw Zq;
  
  private static int[] ZQ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zz7i(Zrfd paramZrfd, Zkrj paramZkrj, Zrag paramZrag, Zz8a paramZz8a, Ztwv paramZtwv) {
    this.ZM = paramZrfd;
    this.Zn = paramZkrj;
    this.Zt = paramZrag;
    this.ZK = paramZtwv;
    this.Zs = ZT(paramZz8a);
    this.Zq = ZC();
  }
  
  public void Zp(Zll9 paramZll9) {
    Zg(Collections.singletonList(paramZll9));
  }
  
  public void Zg(List<? extends Zll9> paramList) {
    Zm2.Zo(Zze0.SUITE_INTERFACES_DO_PASSIVE_SCAN);
    Objects.requireNonNull(this.Zn);
    ZR(paramList, this.Zs, this.Zn.ZF1(), this.Zn::ZA, null);
  }
  
  public void Zz(Zll9 paramZll9, List<int[]> paramList) {
    Zm2.Zo(Zze0.SUITE_INTERFACES_DO_PASSIVE_SCAN);
    Objects.requireNonNull(this.Zn);
    ZR(Collections.singletonList(paramZll9), this.Zs, this.Zn.ZF1(), this.Zn::ZA, paramList);
  }
  
  public void ZV(Zll9 paramZll9) {
    ZO(Collections.singletonList(paramZll9));
  }
  
  public void ZO(List<? extends Zll9> paramList) {
    Zm2.Zo(Zze0.SUITE_INTERFACES_DO_ACTIVE_SCAN);
    Objects.requireNonNull(this.Zn);
    ZR(paramList, this.Zq, this.Zn.ZFo(), this.Zn::ZL, null);
  }
  
  public void ZD(Zll9 paramZll9, List<int[]> paramList) {
    Zm2.Zo(Zze0.SUITE_INTERFACES_DO_ACTIVE_SCAN);
    Objects.requireNonNull(this.Zn);
    ZR(Collections.singletonList(paramZll9), this.Zq, this.Zn.ZFo(), this.Zn::ZL, paramList);
  }
  
  private void ZR(List<? extends Zll9> paramList, Zgyw paramZgyw, int paramInt, Consumer<Integer> paramConsumer, List<int[]> paramList1) {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore #6
    //   5: aload_0
    //   6: iload_3
    //   7: invokevirtual Zx : (I)Ljava/util/Optional;
    //   10: astore #7
    //   12: aload #7
    //   14: invokevirtual isPresent : ()Z
    //   17: ifeq -> 39
    //   20: aload_1
    //   21: aload #7
    //   23: invokevirtual get : ()Ljava/lang/Object;
    //   26: checkcast burp/Ztj1
    //   29: aload #5
    //   31: invokestatic Zn : (Ljava/util/List;Lburp/Ztj1;Ljava/util/List;)V
    //   34: aload #6
    //   36: ifnonnull -> 49
    //   39: aload_0
    //   40: aload_1
    //   41: aload_2
    //   42: aload #4
    //   44: aload #5
    //   46: invokevirtual ZN : (Ljava/util/List;Lburp/Zgyw;Ljava/util/function/Consumer;Ljava/util/List;)V
    //   49: aload_0
    //   50: getfield Zn : Lburp/Zkrj;
    //   53: iconst_m1
    //   54: iconst_1
    //   55: iconst_1
    //   56: iconst_1
    //   57: invokevirtual ZD : (IZZZ)V
    //   60: return
  }
  
  private Optional<Ztj1> Zx(int paramInt) {
    return (paramInt == -1) ? Optional.empty() : this.Zt.ZG(Zkcl.SCAN_AUDIT).stream().filter(paramInt::lambda$findExistingAuditTaskWithId$0).findFirst();
  }
  
  private static void Zn(List<? extends Zll9> paramList, Ztj1 paramZtj1, List<int[]> paramList1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zi : ()Lburp/Zrbm;
    //   4: checkcast burp/Zriy
    //   7: astore_3
    //   8: aload_0
    //   9: aload_3
    //   10: aload_2
    //   11: <illegal opcode> accept : (Lburp/Zriy;Ljava/util/List;)Ljava/util/function/Consumer;
    //   16: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   21: return
  }
  
  private void ZN(List<? extends Zll9> paramList, Zgyw paramZgyw, Consumer<Integer> paramConsumer, List<int[]> paramList1) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: aload #4
    //   4: invokestatic Zr : (Ljava/util/List;Lburp/Zgyw;Ljava/util/List;)Lburp/Zkv4;
    //   7: astore #6
    //   9: invokestatic Zk : ()[I
    //   12: new burp/Zzzw
    //   15: dup
    //   16: aload_0
    //   17: aload_3
    //   18: invokespecial <init> : (Lburp/Zz7i;Ljava/util/function/Consumer;)V
    //   21: astore #7
    //   23: aload_0
    //   24: aload #6
    //   26: aload #7
    //   28: <illegal opcode> run : (Lburp/Zz7i;Lburp/Zkv4;Lburp/Zm0l;)Ljava/lang/Runnable;
    //   33: astore #8
    //   35: astore #5
    //   37: aload_0
    //   38: getfield ZK : Lburp/Ztwv;
    //   41: invokeinterface Zu : ()Z
    //   46: ifeq -> 66
    //   49: aload_0
    //   50: getfield ZK : Lburp/Ztwv;
    //   53: aload #8
    //   55: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   60: pop
    //   61: aload #5
    //   63: ifnonnull -> 73
    //   66: aload #8
    //   68: invokeinterface run : ()V
    //   73: return
  }
  
  private static Zkv4 Zr(List<? extends Zll9> paramList, Zgyw paramZgyw, List<int[]> paramList1) {
    Ztfs ztfs = new Ztfs(paramList, paramList1);
    Zmpo zmpo = new Zmpo(Collections.emptyList());
    Zb2y zb2y = Zb2y.ZX();
    return new Zkv4(ztfs, Zz5.ZO, paramZgyw, zmpo, zb2y, Zlj4.MANUAL, false);
  }
  
  private static Zgyw ZT(Zz8a paramZz8a) {
    Optional<Zrve> optional = paramZz8a.Zt(a(-12136, -32013));
    if (optional.isPresent())
      return new Zgyw(Collections.singletonList(optional.get())); 
    Zb8b zb8b = new Zb8b(a(-12133, -16452), false, Zo(), new Zmln[] { Zmln.AUDITING });
    return new Zgyw(Collections.singletonList(zb8b));
  }
  
  private static Zgyw ZC() {
    return new Zgyw(Collections.emptyList());
  }
  
  private static Zzkm Zo() {
    Zzkm zzkm = new Zzkm();
    zzkm.Za(a(-12131, -4993), Zzqn.Zl);
    zzkm.Za(a(-12135, -20396), Zzqn.Zy);
    zzkm.Za(a(-12130, 7747), Zzqn.Zy);
    zzkm.Za(a(-12132, -5832), Zzqn.Zy);
    zzkm.Za(a(-12129, -27842), Zzqn.Zy);
    zzkm.Za(a(-12134, -2934), Zzqn.Zy);
    return zzkm;
  }
  
  private void lambda$createNewScanTask$2(Zkv4 paramZkv4, Zm0l paramZm0l) {
    this.ZM.Zq(paramZkv4, paramZm0l);
  }
  
  private static void lambda$addItemsToExistingTask$1(Zriy paramZriy, List<int[]> paramList, Zll9 paramZll9) {
    paramZriy.Zy(paramZll9, paramList);
  }
  
  private static boolean lambda$findExistingAuditTaskWithId$0(int paramInt, Ztj1 paramZtj1) {
    return (paramZtj1.Zh() == paramInt);
  }
  
  public static void Zv(int[] paramArrayOfint) {
    ZQ = paramArrayOfint;
  }
  
  public static int[] Zk() {
    return ZQ;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_2
    //   10: newarray int
    //   12: ldc '!{èqÃ(7Ö:ÑiÀcÅüËÖ{Ë0ø\\n Î¹tGÃ¡gDTA ,<<àbå5ÚnÃH¤ùÁ<àEþJÉF. ½|ãAgýÚ +v¹3¢·PÊâ¹ÝC0ðêtPÚâß/¸¼HEípqåBïN²Hó¡£¤Ýø5È¸°\\bBÏSTÇ\\nç1ú[º$kÖÀ?çW*]÷ï×eæUióJÒOO\\f¥ÄÊ/³õ/ïZâøÿo²¤IäK@#\\fVPÎ6Ê}kJ=ùÿÍçM¸y®6ÞJ°Ô\\n)³s'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic Zv : ([I)V
    //   24: bipush #22
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #29
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
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
    //   74: ldc 'õÊ-Ð¶Ü¦6DRJçöýIfÆÀùîY2dËúüpZ'Òô@k>º£2µûÂ½Ñ¤üä2\\fÒC÷×ÿm&BÈøüyp,KóìQXåßt"¢¡3HÐº¶Äe'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #41
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: iconst_3
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 88
    //   132: aload #5
    //   134: putstatic burp/Zz7i.a : [Ljava/lang/String;
    //   137: bipush #8
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zz7i.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #59
    //   218: goto -> 248
    //   221: bipush #52
    //   223: goto -> 248
    //   226: bipush #12
    //   228: goto -> 248
    //   231: bipush #70
    //   233: goto -> 248
    //   236: bipush #72
    //   238: goto -> 248
    //   241: bipush #126
    //   243: goto -> 248
    //   246: bipush #125
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 46, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD09B) & 0xFFFF;
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
      char c = 'î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */