package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.parsers.DHIESPublicKeyParser;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

public class IESCipher extends BaseCipherSpi {
  private final JcaJceHelper helper = (JcaJceHelper)new BCJcaJceHelper();
  
  private final int ivLength;
  
  private IESEngine engine;
  
  private int state = -1;
  
  private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  
  private AlgorithmParameters engineParam = null;
  
  private IESParameterSpec engineSpec = null;
  
  private AsymmetricKeyParameter key;
  
  private SecureRandom random;
  
  private boolean dhaesMode = false;
  
  private AsymmetricKeyParameter otherKeyParameter = null;
  
  public IESCipher(IESEngine paramIESEngine) {
    this.engine = paramIESEngine;
    this.ivLength = 0;
  }
  
  public IESCipher(IESEngine paramIESEngine, int paramInt) {
    this.engine = paramIESEngine;
    this.ivLength = paramInt;
  }
  
  public int engineGetBlockSize() {
    BufferedBlockCipher bufferedBlockCipher = this.engine.getCipher();
    return (bufferedBlockCipher == null) ? 0 : bufferedBlockCipher.getBlockSize();
  }
  
  public int engineGetKeySize(Key paramKey) {
    if (paramKey instanceof DHKey)
      return ((DHKey)paramKey).getParams().getP().bitLength(); 
    throw new IllegalArgumentException("not a DH key");
  }
  
  public byte[] engineGetIV() {
    return (this.engineSpec != null) ? this.engineSpec.getNonce() : null;
  }
  
  public AlgorithmParameters engineGetParameters() {
    if (this.engineParam == null && this.engineSpec != null)
      try {
        this.engineParam = this.helper.createAlgorithmParameters("IES");
        this.engineParam.init((AlgorithmParameterSpec)this.engineSpec);
      } catch (Exception exception) {
        throw new RuntimeException(exception.toString());
      }  
    return this.engineParam;
  }
  
  public void engineSetMode(String paramString) throws NoSuchAlgorithmException {
    String str = Strings.toUpperCase(paramString);
    if (str.equals("NONE")) {
      this.dhaesMode = false;
    } else if (str.equals("DHAES")) {
      this.dhaesMode = true;
    } else {
      throw new IllegalArgumentException("can't support mode " + paramString);
    } 
  }
  
  public int engineGetOutputSize(int paramInt) {
    byte b;
    int j;
    if (this.key == null)
      throw new IllegalStateException("cipher not initialised"); 
    int i = this.engine.getMac().getMacSize();
    if (this.otherKeyParameter == null) {
      b = 1 + 2 * (((DHKeyParameters)this.key).getParameters().getP().bitLength() + 7) / 8;
    } else {
      b = 0;
    } 
    if (this.engine.getCipher() == null) {
      j = paramInt;
    } else if (this.state == 1 || this.state == 3) {
      j = this.engine.getCipher().getOutputSize(paramInt);
    } else if (this.state == 2 || this.state == 4) {
      j = this.engine.getCipher().getOutputSize(paramInt - i - b);
    } else {
      throw new IllegalStateException("cipher not initialised");
    } 
    if (this.state == 1 || this.state == 3)
      return this.buffer.size() + i + b + j; 
    if (this.state == 2 || this.state == 4)
      return this.buffer.size() - i - b + j; 
    throw new IllegalStateException("IESCipher not initialised");
  }
  
  public void engineSetPadding(String paramString) throws NoSuchPaddingException {
    String str = Strings.toUpperCase(paramString);
    if (str.equals("NOPADDING") || str.equals("PKCS5PADDING") || str.equals("PKCS7PADDING"))
      return; 
    throw new NoSuchPaddingException("padding not available with IESCipher");
  }
  
  public void engineInit(int paramInt, Key paramKey, AlgorithmParameters paramAlgorithmParameters, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    AlgorithmParameterSpec algorithmParameterSpec = null;
    if (paramAlgorithmParameters != null)
      try {
        algorithmParameterSpec = paramAlgorithmParameters.getParameterSpec((Class)IESParameterSpec.class);
      } catch (Exception exception) {
        throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + exception.toString());
      }  
    this.engineParam = paramAlgorithmParameters;
    engineInit(paramInt, paramKey, algorithmParameterSpec, paramSecureRandom);
  }
  
  public void engineInit(int paramInt, Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
    if (paramAlgorithmParameterSpec == null && this.ivLength == 0) {
      this.engineSpec = IESUtil.guessParameterSpec(this.engine.getCipher(), null);
    } else if (paramAlgorithmParameterSpec instanceof IESParameterSpec) {
      this.engineSpec = (IESParameterSpec)paramAlgorithmParameterSpec;
    } else {
      throw new InvalidAlgorithmParameterException("must be passed IES parameters");
    } 
    byte[] arrayOfByte = this.engineSpec.getNonce();
    if (this.ivLength != 0 && (arrayOfByte == null || arrayOfByte.length != this.ivLength))
      throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.ivLength + " bytes long"); 
    if (paramInt == 1 || paramInt == 3) {
      if (paramKey instanceof javax.crypto.interfaces.DHPublicKey) {
        this.key = DHUtil.generatePublicKeyParameter((PublicKey)paramKey);
      } else if (paramKey instanceof IESKey) {
        IESKey iESKey = (IESKey)paramKey;
        this.key = DHUtil.generatePublicKeyParameter(iESKey.getPublic());
        this.otherKeyParameter = DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
      } else {
        throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
      } 
    } else if (paramInt == 2 || paramInt == 4) {
      if (paramKey instanceof javax.crypto.interfaces.DHPrivateKey) {
        this.key = DHUtil.generatePrivateKeyParameter((PrivateKey)paramKey);
      } else if (paramKey instanceof IESKey) {
        IESKey iESKey = (IESKey)paramKey;
        this.otherKeyParameter = DHUtil.generatePublicKeyParameter(iESKey.getPublic());
        this.key = DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
      } else {
        throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
      } 
    } else {
      throw new InvalidKeyException("must be passed EC key");
    } 
    this.random = paramSecureRandom;
    this.state = paramInt;
    this.buffer.reset();
  }
  
  public void engineInit(int paramInt, Key paramKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    try {
      engineInit(paramInt, paramKey, (AlgorithmParameterSpec)null, paramSecureRandom);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new IllegalArgumentException("cannot handle supplied parameter spec: " + invalidAlgorithmParameterException.getMessage());
    } 
  }
  
  public byte[] engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.buffer.write(paramArrayOfbyte, paramInt1, paramInt2);
    return null;
  }
  
  public int engineUpdate(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    this.buffer.write(paramArrayOfbyte1, paramInt1, paramInt2);
    return 0;
  }
  
  public byte[] engineDoFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalBlockSizeException, BadPaddingException {
    ParametersWithIV parametersWithIV;
    if (paramInt2 != 0)
      this.buffer.write(paramArrayOfbyte, paramInt1, paramInt2); 
    byte[] arrayOfByte1 = this.buffer.toByteArray();
    this.buffer.reset();
    IESWithCipherParameters iESWithCipherParameters = new IESWithCipherParameters(this.engineSpec.getDerivationV(), this.engineSpec.getEncodingV(), this.engineSpec.getMacKeySize(), this.engineSpec.getCipherKeySize());
    byte[] arrayOfByte2 = this.engineSpec.getNonce();
    if (arrayOfByte2 != null)
      parametersWithIV = new ParametersWithIV((CipherParameters)iESWithCipherParameters, arrayOfByte2); 
    DHParameters dHParameters = ((DHKeyParameters)this.key).getParameters();
    if (this.otherKeyParameter != null)
      try {
        if (this.state == 1 || this.state == 3) {
          this.engine.init(true, (CipherParameters)this.otherKeyParameter, (CipherParameters)this.key, (CipherParameters)parametersWithIV);
        } else {
          this.engine.init(false, (CipherParameters)this.key, (CipherParameters)this.otherKeyParameter, (CipherParameters)parametersWithIV);
        } 
        return this.engine.processBlock(arrayOfByte1, 0, arrayOfByte1.length);
      } catch (Exception exception) {
        throw new BadBlockException("unable to process block", exception);
      }  
    if (this.state == 1 || this.state == 3) {
      DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
      dHKeyPairGenerator.init((KeyGenerationParameters)new DHKeyGenerationParameters(this.random, dHParameters));
      EphemeralKeyPairGenerator ephemeralKeyPairGenerator = new EphemeralKeyPairGenerator((AsymmetricCipherKeyPairGenerator)dHKeyPairGenerator, new KeyEncoder() {
            public byte[] getEncoded(AsymmetricKeyParameter param1AsymmetricKeyParameter) {
              byte[] arrayOfByte1 = new byte[(((DHKeyParameters)param1AsymmetricKeyParameter).getParameters().getP().bitLength() + 7) / 8];
              byte[] arrayOfByte2 = BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters)param1AsymmetricKeyParameter).getY());
              if (arrayOfByte2.length > arrayOfByte1.length)
                throw new IllegalArgumentException("Senders's public key longer than expected."); 
              System.arraycopy(arrayOfByte2, 0, arrayOfByte1, arrayOfByte1.length - arrayOfByte2.length, arrayOfByte2.length);
              return arrayOfByte1;
            }
          });
      try {
        this.engine.init(this.key, (CipherParameters)parametersWithIV, ephemeralKeyPairGenerator);
        return this.engine.processBlock(arrayOfByte1, 0, arrayOfByte1.length);
      } catch (Exception exception) {
        throw new BadBlockException("unable to process block", exception);
      } 
    } 
    if (this.state == 2 || this.state == 4)
      try {
        this.engine.init(this.key, (CipherParameters)parametersWithIV, (KeyParser)new DHIESPublicKeyParser(((DHKeyParameters)this.key).getParameters()));
        return this.engine.processBlock(arrayOfByte1, 0, arrayOfByte1.length);
      } catch (InvalidCipherTextException invalidCipherTextException) {
        throw new BadBlockException("unable to process block", invalidCipherTextException);
      }  
    throw new IllegalStateException("IESCipher not initialised");
  }
  
  public int engineDoFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
    byte[] arrayOfByte = engineDoFinal(paramArrayOfbyte1, paramInt1, paramInt2);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte2, paramInt3, arrayOfByte.length);
    return arrayOfByte.length;
  }
  
  public static class IES extends IESCipher {
    public IES() {
      super(new IESEngine((BasicAgreement)new DHBasicAgreement(), (DerivationFunction)new KDF2BytesGenerator(DigestFactory.createSHA1()), (Mac)new HMac(DigestFactory.createSHA1())));
    }
  }
  
  public static class IESwithAESCBC extends IESCipher {
    public IESwithAESCBC() {
      super(new IESEngine((BasicAgreement)new DHBasicAgreement(), (DerivationFunction)new KDF2BytesGenerator(DigestFactory.createSHA1()), (Mac)new HMac(DigestFactory.createSHA1()), (BufferedBlockCipher)new PaddedBufferedBlockCipher((BlockCipher)CBCBlockCipher.newInstance((BlockCipher)AESEngine.newInstance()))), 16);
    }
  }
  
  public static class IESwithDESedeCBC extends IESCipher {
    public IESwithDESedeCBC() {
      super(new IESEngine((BasicAgreement)new DHBasicAgreement(), (DerivationFunction)new KDF2BytesGenerator(DigestFactory.createSHA1()), (Mac)new HMac(DigestFactory.createSHA1()), (BufferedBlockCipher)new PaddedBufferedBlockCipher((BlockCipher)CBCBlockCipher.newInstance((BlockCipher)new DESedeEngine()))), 8);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\dh\IESCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */