package burp;

import java.io.IOException;
import java.nio.file.Path;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgj8 implements Zbo9 {
  private final Path Zo;
  
  private static final String a;
  
  public Zgj8(Path paramPath) {
    this.Zo = paramPath;
    Runtime.getRuntime().addShutdownHook(new Thread(this::Zb, a));
  }
  
  public Path Zf() {
    return this.Zo;
  }
  
  private void Zb() {
    try {
      Zz();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc '< Da3:s.; [<8-]~.\\rH;\\r\e8&HA~3'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zgj8.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #75
    //   82: goto -> 112
    //   85: bipush #102
    //   87: goto -> 112
    //   90: bipush #42
    //   92: goto -> 112
    //   95: bipush #18
    //   97: goto -> 112
    //   100: bipush #95
    //   102: goto -> 112
    //   105: bipush #119
    //   107: goto -> 112
    //   110: bipush #102
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgj8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */