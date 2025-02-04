package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.HC256Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class HC256 {
  public static class AlgParams extends IvAlgorithmParameters {
    protected String engineToString() {
      return "HC256 IV";
    }
  }
  
  public static class Base extends BaseStreamCipher {
    public Base() {
      super((StreamCipher)new HC256Engine(), 32);
    }
  }
  
  public static class KeyGen extends BaseKeyGenerator {
    public KeyGen() {
      super("HC256", 256, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends AlgorithmProvider {
    private static final String PREFIX = HC256.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("Cipher.HC256", PREFIX + "$Base");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.HC256", PREFIX + "$KeyGen");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.HC256", PREFIX + "$AlgParams");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetric\HC256.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */