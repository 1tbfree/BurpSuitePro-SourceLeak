package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import net.portswigger.Zhc;

class Ztgl implements Zggz {
  private final UnaryOperator<String> ZO;
  
  private final String Zx;
  
  private static final String a;
  
  Ztgl(UnaryOperator<String> paramUnaryOperator, String paramString) {
    this.ZO = paramUnaryOperator;
    this.Zx = paramString;
  }
  
  public Zm3v<?> Zn(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zm : (Lburp/Ztgl;Ljava/lang/String;)Lburp/Zm3v;
    //   7: areturn
  }
  
  private static Object Za(Object paramObject, UnaryOperator<String> paramUnaryOperator, String paramString) {
    if (paramObject instanceof String) {
      String str = (String)paramObject;
      return paramUnaryOperator.apply(str);
    } 
    if (paramObject instanceof List) {
      List list = (List)paramObject;
      return list.stream().map(paramUnaryOperator::lambda$convert$3).filter(Objects::nonNull).toList();
    } 
    throw new IllegalArgumentException(a.formatted(new Object[] { paramString }));
  }
  
  private static String lambda$convert$3(UnaryOperator<String> paramUnaryOperator, Object paramObject) {
    String str = (String)paramObject;
    return (paramObject instanceof String) ? paramUnaryOperator.apply(str) : null;
  }
  
  private Object lambda$fromFunctionReference$2(Zm3v<Object> paramZm3v, Zzvx paramZzvx) {
    Object object = paramZm3v.Zm(paramZzvx);
    return Za(object, this.ZO, this.Zx);
  }
  
  private Object lambda$fromReference$1(Zhc paramZhc, Zzvx paramZzvx) {
    Object object = paramZzvx.ZE(paramZhc.Zv());
    return Za(object, this.ZO, this.Zx);
  }
  
  private Object lambda$fromString$0(String paramString, Zzvx paramZzvx) {
    return this.ZO.apply(Zm7g.ZF(paramString).ZT(paramZzvx));
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: ldc '#eYlcEw^Dl&lYdO7\\be\\npO-p^V#7mP# 1@e^[j7@kp1\\tjD"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztgl.a : Ljava/lang/String;
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
    //   80: bipush #112
    //   82: goto -> 112
    //   85: bipush #20
    //   87: goto -> 112
    //   90: bipush #110
    //   92: goto -> 112
    //   95: bipush #39
    //   97: goto -> 112
    //   100: bipush #19
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #83
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */