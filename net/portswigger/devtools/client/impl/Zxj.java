package net.portswigger.devtools.client.impl;

import java.util.Objects;
import net.portswigger.browser.Zd;
import net.portswigger.browser.Ze3;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zz;
import net.portswigger.devtools.client.Zn;

public class Zxj implements Zz, Zf {
  private static final Zxa ZT;
  
  private final Zev ZH;
  
  private final Zd ZR;
  
  private final Zn Zp;
  
  private volatile Ze3 Zu;
  
  public Zxj(Zev paramZev, Zd paramZd, Zn paramZn) {
    this.ZH = Objects.<Zev>requireNonNull(paramZev);
    this.ZR = Objects.<Zd>requireNonNull(paramZd);
    this.Zp = Objects.<Zn>requireNonNull(paramZn);
    this.Zu = Ze3.ATTACHED;
  }
  
  public Zev ZG() {
    return this.ZH;
  }
  
  public Zd Z_() {
    return this.ZR;
  }
  
  public Ze3 ZO() {
    return this.Zu;
  }
  
  public void Zo(Ze3 paramZe3) {
    this.Zu = paramZe3;
  }
  
  public Zn Zv() {
    return this.Zp;
  }
  
  public void Zp() {
    this.Zp.ZX();
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: ldc 'U&\\bC5;G;\\fA "'
    //   3: iconst_m1
    //   4: goto -> 11
    //   7: astore_0
    //   8: goto -> 150
    //   11: dup_x2
    //   12: pop
    //   13: invokevirtual toCharArray : ()[C
    //   16: dup_x1
    //   17: arraylength
    //   18: dup_x2
    //   19: pop
    //   20: iconst_0
    //   21: istore_1
    //   22: dup2_x1
    //   23: pop2
    //   24: dup_x2
    //   25: iconst_1
    //   26: if_icmpgt -> 124
    //   29: dup2
    //   30: swap
    //   31: iload_1
    //   32: dup2_x1
    //   33: caload
    //   34: swap
    //   35: iload_1
    //   36: bipush #7
    //   38: irem
    //   39: tableswitch default -> 106, 0 -> 76, 1 -> 81, 2 -> 86, 3 -> 91, 4 -> 96, 5 -> 101
    //   76: bipush #102
    //   78: goto -> 108
    //   81: bipush #50
    //   83: goto -> 108
    //   86: bipush #86
    //   88: goto -> 108
    //   91: bipush #124
    //   93: goto -> 108
    //   96: bipush #40
    //   98: goto -> 108
    //   101: bipush #103
    //   103: goto -> 108
    //   106: bipush #82
    //   108: ixor
    //   109: ixor
    //   110: i2c
    //   111: castore
    //   112: iinc #1, 1
    //   115: dup
    //   116: ifne -> 124
    //   119: dup2
    //   120: dup_x1
    //   121: goto -> 32
    //   124: dup2_x1
    //   125: pop2
    //   126: dup_x2
    //   127: iload_1
    //   128: if_icmpgt -> 29
    //   131: pop
    //   132: new java/lang/String
    //   135: dup_x1
    //   136: swap
    //   137: invokespecial <init> : ([C)V
    //   140: invokevirtual intern : ()Ljava/lang/String;
    //   143: swap
    //   144: pop
    //   145: swap
    //   146: pop
    //   147: goto -> 7
    //   150: new net/portswigger/devtools/client/impl/Zxa
    //   153: dup
    //   154: aload_0
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: putstatic net/portswigger/devtools/client/impl/Zxj.ZT : Lnet/portswigger/devtools/client/impl/Zxa;
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */