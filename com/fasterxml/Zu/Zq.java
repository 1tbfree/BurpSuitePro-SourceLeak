package com.fasterxml.Zu;

import burp.Zbqc;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zk.Zc;
import com.fasterxml.Zk.Ze;
import com.fasterxml.Zo.Zb;
import com.fasterxml.Zo.Zza;
import com.fasterxml.Zo.Zzi;
import com.fasterxml.Zor.Za;
import com.fasterxml.Zor.Ze;
import com.fasterxml.Zor.Zs;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zd;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Zq extends Za implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final AtomicInteger ZS;
  
  protected final String Zw = (getClass() == Zq.class) ? (a(16430, 19490) + ZS.getAndIncrement()) : getClass().getName();
  
  protected final Zmk ZR = Zmk.ZM();
  
  protected final boolean Zf = false;
  
  protected Zy ZY = null;
  
  protected Zi ZM = null;
  
  protected Zy Zt = null;
  
  protected Zd Zb = null;
  
  protected Zh Ze = null;
  
  protected Zz ZC = null;
  
  protected Zb Z_ = null;
  
  protected Ze Zp = null;
  
  protected HashMap<Class<?>, Class<?>> Zi = null;
  
  protected LinkedHashSet<Zd> Zd = null;
  
  protected Ze Zy = null;
  
  private static int[] ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zq() {}
  
  public Zq(Zmk paramZmk) {
    this(paramZmk.Zh(), paramZmk);
  }
  
  public Zq(String paramString, Zmk paramZmk) {}
  
  public Object Zn() {
    try {
      if (this.Zf)
        return this.Zw; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (getClass() == Zq.class)
        return this.Zw; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return super.Zn();
  }
  
  public <T> Zq ZZ(Class<T> paramClass, Zyo<? extends T> paramZyo) {
    try {
      Zr(paramClass, a(16428, 2420));
      Zr(paramZyo, a(16431, 5309));
      if (this.ZM == null)
        this.ZM = new Zi(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZM.Zc(paramClass, paramZyo);
    return this;
  }
  
  public String ZW() {
    return this.Zw;
  }
  
  public void setupModule(Zs paramZs) {
    int[] arrayOfInt = Zu();
    try {
      if (this.ZY != null)
        paramZs.Zb((Zc)this.ZY); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZM != null)
        paramZs.Zn((Zza)this.ZM); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zt != null)
        paramZs.Zn((Zc)this.Zt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zb != null)
        paramZs.ZX(this.Zb); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Ze != null)
        paramZs.Z_(this.Ze); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZC != null)
        paramZs.Za((Zzi)this.ZC); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Z_ != null)
        paramZs.ZJ(this.Z_); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zp != null)
        paramZs.ZG(this.Zp); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zd != null)
        try {
          if (this.Zd.size() > 0)
            paramZs.Z_((Zd[])this.Zd.toArray((Object[])new Zd[this.Zd.size()])); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zy != null)
        paramZs.Zz(this.Zy); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (this.Zi != null)
      for (Map.Entry<Class<?>, Class<?>> entry : this.Zi.entrySet()) {
        paramZs.ZT((Class)entry.getKey(), (Class)entry.getValue());
        if (arrayOfInt == null) {
          Zbqc.Zr(new Zbqc[3]);
          break;
        } 
      }  
  }
  
  public Zmk version() {
    return this.ZR;
  }
  
  protected void Zr(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throw new IllegalArgumentException(String.format(a(16429, 15553), new Object[] { paramString })); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '%½auùÔ­H5!ãm»×L'z=HìB%»ð¸é?y\\b¤AÄOIã·!W1Õ:å¥áÑf´\\b'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: newarray int
    //   20: bipush #33
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic Zy : ([I)V
    //   28: bipush #121
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
    //   73: ldc 'Ê¦Ë+©ûói¿\\f2¦Gc`\\rs'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #13
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #113
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 147
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
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic com/fasterxml/Zu/Zq.a : [Ljava/lang/String;
    //   137: iconst_4
    //   138: anewarray java/lang/String
    //   141: putstatic com/fasterxml/Zu/Zq.b : [Ljava/lang/String;
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
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #76
    //   218: goto -> 248
    //   221: bipush #112
    //   223: goto -> 248
    //   226: bipush #76
    //   228: goto -> 248
    //   231: bipush #59
    //   233: goto -> 248
    //   236: bipush #67
    //   238: goto -> 248
    //   241: bipush #89
    //   243: goto -> 248
    //   246: bipush #75
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: new java/util/concurrent/atomic/AtomicInteger
    //   307: dup
    //   308: iconst_1
    //   309: invokespecial <init> : (I)V
    //   312: putstatic com/fasterxml/Zu/Zq.ZS : Ljava/util/concurrent/atomic/AtomicInteger;
    //   315: return
  }
  
  public static void Zy(int[] paramArrayOfint) {
    ZN = paramArrayOfint;
  }
  
  public static int[] Zu() {
    return ZN;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x402C) & 0xFFFF;
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
      byte b1 = 29;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zu\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */