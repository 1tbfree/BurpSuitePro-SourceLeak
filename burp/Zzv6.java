package burp;

import net.portswigger.Zkb;
import net.portswigger.Zsy;
import net.portswigger.Ztu;
import net.portswigger.browser.Zi;

public class Zzv6 {
  private final Zsy Zl;
  
  private static final String a;
  
  public Zzv6(Zsy paramZsy) {
    this.Zl = paramZsy;
  }
  
  public byte[] ZL(Zlit paramZlit) {
    byte[] arrayOfByte1 = this.Zl.ZU().Zz(16);
    byte[] arrayOfByte2 = Ztu.Zt(arrayOfByte1);
    String str = String.format(a, new Object[] { Zkb.ZG(paramZlit.ZdH()), paramZlit.Zd1(), Zi.ZC(), paramZlit.Zdq(), Zkb.ZG(arrayOfByte2) });
    Zbqc[] arrayOfZbqc = Zsg3.Zh();
    if (Zbqc.Zwu() == null)
      Zsg3.ZG(new Zbqc[4]); 
    return Zkb.Zy(str);
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc '{=zt,~8\\ruOf_zNX`]=oO7qn_R\\fz769&MUyNXo0}&K@}p+IEh]YBeK^$ooT @Nx\\tx0Y~_\\r9uO}Ujk'}_jQY\\fhxU{IU+8\\t1r\\n\YnSRBeC3]w\\nC0o&glXo&EU}w<,I1rA^g__\\f,A^3i\\b"\Qm_1r^W{[XGlXO&EU}76uO'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzv6.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #70
    //   82: goto -> 111
    //   85: iconst_2
    //   86: goto -> 111
    //   89: bipush #63
    //   91: goto -> 111
    //   94: bipush #84
    //   96: goto -> 111
    //   99: bipush #74
    //   101: goto -> 111
    //   104: bipush #115
    //   106: goto -> 111
    //   109: bipush #64
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzv6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */