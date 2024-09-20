package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zm.Zb;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zs9;
import java.io.IOException;

public class Z_0 extends Zs9 {
  private static final String[] d;
  
  private static final String[] e;
  
  public Z_0() {
    super(Object.class);
  }
  
  public Z_0(Class<?> paramClass) {
    super(paramClass);
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (paramZyi.ZW(Zy0.FAIL_ON_EMPTY_BEANS))
        Zm(paramZyi, paramObject); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    super.serialize(paramObject, paramZf, paramZyi);
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    try {
      if (paramZyi.ZW(Zy0.FAIL_ON_EMPTY_BEANS))
        Zm(paramZyi, paramObject); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    super.Zo(paramObject, paramZf, paramZyi, paramZa);
  }
  
  protected void Zm(Zyi paramZyi, Object paramObject) throws Zy_ {
    Class<?> clazz = paramObject.getClass();
    String str = Zj.Zl();
    try {
      if (Zb.ZS(clazz)) {
        try {
          paramZyi.ZA(Zz(), String.format(b(-16823, 1376), new Object[] { clazz.getName() }));
          if (str != null) {
            paramZyi.ZA(Zz(), String.format(b(-16824, 16675), new Object[] { clazz.getName() }));
            return;
          } 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    paramZyi.ZA(Zz(), String.format(b(-16824, 16675), new Object[] { clazz.getName() }));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '®ò2î¨¥n©X»[¦¶Iï9iágÞò<'-]Ó´týüä8°âxÊÎþÍÐª§lø¹/}ÅéUÊTýFèi\\nèÎD¡öuNNÐj¼>¥8áåXciüdì9F >AÇUiþÏSä0Y°÷Æ½æ¥¬\\bhúàâÑ|pR¼,FP\\t0EC7õPěÌå~\\f!ù¼å2ØÃc¥ª+øu½VUÔMãÅÐÀ\\fê°ó¸\\t;Ä\\tàfQÞh|½ëqåö=´-{Rîþ~F\\nÄÿÏ4ùBn°ö}Y5Û.!vû¬ïÜ.\\nâbpL£$WGf\\n@\ð'dÚ|àçyÈ` j$¼%i÷\\rC^Êy$GEÒr¼¨ä1+È3Î'éÒØp81¬{S3ÝnRf~±?ÐÅkG+#!(Â¬cíz¢è'¹ËÁ}.ÕÅ|óbÖ\\r¶g÷Ióz |\ueã14){U}0íÀ%ûC$ÏFÞÀô%·¡õØîÙYTÈnV\\r®>ú&­û©c}'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: sipush #157
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 83
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
    //   68: aload #5
    //   70: putstatic com/fasterxml/Zn/Z_0.d : [Ljava/lang/String;
    //   73: iconst_2
    //   74: anewarray java/lang/String
    //   77: putstatic com/fasterxml/Zn/Z_0.e : [Ljava/lang/String;
    //   80: goto -> 227
    //   83: dup_x2
    //   84: pop
    //   85: invokevirtual toCharArray : ()[C
    //   88: dup_x1
    //   89: arraylength
    //   90: dup_x2
    //   91: pop
    //   92: iconst_0
    //   93: istore #6
    //   95: dup2_x1
    //   96: pop2
    //   97: dup_x2
    //   98: iconst_1
    //   99: if_icmpgt -> 200
    //   102: dup2
    //   103: swap
    //   104: iload #6
    //   106: dup2_x1
    //   107: caload
    //   108: swap
    //   109: iload #6
    //   111: bipush #7
    //   113: irem
    //   114: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #19
    //   154: goto -> 184
    //   157: bipush #112
    //   159: goto -> 184
    //   162: bipush #30
    //   164: goto -> 184
    //   167: bipush #115
    //   169: goto -> 184
    //   172: bipush #80
    //   174: goto -> 184
    //   177: bipush #69
    //   179: goto -> 184
    //   182: bipush #14
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 106
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 102
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
    //   224: goto -> 40
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBE48) & 0xFFFF;
    if (e[i] == null) {
      char[] arrayOfChar = d[i].toCharArray();
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
      byte b1 = 118;
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
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Z_0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */