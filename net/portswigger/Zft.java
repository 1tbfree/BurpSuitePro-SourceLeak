package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Zft {
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Zdy> ZO(Zrmf paramZrmf) {
    Z_h z_h = new Z_h();
    boolean bool = Z_j.Zt();
    paramZrmf.ZV().forEach(z_h::lambda$convertToEndpointData$2);
    ArrayList<String> arrayList = new ArrayList<>(z_h.Zz());
    Z__ z__ = new Z__();
    paramZrmf.Zw().forEach(z__::lambda$convertToEndpointData$3);
    String str = z__.ZE();
    ArrayList<Zh8> arrayList1 = new ArrayList();
    for (String str1 : arrayList) {
      Zh8 zh8 = new Zh8(str1, ZN(paramZrmf.Zf()), str, Zb(str1, str, paramZrmf.Zf(), paramZrmf.ZK()), paramZrmf.ZK());
      arrayList1.add(zh8);
      if (!bool) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    return (List)arrayList1;
  }
  
  private static List<Zz3> ZB(Zrmf paramZrmf, String paramString) {
    ArrayList<Zz3> arrayList = new ArrayList();
    arrayList.addAll(ZW(paramString, Zrma.QUERY, paramZrmf.Zr()));
    arrayList.addAll(ZW(paramString, Zrma.REQUEST_BODY, paramZrmf.Zh()));
    arrayList.addAll(ZW(paramString, Zrma.PATH, paramZrmf.Zw().stream().filter(Zft::lambda$getParameterData$4).toList()));
    return arrayList;
  }
  
  private static List<Zz3> ZW(String paramString, Zrma paramZrma, List<Zms> paramList) {
    Zvs zvs = new Zvs(paramZrma);
    paramList.forEach(zvs::lambda$getParameterDataBuilder$5);
    return zvs.Zx().values().stream().map(paramString::lambda$getParameterDataBuilder$6).map(Zv0::ZO).toList();
  }
  
  public static String Zb(String paramString1, String paramString2, String paramString3, String paramString4) {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      stringBuilder.append(paramString1).append(" ").append(paramString2).append(" ").append(paramString3);
      if (paramString4 != null)
        stringBuilder.append(" ").append(paramString4); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  private static Zta ZN(String paramString) {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: aload_0
    //   4: astore_2
    //   5: istore_1
    //   6: iconst_m1
    //   7: istore_3
    //   8: aload_2
    //   9: invokevirtual hashCode : ()I
    //   12: lookupswitch default -> 318, -531492226 -> 204, 70454 -> 88, 79599 -> 146, 2213344 -> 292, 2461856 -> 117, 75900968 -> 233, 80083237 -> 262, 2012838315 -> 175
    //   88: aload_2
    //   89: sipush #14615
    //   92: sipush #-27844
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifeq -> 318
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   110: athrow
    //   111: iconst_0
    //   112: istore_3
    //   113: iload_1
    //   114: ifne -> 318
    //   117: aload_2
    //   118: sipush #14612
    //   121: sipush #-6941
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifeq -> 318
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   139: athrow
    //   140: iconst_1
    //   141: istore_3
    //   142: iload_1
    //   143: ifne -> 318
    //   146: aload_2
    //   147: sipush #14614
    //   150: sipush #4108
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   159: ifeq -> 318
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   168: athrow
    //   169: iconst_2
    //   170: istore_3
    //   171: iload_1
    //   172: ifne -> 318
    //   175: aload_2
    //   176: sipush #14609
    //   179: sipush #-31082
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokevirtual equals : (Ljava/lang/Object;)Z
    //   188: ifeq -> 318
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   197: athrow
    //   198: iconst_3
    //   199: istore_3
    //   200: iload_1
    //   201: ifne -> 318
    //   204: aload_2
    //   205: sipush #14608
    //   208: sipush #-12409
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: invokevirtual equals : (Ljava/lang/Object;)Z
    //   217: ifeq -> 318
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   226: athrow
    //   227: iconst_4
    //   228: istore_3
    //   229: iload_1
    //   230: ifne -> 318
    //   233: aload_2
    //   234: sipush #14620
    //   237: sipush #-19289
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual equals : (Ljava/lang/Object;)Z
    //   246: ifeq -> 318
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   255: athrow
    //   256: iconst_5
    //   257: istore_3
    //   258: iload_1
    //   259: ifne -> 318
    //   262: aload_2
    //   263: sipush #14610
    //   266: sipush #-10968
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: invokevirtual equals : (Ljava/lang/Object;)Z
    //   275: ifeq -> 318
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   284: athrow
    //   285: bipush #6
    //   287: istore_3
    //   288: iload_1
    //   289: ifne -> 318
    //   292: aload_2
    //   293: sipush #14611
    //   296: sipush #14829
    //   299: invokestatic a : (II)Ljava/lang/String;
    //   302: invokevirtual equals : (Ljava/lang/Object;)Z
    //   305: ifeq -> 318
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   314: athrow
    //   315: bipush #7
    //   317: istore_3
    //   318: iload_3
    //   319: tableswitch default -> 416, 0 -> 364, 1 -> 374, 2 -> 380, 3 -> 386, 4 -> 392, 5 -> 398, 6 -> 404, 7 -> 410
    //   364: getstatic net/portswigger/Zta.GET : Lnet/portswigger/Zta;
    //   367: goto -> 440
    //   370: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   373: athrow
    //   374: getstatic net/portswigger/Zta.POST : Lnet/portswigger/Zta;
    //   377: goto -> 440
    //   380: getstatic net/portswigger/Zta.PUT : Lnet/portswigger/Zta;
    //   383: goto -> 440
    //   386: getstatic net/portswigger/Zta.DELETE : Lnet/portswigger/Zta;
    //   389: goto -> 440
    //   392: getstatic net/portswigger/Zta.OPTIONS : Lnet/portswigger/Zta;
    //   395: goto -> 440
    //   398: getstatic net/portswigger/Zta.PATCH : Lnet/portswigger/Zta;
    //   401: goto -> 440
    //   404: getstatic net/portswigger/Zta.TRACE : Lnet/portswigger/Zta;
    //   407: goto -> 440
    //   410: getstatic net/portswigger/Zta.HEAD : Lnet/portswigger/Zta;
    //   413: goto -> 440
    //   416: new java/lang/IllegalStateException
    //   419: dup
    //   420: aload_0
    //   421: sipush #14613
    //   424: sipush #19631
    //   427: invokestatic a : (II)Ljava/lang/String;
    //   430: swap
    //   431: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   436: invokespecial <init> : (Ljava/lang/String;)V
    //   439: athrow
    //   440: areturn
    // Exception table:
    //   from	to	target	type
    //   8	104	107	java/lang/IllegalStateException
    //   113	133	136	java/lang/IllegalStateException
    //   142	162	165	java/lang/IllegalStateException
    //   171	191	194	java/lang/IllegalStateException
    //   200	220	223	java/lang/IllegalStateException
    //   229	249	252	java/lang/IllegalStateException
    //   258	278	281	java/lang/IllegalStateException
    //   288	308	311	java/lang/IllegalStateException
    //   318	370	370	java/lang/IllegalStateException
  }
  
  private static Zv0 lambda$getParameterDataBuilder$6(String paramString, Zv0 paramZv0) {
    return paramZv0.Zg(paramString);
  }
  
  private static void lambda$getParameterDataBuilder$5(Zvs paramZvs, Zms paramZms) {
    paramZms.ZF(paramZvs);
  }
  
  private static boolean lambda$getParameterData$4(Zms paramZms) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !(paramZms instanceof Zu7);
  }
  
  private static void lambda$convertToEndpointData$3(Z__ paramZ__, Zms paramZms) {
    paramZms.ZF(paramZ__);
  }
  
  private static void lambda$convertToEndpointData$2(Z_h paramZ_h, Zms paramZms) {
    paramZms.ZF(paramZ_h);
  }
  
  private static void lambda$parseRequestDescriptors$1(List paramList1, List paramList2, Set paramSet, Zrmf paramZrmf) {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic ZO : (Lnet/portswigger/Zrmf;)Ljava/util/List;
    //   4: aload_0
    //   5: aload_1
    //   6: aload_3
    //   7: <illegal opcode> accept : (Ljava/util/List;Ljava/util/List;Lnet/portswigger/Zrmf;)Ljava/util/function/Consumer;
    //   12: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   17: aload_2
    //   18: aload_3
    //   19: invokevirtual Zo : ()Ljava/util/List;
    //   22: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   27: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   32: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   37: invokeinterface toList : ()Ljava/util/List;
    //   42: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   47: pop
    //   48: return
  }
  
  private static void lambda$parseRequestDescriptors$0(List<Zdy> paramList1, List<Zz3> paramList2, Zrmf paramZrmf, Zdy paramZdy) {
    paramList1.add(paramZdy);
    paramList2.addAll(ZB(paramZrmf, paramZdy.ZH()));
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' XMßd$ÏcìWÔ1¾J°¨±_k Å=XnhÁðÉü×üp}j9'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #67
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
    //   67: ldc '!u3º³åh!'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #125
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/Zft.a : [Ljava/lang/String;
    //   130: bipush #9
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zft.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_1
    //   213: goto -> 243
    //   216: bipush #44
    //   218: goto -> 243
    //   221: bipush #78
    //   223: goto -> 243
    //   226: bipush #99
    //   228: goto -> 243
    //   231: bipush #16
    //   233: goto -> 243
    //   236: bipush #101
    //   238: goto -> 243
    //   241: bipush #33
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3914) & 0xFFFF;
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
      byte b1 = 6;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */