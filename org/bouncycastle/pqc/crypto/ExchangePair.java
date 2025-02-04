package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

public class ExchangePair {
  private final AsymmetricKeyParameter publicKey;
  
  private final byte[] shared;
  
  public ExchangePair(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte) {
    this.publicKey = paramAsymmetricKeyParameter;
    this.shared = Arrays.clone(paramArrayOfbyte);
  }
  
  public AsymmetricKeyParameter getPublicKey() {
    return this.publicKey;
  }
  
  public byte[] getSharedValue() {
    return Arrays.clone(this.shared);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ExchangePair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */