package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.Grainv1Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class Grainv1 {
  public static class AlgParams extends IvAlgorithmParameters {
    protected String engineToString() {
      return "Grainv1 IV";
    }
  }
  
  public static class Base extends BaseStreamCipher {
    public Base() {
      super((StreamCipher)new Grainv1Engine(), 8);
    }
  }
  
  public static class KeyGen extends BaseKeyGenerator {
    public KeyGen() {
      super("Grainv1", 80, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends AlgorithmProvider {
    private static final String PREFIX = Grainv1.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("Cipher.Grainv1", PREFIX + "$Base");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.Grainv1", PREFIX + "$KeyGen");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.Grainv1", PREFIX + "$AlgParams");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetric\Grainv1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */