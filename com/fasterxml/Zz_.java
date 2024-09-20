package com.fasterxml;

import java.io.Serializable;

public class Zz_ implements Zvs<Zvm>, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zz_ ZR;
  
  protected final Zqg ZF;
  
  protected final Zqg ZU;
  
  protected final Class<?> Zs;
  
  protected final Class<?> Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zz_(Zqg paramZqg1, Zqg paramZqg2, Class<?> paramClass1, Class<?> paramClass2) {
    this.ZF = (paramZqg1 == null) ? Zqg.USE_DEFAULTS : paramZqg1;
    this.ZU = (paramZqg2 == null) ? Zqg.USE_DEFAULTS : paramZqg2;
    this.Zs = (paramClass1 == Void.class) ? null : paramClass1;
    this.Zd = (paramClass2 == Void.class) ? null : paramClass2;
  }
  
  public static Zz_ Zt() {
    return ZR;
  }
  
  public static Zz_ ZA(Zz_ paramZz_1, Zz_ paramZz_2) {
    return (paramZz_1 == null) ? paramZz_2 : paramZz_1.ZI(paramZz_2);
  }
  
  public static Zz_ Zx(Zz_... paramVarArgs) {
    Zz_ zz_ = null;
    Zz_[] arrayOfZz_ = paramVarArgs;
    String[] arrayOfString = Zgy.ZF();
    int i = arrayOfZz_.length;
    byte b = 0;
    while (b < i) {
      Zz_ zz_1 = arrayOfZz_[b];
      if (zz_1 != null)
        zz_ = (zz_ == null) ? zz_1 : zz_.ZI(zz_1); 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return zz_;
  }
  
  protected Object readResolve() {
    return (this.ZF == Zqg.USE_DEFAULTS && this.ZU == Zqg.USE_DEFAULTS && this.Zs == null && this.Zd == null) ? ZR : this;
  }
  
  public Zz_ ZI(Zz_ paramZz_) {
    if (paramZz_ == null || paramZz_ == ZR)
      return this; 
    Zqg zqg1 = paramZz_.ZF;
    Zqg zqg2 = paramZz_.ZU;
    Class<?> clazz1 = paramZz_.Zs;
    Class<?> clazz2 = paramZz_.Zd;
    boolean bool1 = (zqg1 != this.ZF && zqg1 != Zqg.USE_DEFAULTS) ? true : false;
    boolean bool2 = (zqg2 != this.ZU && zqg2 != Zqg.USE_DEFAULTS) ? true : false;
    boolean bool3 = (clazz1 != this.Zs || clazz2 != this.Zs) ? true : false;
    return bool1 ? (bool2 ? new Zz_(zqg1, zqg2, clazz1, clazz2) : new Zz_(zqg1, this.ZU, clazz1, clazz2)) : (bool2 ? new Zz_(this.ZF, zqg2, clazz1, clazz2) : (bool3 ? new Zz_(this.ZF, this.ZU, clazz1, clazz2) : this));
  }
  
  public static Zz_ ZB(Zqg paramZqg1, Zqg paramZqg2) {
    return ((paramZqg1 == Zqg.USE_DEFAULTS || paramZqg1 == null) && (paramZqg2 == Zqg.USE_DEFAULTS || paramZqg2 == null)) ? ZR : new Zz_(paramZqg1, paramZqg2, null, null);
  }
  
  public static Zz_ Zk(Zqg paramZqg1, Zqg paramZqg2, Class<?> paramClass1, Class<?> paramClass2) {
    if (paramClass1 == Void.class)
      paramClass1 = null; 
    if (paramClass2 == Void.class)
      paramClass2 = null; 
    return ((paramZqg1 == Zqg.USE_DEFAULTS || paramZqg1 == null) && (paramZqg2 == Zqg.USE_DEFAULTS || paramZqg2 == null) && paramClass1 == null && paramClass2 == null) ? ZR : new Zz_(paramZqg1, paramZqg2, paramClass1, paramClass2);
  }
  
  public static Zz_ Zf(Zvm paramZvm) {
    if (paramZvm == null)
      return ZR; 
    Zqg zqg1 = paramZvm.value();
    Zqg zqg2 = paramZvm.Zg();
    if (zqg1 == Zqg.USE_DEFAULTS && zqg2 == Zqg.USE_DEFAULTS)
      return ZR; 
    Class<?> clazz1 = paramZvm.Zr();
    if (clazz1 == Void.class)
      clazz1 = null; 
    Class<?> clazz2 = paramZvm.Zk();
    if (clazz2 == Void.class)
      clazz2 = null; 
    return new Zz_(zqg1, zqg2, clazz1, clazz2);
  }
  
  public Zz_ ZP(Zqg paramZqg) {
    return (paramZqg == this.ZF) ? this : new Zz_(paramZqg, this.ZU, this.Zs, this.Zd);
  }
  
  public Zz_ ZN(Class<?> paramClass) {
    Zqg zqg;
    if (paramClass == null || paramClass == Void.class) {
      zqg = Zqg.USE_DEFAULTS;
      paramClass = null;
    } else {
      zqg = Zqg.CUSTOM;
    } 
    return Zk(this.ZF, zqg, this.Zs, paramClass);
  }
  
  public Zz_ Zr(Zqg paramZqg) {
    return (paramZqg == this.ZU) ? this : new Zz_(this.ZF, paramZqg, this.Zs, this.Zd);
  }
  
  public Zqg Zs() {
    return this.ZF;
  }
  
  public Zqg Zq() {
    return this.ZU;
  }
  
  public Class<?> ZQ() {
    return this.Zs;
  }
  
  public Class<?> Zv() {
    return this.Zd;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(80);
    stringBuilder.append(a(-25180, 2094)).append(this.ZF).append(a(-25181, -6112)).append(this.ZU);
    if (this.Zs != null)
      stringBuilder.append(a(-25184, -15991)).append(this.Zs.getName()).append(a(-25183, -27065)); 
    if (this.Zd != null)
      stringBuilder.append(a(-25182, 6098)).append(this.Zd.getName()).append(a(-25179, 24879)); 
    return stringBuilder.append(')').toString();
  }
  
  public int hashCode() {
    return (this.ZF.hashCode() << 2) + this.ZU.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zz_ zz_ = (Zz_)paramObject;
    return (zz_.ZF == this.ZF && zz_.ZU == this.ZU && zz_.Zs == this.Zs && zz_.Zd == this.Zd);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'µCxUÓ\\r|Gw+rKEo\\ta£ã\\fýV$È ªÀYÅñ\\tâü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc '¢¹¦6ô¦ªÈ,¯»R\\tºð#úÓÇF\\tT,½lç\\ro'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #13
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zz_.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zz_.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #6
    //   214: goto -> 244
    //   217: bipush #110
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #14
    //   229: goto -> 244
    //   232: bipush #61
    //   234: goto -> 244
    //   237: bipush #22
    //   239: goto -> 244
    //   242: bipush #54
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new com/fasterxml/Zz_
    //   303: dup
    //   304: getstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   307: getstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   310: aconst_null
    //   311: aconst_null
    //   312: invokespecial <init> : (Lcom/fasterxml/Zqg;Lcom/fasterxml/Zqg;Ljava/lang/Class;Ljava/lang/Class;)V
    //   315: putstatic com/fasterxml/Zz_.ZR : Lcom/fasterxml/Zz_;
    //   318: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9DA1) & 0xFFFF;
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
      char c = '¤';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */