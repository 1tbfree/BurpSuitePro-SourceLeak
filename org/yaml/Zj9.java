package org.yaml;

import java.util.Map;
import java.util.Set;

public final class Zj9 {
  public static final Zj9 Zh;
  
  public static final Zj9 ZF;
  
  public static final Zj9 Zr;
  
  public static final Zj9 Zi;
  
  public static final Zj9 Zz;
  
  public static final Zj9 Zf;
  
  public static final Zj9 ZW;
  
  public static final Zj9 ZR;
  
  public static final Zj9 ZE;
  
  public static final Zj9 ZC;
  
  public static final Zj9 ZN;
  
  public static final Zj9 ZK;
  
  public static final Zj9 Za;
  
  public static final Zj9 ZU;
  
  public static final Set<Zj9> Zt;
  
  public static final Zj9 ZD;
  
  private static final Map<Zj9, Set<Class<?>>> Zj;
  
  private final String Zg;
  
  private boolean Zp = false;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zj9(String paramString) {
    if (paramString == null)
      throw new NullPointerException(a(31658, 25995)); 
    try {
      if (paramString.length() == 0)
        throw new IllegalArgumentException(a(31673, -27251)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramString.trim().length() != paramString.length())
        throw new IllegalArgumentException(a(31657, 5102)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.Zg = Zlk.Zz(paramString);
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zp = !paramString.startsWith(a(31676, 31956));
  }
  
  public Zj9(Class<? extends Object> paramClass) {
    if (paramClass == null)
      throw new NullPointerException(a(31660, -20531)); 
    this.Zg = a(31676, 31956) + Zlk.Zz(paramClass.getName());
  }
  
  public boolean Zs() {
    return this.Zp;
  }
  
  public String Zl() {
    return this.Zg;
  }
  
  public boolean ZS(String paramString) {
    return this.Zg.startsWith(paramString);
  }
  
  public String Zy() {
    try {
      if (this.Zp)
        throw new Zj3(a(31677, -4829) + this.Zg); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zlk.ZV(this.Zg.substring(a(31670, 9509).length()));
  }
  
  public String toString() {
    return this.Zg;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof Zj9)
        return this.Zg.equals(((Zj9)paramObject).Zl()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.Zg.hashCode();
  }
  
  public boolean Zr(Class<?> paramClass) {
    Set set = Zj.get(this);
    try {
      if (set != null)
        return set.contains(paramClass); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zu() {
    try {
      if (!this.Zp)
        try {
          if (!Zt.contains(this));
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qãh]ÊJ ´ºoÒ0piÿ±Øú[ËxÄsÙ(uXtiD$>*\\f<ÃÓAPel ÆÆkÌ^2yæÕ%qÇoÇLãJÏEã¼P³ó=Þ]"`'MÏh>À `÷¿êÂªõGØZa}7lP\\rÜ<£&¼;ÈÛ úi/\ð8\\néÜ)ÐàI×J»¨]zopùàøýæô|dvG­©Tåÿs²@a§ÛÈ¤÷S¨Òï£6Ú]2¾)»Ä¤vS/®Ò/£.ºR""2¸0Çè?üÔc`ÇÑ¹Û¨K­^µKhwñ]*EI©b¶K\\nâ v{É¤ üUQ>Í Xù@ò\\n"ó¥TÛzüq5Ï_²K¬^qÏ{~.[ØÏ¨íûz¶vé7öQÙE5b¹d\\r/_Ù{h»t ÍX3bÔ¸ug|)0Q>0ìã\\nr»Äï[GC#'± î¥RLôz}mö ¦Å5Q+®f9ó\cR_6ñ¹q½Ë÷Ð*¤n¨¬AõÆy9Ölzw¶%µåW×wõ\\räO[\\bJò³§½öô\\ri'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #23
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
    //   68: ldc '9Ígf-ñÜBH3P8G \\rh£´ê{gU¹Ï£Ê5\\tÆÍ]möÑ>b­^Rú'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic org/yaml/Zj9.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic org/yaml/Zj9.b : [Ljava/lang/String;
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
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #94
    //   224: goto -> 244
    //   227: bipush #49
    //   229: goto -> 244
    //   232: bipush #34
    //   234: goto -> 244
    //   237: bipush #8
    //   239: goto -> 244
    //   242: bipush #107
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
    //   300: new org/yaml/Zj9
    //   303: dup
    //   304: sipush #31669
    //   307: sipush #-6203
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic org/yaml/Zj9.Zh : Lorg/yaml/Zj9;
    //   319: new org/yaml/Zj9
    //   322: dup
    //   323: sipush #31665
    //   326: sipush #-9728
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokespecial <init> : (Ljava/lang/String;)V
    //   335: putstatic org/yaml/Zj9.ZF : Lorg/yaml/Zj9;
    //   338: new org/yaml/Zj9
    //   341: dup
    //   342: sipush #31672
    //   345: sipush #-3089
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: putstatic org/yaml/Zj9.Zr : Lorg/yaml/Zj9;
    //   357: new org/yaml/Zj9
    //   360: dup
    //   361: sipush #31679
    //   364: sipush #23579
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: invokespecial <init> : (Ljava/lang/String;)V
    //   373: putstatic org/yaml/Zj9.Zi : Lorg/yaml/Zj9;
    //   376: new org/yaml/Zj9
    //   379: dup
    //   380: sipush #31671
    //   383: sipush #28653
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: invokespecial <init> : (Ljava/lang/String;)V
    //   392: putstatic org/yaml/Zj9.Zz : Lorg/yaml/Zj9;
    //   395: new org/yaml/Zj9
    //   398: dup
    //   399: sipush #31661
    //   402: sipush #-15408
    //   405: invokestatic a : (II)Ljava/lang/String;
    //   408: invokespecial <init> : (Ljava/lang/String;)V
    //   411: putstatic org/yaml/Zj9.Zf : Lorg/yaml/Zj9;
    //   414: new org/yaml/Zj9
    //   417: dup
    //   418: sipush #31662
    //   421: sipush #21827
    //   424: invokestatic a : (II)Ljava/lang/String;
    //   427: invokespecial <init> : (Ljava/lang/String;)V
    //   430: putstatic org/yaml/Zj9.ZW : Lorg/yaml/Zj9;
    //   433: new org/yaml/Zj9
    //   436: dup
    //   437: sipush #31668
    //   440: sipush #-4865
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: invokespecial <init> : (Ljava/lang/String;)V
    //   449: putstatic org/yaml/Zj9.ZR : Lorg/yaml/Zj9;
    //   452: new org/yaml/Zj9
    //   455: dup
    //   456: sipush #31667
    //   459: sipush #25488
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokespecial <init> : (Ljava/lang/String;)V
    //   468: putstatic org/yaml/Zj9.ZE : Lorg/yaml/Zj9;
    //   471: new org/yaml/Zj9
    //   474: dup
    //   475: sipush #31674
    //   478: sipush #9766
    //   481: invokestatic a : (II)Ljava/lang/String;
    //   484: invokespecial <init> : (Ljava/lang/String;)V
    //   487: putstatic org/yaml/Zj9.ZC : Lorg/yaml/Zj9;
    //   490: new org/yaml/Zj9
    //   493: dup
    //   494: sipush #31666
    //   497: sipush #-11881
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: invokespecial <init> : (Ljava/lang/String;)V
    //   506: putstatic org/yaml/Zj9.ZN : Lorg/yaml/Zj9;
    //   509: new org/yaml/Zj9
    //   512: dup
    //   513: sipush #31675
    //   516: sipush #18397
    //   519: invokestatic a : (II)Ljava/lang/String;
    //   522: invokespecial <init> : (Ljava/lang/String;)V
    //   525: putstatic org/yaml/Zj9.ZK : Lorg/yaml/Zj9;
    //   528: new org/yaml/Zj9
    //   531: dup
    //   532: sipush #31678
    //   535: sipush #3970
    //   538: invokestatic a : (II)Ljava/lang/String;
    //   541: invokespecial <init> : (Ljava/lang/String;)V
    //   544: putstatic org/yaml/Zj9.Za : Lorg/yaml/Zj9;
    //   547: new org/yaml/Zj9
    //   550: dup
    //   551: sipush #31663
    //   554: sipush #-28379
    //   557: invokestatic a : (II)Ljava/lang/String;
    //   560: invokespecial <init> : (Ljava/lang/String;)V
    //   563: putstatic org/yaml/Zj9.ZU : Lorg/yaml/Zj9;
    //   566: new java/util/HashSet
    //   569: dup
    //   570: bipush #15
    //   572: invokespecial <init> : (I)V
    //   575: putstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   578: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   581: getstatic org/yaml/Zj9.Zh : Lorg/yaml/Zj9;
    //   584: invokeinterface add : (Ljava/lang/Object;)Z
    //   589: pop
    //   590: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   593: getstatic org/yaml/Zj9.ZF : Lorg/yaml/Zj9;
    //   596: invokeinterface add : (Ljava/lang/Object;)Z
    //   601: pop
    //   602: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   605: getstatic org/yaml/Zj9.Zr : Lorg/yaml/Zj9;
    //   608: invokeinterface add : (Ljava/lang/Object;)Z
    //   613: pop
    //   614: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   617: getstatic org/yaml/Zj9.Zi : Lorg/yaml/Zj9;
    //   620: invokeinterface add : (Ljava/lang/Object;)Z
    //   625: pop
    //   626: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   629: getstatic org/yaml/Zj9.Zz : Lorg/yaml/Zj9;
    //   632: invokeinterface add : (Ljava/lang/Object;)Z
    //   637: pop
    //   638: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   641: getstatic org/yaml/Zj9.Zf : Lorg/yaml/Zj9;
    //   644: invokeinterface add : (Ljava/lang/Object;)Z
    //   649: pop
    //   650: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   653: getstatic org/yaml/Zj9.ZW : Lorg/yaml/Zj9;
    //   656: invokeinterface add : (Ljava/lang/Object;)Z
    //   661: pop
    //   662: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   665: getstatic org/yaml/Zj9.ZR : Lorg/yaml/Zj9;
    //   668: invokeinterface add : (Ljava/lang/Object;)Z
    //   673: pop
    //   674: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   677: getstatic org/yaml/Zj9.ZE : Lorg/yaml/Zj9;
    //   680: invokeinterface add : (Ljava/lang/Object;)Z
    //   685: pop
    //   686: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   689: getstatic org/yaml/Zj9.ZC : Lorg/yaml/Zj9;
    //   692: invokeinterface add : (Ljava/lang/Object;)Z
    //   697: pop
    //   698: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   701: getstatic org/yaml/Zj9.ZN : Lorg/yaml/Zj9;
    //   704: invokeinterface add : (Ljava/lang/Object;)Z
    //   709: pop
    //   710: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   713: getstatic org/yaml/Zj9.ZK : Lorg/yaml/Zj9;
    //   716: invokeinterface add : (Ljava/lang/Object;)Z
    //   721: pop
    //   722: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   725: getstatic org/yaml/Zj9.Za : Lorg/yaml/Zj9;
    //   728: invokeinterface add : (Ljava/lang/Object;)Z
    //   733: pop
    //   734: getstatic org/yaml/Zj9.Zt : Ljava/util/Set;
    //   737: getstatic org/yaml/Zj9.ZU : Lorg/yaml/Zj9;
    //   740: invokeinterface add : (Ljava/lang/Object;)Z
    //   745: pop
    //   746: new org/yaml/Zj9
    //   749: dup
    //   750: sipush #31664
    //   753: sipush #11948
    //   756: invokestatic a : (II)Ljava/lang/String;
    //   759: invokespecial <init> : (Ljava/lang/String;)V
    //   762: putstatic org/yaml/Zj9.ZD : Lorg/yaml/Zj9;
    //   765: new java/util/HashMap
    //   768: dup
    //   769: invokespecial <init> : ()V
    //   772: putstatic org/yaml/Zj9.Zj : Ljava/util/Map;
    //   775: new java/util/HashSet
    //   778: dup
    //   779: invokespecial <init> : ()V
    //   782: astore #7
    //   784: aload #7
    //   786: ldc java/lang/Double
    //   788: invokeinterface add : (Ljava/lang/Object;)Z
    //   793: pop
    //   794: aload #7
    //   796: ldc java/lang/Float
    //   798: invokeinterface add : (Ljava/lang/Object;)Z
    //   803: pop
    //   804: aload #7
    //   806: ldc java/math/BigDecimal
    //   808: invokeinterface add : (Ljava/lang/Object;)Z
    //   813: pop
    //   814: getstatic org/yaml/Zj9.Zj : Ljava/util/Map;
    //   817: getstatic org/yaml/Zj9.ZR : Lorg/yaml/Zj9;
    //   820: aload #7
    //   822: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   827: pop
    //   828: new java/util/HashSet
    //   831: dup
    //   832: invokespecial <init> : ()V
    //   835: astore #8
    //   837: aload #8
    //   839: ldc java/lang/Integer
    //   841: invokeinterface add : (Ljava/lang/Object;)Z
    //   846: pop
    //   847: aload #8
    //   849: ldc java/lang/Long
    //   851: invokeinterface add : (Ljava/lang/Object;)Z
    //   856: pop
    //   857: aload #8
    //   859: ldc java/math/BigInteger
    //   861: invokeinterface add : (Ljava/lang/Object;)Z
    //   866: pop
    //   867: getstatic org/yaml/Zj9.Zj : Ljava/util/Map;
    //   870: getstatic org/yaml/Zj9.ZW : Lorg/yaml/Zj9;
    //   873: aload #8
    //   875: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   880: pop
    //   881: new java/util/HashSet
    //   884: dup
    //   885: invokespecial <init> : ()V
    //   888: astore #9
    //   890: aload #9
    //   892: ldc java/util/Date
    //   894: invokeinterface add : (Ljava/lang/Object;)Z
    //   899: pop
    //   900: aload #9
    //   902: sipush #31659
    //   905: sipush #5062
    //   908: invokestatic a : (II)Ljava/lang/String;
    //   911: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   914: invokeinterface add : (Ljava/lang/Object;)Z
    //   919: pop
    //   920: aload #9
    //   922: sipush #31656
    //   925: sipush #-21672
    //   928: invokestatic a : (II)Ljava/lang/String;
    //   931: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   934: invokeinterface add : (Ljava/lang/Object;)Z
    //   939: pop
    //   940: goto -> 945
    //   943: astore #10
    //   945: getstatic org/yaml/Zj9.Zj : Ljava/util/Map;
    //   948: getstatic org/yaml/Zj9.ZE : Lorg/yaml/Zj9;
    //   951: aload #9
    //   953: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   958: pop
    //   959: return
    // Exception table:
    //   from	to	target	type
    //   900	940	943	java/lang/ClassNotFoundException
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7BBB) & 0xFFFF;
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
      byte b1 = 23;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj9.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */