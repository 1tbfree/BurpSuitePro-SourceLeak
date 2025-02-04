package net.portswigger.swagger.v2.util;

import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import net.portswigger.swagger.StringUtils;
import net.portswigger.swagger.v3.oas.models.media.BinarySchema;
import net.portswigger.swagger.v3.oas.models.media.BooleanSchema;
import net.portswigger.swagger.v3.oas.models.media.ByteArraySchema;
import net.portswigger.swagger.v3.oas.models.media.DateSchema;
import net.portswigger.swagger.v3.oas.models.media.DateTimeSchema;
import net.portswigger.swagger.v3.oas.models.media.EmailSchema;
import net.portswigger.swagger.v3.oas.models.media.IntegerSchema;
import net.portswigger.swagger.v3.oas.models.media.NumberSchema;
import net.portswigger.swagger.v3.oas.models.media.ObjectSchema;
import net.portswigger.swagger.v3.oas.models.media.PasswordSchema;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.media.StringSchema;
import net.portswigger.swagger.v3.oas.models.media.UUIDSchema;

public class SchemaTypeUtil {
  private static final String TYPE;
  
  private static final String FORMAT;
  
  public static final String INTEGER_TYPE;
  
  public static final String NUMBER_TYPE;
  
  public static final String STRING_TYPE;
  
  public static final String BOOLEAN_TYPE;
  
  public static final String OBJECT_TYPE;
  
  public static final String INTEGER32_FORMAT;
  
  public static final String INTEGER64_FORMAT;
  
  public static final String FLOAT_FORMAT;
  
  public static final String DOUBLE_FORMAT;
  
  public static final String BYTE_FORMAT;
  
  public static final String BINARY_FORMAT;
  
  public static final String DATE_FORMAT;
  
  public static final String DATE_TIME_FORMAT;
  
  public static final String PASSWORD_FORMAT;
  
  public static final String EMAIL_FORMAT;
  
  public static final String UUID_FORMAT;
  
  public static final String BINARY_AS_STRING;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Schema createSchemaByType(Zr paramZr) {
    if (paramZr == null)
      return new Schema(); 
    String str1 = getNodeValue(paramZr, a(32419, -188));
    if (StringUtils.isBlank(str1))
      return new Schema(); 
    String str2 = getNodeValue(paramZr, a(32417, 18515));
    return createSchema(str1, str2);
  }
  
  public static Schema createSchema(String paramString1, String paramString2) {
    return (Schema)(a(32447, 17780).equals(paramString1) ? (StringUtils.isBlank(paramString2) ? (new IntegerSchema()).format(null) : (new IntegerSchema()).format(paramString2)) : (a(32431, 30485).equals(paramString1) ? (StringUtils.isBlank(paramString2) ? new NumberSchema() : (new NumberSchema()).format(paramString2)) : (a(32438, -6022).equals(paramString1) ? (StringUtils.isBlank(paramString2) ? new BooleanSchema() : (new BooleanSchema()).format(paramString2)) : (a(32423, 17434).equals(paramString1) ? (a(32433, -15551).equals(paramString2) ? ((System.getProperty(a(32429, 29356)) != null || System.getenv(a(32440, -18366)) != null) ? (new StringSchema()).format(a(32420, -31484)) : new ByteArraySchema()) : (a(32434, 10855).equals(paramString2) ? ((System.getProperty(a(32440, -18366)) != null || System.getenv(a(32440, -18366)) != null) ? (new StringSchema()).format(a(32437, 18180)) : new BinarySchema()) : (a(32416, -22778).equals(paramString2) ? new DateSchema() : (a(32399, 17791).equals(paramString2) ? new DateTimeSchema() : (a(32418, -23530).equals(paramString2) ? new PasswordSchema() : (a(32441, 12515).equals(paramString2) ? new EmailSchema() : (a(32445, -5405).equals(paramString2) ? new UUIDSchema() : (StringUtils.isBlank(paramString2) ? (new StringSchema()).format(null) : (new StringSchema()).format(paramString2))))))))) : (a(32422, -21349).equals(paramString1) ? new ObjectSchema() : new Schema())))));
  }
  
  private static String getNodeValue(Zr paramZr, String paramString) {
    Zb zb = paramZr.ZL(paramString);
    return (zb == null) ? null : zb.Zz();
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ôµÈ;tc&}R4¼­¹¯a3c~Ösø'ÑLTÊó¢ôMù.½gåH\ôKl'Q­@Ã;È¿Å3¡îæ^B2àWU»×Qw{±á¸ß¿çÅÆ±ãþÌ:¥ÜÁsn ¼\\r\\bÌAò¾ØEÏgwCÉ¹jóÏåÃÛéa$Òí+°}Õiì¹¯ø!\\bfErïÿèè ñÓ`6ÊA?RN ¿´INõ\\r§)ÙAÈû×~79Ä Þú'r´sèHæAÂJjoÀÐüd¹\\nµ\\tPjðÍ%¥¤ TÐüÎüÜBÃÆpo\\t»®U¶Qbê\\b-²ÎÀ_Ëá¼'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #82
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 370
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
    //   67: ldc '¡¥F§Áù§'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #97
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 370
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
    //   128: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.a : [Ljava/lang/String;
    //   131: bipush #37
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.b : [Ljava/lang/String;
    //   139: sipush #32398
    //   142: sipush #5495
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.OBJECT_TYPE : Ljava/lang/String;
    //   151: sipush #32444
    //   154: sipush #-4284
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.INTEGER32_FORMAT : Ljava/lang/String;
    //   163: sipush #32439
    //   166: sipush #16321
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.DATE_FORMAT : Ljava/lang/String;
    //   175: sipush #32424
    //   178: sipush #29560
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.NUMBER_TYPE : Ljava/lang/String;
    //   187: sipush #32436
    //   190: sipush #-25375
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.DOUBLE_FORMAT : Ljava/lang/String;
    //   199: sipush #32421
    //   202: sipush #-31810
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.INTEGER_TYPE : Ljava/lang/String;
    //   211: sipush #32426
    //   214: sipush #920
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.STRING_TYPE : Ljava/lang/String;
    //   223: sipush #32443
    //   226: sipush #-30991
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.TYPE : Ljava/lang/String;
    //   235: sipush #32425
    //   238: sipush #30333
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.BINARY_FORMAT : Ljava/lang/String;
    //   247: sipush #32442
    //   250: sipush #-19601
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.FORMAT : Ljava/lang/String;
    //   259: sipush #32394
    //   262: sipush #-29655
    //   265: invokestatic a : (II)Ljava/lang/String;
    //   268: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.EMAIL_FORMAT : Ljava/lang/String;
    //   271: sipush #32430
    //   274: sipush #19508
    //   277: invokestatic a : (II)Ljava/lang/String;
    //   280: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.INTEGER64_FORMAT : Ljava/lang/String;
    //   283: sipush #32428
    //   286: sipush #9064
    //   289: invokestatic a : (II)Ljava/lang/String;
    //   292: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.BYTE_FORMAT : Ljava/lang/String;
    //   295: sipush #32432
    //   298: sipush #-15483
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.UUID_FORMAT : Ljava/lang/String;
    //   307: sipush #32397
    //   310: sipush #3950
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.BOOLEAN_TYPE : Ljava/lang/String;
    //   319: sipush #32435
    //   322: sipush #21027
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.DATE_TIME_FORMAT : Ljava/lang/String;
    //   331: sipush #32427
    //   334: sipush #-32234
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.BINARY_AS_STRING : Ljava/lang/String;
    //   343: sipush #32446
    //   346: sipush #-11671
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.FLOAT_FORMAT : Ljava/lang/String;
    //   355: sipush #32396
    //   358: sipush #28431
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: putstatic net/portswigger/swagger/v2/util/SchemaTypeUtil.PASSWORD_FORMAT : Ljava/lang/String;
    //   367: goto -> 528
    //   370: dup_x2
    //   371: pop
    //   372: invokevirtual toCharArray : ()[C
    //   375: dup_x1
    //   376: arraylength
    //   377: dup_x2
    //   378: pop
    //   379: iconst_0
    //   380: istore #6
    //   382: dup2_x1
    //   383: pop2
    //   384: dup_x2
    //   385: iconst_1
    //   386: if_icmpgt -> 488
    //   389: dup2
    //   390: swap
    //   391: iload #6
    //   393: dup2_x1
    //   394: caload
    //   395: swap
    //   396: iload #6
    //   398: bipush #7
    //   400: irem
    //   401: tableswitch default -> 470, 0 -> 440, 1 -> 445, 2 -> 450, 3 -> 455, 4 -> 460, 5 -> 465
    //   440: bipush #81
    //   442: goto -> 472
    //   445: bipush #63
    //   447: goto -> 472
    //   450: bipush #84
    //   452: goto -> 472
    //   455: bipush #87
    //   457: goto -> 472
    //   460: bipush #126
    //   462: goto -> 472
    //   465: bipush #83
    //   467: goto -> 472
    //   470: bipush #54
    //   472: ixor
    //   473: ixor
    //   474: i2c
    //   475: castore
    //   476: iinc #6, 1
    //   479: dup
    //   480: ifne -> 488
    //   483: dup2
    //   484: dup_x1
    //   485: goto -> 393
    //   488: dup2_x1
    //   489: pop2
    //   490: dup_x2
    //   491: iload #6
    //   493: if_icmpgt -> 389
    //   496: pop
    //   497: new java/lang/String
    //   500: dup_x1
    //   501: swap
    //   502: invokespecial <init> : ([C)V
    //   505: invokevirtual intern : ()Ljava/lang/String;
    //   508: swap
    //   509: pop
    //   510: swap
    //   511: tableswitch default -> 39, 0 -> 98
    //   528: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7EAE) & 0xFFFF;
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
      char c = 'Ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\SchemaTypeUtil.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */