package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.swing.border.EmptyBorder;

class Zbdw extends Zbqc {
  private final List<Zgib> Zr;
  
  private final Consumer<Integer> Zc;
  
  private final Zbqc ZK;
  
  private final Zbc9 ZW;
  
  private Zm9r Zn;
  
  private Zm99 ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbdw(List<Zgib> paramList, Consumer<Integer> paramConsumer) {
    super(new BorderLayout());
    this.Zr = paramList;
    this.Zc = paramConsumer;
    this.ZK = ZI();
    String[] arrayOfString = Zxff.ZA();
    this.ZW = new Zbc9((List<Component>)paramList.stream().map(Zed::ZB).collect(Collectors.toList()));
    Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    add(this.ZK, a(-24452, 6614));
    add(this.ZW, a(-24449, -16984));
    if (paramList.size() == 1) {
      Zh();
      if (arrayOfString != null) {
        Ze(paramConsumer);
        return;
      } 
      return;
    } 
    Ze(paramConsumer);
  }
  
  void Zk(Zm1o paramZm1o, Zt8 paramZt8, Component... paramVarArgs) {
    Zu(Zr_7.Zr(paramZm1o, paramZt8, paramVarArgs));
  }
  
  void ZX() {
    Zm99 zm99 = new Zm99(" ");
    zm99.setBorder(new EmptyBorder(1, 0, 1, 0));
    Zu(zm99);
  }
  
  private void Zu(Component paramComponent) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    gridBagConstraints.weightx = 1.0D;
    this.ZK.add(paramComponent, gridBagConstraints);
  }
  
  void Zt(int paramInt) {
    String[] arrayOfString = Zxff.ZA();
    if (paramInt < this.Zr.size()) {
      if (this.Zn != null) {
        this.Zn.Z_(paramInt);
        if (arrayOfString != null) {
          this.Zc.accept(Integer.valueOf(paramInt));
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    this.Zc.accept(Integer.valueOf(paramInt));
  }
  
  private Zbqc ZI() {
    Zbqc zbqc = new Zbqc(new GridBagLayout());
    zbqc.Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    zbqc.setBorder(new EmptyBorder(5, 10, 1, 10));
    return zbqc;
  }
  
  private void Zh() {
    this.ZI = new Zm99();
    this.ZI.Ze(Zlkk.BURP_TITLE);
    this.ZI.ZE(Zt00.TITLE_BOLD_FONT);
    this.ZI.setText(((Zgib)this.Zr.get(0)).Zb());
    Zn(this.ZI);
  }
  
  private void Ze(Consumer<Integer> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: new burp/Zm9r
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield Zn : Lburp/Zm9r;
    //   11: invokestatic ZA : ()[Ljava/lang/String;
    //   14: aload_0
    //   15: getfield Zn : Lburp/Zm9r;
    //   18: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   21: invokevirtual Ze : (Lburp/Zlkk;)V
    //   24: aload_0
    //   25: getfield Zn : Lburp/Zm9r;
    //   28: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   31: invokevirtual ZE : (Lburp/Zt00;)V
    //   34: aload_0
    //   35: getfield Zn : Lburp/Zm9r;
    //   38: sipush #-24450
    //   41: sipush #290
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokevirtual setName : (Ljava/lang/String;)V
    //   50: astore_2
    //   51: aload_0
    //   52: getfield Zr : Ljava/util/List;
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore_3
    //   61: aload_3
    //   62: invokeinterface hasNext : ()Z
    //   67: ifeq -> 99
    //   70: aload_3
    //   71: invokeinterface next : ()Ljava/lang/Object;
    //   76: checkcast burp/Zgib
    //   79: astore #4
    //   81: aload_0
    //   82: getfield Zn : Lburp/Zm9r;
    //   85: aload #4
    //   87: invokeinterface Zb : ()Ljava/lang/String;
    //   92: invokevirtual Zq : (Ljava/lang/String;)V
    //   95: aload_2
    //   96: ifnull -> 61
    //   99: aload_0
    //   100: getfield Zn : Lburp/Zm9r;
    //   103: aload_0
    //   104: aload_1
    //   105: <illegal opcode> accept : (Lburp/Zbdw;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   110: invokevirtual Zx : (Ljava/util/function/Consumer;)V
    //   113: aload_0
    //   114: aload_0
    //   115: getfield Zn : Lburp/Zm9r;
    //   118: invokevirtual Zn : (Lburp/Zm99;)V
    //   121: return
  }
  
  private void Zn(Zm99 paramZm99) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.weightx = 1.0D;
    this.ZK.add(paramZm99, gridBagConstraints);
  }
  
  public void ZB() {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zr : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: iconst_1
    //   14: if_icmpne -> 53
    //   17: aload_0
    //   18: getfield ZI : Lburp/Zm99;
    //   21: ifnull -> 169
    //   24: aload_0
    //   25: getfield ZI : Lburp/Zm99;
    //   28: aload_0
    //   29: getfield Zr : Ljava/util/List;
    //   32: iconst_0
    //   33: invokeinterface get : (I)Ljava/lang/Object;
    //   38: checkcast burp/Zgib
    //   41: invokeinterface Zb : ()Ljava/lang/String;
    //   46: invokevirtual setText : (Ljava/lang/String;)V
    //   49: aload_1
    //   50: ifnull -> 169
    //   53: aload_0
    //   54: getfield Zn : Lburp/Zm9r;
    //   57: ifnull -> 169
    //   60: aload_0
    //   61: getfield Zn : Lburp/Zm9r;
    //   64: invokevirtual Zb : ()I
    //   67: istore_2
    //   68: aload_0
    //   69: getfield Zn : Lburp/Zm9r;
    //   72: invokevirtual ZH : ()Ljava/util/List;
    //   75: astore_3
    //   76: aload_0
    //   77: getfield Zn : Lburp/Zm9r;
    //   80: invokevirtual Zc : ()V
    //   83: aload_0
    //   84: getfield Zn : Lburp/Zm9r;
    //   87: invokevirtual Zs : ()V
    //   90: aload_0
    //   91: getfield Zr : Ljava/util/List;
    //   94: invokeinterface iterator : ()Ljava/util/Iterator;
    //   99: astore #4
    //   101: aload #4
    //   103: invokeinterface hasNext : ()Z
    //   108: ifeq -> 141
    //   111: aload #4
    //   113: invokeinterface next : ()Ljava/lang/Object;
    //   118: checkcast burp/Zgib
    //   121: astore #5
    //   123: aload_0
    //   124: getfield Zn : Lburp/Zm9r;
    //   127: aload #5
    //   129: invokeinterface Zb : ()Ljava/lang/String;
    //   134: invokevirtual Zq : (Ljava/lang/String;)V
    //   137: aload_1
    //   138: ifnull -> 101
    //   141: aload_0
    //   142: getfield Zn : Lburp/Zm9r;
    //   145: iload_2
    //   146: invokevirtual Z_ : (I)V
    //   149: aload_3
    //   150: aload_0
    //   151: getfield Zn : Lburp/Zm9r;
    //   154: dup
    //   155: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   158: pop
    //   159: <illegal opcode> accept : (Lburp/Zm9r;)Ljava/util/function/Consumer;
    //   164: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   169: return
  }
  
  private void lambda$showComboPane$0(Consumer<Integer> paramConsumer, Integer paramInteger) {
    this.ZW.Zv(paramInteger.intValue());
    paramConsumer.accept(paramInteger);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÑÛR Sx«r;06Ægõº;iwQU\â³<q-Ó/L óå&ÁAèj'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #31
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #98
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic burp/Zbdw.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zbdw.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: iconst_3
    //   153: goto -> 183
    //   156: bipush #125
    //   158: goto -> 183
    //   161: bipush #107
    //   163: goto -> 183
    //   166: bipush #70
    //   168: goto -> 183
    //   171: bipush #96
    //   173: goto -> 183
    //   176: bipush #54
    //   178: goto -> 183
    //   181: bipush #114
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA07E) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'û';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */