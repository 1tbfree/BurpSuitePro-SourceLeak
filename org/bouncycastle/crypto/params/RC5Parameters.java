package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class RC5Parameters implements CipherParameters {
  private byte[] key;
  
  private int rounds;
  
  public RC5Parameters(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length > 255)
      throw new IllegalArgumentException("RC5 key length can be no greater than 255"); 
    this.key = new byte[paramArrayOfbyte.length];
    this.rounds = paramInt;
    System.arraycopy(paramArrayOfbyte, 0, this.key, 0, paramArrayOfbyte.length);
  }
  
  public byte[] getKey() {
    return this.key;
  }
  
  public int getRounds() {
    return this.rounds;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\RC5Parameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */