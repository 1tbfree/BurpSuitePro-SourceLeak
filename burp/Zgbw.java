package burp;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

class Zgbw {
  private static final Map<String, Set<String>> Zm;
  
  public static boolean ZA(String paramString1, String paramString2) {
    return (paramString1.equals(paramString2) || ((Set)Zm.getOrDefault(paramString1, Collections.emptySet())).contains(paramString2));
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'O\\t^"eMHN7iKG\\t^;dWHQ5\\n~J\\tSG\\t^;dWHQ5\\n~J\\tS^%kQU\\rO\\t^"eMHU3\\r\\bO\\t^"eM\\rO\\t^"eMHU%\\rO\\t^"eMHU%G\\t^;dWHQ5\\n~J\\tS^>\\nyK'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #15
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #92
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'v-q6>m+|3  Gojw3!e+|',Fujs=(\h+q|;Mg'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #20
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #126
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #127
    //   202: goto -> 232
    //   205: bipush #58
    //   207: goto -> 232
    //   210: bipush #97
    //   212: goto -> 232
    //   215: bipush #44
    //   217: goto -> 232
    //   220: bipush #10
    //   222: goto -> 232
    //   225: bipush #55
    //   227: goto -> 232
    //   230: bipush #86
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: new java/util/HashMap
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: putstatic burp/Zgbw.Zm : Ljava/util/Map;
    //   298: iconst_1
    //   299: anewarray java/lang/String
    //   302: dup
    //   303: iconst_0
    //   304: aload_0
    //   305: bipush #6
    //   307: aaload
    //   308: aastore
    //   309: invokestatic ZU : ([Ljava/lang/String;)Lburp/Zeej;
    //   312: iconst_1
    //   313: anewarray java/lang/String
    //   316: dup
    //   317: iconst_0
    //   318: aload_0
    //   319: bipush #8
    //   321: aaload
    //   322: aastore
    //   323: invokevirtual Zh : ([Ljava/lang/String;)V
    //   326: iconst_1
    //   327: anewarray java/lang/String
    //   330: dup
    //   331: iconst_0
    //   332: aload_0
    //   333: iconst_5
    //   334: aaload
    //   335: aastore
    //   336: invokestatic ZU : ([Ljava/lang/String;)Lburp/Zeej;
    //   339: iconst_1
    //   340: anewarray java/lang/String
    //   343: dup
    //   344: iconst_0
    //   345: aload_0
    //   346: bipush #7
    //   348: aaload
    //   349: aastore
    //   350: invokevirtual Zh : ([Ljava/lang/String;)V
    //   353: iconst_1
    //   354: anewarray java/lang/String
    //   357: dup
    //   358: iconst_0
    //   359: aload_0
    //   360: iconst_3
    //   361: aaload
    //   362: aastore
    //   363: invokestatic ZU : ([Ljava/lang/String;)Lburp/Zeej;
    //   366: iconst_1
    //   367: anewarray java/lang/String
    //   370: dup
    //   371: iconst_0
    //   372: aload_0
    //   373: bipush #9
    //   375: aaload
    //   376: aastore
    //   377: invokevirtual Zh : ([Ljava/lang/String;)V
    //   380: iconst_1
    //   381: anewarray java/lang/String
    //   384: dup
    //   385: iconst_0
    //   386: aload_0
    //   387: iconst_0
    //   388: aaload
    //   389: aastore
    //   390: invokestatic ZU : ([Ljava/lang/String;)Lburp/Zeej;
    //   393: iconst_1
    //   394: anewarray java/lang/String
    //   397: dup
    //   398: iconst_0
    //   399: aload_0
    //   400: iconst_2
    //   401: aaload
    //   402: aastore
    //   403: invokevirtual Zh : ([Ljava/lang/String;)V
    //   406: iconst_1
    //   407: anewarray java/lang/String
    //   410: dup
    //   411: iconst_0
    //   412: aload_0
    //   413: iconst_4
    //   414: aaload
    //   415: aastore
    //   416: invokestatic ZU : ([Ljava/lang/String;)Lburp/Zeej;
    //   419: iconst_1
    //   420: anewarray java/lang/String
    //   423: dup
    //   424: iconst_0
    //   425: aload_0
    //   426: iconst_1
    //   427: aaload
    //   428: aastore
    //   429: invokevirtual Zh : ([Ljava/lang/String;)V
    //   432: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */