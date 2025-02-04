package burp;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.SSLContext;

public class Zxkc {
  private static final Ztt4 ZC;
  
  static final String[] Zd;
  
  private final int ZT;
  
  private final InetAddress ZL;
  
  private final Zzkb ZX;
  
  final boolean Zf;
  
  public final List<String> ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxkc(int paramInt, InetAddress paramInetAddress, Zzkb paramZzkb, boolean paramBoolean) {
    this.ZT = paramInt;
    this.ZL = paramInetAddress;
    this.ZX = paramZzkb;
    this.Zf = paramBoolean;
    this.ZB = new ArrayList<>();
  }
  
  public ServerSocket ZS(Zbf_ paramZbf_, String paramString) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZX : Lburp/Zzkb;
    //   8: invokevirtual Zv : ()Ljavax/net/ssl/SSLContext;
    //   11: astore #5
    //   13: aload #5
    //   15: invokevirtual getServerSocketFactory : ()Ljavax/net/ssl/SSLServerSocketFactory;
    //   18: astore #6
    //   20: aload_0
    //   21: getfield ZL : Ljava/net/InetAddress;
    //   24: ifnonnull -> 42
    //   27: aload #6
    //   29: aload_0
    //   30: getfield ZT : I
    //   33: invokevirtual createServerSocket : (I)Ljava/net/ServerSocket;
    //   36: astore #4
    //   38: aload_3
    //   39: ifnull -> 69
    //   42: aload #6
    //   44: invokevirtual createServerSocket : ()Ljava/net/ServerSocket;
    //   47: astore #4
    //   49: aload #4
    //   51: new java/net/InetSocketAddress
    //   54: dup
    //   55: aload_0
    //   56: getfield ZL : Ljava/net/InetAddress;
    //   59: aload_0
    //   60: getfield ZT : I
    //   63: invokespecial <init> : (Ljava/net/InetAddress;I)V
    //   66: invokevirtual bind : (Ljava/net/SocketAddress;)V
    //   69: aload_0
    //   70: aload #5
    //   72: invokevirtual ZJ : (Ljavax/net/ssl/SSLContext;)V
    //   75: aload #4
    //   77: sipush #500
    //   80: invokevirtual setSoTimeout : (I)V
    //   83: getstatic burp/Zxkc.ZC : Lburp/Ztt4;
    //   86: aload_2
    //   87: aload_0
    //   88: getfield ZL : Ljava/net/InetAddress;
    //   91: ifnull -> 113
    //   94: aload_0
    //   95: getfield ZL : Ljava/net/InetAddress;
    //   98: invokevirtual getHostAddress : ()Ljava/lang/String;
    //   101: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   106: goto -> 115
    //   109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   112: athrow
    //   113: ldc ''
    //   115: aload_0
    //   116: getfield ZT : I
    //   119: istore #7
    //   121: astore #8
    //   123: astore #9
    //   125: sipush #-19142
    //   128: sipush #23470
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: aload #9
    //   136: sipush #-19165
    //   139: sipush #-10256
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: aload #8
    //   147: iload #7
    //   149: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   154: invokeinterface ZJ : (Ljava/lang/String;)V
    //   159: aload #4
    //   161: areturn
    //   162: astore #4
    //   164: aload #4
    //   166: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   169: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   172: aload_1
    //   173: iconst_1
    //   174: putfield Zt : Z
    //   177: getstatic burp/Zxkc.ZC : Lburp/Ztt4;
    //   180: aload_2
    //   181: aload_0
    //   182: getfield ZT : I
    //   185: sipush #-19144
    //   188: sipush #32684
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: swap
    //   195: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   200: aload #4
    //   202: invokeinterface Zh : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   207: aconst_null
    //   208: areturn
    // Exception table:
    //   from	to	target	type
    //   4	161	162	java/lang/Throwable
    //   69	109	109	java/lang/Throwable
  }
  
  private void ZJ(SSLContext paramSSLContext) {
    Zbqc[] arrayOfZbqc = Zb25.Zp();
    if (this.Zf) {
      HashSet hashSet = new HashSet(Arrays.asList((Object[])paramSSLContext.getSupportedSSLParameters().getCipherSuites()));
      String[] arrayOfString = Zd;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str = arrayOfString[b];
        if (hashSet.contains(str))
          this.ZB.add(str); 
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null) {
        this.ZB.addAll(Arrays.asList(paramSSLContext.getSupportedSSLParameters().getCipherSuites()));
        return;
      } 
      return;
    } 
    this.ZB.addAll(Arrays.asList(paramSSLContext.getSupportedSSLParameters().getCipherSuites()));
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¨É3\\r\\rOó¤ÖZ¥º·ü¡þ¡ÏüOîÀ±à¿[q T¬÷fÐQ§7£Ê(Áì)yÃ6Aa² ¬'TÏ0åmR¥ræX\tzäæÁÑRÉ>«ì£²ä÷ í8À}4\\fÏÜî@££¾ÒU³»î(¹Ú?¥Ã.t?$tÜó¬À¡sÚD´\\nÄ½üFcÄRßZVN¶WÐ WS<E$ï,åá`¿8é¹Òµ\\blCÏú\\b Ë0j¬%õÇTµÙ`#PwkºÒÔ;ärKð£oöÏ¦gEtè­H¹ó\\\tãH«tmìzÝxÙþzßWåäåö,üeZÛ#*ÕôW9ÖäÀ6»¾"Ëø\\f"j^ïµý¾kÅ#{Q2'G{£xiqhù³õ<\\t¹SnÃ­¤}·úú¥4Ãî^Ñ°i×^A'ý©Â-<yëW^h×·4w2E»èG\\rE¤Ô\\n«Þ&\\rë0ÑÆ%|]ò³:ªÄaóÂC§¸*\\b\«^¦c/o¿\\nnàG¹Ó"$ÇuÃÓ`ÖS?°ä5ÛØB~#¤êéEX¨¦HÃÒOW(áËc³\\n >©¬Bý#¨Ï\\rv0Mç´ÓÄ:éÅÔ©j$-6x\\r\\n­»Þ ³"6ò»Fá¶W8×øSxu[«°FøËE1r¬ëo¾"9¾ZÏ/%f§üÉ`K@ Hº")ÁÝ<ÇQr´ÅxÄr.ÊÕ¼Pá§§<Ao\ÓÇoG~Rï#£lôZ=úWEb°ÎÿÈgE¿è*_GqäÔ÷í ÅÛÅcÝ»>^Ðd[\¡ú¶¶ÇN¤ª&o¾¯Õo¶'ÁE{Ì³B(¦/;g56"\\b;ðdµÛ¥±%:ÌÜÈóþ-\\t±ðÕ%+{g³oB¦í+Ï):íøÄ¿ÈÖ£Õ`¹'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #39
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
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
    //   68: ldc '5ÀàgÛtTþùV6¸Âé \\rÄ×Ób°Æ­Ã*VºM%¤xò\\f!F¼çç\\tÚÅ2ï4ùáJª|yf)×ºÔ¨ÒWJQ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #37
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #62
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
    //   129: putstatic burp/Zxkc.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxkc.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #104
    //   219: goto -> 244
    //   222: bipush #53
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #92
    //   234: goto -> 244
    //   237: bipush #100
    //   239: goto -> 244
    //   242: bipush #67
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
    //   300: invokestatic Zr : ()Lburp/Ztt4;
    //   303: putstatic burp/Zxkc.ZC : Lburp/Ztt4;
    //   306: bipush #23
    //   308: anewarray java/lang/String
    //   311: dup
    //   312: iconst_0
    //   313: sipush #-19159
    //   316: sipush #19938
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: aastore
    //   323: dup
    //   324: iconst_1
    //   325: sipush #-19152
    //   328: sipush #-23564
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: aastore
    //   335: dup
    //   336: iconst_2
    //   337: sipush #-19160
    //   340: sipush #16288
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: aastore
    //   347: dup
    //   348: iconst_3
    //   349: sipush #-19150
    //   352: sipush #18897
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: aastore
    //   359: dup
    //   360: iconst_4
    //   361: sipush #-19146
    //   364: sipush #26087
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: aastore
    //   371: dup
    //   372: iconst_5
    //   373: sipush #-19143
    //   376: sipush #12558
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: aastore
    //   383: dup
    //   384: bipush #6
    //   386: sipush #-19161
    //   389: sipush #-13036
    //   392: invokestatic a : (II)Ljava/lang/String;
    //   395: aastore
    //   396: dup
    //   397: bipush #7
    //   399: sipush #-19141
    //   402: sipush #-15153
    //   405: invokestatic a : (II)Ljava/lang/String;
    //   408: aastore
    //   409: dup
    //   410: bipush #8
    //   412: sipush #-19167
    //   415: sipush #9948
    //   418: invokestatic a : (II)Ljava/lang/String;
    //   421: aastore
    //   422: dup
    //   423: bipush #9
    //   425: sipush #-19148
    //   428: sipush #17059
    //   431: invokestatic a : (II)Ljava/lang/String;
    //   434: aastore
    //   435: dup
    //   436: bipush #10
    //   438: sipush #-19140
    //   441: sipush #-14690
    //   444: invokestatic a : (II)Ljava/lang/String;
    //   447: aastore
    //   448: dup
    //   449: bipush #11
    //   451: sipush #-19162
    //   454: sipush #11421
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: aastore
    //   461: dup
    //   462: bipush #12
    //   464: sipush #-19168
    //   467: sipush #-13737
    //   470: invokestatic a : (II)Ljava/lang/String;
    //   473: aastore
    //   474: dup
    //   475: bipush #13
    //   477: sipush #-19147
    //   480: sipush #-29343
    //   483: invokestatic a : (II)Ljava/lang/String;
    //   486: aastore
    //   487: dup
    //   488: bipush #14
    //   490: sipush #-19138
    //   493: sipush #-26722
    //   496: invokestatic a : (II)Ljava/lang/String;
    //   499: aastore
    //   500: dup
    //   501: bipush #15
    //   503: sipush #-19149
    //   506: sipush #1393
    //   509: invokestatic a : (II)Ljava/lang/String;
    //   512: aastore
    //   513: dup
    //   514: bipush #16
    //   516: sipush #-19137
    //   519: sipush #-25135
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: aastore
    //   526: dup
    //   527: bipush #17
    //   529: sipush #-19164
    //   532: sipush #6717
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: aastore
    //   539: dup
    //   540: bipush #18
    //   542: sipush #-19151
    //   545: sipush #-8368
    //   548: invokestatic a : (II)Ljava/lang/String;
    //   551: aastore
    //   552: dup
    //   553: bipush #19
    //   555: sipush #-19163
    //   558: sipush #10718
    //   561: invokestatic a : (II)Ljava/lang/String;
    //   564: aastore
    //   565: dup
    //   566: bipush #20
    //   568: sipush #-19166
    //   571: sipush #26837
    //   574: invokestatic a : (II)Ljava/lang/String;
    //   577: aastore
    //   578: dup
    //   579: bipush #21
    //   581: sipush #-19139
    //   584: sipush #-8356
    //   587: invokestatic a : (II)Ljava/lang/String;
    //   590: aastore
    //   591: dup
    //   592: bipush #22
    //   594: sipush #-19145
    //   597: sipush #-2223
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: aastore
    //   604: putstatic burp/Zxkc.Zd : [Ljava/lang/String;
    //   607: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB530) & 0xFFFF;
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
      byte b1 = 27;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */