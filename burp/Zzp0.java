package burp;

public class Zzp0 {
  private static Zbqc[] ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void Zk(int paramInt, StringBuilder paramStringBuilder) {
    Zbqc[] arrayOfZbqc = ZA();
    if (ZE(paramInt))
      paramStringBuilder.append(a(23571, 28620)); 
    if (ZY(paramInt))
      paramStringBuilder.append(a(23569, -5202)); 
    if (Zu(paramInt))
      paramStringBuilder.append(a(23568, 20460)); 
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static byte Zc(byte paramByte, int paramInt) {
    return (ZE(paramInt) && paramByte > 3) ? 3 : paramByte;
  }
  
  private static boolean ZE(int paramInt) {
    return ZI(paramInt, 1);
  }
  
  private static boolean ZY(int paramInt) {
    return ZI(paramInt, 2);
  }
  
  private static boolean Zu(int paramInt) {
    return ZI(paramInt, 4);
  }
  
  public static boolean ZI(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) > 0);
  }
  
  public static void Zm(Zbqc[] paramArrayOfZbqc) {
    ZR = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZA() {
    return ZR;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_1
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zm : ([Lburp/Zbqc;)V
    //   15: ldc 'JîòYàW r ¨<ÒwÇuµ§ýJ5¬aNß.XHëU$îÆrFqãbõö8\\bæ4ËÞüÎy°ð*^^­ÌÄËÏE­sTÌïëßwLoÅ0Õ<S:ã«î&µáÌúÊâÜÜ\\rL-u»e '*z+cØ,µªó\\r?½QÄü¨\\fÄ9\\nnÊ\\tõ[¨k5¦1LfûËuF,0,W.áÚIýNFø2pY¯Ã­TC9Yò\\f°2u\À£P\\rsq'~ªö$VÐ#láD¬°;0ÌP½?ûbVcÔ5Þäc¦ji¸¶1\\fáÏ@;ø)ÌëM`«>9­øÂîÆõÝÎm½þÚÀ`cI_-øêhMäãÃüOÓÏQÃìüðu6q¤-$ý¢b®®ÄC±Úy¯=·¾*BTÖ¶&>_±ð@U¶ 8Ú«cþU¸°&îa/´^Á²á`·êÑÂWïSÛ2m''~ØÚW"dHÇr<Õ ÖæQ:FÝ:°ï¡êqú!hôìwy×nafp*5t³²jȜhfÁz{¤\\rÇK BerÍ_~SQñ+ ±þ¶õ6TS ö6¢^¡ë¢9èxk¼Oó4¹;¸] sÀÉvÆ\÷ál]ç1½k8Á~jæÛÛ('\\rKmÇÃ|àêU?¶óÊÔß¦û:°Û<·ÑßUß$j¡.·9dw7NCWÂlñ·ì|Ì\\nê^Tj=:í·ZuFúÕõVíÃå*ò`ÇÄÍâ²ä/B¡îËÌøaÃöW©'g»®nô\\n¬:J.?z_ðxþnÇÃå(ØOÅ×åX($TìfÄAMÉõlGüédÕ '9¬sH©£¿§G¿{Ý$DÁ bk2Zñó]CNÛÈrÚðà@¦ùcôÍÜ42g:§ÎÚÎ¸ïMQ©®±q¾ÔdóäÒÐj_nÃ"{û1bºØ¤W\ÌQrR²çG#Á*áµ¥$éûõ§ÅÝÞx|A¢yÿ!¡zÐãöZ\\bkI9ÚðË&×âQÞí¯!/á@* T§ÿ.¼ä\\r*ÿ¾,è»Óñ·]5õ'^Òí½tK²¹ògÂ%9@í¾¡ÛwØ²NuYKË;'Ì+îßN:¥ÿ,Þ#ÕyêT»\\f(:?\\t¢EÞµÒ'·KJõ«iÊìô'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: sipush #332
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #109
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 90
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: aload #5
    //   77: putstatic burp/Zzp0.a : [Ljava/lang/String;
    //   80: iconst_3
    //   81: anewarray java/lang/String
    //   84: putstatic burp/Zzp0.b : [Ljava/lang/String;
    //   87: goto -> 234
    //   90: dup_x2
    //   91: pop
    //   92: invokevirtual toCharArray : ()[C
    //   95: dup_x1
    //   96: arraylength
    //   97: dup_x2
    //   98: pop
    //   99: iconst_0
    //   100: istore #6
    //   102: dup2_x1
    //   103: pop2
    //   104: dup_x2
    //   105: iconst_1
    //   106: if_icmpgt -> 207
    //   109: dup2
    //   110: swap
    //   111: iload #6
    //   113: dup2_x1
    //   114: caload
    //   115: swap
    //   116: iload #6
    //   118: bipush #7
    //   120: irem
    //   121: tableswitch default -> 189, 0 -> 160, 1 -> 165, 2 -> 170, 3 -> 175, 4 -> 179, 5 -> 184
    //   160: bipush #95
    //   162: goto -> 191
    //   165: bipush #96
    //   167: goto -> 191
    //   170: bipush #46
    //   172: goto -> 191
    //   175: iconst_3
    //   176: goto -> 191
    //   179: bipush #71
    //   181: goto -> 191
    //   184: bipush #34
    //   186: goto -> 191
    //   189: bipush #61
    //   191: ixor
    //   192: ixor
    //   193: i2c
    //   194: castore
    //   195: iinc #6, 1
    //   198: dup
    //   199: ifne -> 207
    //   202: dup2
    //   203: dup_x1
    //   204: goto -> 113
    //   207: dup2_x1
    //   208: pop2
    //   209: dup_x2
    //   210: iload #6
    //   212: if_icmpgt -> 109
    //   215: pop
    //   216: new java/lang/String
    //   219: dup_x1
    //   220: swap
    //   221: invokespecial <init> : ([C)V
    //   224: invokevirtual intern : ()Ljava/lang/String;
    //   227: swap
    //   228: pop
    //   229: swap
    //   230: pop
    //   231: goto -> 47
    //   234: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5C11) & 0xFFFF;
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
      char c = 'Õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzp0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */