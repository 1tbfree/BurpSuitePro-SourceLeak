package burp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Zbo1 extends AbstractAction {
  final Zgr7 Zd;
  
  private static final String a;
  
  private Zbo1(Zgr7 paramZgr7) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zgr7;
    //   4: getfield Zl : Lburp/Zmgn;
    //   7: invokevirtual getSelectionStart : ()I
    //   10: istore_3
    //   11: invokestatic ZR : ()[Lburp/Zbqc;
    //   14: aload_0
    //   15: getfield Zd : Lburp/Zgr7;
    //   18: getfield Zl : Lburp/Zmgn;
    //   21: invokevirtual getText : ()Ljava/lang/String;
    //   24: invokestatic ZX : (Ljava/lang/String;)I
    //   27: istore #4
    //   29: astore_2
    //   30: aload_0
    //   31: getfield Zd : Lburp/Zgr7;
    //   34: iload_3
    //   35: iconst_1
    //   36: isub
    //   37: invokevirtual ZT : (I)C
    //   40: istore #5
    //   42: aload_0
    //   43: getfield Zd : Lburp/Zgr7;
    //   46: aload_0
    //   47: getfield Zd : Lburp/Zgr7;
    //   50: getfield Zl : Lburp/Zmgn;
    //   53: invokevirtual getSelectionEnd : ()I
    //   56: invokevirtual ZT : (I)C
    //   59: istore #6
    //   61: aload_0
    //   62: getfield Zd : Lburp/Zgr7;
    //   65: iload #4
    //   67: bipush #123
    //   69: bipush #125
    //   71: bipush #91
    //   73: bipush #93
    //   75: invokevirtual ZQ : (ICCCC)I
    //   78: istore #7
    //   80: iload #4
    //   82: iload_3
    //   83: invokestatic Zg : (II)Z
    //   86: ifne -> 140
    //   89: iload #6
    //   91: invokestatic Zt : (C)Z
    //   94: ifeq -> 140
    //   97: iload #5
    //   99: invokestatic Zt : (C)Z
    //   102: ifne -> 112
    //   105: iload #5
    //   107: bipush #58
    //   109: if_icmpne -> 140
    //   112: aload_0
    //   113: getfield Zd : Lburp/Zgr7;
    //   116: getfield Zl : Lburp/Zmgn;
    //   119: invokevirtual getText : ()Ljava/lang/String;
    //   122: iload #4
    //   124: iload_3
    //   125: invokestatic ZI : (Ljava/lang/String;II)Z
    //   128: ifne -> 140
    //   131: iload #7
    //   133: iflt -> 140
    //   136: iconst_1
    //   137: goto -> 141
    //   140: iconst_0
    //   141: istore #8
    //   143: iload #8
    //   145: ifeq -> 173
    //   148: aload_0
    //   149: getfield Zd : Lburp/Zgr7;
    //   152: getfield Zl : Lburp/Zmgn;
    //   155: getstatic burp/Zbo1.a : Ljava/lang/String;
    //   158: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   161: aload_0
    //   162: getfield Zd : Lburp/Zgr7;
    //   165: iconst_0
    //   166: putfield ZT : Z
    //   169: aload_2
    //   170: ifnull -> 185
    //   173: aload_0
    //   174: getfield Zd : Lburp/Zgr7;
    //   177: getfield Zl : Lburp/Zmgn;
    //   180: ldc '{'
    //   182: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   185: aload_0
    //   186: getfield Zd : Lburp/Zgr7;
    //   189: getfield Zl : Lburp/Zmgn;
    //   192: iload_3
    //   193: iconst_1
    //   194: iadd
    //   195: getstatic javax/swing/text/Position$Bias.Backward : Ljavax/swing/text/Position$Bias;
    //   198: invokevirtual Zc : (ILjavax/swing/text/Position$Bias;)V
    //   201: invokestatic Zwu : ()[Lburp/Zbqc;
    //   204: ifnonnull -> 214
    //   207: iconst_3
    //   208: anewarray burp/Zbqc
    //   211: invokestatic Zp : ([Lburp/Zbqc;)V
    //   214: return
  }
  
  static {
    // Byte code:
    //   0: bipush #67
    //   2: ldc 'c3'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbo1.a : Ljava/lang/String;
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
    //   80: bipush #91
    //   82: goto -> 112
    //   85: bipush #13
    //   87: goto -> 112
    //   90: bipush #98
    //   92: goto -> 112
    //   95: bipush #108
    //   97: goto -> 112
    //   100: bipush #106
    //   102: goto -> 112
    //   105: bipush #27
    //   107: goto -> 112
    //   110: bipush #59
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbo1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */