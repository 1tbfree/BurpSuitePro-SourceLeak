package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;

public class Zzf3 extends Zz85 {
  private static final String c;
  
  public Zzf3() {
    super(c);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_3
    //   4: iconst_1
    //   5: istore #4
    //   7: aload_2
    //   8: ifnull -> 210
    //   11: aload_2
    //   12: invokevirtual isEditable : ()Z
    //   15: ifeq -> 210
    //   18: goto -> 25
    //   21: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   29: astore #5
    //   31: aload_2
    //   32: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   35: astore #6
    //   37: aload #6
    //   39: invokeinterface getDot : ()I
    //   44: istore #7
    //   46: aload #6
    //   48: invokeinterface getMark : ()I
    //   53: istore #8
    //   55: iload #7
    //   57: iload #8
    //   59: if_icmpeq -> 91
    //   62: aload #5
    //   64: iload #7
    //   66: iload #8
    //   68: invokestatic min : (II)I
    //   71: iload #7
    //   73: iload #8
    //   75: isub
    //   76: invokestatic abs : (I)I
    //   79: invokeinterface remove : (II)V
    //   84: iconst_0
    //   85: istore #4
    //   87: iload_3
    //   88: ifne -> 197
    //   91: iload #7
    //   93: ifle -> 197
    //   96: goto -> 103
    //   99: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   102: athrow
    //   103: iconst_1
    //   104: istore #9
    //   106: iload #7
    //   108: iconst_1
    //   109: if_icmple -> 180
    //   112: aload_2
    //   113: invokevirtual ZE : ()Z
    //   116: ifne -> 180
    //   119: goto -> 126
    //   122: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   125: athrow
    //   126: aload #5
    //   128: iload #7
    //   130: iconst_2
    //   131: isub
    //   132: iconst_2
    //   133: invokeinterface getText : (II)Ljava/lang/String;
    //   138: astore #10
    //   140: aload #10
    //   142: iconst_0
    //   143: invokevirtual charAt : (I)C
    //   146: istore #11
    //   148: aload #10
    //   150: iconst_1
    //   151: invokevirtual charAt : (I)C
    //   154: istore #12
    //   156: iload #11
    //   158: bipush #13
    //   160: if_icmpne -> 180
    //   163: iload #12
    //   165: bipush #10
    //   167: if_icmpne -> 180
    //   170: goto -> 177
    //   173: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   176: athrow
    //   177: iconst_2
    //   178: istore #9
    //   180: aload #5
    //   182: iload #7
    //   184: iload #9
    //   186: isub
    //   187: iload #9
    //   189: invokeinterface remove : (II)V
    //   194: iconst_0
    //   195: istore #4
    //   197: goto -> 210
    //   200: astore #5
    //   202: aload #5
    //   204: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   207: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   210: iload #4
    //   212: ifeq -> 229
    //   215: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   218: aload_2
    //   219: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   222: goto -> 229
    //   225: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   228: athrow
    //   229: return
    // Exception table:
    //   from	to	target	type
    //   7	18	21	javax/swing/text/BadLocationException
    //   25	197	200	javax/swing/text/BadLocationException
    //   87	96	99	javax/swing/text/BadLocationException
    //   106	119	122	javax/swing/text/BadLocationException
    //   156	170	173	javax/swing/text/BadLocationException
    //   210	222	225	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #44
    //   2: ldc 'x"Ego+Vm\ '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzf3.c : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #95
    //   82: goto -> 111
    //   85: bipush #49
    //   87: goto -> 111
    //   90: bipush #98
    //   92: goto -> 111
    //   95: bipush #12
    //   97: goto -> 111
    //   100: bipush #91
    //   102: goto -> 111
    //   105: bipush #46
    //   107: goto -> 111
    //   110: iconst_5
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */