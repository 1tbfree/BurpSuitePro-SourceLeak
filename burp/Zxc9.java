package burp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxc9 {
  private static final String[] Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static List<String> Zm(Zzu2 paramZzu2, Zxrc paramZxrc) {
    Zxrc zxrc;
    String str;
    switch (Zxk5.ZI[paramZzu2.ordinal()]) {
      case 1:
        zxrc = paramZxrc.Zk();
        str = "A".repeat(paramZxrc.Zg().length());
        zxrc.Zr(str);
        return Collections.singletonList(zxrc.ZP());
      case 2:
        return (List<String>)Stream.<String>of(Zw).map(paramZxrc::lambda$attackTokensFor$0).collect(Collectors.toList());
      case 3:
        zxrc = paramZxrc.Zk();
        zxrc.ZC(a(7017, 26407), a(7018, 17604));
        zxrc.ZV(a(7023, -676), a(7015, 21931));
        if (Zsw8.ZS(zxrc.ZW(a(7019, 9090))))
          zxrc.ZC(a(7016, 9589), a(7021, -15461)); 
        zxrc.ZR(a(7022, 29254));
        return Collections.singletonList(zxrc.ZP());
    } 
    Zuh.Zb(false, Zqf.Zk);
    return Collections.emptyList();
  }
  
  private static String lambda$attackTokensFor$0(Zxrc paramZxrc, String paramString) {
    Zxrc zxrc = paramZxrc.Zk();
    zxrc.ZC(a(7012, -28179), paramString);
    zxrc.Zr("");
    return zxrc.ZP();
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'µÕÉ$Å ðÜÐV\\tý.ÂG&iV|bàyR÷ò²ÿø ºÝc÷÷@ÙÚ£ñڎ Ú1Lî!!<¹SP6KCcïÞ¿FµCªKApñIáôN±P$19¬¹­ö\\r0\\tì|Y.áöâ×Øý/w¾áÏÂýÚT*-|>òtÿÖOà~A¾,éÖÈÚC}»ÚOÓÉÕ(_VàF}×«l¦XZ¿WKu¦®|ß¾&ë·Lx4(më¯<\\r¿«ÓL)ÀIÃ^¡,VÊO<<¯ÆØ¹°r¬¿%\@ötbÔÀæ9éTÛb¯°r¾MÅ¡¤£§ú»º+nKÔ$Msú¬C×G8)Ë\V>±h$%°×;5Díó×ñä)yÍÈ7QlFûE°nuùæ«Xnólh\mÎ\\n6klrÏ\\n±'Ülwò}ä=W3Vµ¾/.¡ÙÐþoöbÐ¢ù¦SÄPR÷&avÀz!ÞêÂ§³+4½åâ'F;Ó×ñ§ÛN¹óCËZ+ÒàíS.zÁ¬ ¿ã.o&½{ÓÁºýÆK$¼_)Ó4Àî$Ç;Õ(Î\\b0¡Ò¬àõ ùßú+ådêÀ¥ñÖºU¤·í|¯ôÇ.Ð÷9ÒÂ 15»-\\b²tÎ,;¨vQ$8Åü\\nôZ½7×b8ôÊê@=ÒtlL\\nÃ|½BpyÌº\\t«ÛÒÜª¤¯´èg9uó±;°¹Ñ£bcbÂßíÏØ>^I©.Õ\\r\\nWk0§Ho^»ÅËÏ ¿p{2GØà¨Cr¯hÜ§¤ï!\\tHZäG:ëê¿ºjgÜq°oü¾Ó>Ü9IsÌ Ft½UýÆþ=ýqÛc½\\n¦¦¹aëÃW4<÷éø5¥nK ëñU&VbRý¦&jáU³ÑÖq±Ë)tRa^~`¥èÉ6ÊåQiu"ÐAj¶mE©-°>vÖº×6\\ríukÛD{ÔÌó~r"# ¹Z§Ý)æí9 Âëÿy.ú'1I¨3üþº-=ÁB xaáSJPXeÃ¿®Ï04ó/]Ò1*9]wÍv\\nLP\\f¶\\n1iBpÐá8 í²¦£@0¡Ç1Öt°ë·[Iuw0æ8$?µYAð<4(?ß,£ÔNîNnÒ\\bs_ÓP Þí£\\rû×a]*Ús«â5¸P×céáfqÉ¬Z¦,\\rÌ#T£ØY$í=BñLBÈ2AåÙ]AEa3÷ô¯wc)\\nÃ±øKzì+?rUtzº&Y'E§º |øYÐe¾'çïçõ¡WÜ*Ï¼÷ÃScgg¬à4¬äEÅ³»|Qvë²\\t-â×õÐ+\\n.ÅÉÍd=RGhT `¡îýnÆsßYÒ+æ<è}x#S#5fd\\fG<±ûMËUt½h9CiµZé··ã¬Aý=¶\\fU¼èíÈ··4ù¤½ïïèá¬ÅÅó¹0>2æ¥6¶¥ µ¡T4ãtç\D\\r^§tàyúã´`¢a¥\\r'oK}+\Ö"x¬Ðî¹lÏ£#ÍêxÞ6¦ÌW*<¶îÃkroh¢Ò%;ìÍ@òð©¨Ö\\rhüÔÚ~óÏöû[iJóÎ\\n3j[ÂæðG²§JBi9Öøñ·ËB®K#æ 9S\\fòîôÇ¨¥~ý\\r÷/@ÕAÔ\\féºqpÑ¡^îb&jgÅ÷ÿ@8$Lß¤\\ríÞ'©wâ97OÈ?ä*Î·^3Pß»r@lL¨Rd!¸0\\bp¬ÀtÆ¤n?®×P2*!9ôÆ§¾,ò4ÏsÊj\\nÔ¡1¹<ã5":uª£T ,ìÛy'Rp¿)'¤`}A'ÑN;)!ç~vêùòuÜK¯¿UHÛ¸þá´ÜiQH³åJa%ë`çLÒzÚ@%hÑç43ä Æ)ébûÐg¨÷Åd­ÒZSÕ^ôÈXWE°~­03îwÌ¡gGsY¦.°¹ñe%\\t_çl÷ÕÎ0³\Óh£<c²`f5A`~Á,n=@Ï8ýQ#'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #80
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '®¼ÎnƢn%dëaÞsâ;²Ý¢¥\\f~mN²ëÈ?Î9è\é´3ò*²³[+?p!åïP.µÁüÓnf×¸SìH.ã;{4á\\ràóS9;jõ#4ðZú©ñà~îã:­Ö­äÃ¼h{WEþWhü\\rÞ¾)ÇÖÇÕßòí©n`ÿlÁ!é6ºy-Ç\\n {¢q§b8ÿùÇD±A]øc°SGeÖu+½+\\fxQ@ä7E@çùaQ×B5«¾ÊáM¤I¢*8\8àV´¶éiéEK¢ÌøZU#8¼mf}á.töTwÌgèWR NDIn2þ®[;KÂ÷~ípØS%ï»û1RIá4«³R5jìKb[åvþõöÞÐi/¾úÆPs¼1êÉÚ4Ú1\\t±I\\n¬(SQg¨QætYf0bõÅÉT14ïùam½Ì¿ü¼zÛÙµÙ+àû·±f t=Àæm4|Q_õ}kÀÚNÛY¥pÖò'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #54
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zxc9.a : [Ljava/lang/String;
    //   130: bipush #12
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zxc9.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #15
    //   224: goto -> 244
    //   227: bipush #106
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #21
    //   239: goto -> 244
    //   242: bipush #30
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: iconst_3
    //   301: anewarray java/lang/String
    //   304: dup
    //   305: iconst_0
    //   306: sipush #7020
    //   309: bipush #-14
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: sipush #7014
    //   320: sipush #28526
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: aastore
    //   327: dup
    //   328: iconst_2
    //   329: sipush #7013
    //   332: sipush #1095
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: aastore
    //   339: putstatic burp/Zxc9.Zw : [Ljava/lang/String;
    //   342: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1B6C) & 0xFFFF;
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
      char c = 'â';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxc9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */