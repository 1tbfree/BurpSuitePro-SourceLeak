package burp;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zemb {
  private final Zzb4 ZB;
  
  private final Zsh9 ZG;
  
  private final Zvon Zt;
  
  private final Writer ZX;
  
  private final Collection<Zrdb> ZY;
  
  private final String ZR;
  
  private final Zbnt Zu;
  
  private final Zr1x Zy;
  
  private final Zry2 ZF;
  
  private final Zey9 ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zemb(Zzb4 paramZzb4, Zsh9 paramZsh9, Writer paramWriter, Collection<Zrdb> paramCollection, String paramString, Zbnt paramZbnt, Zr1x paramZr1x, Zey9 paramZey9) {
    this.ZB = paramZzb4;
    this.ZG = paramZsh9;
    this.ZX = paramWriter;
    this.ZY = paramCollection;
    this.ZR = paramString;
    this.Zu = paramZbnt;
    this.Zy = paramZr1x;
    this.ZP = paramZey9;
    this.ZF = new Zry2(paramWriter);
    this.Zt = new Zvon(this.ZF);
  }
  
  public void ZE() throws IOException {
    ZK();
    Zu();
    Zh();
    boolean bool = Zsh9.Zq();
    this.ZF.Zn();
    for (Zrdb zrdb : this.ZY) {
      String str = this.Zt.ZU();
      try {
        Za(zrdb);
        this.ZF.Zn();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
        this.Zy.ZV();
        this.ZF.Zu();
        this.Zt.ZS(str);
      } 
      if (bool)
        break; 
    } 
    ZI();
    this.ZF.Zn();
    this.ZX.close();
  }
  
  private void ZK() throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZX.write(this.ZG.Zu ? a(26918, -20577) : a(26936, -20911));
  }
  
  private void Zu() throws IOException {
    this.ZX.write(a(26922, -27070));
  }
  
  private void Zh() throws IOException {
    this.Zt.Zv(a(26923, 13943) + a(26923, 13943) + this.ZR);
  }
  
  private void ZI() throws IOException {
    this.Zt.ZW(a(26925, -20693));
  }
  
  private void Za(Zrdb paramZrdb) throws IOException {
    Zree zree = this.ZB.ZK(paramZrdb);
    try {
      this.Zt.Zv(a(26926, -20752));
      Zn(paramZrdb);
      if (this.ZG.Zg)
        Zc(zree); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.ZL)
        Zf(zree); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.Zj)
        ZL(zree); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.ZR)
        Zn(zree); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.Za)
        ZD(paramZrdb); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.Zf)
        Zk(paramZrdb); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zsm9 zsm9 = new Zsm9(this.ZG, this.Zt, this.Zu, this.ZP);
    Zsbk zsbk = new Zsbk(this, zsm9);
    paramZrdb.Za7().Zj(zsbk::lambda$writeIssue$0);
    this.Zt.ZW(a(26927, 12032));
  }
  
  private void Zn(Zrdb paramZrdb) throws IOException {
    a(26924, -18169);
    this.Zt.ZF(a(26924, -18169) + a(26924, -18169) + paramZrdb.ZaF());
    this.Zt.ZF(a(26916, -16912) + a(26916, -16912) + paramZrdb.Za6().ZS());
    this.Zt.ZB(a(26921, -6381), null, Zkb.Zy(this.ZB.ZK(paramZrdb).ZZV()));
    a(26935, 22383);
    this.Zt.ZF(a(26935, 22383) + a(26935, 22383) + paramZrdb.ZaB().ZJE() + a(26928, -28662) + paramZrdb.ZaB().toString());
    this.Zt.ZB(a(26913, 5255), null, paramZrdb.Zax());
    this.Zt.ZB(a(26938, -22968), null, Zkb.Zy(paramZrdb.Za0()));
    this.Zt.ZF(a(26914, -30138) + a(26914, -30138) + Zls9.Zx(paramZrdb.ZaJ()));
    this.Zt.ZF(a(26915, -23127) + a(26915, -23127) + Zewc.ZO(paramZrdb.Zac()));
  }
  
  private void Zc(Zree paramZree) throws IOException {
    String str = paramZree.ZZA();
    try {
      if (str != null)
        this.Zt.ZB(a(26939, -20337), null, Zkb.Zy(str)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zf(Zree paramZree) throws IOException {
    String str = paramZree.ZZH();
    try {
      if (str != null)
        this.Zt.ZB(a(26941, 12496), null, Zkb.Zy(str)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZL(Zree paramZree) throws IOException {
    String str = paramZree.ZZK();
    try {
      if (str != null)
        this.Zt.ZB(a(26942, -15577), null, Zkb.Zy(str)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zn(Zree paramZree) throws IOException {
    String str = paramZree.ZZF();
    try {
      if (str != null)
        this.Zt.ZB(a(26930, -8409), null, Zkb.Zy(str)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZD(Zrdb paramZrdb) throws IOException {
    boolean bool = Zsh9.ZX();
    String str = paramZrdb.Zai();
    if (str != null) {
      this.Zt.ZB(a(26920, -31274), null, Zkb.Zy(str));
      Zefg<Zsdr> zefg = paramZrdb.Za7().Zt().ZCr();
      if (zefg != null) {
        this.Zt.Zv(a(26940, 22774));
        for (Zsdr zsdr : zefg) {
          this.Zt.ZB(a(26933, 16043), null, Zkb.Zy(zsdr.toString()));
          if (!bool)
            break; 
        } 
        this.Zt.ZW(a(26934, -10346));
      } 
    } 
  }
  
  private void Zk(Zrdb paramZrdb) throws IOException {
    String str = paramZrdb.ZaR();
    try {
      if (str != null)
        this.Zt.ZB(a(26943, 30277), null, Zkb.Zy(str)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static void lambda$writeIssue$0(Zrmw paramZrmw, Zgkc paramZgkc) {
    paramZgkc.Zu2().Zf(paramZrmw);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'eÑûXÏ¡wèC]wwòßÓŠÁ¾\\nÖ9û©ZÔì³¿@Ox,4jç¿YÂ/B²y·Ý4*¨N®e;Jí='ñq[º%vpzBGÍ?~x¤úå.B(ßÓ±V6$Èâÿ»Kn¹Î»_Æ?\\t+Æ£\½Q¡,Z¢{¡IÌiU\\fa[j~´OÚw|d¼rúÍLYê³¥<òÙrLIùLðji\\fð¼IEmÊ$¨\QzórºÏ¢F¡K° v/|þW¶ì÷­ZuÿmLâ¹ouL*6ÉbÓ¹Èíêaâ.þoM¬o¦¡,~þÁhãtöúOPR®au­$5ôý´äjTÊ²$ÆÝúò§jr;3µÁñÇ÷àõx xÐÙ.ÇqÓ\\nrY2< Rý#QX[ÃôR>My¤}ØÝ\\r2²L}â@²o©W*ZçÓ\\n¹È/JM\\rs,ö~ø¾¼ÃI@Mºr¤ÁDè\\n$Â9#%& 'Gêà¶¸÷]4u¾ÊILè}ÕÛ?+{MB\\bm üÒªêmî4¸Ã¤Â»èP$P«ffPõ Wÿ¾3§ñrH`+¦VjÏÚ¹øÒnêAÖ\\nJ:P!\\n³ÎS{IQ'¿&Ùú< ·ÝÕk|±"ªuÖLðඪA=Öý+P!+ç¶\\t@@þ1Ò¢¸ìÀÊ/^(n§µÙ=Rw§ÿ+ÒhÞë{ô(\\nÄ5{DmÆXVîCu[ Á£K,>,mf7£¼CôKÝ^?¬I?Æ2êË¨h>ÝäkTYÔcÁ%ß?±{zõùö,¼Ñ=¼Ã-1îÔÛ«Ì4p¢E¼*ä¾ÒÏ)ièæÓ#¹¶th~Ø0µuá \\b§³Dk¹IøjuèÓ\\b¢XÑÐg¸K\\rZ½÷È¡k^òH¹WNMôÎ²\\fw~-"(ÝÅò ÔÜÙUynr+1 Ç\\fÕÑí×£9f ·!¾ªHÄª2;cÕ¹Ì ù\ÍÌiV51ûTjFgÅª7_ðíéaý`±Núç Áá4'\Ó`\Z:$ÓÊ[ßý õH_²´ÕDßA¡}´$ý=)úáZÛFã!4½1R¶Lp·wq;e49¡Ü;ÈyèG¬\Ù\\tµïlF¿ÔíÃ¦_ê  ùÞ~yO])P)_©MÄÖ×ÊJ=içôW* æäÑØ»*Kr>õKÉÊù Z¾íºÊ¡åK]ôHJùD»jÏQ¤£gÏ·©2öIÅ¥\\bhêË¶ßcÝÿLïÜ¤§é]âèà`»mï{HvB>3¶Ò¯Frk:%Lq½zXF¢IQ\\rX~ØA}\\nN[âÎVÞC?J45^¬}ç5»ãdWõöÁdÌb²CòFýòé4Wíi¤¹Í)Õ, Jåß·ö ÑÿÍ7R2ºKÓÂmI®Ük4:ÈÕ\\fÂZZÐgç6ì)üû´5£ÀÀC\\fJº3£ãCT[Øûü9 ¥Ú¾-ØXfùTÜP>ÖQ_s6­Z¿êÈÚûÈgö2mç¯!f°\\bÞ¥ê>²ÈûÓö¡ª#?ßa9MÝ |¤DýyZþL÷jÂ0ñ"wô^p²ÕgZ÷ÂFÂ[@ÖÝñÑ'òÀáåèú/¬A Ü¶«ÒÞmþ7+AÁ¦÷P¬^^¬´<dW(fµßå=W_x7³ºJ*àaU\\fs<àE¥\ÓßùO¤\ÀA_mÎ÷m±ËÈ2ßVÏû¯Ëì*Ý"Úñ¥ZÚS6ÁÈ÷\\b°öVa×.Þz&ç\\tâMø¦[M§ã[Y-¤u-î£×s\\bÂ¯õÁ¸ÛÃuõLt+Óþ½æùIþ¹¨ë±$pEZA*Ýïf5ÕíJú\\f6âaèUÕM¡<§rwðã¹o[ÅJ¨«;0³²:ÀDãÎÓ2 +ÌüÓôæÜ «Á;¾·<îÐÅÇ¯MÓ:Wä³ ½Eþoúf¥Ð²'Õ`>Õ8i,[9@-pæ©H{(»±;¿%µù8ÏA^ÔÄeK÷ãç¡x\\n 8Âü!Ýôé¸ddXT¸¾Í¼JZøØ·\\bÊÂÁeHíPÇÚX5uÐ¡çIwª&Üô×ºf[ÌqÁ´«Ê©à(!|ÝChækþÅ Gª.7I5:¿oÓtÛe!öMÄ#ÉSMª÷£QÛ]y\\fÆÇL¡XV:eäDYzpî¾PÃEZj;l:Có|Ë£Zÿ¤Jø*ñ3Èü.§ëÈjÞh4ÓËQpË±âÖÈD­'¯ZZ}D´&K­lsfÈy?¼W©ÖHs-'^Uêo\\n¹ ¯µ;*ÌõR×O<!õ-·µ£ïH 4]6-ÙrÎx8µVÈÊ5¤R^¥$ÕZFT _ÜZ'Å}vîî¾lêliEèæ¢ÁVu~zÛhea\\b¦ö°1BóÕÏ×åv3zWd¹@rLéÈ¡kÞ:~:Ê5F\\bd9è¹c©ð(O¨üS)"6,{ÑóHèýÅs,X{Vºê:ûuFèÕ£ú]01àÙ>V»£¦Ä$pßzÐe^¾Ã>Ê¬nJhÛ8¬.ïi!+ýgI@,t:£Ï¡éÎÍüºüð+gyHë_¼ÊÄ\\tü¿. VyÊ(Úßé¸¿ÜEUï!È`¼ZÈºßn'X±¥*[&X®²ÈT=5Zr\\rÚøEs\\fY" @¦\\f4kö¼#c®:\\tyI6rË<ÈQyß)9#Ü¹Ù'L\\nFÅû }zÑ95ÚÛÐN^l-üÑP²¯± <ÉªXPÍáÅ¢OD¼Ñ«GÜÌÒ2áÐ#ßÉ¾iApìÙûñ3\\tavý,%mÅ­)ô>þªópéÃ¾S.ÅìÏ¤Ýí±xÜH%iÌ¿À¡,õÔ@ªêeý0Þ©ÎD`tX(Ü>ÙÏ{ëùõT·Õ1&;HüCÃu>DÀJUªkÞwhÔW®î57¤}¸Rãÿ!In«7.ë·Ð#ëí§ù¾éÌ±)ýLºO¼O"Ï×ê®ý|ÆÂds;$±yªQÀrb¸{ø~Îä©Ù=I\\tä³¡Ì%pb=\#ç4x_LiCî> L!Íï*mJö·î.A6³ßBÿ¨9ÎÚ-JÝ(e.æðºª\\fXó²¾>üøiçÑé:¾ðO;R£ÛÉÝ©jó÷¢Ûï¿OV@çû¤Åa¥mÒ0iëmçIªg¾÷VÜÆò°²/HÅpj\\tëe>,°§§À&EËà5èK`©9Þ?µÆ]ÃÐy~&»æ9EX@\\rÉ«¦û)²Y ,âs\\tDsëáÕMháÏÚÅwÐ$VÛW$ËëÛÄFµ+¸%<§äaÕ´¹øsºo\\bv4Æ·Ì*Ï35MëOçÌ®nÃr6 Üf \\b ¸m/ÔHº\\rÕÆd\\f()ûUô»ÜÅ×á´Õ#¸*Ô<O§â{Qú§Ð÷|4Ãß6s@5ßgÛçôñ³îo»}*µ-_¦I æû\\t_*dH¬ó¡#.\\f+aÄ1Å?éÖ{´H¿+2\\rÇò\\rÜtY3ë²[5-ä'uÞ<Y Ð¥±´¾òÑü×SSFfmÂ²x¾ÊU{Þ\\rJdxÏ3#°äv½©!ÜU^¿Ö{A%´§Æ¼Ëï*%»ÌÆ-Ó÷ pÚÔê¬9&ÜH»}CþêD­·?ð´PL\\rr¯HÕ§>oq;Ñè)emY³ÞjïIÃ¡ã÷ú°CÈCS]\\fÚî)sõó\\f+Só\\bAç´á§\\thµª¥-üP®={ükW*oNgâ^SÐæª<çAW÷y\\t?t¾²ªÿq¶j4·u¦Ô;;Û¥½§C\o\\biôó|íñË1[^'n²ÂÑ÷q­Ý×¹LêËîÏGB] åïAÑTÓë×Na|5ÄVßõæÇÀ¢Ê{ê|ª¿{õ1¦É\\ntjäô,Q©¾lÉá\\fîÜ)`f÷ÜM3®åQ8óDüñ/Hêô 1æÖ@[Å#Ü¨hà¡ÍÛAI§KëÜdÐ|]ÊÂ:ÿób¯öÏ·,íz»Bïq» ·BÆX;ðhûkz«¤Ó!\·|æÚgÍEáõ(z¡öMæÐq:*ÅôÌLç\\ftè?{ßã`6mëV5ÙÞs.pa¦Ò¤ÑxC&ÊqWÓ³Rk½exÔ¢"H¢9*Á<í§¶{ÛúöÐÝ|qÃw6sî+»´ja;aàøì \\b.ªòå\\nZ8'ØkøOðtÓËA¼ôaWý÷H=D6xËÉodF»Ì¹N:éL²Ã÷ºÇNâ¡²2Rr[¹®S£èBIÔ4?ºòèj#U*QFê¥55¬íh pÏ\\tH\\f+Õù§³o<q,;ÃÑ0)ht<¶&ÌëcW>HDà×;´¸\2vÛÞ^{4lóR?¾-8Jfç¸Équ¼Ü:M´@Q -!vý=³É\\bO¼\\t¢eñú;Ü]2RÓu¨Ðêç4`¤X\\bYû·ÔãÜÊÓJ"aîµí²ëög2¬|Òzðð«©>ÅýyÜ/hùrtãÙæh²©\\b[ëÕcêÅ"3*Âe9FþãoI§7\\tëSÃ¼ýlõ;ÎÏªiA[A÷\\nªÝH7¬Î>Ì/xötÒ¨>K»AÖxÖ0vÒ)JáÕ¿>s-A§F¾^*¶ÎãÙå!"57ÜoØÌäLÛÉTß @Ea4Ò]GFl«+\Ù²¸ëlHjñ¥@Ý»wÓ(¹¬qßM¼/Ïì,¼2üF}"6c NtÌn\\nÌ/¨³¡¡÷ÅÁ$Û!Æ_ \\b¦RÙ¨PðuågE²»+lhýRÕ\\tÂ=ºÌ²ß½\\n¬>º.Êøÿ>Ê\\fo%Èq(çV3P=xCgâ\\tÒðò,_K\\bc®º¶tÿ¬"«×iðè%ò'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #104
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
    //   68: ldc 'ñÛî«áijQÐ\Ýé'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #105
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
    //   129: putstatic burp/Zemb.a : [Ljava/lang/String;
    //   132: bipush #31
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zemb.b : [Ljava/lang/String;
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
    //   212: bipush #15
    //   214: goto -> 244
    //   217: bipush #30
    //   219: goto -> 244
    //   222: bipush #117
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #30
    //   234: goto -> 244
    //   237: bipush #36
    //   239: goto -> 244
    //   242: bipush #59
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
    int i = (paramInt1 ^ 0x693A) & 0xFFFF;
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
      byte b1 = 111;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */