package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Zbiz implements Zbu0 {
  private final Zkit Zv;
  
  private final Zzyh ZF;
  
  private final Zzir ZI;
  
  private final Zxi Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbiz(Zkit paramZkit, Zzyh paramZzyh, Zzir paramZzir) {
    this.Zv = paramZkit;
    this.ZF = paramZzyh;
    this.ZI = paramZzir;
    this.Zg = this.ZF.Ziq();
  }
  
  public void Zx() {
    Zl3g.ZK(this.Zv, this.ZI);
    ZR();
    Zq();
    Zb();
    Zd();
    Zl3g.ZG(this.Zv, this.ZI);
    Zl3g.ZS(this.Zv, this.ZI);
    Zl3g.ZX(this.Zv, this.ZI);
    Zl3g.Zk(this.Zv, this.ZI);
    Zl3g.ZH(this.Zv, this.ZI);
  }
  
  private void ZR() {
    this.Zv.Zi(this.ZI, Zk4m.ZU, this.ZF.Zik());
    this.Zv.Zi(this.ZI, Zk4m.ZV, this.ZF.Zi2());
    this.Zv.Zq(this.ZI, Zk4m.ZG, this.ZF.ZiL());
    this.Zv.Zq(this.ZI, Zk4m.Zm, this.ZF.Ziw());
    this.Zv.Zq(this.ZI, Zk4m.ZI, this.ZF.Zi4());
    this.Zv.Zq(this.ZI, Zk4m.ZA, Ze(this.ZF.ZiJ()));
    this.Zv.Zq(this.ZI, Zk4m.Zk, this.ZF.ZiE());
  }
  
  private Ze_6 Ze(Ze_6 paramZe_6) {
    boolean bool1 = false;
    boolean bool2 = true;
    byte b1 = 3;
    byte b2 = 4;
    byte b3 = 5;
    byte b4 = 6;
    byte b5 = 7;
    byte b6 = 8;
    byte b7 = 9;
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(Byte.valueOf(bool1), Byte.valueOf((byte)0));
    hashMap.put(Byte.valueOf(bool2), Byte.valueOf((byte)1));
    hashMap.put(Byte.valueOf(b1), Byte.valueOf((byte)2));
    hashMap.put(Byte.valueOf(b2), Byte.valueOf((byte)3));
    hashMap.put(Byte.valueOf(b3), Byte.valueOf((byte)4));
    hashMap.put(Byte.valueOf(b4), Byte.valueOf((byte)5));
    hashMap.put(Byte.valueOf(b5), Byte.valueOf((byte)6));
    hashMap.put(Byte.valueOf(b6), Byte.valueOf((byte)7));
    hashMap.put(Byte.valueOf(b7), Byte.valueOf((byte)8));
    if (paramZe_6 != null && paramZe_6.ZmM() != null) {
      ZY(paramZe_6, (Map)hashMap);
      ZD(paramZe_6, (Map)hashMap);
    } 
    return paramZe_6;
  }
  
  private void ZY(Ze_6 paramZe_6, Map<Byte, Byte> paramMap) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZmM : ()Lburp/Zm39;
    //   6: invokeinterface Zfu : ()Lburp/Zefg;
    //   11: ifnull -> 37
    //   14: aload_1
    //   15: invokeinterface ZmM : ()Lburp/Zm39;
    //   20: invokeinterface Zfu : ()Lburp/Zefg;
    //   25: aload_0
    //   26: aload_2
    //   27: <illegal opcode> accept : (Lburp/Zbiz;Ljava/util/Map;)Ljava/util/function/Consumer;
    //   32: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   37: return
  }
  
  private void ZD(Ze_6 paramZe_6, Map<Byte, Byte> paramMap) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZmM : ()Lburp/Zm39;
    //   6: invokeinterface ZOt : ()[Z
    //   11: ifnull -> 59
    //   14: aload_1
    //   15: invokeinterface ZmM : ()Lburp/Zm39;
    //   20: invokeinterface ZOt : ()[Z
    //   25: astore_3
    //   26: aload_3
    //   27: arraylength
    //   28: newarray boolean
    //   30: astore #4
    //   32: aload_2
    //   33: aload #4
    //   35: aload_3
    //   36: <illegal opcode> accept : ([Z[Z)Ljava/util/function/BiConsumer;
    //   41: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   46: aload_1
    //   47: invokeinterface ZmM : ()Lburp/Zm39;
    //   52: aload #4
    //   54: invokeinterface Zr : ([Z)V
    //   59: return
  }
  
  private void Zq() {
    this.Zv.Zq(this.ZI, Zk4m.ZK, this.Zg.ZSx());
  }
  
  private void Zb() {
    Zefg<Zb2e> zefg = this.Zg.ZPc();
    zefg.stream().filter(Objects::nonNull).forEach(Zbiz::lambda$migrateIssueActivityLog$3);
    this.ZI.Zv9().ZVQ().addAll(zefg);
  }
  
  private void Zd() {
    int[] arrayOfInt = Zl3g.Zn();
    Zefg<Zbza> zefg = this.Zg.ZS8();
    if (!zefg.isEmpty()) {
      Zb4g zb4g = this.Zv.<Zb4g>ZH(new Zkie(1));
      Zx_7 zx_7 = Zx_7.ZM(this.Zv);
      Zs4c zs4c = Zs4c.ZC(Zra1.EXECUTION_MODE_DESKTOP, null);
      zx_7.Zd(zs4c.ZD(new String[] { a(3927, 2653) }));
      Zmj1 zmj1 = this.Zv.<Zmj1>ZH(new Zmo1(Zz5.ZO.Zf()));
      Zz1i zz1i = this.Zv.<Zz1i>ZH(new Zbuf(zx_7, zmj1));
      Zr5h zr5h = this.Zv.<Zr5h>ZH(new Zs21(1, Zg1j.Zo(), a(3925, -21202), a(3924, -24260), zz1i, zb4g, null));
      this.ZI.Zv9().ZV_().add(0, zr5h);
      int i = 0;
      int j = 0;
      byte b = 0;
      while (b < zefg.size()) {
        Zbza zbza = zefg.get(b);
        zbza.ZgZ(b);
        if (zbza.Zg6() == 2 || zbza.Zg6() == 4) {
          Zl5x.ZI.forEach(zbza::lambda$migrateActiveScanQueue$4);
          Zl5x.ZX.forEach(zbza::lambda$migrateActiveScanQueue$5);
        } 
        i += zbza.ZgR();
        j += zbza.Zgx();
        b++;
        if (arrayOfInt != null)
          break; 
      } 
      zz1i.ZHD().Zbm(i);
      zz1i.ZHD().Zbb(j);
      zz1i.ZHU().addAll(zefg);
    } 
  }
  
  private static void lambda$migrateActiveScanQueue$5(Zbza paramZbza, Zz86 paramZz86) {
    paramZbza.Zu(paramZz86, Zlby.FINISHED);
  }
  
  private static void lambda$migrateActiveScanQueue$4(Zbza paramZbza, Zt0r paramZt0r) {
    paramZbza.Zu(paramZt0r, Zlby.FINISHED);
  }
  
  private static void lambda$migrateIssueActivityLog$3(Zb2e paramZb2e) {
    paramZb2e.Zoy(-1);
  }
  
  private static void lambda$migrateCookieJar$2(boolean[] paramArrayOfboolean1, boolean[] paramArrayOfboolean2, Byte paramByte1, Byte paramByte2) {
    paramArrayOfboolean1[paramByte2.byteValue()] = paramArrayOfboolean2[paramByte1.byteValue()];
  }
  
  private void lambda$migrateSessionHandlingRules$1(Map paramMap, Zt9r paramZt9r) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zkit;
    //   4: getstatic burp/Zsqo.ZR : Lburp/Zllg;
    //   7: bipush #9
    //   9: invokevirtual Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   12: checkcast burp/Zsqo
    //   15: astore_3
    //   16: aload_1
    //   17: aload_3
    //   18: aload_2
    //   19: <illegal opcode> accept : (Lburp/Zsqo;Lburp/Zt9r;)Ljava/util/function/BiConsumer;
    //   24: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   29: aload_2
    //   30: aload_3
    //   31: invokeinterface ZD : (Lburp/Zsqo;)V
    //   36: return
  }
  
  private static void lambda$migrateSessionHandlingRules$0(Zsqo paramZsqo, Zt9r paramZt9r, Byte paramByte1, Byte paramByte2) {
    paramZsqo.ZC(paramByte2.byteValue(), paramZt9r.ZWA().ZV(paramByte1.byteValue()));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'í$°×±³¶2âAv¶Í0õq9¤FÍìOZ·;Lü¨V µ\\rÅÝ¨ªÆÒ@Ý'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #23
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #13
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
    //   69: putstatic burp/Zbiz.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zbiz.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #48
    //   154: goto -> 183
    //   157: bipush #87
    //   159: goto -> 183
    //   162: iconst_5
    //   163: goto -> 183
    //   166: bipush #113
    //   168: goto -> 183
    //   171: bipush #37
    //   173: goto -> 183
    //   176: bipush #100
    //   178: goto -> 183
    //   181: bipush #94
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xF55) & 0xFFFF;
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
      byte b1 = 55;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbiz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */