package org.bouncycastle.cms.jcajce;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.DefaultSignedAttributeTableGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.cms.SignerInfoGeneratorBuilder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

public class JcaSimpleSignerInfoGeneratorBuilder {
  private Helper helper = new Helper();
  
  private boolean hasNoSignedAttributes;
  
  private CMSAttributeTableGenerator signedGen;
  
  private CMSAttributeTableGenerator unsignedGen;
  
  private AlgorithmIdentifier contentDigest;
  
  public JcaSimpleSignerInfoGeneratorBuilder setProvider(String paramString) throws OperatorCreationException {
    this.helper = new NamedHelper(paramString);
    return this;
  }
  
  public JcaSimpleSignerInfoGeneratorBuilder setProvider(Provider paramProvider) throws OperatorCreationException {
    this.helper = new ProviderHelper(paramProvider);
    return this;
  }
  
  public JcaSimpleSignerInfoGeneratorBuilder setDirectSignature(boolean paramBoolean) {
    this.hasNoSignedAttributes = paramBoolean;
    return this;
  }
  
  public JcaSimpleSignerInfoGeneratorBuilder setContentDigest(AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.contentDigest = paramAlgorithmIdentifier;
    return this;
  }
  
  public JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    this.signedGen = paramCMSAttributeTableGenerator;
    return this;
  }
  
  public JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(AttributeTable paramAttributeTable) {
    this.signedGen = (CMSAttributeTableGenerator)new DefaultSignedAttributeTableGenerator(paramAttributeTable);
    return this;
  }
  
  public JcaSimpleSignerInfoGeneratorBuilder setUnsignedAttributeGenerator(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    this.unsignedGen = paramCMSAttributeTableGenerator;
    return this;
  }
  
  public SignerInfoGenerator build(String paramString, PrivateKey paramPrivateKey, X509CertificateHolder paramX509CertificateHolder) throws OperatorCreationException {
    paramPrivateKey = CMSUtils.cleanPrivateKey(paramPrivateKey);
    ContentSigner contentSigner = this.helper.createContentSigner(paramString, paramPrivateKey);
    return configureAndBuild().build(contentSigner, paramX509CertificateHolder);
  }
  
  public SignerInfoGenerator build(String paramString, PrivateKey paramPrivateKey, X509Certificate paramX509Certificate) throws OperatorCreationException, CertificateEncodingException {
    paramPrivateKey = CMSUtils.cleanPrivateKey(paramPrivateKey);
    ContentSigner contentSigner = this.helper.createContentSigner(paramString, paramPrivateKey);
    return configureAndBuild().build(contentSigner, (X509CertificateHolder)new JcaX509CertificateHolder(paramX509Certificate));
  }
  
  public SignerInfoGenerator build(String paramString, PrivateKey paramPrivateKey, byte[] paramArrayOfbyte) throws OperatorCreationException {
    paramPrivateKey = CMSUtils.cleanPrivateKey(paramPrivateKey);
    ContentSigner contentSigner = this.helper.createContentSigner(paramString, paramPrivateKey);
    return configureAndBuild().build(contentSigner, paramArrayOfbyte);
  }
  
  private SignerInfoGeneratorBuilder configureAndBuild() throws OperatorCreationException {
    SignerInfoGeneratorBuilder signerInfoGeneratorBuilder = new SignerInfoGeneratorBuilder(this.helper.createDigestCalculatorProvider());
    signerInfoGeneratorBuilder.setDirectSignature(this.hasNoSignedAttributes);
    signerInfoGeneratorBuilder.setContentDigest(this.contentDigest);
    signerInfoGeneratorBuilder.setSignedAttributeGenerator(this.signedGen);
    signerInfoGeneratorBuilder.setUnsignedAttributeGenerator(this.unsignedGen);
    return signerInfoGeneratorBuilder;
  }
  
  private static class Helper {
    private Helper() {}
    
    ContentSigner createContentSigner(String param1String, PrivateKey param1PrivateKey) throws OperatorCreationException {
      param1PrivateKey = CMSUtils.cleanPrivateKey(param1PrivateKey);
      return (new JcaContentSignerBuilder(param1String)).build(param1PrivateKey);
    }
    
    DigestCalculatorProvider createDigestCalculatorProvider() throws OperatorCreationException {
      return (new JcaDigestCalculatorProviderBuilder()).build();
    }
  }
  
  private static class NamedHelper extends Helper {
    private final String providerName;
    
    public NamedHelper(String param1String) {
      this.providerName = param1String;
    }
    
    ContentSigner createContentSigner(String param1String, PrivateKey param1PrivateKey) throws OperatorCreationException {
      param1PrivateKey = CMSUtils.cleanPrivateKey(param1PrivateKey);
      return (new JcaContentSignerBuilder(param1String)).setProvider(this.providerName).build(param1PrivateKey);
    }
    
    DigestCalculatorProvider createDigestCalculatorProvider() throws OperatorCreationException {
      return (new JcaDigestCalculatorProviderBuilder()).setProvider(this.providerName).build();
    }
  }
  
  private static class ProviderHelper extends Helper {
    private final Provider provider;
    
    public ProviderHelper(Provider param1Provider) {
      this.provider = param1Provider;
    }
    
    ContentSigner createContentSigner(String param1String, PrivateKey param1PrivateKey) throws OperatorCreationException {
      param1PrivateKey = CMSUtils.cleanPrivateKey(param1PrivateKey);
      return (new JcaContentSignerBuilder(param1String)).setProvider(this.provider).build(param1PrivateKey);
    }
    
    DigestCalculatorProvider createDigestCalculatorProvider() throws OperatorCreationException {
      return (new JcaDigestCalculatorProviderBuilder()).setProvider(this.provider).build();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JcaSimpleSignerInfoGeneratorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */