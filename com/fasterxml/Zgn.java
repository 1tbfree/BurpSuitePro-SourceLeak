package com.fasterxml;

import burp.Zbqc;
import java.io.Serializable;

public class Zgn implements Zvs<Zv5>, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zgn Zd;
  
  protected final Zg_ Zz;
  
  protected final Zyc ZB;
  
  protected final String ZE;
  
  protected final Class<?> ZG;
  
  protected final boolean ZQ;
  
  protected final Boolean Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zgn(Zg_ paramZg_, Zyc paramZyc, String paramString, Class<?> paramClass, boolean paramBoolean, Boolean paramBoolean1) {
    this.ZG = paramClass;
    this.Zz = paramZg_;
    this.ZB = paramZyc;
    this.ZE = paramString;
    this.ZQ = paramBoolean;
    this.Zf = paramBoolean1;
  }
  
  public static Zgn ZF(Zg_ paramZg_, Zyc paramZyc, String paramString, Class<?> paramClass, boolean paramBoolean, Boolean paramBoolean1) {
    // Byte code:
    //   0: invokestatic ZF : ()[Ljava/lang/String;
    //   3: astore #6
    //   5: aload_2
    //   6: ifnull -> 16
    //   9: aload_2
    //   10: invokevirtual isEmpty : ()Z
    //   13: ifeq -> 33
    //   16: aload_0
    //   17: ifnull -> 30
    //   20: aload_0
    //   21: invokevirtual ZY : ()Ljava/lang/String;
    //   24: astore_2
    //   25: aload #6
    //   27: ifnull -> 33
    //   30: ldc ''
    //   32: astore_2
    //   33: aload_3
    //   34: ifnull -> 44
    //   37: aload_3
    //   38: invokevirtual isAnnotation : ()Z
    //   41: ifeq -> 46
    //   44: aconst_null
    //   45: astore_3
    //   46: new com/fasterxml/Zgn
    //   49: dup
    //   50: aload_0
    //   51: aload_1
    //   52: aload_2
    //   53: aload_3
    //   54: iload #4
    //   56: aload #5
    //   58: invokespecial <init> : (Lcom/fasterxml/Zg_;Lcom/fasterxml/Zyc;Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Boolean;)V
    //   61: areturn
  }
  
  public static Zgn Zz(Zv5 paramZv5) {
    return (paramZv5 == null) ? null : ZF(paramZv5.Ze(), paramZv5.ZZ(), paramZv5.Zr(), paramZv5.Zg(), paramZv5.Zk(), paramZv5.Z_().ZT());
  }
  
  public Zgn Zf(Class<?> paramClass) {
    return (paramClass == this.ZG) ? this : new Zgn(this.Zz, this.ZB, this.ZE, paramClass, this.ZQ, this.Zf);
  }
  
  public Zgn ZP(Zyc paramZyc) {
    return (paramZyc == this.ZB) ? this : new Zgn(this.Zz, paramZyc, this.ZE, this.ZG, this.ZQ, this.Zf);
  }
  
  public Class<?> Zl() {
    return this.ZG;
  }
  
  public Zg_ Zj() {
    return this.Zz;
  }
  
  public Zyc Zi() {
    return this.ZB;
  }
  
  public String ZH() {
    return this.ZE;
  }
  
  public boolean ZX() {
    return this.ZQ;
  }
  
  public Boolean ZG() {
    return this.Zf;
  }
  
  public String toString() {
    String[] arrayOfString = Zgy.ZF();
    if (Zbqc.Zwu() == null)
      Zgy.Zx(new String[1]); 
    return String.format(a(-27246, -29990), new Object[] { this.Zz, this.ZB, this.ZE, (this.ZG == null) ? a(-27245, 21511) : this.ZG.getName(), Boolean.valueOf(this.ZQ), this.Zf });
  }
  
  public int hashCode() {
    int i = 1;
    String[] arrayOfString = Zgy.ZF();
    i = 31 * i + ((this.Zz != null) ? this.Zz.hashCode() : 0);
    i = 31 * i + ((this.ZB != null) ? this.ZB.hashCode() : 0);
    i = 31 * i + ((this.ZE != null) ? this.ZE.hashCode() : 0);
    i = 31 * i + ((this.ZG != null) ? this.ZG.hashCode() : 0);
    i = 31 * i + (this.Zf.booleanValue() ? 11 : -17);
    i = 31 * i + (this.ZQ ? 11 : -17);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject.getClass() == getClass() && Zk(this, (Zgn)paramObject))));
  }
  
  private static boolean Zk(Zgn paramZgn1, Zgn paramZgn2) {
    return (paramZgn1.Zz == paramZgn2.Zz && paramZgn1.ZB == paramZgn2.ZB && paramZgn1.ZG == paramZgn2.ZG && paramZgn1.ZQ == paramZgn2.ZQ && ZS(paramZgn1.ZE, paramZgn2.ZE) && ZS(paramZgn1.Zf, paramZgn2.Zf));
  }
  
  private static <T> boolean ZS(T paramT1, T paramT2) {
    return (paramT1 == null) ? ((paramT2 == null)) : ((paramT2 == null) ? false : paramT1.equals(paramT2));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '{ÕKrJKÊïL;üú×ÊVzv§g·Í UðU°AÈ ­¯hõ ëÇ%¶aý]At¯% §,:Í=\\f K\\ff6«Ã2|6íþ 8­²\ÿ\\fo:Æ<\(ÎÂí·6qåà(CîäµóÓûP.Y°'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #75
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic com/fasterxml/Zgn.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic com/fasterxml/Zgn.b : [Ljava/lang/String;
    //   78: goto -> 226
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #36
    //   154: goto -> 183
    //   157: bipush #108
    //   159: goto -> 183
    //   162: bipush #73
    //   164: goto -> 183
    //   167: bipush #60
    //   169: goto -> 183
    //   172: bipush #107
    //   174: goto -> 183
    //   177: iconst_2
    //   178: goto -> 183
    //   181: bipush #39
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
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
    //   223: goto -> 38
    //   226: new com/fasterxml/Zgn
    //   229: dup
    //   230: getstatic com/fasterxml/Zg_.NONE : Lcom/fasterxml/Zg_;
    //   233: getstatic com/fasterxml/Zyc.PROPERTY : Lcom/fasterxml/Zyc;
    //   236: aconst_null
    //   237: aconst_null
    //   238: iconst_0
    //   239: aconst_null
    //   240: invokespecial <init> : (Lcom/fasterxml/Zg_;Lcom/fasterxml/Zyc;Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Boolean;)V
    //   243: putstatic com/fasterxml/Zgn.Zd : Lcom/fasterxml/Zgn;
    //   246: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9593) & 0xFFFF;
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
      char c = 'Î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */