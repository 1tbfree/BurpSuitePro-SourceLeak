package burp;

import java.awt.Component;
import net.portswigger.Zl0;

public class Zr1m {
  private final Zmjm Zh;
  
  private final Zlaq ZB;
  
  private final Zs4c ZW;
  
  private final Zl0 Zv;
  
  private final Zmte Zd;
  
  private static final String a;
  
  public Zr1m(Zmjm paramZmjm, Zlaq paramZlaq, Zs4c paramZs4c, Zl0 paramZl0) {
    this.Zh = paramZmjm;
    this.ZB = paramZlaq;
    this.ZW = paramZs4c;
    this.Zv = paramZl0;
    this.Zd = new Zmte(paramZlaq);
  }
  
  public void Ze(String paramString, String... paramVarArgs) throws Ze0d {
    this.Zd.Za(paramString, paramVarArgs);
  }
  
  public void ZM(Component paramComponent, String paramString, Zl_j paramZl_j, String... paramVarArgs) {
    ZS(paramComponent, paramString, paramZl_j, paramVarArgs);
  }
  
  public void ZN(Component paramComponent, String paramString, String... paramVarArgs) {
    Zl_j zl_j = new Zl_j(a, paramVarArgs);
    ZS(paramComponent, paramString, zl_j, paramVarArgs);
  }
  
  private void ZS(Component paramComponent, String paramString, Zl_j paramZl_j, String... paramVarArgs) {
    Zl7t zl7t = new Zl7t(this.Zh, this.Zv, paramComponent, paramString);
    Zedk zedk = new Zedk(zl7t, paramComponent);
    Zmf_ zmf_ = zedk.ZS(paramZl_j);
    if (zmf_ != null)
      this.ZB.ZC(zmf_, paramVarArgs); 
  }
  
  public String ZZ(String... paramVarArgs) {
    return this.Zd.ZG(paramVarArgs);
  }
  
  public void ZY(Component paramComponent, String paramString, String... paramVarArgs) {
    ZW(paramComponent, paramString, new Zm92(), paramVarArgs);
  }
  
  public void ZC(Component paramComponent, String paramString, String... paramVarArgs) {
    ZW(paramComponent, paramString, null, paramVarArgs);
  }
  
  public void Zl(String... paramVarArgs) {
    Zmf_ zmf_ = this.ZW.ZD(paramVarArgs);
    this.ZB.ZC(zmf_, new String[0]);
  }
  
  private void ZW(Component paramComponent, String paramString, Zskm paramZskm, String[] paramArrayOfString) {
    Zl7t zl7t = new Zl7t(this.Zh, this.Zv, paramComponent, paramString);
    Zedk zedk = new Zedk(zl7t, paramComponent);
    zedk.Zx(paramZskm, this.ZB.Zd(paramArrayOfString));
  }
  
  static {
    // Byte code:
    //   0: bipush #57
    //   2: ldc 'W\\rv}&e\\ft((j\\n}}  fEw2\\b:Lm\\ng}&wz3M=fEa8<q w}9j\\n}.Ci"l{4.Lk`},\\tmEp5\\f'f='
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr1m.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #58
    //   82: goto -> 112
    //   85: bipush #92
    //   87: goto -> 112
    //   90: bipush #42
    //   92: goto -> 112
    //   95: bipush #100
    //   97: goto -> 112
    //   100: bipush #84
    //   102: goto -> 112
    //   105: bipush #112
    //   107: goto -> 112
    //   110: bipush #85
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */