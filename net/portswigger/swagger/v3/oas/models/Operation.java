package net.portswigger.swagger.v3.oas.models;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.oas.models.security.SecurityRequirement;
import net.portswigger.swagger.v3.oas.models.servers.Server;

public class Operation {
  private List<String> tags = null;
  
  private String summary = null;
  
  private String description = null;
  
  private ExternalDocumentation externalDocs = null;
  
  private String operationId = null;
  
  private List<Parameter> parameters = null;
  
  private RequestBody requestBody = null;
  
  private ApiResponses responses = null;
  
  private Map<String, Callback> callbacks = null;
  
  private Boolean deprecated = null;
  
  private List<SecurityRequirement> security = null;
  
  private List<Server> servers = null;
  
  private Map<String, Object> extensions = null;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public List<String> getTags() {
    return this.tags;
  }
  
  public void setTags(List<String> paramList) {
    this.tags = paramList;
  }
  
  public Operation tags(List<String> paramList) {
    this.tags = paramList;
    return this;
  }
  
  public Operation addTagsItem(String paramString) {
    if (this.tags == null)
      this.tags = new ArrayList<>(); 
    this.tags.add(paramString);
    return this;
  }
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
  
  public Operation summary(String paramString) {
    this.summary = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Operation description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public ExternalDocumentation getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocumentation paramExternalDocumentation) {
    this.externalDocs = paramExternalDocumentation;
  }
  
  public Operation externalDocs(ExternalDocumentation paramExternalDocumentation) {
    this.externalDocs = paramExternalDocumentation;
    return this;
  }
  
  public String getOperationId() {
    return this.operationId;
  }
  
  public void setOperationId(String paramString) {
    this.operationId = paramString;
  }
  
  public Operation operationId(String paramString) {
    this.operationId = paramString;
    return this;
  }
  
  public List<Parameter> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(List<Parameter> paramList) {
    this.parameters = paramList;
  }
  
  public Operation parameters(List<Parameter> paramList) {
    this.parameters = paramList;
    return this;
  }
  
  public Operation addParametersItem(Parameter paramParameter) {
    if (this.parameters == null)
      this.parameters = new ArrayList<>(); 
    this.parameters.add(paramParameter);
    return this;
  }
  
  public RequestBody getRequestBody() {
    return this.requestBody;
  }
  
  public void setRequestBody(RequestBody paramRequestBody) {
    this.requestBody = paramRequestBody;
  }
  
  public Operation requestBody(RequestBody paramRequestBody) {
    this.requestBody = paramRequestBody;
    return this;
  }
  
  public ApiResponses getResponses() {
    return this.responses;
  }
  
  public void setResponses(ApiResponses paramApiResponses) {
    this.responses = paramApiResponses;
  }
  
  public Operation responses(ApiResponses paramApiResponses) {
    this.responses = paramApiResponses;
    return this;
  }
  
  public Map<String, Callback> getCallbacks() {
    return this.callbacks;
  }
  
  public void setCallbacks(Map<String, Callback> paramMap) {
    this.callbacks = paramMap;
  }
  
  public Operation callbacks(Map<String, Callback> paramMap) {
    this.callbacks = paramMap;
    return this;
  }
  
  public Operation addCallback(String paramString, Callback paramCallback) {
    if (this.callbacks == null)
      this.callbacks = new LinkedHashMap<>(); 
    this.callbacks.put(paramString, paramCallback);
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public void setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
  }
  
  public Operation deprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public List<SecurityRequirement> getSecurity() {
    return this.security;
  }
  
  public void setSecurity(List<SecurityRequirement> paramList) {
    this.security = paramList;
  }
  
  public Operation security(List<SecurityRequirement> paramList) {
    this.security = paramList;
    return this;
  }
  
  public Operation addSecurityItem(SecurityRequirement paramSecurityRequirement) {
    if (this.security == null)
      this.security = new ArrayList<>(); 
    this.security.add(paramSecurityRequirement);
    return this;
  }
  
  public List<Server> getServers() {
    return this.servers;
  }
  
  public void setServers(List<Server> paramList) {
    this.servers = paramList;
  }
  
  public Operation servers(List<Server> paramList) {
    this.servers = paramList;
    return this;
  }
  
  public Operation addServersItem(Server paramServer) {
    if (this.servers == null)
      this.servers = new ArrayList<>(); 
    this.servers.add(paramServer);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Operation operation = (Operation)paramObject;
    return (Objects.equals(this.tags, operation.tags) && Objects.equals(this.summary, operation.summary) && Objects.equals(this.description, operation.description) && Objects.equals(this.externalDocs, operation.externalDocs) && Objects.equals(this.operationId, operation.operationId) && Objects.equals(this.parameters, operation.parameters) && Objects.equals(this.requestBody, operation.requestBody) && Objects.equals(this.responses, operation.responses) && Objects.equals(this.callbacks, operation.callbacks) && Objects.equals(this.deprecated, operation.deprecated) && Objects.equals(this.security, operation.security) && Objects.equals(this.servers, operation.servers) && Objects.equals(this.extensions, operation.extensions));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { 
          this.tags, this.summary, this.description, this.externalDocs, this.operationId, this.parameters, this.requestBody, this.responses, this.callbacks, this.deprecated, 
          this.security, this.servers, this.extensions });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(9558, 20912)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(9553, 1909)) || paramString.startsWith(a(9567, 28895))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Operation extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(9556, 3475));
    stringBuilder.append(a(9559, 10107)).append(toIndentedString(this.tags)).append("\n");
    stringBuilder.append(a(9552, 97)).append(toIndentedString(this.summary)).append("\n");
    stringBuilder.append(a(9564, -22691)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(9561, 4630)).append(toIndentedString(this.externalDocs)).append("\n");
    stringBuilder.append(a(9562, 22891)).append(toIndentedString(this.operationId)).append("\n");
    stringBuilder.append(a(9555, 4705)).append(toIndentedString(this.parameters)).append("\n");
    stringBuilder.append(a(9537, -23072)).append(toIndentedString(this.requestBody)).append("\n");
    stringBuilder.append(a(9536, 5845)).append(toIndentedString(this.responses)).append("\n");
    stringBuilder.append(a(9563, -22697)).append(toIndentedString(this.callbacks)).append("\n");
    stringBuilder.append(a(9557, 16819)).append(toIndentedString(this.deprecated)).append("\n");
    stringBuilder.append(a(9560, -17665)).append(toIndentedString(this.security)).append("\n");
    stringBuilder.append(a(9554, 13312)).append(toIndentedString(this.servers)).append("\n");
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(9566, 1683) : paramObject.toString().replace("\n", a(9565, 23152));
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ïm_¾N,æ|M+qÉ×&aP\\rc|}\\fee­ùö¬Ky+é\\f¼äå332ührSlºä¥É#Ö(°P4I8w2×,j÷B\\nlóh7 ð£÷¨ÑFÔíÉnT0Ò¿@Ü ­eµgEfc>"eòÀËèÐÏå'üº~æñÁÖqbûûÛ* >¥×Íw´ÃñõÛLÝ8FÌK`vZ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #65
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
    //   68: ldc 'ZZ/8X3NÇbÊ<B~moQÖg9$í0]bHG'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #100
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
    //   129: putstatic net/portswigger/swagger/v3/oas/models/Operation.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/swagger/v3/oas/models/Operation.b : [Ljava/lang/String;
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
    //   212: bipush #23
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #106
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #43
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
    int i = (paramInt1 ^ 0x2550) & 0xFFFF;
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
      byte b1 = 102;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\Operation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */