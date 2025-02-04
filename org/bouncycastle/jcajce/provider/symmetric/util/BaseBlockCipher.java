package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.fpe.FPEEngine;
import org.bouncycastle.crypto.fpe.FPEFF1Engine;
import org.bouncycastle.crypto.fpe.FPEFF3_1Engine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PBKDF1KeyWithParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.FPEParameterSpec;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BaseBlockCipher extends BaseWrapCipher implements PBE {
  private static final int BUF_SIZE = 512;
  
  private static final Class[] availableSpecs = new Class[] { RC2ParameterSpec.class, RC5ParameterSpec.class, GcmSpecUtil.gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class };
  
  private BlockCipher baseEngine;
  
  private BlockCipherProvider engineProvider;
  
  private GenericBlockCipher cipher;
  
  private ParametersWithIV ivParam;
  
  private AEADParameters aeadParams;
  
  private int keySizeInBits;
  
  private int scheme = -1;
  
  private int digest;
  
  private int ivLength = 0;
  
  private boolean padded;
  
  private boolean fixedIv = true;
  
  private PBEParameterSpec pbeSpec = null;
  
  private String pbeAlgorithm = null;
  
  private String modeName = null;
  
  protected BaseBlockCipher(BlockCipher paramBlockCipher) {
    this.baseEngine = paramBlockCipher;
    this.cipher = new BufferedGenericBlockCipher(paramBlockCipher);
  }
  
  protected BaseBlockCipher(BlockCipher paramBlockCipher, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.baseEngine = paramBlockCipher;
    this.scheme = paramInt1;
    this.digest = paramInt2;
    this.keySizeInBits = paramInt3;
    this.ivLength = paramInt4;
    this.cipher = new BufferedGenericBlockCipher(paramBlockCipher);
  }
  
  protected BaseBlockCipher(BlockCipherProvider paramBlockCipherProvider) {
    this.baseEngine = paramBlockCipherProvider.get();
    this.engineProvider = paramBlockCipherProvider;
    this.cipher = new BufferedGenericBlockCipher(paramBlockCipherProvider.get());
  }
  
  protected BaseBlockCipher(AEADBlockCipher paramAEADBlockCipher) {
    this.baseEngine = paramAEADBlockCipher.getUnderlyingCipher();
    if (paramAEADBlockCipher.getAlgorithmName().indexOf("GCM") >= 0) {
      this.ivLength = 12;
    } else {
      this.ivLength = this.baseEngine.getBlockSize();
    } 
    this.cipher = new AEADGenericBlockCipher((AEADCipher)paramAEADBlockCipher);
  }
  
  protected BaseBlockCipher(AEADCipher paramAEADCipher, boolean paramBoolean, int paramInt) {
    this.baseEngine = null;
    this.fixedIv = paramBoolean;
    this.ivLength = paramInt;
    this.cipher = new AEADGenericBlockCipher(paramAEADCipher);
  }
  
  protected BaseBlockCipher(AEADBlockCipher paramAEADBlockCipher, boolean paramBoolean, int paramInt) {
    this.baseEngine = paramAEADBlockCipher.getUnderlyingCipher();
    this.fixedIv = paramBoolean;
    this.ivLength = paramInt;
    this.cipher = new AEADGenericBlockCipher((AEADCipher)paramAEADBlockCipher);
  }
  
  protected BaseBlockCipher(BlockCipher paramBlockCipher, int paramInt) {
    this(paramBlockCipher, true, paramInt);
  }
  
  protected BaseBlockCipher(BlockCipher paramBlockCipher, boolean paramBoolean, int paramInt) {
    this.baseEngine = paramBlockCipher;
    this.fixedIv = paramBoolean;
    this.cipher = new BufferedGenericBlockCipher(paramBlockCipher);
    this.ivLength = paramInt / 8;
  }
  
  protected BaseBlockCipher(BufferedBlockCipher paramBufferedBlockCipher, int paramInt) {
    this(paramBufferedBlockCipher, true, paramInt);
  }
  
  protected BaseBlockCipher(BufferedBlockCipher paramBufferedBlockCipher, boolean paramBoolean, int paramInt) {
    this.baseEngine = paramBufferedBlockCipher.getUnderlyingCipher();
    this.cipher = new BufferedGenericBlockCipher(paramBufferedBlockCipher);
    this.fixedIv = paramBoolean;
    this.ivLength = paramInt / 8;
  }
  
  protected int engineGetBlockSize() {
    return (this.baseEngine == null) ? -1 : this.baseEngine.getBlockSize();
  }
  
  protected byte[] engineGetIV() {
    return (this.aeadParams != null) ? this.aeadParams.getNonce() : ((this.ivParam != null) ? this.ivParam.getIV() : null);
  }
  
  protected int engineGetKeySize(Key paramKey) {
    return (paramKey.getEncoded()).length * 8;
  }
  
  protected int engineGetOutputSize(int paramInt) {
    return this.cipher.getOutputSize(paramInt);
  }
  
  protected AlgorithmParameters engineGetParameters() {
    if (this.engineParams == null)
      if (this.pbeSpec != null) {
        try {
          this.engineParams = createParametersInstance(this.pbeAlgorithm);
          this.engineParams.init(this.pbeSpec);
        } catch (Exception exception) {
          return null;
        } 
      } else if (this.aeadParams != null) {
        if (this.baseEngine == null) {
          try {
            this.engineParams = createParametersInstance(PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305.getId());
            this.engineParams.init((new DEROctetString(this.aeadParams.getNonce())).getEncoded());
          } catch (Exception exception) {
            throw new RuntimeException(exception.toString());
          } 
        } else {
          try {
            this.engineParams = createParametersInstance("GCM");
            this.engineParams.init((new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8)).getEncoded());
          } catch (Exception exception) {
            throw new RuntimeException(exception.toString());
          } 
        } 
      } else if (this.ivParam != null) {
        String str = this.cipher.getUnderlyingCipher().getAlgorithmName();
        if (str.indexOf('/') >= 0)
          str = str.substring(0, str.indexOf('/')); 
        try {
          this.engineParams = createParametersInstance(str);
          this.engineParams.init(new IvParameterSpec(this.ivParam.getIV()));
        } catch (Exception exception) {
          throw new RuntimeException(exception.toString());
        } 
      }  
    return this.engineParams;
  }
  
  protected void engineSetMode(String paramString) throws NoSuchAlgorithmException {
    if (this.baseEngine == null)
      throw new NoSuchAlgorithmException("no mode supported for this algorithm"); 
    this.modeName = Strings.toUpperCase(paramString);
    if (this.modeName.equals("ECB")) {
      this.ivLength = 0;
      this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
    } else if (this.modeName.equals("CBC")) {
      this.ivLength = this.baseEngine.getBlockSize();
      this.cipher = new BufferedGenericBlockCipher((BlockCipher)CBCBlockCipher.newInstance(this.baseEngine));
    } else if (this.modeName.startsWith("OFB")) {
      this.ivLength = this.baseEngine.getBlockSize();
      if (this.modeName.length() != 3) {
        int i = Integer.parseInt(this.modeName.substring(3));
        this.cipher = new BufferedGenericBlockCipher((BlockCipher)new OFBBlockCipher(this.baseEngine, i));
      } else {
        this.cipher = new BufferedGenericBlockCipher((BlockCipher)new OFBBlockCipher(this.baseEngine, 8 * this.baseEngine.getBlockSize()));
      } 
    } else if (this.modeName.startsWith("CFB")) {
      this.ivLength = this.baseEngine.getBlockSize();
      if (this.modeName.length() != 3) {
        int i = Integer.parseInt(this.modeName.substring(3));
        this.cipher = new BufferedGenericBlockCipher((BlockCipher)CFBBlockCipher.newInstance(this.baseEngine, i));
      } else {
        this.cipher = new BufferedGenericBlockCipher((BlockCipher)CFBBlockCipher.newInstance(this.baseEngine, 8 * this.baseEngine.getBlockSize()));
      } 
    } else if (this.modeName.startsWith("PGPCFB")) {
      boolean bool = this.modeName.equals("PGPCFBWITHIV");
      if (!bool && this.modeName.length() != 6)
        throw new NoSuchAlgorithmException("no mode support for " + this.modeName); 
      this.ivLength = this.baseEngine.getBlockSize();
      this.cipher = new BufferedGenericBlockCipher((BlockCipher)new PGPCFBBlockCipher(this.baseEngine, bool));
    } else if (this.modeName.equals("OPENPGPCFB")) {
      this.ivLength = 0;
      this.cipher = new BufferedGenericBlockCipher((BlockCipher)new OpenPGPCFBBlockCipher(this.baseEngine));
    } else if (this.modeName.equals("FF1")) {
      this.ivLength = 0;
      this.cipher = new BufferedFPEBlockCipher((FPEEngine)new FPEFF1Engine(this.baseEngine));
    } else if (this.modeName.equals("FF3-1")) {
      this.ivLength = 0;
      this.cipher = new BufferedFPEBlockCipher((FPEEngine)new FPEFF3_1Engine(this.baseEngine));
    } else if (this.modeName.equals("SIC")) {
      this.ivLength = this.baseEngine.getBlockSize();
      if (this.ivLength < 16)
        throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)"); 
      this.fixedIv = false;
      this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new DefaultBufferedBlockCipher((BlockCipher)SICBlockCipher.newInstance(this.baseEngine)));
    } else if (this.modeName.equals("CTR")) {
      this.ivLength = this.baseEngine.getBlockSize();
      this.fixedIv = false;
      if (this.baseEngine instanceof org.bouncycastle.crypto.engines.DSTU7624Engine) {
        this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new DefaultBufferedBlockCipher((BlockCipher)new KCTRBlockCipher(this.baseEngine)));
      } else {
        this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new DefaultBufferedBlockCipher((BlockCipher)SICBlockCipher.newInstance(this.baseEngine)));
      } 
    } else if (this.modeName.equals("GOFB")) {
      this.ivLength = this.baseEngine.getBlockSize();
      this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new DefaultBufferedBlockCipher((BlockCipher)new GOFBBlockCipher(this.baseEngine)));
    } else if (this.modeName.equals("GCFB")) {
      this.ivLength = this.baseEngine.getBlockSize();
      this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new DefaultBufferedBlockCipher((BlockCipher)new GCFBBlockCipher(this.baseEngine)));
    } else if (this.modeName.equals("CTS")) {
      this.ivLength = this.baseEngine.getBlockSize();
      this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new CTSBlockCipher((BlockCipher)CBCBlockCipher.newInstance(this.baseEngine)));
    } else if (this.modeName.equals("CCM")) {
      this.ivLength = 12;
      if (this.baseEngine instanceof org.bouncycastle.crypto.engines.DSTU7624Engine) {
        this.cipher = new AEADGenericBlockCipher((AEADCipher)new KCCMBlockCipher(this.baseEngine));
      } else {
        this.cipher = new AEADGenericBlockCipher((AEADCipher)CCMBlockCipher.newInstance(this.baseEngine));
      } 
    } else if (this.modeName.equals("OCB")) {
      if (this.engineProvider != null) {
        this.ivLength = 15;
        this.cipher = new AEADGenericBlockCipher((AEADCipher)new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
      } else {
        throw new NoSuchAlgorithmException("can't support mode " + paramString);
      } 
    } else if (this.modeName.equals("EAX")) {
      this.ivLength = this.baseEngine.getBlockSize();
      this.cipher = new AEADGenericBlockCipher((AEADCipher)new EAXBlockCipher(this.baseEngine));
    } else if (this.modeName.equals("GCM-SIV")) {
      this.ivLength = 12;
      this.cipher = new AEADGenericBlockCipher((AEADCipher)new GCMSIVBlockCipher(this.baseEngine));
    } else if (this.modeName.equals("GCM")) {
      if (this.baseEngine instanceof org.bouncycastle.crypto.engines.DSTU7624Engine) {
        this.ivLength = this.baseEngine.getBlockSize();
        this.cipher = new AEADGenericBlockCipher((AEADCipher)new KGCMBlockCipher(this.baseEngine));
      } else {
        this.ivLength = 12;
        this.cipher = new AEADGenericBlockCipher((AEADCipher)GCMBlockCipher.newInstance(this.baseEngine));
      } 
    } else {
      throw new NoSuchAlgorithmException("can't support mode " + paramString);
    } 
  }
  
  protected void engineSetPadding(String paramString) throws NoSuchPaddingException {
    if (this.baseEngine == null)
      throw new NoSuchPaddingException("no padding supported for this algorithm"); 
    String str = Strings.toUpperCase(paramString);
    if (str.equals("NOPADDING")) {
      if (this.cipher.wrapOnNoPadding())
        this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new DefaultBufferedBlockCipher(this.cipher.getUnderlyingCipher())); 
    } else if (str.equals("WITHCTS") || str.equals("CTSPADDING") || str.equals("CS3PADDING")) {
      this.cipher = new BufferedGenericBlockCipher((BufferedBlockCipher)new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
    } else {
      this.padded = true;
      if (isAEADModeName(this.modeName))
        throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes."); 
      if (str.equals("PKCS5PADDING") || str.equals("PKCS7PADDING")) {
        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
      } else if (str.equals("ZEROBYTEPADDING")) {
        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), (BlockCipherPadding)new ZeroBytePadding());
      } else if (str.equals("ISO10126PADDING") || str.equals("ISO10126-2PADDING")) {
        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), (BlockCipherPadding)new ISO10126d2Padding());
      } else if (str.equals("X9.23PADDING") || str.equals("X923PADDING")) {
        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), (BlockCipherPadding)new X923Padding());
      } else if (str.equals("ISO7816-4PADDING") || str.equals("ISO9797-1PADDING")) {
        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), (BlockCipherPadding)new ISO7816d4Padding());
      } else if (str.equals("TBCPADDING")) {
        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), (BlockCipherPadding)new TBCPadding());
      } else {
        throw new NoSuchPaddingException("Padding " + paramString + " unknown.");
      } 
    } 
  }
  
  protected void engineInit(int paramInt, Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    ParametersWithIV parametersWithIV2;
    AEADParameters aEADParameters;
    ParametersWithIV parametersWithIV1;
    ParametersWithRandom parametersWithRandom;
    this.pbeSpec = null;
    this.pbeAlgorithm = null;
    this.engineParams = null;
    this.aeadParams = null;
    if (!(paramKey instanceof SecretKey))
      throw new InvalidKeyException("Key for algorithm " + ((paramKey != null) ? paramKey.getAlgorithm() : null) + " not suitable for symmetric enryption."); 
    if (paramAlgorithmParameterSpec == null && this.baseEngine != null && this.baseEngine.getAlgorithmName().startsWith("RC5-64"))
      throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in."); 
    if (this.scheme == 2 || paramKey instanceof org.bouncycastle.jcajce.PKCS12Key) {
      SecretKey secretKey;
      try {
        secretKey = (SecretKey)paramKey;
      } catch (Exception exception) {
        throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
      } 
      if (paramAlgorithmParameterSpec instanceof PBEParameterSpec)
        this.pbeSpec = (PBEParameterSpec)paramAlgorithmParameterSpec; 
      if (secretKey instanceof PBEKey && this.pbeSpec == null) {
        PBEKey pBEKey = (PBEKey)secretKey;
        if (pBEKey.getSalt() == null)
          throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt"); 
        this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
      } 
      if (this.pbeSpec == null && !(secretKey instanceof PBEKey))
        throw new InvalidKeyException("Algorithm requires a PBE key"); 
      if (paramKey instanceof BCPBEKey) {
        CipherParameters cipherParameters = ((BCPBEKey)paramKey).getParam();
        if (cipherParameters instanceof ParametersWithIV) {
          parametersWithIV2 = (ParametersWithIV)cipherParameters;
        } else if (cipherParameters == null) {
          parametersWithIV2 = (ParametersWithIV)PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
        } else {
          throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
        } 
      } else {
        parametersWithIV2 = (ParametersWithIV)PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
      } 
      if (parametersWithIV2 instanceof ParametersWithIV)
        this.ivParam = parametersWithIV2; 
    } else if (paramKey instanceof PBKDF1Key) {
      PBKDF1Key pBKDF1Key = (PBKDF1Key)paramKey;
      if (paramAlgorithmParameterSpec instanceof PBEParameterSpec)
        this.pbeSpec = (PBEParameterSpec)paramAlgorithmParameterSpec; 
      if (pBKDF1Key instanceof PBKDF1KeyWithParameters && this.pbeSpec == null)
        this.pbeSpec = new PBEParameterSpec(((PBKDF1KeyWithParameters)pBKDF1Key).getSalt(), ((PBKDF1KeyWithParameters)pBKDF1Key).getIterationCount()); 
      parametersWithIV2 = (ParametersWithIV)PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
      if (parametersWithIV2 instanceof ParametersWithIV)
        this.ivParam = parametersWithIV2; 
    } else if (paramKey instanceof BCPBEKey) {
      BCPBEKey bCPBEKey = (BCPBEKey)paramKey;
      if (bCPBEKey.getOID() != null) {
        this.pbeAlgorithm = bCPBEKey.getOID().getId();
      } else {
        this.pbeAlgorithm = bCPBEKey.getAlgorithm();
      } 
      if (bCPBEKey.getParam() != null) {
        parametersWithIV2 = (ParametersWithIV)adjustParameters(paramAlgorithmParameterSpec, bCPBEKey.getParam());
      } else if (paramAlgorithmParameterSpec instanceof PBEParameterSpec) {
        this.pbeSpec = (PBEParameterSpec)paramAlgorithmParameterSpec;
        parametersWithIV2 = (ParametersWithIV)PBE.Util.makePBEParameters(bCPBEKey, paramAlgorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
      } else {
        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
      } 
      if (parametersWithIV2 instanceof ParametersWithIV)
        this.ivParam = parametersWithIV2; 
    } else if (paramKey instanceof PBEKey) {
      PBEKey pBEKey = (PBEKey)paramKey;
      this.pbeSpec = (PBEParameterSpec)paramAlgorithmParameterSpec;
      if (pBEKey instanceof org.bouncycastle.jcajce.PKCS12KeyWithParameters && this.pbeSpec == null)
        this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount()); 
      parametersWithIV2 = (ParametersWithIV)PBE.Util.makePBEParameters(pBEKey.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
      if (parametersWithIV2 instanceof ParametersWithIV)
        this.ivParam = parametersWithIV2; 
    } else if (!(paramKey instanceof org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec)) {
      if (this.scheme == 0 || this.scheme == 4 || this.scheme == 1 || this.scheme == 5)
        throw new InvalidKeyException("Algorithm requires a PBE key"); 
      parametersWithIV2 = (ParametersWithIV)new KeyParameter(paramKey.getEncoded());
    } else {
      parametersWithIV2 = null;
    } 
    if (paramAlgorithmParameterSpec instanceof AEADParameterSpec) {
      KeyParameter keyParameter;
      if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher))
        throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes."); 
      AEADParameterSpec aEADParameterSpec = (AEADParameterSpec)paramAlgorithmParameterSpec;
      if (parametersWithIV2 instanceof ParametersWithIV) {
        keyParameter = (KeyParameter)((ParametersWithIV)parametersWithIV2).getParameters();
      } else {
        keyParameter = (KeyParameter)parametersWithIV2;
      } 
      aEADParameters = this.aeadParams = new AEADParameters(keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
    } else if (paramAlgorithmParameterSpec instanceof IvParameterSpec) {
      if (this.ivLength != 0) {
        IvParameterSpec ivParameterSpec = (IvParameterSpec)paramAlgorithmParameterSpec;
        if ((ivParameterSpec.getIV()).length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv)
          throw new InvalidAlgorithmParameterException("IV must be " + this.ivLength + " bytes long."); 
        if (aEADParameters instanceof ParametersWithIV) {
          parametersWithIV1 = new ParametersWithIV(((ParametersWithIV)aEADParameters).getParameters(), ivParameterSpec.getIV());
        } else {
          parametersWithIV1 = new ParametersWithIV((CipherParameters)parametersWithIV1, ivParameterSpec.getIV());
        } 
        this.ivParam = parametersWithIV1;
      } else if (this.modeName != null && this.modeName.equals("ECB")) {
        throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
      } 
    } else if (paramAlgorithmParameterSpec instanceof GOST28147ParameterSpec) {
      GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec)paramAlgorithmParameterSpec;
      ParametersWithSBox parametersWithSBox = new ParametersWithSBox((CipherParameters)new KeyParameter(paramKey.getEncoded()), ((GOST28147ParameterSpec)paramAlgorithmParameterSpec).getSBox());
      if (gOST28147ParameterSpec.getIV() != null && this.ivLength != 0) {
        if (parametersWithSBox instanceof ParametersWithIV) {
          parametersWithIV1 = new ParametersWithIV(((ParametersWithIV)parametersWithSBox).getParameters(), gOST28147ParameterSpec.getIV());
        } else {
          parametersWithIV1 = new ParametersWithIV((CipherParameters)parametersWithIV1, gOST28147ParameterSpec.getIV());
        } 
        this.ivParam = parametersWithIV1;
      } 
    } else if (paramAlgorithmParameterSpec instanceof RC2ParameterSpec) {
      RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec)paramAlgorithmParameterSpec;
      RC2Parameters rC2Parameters = new RC2Parameters(paramKey.getEncoded(), ((RC2ParameterSpec)paramAlgorithmParameterSpec).getEffectiveKeyBits());
      if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
        if (rC2Parameters instanceof ParametersWithIV) {
          parametersWithIV1 = new ParametersWithIV(((ParametersWithIV)rC2Parameters).getParameters(), rC2ParameterSpec.getIV());
        } else {
          parametersWithIV1 = new ParametersWithIV((CipherParameters)parametersWithIV1, rC2ParameterSpec.getIV());
        } 
        this.ivParam = parametersWithIV1;
      } 
    } else if (paramAlgorithmParameterSpec instanceof RC5ParameterSpec) {
      RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec)paramAlgorithmParameterSpec;
      RC5Parameters rC5Parameters = new RC5Parameters(paramKey.getEncoded(), ((RC5ParameterSpec)paramAlgorithmParameterSpec).getRounds());
      if (this.baseEngine.getAlgorithmName().startsWith("RC5")) {
        if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
          if (rC5ParameterSpec.getWordSize() != 32)
            throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + "."); 
        } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
          throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + ".");
        } 
      } else {
        throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
      } 
      if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
        if (rC5Parameters instanceof ParametersWithIV) {
          parametersWithIV1 = new ParametersWithIV(((ParametersWithIV)rC5Parameters).getParameters(), rC5ParameterSpec.getIV());
        } else {
          parametersWithIV1 = new ParametersWithIV((CipherParameters)parametersWithIV1, rC5ParameterSpec.getIV());
        } 
        this.ivParam = parametersWithIV1;
      } 
    } else {
      FPEParameters fPEParameters;
      if (paramAlgorithmParameterSpec instanceof FPEParameterSpec) {
        FPEParameterSpec fPEParameterSpec = (FPEParameterSpec)paramAlgorithmParameterSpec;
        fPEParameters = new FPEParameters((KeyParameter)parametersWithIV1, fPEParameterSpec.getRadixConverter(), fPEParameterSpec.getTweak(), fPEParameterSpec.isUsingInverseFunction());
      } else if (GcmSpecUtil.isGcmSpec(paramAlgorithmParameterSpec)) {
        KeyParameter keyParameter;
        if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher))
          throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes."); 
        if (fPEParameters instanceof ParametersWithIV) {
          keyParameter = (KeyParameter)((ParametersWithIV)fPEParameters).getParameters();
        } else {
          keyParameter = (KeyParameter)fPEParameters;
        } 
        aEADParameters = this.aeadParams = GcmSpecUtil.extractAeadParameters(keyParameter, paramAlgorithmParameterSpec);
      } else if (paramAlgorithmParameterSpec != null && !(paramAlgorithmParameterSpec instanceof PBEParameterSpec)) {
        throw new InvalidAlgorithmParameterException("unknown parameter type.");
      } 
    } 
    if (this.ivLength != 0 && !(aEADParameters instanceof ParametersWithIV) && !(aEADParameters instanceof AEADParameters)) {
      SecureRandom secureRandom = paramSecureRandom;
      if (secureRandom == null)
        secureRandom = CryptoServicesRegistrar.getSecureRandom(); 
      if (paramInt == 1 || paramInt == 3) {
        byte[] arrayOfByte = new byte[this.ivLength];
        secureRandom.nextBytes(arrayOfByte);
        parametersWithIV1 = new ParametersWithIV((CipherParameters)aEADParameters, arrayOfByte);
        this.ivParam = parametersWithIV1;
      } else if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
        throw new InvalidAlgorithmParameterException("no IV set when one expected");
      } 
    } 
    if (paramSecureRandom != null && this.padded)
      parametersWithRandom = new ParametersWithRandom((CipherParameters)parametersWithIV1, paramSecureRandom); 
    try {
      switch (paramInt) {
        case 1:
        case 3:
          this.cipher.init(true, (CipherParameters)parametersWithRandom);
          break;
        case 2:
        case 4:
          this.cipher.init(false, (CipherParameters)parametersWithRandom);
          break;
        default:
          throw new InvalidParameterException("unknown opmode " + paramInt + " passed");
      } 
      if (this.cipher instanceof AEADGenericBlockCipher && this.aeadParams == null) {
        AEADCipher aEADCipher = ((AEADGenericBlockCipher)this.cipher).cipher;
        this.aeadParams = new AEADParameters((KeyParameter)this.ivParam.getParameters(), (aEADCipher.getMac()).length * 8, this.ivParam.getIV());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new InvalidAlgorithmParameterException(illegalArgumentException.getMessage(), illegalArgumentException);
    } catch (Exception exception) {
      throw new BaseWrapCipher.InvalidKeyOrParametersException(exception.getMessage(), exception);
    } 
  }
  
  private CipherParameters adjustParameters(AlgorithmParameterSpec paramAlgorithmParameterSpec, CipherParameters paramCipherParameters) {
    ParametersWithIV parametersWithIV;
    if (paramCipherParameters instanceof ParametersWithIV) {
      CipherParameters cipherParameters = ((ParametersWithIV)paramCipherParameters).getParameters();
      if (paramAlgorithmParameterSpec instanceof IvParameterSpec) {
        IvParameterSpec ivParameterSpec = (IvParameterSpec)paramAlgorithmParameterSpec;
        this.ivParam = new ParametersWithIV(cipherParameters, ivParameterSpec.getIV());
        parametersWithIV = this.ivParam;
      } else if (paramAlgorithmParameterSpec instanceof GOST28147ParameterSpec) {
        GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec)paramAlgorithmParameterSpec;
        ParametersWithSBox parametersWithSBox = new ParametersWithSBox((CipherParameters)parametersWithIV, gOST28147ParameterSpec.getSBox());
        if (gOST28147ParameterSpec.getIV() != null && this.ivLength != 0) {
          this.ivParam = new ParametersWithIV(cipherParameters, gOST28147ParameterSpec.getIV());
          parametersWithIV = this.ivParam;
        } 
      } 
    } else if (paramAlgorithmParameterSpec instanceof IvParameterSpec) {
      IvParameterSpec ivParameterSpec = (IvParameterSpec)paramAlgorithmParameterSpec;
      this.ivParam = new ParametersWithIV((CipherParameters)parametersWithIV, ivParameterSpec.getIV());
      parametersWithIV = this.ivParam;
    } else if (paramAlgorithmParameterSpec instanceof GOST28147ParameterSpec) {
      GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec)paramAlgorithmParameterSpec;
      ParametersWithSBox parametersWithSBox = new ParametersWithSBox((CipherParameters)parametersWithIV, gOST28147ParameterSpec.getSBox());
      if (gOST28147ParameterSpec.getIV() != null && this.ivLength != 0)
        parametersWithIV = new ParametersWithIV((CipherParameters)parametersWithSBox, gOST28147ParameterSpec.getIV()); 
    } 
    return (CipherParameters)parametersWithIV;
  }
  
  protected void engineInit(int paramInt, Key paramKey, AlgorithmParameters paramAlgorithmParameters, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    AlgorithmParameterSpec algorithmParameterSpec = null;
    if (paramAlgorithmParameters != null) {
      algorithmParameterSpec = SpecUtil.extractSpec(paramAlgorithmParameters, availableSpecs);
      if (algorithmParameterSpec == null)
        throw new InvalidAlgorithmParameterException("can't handle parameter " + paramAlgorithmParameters.toString()); 
    } 
    engineInit(paramInt, paramKey, algorithmParameterSpec, paramSecureRandom);
    this.engineParams = paramAlgorithmParameters;
  }
  
  protected void engineInit(int paramInt, Key paramKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    try {
      engineInit(paramInt, paramKey, (AlgorithmParameterSpec)null, paramSecureRandom);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new InvalidKeyException(invalidAlgorithmParameterException.getMessage());
    } 
  }
  
  protected void engineUpdateAAD(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.cipher.updateAAD(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  protected void engineUpdateAAD(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.remaining();
    if (i >= 1)
      if (paramByteBuffer.hasArray()) {
        engineUpdateAAD(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), i);
        paramByteBuffer.position(paramByteBuffer.limit());
      } else if (i <= 512) {
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte);
        engineUpdateAAD(arrayOfByte, 0, arrayOfByte.length);
        Arrays.fill(arrayOfByte, (byte)0);
      } else {
        byte[] arrayOfByte = new byte[512];
        while (true) {
          int j = Math.min(arrayOfByte.length, i);
          paramByteBuffer.get(arrayOfByte, 0, j);
          engineUpdateAAD(arrayOfByte, 0, j);
          i -= j;
          if (i <= 0) {
            Arrays.fill(arrayOfByte, (byte)0);
            break;
          } 
        } 
      }  
  }
  
  protected byte[] engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.cipher.getUpdateOutputSize(paramInt2);
    if (i > 0) {
      byte[] arrayOfByte = new byte[i];
      int j = this.cipher.processBytes(paramArrayOfbyte, paramInt1, paramInt2, arrayOfByte, 0);
      if (j == 0)
        return null; 
      if (j != arrayOfByte.length) {
        byte[] arrayOfByte1 = new byte[j];
        System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, j);
        return arrayOfByte1;
      } 
      return arrayOfByte;
    } 
    this.cipher.processBytes(paramArrayOfbyte, paramInt1, paramInt2, null, 0);
    return null;
  }
  
  protected int engineUpdate(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws ShortBufferException {
    if (paramInt3 + this.cipher.getUpdateOutputSize(paramInt2) > paramArrayOfbyte2.length)
      throw new ShortBufferException("output buffer too short for input."); 
    try {
      return this.cipher.processBytes(paramArrayOfbyte1, paramInt1, paramInt2, paramArrayOfbyte2, paramInt3);
    } catch (DataLengthException dataLengthException) {
      throw new IllegalStateException(dataLengthException.toString());
    } 
  }
  
  protected byte[] engineDoFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalBlockSizeException, BadPaddingException {
    int i = 0;
    byte[] arrayOfByte1 = new byte[engineGetOutputSize(paramInt2)];
    if (paramInt2 != 0)
      i = this.cipher.processBytes(paramArrayOfbyte, paramInt1, paramInt2, arrayOfByte1, 0); 
    try {
      i += this.cipher.doFinal(arrayOfByte1, i);
    } catch (DataLengthException dataLengthException) {
      throw new IllegalBlockSizeException(dataLengthException.getMessage());
    } 
    if (i == arrayOfByte1.length)
      return arrayOfByte1; 
    if (i > arrayOfByte1.length)
      throw new IllegalBlockSizeException("internal buffer overflow"); 
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    return arrayOfByte2;
  }
  
  protected int engineDoFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
    int i = 0;
    if (paramInt3 + engineGetOutputSize(paramInt2) > paramArrayOfbyte2.length)
      throw new ShortBufferException("output buffer too short for input."); 
    try {
      if (paramInt2 != 0)
        i = this.cipher.processBytes(paramArrayOfbyte1, paramInt1, paramInt2, paramArrayOfbyte2, paramInt3); 
      return i + this.cipher.doFinal(paramArrayOfbyte2, paramInt3 + i);
    } catch (OutputLengthException outputLengthException) {
      throw new IllegalBlockSizeException(outputLengthException.getMessage());
    } catch (DataLengthException dataLengthException) {
      throw new IllegalBlockSizeException(dataLengthException.getMessage());
    } 
  }
  
  private boolean isAEADModeName(String paramString) {
    return ("CCM".equals(paramString) || "EAX".equals(paramString) || "GCM".equals(paramString) || "GCM-SIV".equals(paramString) || "OCB".equals(paramString));
  }
  
  private static class AEADGenericBlockCipher implements GenericBlockCipher {
    private static final Constructor aeadBadTagConstructor;
    
    private AEADCipher cipher;
    
    private static Constructor findExceptionConstructor(Class param1Class) {
      try {
        return param1Class.getConstructor(new Class[] { String.class });
      } catch (Exception exception) {
        return null;
      } 
    }
    
    AEADGenericBlockCipher(AEADCipher param1AEADCipher) {
      this.cipher = param1AEADCipher;
    }
    
    public void init(boolean param1Boolean, CipherParameters param1CipherParameters) throws IllegalArgumentException {
      this.cipher.init(param1Boolean, param1CipherParameters);
    }
    
    public String getAlgorithmName() {
      return (this.cipher instanceof AEADBlockCipher) ? ((AEADBlockCipher)this.cipher).getUnderlyingCipher().getAlgorithmName() : this.cipher.getAlgorithmName();
    }
    
    public boolean wrapOnNoPadding() {
      return false;
    }
    
    public BlockCipher getUnderlyingCipher() {
      return (this.cipher instanceof AEADBlockCipher) ? ((AEADBlockCipher)this.cipher).getUnderlyingCipher() : null;
    }
    
    public int getOutputSize(int param1Int) {
      return this.cipher.getOutputSize(param1Int);
    }
    
    public int getUpdateOutputSize(int param1Int) {
      return this.cipher.getUpdateOutputSize(param1Int);
    }
    
    public void updateAAD(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.cipher.processAADBytes(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public int processByte(byte param1Byte, byte[] param1ArrayOfbyte, int param1Int) throws DataLengthException {
      return this.cipher.processByte(param1Byte, param1ArrayOfbyte, param1Int);
    }
    
    public int processBytes(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3) throws DataLengthException {
      return this.cipher.processBytes(param1ArrayOfbyte1, param1Int1, param1Int2, param1ArrayOfbyte2, param1Int3);
    }
    
    public int doFinal(byte[] param1ArrayOfbyte, int param1Int) throws IllegalStateException, BadPaddingException {
      try {
        return this.cipher.doFinal(param1ArrayOfbyte, param1Int);
      } catch (InvalidCipherTextException invalidCipherTextException) {
        if (aeadBadTagConstructor != null) {
          BadPaddingException badPaddingException = null;
          try {
            badPaddingException = aeadBadTagConstructor.newInstance(new Object[] { invalidCipherTextException.getMessage() });
          } catch (Exception exception) {}
          if (badPaddingException != null)
            throw badPaddingException; 
        } 
        throw new BadPaddingException(invalidCipherTextException.getMessage());
      } 
    }
    
    static {
      Class clazz = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
      if (clazz != null) {
        aeadBadTagConstructor = findExceptionConstructor(clazz);
      } else {
        aeadBadTagConstructor = null;
      } 
    }
  }
  
  private static class BufferedFPEBlockCipher implements GenericBlockCipher {
    private FPEEngine cipher;
    
    private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();
    
    BufferedFPEBlockCipher(FPEEngine param1FPEEngine) {
      this.cipher = param1FPEEngine;
    }
    
    public void init(boolean param1Boolean, CipherParameters param1CipherParameters) throws IllegalArgumentException {
      this.cipher.init(param1Boolean, param1CipherParameters);
    }
    
    public boolean wrapOnNoPadding() {
      return false;
    }
    
    public String getAlgorithmName() {
      return this.cipher.getAlgorithmName();
    }
    
    public BlockCipher getUnderlyingCipher() {
      throw new IllegalStateException("not applicable for FPE");
    }
    
    public int getOutputSize(int param1Int) {
      return this.eOut.size() + param1Int;
    }
    
    public int getUpdateOutputSize(int param1Int) {
      return 0;
    }
    
    public void updateAAD(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      throw new UnsupportedOperationException("AAD is not supported in the current mode.");
    }
    
    public int processByte(byte param1Byte, byte[] param1ArrayOfbyte, int param1Int) throws DataLengthException {
      this.eOut.write(param1Byte);
      return 0;
    }
    
    public int processBytes(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3) throws DataLengthException {
      this.eOut.write(param1ArrayOfbyte1, param1Int1, param1Int2);
      return 0;
    }
    
    public int doFinal(byte[] param1ArrayOfbyte, int param1Int) throws IllegalStateException, BadPaddingException {
      try {
        return this.cipher.processBlock(this.eOut.getBuf(), 0, this.eOut.size(), param1ArrayOfbyte, param1Int);
      } finally {
        this.eOut.erase();
      } 
    }
  }
  
  private static class BufferedGenericBlockCipher implements GenericBlockCipher {
    private BufferedBlockCipher cipher;
    
    BufferedGenericBlockCipher(BufferedBlockCipher param1BufferedBlockCipher) {
      this.cipher = param1BufferedBlockCipher;
    }
    
    BufferedGenericBlockCipher(BlockCipher param1BlockCipher) {
      this(param1BlockCipher, (BlockCipherPadding)new PKCS7Padding());
    }
    
    BufferedGenericBlockCipher(BlockCipher param1BlockCipher, BlockCipherPadding param1BlockCipherPadding) {
      this.cipher = (BufferedBlockCipher)new PaddedBufferedBlockCipher(param1BlockCipher, param1BlockCipherPadding);
    }
    
    public void init(boolean param1Boolean, CipherParameters param1CipherParameters) throws IllegalArgumentException {
      this.cipher.init(param1Boolean, param1CipherParameters);
    }
    
    public boolean wrapOnNoPadding() {
      return !(this.cipher instanceof CTSBlockCipher);
    }
    
    public String getAlgorithmName() {
      return this.cipher.getUnderlyingCipher().getAlgorithmName();
    }
    
    public BlockCipher getUnderlyingCipher() {
      return this.cipher.getUnderlyingCipher();
    }
    
    public int getOutputSize(int param1Int) {
      return this.cipher.getOutputSize(param1Int);
    }
    
    public int getUpdateOutputSize(int param1Int) {
      return this.cipher.getUpdateOutputSize(param1Int);
    }
    
    public void updateAAD(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      throw new UnsupportedOperationException("AAD is not supported in the current mode.");
    }
    
    public int processByte(byte param1Byte, byte[] param1ArrayOfbyte, int param1Int) throws DataLengthException {
      return this.cipher.processByte(param1Byte, param1ArrayOfbyte, param1Int);
    }
    
    public int processBytes(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3) throws DataLengthException {
      return this.cipher.processBytes(param1ArrayOfbyte1, param1Int1, param1Int2, param1ArrayOfbyte2, param1Int3);
    }
    
    public int doFinal(byte[] param1ArrayOfbyte, int param1Int) throws IllegalStateException, BadPaddingException {
      try {
        return this.cipher.doFinal(param1ArrayOfbyte, param1Int);
      } catch (InvalidCipherTextException invalidCipherTextException) {
        throw new BadPaddingException(invalidCipherTextException.getMessage());
      } 
    }
  }
  
  private static interface GenericBlockCipher {
    void init(boolean param1Boolean, CipherParameters param1CipherParameters) throws IllegalArgumentException;
    
    boolean wrapOnNoPadding();
    
    String getAlgorithmName();
    
    BlockCipher getUnderlyingCipher();
    
    int getOutputSize(int param1Int);
    
    int getUpdateOutputSize(int param1Int);
    
    void updateAAD(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2);
    
    int processByte(byte param1Byte, byte[] param1ArrayOfbyte, int param1Int) throws DataLengthException;
    
    int processBytes(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3) throws DataLengthException;
    
    int doFinal(byte[] param1ArrayOfbyte, int param1Int) throws IllegalStateException, BadPaddingException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetri\\util\BaseBlockCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */