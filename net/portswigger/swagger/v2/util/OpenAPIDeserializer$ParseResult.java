package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import com.fasterxml.Zor.Zb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OpenAPIDeserializer$ParseResult {
  private boolean valid = true;
  
  private Map<OpenAPIDeserializer$Location, Zb> extra = new LinkedHashMap<>();
  
  private Map<OpenAPIDeserializer$Location, Zb> unsupported = new LinkedHashMap<>();
  
  private Map<OpenAPIDeserializer$Location, String> invalidType = new LinkedHashMap<>();
  
  private List<OpenAPIDeserializer$Location> missing = new ArrayList<>();
  
  private List<OpenAPIDeserializer$Location> warnings = new ArrayList<>();
  
  private List<OpenAPIDeserializer$Location> unique = new ArrayList<>();
  
  private List<OpenAPIDeserializer$Location> uniqueTags = new ArrayList<>();
  
  private boolean allowEmptyStrings = true;
  
  private List<OpenAPIDeserializer$Location> reserved = new ArrayList<>();
  
  private boolean validateInternalRefs;
  
  private boolean inferSchemaType = true;
  
  private boolean openapi31 = false;
  
  private boolean oaiAuthor = false;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public boolean isInferSchemaType() {
    return this.inferSchemaType;
  }
  
  public void setInferSchemaType(boolean paramBoolean) {
    this.inferSchemaType = paramBoolean;
  }
  
  public OpenAPIDeserializer$ParseResult inferSchemaType(boolean paramBoolean) {
    this.inferSchemaType = paramBoolean;
    return this;
  }
  
  public boolean isAllowEmptyStrings() {
    return this.allowEmptyStrings;
  }
  
  public void setAllowEmptyStrings(boolean paramBoolean) {
    this.allowEmptyStrings = paramBoolean;
  }
  
  public OpenAPIDeserializer$ParseResult allowEmptyStrings(boolean paramBoolean) {
    this.allowEmptyStrings = paramBoolean;
    return this;
  }
  
  public void unsupported(String paramString1, String paramString2, Zb paramZb) {
    this.unsupported.put(new OpenAPIDeserializer$Location(paramString1, paramString2), paramZb);
  }
  
  public void reserved(String paramString1, String paramString2) {
    this.reserved.add(new OpenAPIDeserializer$Location(paramString1, paramString2));
  }
  
  public void extra(String paramString1, String paramString2, Zb paramZb) {
    this.extra.put(new OpenAPIDeserializer$Location(paramString1, paramString2), paramZb);
  }
  
  public void missing(String paramString1, String paramString2) {
    this.missing.add(new OpenAPIDeserializer$Location(paramString1, paramString2));
  }
  
  public void warning(String paramString1, String paramString2) {
    this.warnings.add(new OpenAPIDeserializer$Location(paramString1, paramString2));
  }
  
  public void unique(String paramString1, String paramString2) {
    this.unique.add(new OpenAPIDeserializer$Location(paramString1, paramString2));
  }
  
  public void uniqueTags(String paramString1, String paramString2) {
    this.uniqueTags.add(new OpenAPIDeserializer$Location(paramString1, paramString2));
  }
  
  public void invalidType(String paramString1, String paramString2, String paramString3, Zb paramZb) {
    this.invalidType.put(new OpenAPIDeserializer$Location(paramString1, paramString2), paramString3);
  }
  
  public void invalid() {
    this.valid = false;
  }
  
  public boolean isValid() {
    return this.valid;
  }
  
  public void setOpenapi31(boolean paramBoolean) {
    this.openapi31 = paramBoolean;
  }
  
  public OpenAPIDeserializer$ParseResult openapi31(boolean paramBoolean) {
    this.openapi31 = paramBoolean;
    return this;
  }
  
  public boolean isOpenapi31() {
    return this.openapi31;
  }
  
  public boolean isOaiAuthor() {
    return this.oaiAuthor;
  }
  
  public void setOaiAuthor(boolean paramBoolean) {
    this.oaiAuthor = paramBoolean;
  }
  
  public OpenAPIDeserializer$ParseResult oaiAuthor(boolean paramBoolean) {
    this.oaiAuthor = paramBoolean;
    return this;
  }
  
  public List<String> getMessages() {
    ArrayList<String> arrayList = new ArrayList();
    null = this.extra.keySet().iterator();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    while (null.hasNext()) {
      OpenAPIDeserializer$Location openAPIDeserializer$Location = null.next();
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = openAPIDeserializer$Location.key;
      String str4 = str1;
      String str2 = a(-29648, -1984) + a(-29648, -1984) + str4 + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.invalidType.keySet()) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = this.invalidType.get(openAPIDeserializer$Location);
      String str4 = openAPIDeserializer$Location.key;
      String str5 = str1;
      String str2 = a(-29637, 11443) + a(-29637, 11443) + str5 + str4 + a(-29642, 32395) + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.missing) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = openAPIDeserializer$Location.key;
      String str4 = str1;
      String str2 = a(-29637, 11443) + a(-29637, 11443) + str4 + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.warnings) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str2 = str1 + str1;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.unsupported.keySet()) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = openAPIDeserializer$Location.key;
      String str4 = str1;
      String str2 = a(-29637, 11443) + a(-29637, 11443) + str4 + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.unique) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = openAPIDeserializer$Location.key;
      String str4 = str1;
      String str2 = a(-29637, 11443) + a(-29637, 11443) + str4 + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.uniqueTags) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = openAPIDeserializer$Location.key;
      String str4 = str1;
      String str2 = a(-29637, 11443) + a(-29637, 11443) + str4 + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    for (OpenAPIDeserializer$Location openAPIDeserializer$Location : this.reserved) {
      String str1 = openAPIDeserializer$Location.location.equals("") ? "" : (openAPIDeserializer$Location.location + ".");
      String str3 = openAPIDeserializer$Location.key;
      String str4 = str1;
      String str2 = a(-29637, 11443) + a(-29637, 11443) + str4 + str3;
      arrayList.add(str2);
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  public void setValidateInternalRefs(boolean paramBoolean) {
    this.validateInternalRefs = paramBoolean;
  }
  
  public boolean isValidateInternalRefs() {
    return this.validateInternalRefs;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'M+1²T×XtuØÕÓ &C¡KäúªÓ?d]3òz52\\tï¬åÆqî¾Otð®q!\\fëÿ²//MìÁò\\n]½GxÄisMarðmÑØ (£n!îè®ãs\\nù¤^ñh\\t°]\\f¥v6íÄ§0\\bnnì'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc 'IWáÿa'i<­W\\n;*A¡²è'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #67
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
    //   129: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult.b : [Ljava/lang/String;
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
    //   212: bipush #35
    //   214: goto -> 244
    //   217: bipush #14
    //   219: goto -> 244
    //   222: bipush #24
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #21
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #34
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C33) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\OpenAPIDeserializer$ParseResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */