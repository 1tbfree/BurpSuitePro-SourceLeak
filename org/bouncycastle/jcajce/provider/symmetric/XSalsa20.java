package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.XSalsa20Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class XSalsa20 {
  public static class AlgParams extends IvAlgorithmParameters {
    protected String engineToString() {
      return "XSalsa20 IV";
    }
  }
  
  public static class Base extends BaseStreamCipher {
    public Base() {
      super((StreamCipher)new XSalsa20Engine(), 24);
    }
  }
  
  public static class KeyGen extends BaseKeyGenerator {
    public KeyGen() {
      super("XSalsa20", 256, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends AlgorithmProvider {
    private static final String PREFIX = XSalsa20.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("Cipher.XSALSA20", PREFIX + "$Base");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.XSALSA20", PREFIX + "$KeyGen");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.XSALSA20", PREFIX + "$AlgParams");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetric\XSalsa20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */