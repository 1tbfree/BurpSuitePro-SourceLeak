package burp;

import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmbf extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    if (paramZrdb2.Za6() != paramZrdb1.Za6())
      return Zl4m.ZX; 
    if (!Zli.ZQ(paramZrdb1.Zax(), paramZrdb2.Zax()))
      return Zl4m.ZX; 
    if (paramZrdb1.Za7().ZU() && paramZrdb2.Za7().ZU()) {
      Zr2n zr2n = new Zr2n();
      paramZrdb1.Za7().ZT(zr2n);
      Zuh.Zb((zr2n.Zd != null), Zqf.Zr);
      paramZrdb2.Za7().ZT(zr2n);
      if (zr2n.Zm())
        return Zl4m.ZX; 
    } 
    return Zg.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: astore #11
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #12
    //   14: aload_1
    //   15: getstatic burp/Zzu2.INPUT_RETRIEVAL_REFLECTED : Lburp/Zzu2;
    //   18: if_acmpne -> 69
    //   21: aload #12
    //   23: sipush #-28529
    //   26: sipush #27681
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #12
    //   38: aload #6
    //   40: iconst_1
    //   41: iconst_1
    //   42: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload #12
    //   51: sipush #-28533
    //   54: sipush #20897
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload #11
    //   66: ifnonnull -> 112
    //   69: aload_1
    //   70: getstatic burp/Zzu2.INPUT_RETRIEVAL_STORED : Lburp/Zzu2;
    //   73: if_acmpne -> 103
    //   76: aload #5
    //   78: invokevirtual Zx : ()Lburp/Zrp9;
    //   81: aload #12
    //   83: aload #6
    //   85: aload #5
    //   87: <illegal opcode> accept : (Ljava/lang/StringBuilder;Lburp/Zefg;Lburp/Ztub;)Ljava/util/function/Consumer;
    //   92: invokeinterface Zd : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   97: pop
    //   98: aload #11
    //   100: ifnonnull -> 112
    //   103: iconst_0
    //   104: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   107: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   110: aconst_null
    //   111: areturn
    //   112: aload #12
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: invokestatic Zwu : ()[Lburp/Zbqc;
    //   120: ifnonnull -> 128
    //   123: ldc 'S5etj'
    //   125: invokestatic ZM : (Ljava/lang/String;)V
    //   128: areturn
  }
  
  private static void lambda$buildIssueDetail$0(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg, Ztub paramZtub, Zrp9 paramZrp9) {
    paramStringBuilder.append(a(-28535, 5543));
    paramStringBuilder.append(Zg2x.ZM(paramZefg, true, true));
    paramStringBuilder.append(a(-28536, 13002));
    Zrlp.Zn(paramStringBuilder, Zkb.ZG(paramZrp9.Zvs()));
    paramStringBuilder.append(a(-28534, -18138));
    Zrlp.Zn(paramStringBuilder, Zkb.ZG(paramZtub.Zx().ZvM()));
    paramStringBuilder.append(a(-28531, 12565));
    paramStringBuilder.append(a(-28532, -3193));
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ödP4ã¯;Uc¶è0mâ§6."î êI+ËnV0Ì\\fVFÊ)ë.ý%~*¢GL¯x{õui 8G¥7Ù²ú½7ÿ)ë+RLFäÈÄia&¬$T\\n_¦ïß¯Ós42ÜAéÔÄ5wm\\tR8»W«È'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #34
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 143
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
    //   67: ldc 'T,öG/»y§Pãáúêö*W±\\rßÐÞáôH/Qª|ÕTæ±^i`Çéð¿á]qý.ñ¦@K íWºîøwæ$$½«³Å¿+5&ýé.¿ÅQ ùôWý¬~ªò¤P¨q+`)¤ènòoà3ª»\\tµL¡÷©ôtNqóV-ú]ñ¼ Ð\¤à@ØE«Ú§wÆ¼Ú¨M<«z¿Ó¯øádhÿ¸3óÇ\\tèj\\bbig~.m<;½g8Í¦òëÖ,OCFl7ñ¬Æ11Åqq:eRÐoFNö­0YùfÉÚåqn@ó5õT¸z|¾k?NqºoõZyôÝFi©@_H=IëDi¨5pÜ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: sipush #297
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #109
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
    //   129: putstatic burp/Zmbf.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmbf.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #106
    //   214: goto -> 243
    //   217: bipush #118
    //   219: goto -> 243
    //   222: bipush #83
    //   224: goto -> 243
    //   227: bipush #49
    //   229: goto -> 243
    //   232: bipush #116
    //   234: goto -> 243
    //   237: iconst_1
    //   238: goto -> 243
    //   241: bipush #88
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
    //   282: tableswitch default -> 39, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9089) & 0xFFFF;
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
      byte b1 = 107;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */