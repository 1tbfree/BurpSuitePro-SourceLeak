package META-INF.versions.9.org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter {
  private String params;
  
  public McElieceCCA2KeyParameters(boolean paramBoolean, String paramString) {
    super(paramBoolean);
    this.params = paramString;
  }
  
  public String getDigest() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\legacy\crypto\mceliece\McElieceCCA2KeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */