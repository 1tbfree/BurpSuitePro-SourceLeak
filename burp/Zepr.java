package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class Zepr extends Zepe implements ActionListener {
  private final Ztj1 Zd;
  
  private final Consumer<Ztj1> Zl;
  
  private static String ZD;
  
  private static final String b;
  
  public Zepr(Ztj1 paramZtj1, Consumer<Ztj1> paramConsumer) {
    super(b + b);
    this.Zd = paramZtj1;
    String str = Z_();
    this.Zl = paramConsumer;
    addActionListener(this);
    if (Zbqc.Zwu() == null)
      ZP("vGxhn"); 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.Zl.accept(this.Zd);
  }
  
  public static void ZP(String paramString) {
    ZD = paramString;
  }
  
  public static String Z_() {
    return ZD;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Z_ : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'QpuVOc'
    //   8: invokestatic ZP : (Ljava/lang/String;)V
    //   11: bipush #121
    //   13: ldc '"] y,'JYN6'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zepr.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #33
    //   94: goto -> 124
    //   97: bipush #63
    //   99: goto -> 124
    //   102: bipush #64
    //   104: goto -> 124
    //   107: bipush #75
    //   109: goto -> 124
    //   112: bipush #13
    //   114: goto -> 124
    //   117: bipush #111
    //   119: goto -> 124
    //   122: bipush #87
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */