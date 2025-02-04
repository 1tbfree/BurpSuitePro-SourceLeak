package burp;

import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import net.portswigger.Zae;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

public class Zl7t {
  private final Zmjm Zo;
  
  private final Zl0 Ze;
  
  private final Component Zq;
  
  private final String Zx;
  
  private static final String a;
  
  public Zl7t(Zmjm paramZmjm, Zl0 paramZl0, Component paramComponent, String paramString) {
    this.Zo = paramZmjm;
    this.Ze = paramZl0;
    this.Zq = paramComponent;
    this.Zx = paramString;
  }
  
  public String Zg() {
    File file = Zs6n.Zp(Zg1m.CONFIG, this.Zo, this.Zq, 0, Zrgs.LOAD_SETTINGS.ZN(new Object[] { this.Zx }));
    try {
      if (file == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      return Zs6n.Zr(file, this.Ze, Zae.Z_);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zx6o.Zv(this.Zq, Zrgs.CONFIGURATION_FILE_ERROR.ZN(new Object[0]), Zrgs.COULD_NOT_LOAD_CONFIGURATION_FILE.ZN(new Object[] { file.getAbsolutePath() }));
      return null;
    } 
  }
  
  public void Zo(Zskm paramZskm, String paramString) {
    File file = Zs6n.ZA(Zg1m.CONFIG, this.Zo, this.Zq, 2, Zrgs.SAVE_SETTINGS.ZN(new Object[] { this.Zx }, ), paramZskm);
    try {
      if (file == null)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = Zmzy.Zy(file);
    try {
      if (this.Ze.Zg(str).exists())
        try {
          if (!Zx6o.ZY(Zt2m.ZF(this.Zq), a)) {
            Zo(paramZskm, paramString);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      FileWriter fileWriter = new FileWriter(str);
      fileWriter.write(paramString);
      fileWriter.close();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zx6o.Zv(this.Zq, Zrgs.CONFIGURATION_FILE_ERROR.ZN(new Object[0]), Zrgs.COULD_NOT_SAVE_CONFIGURATION_FILE.ZN(new Object[] { file.getAbsolutePath() }));
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #115
    //   2: ldc '5>$M`\\rw6kl .w\\ba`$yMX{F.89z2h'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl7t.a : Ljava/lang/String;
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
    //   80: bipush #18
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #36
    //   92: goto -> 112
    //   95: bipush #36
    //   97: goto -> 112
    //   100: bipush #30
    //   102: goto -> 112
    //   105: bipush #106
    //   107: goto -> 112
    //   110: bipush #122
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */