package burp;

import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zx5v {
  private static final Pattern ZE;
  
  private static final Pattern ZB;
  
  private final Ztdi Zj;
  
  public Zx5v(Ztdi paramZtdi) {
    this.Zj = paramZtdi;
  }
  
  public boolean ZM(Zlit paramZlit, String paramString, Zbnt paramZbnt) {
    try {
      try {
        if (ZE.matcher(paramString).matches()) {
          if (ZB.matcher(paramString).matches()) {
            Zlit zlit = Zry3.ZL(paramString, paramZlit, paramZbnt);
            try {
            
            } catch (StackOverflowError stackOverflowError) {
              throw a(null);
            } 
            return (this.Zj.ZU(zlit) != null);
          } 
          return true;
        } 
      } catch (StackOverflowError stackOverflowError) {
        throw a(null);
      } 
    } catch (StackOverflowError stackOverflowError) {
      Zah.Zl(stackOverflowError, Zk_.COMMON_RUNTIME_FAILURE);
      char c = paramString.charAt(0);
      try {
        if (c != '.') {
          try {
            if (Character.isLetterOrDigit(c));
          } catch (StackOverflowError stackOverflowError1) {
            throw a(null);
          } 
          return false;
        } 
      } catch (StackOverflowError stackOverflowError1) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '-Rg*<sYCh+o ,Ruy>;0?61X>q?Fyx;0?Hv)*n( =6n&,Ftn;) -Rgn;)TYkz)$!0!n;)*^]pe>iXo;-:$y1s:X=S+Dtl,,5*uy>O!^1*!#xDty,,5YRuy>;0?61)=q.0!n;)*^]pe>iXo;-:$8Eb|_Ox(C#mYo':Wx4>6d@;!r,Dv`-9':Wuy>HSr@s8/Ns-Rgc_#"<\\fp Yh=xDtm9;0?61)=q.0!n;)*^]pe>iXo;-:$,DbX*Ruy>;0?61X>q?Fyx;0?Hv)*n( =6n&,Ftn;) -Rgn;)TYkz)$!0!n;)*^]pe>iXo;-:$y1s:X=S+Dtl'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: sipush #262
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #13
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 71
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
    //   68: goto -> 214
    //   71: dup_x2
    //   72: pop
    //   73: invokevirtual toCharArray : ()[C
    //   76: dup_x1
    //   77: arraylength
    //   78: dup_x2
    //   79: pop
    //   80: iconst_0
    //   81: istore #6
    //   83: dup2_x1
    //   84: pop2
    //   85: dup_x2
    //   86: iconst_1
    //   87: if_icmpgt -> 187
    //   90: dup2
    //   91: swap
    //   92: iload #6
    //   94: dup2_x1
    //   95: caload
    //   96: swap
    //   97: iload #6
    //   99: bipush #7
    //   101: irem
    //   102: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #8
    //   142: goto -> 171
    //   145: bipush #96
    //   147: goto -> 171
    //   150: bipush #80
    //   152: goto -> 171
    //   155: bipush #75
    //   157: goto -> 171
    //   160: bipush #9
    //   162: goto -> 171
    //   165: bipush #30
    //   167: goto -> 171
    //   170: iconst_2
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 94
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 90
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 40
    //   214: aload_0
    //   215: iconst_0
    //   216: aaload
    //   217: iconst_2
    //   218: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   221: putstatic burp/Zx5v.ZE : Ljava/util/regex/Pattern;
    //   224: aload_0
    //   225: iconst_1
    //   226: aaload
    //   227: iconst_2
    //   228: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   231: putstatic burp/Zx5v.ZB : Ljava/util/regex/Pattern;
    //   234: return
  }
  
  private static StackOverflowError a(StackOverflowError paramStackOverflowError) {
    return paramStackOverflowError;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */