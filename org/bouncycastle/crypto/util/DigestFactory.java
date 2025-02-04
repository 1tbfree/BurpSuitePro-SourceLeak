package org.bouncycastle.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

public final class DigestFactory {
  private static final Map cloneMap = new HashMap<>();
  
  public static Digest createMD5() {
    return (Digest)new MD5Digest();
  }
  
  public static Digest createMD5PRF() {
    return (Digest)new MD5Digest();
  }
  
  public static Digest createSHA1() {
    return (Digest)new SHA1Digest();
  }
  
  public static Digest createSHA1PRF() {
    return (Digest)new SHA1Digest(CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA224() {
    return (Digest)new SHA224Digest();
  }
  
  public static Digest createSHA224PRF() {
    return (Digest)new SHA224Digest(CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA256() {
    return (Digest)SHA256Digest.newInstance();
  }
  
  public static Digest createSHA256PRF() {
    return (Digest)new SHA256Digest(CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA384() {
    return (Digest)new SHA384Digest();
  }
  
  public static Digest createSHA384PRF() {
    return (Digest)new SHA384Digest(CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA512() {
    return (Digest)new SHA512Digest();
  }
  
  public static Digest createSHA512PRF() {
    return (Digest)new SHA512Digest(CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA512_224() {
    return (Digest)new SHA512tDigest(224);
  }
  
  public static Digest createSHA512_224PRF() {
    return (Digest)new SHA512tDigest(224, CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA512_256() {
    return (Digest)new SHA512tDigest(256);
  }
  
  public static Digest createSHA512_256PRF() {
    return (Digest)new SHA512tDigest(256, CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA3_224() {
    return (Digest)new SHA3Digest(224);
  }
  
  public static Digest createSHA3_224PRF() {
    return (Digest)new SHA3Digest(224, CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA3_256() {
    return (Digest)new SHA3Digest(256);
  }
  
  public static Digest createSHA3_256PRF() {
    return (Digest)new SHA3Digest(256, CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA3_384() {
    return (Digest)new SHA3Digest(384);
  }
  
  public static Digest createSHA3_384PRF() {
    return (Digest)new SHA3Digest(384, CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHA3_512() {
    return (Digest)new SHA3Digest(512);
  }
  
  public static Digest createSHA3_512PRF() {
    return (Digest)new SHA3Digest(512, CryptoServicePurpose.PRF);
  }
  
  public static Digest createSHAKE128() {
    return (Digest)new SHAKEDigest(128);
  }
  
  public static Digest createSHAKE256() {
    return (Digest)new SHAKEDigest(256);
  }
  
  public static Digest cloneDigest(Digest paramDigest) {
    return ((Cloner)cloneMap.get(paramDigest.getAlgorithmName())).createClone(paramDigest);
  }
  
  static {
    cloneMap.put(createMD5().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new MD5Digest((MD5Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA1().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new MD5Digest((MD5Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA224().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA224Digest((SHA224Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA256().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)SHA256Digest.newInstance(param1Digest);
          }
        });
    cloneMap.put(createSHA384().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA384Digest((SHA384Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA512().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA512Digest((SHA512Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA3_224().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA3Digest((SHA3Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA3_256().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA3Digest((SHA3Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA3_384().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA3Digest((SHA3Digest)param1Digest);
          }
        });
    cloneMap.put(createSHA3_512().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHA3Digest((SHA3Digest)param1Digest);
          }
        });
    cloneMap.put(createSHAKE128().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHAKEDigest((SHAKEDigest)param1Digest);
          }
        });
    cloneMap.put(createSHAKE256().getAlgorithmName(), new Cloner() {
          public Digest createClone(Digest param1Digest) {
            return (Digest)new SHAKEDigest((SHAKEDigest)param1Digest);
          }
        });
  }
  
  private static interface Cloner {
    Digest createClone(Digest param1Digest);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypt\\util\DigestFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */