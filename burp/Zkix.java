package burp;

import java.util.Set;
import net.portswigger.Zsy;

class Zkix extends Zkud {
  private static final Set<String> ZK;
  
  Zkix(Zsy paramZsy) {
    super(paramZsy);
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return (ZT(paramZxaq) && ZK.contains(paramString));
  }
  
  protected String ZX(Zmlc paramZmlc) {
    return this.ZS.Zi().Zv().ZK(8);
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '\\n\\bN\\n\\n\\n\\tM\\b\\b\\b\\r\\r\\b\\f \\f\\r\\b\\t \\b\\b\\t\\f\\b\\f\\n\\t\\t\\b\\t\\r\\b'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_5
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #34
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'DGP]WVBSUM_EXT[XC\T'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #8
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #100
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #82
    //   202: goto -> 232
    //   205: bipush #70
    //   207: goto -> 232
    //   210: bipush #85
    //   212: goto -> 232
    //   215: bipush #85
    //   217: goto -> 232
    //   220: bipush #93
    //   222: goto -> 232
    //   225: bipush #83
    //   227: goto -> 232
    //   230: bipush #75
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: bipush #28
    //   290: anewarray java/lang/String
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: bipush #12
    //   298: aaload
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_0
    //   303: bipush #9
    //   305: aaload
    //   306: aastore
    //   307: dup
    //   308: iconst_2
    //   309: aload_0
    //   310: bipush #7
    //   312: aaload
    //   313: aastore
    //   314: dup
    //   315: iconst_3
    //   316: aload_0
    //   317: bipush #10
    //   319: aaload
    //   320: aastore
    //   321: dup
    //   322: iconst_4
    //   323: aload_0
    //   324: bipush #25
    //   326: aaload
    //   327: aastore
    //   328: dup
    //   329: iconst_5
    //   330: aload_0
    //   331: iconst_1
    //   332: aaload
    //   333: aastore
    //   334: dup
    //   335: bipush #6
    //   337: aload_0
    //   338: iconst_0
    //   339: aaload
    //   340: aastore
    //   341: dup
    //   342: bipush #7
    //   344: aload_0
    //   345: bipush #16
    //   347: aaload
    //   348: aastore
    //   349: dup
    //   350: bipush #8
    //   352: aload_0
    //   353: iconst_3
    //   354: aaload
    //   355: aastore
    //   356: dup
    //   357: bipush #9
    //   359: aload_0
    //   360: iconst_4
    //   361: aaload
    //   362: aastore
    //   363: dup
    //   364: bipush #10
    //   366: aload_0
    //   367: bipush #8
    //   369: aaload
    //   370: aastore
    //   371: dup
    //   372: bipush #11
    //   374: aload_0
    //   375: bipush #18
    //   377: aaload
    //   378: aastore
    //   379: dup
    //   380: bipush #12
    //   382: aload_0
    //   383: iconst_2
    //   384: aaload
    //   385: aastore
    //   386: dup
    //   387: bipush #13
    //   389: aload_0
    //   390: bipush #6
    //   392: aaload
    //   393: aastore
    //   394: dup
    //   395: bipush #14
    //   397: aload_0
    //   398: bipush #24
    //   400: aaload
    //   401: aastore
    //   402: dup
    //   403: bipush #15
    //   405: aload_0
    //   406: bipush #11
    //   408: aaload
    //   409: aastore
    //   410: dup
    //   411: bipush #16
    //   413: aload_0
    //   414: bipush #26
    //   416: aaload
    //   417: aastore
    //   418: dup
    //   419: bipush #17
    //   421: aload_0
    //   422: bipush #17
    //   424: aaload
    //   425: aastore
    //   426: dup
    //   427: bipush #18
    //   429: aload_0
    //   430: bipush #21
    //   432: aaload
    //   433: aastore
    //   434: dup
    //   435: bipush #19
    //   437: aload_0
    //   438: bipush #22
    //   440: aaload
    //   441: aastore
    //   442: dup
    //   443: bipush #20
    //   445: aload_0
    //   446: bipush #13
    //   448: aaload
    //   449: aastore
    //   450: dup
    //   451: bipush #21
    //   453: aload_0
    //   454: bipush #14
    //   456: aaload
    //   457: aastore
    //   458: dup
    //   459: bipush #22
    //   461: aload_0
    //   462: iconst_5
    //   463: aaload
    //   464: aastore
    //   465: dup
    //   466: bipush #23
    //   468: aload_0
    //   469: bipush #19
    //   471: aaload
    //   472: aastore
    //   473: dup
    //   474: bipush #24
    //   476: aload_0
    //   477: bipush #27
    //   479: aaload
    //   480: aastore
    //   481: dup
    //   482: bipush #25
    //   484: aload_0
    //   485: bipush #23
    //   487: aaload
    //   488: aastore
    //   489: dup
    //   490: bipush #26
    //   492: aload_0
    //   493: bipush #15
    //   495: aaload
    //   496: aastore
    //   497: dup
    //   498: bipush #27
    //   500: aload_0
    //   501: bipush #20
    //   503: aaload
    //   504: aastore
    //   505: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   508: putstatic burp/Zkix.ZK : Ljava/util/Set;
    //   511: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkix.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */