package META-INF.versions.9.org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;

public class RandUtils {
  static int nextInt(SecureRandom paramSecureRandom, int paramInt) {
    if ((paramInt & -paramInt) == paramInt)
      return (int)(paramInt * (paramSecureRandom.nextInt() >>> 1) >> 31L); 
    while (true) {
      int i = paramSecureRandom.nextInt() >>> 1;
      int j = i % paramInt;
      if (i - j + paramInt - 1 >= 0)
        return j; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\legacy\math\linearalgebra\RandUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */