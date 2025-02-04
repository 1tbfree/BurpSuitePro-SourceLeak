package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

public class ParametersWithRandom implements CipherParameters {
  private SecureRandom random;
  
  private CipherParameters parameters;
  
  public ParametersWithRandom(CipherParameters paramCipherParameters, SecureRandom paramSecureRandom) {
    this.random = CryptoServicesRegistrar.getSecureRandom(paramSecureRandom);
    this.parameters = paramCipherParameters;
  }
  
  public ParametersWithRandom(CipherParameters paramCipherParameters) {
    this(paramCipherParameters, null);
  }
  
  public SecureRandom getRandom() {
    return this.random;
  }
  
  public CipherParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\ParametersWithRandom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */