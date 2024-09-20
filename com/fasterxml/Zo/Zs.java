package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Ze.Zq;
import com.fasterxml.Ze.Zw;
import com.fasterxml.Ze.Zz;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zv;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zq_;
import com.fasterxml.Zy8;
import com.fasterxml.Zys;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class Zs extends Zyo<Object> implements Zi, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zk Zk;
  
  protected final Zz ZP;
  
  protected final Map<String, Zv> Zq;
  
  protected transient Map<String, Zv> ZY;
  
  protected final boolean ZC;
  
  protected final boolean ZO;
  
  protected final boolean Z_;
  
  protected final boolean ZT;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zs(Zh paramZh, Zyv paramZyv, Map<String, Zv> paramMap1, Map<String, Zv> paramMap2) {
    this.Zk = paramZyv.Zf();
    this.ZP = paramZh.Zz();
    this.Zq = paramMap1;
    this.ZY = paramMap2;
    Class<boolean> clazz = this.Zk.Zf();
    this.ZC = clazz.isAssignableFrom(String.class);
    this.ZO = (clazz == boolean.class || clazz.isAssignableFrom(Boolean.class));
    this.Z_ = (clazz == int.class || clazz.isAssignableFrom(Integer.class));
    this.ZT = (clazz == double.class || clazz.isAssignableFrom(Double.class));
  }
  
  protected Zs(Zyv paramZyv) {
    this.Zk = paramZyv.Zf();
    this.ZP = null;
    this.Zq = null;
    Class<boolean> clazz = this.Zk.Zf();
    this.ZC = clazz.isAssignableFrom(String.class);
    this.ZO = (clazz == boolean.class || clazz.isAssignableFrom(Boolean.class));
    this.Z_ = (clazz == int.class || clazz.isAssignableFrom(Integer.class));
    this.ZT = (clazz == double.class || clazz.isAssignableFrom(Double.class));
  }
  
  protected Zs(Zs paramZs, Zz paramZz, Map<String, Zv> paramMap) {
    this.Zk = paramZs.Zk;
    this.Zq = paramZs.Zq;
    this.ZC = paramZs.ZC;
    this.ZO = paramZs.ZO;
    this.Z_ = paramZs.Z_;
    this.ZT = paramZs.ZT;
    this.ZP = paramZz;
    this.ZY = paramMap;
  }
  
  public static Zs Zw(Zyv paramZyv) {
    return new Zs(paramZyv);
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zt zt = paramZyg.Zv();
    try {
      if (paramZo != null && zt != null) {
        Ziz ziz = paramZo.ZQ();
        if (ziz != null) {
          Zv zv = zt.Zk((Ziv)ziz);
          if (zv != null) {
            Zk zk;
            Zys zys;
            Zv zv1 = null;
            Zq_ zq_ = paramZyg.ZN((Ziv)ziz, zv);
            zv = zt.Zq((Ziv)ziz, zv);
            Class<Zy8> clazz = zv.ZM();
            if (clazz == Zy8.class) {
              Zr zr = zv.ZT();
              try {
              
              } catch (Zy_ zy_) {
                throw a(null);
              } 
              zv1 = (this.ZY == null) ? null : this.ZY.get(zr.Zb());
              try {
                if (zv1 == null)
                  paramZyg.Zm(this.Zk, String.format(b(-17932, 2332), new Object[] { Zx.Za(ZX()), Zx.Zk(zr) })); 
              } catch (Zy_ zy_) {
                throw a(null);
              } 
              zk = zv1.Zp();
              Zq zq = new Zq(zv.Zs());
            } else {
              zq_ = paramZyg.ZN((Ziv)ziz, zv);
              Zk zk1 = paramZyg.ZW(clazz);
              zk = paramZyg.ZL().Zs(zk1, Zys.class)[0];
              zys = paramZyg.Zm((Ziv)ziz, zv);
            } 
            Zyo zyo = paramZyg.ZP(zk);
            Zz zz = Zz.ZK(zk, zv.ZT(), zys, zyo, zv1, zq_);
            return new Zs(this, zz, null);
          } 
        } 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (this.ZY == null)
        return this; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return new Zs(this, this.ZP, null);
  }
  
  public Class<?> ZX() {
    return this.Zk.Zf();
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Zd Zb() {
    return Zd.POJO;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return null;
  }
  
  public Zz Zd() {
    return this.ZP;
  }
  
  public Zv ZW(String paramString) {
    return (this.Zq == null) ? null : this.Zq.get(paramString);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    if (this.ZP != null) {
      Zl zl = paramZg.Zh();
      try {
        if (zl != null) {
          try {
            if (zl.Zl())
              return ZS(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          if (zl == Zl.START_OBJECT)
            zl = paramZg.ZV(); 
          try {
            if (zl == Zl.FIELD_NAME)
              try {
                if (this.ZP.ZI())
                  try {
                    if (this.ZP.ZW(paramZg.ZS(), paramZg))
                      return ZS(paramZg, paramZyg); 
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    Object object = Zb(paramZg, paramZyg);
    try {
      if (object != null)
        return object; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZt.ZC(paramZg, paramZyg);
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    Zzt zzt = new Zzt(this.Zk);
    return paramZyg.ZV(this.Zk.Zf(), zzt, paramZg, b(-17931, -3897), new Object[0]);
  }
  
  protected Object Zb(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 6:
          try {
            if (this.ZC)
              return paramZg.ZR(); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 7:
          try {
            if (this.Z_)
              return Integer.valueOf(paramZg.Ze()); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 8:
          try {
            if (this.ZT)
              return Double.valueOf(paramZg.ZH()); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 9:
          try {
            if (this.ZO)
              return Boolean.TRUE; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 10:
          try {
            if (this.ZO)
              return Boolean.FALSE; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  protected Object ZS(Zg paramZg, Zyg paramZyg) throws IOException {
    Object object1 = this.ZP.ZB(paramZg, paramZyg);
    Zw zw = paramZyg.Zi(object1, this.ZP.Zj, this.ZP.ZL);
    Object object2 = zw.Zp();
    try {
      if (object2 == null)
        throw new Zz7(paramZg, b(-17929, 3857) + object1 + b(-17930, -26687), paramZg.Zz(), zw); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return object2;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'öDÀ=ZV\\r°\\nñÓÿ¶Hô¢Ý²ÇfüäÆ\\t´]2xD}Ü:þÄ¦âÍÜéC®Q\\f\º~\\nà¢hÍiÌ+ãìÿªX-I!«}·ÜL_\\n`ÌÂ9§-^÷ª§[bvÿºc¬ØN#%'S¿ª FuäpFA$GýæoPº^:Cjk7¢P\\tÊøBªÀèØþÍC»NÛµ/ãº>qO÷½sPäãÉ\\nÝqËµô/'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #123
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #74
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '²Õxô/¦me¯EG:&ÙZ³i»¢çdîü"ÅKâ¯D(ÌËä¯z¤*J\\n úÊu§µ>Íwù'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #29
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #60
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic com/fasterxml/Zo/Zs.c : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zo/Zs.d : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
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
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #48
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #29
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #104
    //   239: goto -> 244
    //   242: bipush #111
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB9F5) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 91;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */