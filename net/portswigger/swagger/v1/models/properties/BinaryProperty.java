package net.portswigger.swagger.v1.models.properties;

import java.util.List;
import net.portswigger.swagger.v1.models.Xml;

public class BinaryProperty extends AbstractProperty implements Property {
  public static final String TYPE;
  
  protected List<String> _enum;
  
  protected Integer minLength = null;
  
  protected Integer maxLength = null;
  
  protected String pattern = null;
  
  protected String _default;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public BinaryProperty() {
    this.type = b(-25658, -18966);
    this.format = b(-25659, -4577);
  }
  
  public static boolean isType(String paramString1, String paramString2) {
    return (b(-25657, 1508).equals(paramString1) && b(-25664, -1750).equals(paramString2));
  }
  
  public BinaryProperty xml(Xml paramXml) {
    setXml(paramXml);
    return this;
  }
  
  public BinaryProperty minLength(Integer paramInteger) {
    setMinLength(paramInteger);
    return this;
  }
  
  public BinaryProperty maxLength(Integer paramInteger) {
    setMaxLength(paramInteger);
    return this;
  }
  
  public BinaryProperty pattern(String paramString) {
    setPattern(paramString);
    return this;
  }
  
  public BinaryProperty _default(String paramString) {
    this._default = paramString;
    return this;
  }
  
  public BinaryProperty vendorExtension(String paramString, Object paramObject) {
    setVendorExtension(paramString, paramObject);
    return this;
  }
  
  public BinaryProperty readOnly() {
    setReadOnly(Boolean.TRUE);
    return this;
  }
  
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public void setMinLength(Integer paramInteger) {
    this.minLength = paramInteger;
  }
  
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public void setMaxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(String paramString) {
    this.pattern = paramString;
  }
  
  public String getDefault() {
    return this._default;
  }
  
  public void setDefault(String paramString) {
    this._default = paramString;
  }
  
  public List<String> getEnum() {
    return this._enum;
  }
  
  public void setEnum(List<String> paramList) {
    this._enum = paramList;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    null = 31 * null + ((this._default == null) ? 0 : this._default.hashCode());
    null = 31 * null + ((this._enum == null) ? 0 : this._enum.hashCode());
    null = 31 * null + ((this.maxLength == null) ? 0 : this.maxLength.hashCode());
    null = 31 * null + ((this.minLength == null) ? 0 : this.minLength.hashCode());
    return 31 * null + ((this.pattern == null) ? 0 : this.pattern.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (!super.equals(paramObject))
      return false; 
    if (!(paramObject instanceof BinaryProperty))
      return false; 
    BinaryProperty binaryProperty = (BinaryProperty)paramObject;
    if (this._default == null) {
      if (binaryProperty._default != null)
        return false; 
    } else if (!this._default.equals(binaryProperty._default)) {
      return false;
    } 
    if (this._enum == null) {
      if (binaryProperty._enum != null)
        return false; 
    } else if (!this._enum.equals(binaryProperty._enum)) {
      return false;
    } 
    if (this.maxLength == null) {
      if (binaryProperty.maxLength != null)
        return false; 
    } else if (!this.maxLength.equals(binaryProperty.maxLength)) {
      return false;
    } 
    if (this.minLength == null) {
      if (binaryProperty.minLength != null)
        return false; 
    } else if (!this.minLength.equals(binaryProperty.minLength)) {
      return false;
    } 
    if (this.pattern == null) {
      if (binaryProperty.pattern != null)
        return false; 
    } else if (!this.pattern.equals(binaryProperty.pattern)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '!õøü¤]­çF\\bðÔÀ"Ä#'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #20
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 153
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
    //   67: ldc 'Ý+@ å¤l@^9'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #126
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 153
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
    //   128: putstatic net/portswigger/swagger/v1/models/properties/BinaryProperty.c : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/swagger/v1/models/properties/BinaryProperty.d : [Ljava/lang/String;
    //   138: sipush #-25660
    //   141: sipush #-1606
    //   144: invokestatic b : (II)Ljava/lang/String;
    //   147: putstatic net/portswigger/swagger/v1/models/properties/BinaryProperty.TYPE : Ljava/lang/String;
    //   150: goto -> 312
    //   153: dup_x2
    //   154: pop
    //   155: invokevirtual toCharArray : ()[C
    //   158: dup_x1
    //   159: arraylength
    //   160: dup_x2
    //   161: pop
    //   162: iconst_0
    //   163: istore #6
    //   165: dup2_x1
    //   166: pop2
    //   167: dup_x2
    //   168: iconst_1
    //   169: if_icmpgt -> 271
    //   172: dup2
    //   173: swap
    //   174: iload #6
    //   176: dup2_x1
    //   177: caload
    //   178: swap
    //   179: iload #6
    //   181: bipush #7
    //   183: irem
    //   184: tableswitch default -> 253, 0 -> 224, 1 -> 229, 2 -> 234, 3 -> 238, 4 -> 243, 5 -> 248
    //   224: bipush #57
    //   226: goto -> 255
    //   229: bipush #43
    //   231: goto -> 255
    //   234: iconst_2
    //   235: goto -> 255
    //   238: bipush #34
    //   240: goto -> 255
    //   243: bipush #63
    //   245: goto -> 255
    //   248: bipush #51
    //   250: goto -> 255
    //   253: bipush #55
    //   255: ixor
    //   256: ixor
    //   257: i2c
    //   258: castore
    //   259: iinc #6, 1
    //   262: dup
    //   263: ifne -> 271
    //   266: dup2
    //   267: dup_x1
    //   268: goto -> 176
    //   271: dup2_x1
    //   272: pop2
    //   273: dup_x2
    //   274: iload #6
    //   276: if_icmpgt -> 172
    //   279: pop
    //   280: new java/lang/String
    //   283: dup_x1
    //   284: swap
    //   285: invokespecial <init> : ([C)V
    //   288: invokevirtual intern : ()Ljava/lang/String;
    //   291: swap
    //   292: pop
    //   293: swap
    //   294: tableswitch default -> 39, 0 -> 98
    //   312: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9BC4) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\BinaryProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */