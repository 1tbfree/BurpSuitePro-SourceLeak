package burp;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Zxaz {
  private static final Set<Integer> Zp;
  
  private static final Map<String, Set<Integer>> ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void Zh(Zb_j paramZb_j) {
    // Byte code:
    //   0: new burp/Zbxb
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Lburp/Zb_j;)V
    //   8: astore_2
    //   9: invokestatic ZcN : ()[I
    //   12: sipush #14866
    //   15: sipush #-17047
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   24: astore_3
    //   25: sipush #14865
    //   28: sipush #22874
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   37: astore #4
    //   39: astore_1
    //   40: aload #4
    //   42: invokestatic Zb : (Ljava/lang/String;)Lburp/Zsvi;
    //   45: astore #5
    //   47: aload_3
    //   48: ifnull -> 56
    //   51: aload #4
    //   53: ifnonnull -> 100
    //   56: sipush #14868
    //   59: sipush #-26456
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: astore #6
    //   67: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   70: aload #6
    //   72: invokevirtual println : (Ljava/lang/String;)V
    //   75: invokestatic ZG : ()Z
    //   78: ifne -> 96
    //   81: aconst_null
    //   82: sipush #14872
    //   85: sipush #-14083
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: aload #6
    //   93: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   96: aload_1
    //   97: ifnonnull -> 204
    //   100: aload_2
    //   101: aload_3
    //   102: aload #4
    //   104: invokevirtual ZR : (Ljava/lang/String;Ljava/lang/String;)Z
    //   107: ifne -> 204
    //   110: aload_3
    //   111: aload #5
    //   113: invokestatic ZG : (Ljava/lang/String;Lburp/Zsvi;)Z
    //   116: ifne -> 204
    //   119: aload #4
    //   121: aload_3
    //   122: sipush #14878
    //   125: sipush #-2099
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: dup_x2
    //   132: pop
    //   133: sipush #14864
    //   136: sipush #3881
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: swap
    //   143: sipush #14867
    //   146: sipush #-13879
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   157: astore #6
    //   159: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   162: aload #6
    //   164: invokevirtual println : (Ljava/lang/String;)V
    //   167: invokestatic ZG : ()Z
    //   170: ifne -> 204
    //   173: aconst_null
    //   174: sipush #14875
    //   177: sipush #-14263
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: new burp/Zgel
    //   186: dup
    //   187: aload #6
    //   189: aload_2
    //   190: aload_3
    //   191: aload #4
    //   193: <illegal opcode> accept : (Lburp/Zbxb;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   198: invokespecial <init> : (Ljava/lang/String;Ljava/util/function/Consumer;)V
    //   201: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   204: return
  }
  
  private static boolean ZG(String paramString, Zsvi paramZsvi) {
    Objects.requireNonNull(paramString);
    Optional optional = ZJ.keySet().stream().filter(paramString::startsWith).findFirst();
    if (optional.isEmpty())
      return false; 
    Set set = ZJ.getOrDefault(optional.get(), Collections.emptySet());
    return set.stream().anyMatch(paramZsvi::lambda$isSupported$1);
  }
  
  private static boolean lambda$isSupported$1(Zsvi paramZsvi, Integer paramInteger) {
    return (paramInteger.intValue() == paramZsvi.Zc());
  }
  
  private static void lambda$checkJre$0(Zbxb paramZbxb, String paramString1, String paramString2, Boolean paramBoolean) {
    paramZbxb.ZR(paramString1, paramString2, paramBoolean.booleanValue());
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'xD«±6ø±óÝ$ÎÎûv1j_$­æKòÃf±Ðémmnº"ÁDq"p(¦Î²µa\\tâøÂO\\nP§vamQa5LÀ7\\rê;~WÜ ¤,y2.¬¯o&óL3!C{,õÐB¾ì}U*aAeª1)ÌÁ8Ë­ô|JéçTeô·~¦a¥vÓ±\\f§ªv=*(%?Öc°¦¼©Q@\\tVr\\tYÎ½ËÂqû¾ïïõ­ÒåeM$¾|ni±¸j~ùÖ h]¸¾M@8h\\tK¤K_ñ]¨GHûTÜ(n®¡zª¿C¬ ¦u÷Ã÷?Ó\\fï\\tþytRb:ï$F\\bWv·î\\tÝÌý!D+tlµëx!äª±bæd*»/ÿ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #35
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '÷½j`l;Q·xO)6ëCÂõCÇ\\rºÎÃº¡+â©Xõ\p±\-òÚ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
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
    //   95: goto -> 142
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
    //   128: putstatic burp/Zxaz.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zxaz.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #45
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #25
    //   234: goto -> 244
    //   237: bipush #60
    //   239: goto -> 244
    //   242: bipush #101
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    //   300: iconst_5
    //   301: anewarray java/lang/Integer
    //   304: dup
    //   305: iconst_0
    //   306: bipush #17
    //   308: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: bipush #18
    //   316: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: bipush #19
    //   324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   327: aastore
    //   328: dup
    //   329: iconst_3
    //   330: bipush #20
    //   332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   335: aastore
    //   336: dup
    //   337: iconst_4
    //   338: bipush #21
    //   340: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   343: aastore
    //   344: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   347: invokestatic ZR : (Ljava/util/Set;)Ljava/util/Set;
    //   350: putstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   353: new java/util/HashMap
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: putstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   363: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   366: sipush #14869
    //   369: sipush #26962
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: getstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   378: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   383: pop
    //   384: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   387: sipush #14870
    //   390: sipush #-20465
    //   393: invokestatic a : (II)Ljava/lang/String;
    //   396: getstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   399: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   404: pop
    //   405: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   408: sipush #14871
    //   411: sipush #14493
    //   414: invokestatic a : (II)Ljava/lang/String;
    //   417: getstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   420: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   425: pop
    //   426: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   429: sipush #14879
    //   432: sipush #-19715
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: getstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   441: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   446: pop
    //   447: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   450: sipush #14873
    //   453: sipush #18161
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: getstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   462: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   467: pop
    //   468: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   471: sipush #14876
    //   474: sipush #-24201
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: getstatic burp/Zxaz.Zp : Ljava/util/Set;
    //   483: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   488: pop
    //   489: getstatic burp/Zxaz.ZJ : Ljava/util/Map;
    //   492: sipush #14877
    //   495: sipush #3760
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: bipush #21
    //   503: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   506: invokestatic of : (Ljava/lang/Object;)Ljava/util/Set;
    //   509: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   514: pop
    //   515: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3A15) & 0xFFFF;
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
      char c = 'Ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxaz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */