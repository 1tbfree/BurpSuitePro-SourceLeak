package META-INF.versions.9.org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

public class MGFParameters implements DerivationParameters {
  byte[] seed;
  
  public MGFParameters(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public MGFParameters(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.seed = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, this.seed, 0, paramInt2);
  }
  
  public byte[] getSeed() {
    return this.seed;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\params\MGFParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */