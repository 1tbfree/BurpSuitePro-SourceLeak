package burp;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Zka3 {
  private static final DateTimeFormatter[] Zc;
  
  public static DateTimeFormatter Zb(int paramInt) {
    return ZI(paramInt, "");
  }
  
  public static DateTimeFormatter ZI(int paramInt, String paramString) {
    return (paramInt < 0 || paramInt >= 6) ? ((paramString == null) ? null : DateTimeFormatter.ofPattern(paramString).withZone(ZoneId.systemDefault())) : Zc[paramInt];
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '\\nP~"\\nP~"P@=J(@'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_5
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #9
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 69
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 21
    //   66: goto -> 215
    //   69: dup_x2
    //   70: pop
    //   71: invokevirtual toCharArray : ()[C
    //   74: dup_x1
    //   75: arraylength
    //   76: dup_x2
    //   77: pop
    //   78: iconst_0
    //   79: istore #6
    //   81: dup2_x1
    //   82: pop2
    //   83: dup_x2
    //   84: iconst_1
    //   85: if_icmpgt -> 188
    //   88: dup2
    //   89: swap
    //   90: iload #6
    //   92: dup2_x1
    //   93: caload
    //   94: swap
    //   95: iload #6
    //   97: bipush #7
    //   99: irem
    //   100: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #78
    //   142: goto -> 172
    //   145: bipush #20
    //   147: goto -> 172
    //   150: bipush #39
    //   152: goto -> 172
    //   155: bipush #14
    //   157: goto -> 172
    //   160: bipush #82
    //   162: goto -> 172
    //   165: bipush #32
    //   167: goto -> 172
    //   170: bipush #48
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 92
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 88
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 38
    //   215: bipush #6
    //   217: anewarray java/time/format/DateTimeFormatter
    //   220: putstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   223: getstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   226: iconst_0
    //   227: getstatic java/time/format/FormatStyle.SHORT : Ljava/time/format/FormatStyle;
    //   230: invokestatic ofLocalizedDate : (Ljava/time/format/FormatStyle;)Ljava/time/format/DateTimeFormatter;
    //   233: invokestatic systemDefault : ()Ljava/time/ZoneId;
    //   236: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   239: aastore
    //   240: getstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   243: iconst_1
    //   244: getstatic java/time/format/FormatStyle.MEDIUM : Ljava/time/format/FormatStyle;
    //   247: invokestatic ofLocalizedDate : (Ljava/time/format/FormatStyle;)Ljava/time/format/DateTimeFormatter;
    //   250: invokestatic systemDefault : ()Ljava/time/ZoneId;
    //   253: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   256: aastore
    //   257: getstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   260: iconst_2
    //   261: getstatic java/time/format/FormatStyle.LONG : Ljava/time/format/FormatStyle;
    //   264: invokestatic ofLocalizedDate : (Ljava/time/format/FormatStyle;)Ljava/time/format/DateTimeFormatter;
    //   267: invokestatic systemDefault : ()Ljava/time/ZoneId;
    //   270: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   273: aastore
    //   274: getstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   277: iconst_3
    //   278: aload_0
    //   279: iconst_2
    //   280: aaload
    //   281: invokestatic ofPattern : (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
    //   284: invokestatic systemDefault : ()Ljava/time/ZoneId;
    //   287: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   290: aastore
    //   291: getstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   294: iconst_4
    //   295: aload_0
    //   296: iconst_0
    //   297: aaload
    //   298: invokestatic ofPattern : (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
    //   301: invokestatic systemDefault : ()Ljava/time/ZoneId;
    //   304: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   307: aastore
    //   308: getstatic burp/Zka3.Zc : [Ljava/time/format/DateTimeFormatter;
    //   311: iconst_5
    //   312: aload_0
    //   313: iconst_1
    //   314: aaload
    //   315: invokestatic ofPattern : (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
    //   318: invokestatic systemDefault : ()Ljava/time/ZoneId;
    //   321: invokevirtual withZone : (Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;
    //   324: aastore
    //   325: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zka3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */