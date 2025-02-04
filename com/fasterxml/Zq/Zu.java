package com.fasterxml.Zq;

import com.fasterxml.Zb.Zh;
import com.fasterxml.Zb.Zm;

public enum Zu implements Zh {
  ALLOW_JAVA_COMMENTS, ALLOW_YAML_COMMENTS, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_UNESCAPED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_LEADING_ZEROS_FOR_NUMBERS, ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS, ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS, ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS, ALLOW_NON_NUMERIC_NUMBERS, ALLOW_MISSING_VALUES, ALLOW_TRAILING_COMMA;
  
  private final boolean ZY;
  
  private final int Z_;
  
  private final Zm Za;
  
  private static final Zu[] ZM;
  
  Zu(boolean paramBoolean, Zm paramZm) {
    this.ZY = paramBoolean;
    this.Z_ = 1 << ordinal();
    this.Za = paramZm;
  }
  
  public boolean ZP() {
    return this.ZY;
  }
  
  public int ZV() {
    return this.Z_;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.Z_) != 0);
  }
  
  public Zm Zj() {
    return this.Za;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'r~c v}aoywqc}|moh`r~c vvven\\ti`cv|mbdvar~c va{`gl\\r}ahr~c vrssf~|x'r~c vvven\\twqehl}e}\\tu`s|q`r~c vzaen\\te~yzr~c v}gcll\\b{im\\t}ir~c vr~sf~|xr~c v| mbdaqs|q`#r~c vvven\\tcg\\bzt mj{\\t}n{&r~c vr\\ryh{whz usgl\\rzmhg`'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #29
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #18
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
    //   68: ldc '`b`m|sh\\r|us |`jjanf`bgbpecf'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #40
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #112
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
    //   200: bipush #33
    //   202: goto -> 232
    //   205: bipush #92
    //   207: goto -> 232
    //   210: bipush #32
    //   212: goto -> 232
    //   215: bipush #62
    //   217: goto -> 232
    //   220: bipush #69
    //   222: goto -> 232
    //   225: bipush #59
    //   227: goto -> 232
    //   230: bipush #68
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
    //   288: new com/fasterxml/Zq/Zu
    //   291: dup
    //   292: aload_0
    //   293: iconst_3
    //   294: aaload
    //   295: iconst_0
    //   296: iconst_0
    //   297: getstatic com/fasterxml/Zb/Zm.ALLOW_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   300: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   303: putstatic com/fasterxml/Zq/Zu.ALLOW_JAVA_COMMENTS : Lcom/fasterxml/Zq/Zu;
    //   306: new com/fasterxml/Zq/Zu
    //   309: dup
    //   310: aload_0
    //   311: bipush #7
    //   313: aaload
    //   314: iconst_1
    //   315: iconst_0
    //   316: getstatic com/fasterxml/Zb/Zm.ALLOW_YAML_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   319: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   322: putstatic com/fasterxml/Zq/Zu.ALLOW_YAML_COMMENTS : Lcom/fasterxml/Zq/Zu;
    //   325: new com/fasterxml/Zq/Zu
    //   328: dup
    //   329: aload_0
    //   330: bipush #12
    //   332: aaload
    //   333: iconst_2
    //   334: iconst_0
    //   335: getstatic com/fasterxml/Zb/Zm.ALLOW_SINGLE_QUOTES : Lcom/fasterxml/Zb/Zm;
    //   338: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   341: putstatic com/fasterxml/Zq/Zu.ALLOW_SINGLE_QUOTES : Lcom/fasterxml/Zq/Zu;
    //   344: new com/fasterxml/Zq/Zu
    //   347: dup
    //   348: aload_0
    //   349: bipush #6
    //   351: aaload
    //   352: iconst_3
    //   353: iconst_0
    //   354: getstatic com/fasterxml/Zb/Zm.ALLOW_UNQUOTED_FIELD_NAMES : Lcom/fasterxml/Zb/Zm;
    //   357: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   360: putstatic com/fasterxml/Zq/Zu.ALLOW_UNQUOTED_FIELD_NAMES : Lcom/fasterxml/Zq/Zu;
    //   363: new com/fasterxml/Zq/Zu
    //   366: dup
    //   367: aload_0
    //   368: iconst_0
    //   369: aaload
    //   370: iconst_4
    //   371: iconst_0
    //   372: getstatic com/fasterxml/Zb/Zm.ALLOW_UNQUOTED_CONTROL_CHARS : Lcom/fasterxml/Zb/Zm;
    //   375: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   378: putstatic com/fasterxml/Zq/Zu.ALLOW_UNESCAPED_CONTROL_CHARS : Lcom/fasterxml/Zq/Zu;
    //   381: new com/fasterxml/Zq/Zu
    //   384: dup
    //   385: aload_0
    //   386: bipush #10
    //   388: aaload
    //   389: iconst_5
    //   390: iconst_0
    //   391: getstatic com/fasterxml/Zb/Zm.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER : Lcom/fasterxml/Zb/Zm;
    //   394: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   397: putstatic com/fasterxml/Zq/Zu.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER : Lcom/fasterxml/Zq/Zu;
    //   400: new com/fasterxml/Zq/Zu
    //   403: dup
    //   404: aload_0
    //   405: iconst_1
    //   406: aaload
    //   407: bipush #6
    //   409: iconst_0
    //   410: getstatic com/fasterxml/Zb/Zm.ALLOW_NUMERIC_LEADING_ZEROS : Lcom/fasterxml/Zb/Zm;
    //   413: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   416: putstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_ZEROS_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   419: new com/fasterxml/Zq/Zu
    //   422: dup
    //   423: aload_0
    //   424: bipush #9
    //   426: aaload
    //   427: bipush #7
    //   429: iconst_0
    //   430: getstatic com/fasterxml/Zb/Zm.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   433: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   436: putstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   439: new com/fasterxml/Zq/Zu
    //   442: dup
    //   443: aload_0
    //   444: iconst_4
    //   445: aaload
    //   446: bipush #8
    //   448: iconst_0
    //   449: getstatic com/fasterxml/Zb/Zm.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   452: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   455: putstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   458: new com/fasterxml/Zq/Zu
    //   461: dup
    //   462: aload_0
    //   463: bipush #11
    //   465: aaload
    //   466: bipush #9
    //   468: iconst_0
    //   469: getstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   472: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   475: putstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   478: new com/fasterxml/Zq/Zu
    //   481: dup
    //   482: aload_0
    //   483: bipush #8
    //   485: aaload
    //   486: bipush #10
    //   488: iconst_0
    //   489: getstatic com/fasterxml/Zb/Zm.ALLOW_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zb/Zm;
    //   492: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   495: putstatic com/fasterxml/Zq/Zu.ALLOW_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   498: new com/fasterxml/Zq/Zu
    //   501: dup
    //   502: aload_0
    //   503: iconst_5
    //   504: aaload
    //   505: bipush #11
    //   507: iconst_0
    //   508: getstatic com/fasterxml/Zb/Zm.ALLOW_MISSING_VALUES : Lcom/fasterxml/Zb/Zm;
    //   511: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   514: putstatic com/fasterxml/Zq/Zu.ALLOW_MISSING_VALUES : Lcom/fasterxml/Zq/Zu;
    //   517: new com/fasterxml/Zq/Zu
    //   520: dup
    //   521: aload_0
    //   522: iconst_2
    //   523: aaload
    //   524: bipush #12
    //   526: iconst_0
    //   527: getstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_COMMA : Lcom/fasterxml/Zb/Zm;
    //   530: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zm;)V
    //   533: putstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_COMMA : Lcom/fasterxml/Zq/Zu;
    //   536: bipush #13
    //   538: anewarray com/fasterxml/Zq/Zu
    //   541: dup
    //   542: iconst_0
    //   543: getstatic com/fasterxml/Zq/Zu.ALLOW_JAVA_COMMENTS : Lcom/fasterxml/Zq/Zu;
    //   546: aastore
    //   547: dup
    //   548: iconst_1
    //   549: getstatic com/fasterxml/Zq/Zu.ALLOW_YAML_COMMENTS : Lcom/fasterxml/Zq/Zu;
    //   552: aastore
    //   553: dup
    //   554: iconst_2
    //   555: getstatic com/fasterxml/Zq/Zu.ALLOW_SINGLE_QUOTES : Lcom/fasterxml/Zq/Zu;
    //   558: aastore
    //   559: dup
    //   560: iconst_3
    //   561: getstatic com/fasterxml/Zq/Zu.ALLOW_UNQUOTED_FIELD_NAMES : Lcom/fasterxml/Zq/Zu;
    //   564: aastore
    //   565: dup
    //   566: iconst_4
    //   567: getstatic com/fasterxml/Zq/Zu.ALLOW_UNESCAPED_CONTROL_CHARS : Lcom/fasterxml/Zq/Zu;
    //   570: aastore
    //   571: dup
    //   572: iconst_5
    //   573: getstatic com/fasterxml/Zq/Zu.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER : Lcom/fasterxml/Zq/Zu;
    //   576: aastore
    //   577: dup
    //   578: bipush #6
    //   580: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_ZEROS_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   583: aastore
    //   584: dup
    //   585: bipush #7
    //   587: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   590: aastore
    //   591: dup
    //   592: bipush #8
    //   594: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   597: aastore
    //   598: dup
    //   599: bipush #9
    //   601: getstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   604: aastore
    //   605: dup
    //   606: bipush #10
    //   608: getstatic com/fasterxml/Zq/Zu.ALLOW_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   611: aastore
    //   612: dup
    //   613: bipush #11
    //   615: getstatic com/fasterxml/Zq/Zu.ALLOW_MISSING_VALUES : Lcom/fasterxml/Zq/Zu;
    //   618: aastore
    //   619: dup
    //   620: bipush #12
    //   622: getstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_COMMA : Lcom/fasterxml/Zq/Zu;
    //   625: aastore
    //   626: putstatic com/fasterxml/Zq/Zu.ZM : [Lcom/fasterxml/Zq/Zu;
    //   629: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */