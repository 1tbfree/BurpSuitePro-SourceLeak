package net.portswigger.devtools.client.impl.connection.local.process.chrome;

import burp.Zbqc;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Z_;
import net.portswigger.browser.Zjb;

public class Zo {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Z_ ZP(Path paramPath1, Path paramPath2) {
    Zjb zjb = Zjb.Zr();
    int[] arrayOfInt = Zm.ZO();
    try {
      switch (Zq.Zt[zjb.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        case 2:
        case 3:
        case 4:
        
        case 5:
        case 6:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return ZY(Zd.ZK(), paramPath1, paramPath2);
  }
  
  private static Z_ ZY(Zd paramZd, Path paramPath1, Path paramPath2) {
    try {
      if (paramZd.Zt())
        return Z_.RUNNING_AS_ROOT; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zm zm = Zm.ZL();
    try {
      if (zm == Zm.SUPPORTED)
        return Z_.SUPPORTED; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Path path1 = paramPath1;
    UserPrincipalLookupService userPrincipalLookupService = FileSystems.getDefault().getUserPrincipalLookupService();
    try {
      GroupPrincipal groupPrincipal = userPrincipalLookupService.lookupPrincipalByGroupName(a(-23348, -1715));
      UserPrincipal userPrincipal = userPrincipalLookupService.lookupPrincipalByName(a(-23353, 8073));
      PosixFileAttributeView posixFileAttributeView = Files.<PosixFileAttributeView>getFileAttributeView(path1, PosixFileAttributeView.class, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
      PosixFileAttributes posixFileAttributes = posixFileAttributeView.readAttributes();
      try {
        if (groupPrincipal.equals(posixFileAttributes.group()))
          try {
            if (userPrincipal.equals(posixFileAttributes.owner()) && ZF(path1))
              return Z_.SUPPORTED; 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
    try {
      if (zm == Zm.NOT_SUPPORTED)
        return Z_.USER_NAMESPACE_CLONE_NOT_SUPPORTED; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!Files.exists(Paths.get("/", new String[] { a(-23354, -5277), a(-23337, -4956), a(-23356, -23053), a(-23359, -25885) }), new LinkOption[0]))
        return Z_.SANDBOX_NAMESPACES; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    path1 = Paths.get("/", new String[] { a(-23360, -19301), a(-23358, 19925), a(-23347, -16371), a(-23345, -16990) });
    try {
      if (Files.exists(path1, new LinkOption[0])) {
        if (!ZN(path1).equals("1")) {
          boolean bool = Zg.Zy(paramPath1, paramPath2);
          try {
            if (!bool)
              return Z_.SANDBOX_NAMESPACE_CLONING; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
        return Z_.SUPPORTED;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Path path2 = Paths.get("/", new String[] { a(-23360, -19301), a(-23351, 3517), a(-23352, -20046), a(-23350, 25447) });
    try {
      if (Files.exists(path2, new LinkOption[0])) {
        if (!ZN(path2).equals("0")) {
          boolean bool = Zg.Zy(paramPath1, paramPath2);
          try {
            if (!bool)
              return Z_.SANDBOX_NAMESPACE_RESTRICT; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
        return Z_.SUPPORTED;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Z_.SUPPORTED;
  }
  
  private static String ZN(Path paramPath) {
    try {
      return Zkb.ZG(Files.readAllBytes(paramPath));
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      return "";
    } 
  }
  
  private static boolean ZF(Path paramPath) throws IOException {
    ProcessBuilder processBuilder = new ProcessBuilder(new String[] { a(-23349, 6938), a(-23357, 28322), a(-23346, -2520), paramPath.toString() });
    Process process = processBuilder.start();
    try {
      process.waitFor();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return false;
    } 
    if (process.exitValue() == 0) {
      String str = Zkb.ZG(process.getInputStream().readAllBytes());
      return str.trim().startsWith(a(-23355, -22728));
    } 
    Zuh.Zb(false, Zqf.Zr);
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'x­Ò²S+°{ßûªTÂtÊFHµ}ÎÑÀi¹Ú*ôã¥^ëÈñë)Ùºàê·Üf@, ?}¿d)@÷Lä-º/gÆz\\n7Ä3!°&'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_3
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 141
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 22
    //   66: ldc 'mÏø3ÁËê'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #6
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #12
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/Zo.a : [Ljava/lang/String;
    //   130: bipush #17
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/Zo.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_2
    //   213: goto -> 243
    //   216: bipush #105
    //   218: goto -> 243
    //   221: bipush #79
    //   223: goto -> 243
    //   226: bipush #101
    //   228: goto -> 243
    //   231: bipush #55
    //   233: goto -> 243
    //   236: bipush #36
    //   238: goto -> 243
    //   241: bipush #95
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 38, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA4C7) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\Zo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */