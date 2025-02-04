package org.bouncycastle.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.util.Integers;

public class PBKDF2Config extends PBKDFConfig {
  public static final AlgorithmIdentifier PRF_SHA1 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA1, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA256 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA512 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_256, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA3_512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, (ASN1Encodable)DERNull.INSTANCE);
  
  private static final Map PRFS_SALT = new HashMap<>();
  
  private final int iterationCount;
  
  private final int saltLength;
  
  private final AlgorithmIdentifier prf;
  
  static int getSaltSize(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (!PRFS_SALT.containsKey(paramASN1ObjectIdentifier))
      throw new IllegalStateException("no salt size for algorithm: " + paramASN1ObjectIdentifier); 
    return ((Integer)PRFS_SALT.get(paramASN1ObjectIdentifier)).intValue();
  }
  
  private PBKDF2Config(Builder paramBuilder) {
    super(PKCSObjectIdentifiers.id_PBKDF2);
    this.iterationCount = paramBuilder.iterationCount;
    this.prf = paramBuilder.prf;
    if (paramBuilder.saltLength < 0) {
      this.saltLength = getSaltSize(this.prf.getAlgorithm());
    } else {
      this.saltLength = paramBuilder.saltLength;
    } 
  }
  
  public int getIterationCount() {
    return this.iterationCount;
  }
  
  public AlgorithmIdentifier getPRF() {
    return this.prf;
  }
  
  public int getSaltLength() {
    return this.saltLength;
  }
  
  static {
    PRFS_SALT.put(PKCSObjectIdentifiers.id_hmacWithSHA1, Integers.valueOf(20));
    PRFS_SALT.put(PKCSObjectIdentifiers.id_hmacWithSHA256, Integers.valueOf(32));
    PRFS_SALT.put(PKCSObjectIdentifiers.id_hmacWithSHA512, Integers.valueOf(64));
    PRFS_SALT.put(PKCSObjectIdentifiers.id_hmacWithSHA224, Integers.valueOf(28));
    PRFS_SALT.put(PKCSObjectIdentifiers.id_hmacWithSHA384, Integers.valueOf(48));
    PRFS_SALT.put(NISTObjectIdentifiers.id_hmacWithSHA3_224, Integers.valueOf(28));
    PRFS_SALT.put(NISTObjectIdentifiers.id_hmacWithSHA3_256, Integers.valueOf(32));
    PRFS_SALT.put(NISTObjectIdentifiers.id_hmacWithSHA3_384, Integers.valueOf(48));
    PRFS_SALT.put(NISTObjectIdentifiers.id_hmacWithSHA3_512, Integers.valueOf(64));
    PRFS_SALT.put(CryptoProObjectIdentifiers.gostR3411Hmac, Integers.valueOf(32));
    PRFS_SALT.put(RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256, Integers.valueOf(32));
    PRFS_SALT.put(RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512, Integers.valueOf(64));
    PRFS_SALT.put(GMObjectIdentifiers.hmac_sm3, Integers.valueOf(32));
  }
  
  public static class Builder {
    private int iterationCount = 1024;
    
    private int saltLength = -1;
    
    private AlgorithmIdentifier prf = PBKDF2Config.PRF_SHA1;
    
    public Builder withIterationCount(int param1Int) {
      this.iterationCount = param1Int;
      return this;
    }
    
    public Builder withPRF(AlgorithmIdentifier param1AlgorithmIdentifier) {
      this.prf = param1AlgorithmIdentifier;
      return this;
    }
    
    public Builder withSaltLength(int param1Int) {
      this.saltLength = param1Int;
      return this;
    }
    
    public PBKDF2Config build() {
      return new PBKDF2Config(this);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypt\\util\PBKDF2Config.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */