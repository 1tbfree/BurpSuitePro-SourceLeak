package burp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkf7 {
  private static final List<Ztnz> Zt;
  
  private final Zm6e ZZ;
  
  private final Zmzk Zc;
  
  private final Zzi5 Zd;
  
  private final Zey9 ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zkf7(Zm6e paramZm6e, Zmzk paramZmzk, Zzi5 paramZzi5, Zey9 paramZey9) {
    this.ZZ = paramZm6e;
    this.Zc = paramZmzk;
    this.Zd = paramZzi5;
    this.ZP = paramZey9;
  }
  
  Zefx ZF(Zzow paramZzow) {
    if (this.Zd.Zi()) {
      Zuh.Zb(false, Zqf.Zr);
      return this.ZP.ZY(this.Zc, new byte[0]);
    } 
    return Zn(paramZzow, false);
  }
  
  Zefx Zv(Zzow paramZzow) {
    return Zn(paramZzow, true);
  }
  
  private Zefx Zn(Zzow paramZzow, boolean paramBoolean) {
    String str = paramBoolean ? (this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP)) + this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP))) : this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD));
    List<Ztnz> list = ZE(new Ztnz[] { new Ztnz(a(22134, -19098), str), new Ztnz(a(22124, 25980), this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_TRUE_CLIENT_IP_PAYLOAD))), new Ztnz(a(22136, -2290), this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_REAL_IP_PAYLOAD))), new Ztnz(a(22120, 1240), a(22113, 17992) + a(22113, 17992) + this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_REFERER_PAYLOAD))), new Ztnz(a(22115, -16208), a(22113, 17992) + a(22113, 17992) + this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_WAP_PROFILE_PAYLOAD))), new Ztnz(a(22140, -25129), this.Zd.Zq(paramZzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_SCRAPED_PAYLOAD))) });
    return this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.GET).Zf(new Zax(this.Zc, Zkb.Zy("/"))).ZK(Zxk3.HTTP_V11).Zl(list).Zr().ZiD());
  }
  
  Zefx Zh(Zlp9 paramZlp9, Zen paramZen) {
    String str;
    Zxk3 zxk3 = Zxk3.HTTP_V11;
    switch (Zlvn.Zl[paramZlp9.ordinal()]) {
      case 1:
      case 2:
        return this.Zd.Zi() ? this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.GET).Zf(new Zax(this.Zc, Zkb.Zy(a(22133, -18285) + a(22133, -18285) + paramZen.toString()))).ZK(zxk3).ZM(this.Zd.ZJ()).Zl(ZE(new Ztnz[0])).Zr().ZiD()) : this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.GET).Zf(new Zax(this.Zc, Zkb.Zy("/"))).ZK(zxk3).ZM(this.Zd.Zq(paramZen)).Zl(ZE(new Ztnz[0])).Zr().ZiD());
      case 3:
        return this.Zd.Zi() ? ZC(new Ztnz(a(22135, -22863), this.Zd.ZJ()), a(22133, -18285) + a(22133, -18285) + paramZen.toString(), zxk3) : ZC(new Ztnz(a(22112, 14014), this.Zd.Zq(paramZen)), "/", zxk3);
      case 4:
        str = Zq(paramZen, this.Zd);
        return ZC(null, str, zxk3);
      case 5:
        return ZC(null, ZS(paramZen, this.Zd), zxk3);
      case 6:
        return this.Zd.Zi() ? this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.GET).Zf(new Zax(this.Zc, Zkb.Zy(a(22133, -18285) + a(22133, -18285) + paramZen.toString()))).ZK(zxk3).ZM(this.Zc.ZJ1() + ":" + this.Zc.ZJ1() + "@" + this.Zc.ZJO()).Zl(ZE(new Ztnz[0])).Zr().ZiD()) : this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.GET).Zf(new Zax(this.Zc, Zkb.Zy("/"))).ZK(zxk3).ZM(this.Zc.ZJ1() + ":" + this.Zc.ZJ1() + "@" + this.Zc.ZJO()).Zl(ZE(new Ztnz[0])).Zr().ZiD());
      case 7:
        if (this.Zd.Zi()) {
          Zuh.ZT(false, Zqf.Zr, paramZlp9.toString());
          return this.ZP.ZY(this.Zc, new byte[0]);
        } 
        return this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.CONNECT).Zf(new Zax(this.Zc, Zkb.Zy(Zo(paramZen, this.Zd)))).ZK(zxk3).Zl(ZE(new Ztnz[0])).Zr().ZiD());
      case 8:
        return Zs(new Ztnz(a(22121, 13004), this.Zd.Zq(paramZen)), paramZlp9, zxk3);
      case 9:
        return Zs(new Ztnz(a(22121, 13004), this.Zd.Zq(paramZen) + this.Zd.Zq(paramZen)), paramZlp9, zxk3);
      case 10:
        return Zs(new Ztnz(a(22128, 25827), this.Zd.Zq(paramZen)), paramZlp9, zxk3);
      case 11:
        return Zs(new Ztnz(a(22117, 14550), a(22113, 17992) + a(22113, 17992) + this.Zd.Zq(paramZen)), paramZlp9, zxk3);
      case 12:
        return Zs(new Ztnz(a(22138, 25411), this.Zd.Zq(paramZen)), paramZlp9, zxk3);
      case 13:
        return Zs(new Ztnz(a(22129, 23149), a(22113, 17992) + a(22113, 17992) + this.Zd.Zq(paramZen)), paramZlp9, zxk3);
      case 14:
        return Zs(new Ztnz(a(22143, -5149), this.Zd.Zq(paramZen)), paramZlp9, zxk3);
    } 
    Zuh.ZT(false, Zqf.Zr, paramZlp9.toString());
    return this.ZP.ZY(this.Zc, new byte[0]);
  }
  
  static String ZS(Zen paramZen, Zzi5 paramZzi5) {
    "@";
    return paramZzi5.Zi() ? ("@" + "@" + paramZzi5.ZJ() + a(22133, -18285) + paramZen.toString()) : ("@" + paramZzi5.Zq(paramZen) + "/");
  }
  
  static String Zo(Zen paramZen, Zzi5 paramZzi5) {
    return paramZzi5.Zq(paramZen) + paramZzi5.Zq(paramZen);
  }
  
  static String Zq(Zen paramZen, Zzi5 paramZzi5) {
    a(22137, -27163);
    return paramZzi5.Zi() ? (a(22137, -27163) + a(22137, -27163) + paramZzi5.ZJ() + a(22126, 31658) + paramZen.toString()) : (a(22113, 17992) + a(22113, 17992) + paramZzi5.Zq(paramZen));
  }
  
  private Zefx Zs(Ztnz paramZtnz, Zlp9 paramZlp9, Zxk3 paramZxk3) {
    if (this.Zd.Zi()) {
      Zuh.ZT(false, Zqf.Zr, paramZlp9.toString());
      return this.ZP.ZY(this.Zc, new byte[0]);
    } 
    return ZC(paramZtnz, "/", paramZxk3);
  }
  
  private Zefx ZC(Ztnz paramZtnz, String paramString, Zxk3 paramZxk3) {
    return this.ZP.ZY(this.Zc, this.ZZ.ZO().Zj(Zsss.GET).Zf(new Zax(this.Zc, Zkb.Zy(paramString))).ZK(paramZxk3).Zl(ZE(new Ztnz[] { paramZtnz })).Zr().ZiD());
  }
  
  private static List<Ztnz> ZE(Ztnz... paramVarArgs) {
    return (List<Ztnz>)Stream.concat(Arrays.stream((Object[])paramVarArgs), Zt.stream()).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ßôRû%Jñ|ö»LW#ÍJþÔ^ù(f¡q\\r>IJdãvÿÖ¾¥áÂs#¤¬ô\\ngíU?Pg]¡îÖåþ#ÄBÅÿ:6Þg¡Ç>H@¤57\\t`K¢ÛQDÿÍÇç\\tïú¾±çQ¥¾ç÷¸\\b%¶Ms£ \\tv|Îc Eó\\t#k&,6üïxQ,i®\\rxüÜÀt0}²ÔzÝ\\rD6Î¥çÞÉX!J[µOá¤yvê}F0-F|Üâk\\b é\\bn $C^y(û\\b"tÅAÃhÝ[mð5òIâ°(âñÖ(Låè6qyïjuÇ1ã !¹¦bV'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #126
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
    //   67: ldc 'CÔó@C÷]A_­ÀËÀd\\t"ÕÏÁ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #10
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #40
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
    //   128: putstatic burp/Zkf7.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkf7.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #57
    //   224: goto -> 244
    //   227: bipush #63
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #65
    //   239: goto -> 244
    //   242: bipush #49
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
    //   300: new burp/Ztnz
    //   303: dup
    //   304: sipush #22118
    //   307: sipush #13183
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: sipush #22116
    //   316: sipush #16480
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   325: new burp/Ztnz
    //   328: dup
    //   329: sipush #22114
    //   332: sipush #1111
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: sipush #22131
    //   341: sipush #6679
    //   344: invokestatic a : (II)Ljava/lang/String;
    //   347: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   350: new burp/Ztnz
    //   353: dup
    //   354: sipush #22127
    //   357: sipush #-9048
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: sipush #22139
    //   366: sipush #17323
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   375: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   378: putstatic burp/Zkf7.Zt : Ljava/util/List;
    //   381: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5672) & 0xFFFF;
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
      byte b1 = 51;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */