package burp;

import java.util.List;

public class Zkbu implements Ze0c {
  private static final int Zk;
  
  private static final int ZT;
  
  private final Zt2c Zy;
  
  private final Ze0c Zb;
  
  public Zkbu(Zt2c paramZt2c, Ze0c paramZe0c) {
    this.Zy = paramZt2c;
    this.Zb = paramZe0c;
  }
  
  public void ZE(Zlit paramZlit, Zs68 paramZs68, byte[] paramArrayOfbyte, Zm4 paramZm4) {
    boolean bool = Zt2c.ZK();
    for (Ztu8 ztu8 : paramZs68.Zd) {
      if (ztu8.ZlD() == 2) {
        Zp(paramZlit, paramArrayOfbyte, ztu8, paramZm4);
        Zw(paramZlit, paramArrayOfbyte, ztu8, paramZm4);
      } 
      if (bool)
        break; 
    } 
  }
  
  private void Zp(Zlit paramZlit, byte[] paramArrayOfbyte, Ztu8 paramZtu8, Zm4 paramZm4) {
    int i = paramZtu8.ZlK() + Zk;
    int j = paramZtu8.Zli() - ZT;
    this.Zy.ZI(paramZlit, paramArrayOfbyte, i, j, paramZm4);
  }
  
  private void Zw(Zlit paramZlit, byte[] paramArrayOfbyte, Ztu8 paramZtu8, Zm4 paramZm4) {
    if (paramArrayOfbyte.length == 0)
      return; 
    List<Ztu8> list = Zeam.Zv(paramArrayOfbyte, paramZtu8.ZlK() + 1, paramZtu8.Zli(), (byte)0);
    if (list.size() > 0) {
      Zs68 zs68 = Zgv9.ZG().Zp(list).Zl();
      this.Zb.ZE(paramZlit, zs68, paramArrayOfbyte, paramZm4);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'E5DT9W*'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_3
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #82
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
    //   140: bipush #58
    //   142: goto -> 172
    //   145: bipush #74
    //   147: goto -> 172
    //   150: bipush #40
    //   152: goto -> 172
    //   155: bipush #85
    //   157: goto -> 172
    //   160: bipush #78
    //   162: goto -> 172
    //   165: bipush #37
    //   167: goto -> 172
    //   170: bipush #28
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
    //   215: aload_0
    //   216: iconst_1
    //   217: aaload
    //   218: invokevirtual length : ()I
    //   221: putstatic burp/Zkbu.Zk : I
    //   224: aload_0
    //   225: iconst_0
    //   226: aaload
    //   227: invokevirtual length : ()I
    //   230: putstatic burp/Zkbu.ZT : I
    //   233: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */