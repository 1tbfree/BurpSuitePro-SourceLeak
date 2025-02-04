package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;

public class SP800SecureRandom extends SecureRandom {
  private final DRBGProvider drbgProvider;
  
  private final boolean predictionResistant;
  
  private final SecureRandom randomSource;
  
  private final EntropySource entropySource;
  
  private SP80090DRBG drbg;
  
  SP800SecureRandom(SecureRandom paramSecureRandom, EntropySource paramEntropySource, DRBGProvider paramDRBGProvider, boolean paramBoolean) {
    this.randomSource = paramSecureRandom;
    this.entropySource = paramEntropySource;
    this.drbgProvider = paramDRBGProvider;
    this.predictionResistant = paramBoolean;
  }
  
  public void setSeed(byte[] paramArrayOfbyte) {
    synchronized (this) {
      if (this.randomSource != null)
        this.randomSource.setSeed(paramArrayOfbyte); 
    } 
  }
  
  public void setSeed(long paramLong) {
    synchronized (this) {
      if (this.randomSource != null)
        this.randomSource.setSeed(paramLong); 
    } 
  }
  
  public String getAlgorithm() {
    return this.drbgProvider.getAlgorithm();
  }
  
  public void nextBytes(byte[] paramArrayOfbyte) {
    synchronized (this) {
      if (this.drbg == null)
        this.drbg = this.drbgProvider.get(this.entropySource); 
      if (this.drbg.generate(paramArrayOfbyte, null, this.predictionResistant) < 0) {
        this.drbg.reseed(null);
        this.drbg.generate(paramArrayOfbyte, null, this.predictionResistant);
      } 
    } 
  }
  
  public byte[] generateSeed(int paramInt) {
    return EntropyUtil.generateSeed(this.entropySource, paramInt);
  }
  
  public void reseed(byte[] paramArrayOfbyte) {
    synchronized (this) {
      if (this.drbg == null)
        this.drbg = this.drbgProvider.get(this.entropySource); 
      this.drbg.reseed(paramArrayOfbyte);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\prng\SP800SecureRandom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */