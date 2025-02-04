package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

public class MD4 {
  public static class Digest extends BCMessageDigest implements Cloneable {
    public Digest() {
      super((org.bouncycastle.crypto.Digest)new MD4Digest());
    }
    
    public Object clone() throws CloneNotSupportedException {
      Digest digest = (Digest)super.clone();
      digest.digest = (org.bouncycastle.crypto.Digest)new MD4Digest((MD4Digest)this.digest);
      return digest;
    }
  }
  
  public static class HashMac extends BaseMac {
    public HashMac() {
      super((Mac)new HMac((org.bouncycastle.crypto.Digest)new MD4Digest()));
    }
  }
  
  public static class KeyGenerator extends BaseKeyGenerator {
    public KeyGenerator() {
      super("HMACMD4", 128, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX = MD4.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("MessageDigest.MD4", PREFIX + "$Digest");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + PKCSObjectIdentifiers.md4, "MD4");
      addHMACAlgorithm(param1ConfigurableProvider, "MD4", PREFIX + "$HashMac", PREFIX + "$KeyGenerator");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\digest\MD4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */