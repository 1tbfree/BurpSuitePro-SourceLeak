package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2KeyGenerationParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2KeyPairGenerator;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2Parameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;

public class McElieceCCA2KeyPairGeneratorSpi extends KeyPairGenerator {
  private McElieceCCA2KeyPairGenerator kpg;
  
  public McElieceCCA2KeyPairGeneratorSpi() {
    super("McEliece-CCA2");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    this.kpg = new McElieceCCA2KeyPairGenerator();
    McElieceCCA2KeyGenParameterSpec mcElieceCCA2KeyGenParameterSpec = (McElieceCCA2KeyGenParameterSpec)paramAlgorithmParameterSpec;
    McElieceCCA2KeyGenerationParameters mcElieceCCA2KeyGenerationParameters = new McElieceCCA2KeyGenerationParameters(paramSecureRandom, new McElieceCCA2Parameters(mcElieceCCA2KeyGenParameterSpec.getM(), mcElieceCCA2KeyGenParameterSpec.getT(), mcElieceCCA2KeyGenParameterSpec.getDigest()));
    this.kpg.init((KeyGenerationParameters)mcElieceCCA2KeyGenerationParameters);
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec) throws InvalidAlgorithmParameterException {
    this.kpg = new McElieceCCA2KeyPairGenerator();
    McElieceCCA2KeyGenParameterSpec mcElieceCCA2KeyGenParameterSpec = (McElieceCCA2KeyGenParameterSpec)paramAlgorithmParameterSpec;
    McElieceCCA2KeyGenerationParameters mcElieceCCA2KeyGenerationParameters = new McElieceCCA2KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new McElieceCCA2Parameters(mcElieceCCA2KeyGenParameterSpec.getM(), mcElieceCCA2KeyGenParameterSpec.getT(), mcElieceCCA2KeyGenParameterSpec.getDigest()));
    this.kpg.init((KeyGenerationParameters)mcElieceCCA2KeyGenerationParameters);
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    this.kpg = new McElieceCCA2KeyPairGenerator();
    McElieceCCA2KeyGenerationParameters mcElieceCCA2KeyGenerationParameters = new McElieceCCA2KeyGenerationParameters(paramSecureRandom, new McElieceCCA2Parameters());
    this.kpg.init((KeyGenerationParameters)mcElieceCCA2KeyGenerationParameters);
  }
  
  public KeyPair generateKeyPair() {
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.kpg.generateKeyPair();
    McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    return new KeyPair(new BCMcElieceCCA2PublicKey(mcElieceCCA2PublicKeyParameters), new BCMcElieceCCA2PrivateKey(mcElieceCCA2PrivateKeyParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\mceliece\McElieceCCA2KeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */