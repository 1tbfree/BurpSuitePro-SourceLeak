package burp;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import org.jetbrains.annotations.VisibleForTesting;

public class Zr6z implements Zx7 {
  private static final byte[] Zp;
  
  private static final byte[] Zj;
  
  private static final Map<String, String> ZI;
  
  private static final List<Zr2g> Zy;
  
  private static int ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void Zt(Zz2j paramZz2j, Zml3 paramZml3) throws IOException {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface Zi : ()Lburp/Zz1p;
    //   6: getfield Zo : Lburp/Zlit;
    //   9: astore #4
    //   11: invokestatic Zl : ()I
    //   14: aload #4
    //   16: invokeinterface Zd4 : ()[B
    //   21: invokestatic ZG : ([B)Ljava/lang/String;
    //   24: astore #5
    //   26: istore_3
    //   27: aload #4
    //   29: aload_2
    //   30: invokeinterface Zi : ()Lburp/Zz1p;
    //   35: getfield Zb : Ljava/lang/String;
    //   38: invokestatic Zs : (Lburp/Zlit;Ljava/lang/String;)Z
    //   41: ifeq -> 94
    //   44: aload #5
    //   46: sipush #17646
    //   49: sipush #-6721
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: sipush #17657
    //   58: sipush #-30636
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   67: astore #5
    //   69: aload #5
    //   71: invokestatic Ze : (Ljava/lang/String;)[B
    //   74: astore #6
    //   76: iload_3
    //   77: ifne -> 97
    //   80: iconst_2
    //   81: anewarray burp/Zbqc
    //   84: invokestatic Zr : ([Lburp/Zbqc;)V
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   93: athrow
    //   94: aconst_null
    //   95: astore #6
    //   97: aload #6
    //   99: ifnull -> 253
    //   102: aload #6
    //   104: arraylength
    //   105: ifle -> 253
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   114: athrow
    //   115: aload #4
    //   117: aload #6
    //   119: invokestatic Zv : (Lburp/Zlit;[B)[B
    //   122: astore #7
    //   124: new java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial <init> : ()V
    //   131: sipush #17647
    //   134: sipush #17664
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: sipush #17658
    //   146: sipush #-18326
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: iconst_1
    //   153: anewarray java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload #4
    //   160: invokeinterface Zd_ : ()Ljava/lang/String;
    //   165: invokestatic Zv : (Ljava/lang/String;)Ljava/lang/String;
    //   168: aastore
    //   169: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: sipush #17636
    //   178: sipush #12049
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: iconst_1
    //   185: anewarray java/lang/Object
    //   188: dup
    //   189: iconst_0
    //   190: aload #7
    //   192: arraylength
    //   193: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   196: aastore
    //   197: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: sipush #17651
    //   206: sipush #-19169
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: astore #8
    //   220: aload_2
    //   221: invokeinterface Zu : ()Ljava/net/Socket;
    //   226: iconst_2
    //   227: anewarray [B
    //   230: dup
    //   231: iconst_0
    //   232: aload #8
    //   234: invokestatic Zy : (Ljava/lang/String;)[B
    //   237: aastore
    //   238: dup
    //   239: iconst_1
    //   240: aload #7
    //   242: aastore
    //   243: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   246: invokestatic ZQ : (Ljava/net/Socket;Ljava/lang/Iterable;)V
    //   249: iload_3
    //   250: ifne -> 327
    //   253: aload #4
    //   255: invokeinterface Zd1 : ()Ljava/lang/String;
    //   260: invokestatic ZC : (Ljava/lang/String;)Z
    //   263: ifeq -> 308
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   272: athrow
    //   273: aload_2
    //   274: invokeinterface Zu : ()Ljava/net/Socket;
    //   279: getstatic burp/Zr6z.Zj : [B
    //   282: invokestatic ZJ : (Ljava/net/Socket;[B)V
    //   285: aconst_null
    //   286: aload #4
    //   288: invokeinterface Zdw : ()Ljava/lang/String;
    //   293: iconst_1
    //   294: invokestatic Zt : (Ljava/awt/Window;Ljava/lang/String;Z)V
    //   297: iload_3
    //   298: ifne -> 327
    //   301: goto -> 308
    //   304: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   307: athrow
    //   308: aload_2
    //   309: invokeinterface Zu : ()Ljava/net/Socket;
    //   314: getstatic burp/Zr6z.Zp : [B
    //   317: invokestatic ZJ : (Ljava/net/Socket;[B)V
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   326: athrow
    //   327: return
    // Exception table:
    //   from	to	target	type
    //   76	87	90	java/io/IOException
    //   97	108	111	java/io/IOException
    //   220	266	269	java/io/IOException
    //   253	301	304	java/io/IOException
    //   273	320	323	java/io/IOException
  }
  
  static boolean ZC(String paramString) {
    return (a(17634, -12686).equals(paramString) || paramString.endsWith(a(17662, -32391)) || paramString.equals(a(17643, 14068)));
  }
  
  private static boolean Zs(Zlit paramZlit, String paramString) {
    String str1 = Zkb.ZG(paramZlit.Zd4());
    String str2 = paramZlit.Zd_();
    boolean bool = (str1.contains(a(17642, -8141)) || str1.contains(a(17635, 31967))) ? true : false;
    return (a(17650, 22291).equals(paramZlit.Zd1()) && a(17633, 16893).equals(paramString) && a(17616, 9578).equals(paramZlit.Zdq()) && Zsw8.ZS(str2) && (str1.startsWith(a(17619, 8100)) || str1.startsWith(a(17656, 25359)) || str1.startsWith(a(17654, 23360))) && !bool);
  }
  
  private static byte[] Zv(Zlit paramZlit, byte[] paramArrayOfbyte) {
    String str = Zkb.ZG(paramArrayOfbyte);
    Iterator<Zr2g> iterator = Zy.iterator();
    int i = Zl();
    while (iterator.hasNext()) {
      Zr2g zr2g = iterator.next();
      if (zr2g.ZR(paramZlit))
        str = zr2g.Zu(str); 
      if (i == 0)
        break; 
    } 
    return Zkb.Zy(str);
  }
  
  private static String Zv(String paramString) {
    String str = ZI.get(paramString);
    if (str == null) {
      Zuh.ZT(false, Zqf.Zk, paramString);
      str = a(17617, 8598);
    } 
    return str;
  }
  
  @VisibleForTesting
  public static String ZZ() {
    int i = Zl();
    if (Zbqc.Zwu() == null)
      Zt(++i); 
    return String.format(a(17618, -3664), new Object[] { Zlkk.PANEL_BACKGROUND.ZC(), Zlkk.FOREGROUND.ZC() });
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: bipush #106
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc 'KSøUð'ËHU+it ×ïSy?ÉþbV£BæX «ì?I2+¡íÆuÒ«G:Â[JÎú[\\nGq¦Ý[bÏ,5êú\\b.®?Q¶c>º¨¶³âÏ&z=5¡!5 ´¤\\tä±NàMÃ+å¡¾¶ðO:IRG þNþ)k8¤ÎIÕxGØ¡Ö¡öãj¢uj^<aÊvÓ\\f-Û*ÐÃÍ¤c,mKïæ­»N´o\\tìaË¸¦õ²[¹%DÆ±Ð¨@Æ_~Ußt£k4õù{¤ï`¯?"ó¡£Fð(Ö4\\bPÍ.!µ|W¤ï\\tãÇè'ÿ6Q®eoÊP_'dÈ6Oá^l\Ì]+Ó×ÊWÇ&%òç\\b õlRð<\\r7±°¢É¶è`ìIÀD©¨¦\\b>Þ,Vr&¡¬4;µðnµ&È\\nÅÆp+÷_toèP'ìÈ'OÃZ(Y`ñW£±ÍLx gÁîßU\\tb+Ixf%§;QÔ¨_ۣ9y§]êì\\nÃÏÿL1åÖëdôe²ÈòÉÕs/&G¯k²ñ­O8DîÌÞëÍp¥Lh¦G@+ð-©s[yûã;ê ÁÿÉq\ÇÏ ·\\fk°vîè²W@Yõg@CÑï1þ|å%nö_!¡~®:2½ùf1¹+ü{éÂ­-¤`Kû.ã>ÌñvM'èïè·D§ÊNåÔÕ;´+nÏ¯übåWEi9/ÒÂÍ~Û§nõÖAé}&fHÀ´cfnÞ{j$äp}\\reqåÇðÊÚ½~HÖÛ¿\\rà}x]j¤­ºíæçx-¾Ý¾^·[h(Ðfsyµ&yÐ¥äÊª.v:2¶úÀû`qm%aÄQwbë+µ½I¼^¶OÍ{¨9ÿõp`jò9OwVW¶áÕd?IMûûí÷¡´(câ%ë,&N:,Ì\\t¸<LD`ïðÑù0UYÞ7¢ÊÞÁvû'-,¾·G½ñe[Ú=ÇJe Ëkü3c}^k/HgDûB//Y=âägüs< A¶Ä%d¸õ;4ÿÇ±Pßm(ÎùÂ\\fC»}ÒÔVQìáÝ}k·H\\tóg\\bºk{É\\bFlÉ¾õ·Wæzú«%`)_<9âQKà9{·íøÌ\\r¯y\\ry\\ríÀvÃ±²9§©Yí­<bñ/,}¤5ZDwé*wØ¹þ}2üs¾¯JR°pZæf¢ôLÌ$ß\\b]6?º«²`yqJWL|^8}¶×¿smé+m{1¸ðÏ5§_n?ïZ¿Á\\tF¿Á\\bÄð$ÆLÙbØúáAvýFa>nM3×P)NÙ8ß8úì¼Þº8ý(ÐM=Ì°²ùÀÊ+§áÖGÖ#ü¯ßÎ=£cIí0oc{¹%P\Ð¤P Éøq_(ù>ó'9ý`#÷ÔÈQk£6¢»LÏØÂ'¥ýû4AVØ¡\\fk$lCòÝ6êw%A¸ó´_ãÄø7"E=gT{þåGý¦nÄ$ð¤O]*P®érå-Å¼.. àå¿îà8£ºâ@'\\n/¨`Kñ0(Ò^m!À2ý3¢ò5©ÛÚ35ÁðÉKµ×Ã3<âÎ2=>àwJÃ,hÚz@ÊYLòÝyó¸øÓû_òÂ;.pZk áÙi1=øÃá\\f-Ñ?{äQBU cRþµøüêx§ÚºOY¦´]O{Dÿ\Ù7í#>#Þ#GXÅð÷èðôÀAÇü£¨xÌææÑZj¬§÷Ûýbm)ÛsçRN\ áq95 ºh©Q·¶ìì.,/cAüBSCDÍóµµ}RèUùÀèÊx/YtDÑ¥ôy¹Ê£®\\t:i)¹8<ïU4îÆÒyTNÍyï&o/¿BçÊúñHÛ¶Æ0¶±­4~oJ³´/1KPØU6dæk÷ß'³pÝö\\t°IL¢ÎM5(3\.`xÂË)>»&ÔLØÜýðÀf­{\ù)öoWtÔÕYSL¥5¾Kf$9âç´6×¹"¦´î¸CÎ´ÈÍÑy©ëRÝóvÕ6\\b¨i,"Â]7V5Tîa`âÈI¾·o§Ö|ÚõBñÃG¿~Z¬0ÿM×ywYõê°ôñÍË·ð´:Ó×qØ¤_ÜñÜÍükËSOæÌZ lx[1m=ªÿb´©Üâ¬µ"©mIM?@Þ_}6Q{3¡Ó( á?Î|§ÆÖ_ôLP»ÔAmz¬ËmPý¨k®³í6X¨Q}Ûß[1ëßJÝï=âN#ÄâÈì5¤?]§úÞÀÔ@ÐMWãAWI]F´3)¦\\tÈ]¬ÇSAq³Péxù\\t¸°/Te¾\Ì>8(Ô¿ü7W±ósº~>S'á\\faËê¥.+·¡ð³0ÑÈä¨¨!+1úÐÁôZ¢GH~ú¤²£¨]°}% \\rt!Æ²/ê²oYpÚz5fK5üß?-+\¯ö×èÇÔKþv1ö¹RYÇÚÀãLõÇ§¿h\\f½·)¾>XÄãºOÃ^ -÷\\tÁ®ª~Ëäè6d,Á·!Ö¶fÓ¸I1?§0J¬\\tþe)¿ýÇÀ9f¸¾ÓÑýL'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic Zt : (I)V
    //   23: iconst_3
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #72
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '¨­\~àZ~D{ »Ë÷ËfªÉ¬¹mÎn(VÐè'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #11
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #33
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zr6z.a : [Ljava/lang/String;
    //   136: bipush #37
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zr6z.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #106
    //   218: goto -> 247
    //   221: bipush #16
    //   223: goto -> 247
    //   226: bipush #127
    //   228: goto -> 247
    //   231: bipush #112
    //   233: goto -> 247
    //   236: bipush #89
    //   238: goto -> 247
    //   241: bipush #9
    //   243: goto -> 247
    //   246: iconst_1
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: sipush #17620
    //   307: sipush #4212
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokestatic Zy : (Ljava/lang/String;)[B
    //   316: putstatic burp/Zr6z.Zp : [B
    //   319: sipush #17638
    //   322: sipush #-599
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: invokestatic Zy : (Ljava/lang/String;)[B
    //   331: putstatic burp/Zr6z.Zj : [B
    //   334: sipush #17641
    //   337: sipush #-17004
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: sipush #17639
    //   346: sipush #-4807
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: sipush #17653
    //   355: sipush #-12629
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: sipush #17660
    //   364: sipush #-14797
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: sipush #17659
    //   373: sipush #-20874
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: sipush #17652
    //   382: sipush #-19582
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: sipush #17648
    //   391: sipush #31021
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: sipush #17637
    //   400: sipush #-16207
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: sipush #17655
    //   409: sipush #28119
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: sipush #17640
    //   418: sipush #9501
    //   421: invokestatic a : (II)Ljava/lang/String;
    //   424: sipush #17649
    //   427: sipush #-8685
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: sipush #17661
    //   436: sipush #25603
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: sipush #17645
    //   445: sipush #-9947
    //   448: invokestatic a : (II)Ljava/lang/String;
    //   451: sipush #17632
    //   454: sipush #24293
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: sipush #17644
    //   463: sipush #8072
    //   466: invokestatic a : (II)Ljava/lang/String;
    //   469: sipush #17663
    //   472: sipush #-31529
    //   475: invokestatic a : (II)Ljava/lang/String;
    //   478: invokestatic Zg : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
    //   481: putstatic burp/Zr6z.ZI : Ljava/util/Map;
    //   484: new burp/Zsjm
    //   487: dup
    //   488: invokespecial <init> : ()V
    //   491: new burp/Zsj1
    //   494: dup
    //   495: invokespecial <init> : ()V
    //   498: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   501: putstatic burp/Zr6z.Zy : Ljava/util/List;
    //   504: return
  }
  
  public static void Zt(int paramInt) {
    ZF = paramInt;
  }
  
  public static int Zl() {
    return ZF;
  }
  
  public static int Zf() {
    int i = Zl();
    return (i == 0) ? 65 : 0;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x44F0) & 0xFFFF;
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
      char c = 'Ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */