package net.portswigger.swagger.v3.oas.models.headers;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.Schema;

public class Header {
  private String description = null;
  
  private String $ref = null;
  
  private Boolean required = null;
  
  private Boolean deprecated = null;
  
  private Header$StyleEnum style = null;
  
  private Boolean explode = null;
  
  private Schema schema = null;
  
  private Map<String, Example> examples = null;
  
  private Object example = null;
  
  private Content content = null;
  
  private Map<String, Object> extensions = null;
  
  private static boolean ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Header description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Boolean getRequired() {
    return this.required;
  }
  
  public void setRequired(Boolean paramBoolean) {
    this.required = paramBoolean;
  }
  
  public Header required(Boolean paramBoolean) {
    this.required = paramBoolean;
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public void setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
  }
  
  public Header deprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public Header$StyleEnum getStyle() {
    return this.style;
  }
  
  public void setStyle(Header$StyleEnum paramHeader$StyleEnum) {
    this.style = paramHeader$StyleEnum;
  }
  
  public Header style(Header$StyleEnum paramHeader$StyleEnum) {
    this.style = paramHeader$StyleEnum;
    return this;
  }
  
  public Boolean getExplode() {
    return this.explode;
  }
  
  public void setExplode(Boolean paramBoolean) {
    this.explode = paramBoolean;
  }
  
  public Header explode(Boolean paramBoolean) {
    this.explode = paramBoolean;
    return this;
  }
  
  public Schema getSchema() {
    return this.schema;
  }
  
  public void setSchema(Schema paramSchema) {
    this.schema = paramSchema;
  }
  
  public Header schema(Schema paramSchema) {
    this.schema = paramSchema;
    return this;
  }
  
  public Map<String, Example> getExamples() {
    return this.examples;
  }
  
  public void setExamples(Map<String, Example> paramMap) {
    this.examples = paramMap;
  }
  
  public Header examples(Map<String, Example> paramMap) {
    this.examples = paramMap;
    return this;
  }
  
  public Header addExample(String paramString, Example paramExample) {
    if (this.examples == null)
      this.examples = new LinkedHashMap<>(); 
    this.examples.put(paramString, paramExample);
    return this;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    this.example = paramObject;
  }
  
  public Header example(Object paramObject) {
    this.example = paramObject;
    return this;
  }
  
  public Content getContent() {
    return this.content;
  }
  
  public void setContent(Content paramContent) {
    this.content = paramContent;
  }
  
  public Header content(Content paramContent) {
    this.content = paramContent;
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Header header = (Header)paramObject;
    return (Objects.equals(this.description, header.description) && Objects.equals(this.required, header.required) && Objects.equals(this.deprecated, header.deprecated) && Objects.equals(this.style, header.style) && Objects.equals(this.explode, header.explode) && Objects.equals(this.schema, header.schema) && Objects.equals(this.examples, header.examples) && Objects.equals(this.example, header.example) && Objects.equals(this.content, header.content) && Objects.equals(this.extensions, header.extensions) && Objects.equals(this.$ref, header.$ref));
  }
  
  public int hashCode() {
    boolean bool = Zk();
    if (Zbqc.Zwu() == null)
      ZQ(!bool); 
    return Objects.hash(new Object[] { 
          this.description, this.required, this.deprecated, this.style, this.explode, this.schema, this.examples, this.example, this.content, this.extensions, 
          this.$ref });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(-5724, 14153)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Header extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    if (paramString != null && paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
      paramString = a(-5728, -19898) + a(-5728, -19898); 
    this.$ref = paramString;
  }
  
  public Header $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(-5714, 23728));
    stringBuilder.append(a(-5721, -23830)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(-5727, -5907)).append(toIndentedString(this.required)).append("\n");
    stringBuilder.append(a(-5715, 4989)).append(toIndentedString(this.deprecated)).append("\n");
    stringBuilder.append(a(-5725, 8884)).append(toIndentedString(this.style)).append("\n");
    stringBuilder.append(a(-5718, 11867)).append(toIndentedString(this.explode)).append("\n");
    stringBuilder.append(a(-5713, 4986)).append(toIndentedString(this.schema)).append("\n");
    stringBuilder.append(a(-5717, -24854)).append(toIndentedString(this.examples)).append("\n");
    stringBuilder.append(a(-5723, -18180)).append(toIndentedString(this.example)).append("\n");
    stringBuilder.append(a(-5720, -19011)).append(toIndentedString(this.content)).append("\n");
    boolean bool = Zk();
    stringBuilder.append(a(-5726, -1281)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(-5722, 11477) : paramObject.toString().replace("\n", a(-5719, 30237));
  }
  
  public static void ZQ(boolean paramBoolean) {
    ZE = paramBoolean;
  }
  
  public static boolean Zk() {
    return ZE;
  }
  
  public static boolean Zr() {
    boolean bool = Zk();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'í®ÒR¶îÙ¾¹\\nØ®tpC§¨à©sÆø©#Ës/Ï+>@à*Ç0.sÇeJ¹\\n\\b,ÕPe%:·ß¥%1²;Nãòµ&j\\r2;ú\\b»Wyë;\\roE¹~D S 7gS\\r©×Õ9\üèÞª&«q\\r~s]xoõÁh \\fÿÝIÔ\\b®Dê'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_0
    //   19: bipush #11
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZQ : (Z)V
    //   27: bipush #42
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'KÝÓ.C wp!¡v¾¼gGïaPA+×cÁ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #15
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #74
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic net/portswigger/swagger/v3/oas/models/headers/Header.a : [Ljava/lang/String;
    //   136: bipush #15
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/swagger/v3/oas/models/headers/Header.b : [Ljava/lang/String;
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
    //   216: bipush #87
    //   218: goto -> 248
    //   221: bipush #26
    //   223: goto -> 248
    //   226: bipush #61
    //   228: goto -> 248
    //   231: bipush #71
    //   233: goto -> 248
    //   236: bipush #109
    //   238: goto -> 248
    //   241: bipush #80
    //   243: goto -> 248
    //   246: bipush #74
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
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE9A3) & 0xFFFF;
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
      char c = 'ý';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\headers\Header.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */