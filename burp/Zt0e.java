package burp;

import java.util.Iterator;
import java.util.List;

public class Zt0e {
  private Zxav Ze;
  
  private List<Zzsd> ZK;
  
  private StringBuilder Zq;
  
  private Zl30 Zj;
  
  private List<Zgy_> Zb;
  
  private int Zs;
  
  private Ztx4 ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zt(Zkr1<Zss1> paramZkr1, Ztm5 paramZtm5) {
    Zb3t zb3t = ((Zss1)paramZkr1.ZP()).Zu;
    this.Zq = new StringBuilder(a(-8123, 15375));
    boolean bool = Zse4.ZM();
    if (this.ZL != null)
      this.Zq.append(String.format(a(-8127, 27735), new Object[] { this.ZL })); 
    if (zb3t != null) {
      this.Zq.append(String.format(a(-8113, -15912), new Object[] { zb3t.toString() }));
      if (!bool) {
        Zbqc.Zr(new Zbqc[2]);
      } else {
        this.Zq.append(a(-8124, 18356));
        this.Zq.append(Zs(paramZkr1));
        this.Zq.append(a(-8117, -20555));
        this.Zq.append(paramZtm5.Zz());
        this.Zq.append('\n');
        return this.Zq.toString();
      } 
    } 
    this.Zq.append(a(-8121, -24230));
    this.Zq.append(a(-8124, 18356));
    this.Zq.append(Zs(paramZkr1));
    this.Zq.append(a(-8117, -20555));
    this.Zq.append(paramZtm5.Zz());
    this.Zq.append('\n');
    return this.Zq.toString();
  }
  
  private String Zs(Zkr1<Zss1> paramZkr1) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 1;
    Zss1 zss1 = paramZkr1.ZZ(b);
    boolean bool = Zse4.ZM();
    while (zss1 != null && zss1.Zu != null && b <= 10) {
      Zb3t zb3t = zss1.Zu;
      stringBuilder.append(zb3t.toString()).append('\n');
      if (Zl19.ZR(zb3t))
        break; 
      zss1 = paramZkr1.ZZ(++b);
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public String ZB(Ze4y paramZe4y, Zb84 paramZb841, Zb84 paramZb842) {
    this.Zq = (new StringBuilder("\n")).append(a(-8128, 11710)).append(paramZb841).append("\n").append(a(-8114, -18493)).append(paramZb842).append("\n").append(a(-8122, 5579)).append(this.ZL).append("\n").append(a(-8115, -26803));
    Zzsd zzsd = this.ZK.get(this.Zs);
    Iterator<Zgy_> iterator = zzsd.Zo().iterator();
    boolean bool = Zse4.Zj();
    while (iterator.hasNext()) {
      Zgy_ zgy_ = iterator.next();
      int i = zgy_.Zn();
      this.Zj = paramZe4y.Zw().get(i);
      Zen9 zen9 = this.Ze.ZQ(i);
      this.Zb = zen9.Zm();
      Zy(zgy_);
      if (bool)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zse4.Zs(!bool); 
    return this.Zq.toString();
  }
  
  private void Zy(Zgy_ paramZgy_) {
    this.Zq.append(this.Zj.ZC()).append(a(-8125, -2821));
    byte b = 0;
    boolean bool = Zse4.Zj();
    for (Ztx4 ztx4 : this.Zj.ZT()) {
      Zc(paramZgy_, b);
      this.Zq.append(" ").append(ztx4);
      b++;
      if (bool)
        break; 
    } 
    Zc(paramZgy_, b);
    this.Zq.append("\n");
  }
  
  private void Zc(Zgy_ paramZgy_, int paramInt) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_3
    //   4: iload_2
    //   5: aload_0
    //   6: getfield Zb : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmplt -> 38
    //   17: aload_0
    //   18: getfield Zq : Ljava/lang/StringBuilder;
    //   21: sipush #-8126
    //   24: sipush #22082
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: iload_3
    //   35: ifne -> 82
    //   38: aload_0
    //   39: getfield Zb : Ljava/util/List;
    //   42: iload_2
    //   43: invokeinterface get : (I)Ljava/lang/Object;
    //   48: checkcast burp/Zgy_
    //   51: astore #4
    //   53: aload #4
    //   55: invokevirtual Zy : ()I
    //   58: aload_1
    //   59: invokevirtual Zy : ()I
    //   62: if_icmpne -> 82
    //   65: aload_0
    //   66: getfield Zq : Ljava/lang/StringBuilder;
    //   69: sipush #-8116
    //   72: sipush #19447
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: return
  }
  
  public void Z_(List<Zzsd> paramList) {
    this.ZK = paramList;
  }
  
  public void Zb(Zxav paramZxav) {
    this.Ze = paramZxav;
  }
  
  public void ZV(int paramInt) {
    this.Zs = paramInt;
  }
  
  public void Zl(Ztx4 paramZtx4) {
    this.ZL = paramZtx4;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'óQ±¸È?/u¥wjÌ} ùûül,å¤RXV\\f+ÐTR°ÞMÿÇ²4¨(VNÖ`#©ìTÕi¤íUArÁøÐÄ²àÓè\\rüá=:ð8J"·qIçsçº¥¦óy.*5G}Ã$¬½\\rZRÄä$à4@­Í\\fejÃ[öOëÈÔì©²ºU_¶Fþ P$¸îKO'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #96
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'îd9&U½òÕx\Ú+«XbÚ6­5&¼ËqæÝO¡Á'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_5
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zt0e.a : [Ljava/lang/String;
    //   130: bipush #13
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zt0e.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #13
    //   214: goto -> 243
    //   217: bipush #85
    //   219: goto -> 243
    //   222: bipush #82
    //   224: goto -> 243
    //   227: bipush #57
    //   229: goto -> 243
    //   232: bipush #80
    //   234: goto -> 243
    //   237: bipush #40
    //   239: goto -> 243
    //   242: iconst_3
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE047) & 0xFFFF;
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
      byte b1 = 99;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */