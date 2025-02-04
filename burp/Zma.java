package burp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zma {
  private static final SimpleDateFormat ZR;
  
  private static final Pattern ZI;
  
  private static final Pattern Zc;
  
  private static final Pattern Zu;
  
  private static final Pattern ZE;
  
  private static final Pattern ZN;
  
  private final Zrgd Zl;
  
  Zma(Zrgd paramZrgd) {
    this.Zl = paramZrgd;
  }
  
  Zk5m Zf(Zb6q paramZb6q) {
    int j = -1;
    Integer integer = null;
    int i = Zgum.ZA();
    Long long_ = null;
    List<String> list = paramZb6q.Zm();
    for (String str : list) {
      if (ZI.matcher(str).matches())
        j = Integer.parseInt(Zv(str.split(":")[1])); 
      if (Zc.matcher(str).matches())
        integer = Integer.valueOf(Integer.parseInt(Zv(str.split(":")[1]))); 
      if (Zu.matcher(str).matches())
        long_ = ZW(str); 
      if (i == 0)
        break; 
    } 
    return new Zk5m(j, integer, long_);
  }
  
  Optional<Long> ZI(Zb6q paramZb6q) {
    List<String> list = paramZb6q.Zm();
    Iterator<String> iterator = list.iterator();
    int i = Zgum.ZA();
    while (iterator.hasNext()) {
      String str = iterator.next();
      try {
        if (Zu.matcher(str).matches())
          return Optional.ofNullable(ZW(str)); 
      } catch (DateTimeParseException dateTimeParseException) {
        throw a(null);
      } 
      try {
        if (ZE.matcher(str).matches())
          return Optional.ofNullable(ZW(str)); 
      } catch (DateTimeParseException dateTimeParseException) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
    return Optional.empty();
  }
  
  private Long ZW(String paramString) {
    String str = paramString.substring(paramString.indexOf(":") + 1).trim();
    if (ZN.matcher(str).matches()) {
      long l1 = Long.parseLong(str);
      try {
        if (l1 > 1697548607L) {
          try {
          
          } catch (DateTimeParseException dateTimeParseException) {
            throw a(null);
          } 
          return Long.valueOf((l1 > 1697548607000L) ? l1 : (l1 * 1000L));
        } 
      } catch (DateTimeParseException dateTimeParseException) {
        throw a(null);
      } 
      long l2 = this.Zl.ZX() / 1000L;
      return Long.valueOf((l2 + l1) * 1000L);
    } 
    try {
      return Long.valueOf(Instant.parse(str).toEpochMilli());
    } catch (DateTimeParseException dateTimeParseException) {
      Zah.Zl(dateTimeParseException, Zk_.IGNORED);
      try {
        return Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
      } catch (DateTimeParseException dateTimeParseException1) {
        Zah.Zl(dateTimeParseException1, Zk_.IGNORED);
        try {
          return Long.valueOf(ZR.parse(str).toInstant().toEpochMilli());
        } catch (ParseException parseException) {
          Zah.Zl(parseException, Zk_.IGNORED);
          return null;
        } 
      } 
    } 
  }
  
  private static String Zv(String paramString) {
    String str = paramString.trim();
    if (str.contains(","))
      str = str.substring(0, str.indexOf(',')); 
    return str;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '\\f@x\/@$VKK;Q5V\\b aw\\n9Apix\\n$\)]}bgH=AF\\n'_*-x\/D$AbI9I[AuF<MW[^!P#A@/@=E[[C3Bj\\n'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_3
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #16
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
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
    //   67: ldc 'lH\\b;P0U\\fv]-]OUaR(YCOJ5D7UT\\b;T7URc)lH\\b;P0U\\fv]-]OUaR(YCOJ5D7UT\\b%X)YRc'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #41
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: iconst_4
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 81
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #64
    //   198: goto -> 228
    //   201: bipush #52
    //   203: goto -> 228
    //   206: bipush #34
    //   208: goto -> 228
    //   211: bipush #37
    //   213: goto -> 228
    //   216: bipush #58
    //   218: goto -> 228
    //   221: bipush #77
    //   223: goto -> 228
    //   226: bipush #53
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 39, 0 -> 97
    //   284: new java/text/SimpleDateFormat
    //   287: dup
    //   288: aload_0
    //   289: iconst_2
    //   290: aaload
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: putstatic burp/Zma.ZR : Ljava/text/SimpleDateFormat;
    //   297: aload_0
    //   298: iconst_5
    //   299: aaload
    //   300: iconst_2
    //   301: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   304: putstatic burp/Zma.ZI : Ljava/util/regex/Pattern;
    //   307: aload_0
    //   308: iconst_3
    //   309: aaload
    //   310: iconst_2
    //   311: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   314: putstatic burp/Zma.Zc : Ljava/util/regex/Pattern;
    //   317: aload_0
    //   318: iconst_4
    //   319: aaload
    //   320: iconst_2
    //   321: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   324: putstatic burp/Zma.Zu : Ljava/util/regex/Pattern;
    //   327: aload_0
    //   328: iconst_1
    //   329: aaload
    //   330: iconst_2
    //   331: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   334: putstatic burp/Zma.ZE : Ljava/util/regex/Pattern;
    //   337: aload_0
    //   338: iconst_0
    //   339: aaload
    //   340: iconst_2
    //   341: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   344: putstatic burp/Zma.ZN : Ljava/util/regex/Pattern;
    //   347: return
  }
  
  private static DateTimeParseException a(DateTimeParseException paramDateTimeParseException) {
    return paramDateTimeParseException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zma.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */