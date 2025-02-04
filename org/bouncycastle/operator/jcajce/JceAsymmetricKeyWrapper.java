package org.bouncycastle.operator.jcajce;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey;
import org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport;
import org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyWrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.util.Arrays;

public class JceAsymmetricKeyWrapper extends AsymmetricKeyWrapper {
  private static final Set gostAlgs = new HashSet();
  
  private OperatorHelper helper = new OperatorHelper((JcaJceHelper)new DefaultJcaJceHelper());
  
  private Map extraMappings = new HashMap<>();
  
  private PublicKey publicKey;
  
  private SecureRandom random;
  
  private static final Map digests = new HashMap<>();
  
  static boolean isGOST(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return gostAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  public JceAsymmetricKeyWrapper(PublicKey paramPublicKey) {
    super(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()).getAlgorithm());
    this.publicKey = paramPublicKey;
  }
  
  public JceAsymmetricKeyWrapper(X509Certificate paramX509Certificate) {
    this(paramX509Certificate.getPublicKey());
  }
  
  public JceAsymmetricKeyWrapper(AlgorithmIdentifier paramAlgorithmIdentifier, PublicKey paramPublicKey) {
    super(paramAlgorithmIdentifier);
    this.publicKey = paramPublicKey;
  }
  
  public JceAsymmetricKeyWrapper(AlgorithmParameters paramAlgorithmParameters, PublicKey paramPublicKey) throws InvalidParameterSpecException {
    super(extractAlgID(paramPublicKey, paramAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class)));
    this.publicKey = paramPublicKey;
  }
  
  public JceAsymmetricKeyWrapper(AlgorithmParameterSpec paramAlgorithmParameterSpec, PublicKey paramPublicKey) {
    super(extractAlgID(paramPublicKey, paramAlgorithmParameterSpec));
    this.publicKey = paramPublicKey;
  }
  
  public JceAsymmetricKeyWrapper setProvider(Provider paramProvider) {
    this.helper = new OperatorHelper((JcaJceHelper)new ProviderJcaJceHelper(paramProvider));
    return this;
  }
  
  public JceAsymmetricKeyWrapper setProvider(String paramString) {
    this.helper = new OperatorHelper((JcaJceHelper)new NamedJcaJceHelper(paramString));
    return this;
  }
  
  public JceAsymmetricKeyWrapper setSecureRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public JceAsymmetricKeyWrapper setAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    this.extraMappings.put(paramASN1ObjectIdentifier, paramString);
    return this;
  }
  
  public byte[] generateWrappedKey(GenericKey paramGenericKey) throws OperatorException {
    byte[] arrayOfByte = null;
    if (isGOST(getAlgorithmIdentifier().getAlgorithm()))
      try {
        GostR3410TransportParameters gostR3410TransportParameters;
        this.random = CryptoServicesRegistrar.getSecureRandom(this.random);
        KeyPairGenerator keyPairGenerator = this.helper.createKeyPairGenerator(getAlgorithmIdentifier().getAlgorithm());
        keyPairGenerator.initialize(((ECPublicKey)this.publicKey).getParams(), this.random);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        byte[] arrayOfByte1 = new byte[8];
        this.random.nextBytes(arrayOfByte1);
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded());
        if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(RosstandartObjectIdentifiers.id_tc26)) {
          gostR3410TransportParameters = new GostR3410TransportParameters(RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, subjectPublicKeyInfo, arrayOfByte1);
        } else {
          gostR3410TransportParameters = new GostR3410TransportParameters(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, subjectPublicKeyInfo, arrayOfByte1);
        } 
        KeyAgreement keyAgreement = this.helper.createKeyAgreement(getAlgorithmIdentifier().getAlgorithm());
        keyAgreement.init(keyPair.getPrivate(), (AlgorithmParameterSpec)new UserKeyingMaterialSpec(gostR3410TransportParameters.getUkm()));
        keyAgreement.doPhase(this.publicKey, true);
        SecretKey secretKey = keyAgreement.generateSecret(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap.getId());
        byte[] arrayOfByte2 = OperatorUtils.getJceKey(paramGenericKey).getEncoded();
        Cipher cipher1 = this.helper.createCipher(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
        cipher1.init(3, secretKey, (AlgorithmParameterSpec)new GOST28147WrapParameterSpec(gostR3410TransportParameters.getEncryptionParamSet(), gostR3410TransportParameters.getUkm()));
        byte[] arrayOfByte3 = cipher1.wrap(new SecretKeySpec(arrayOfByte2, "GOST"));
        GostR3410KeyTransport gostR3410KeyTransport = new GostR3410KeyTransport(new Gost2814789EncryptedKey(Arrays.copyOfRange(arrayOfByte3, 0, 32), Arrays.copyOfRange(arrayOfByte3, 32, 36)), gostR3410TransportParameters);
        return gostR3410KeyTransport.getEncoded();
      } catch (Exception exception) {
        throw new OperatorException("exception wrapping key: " + exception.getMessage(), exception);
      }  
    Cipher cipher = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
    AlgorithmParameters algorithmParameters = null;
    try {
      if (!getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive)OIWObjectIdentifiers.elGamalAlgorithm))
        algorithmParameters = this.helper.createAlgorithmParameters(getAlgorithmIdentifier()); 
      if (algorithmParameters != null) {
        cipher.init(3, this.publicKey, algorithmParameters, this.random);
      } else {
        cipher.init(3, this.publicKey, this.random);
      } 
      arrayOfByte = cipher.wrap(OperatorUtils.getJceKey(paramGenericKey));
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (GeneralSecurityException generalSecurityException) {
    
    } catch (IllegalStateException illegalStateException) {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
    
    } catch (ProviderException providerException) {}
    if (arrayOfByte == null)
      try {
        if (algorithmParameters != null) {
          cipher.init(1, this.publicKey, algorithmParameters, this.random);
        } else {
          cipher.init(1, this.publicKey, this.random);
        } 
        arrayOfByte = cipher.doFinal(OperatorUtils.getJceKey(paramGenericKey).getEncoded());
      } catch (InvalidKeyException invalidKeyException) {
        throw new OperatorException("unable to encrypt contents key", invalidKeyException);
      } catch (GeneralSecurityException generalSecurityException) {
        throw new OperatorException("unable to encrypt contents key", generalSecurityException);
      }  
    return arrayOfByte;
  }
  
  private static AlgorithmIdentifier extractAlgID(PublicKey paramPublicKey, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    if (paramAlgorithmParameterSpec instanceof OAEPParameterSpec) {
      OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec)paramAlgorithmParameterSpec;
      if (oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
        if (oAEPParameterSpec.getPSource() instanceof PSource.PSpecified)
          return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSAES_OAEP, (ASN1Encodable)new RSAESOAEPparams(getDigest(oAEPParameterSpec.getDigestAlgorithm()), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)getDigest(((MGF1ParameterSpec)oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, (ASN1Encodable)new DEROctetString(((PSource.PSpecified)oAEPParameterSpec.getPSource()).getValue())))); 
        throw new IllegalArgumentException("unknown PSource: " + oAEPParameterSpec.getPSource().getAlgorithm());
      } 
      throw new IllegalArgumentException("unknown MGF: " + oAEPParameterSpec.getMGFAlgorithm());
    } 
    throw new IllegalArgumentException("unknown spec: " + paramAlgorithmParameterSpec.getClass().getName());
  }
  
  private static AlgorithmIdentifier getDigest(String paramString) {
    AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier)digests.get(paramString);
    if (algorithmIdentifier != null)
      return algorithmIdentifier; 
    throw new IllegalArgumentException("unknown digest name: " + paramString);
  }
  
  static {
    digests.put("SHA1", new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-1", new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA384", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-384", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA512", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-512", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA512/224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_224, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-512/224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_224, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-512(224)", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_224, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA512/256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-512/256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256, (ASN1Encodable)DERNull.INSTANCE));
    digests.put("SHA-512(256)", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256, (ASN1Encodable)DERNull.INSTANCE));
  }
  
  static {
    gostAlgs.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
    gostAlgs.add(CryptoProObjectIdentifiers.gostR3410_2001);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\jcajce\JceAsymmetricKeyWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */