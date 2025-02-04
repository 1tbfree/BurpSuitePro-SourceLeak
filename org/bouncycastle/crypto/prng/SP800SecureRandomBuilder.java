package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.HMacSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.HashSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;
import org.bouncycastle.util.Arrays;

public class SP800SecureRandomBuilder {
  private final SecureRandom random;
  
  private final EntropySourceProvider entropySourceProvider;
  
  private byte[] personalizationString;
  
  private int securityStrength = 256;
  
  private int entropyBitsRequired = 256;
  
  public SP800SecureRandomBuilder() {
    this(CryptoServicesRegistrar.getSecureRandom(), false);
  }
  
  public SP800SecureRandomBuilder(SecureRandom paramSecureRandom, boolean paramBoolean) {
    this.random = paramSecureRandom;
    this.entropySourceProvider = new BasicEntropySourceProvider(this.random, paramBoolean);
  }
  
  public SP800SecureRandomBuilder(EntropySourceProvider paramEntropySourceProvider) {
    this.random = null;
    this.entropySourceProvider = paramEntropySourceProvider;
  }
  
  public SP800SecureRandomBuilder setPersonalizationString(byte[] paramArrayOfbyte) {
    this.personalizationString = Arrays.clone(paramArrayOfbyte);
    return this;
  }
  
  public SP800SecureRandomBuilder setSecurityStrength(int paramInt) {
    this.securityStrength = paramInt;
    return this;
  }
  
  public SP800SecureRandomBuilder setEntropyBitsRequired(int paramInt) {
    this.entropyBitsRequired = paramInt;
    return this;
  }
  
  public SP800SecureRandom buildHash(Digest paramDigest, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new HashDRBGProvider(paramDigest, paramArrayOfbyte, this.personalizationString, this.securityStrength), paramBoolean);
  }
  
  public SP800SecureRandom buildCTR(BlockCipher paramBlockCipher, int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new CTRDRBGProvider(paramBlockCipher, paramInt, paramArrayOfbyte, this.personalizationString, this.securityStrength), paramBoolean);
  }
  
  public SP800SecureRandom buildHMAC(Mac paramMac, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new HMacDRBGProvider(paramMac, paramArrayOfbyte, this.personalizationString, this.securityStrength), paramBoolean);
  }
  
  private static String getSimplifiedName(Digest paramDigest) {
    String str = paramDigest.getAlgorithmName();
    int i = str.indexOf('-');
    return (i > 0 && !str.startsWith("SHA3")) ? (str.substring(0, i) + str.substring(i + 1)) : str;
  }
  
  private static class CTRDRBGProvider implements DRBGProvider {
    private final BlockCipher blockCipher;
    
    private final int keySizeInBits;
    
    private final byte[] nonce;
    
    private final byte[] personalizationString;
    
    private final int securityStrength;
    
    public CTRDRBGProvider(BlockCipher param1BlockCipher, int param1Int1, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int2) {
      this.blockCipher = param1BlockCipher;
      this.keySizeInBits = param1Int1;
      this.nonce = param1ArrayOfbyte1;
      this.personalizationString = param1ArrayOfbyte2;
      this.securityStrength = param1Int2;
    }
    
    public String getAlgorithm() {
      return (this.blockCipher instanceof org.bouncycastle.crypto.engines.DESedeEngine) ? "CTR-DRBG-3KEY-TDES" : ("CTR-DRBG-" + this.blockCipher.getAlgorithmName() + this.keySizeInBits);
    }
    
    public SP80090DRBG get(EntropySource param1EntropySource) {
      return (SP80090DRBG)new CTRSP800DRBG(this.blockCipher, this.keySizeInBits, this.securityStrength, param1EntropySource, this.personalizationString, this.nonce);
    }
  }
  
  private static class HMacDRBGProvider implements DRBGProvider {
    private final Mac hMac;
    
    private final byte[] nonce;
    
    private final byte[] personalizationString;
    
    private final int securityStrength;
    
    public HMacDRBGProvider(Mac param1Mac, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      this.hMac = param1Mac;
      this.nonce = param1ArrayOfbyte1;
      this.personalizationString = param1ArrayOfbyte2;
      this.securityStrength = param1Int;
    }
    
    public String getAlgorithm() {
      return (this.hMac instanceof HMac) ? ("HMAC-DRBG-" + SP800SecureRandomBuilder.getSimplifiedName(((HMac)this.hMac).getUnderlyingDigest())) : ("HMAC-DRBG-" + this.hMac.getAlgorithmName());
    }
    
    public SP80090DRBG get(EntropySource param1EntropySource) {
      return (SP80090DRBG)new HMacSP800DRBG(this.hMac, this.securityStrength, param1EntropySource, this.personalizationString, this.nonce);
    }
  }
  
  private static class HashDRBGProvider implements DRBGProvider {
    private final Digest digest;
    
    private final byte[] nonce;
    
    private final byte[] personalizationString;
    
    private final int securityStrength;
    
    public HashDRBGProvider(Digest param1Digest, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, int param1Int) {
      this.digest = param1Digest;
      this.nonce = param1ArrayOfbyte1;
      this.personalizationString = param1ArrayOfbyte2;
      this.securityStrength = param1Int;
    }
    
    public String getAlgorithm() {
      return "HASH-DRBG-" + SP800SecureRandomBuilder.getSimplifiedName(this.digest);
    }
    
    public SP80090DRBG get(EntropySource param1EntropySource) {
      return (SP80090DRBG)new HashSP800DRBG(this.digest, this.securityStrength, param1EntropySource, this.personalizationString, this.nonce);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\prng\SP800SecureRandomBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */