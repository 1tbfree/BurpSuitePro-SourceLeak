package burp;

class Zm6t {
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zz(Zex6 paramZex6, Zszy paramZszy, Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zeu9 paramZeu9, Zzwo<Zex6, Zg8m> paramZzwo, Zsiv paramZsiv, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    // Byte code:
    //   0: aload #10
    //   2: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   5: getstatic burp/Zlq7.NOT_IN_DEBUG_LOG : Lburp/Zlq7;
    //   8: iconst_1
    //   9: anewarray java/lang/Object
    //   12: dup
    //   13: iconst_0
    //   14: sipush #-9335
    //   17: sipush #6519
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: aastore
    //   24: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   29: invokestatic Zo : ()[Lburp/Zbqc;
    //   32: aload #10
    //   34: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   37: getstatic burp/Zlq7.NEW_FINGERPRINT : Lburp/Zlq7;
    //   40: iconst_1
    //   41: anewarray java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_1
    //   47: aastore
    //   48: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   53: astore #11
    //   55: aload #8
    //   57: new burp/Zzbg
    //   60: dup
    //   61: aload #8
    //   63: aload_1
    //   64: invokeinterface Zo : (Lburp/Zg35;)Lburp/Zg35;
    //   69: checkcast burp/Zszy
    //   72: aload_3
    //   73: aload #4
    //   75: aload #5
    //   77: invokespecial <init> : (Lburp/Zszy;Lburp/Zszw;Lburp/Zlru;Lburp/Zeu9;)V
    //   80: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   85: checkcast burp/Zg8m
    //   88: astore #12
    //   90: aload #6
    //   92: aload_0
    //   93: aload #12
    //   95: invokeinterface Zu : (Lburp/Zgpi;Lburp/Zgpi;)Lburp/Zgpi;
    //   100: pop
    //   101: aload #10
    //   103: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   106: getstatic burp/Zlq7.NOT_IN_DEBUG_LOG : Lburp/Zlq7;
    //   109: iconst_1
    //   110: anewarray java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: sipush #-9336
    //   118: sipush #24128
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: aastore
    //   125: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   130: aload #7
    //   132: aload_2
    //   133: aload_1
    //   134: <illegal opcode> test : (Lburp/Zrp0;Lburp/Zszy;)Ljava/util/function/Predicate;
    //   139: aload #9
    //   141: invokeinterface ZS : (Ljava/util/function/Predicate;Lburp/Zz1m;)Ljava/util/List;
    //   146: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   151: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   156: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   161: aload #10
    //   163: aload_1
    //   164: aload #12
    //   166: aload #9
    //   168: aload_3
    //   169: <illegal opcode> accept : (Lburp/Zmv7;Lburp/Zszy;Lburp/Zg8m;Lburp/Zz1m;Lburp/Zszw;)Ljava/util/function/Consumer;
    //   174: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   179: aload #11
    //   181: ifnonnull -> 191
    //   184: iconst_5
    //   185: anewarray burp/Zbqc
    //   188: invokestatic Zr : ([Lburp/Zbqc;)V
    //   191: return
  }
  
  static Zg8m ZN(Zrp0 paramZrp0, Zzwo<Zex6, Zg8m> paramZzwo) {
    return paramZzwo.ZlZ().stream().filter(paramZrp0::lambda$matchingFingerprintFor$3).findFirst().orElse(null);
  }
  
  static Zszy Zp(Zex6 paramZex6, Zzwo<Zex6, Zg8m> paramZzwo) {
    Zg8m zg8m = paramZzwo.Zd(paramZex6);
    return (zg8m == null) ? null : zg8m.Z_5();
  }
  
  private static boolean lambda$matchingFingerprintFor$3(Zrp0 paramZrp0, Zg8m paramZg8m) {
    return paramZrp0.Zd(paramZg8m.Z_5());
  }
  
  private static void lambda$put$2(Zmv7 paramZmv7, Zszy paramZszy, Zg8m paramZg8m, Zz1m paramZz1m, Zszw paramZszw, Zl_ paramZl_) {
    paramZmv7.Zy(Zrp6.DEBUG, Zlq7.REMOVE_PENDING_MATCHING_FINGERPRINT, new Object[] { paramZl_ });
    paramZmv7.Zy(Zrp6.TRACE, Zlq7.SIGNPOST_MATCHES_FINGERPRINT, new Object[] { paramZl_.Zfy(), paramZszy });
    Zeu9 zeu9 = paramZg8m.ZR(paramZl_);
    paramZl_.Zr(paramZg8m);
    paramZz1m.ZD(new Zxr8<>(Zt35.Zr, new Zbw4(paramZl_, paramZszw, zeu9)));
  }
  
  private static Zl_ lambda$put$1(Zrp0 paramZrp0) {
    return (Zl_)paramZrp0;
  }
  
  private static boolean lambda$put$0(Zrp0 paramZrp01, Zszy paramZszy, Zrp0 paramZrp02) {
    return (paramZrp02 instanceof Zl_ && !paramZrp02.equals(paramZrp01) && paramZrp02.Zd(paramZszy));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'µÞø^ÀÌ3ZÅX½ê/ñe^@Å²XÈ¸\\bàUòDþBÑ·Ûü¿*ê £^B­ã¯çÃt5dÄuªY¿ðóà^êTÝÜ äj'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #47
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #85
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zm6t.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zm6t.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #13
    //   154: goto -> 184
    //   157: bipush #51
    //   159: goto -> 184
    //   162: bipush #101
    //   164: goto -> 184
    //   167: bipush #126
    //   169: goto -> 184
    //   172: bipush #126
    //   174: goto -> 184
    //   177: bipush #9
    //   179: goto -> 184
    //   182: bipush #40
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDB88) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */