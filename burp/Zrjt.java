package burp;

import java.io.IOException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrjt implements Zl2x {
  private final Zrk9 ZA;
  
  private final boolean ZN;
  
  private final Zmzk Zz;
  
  private final Zrps Zi;
  
  private final Zsfe ZT;
  
  private final Zeu6 ZM;
  
  private static final String a;
  
  public Zrjt(Zrk9 paramZrk9, boolean paramBoolean, Zmzk paramZmzk, Zrps paramZrps, Zsfe paramZsfe, Zeu6 paramZeu6) {
    this.ZA = paramZrk9;
    this.ZN = paramBoolean;
    this.Zz = paramZmzk;
    this.Zi = paramZrps;
    this.ZT = paramZsfe;
    this.ZM = paramZeu6;
  }
  
  public SSLSocket ZK(Zbzu paramZbzu, String[] paramArrayOfString1, String[] paramArrayOfString2) throws IOException, Zryo, Zr9q, Zxt3 {
    try {
      if (paramArrayOfString1 != null)
        try {
          if (paramArrayOfString1.length == 0)
            return null; 
          try {
            if (paramArrayOfString2 != null)
              try {
                if (paramArrayOfString2.length == 0)
                  return null; 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfString2 != null)
        try {
          if (paramArrayOfString2.length == 0)
            return null; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZC(String[] paramArrayOfString1, String[] paramArrayOfString2, SSLSocket paramSSLSocket) throws SSLException {
    try {
      try {
        if (paramArrayOfString2 != null)
          paramSSLSocket.setEnabledCipherSuites(paramArrayOfString2); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (paramArrayOfString1 != null)
          paramSSLSocket.setEnabledProtocols(paramArrayOfString1); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      int i = paramSSLSocket.getSoTimeout();
      paramSSLSocket.setSoTimeout(this.Zi.Zb());
      paramSSLSocket.startHandshake();
      paramSSLSocket.setSoTimeout(i);
    } catch (IllegalArgumentException illegalArgumentException) {
      Zah.Zl(illegalArgumentException, Zk_.USER_ERROR);
      String str = illegalArgumentException.getMessage();
      try {
      
      } catch (IllegalArgumentException illegalArgumentException1) {
        throw a(null);
      } 
      throw new SSLException((str == null) ? a : str);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      String str = iOException.getMessage();
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      throw new SSLException((str == null) ? iOException.toString() : str);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc '{4f~L\.p GZo}zv\\thJI/ggL@'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrjt.a : Ljava/lang/String;
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
    //   80: bipush #26
    //   82: goto -> 112
    //   85: bipush #110
    //   87: goto -> 112
    //   90: bipush #33
    //   92: goto -> 112
    //   95: bipush #80
    //   97: goto -> 112
    //   100: bipush #83
    //   102: goto -> 112
    //   105: bipush #58
    //   107: goto -> 112
    //   110: bipush #23
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */