package burp;

import burp.api.montoya.utilities.json.JsonNode;
import burp.api.montoya.utilities.json.JsonParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zd4;
import net.portswigger.Zi7;
import net.portswigger.Zk_;
import net.portswigger.Zlh;
import net.portswigger.Zrmq;
import net.portswigger.Zv3;
import net.portswigger.Zzo;

public class Zrqy {
  private static final String[] a;
  
  private static final String[] b;
  
  public static JsonNode ZD(String paramString) {
    try {
      Zrmq zrmq = Zv3.Zp(paramString);
      return ZR(zrmq);
    } catch (Zlh|net.portswigger.Znd zlh) {
      Zah.Zl((Throwable)zlh, Zk_.COMMON_RUNTIME_FAILURE);
      throw new JsonParseException(a(8014, 25259));
    } 
  }
  
  static JsonNode ZR(Zrmq paramZrmq) {
    Objects.requireNonNull(paramZrmq, a(8008, -427));
    if (paramZrmq.Zw()) {
      List<JsonNode> list = (List)paramZrmq.ZT().Zc().map(Zrqy::ZR).collect(Collectors.toList());
      return new Zl6_(list);
    } 
    try {
      if (paramZrmq.Zr())
        return new Zl63(paramZrmq.ZW()); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (paramZrmq.Zh())
        return new Zl60(Boolean.valueOf(paramZrmq.Zm())); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (paramZrmq.Zy())
        return new Zl64(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    if (paramZrmq.Zb()) {
      Number number = Zo(paramZrmq.ZV());
      return new Zl6p(number);
    } 
    if (paramZrmq.Za()) {
      Map<String, JsonNode> map = (Map)paramZrmq.Zu().Zx().map(Zrqy::lambda$convert$0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Zrqy::lambda$convert$1, java.util.LinkedHashMap::new));
      return new Zl6s(map);
    } 
    throw new IllegalArgumentException(a(8015, -32113));
  }
  
  private static Number Zo(Zzo paramZzo) {
    Double double_;
    Byte byte_ = null;
    if (paramZzo.ZG()) {
      byte_ = Byte.valueOf(paramZzo.ZF());
    } else if (paramZzo.Zd()) {
      Short short_ = Short.valueOf(paramZzo.ZC());
    } else if (paramZzo.ZE()) {
      Integer integer = Integer.valueOf(paramZzo.ZR());
    } else if (paramZzo.Zf()) {
      Long long_ = Long.valueOf(paramZzo.Zz());
    } else if (paramZzo.Zt()) {
      Float float_ = Float.valueOf(paramZzo.ZS());
    } else if (paramZzo.ZB()) {
      double_ = Double.valueOf(paramZzo.Zn());
    } 
    return double_;
  }
  
  static Zrmq Z_(JsonNode paramJsonNode) {
    if (paramJsonNode.isArray()) {
      List list = paramJsonNode.asArray().getValue().stream().map(Zrqy::Z_).toList();
      return Zv3.ZV(list).ZP();
    } 
    try {
      if (paramJsonNode.isBoolean())
        return Zv3.ZK(paramJsonNode.asBoolean().booleanValue()).ZP(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (paramJsonNode.isNull())
        return Zv3.ZE().ZP(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (paramJsonNode.isNumber())
        return Zv3.ZM(paramJsonNode.asNumber()).ZP(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    if (paramJsonNode.isObject()) {
      Zi7 zi7 = Zv3.ZU();
      paramJsonNode.asObject().getValue().forEach(zi7::lambda$convert$2);
      return zi7.ZP();
    } 
    try {
      if (paramJsonNode.isString())
        return Zv3.ZN(paramJsonNode.asString()).ZP(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(8012, 2120) + a(8012, 2120));
  }
  
  private static void lambda$convert$2(Zi7 paramZi7, String paramString, JsonNode paramJsonNode) {
    paramZi7.ZN(paramString, (Zd4)Objects.requireNonNull(Z_(paramJsonNode), a(8013, -12367)));
  }
  
  private static JsonNode lambda$convert$1(JsonNode paramJsonNode1, JsonNode paramJsonNode2) {
    return paramJsonNode1;
  }
  
  private static Map.Entry lambda$convert$0(Map.Entry paramEntry) {
    return Map.entry((String)paramEntry.getKey(), Objects.<JsonNode>requireNonNull(ZR((Zrmq)paramEntry.getValue()), a(8008, -427)));
  }
  
  private static Zlh a(Zlh paramZlh) {
    return paramZlh;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '5V¹<4ý¼gÆZjB]¥¬H³|é¾aô=â¤È®çÓcgÔ¨bÊÆêqÁÓ5j ötb+\\bÛ¯XM±Úq§áÑqâ¾sÌ\/[v'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #30
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #48
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
    //   67: ldc 'ÐDÎÂc¸õIëI,x)dSà÷ÂíF¹\\fùãi÷èëO¿6)ÜV"TxÒ¢%®(í#ö1'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #31
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #120
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
    //   128: putstatic burp/Zrqy.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zrqy.b : [Ljava/lang/String;
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
    //   212: bipush #37
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #126
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #105
    //   234: goto -> 244
    //   237: bipush #19
    //   239: goto -> 244
    //   242: bipush #64
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1F4C) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */