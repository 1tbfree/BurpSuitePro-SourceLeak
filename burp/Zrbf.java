package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

abstract class Zrbf implements Zluf {
  private final Zsh8 Za;
  
  private final Zgb6 Zu;
  
  private final Zrgd Zw;
  
  private final Zkl6 Zq;
  
  private final Zerg ZG;
  
  private final Zip ZJ;
  
  private final Zr_d ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zrbf(Zxw4 paramZxw4, Zgb6 paramZgb6, Zrgd paramZrgd, Zkl6 paramZkl6, Zerg paramZerg, Zr_d paramZr_d) {
    this.Za = paramZxw4.ZF;
    this.Zu = paramZgb6;
    this.Zw = paramZrgd;
    this.Zq = paramZkl6;
    this.ZG = paramZerg;
    this.ZJ = paramZxw4.Zl;
    this.ZL = paramZr_d;
  }
  
  public String ZV() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    Zmzk zmzk = this.ZL.Z_() ? null : this.ZL.ZG();
    Zn(stringBuilder1);
    ZA(stringBuilder1, stringBuilder2, zmzk);
    ZI(stringBuilder1, stringBuilder2, zmzk);
    Zi(stringBuilder1, stringBuilder2);
    ZR(stringBuilder1);
    Za(stringBuilder1);
    return (stringBuilder1.length() == 0 && stringBuilder2.length() == 0) ? null : ZJ(stringBuilder1, stringBuilder2);
  }
  
  private void Zn(StringBuilder paramStringBuilder) {
    if (!this.ZJ.Zu.isEmpty())
      paramStringBuilder.append(a(24496, 10427)).append(a(24506, -4803)).append(this.ZJ.Zu); 
  }
  
  private String ZJ(StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2) {
    StringBuilder stringBuilder = new StringBuilder();
    if (paramStringBuilder1.length() > 0)
      stringBuilder.append(String.format(a(24508, 12191), new Object[] { paramStringBuilder1 })); 
    if (paramStringBuilder2.length() > 0)
      stringBuilder.append(String.format(a(24499, -27569), new Object[] { paramStringBuilder2 })); 
    return stringBuilder.toString();
  }
  
  private void Za(StringBuilder paramStringBuilder) {
    if (this.Za.ZP0() && (this.Za.ZP_() == null || !this.Za.ZP_().Zv_() || this.Za.ZP_().ZvZ() == null || (this.Za.ZP_().ZvZ()).length == 0))
      paramStringBuilder.append(a(24505, -20060)); 
  }
  
  private void ZR(StringBuilder paramStringBuilder) {
    if (this.Za.ZPD() == -1)
      paramStringBuilder.append(a(24507, 32324)); 
    if (this.Za.ZPP() == -1)
      paramStringBuilder.append(a(24510, -29976)); 
  }
  
  private void Zi(StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lburp/Zsh8;
    //   4: invokeinterface ZPq : ()Lburp/Zrte;
    //   9: astore #4
    //   11: invokestatic Zw : ()Z
    //   14: iconst_0
    //   15: istore #5
    //   17: istore_3
    //   18: iload #5
    //   20: aload #4
    //   22: invokeinterface Zpu : ()I
    //   27: if_icmpge -> 121
    //   30: aload #4
    //   32: iload #5
    //   34: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   39: checkcast burp/Ze9k
    //   42: astore #6
    //   44: aload #6
    //   46: ifnonnull -> 86
    //   49: aload_1
    //   50: sipush #24501
    //   53: sipush #-11263
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: iload #5
    //   64: iconst_1
    //   65: iadd
    //   66: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   69: sipush #24491
    //   72: sipush #-9496
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: iload_3
    //   83: ifeq -> 114
    //   86: aload_0
    //   87: aload_1
    //   88: aload_2
    //   89: iload #5
    //   91: aload #6
    //   93: invokevirtual ZS : (Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;ILburp/Ze9k;)V
    //   96: aload #6
    //   98: instanceof burp/Zkfd
    //   101: ifeq -> 114
    //   104: aload_0
    //   105: getfield Za : Lburp/Zsh8;
    //   108: iconst_1
    //   109: invokeinterface Zv : (Z)V
    //   114: iinc #5, 1
    //   117: iload_3
    //   118: ifeq -> 18
    //   121: return
  }
  
  private void ZS(StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, int paramInt, Ze9k paramZe9k) {
    try {
      paramZe9k.ZD(this.Za, this.ZG, this.Zu, paramInt);
      paramZe9k.Zif();
    } catch (Zs7w zs7w) {
      Zah.Zl(zs7w, Zk_.USER_ERROR);
      paramStringBuilder1.append(a(24504, -14948)).append(paramInt + 1).append(a(24509, -14371)).append(zs7w.getMessage());
    } catch (Ztgu ztgu) {
      Zah.Zl(ztgu, Zk_.USER_ERROR);
      paramStringBuilder2.append(a(24504, -14948)).append(paramInt + 1).append(a(24498, -1879)).append(ztgu.getMessage());
    } catch (Ztku ztku) {
      Zah.Zl(ztku, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZI(StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, Zmzk paramZmzk) {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Za : Lburp/Zsh8;
    //   9: invokeinterface ZPJ : ()Lburp/Zstu;
    //   14: ifnonnull -> 21
    //   17: aconst_null
    //   18: goto -> 35
    //   21: aload_0
    //   22: getfield Za : Lburp/Zsh8;
    //   25: invokeinterface ZPJ : ()Lburp/Zstu;
    //   30: invokeinterface ZiD : ()[B
    //   35: astore #5
    //   37: aload #5
    //   39: iconst_0
    //   40: iconst_1
    //   41: invokestatic ZB : ([BIZ)I
    //   44: iconst_m1
    //   45: if_icmpne -> 62
    //   48: aload_2
    //   49: sipush #24502
    //   52: sipush #28140
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_0
    //   63: getfield ZL : Lburp/Zr_d;
    //   66: invokevirtual ZR : ()I
    //   69: istore #6
    //   71: aload_0
    //   72: getfield Za : Lburp/Zsh8;
    //   75: invokeinterface ZPa : ()Lburp/Zejb;
    //   80: getstatic burp/Zejb.PITCHFORK : Lburp/Zejb;
    //   83: if_acmpeq -> 101
    //   86: aload_0
    //   87: getfield Za : Lburp/Zsh8;
    //   90: invokeinterface ZPa : ()Lburp/Zejb;
    //   95: getstatic burp/Zejb.CLUSTER_BOMB : Lburp/Zejb;
    //   98: if_acmpne -> 150
    //   101: iload #6
    //   103: iconst_2
    //   104: if_icmplt -> 114
    //   107: iload #6
    //   109: bipush #20
    //   111: if_icmple -> 150
    //   114: aload_1
    //   115: sipush #24489
    //   118: sipush #-6465
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: bipush #20
    //   129: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   132: sipush #24490
    //   135: sipush #9213
    //   138: invokestatic a : (II)Ljava/lang/String;
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: iload #4
    //   147: ifeq -> 170
    //   150: iload #6
    //   152: iconst_1
    //   153: if_icmpge -> 170
    //   156: aload_1
    //   157: sipush #24497
    //   160: sipush #16528
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload_3
    //   171: ifnull -> 303
    //   174: aload_0
    //   175: getfield Za : Lburp/Zsh8;
    //   178: invokeinterface ZPE : ()Lburp/Zxpp;
    //   183: invokeinterface ZwB : ()Z
    //   188: ifne -> 303
    //   191: aload #5
    //   193: sipush #24494
    //   196: sipush #14529
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: iconst_0
    //   203: invokestatic ZT : ([BLjava/lang/String;Z)Ljava/lang/String;
    //   206: astore #7
    //   208: aload #7
    //   210: ifnull -> 303
    //   213: aload #7
    //   215: iconst_5
    //   216: invokevirtual substring : (I)Ljava/lang/String;
    //   219: invokevirtual trim : ()Ljava/lang/String;
    //   222: aload_3
    //   223: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   231: ifne -> 303
    //   234: aload_3
    //   235: invokeinterface ZJO : ()I
    //   240: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
    //   245: astore #8
    //   247: aload #7
    //   249: aload #8
    //   251: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   254: ifeq -> 289
    //   257: aload #7
    //   259: iconst_5
    //   260: aload #7
    //   262: invokevirtual length : ()I
    //   265: aload #8
    //   267: invokevirtual length : ()I
    //   270: isub
    //   271: invokevirtual substring : (II)Ljava/lang/String;
    //   274: invokevirtual trim : ()Ljava/lang/String;
    //   277: aload_3
    //   278: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   283: invokevirtual equals : (Ljava/lang/Object;)Z
    //   286: ifne -> 303
    //   289: aload_2
    //   290: sipush #24488
    //   293: sipush #10917
    //   296: invokestatic a : (II)Ljava/lang/String;
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: return
  }
  
  private void ZA(StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, Zmzk paramZmzk) {
    boolean bool = Zs7w.Zw();
    if (this.ZL.Z_())
      return; 
    if (paramZmzk == null) {
      paramStringBuilder1.append(a(24511, 28181));
      if (bool) {
        if (paramZmzk.Zx(this.Zu, this.Zw, this.Zq.Zq(), this.Zq.Zd()) == null)
          paramStringBuilder2.append(a(24503, 16330)).append(paramZmzk.ZJ1()).append(a(24500, -14470)); 
        return;
      } 
      return;
    } 
    if (paramZmzk.Zx(this.Zu, this.Zw, this.Zq.Zq(), this.Zq.Zd()) == null)
      paramStringBuilder2.append(a(24503, 16330)).append(paramZmzk.ZJ1()).append(a(24500, -14470)); 
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '|öäìÛé4õÒ/è3ÏRë2êI+k~j·¦¾\[ù:gð#ðÀµ²ô±¤j¤Kgþeöv!à*ÎqÕï<|3v¯HÄ*Jq7ë]`4ÓðBè\\fQlfxM2M\\n¡W;}ÿéTÙ¤1PìÕ-N >¼aó2³OàYåÞl-é½Ò°7Ë¥çØ4æqè"ÜÎÍùê.^½«,Å[À¶îûÓ?#ä£¹Ó5ñûÌ1v*WæLpXâÙh.Ãv°gxÊòqÞwÏ½4>6îçqßèÑg\\t­ýH"&Y\åÆA\âx\\bb-_Î#Þç%ïK  GaÃ¹´î[£Lãú.fBÂ,x8ÖÑ%zÙ~ò4Mý{!\1Y9%ãK{£N­xcD{aç|Òç;äLç²Ð©X6¨!ìOxèJ«uRo¿Õ¢ý`ôjwý8Tz(=V\\nÎøxW'×Õ¸5v±ByéùÎ1õâi®ÿKghÇ¸ÜéXdy°Î·ß$Ï8GËxaå*g±¶8§[&F+=Ç KúêWçWÌ¯\\b3ÉýÌ?HòÞq!2I"UJëÝµèJó(iN!ÎuZ/ËýD^SP`Ø8ÆdY«î ä*ß* Î9¹q¶PÃ¸´©y/º®YÖgðiHµ£åð6õHõÕÆØLÞD\\t¼)_;LP¿nÀ,¶( ¨ÎÂ~ßÓå[ÏºI³±H×àa6Â±P¡¤ã$ó?2êåý>QÔc¬)öÞ¸/Íi'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #112
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
    //   68: ldc ',¦ÿúÀs|XZ Ú>sB¤nhMËNê1\\tNc¾'ÍÔHÁñ¦ \ð6'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #44
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #65
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
    //   129: putstatic burp/Zrbf.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrbf.b : [Ljava/lang/String;
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
    //   212: bipush #115
    //   214: goto -> 244
    //   217: bipush #62
    //   219: goto -> 244
    //   222: bipush #16
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #100
    //   234: goto -> 244
    //   237: bipush #109
    //   239: goto -> 244
    //   242: bipush #87
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
    int i = (paramInt1 ^ 0x5FBA) & 0xFFFF;
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
      byte b1 = 38;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */