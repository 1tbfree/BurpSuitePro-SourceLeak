package burp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Zmm {
  private final List<Zx02> ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmm(Zgig paramZgig) {
    this.ZD = Stream.<String>of(new String[] { a(24571, 29471), a(24570, 11335), a(24569, 20310), a(24572, 9825), a(24575, -1060), a(24574, 22087), a(24573, -10546) }).map(paramZgig::lambda$new$0).toList();
    if (Zbqc.Zwu() == null)
      Zryx.ZL(++i); 
  }
  
  public List<Zx02> Zd() {
    return this.ZD;
  }
  
  private static Zx02 ZB(Zgig paramZgig, String paramString) {
    Zzxc zzxc = paramZgig.Zv(paramString);
    String str1 = ZZ(zzxc.ZZ());
    String str2 = ZZ(zzxc.ZI());
    return new Zx02(str1, str2, paramString);
  }
  
  private static String ZZ(Optional<String> paramOptional) {
    return ((String)paramOptional.get()).replaceAll(a(24568, -31623), " ");
  }
  
  private static Zx02 lambda$new$0(Zgig paramZgig, String paramString) {
    return ZB(paramZgig, paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÚöÎǙfq=$\\tith¼¦g]<MÈQ£qÕX®ÄÓX¾û naRyW±\\t\ñãTLÙÐ%@Pvp!õtepä$À-ªÄcgX²¥¥?ÝÂn#sasÝJ 7µhøv\\næ½þÖ4¿®Âþ¶½´ãÂß[¿îÜj6à\\fô5uFO&FìBàË¤Ë>èªö§ì>íoÁâòé u5ÚeO¡nj³øø3ÍÆÐfû:Ï3Õù®Ë,ªûéË=8\\r.ÝaåâÀýdir.Ï£R÷ÊzÍ¥SåÒÚ©ó6SLUåÐµ°'{[ÜÀk¹Ô*!ÌÑ[d¸CY_·À\\bèÄõ.\\r=\\r»l¿ÃTø®¦NúxõÓlÉ&É¨MªY±¾Åtz=uÈ(Û$éJ!µü\\t,Î0;jýÑ;ñ¿'h)Mäúº¿ì\tX\\bêïòÕÔ³o/£WÞ{¶Ðe±\óüqÕC¡C³ãÏÂÄ[Ñó%ÁF]ZG½8ù°Ö5H+ìÞÅÞÖ×dÕ}(cä,¼þ*¤ Ì\\f©ÀH}Gç±¾"ü±ТÒÑ)Ù¦S9?\\týOø9ù¶^Tó:ß}ì±Öìmrì;2]ØJuÜ<ãzPMÏÆ¥9QJÑ¿©oÆÈS¹Pés+X®¿×¾U¸ãxq¢³x¹°áw±Ê«¬Lk&÷áºßÐwNÑÉD:#·÷02N®ìØ98­pB°ÎïxÔ[«á8÷å\\f¹PÃðLÎ:r´=S?ðP¥qbTre¥bEç"­{ª)È¯Vj=i½sof8í¸¦mø½>YJ!e5Wc¹üÍdºg+>ÖiI´;íH°lf%;hÆýot|«°=2:ÜÂ)º/fEmÁØÅ'åPSéõ\\n\\fõÎÆ.ða)nÛ ÄîuM«wËÿOh°µ"¼÷f?HòbãW-ØÊýóÍë\Næöá}\\b¸záÿHÓ¿C×àQ¿ª­ZÈäØeÄ,¦ÛðÃµë}óT2çùOW²»L%Ä~\\fãøNS²ÿ±Oø,W¤@±ÆùG·®x5;5ã²Øì 6F¯íÏß§²"x@³Í'ã±1ªaéÓt©æ(°knÐ¢ÞËè®¢fÿu|_7-'W^íþEÉ.è¡²¼[§ã»Ñ;Ôø¼ã·ÒqºÄÇ|ø$YíìÆÍÇ6Þ¶dOó¯,xmõÃ{éóûº@iòé\JÐ>´J Î\\fõY( t()Ð½è\\nôe4JZâ»æ^cxÇÿ=nÊrê·è{-°]ÁéV{° §Ç7àWÏQ¾ö1ù ñê¹MH4ÞÜÖNøÉ¢\¯¾þ¼[ÖeRT «-q¼¨½<ÅÒ¾3mÔg\\b£vëdìá"ï8±j·Üfm5Ò³ ö\\r$RGÎè²*¹[ò=ÔèæÀ#rAñwáÃÛ¾ºý¡\fF¯½ÝW#vÝ zåÑE\ú²ÁdÚ7UÚZÚ¾äd7|#\\t|$¢A %7-N\\f"e¡gÿ<L,y@¾eh¦óOÁZ»·¥ÔnÉ¨õs}-$J\\bA\\reir@ñ»waÃÙþ²ë NH½dÍ&p=¦ÇO´^/ÌQ1>Ú·C~ñ$äª/èrZØa³ê8%~0PÃÌ2ÒËÆsò«ÏFâ&ù©üóõbUa@ÈÞ¾±ÀÌÏ>þ#\\bUoIë§Ê(¥t:èoôÒ\\rñ©#\WrÌ¢%´M\\tl°à©¯1¯Ü\\bvsIõéNøXr´¸sN,Ý®Nè\\rídi¯;ÁI¦ʈªè8Bo¥¸ñ;ðQ´bho½Lk¢r'b!\\bµÎ( eí.ßéùøPCNÚcÊ¢Ö`¢cqçÆ¡÷5ô¤×;µuFÁÅ%Õeêz@Ð¶ÅÿZ«ø¡ÄÌ¢ëãÙ\\n½¸R¼ì­:Qz|ÞQ8g|À­Á°ºªüQA1Ìí}©EéÍ¦(õä³ÐüõºuqÆ43.»ÃÊûjxP§ÔG×Æ}ô·öd¤ÛFÔ7HÐ¥ä©«(BC¼Y¹JëâÉoZ±h$3ÞÛ Qvê.0Æº?¤«WÀ$\\bYþ7.Â:ÑÑ«æCÈÀºnÚËÔ;Ñ!¬]¡ÏK´ã·Ä¨¿ø+´ fÚwn[AB{[eùÁ»Î?æÕÅÞG´ñ+ôN!z¿y#ò~|aÃ%²®Î¹°{,Ü.k ¬,$ëSº«EÄø£VÄ®1ó\oë#¡ ÄÑ@×*RÛ¢õâ¨§b\NªôH«ñc¸½sæ÷]Ä«h=¥Å¶eK\¬ª¹®>-ð,äiê}·&Àoè(h.¾n'[0iP-¶Y4ß{vW¯Ý÷M+Y ºyè¶ \ðo¹cEû¼->KNX¸ò;Á¢©9úbÝ>@1;z5û±lb½A¦¨¶ô5M·Z s:Þr\òÛe2§Hµ nì)ø¶üIZ¸&¨w¾R/§\\n:$rdÅ=)±ìÝ¬;\\b¾Ó´UÒyk6fðÊÉ~&Wfj¬æ}ºqé7ï{eánl¨í?¥{ö{õδXì´þý·î]-"u¢?5¢î½ù7GË\\nUk·7ÊÆÅn@¬ äÔÕºC4 e)\\tÂ\\f¹"}ÆRáp½ÚEJp¶áTÀOIE´Òëoëö³,JÐ¿ÉÙªC.KN¼Q.6g,hFLÇßOr7ý»IDqÐ\òmòFÖ~ízb!ÿp¾\\bRsBÜFêt\\tæòÞáhÖ¨"3¸Êê¨ûOj\\rp÷ Iy8Õ§.mäùÃ\\tå¢y\\bù:¨<ÊÄòVsüÈ\\rqÄ»ä"@)mPN¡9°øApçJá­àúãM·Û5<"{Ff*Í¬í|WñCIÎK­¼ìÃËùX¤wR)\\b¸¦ØåüÁàÁ½l\\bFi4Cñ«0 hü°ö¢q¨¿ ¿§­éÞú\\tÈñª¦wvÑnÇÎÚ¥MAWY{[GP^V\\rìÖ?/ã:úWv0Øê9&«î\\táÍ¡,­³\\nÅéHÚÔ\\r¥K¶©ßØ,mo(Rÿ²éÐì~2c¨óÐ¦1UÛ%^eB×ÄÐ¹o7-."%p7ò+ÐIf9XlÑzëu?Pµâ¬fWä"h¼y"\\rØR¤ù?Ï"h)²ýc*Ä73üí±¢«ÃyY.\\tN@"b/L!yá¾QhïXô'_m!8r ³ßZr«²æhÎÊB4JCömÙX»òn\ÛÄ3 £J°ÉÏöNzÙ0:ÅÔ0àk£Þß+>ôª!æ,4G®8ÎbÅî?æ\\nÈmÉ3÷A@øµÛn)ä Ã§âÅYß-_Pù<p6ë\xÍ|âÏïR\\r0¹ ôJ·ZÒÅÐ¸Ð¯Íåvµ.Oÿ\\fÿÂæ8%h7¦J&ã]NplßÿömE{zc­õýz¬HÌ^ÐdUAád\\tßl]U<4\\tvä_ñT!Aá¹QºÃé?®`¡°x°>@¦N0M ÜÏm&"³¡V\\n»Ù(¶ñèÅ  DcÜç Sû`¶m=OÈÝó~ï¢Bçã\\f¹Z½ø½s¥q£\\b°äßÁÏÈdßªU£Öÿ}Pß  iàGQÆ·ÕÈ,èæòì¾qY_}0ÝM\\b´Ë®ï)@Hòô\éËê^ݳJ\»ÿ¶Ñ0æ­,<Ua;M"á­5³L¥uºt~·ÚwÄ»éRWºâ¡bªÃe5;"Fñ@0ÃÖP^Ö7KóMÝ1RÁÉdK²kéÞÒn ò;ï©/äÝtcyæìÑÎÚÌã-Ý§ZJ÷eå>C@%#×KØtzexãg ;V\\rï¥E\\t³pDBNý:Æ"Fð10­%Ì~·oá¢V:¬ØrNUq­K?v1$7|WÓA¢®¼\\r`+&Uµùv*Rñë/þsîê,0¥fîn¼&¢ñy_~£í O,b¸²§Ø9ZTOäZÉ·¶Í¡Ì!-\\t´a¢Þ/ÜæÄv&xÈ°\\b´\\rùB Z*S9,f!q¡d_ýUPd'µqDz8>ºýVR\®ô»¼Æ`§pxÌQJåyäV¡0®Õ¦J­«ßóF@íò5¸0pkÍï{©Çé\\bÍøpK)´§íEPÀúpEÁºN*QØf]e'P¬eÉâöà³êÅNÕåt§ ø±R×?T8óô´²(ÏN:±°fµ2ÿµßJ´qS*êµËNR\\t9HÂ Üb´w¨dáPZ*à+é(;bÙ¤-eH\\nîXe±$ßY¢ð¤ÔË7çÎöá¨£¬s05kQpt×J=(vyòqÊIÇTÚuQ}\\ny-\ 2Á×UEÓ¥ëÙÂóá»­\\n¢ÜçzÐÿbµtåg fÅb}f/à7æÕWÚUMp èJ%GKlz¢8¨ì\}_!6üÕ­Áq_g¥ÖÌüFL¥Q¥ÂÈë§K\\r\\f3ijMÈ_ç8%/±ÙÖB¤SkCÛùq»Þ²J;öÔujkÜ $³/ A/ÅF¤½MAWê²Ì\\f¯d|ôhÞ0G¬Jp}qÝåPyë>\\nÔæ¥,ô½ÓºRâB¢h ¼~p&P¥OM\\f ùãAs¹ªÄ'åÞêàØTvÔ°/Ì \\nÃ;õmÜÕ¯~\\nxjÐ+óäâ!$ùfw7Ó2òiurJCR²©\g9©\\bÍ^Ôny¦åVy»ß²j;¡èk_bÃºsÂ2$ît#Zê;Ëà;¬Pvª\\få4t1#tãßÏPD©tpB¼\\r#ãÎfgÂ)ÉHº9è¬s.£t+Xÿ&Mº3¨!Í\\r;àïÜ»æØ'üß^¾ï\'s{TÉ¬¬uû4ñ©,ÄÑ^¤4Cð¡ÁsÞªãx¶/y$)pÀºõià\\t¤\\t«¤¬rIåÙyªBêûö-Kªo¤\\f\\n'G>©èå®%'5 Êñ[úÀÁÇ8ÈhÚñÃSÇÙSËæ®Ñ¿Å-ÙL']l¬)íÂÄéÞbA\é*;ÆÔ#³©ßþÚoy8ð+Ø@Ù¬¬àÁ¯·1ÀèÀ­6*à\\fî:gI1Íê\;Xò¿³2PvR"ÔÖ\\fìÝ0å¨vC$¸7¼RS'ÕW´ä¥©¹\\td2Ô½AC¤J¿ì®½-j¹ÇôióÍùIú¸2¨õ¾WA"ò×bd­ÌÜT»\\rÌ*zµ'<[4ÀvÝ_o7ËQêNñÎiIÞ kbþK+«© ç÷'¢òâa¡xU´Ít}"mF¸Ñ8Sú¤dâ²´6FþãÏJ\\t°ü©,uEz²YbùOºÑ]¨Æ.zú}Õ©é²\\bwYónöx¾ìs)<!Q×ñSûÿÀL³y³¾hÐ¦ê\\n?WÝÂ¾nS¥lnÌâIï\\r0ß¹HùV®§j©þt7k{'"áà9ìâ\\f1>lBH"Í7]ÅÀ¬:U6ë¼*õÅCÜ¯¬Ì[é©¤¤\\rsU`wèÞNÙÞo'?çfgÐlB8Ôê}Þì´ä¿Ì­e\\rÎ¦5uNXí´=1b·!IBs29$§»^UGÑ}JmÐ<`M¤ÇiùìÚdGa-@axÝhqè¸+KÁï«£ëÞE¥ÙÍá­\\n ¸µ6ým<ÁÝLIìSðÕ­Eç9¸ÀÒ7?_´eÃ±¬îþJé£¢±Å[ØKë¬ìø"¬ïe8=j½ç"Ùù¢:f³°àï?r#×8\\nÂÐ5¥R&Û©Ä3dæ5Â¸üË¾oÔà8¿Ê·ÓRÉáÉù¨RªùþÏh.²vý>zgj÷Fªð]06±þü³Cö¯R½s«yf ±õBa @,{ÝÐ\\b±ñó¯JÑ§û) OÅxÕ°\\t½<ªmoX\\fu+?\\bü¡ètÊ©'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #75
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
    //   67: ldc '¢Ú±Csb¶\üÖ¥¤ÅÞ~\\t¹g` Þ:ìú±m0/\\tfHoâW&3!¾O½Ó;òy{NpmåLÃÈoÿ² H%©R÷â¦YV¶þO?)Úg¯S¬Óq|·t¼õkd¥Od5âÄþõ+.,ÒÛ+sþ'Ûì@þ«*(C`X6µØeàþ`6eGnR»:R³3i!yÞ_Åú³î£ãN,nqc÷ªØ<wRA¦(õ]ÎªÎ_dÕW ÝV×²a¢ Qpc¿¹ +DÂ~çTKË  \\r&"µ_È\\n+î#[W÷ïJo©>ÒÖe¦©·ä)öhÁ¶ÔGUX>$(«ñ<{&rXµ2æá*ÞÇ¸KËêÀZ¯/ù°×¹¼±¤ª}DyOùh*29CD¹W]YüoU3ý©ÑÇÔ×uÕZójMNá$Ý.aFºÂZø§¨¨·cÖÓ©ksU/P;Eä)`ÕDF>'Á³&×·'ä<Hàª .ðw5«|4âvR]·ÝÄCFN%Z,Ïõ7JÌä@xÜ.bÂ¼To@uï¯Y58Àò1¬¡])BQoæÅIûA«QÖs¢Ç;þÈÕ,Æ»ÁÙS¹¹rt»\\bvË\\tFå¹Á %Õ¥óMN¬qÞ,â³à]Ï\\fÕ=Å¡*g\\fúQ6©zOÁZ¯éë$qÊ|ó#xã¸ð¶ß¤úJCð,ðlÿ]Í¸O¢ÐÒÀÏ£ròô/ú#1ÿ±MoÜÍQûcÛücÐçCËÄî0µZxaR**g©\\f÷B½2hãècâT[Ã.%ÃR,³eº¯Ø^Ûåî øðV[mÁÊâ@ JÓkc®ÃuWD@·"Éxæ-X$Á'pµ©eé?;Ô  v£æg\\t0WaØIÀÊy½Ûþ>Ác_÷¢»\\tsqõ$¾æùà-]/q~kú%£:hW*7â©¨|PÒ\\fiæ¶ïv¢¤m::eZoMæîÍ¤\\bAf¿õ§_¬u¿óñMY2bf©ÖlT¥#±b=¶gÖMHù®{Õ«(6å]õîãÛO ?D=ÅòÏ»ÐÂy;½ÃRâLo§0Ý¨¨¡á=»vÝ¦á-äÎ4XØ$ÂáUcÍ÷ð»Cr[µXJÑE\\fáë.¹Ú´üfNä!%L³kròrí?2\~5I$MíÚÈ\ÞË·Ëî6VýÙÉdeë74£ÛrH)lZý$IÜÊ8§¤jtÜé tEÓ®I²óO«Rïãä^á1Ù/UOÃ¶ðc<¹Ýø-±Ws·hÅj#!Ý"Úf$O_Ï½¹«unÒÙp¹\\n^r¬ÕÜÿÆùëXæB5¢ä]4çrlÝìàäüI¾\\b¦[k]Ô<i`ièèÔÖüÔÂkôö×§uÇÉcp+?nvM*ÀkÃ7áá²tè7ú¢»¸ÝýOö¬Cóë; a7K}"\\t}MáÓ¢ýPÂ¹Ê´#¨¢Ô[Jz'Ô­ßèý.Ø^R×ÓïæÎ1Xr×8½Îb\\fZréùµx%O¢Ú3À/þä,´Íqf4U2½ÊõyØÖÃ±Ð¾ÌÑKpó"ß¾.Ñö]Eâ¿D¹XJZEF÷Óô\\f¬¦O»¬*vUëï ¨r}$NöEË"yZc9d¼ÅÒå\ìjÔ\\bÇË¡öcJ«ò¼µ»0wqWGÙ ¸QJ,zâÔßÿýV²n ¨Æ?®Ö¯r:i¢ÿ,ÄY\\tßh¾PÑ9]¼âÒ\ìù?ØIê ÈóK~O¡{\kfn¬.®Ç~=Ç<±Âk^^éÝc`åVõ¦¹N××õõɋE|j¯8kÎ[ÉAd.óãnZÐõlÖËµ¥lº\\f{³iEr'Ãôº.4o\\f¾wÇ.½$cªÃù ìþqGÉ*\}9OVáQu+¶üKsc û¤?ÀyÈl{]¯¤oFM¥*¼#\\råbBúÈÌcrGñíI*lYÞ%®;,"ØD»óVqoô\\fÝ¥HÕjn"G\\näMy°ì´^\\rzU¯^¼wòD^ueñÆÜ¨tÇ¥ÜÂüjú¼Ö·äÕç¦Ï³b?\\tº%Ä#yýÚó)('->Òð_wFÈ°ÔÔáÄè³ ³rÃP2ø*)"@.JOiÈÖËñ¾J4ÇWR©Ú^óJ f)BBÓ?}³ÙYj÷\\boa¹ÛÛÚ$ã{5*ûCL¨T\\rã:Õx¿snïm`ÌÌðyëf8G»â}dIq[ùô\\b@yÚº38[÷ð·[«mFÊSkóÜ%â$Zör\\nÇh×5}M\9ÖR¬{NµÍµÌó?ÃÐMÓÈ¹ïWsÄc©aókÒO»\\bîô@Öé6L^Y¶UÝæï¥fýâ7oÓ3f1Ó)¨ý~^N£ËãªëcÁGæ;\\n7ujÕ±`Á \\b#ìªIB<üºL[JH!×Ø4û0ÙÞ\¿&¶"*~J\\b/ÀÎ?y2ÓÍmRÎhBí!~Áæºqåsÿ1~êÌJ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: sipush #1545
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #22
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
    //   129: putstatic burp/Zmm.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmm.b : [Ljava/lang/String;
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
    //   212: bipush #42
    //   214: goto -> 244
    //   217: bipush #60
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #30
    //   229: goto -> 244
    //   232: bipush #84
    //   234: goto -> 244
    //   237: bipush #78
    //   239: goto -> 244
    //   242: bipush #92
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
    //   283: tableswitch default -> 39, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5FF8) & 0xFFFF;
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
      char c = '£';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */