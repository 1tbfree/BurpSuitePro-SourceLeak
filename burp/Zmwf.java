package burp;

import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueConfidence;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import burp.api.montoya.scanner.audit.issues.AuditIssueSeverity;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zmwf implements AuditIssue {
  private final AuditIssueDefinition ZJ;
  
  private final String ZU;
  
  private final String ZO;
  
  private final String ZS;
  
  private final HttpService ZD;
  
  private final String Zn;
  
  private final AuditIssueSeverity Zy;
  
  private final AuditIssueConfidence Zp;
  
  private final List<HttpRequestResponse> ZI;
  
  private final List<Interaction> ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zmwf(String paramString1, String paramString2, String paramString3, String paramString4, AuditIssueSeverity paramAuditIssueSeverity1, AuditIssueConfidence paramAuditIssueConfidence, String paramString5, String paramString6, AuditIssueSeverity paramAuditIssueSeverity2, List<HttpRequestResponse> paramList, List<Interaction> paramList1, Zbnt paramZbnt) {
    this.ZU = paramString1;
    this.ZO = paramString2;
    this.ZS = paramString3;
    this.Zn = paramString4;
    this.Zy = paramAuditIssueSeverity1;
    this.Zp = paramAuditIssueConfidence;
    this.ZI = paramList;
    this.ZE = paramList1;
    this.ZJ = Zs0.ZK(paramString1, paramString5, paramString6, paramAuditIssueSeverity2, Zzu2.EXTENSION_GENERATED.ZS());
    this.ZD = Zzhd.Zc(paramString4, paramZbnt);
  }
  
  public String name() {
    return this.ZU;
  }
  
  public String detail() {
    return this.ZO;
  }
  
  public String remediation() {
    return this.ZS;
  }
  
  public HttpService httpService() {
    return this.ZD;
  }
  
  public String baseUrl() {
    return this.Zn;
  }
  
  public AuditIssueSeverity severity() {
    return this.Zy;
  }
  
  public AuditIssueConfidence confidence() {
    return this.Zp;
  }
  
  public List<HttpRequestResponse> requestResponses() {
    return this.ZI;
  }
  
  public List<Interaction> collaboratorInteractions() {
    return this.ZE;
  }
  
  public AuditIssueDefinition definition() {
    return this.ZJ;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zmwf zmwf = (Zmwf)paramObject;
    return (Objects.equals(this.ZJ, zmwf.ZJ) && Objects.equals(this.ZU, zmwf.ZU) && Objects.equals(this.ZO, zmwf.ZO) && Objects.equals(this.ZS, zmwf.ZS) && Objects.equals(this.ZD, zmwf.ZD) && Objects.equals(this.Zn, zmwf.Zn) && this.Zy == zmwf.Zy && this.Zp == zmwf.Zp && Objects.equals(this.ZI, zmwf.ZI) && Objects.equals(this.ZE, zmwf.ZE));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZJ, this.ZU, this.ZO, this.ZS, this.ZD, this.Zn, this.Zy, this.Zp, this.ZI, this.ZE });
  }
  
  public String toString() {
    String str1 = String.valueOf(this.ZE);
    String str2 = String.valueOf(this.ZI);
    String str3 = String.valueOf(this.Zp);
    String str4 = String.valueOf(this.Zy);
    String str5 = this.Zn;
    String str6 = String.valueOf(this.ZD);
    String str7 = this.ZS;
    String str8 = this.ZO;
    String str9 = this.ZU;
    String str10 = String.valueOf(this.ZJ);
    return a(333, 23305) + a(333, 23305) + str10 + a(334, 13076) + str9 + a(322, -4113) + str8 + a(328, -16026) + str7 + a(332, -7578) + str6 + a(331, 12745) + str5 + a(330, 10330) + str4 + a(329, 7670) + str3 + a(335, -1007) + str2 + a(323, 28863) + str1;
  }
  
  static Zmwf ZF(String paramString1, String paramString2, String paramString3, String paramString4, AuditIssueSeverity paramAuditIssueSeverity1, AuditIssueConfidence paramAuditIssueConfidence, String paramString5, String paramString6, AuditIssueSeverity paramAuditIssueSeverity2, List<HttpRequestResponse> paramList, Zbnt paramZbnt) {
    return new Zmwf(paramString1, paramString2, paramString3, paramString4, paramAuditIssueSeverity1, paramAuditIssueConfidence, paramString5, paramString6, paramAuditIssueSeverity2, paramList, Collections.emptyList(), paramZbnt);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'il !\\r&Pl\\fÂ âÂÇÖ\\r®½Ö'dg}0¼cÓÜ\\n}¯4kþ¸kwQkÊ¡PaªZÑÈC¹w2\\b(_ÕæÕ¥®\\b¸-ÔüÉðÑBj§nÎRþÀ*¼ccåÍyræ8·'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #91
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
    //   68: ldc 'B¡VôzXÚ\\n@1¢æfiÝò?$w³¨kwéCp'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #124
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
    //   129: putstatic burp/Zmwf.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmwf.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #25
    //   214: goto -> 243
    //   217: bipush #65
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #80
    //   228: goto -> 243
    //   231: bipush #65
    //   233: goto -> 243
    //   236: bipush #27
    //   238: goto -> 243
    //   241: bipush #82
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x14B) & 0xFFFF;
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
      byte b1 = 23;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmwf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */