package META-INF.versions.9.org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.util.Arrays;

public class SPHINCSPrivateKeyParameters extends SPHINCSKeyParameters {
  private final byte[] keyData;
  
  public SPHINCSPrivateKeyParameters(byte[] paramArrayOfbyte) {
    super(true, null);
    this.keyData = Arrays.clone(paramArrayOfbyte);
  }
  
  public SPHINCSPrivateKeyParameters(byte[] paramArrayOfbyte, String paramString) {
    super(true, paramString);
    this.keyData = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getKeyData() {
    return Arrays.clone(this.keyData);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\sphincs\SPHINCSPrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */