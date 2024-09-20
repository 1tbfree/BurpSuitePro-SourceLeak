package META-INF.versions.9.org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DHValidationParameters {
  private byte[] seed;
  
  private int counter;
  
  public DHValidationParameters(byte[] paramArrayOfbyte, int paramInt) {
    this.seed = Arrays.clone(paramArrayOfbyte);
    this.counter = paramInt;
  }
  
  public int getCounter() {
    return this.counter;
  }
  
  public byte[] getSeed() {
    return Arrays.clone(this.seed);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof org.bouncycastle.crypto.params.DHValidationParameters))
      return false; 
    org.bouncycastle.crypto.params.DHValidationParameters dHValidationParameters = (org.bouncycastle.crypto.params.DHValidationParameters)paramObject;
    return (dHValidationParameters.counter != this.counter) ? false : Arrays.areEqual(this.seed, dHValidationParameters.seed);
  }
  
  public int hashCode() {
    return this.counter ^ Arrays.hashCode(this.seed);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\params\DHValidationParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */