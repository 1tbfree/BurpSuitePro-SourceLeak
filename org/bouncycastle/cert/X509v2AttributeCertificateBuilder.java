package org.bouncycastle.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator;
import org.bouncycastle.operator.ContentSigner;

public class X509v2AttributeCertificateBuilder {
  private V2AttributeCertificateInfoGenerator acInfoGen = new V2AttributeCertificateInfoGenerator();
  
  private ExtensionsGenerator extGenerator;
  
  public X509v2AttributeCertificateBuilder(AttributeCertificateHolder paramAttributeCertificateHolder, AttributeCertificateIssuer paramAttributeCertificateIssuer, BigInteger paramBigInteger, Date paramDate1, Date paramDate2) {
    this.extGenerator = new ExtensionsGenerator();
    this.acInfoGen.setHolder(paramAttributeCertificateHolder.holder);
    this.acInfoGen.setIssuer(AttCertIssuer.getInstance(paramAttributeCertificateIssuer.form));
    this.acInfoGen.setSerialNumber(new ASN1Integer(paramBigInteger));
    this.acInfoGen.setStartDate(new ASN1GeneralizedTime(paramDate1));
    this.acInfoGen.setEndDate(new ASN1GeneralizedTime(paramDate2));
  }
  
  public X509v2AttributeCertificateBuilder(AttributeCertificateHolder paramAttributeCertificateHolder, AttributeCertificateIssuer paramAttributeCertificateIssuer, BigInteger paramBigInteger, Date paramDate1, Date paramDate2, Locale paramLocale) {
    this.extGenerator = new ExtensionsGenerator();
    this.acInfoGen.setHolder(paramAttributeCertificateHolder.holder);
    this.acInfoGen.setIssuer(AttCertIssuer.getInstance(paramAttributeCertificateIssuer.form));
    this.acInfoGen.setSerialNumber(new ASN1Integer(paramBigInteger));
    this.acInfoGen.setStartDate(new ASN1GeneralizedTime(paramDate1, paramLocale));
    this.acInfoGen.setEndDate(new ASN1GeneralizedTime(paramDate2, paramLocale));
  }
  
  public X509v2AttributeCertificateBuilder(X509AttributeCertificateHolder paramX509AttributeCertificateHolder) {
    this.acInfoGen.setSerialNumber(new ASN1Integer(paramX509AttributeCertificateHolder.getSerialNumber()));
    this.acInfoGen.setIssuer(AttCertIssuer.getInstance((paramX509AttributeCertificateHolder.getIssuer()).form));
    this.acInfoGen.setStartDate(new ASN1GeneralizedTime(paramX509AttributeCertificateHolder.getNotBefore()));
    this.acInfoGen.setEndDate(new ASN1GeneralizedTime(paramX509AttributeCertificateHolder.getNotAfter()));
    this.acInfoGen.setHolder((paramX509AttributeCertificateHolder.getHolder()).holder);
    boolean[] arrayOfBoolean = paramX509AttributeCertificateHolder.getIssuerUniqueID();
    if (arrayOfBoolean != null)
      this.acInfoGen.setIssuerUniqueID(CertUtils.booleanToBitString(arrayOfBoolean)); 
    Attribute[] arrayOfAttribute = paramX509AttributeCertificateHolder.getAttributes();
    for (byte b = 0; b != arrayOfAttribute.length; b++)
      this.acInfoGen.addAttribute(arrayOfAttribute[b]); 
    this.extGenerator = new ExtensionsGenerator();
    Extensions extensions = paramX509AttributeCertificateHolder.getExtensions();
    Enumeration<ASN1ObjectIdentifier> enumeration = extensions.oids();
    while (enumeration.hasMoreElements())
      this.extGenerator.addExtension(extensions.getExtension(enumeration.nextElement())); 
  }
  
  public boolean hasExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (doGetExtension(paramASN1ObjectIdentifier) != null);
  }
  
  public Extension getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return doGetExtension(paramASN1ObjectIdentifier);
  }
  
  private Extension doGetExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (this.extGenerator.isEmpty())
      return null; 
    Extensions extensions = this.extGenerator.generate();
    return extensions.getExtension(paramASN1ObjectIdentifier);
  }
  
  public X509v2AttributeCertificateBuilder addAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    this.acInfoGen.addAttribute(new Attribute(paramASN1ObjectIdentifier, (ASN1Set)new DERSet(paramASN1Encodable)));
    return this;
  }
  
  public X509v2AttributeCertificateBuilder addAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable[] paramArrayOfASN1Encodable) {
    this.acInfoGen.addAttribute(new Attribute(paramASN1ObjectIdentifier, (ASN1Set)new DERSet(paramArrayOfASN1Encodable)));
    return this;
  }
  
  public void setIssuerUniqueId(boolean[] paramArrayOfboolean) {
    this.acInfoGen.setIssuerUniqueID(CertUtils.booleanToBitString(paramArrayOfboolean));
  }
  
  public X509v2AttributeCertificateBuilder addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    CertUtils.addExtension(this.extGenerator, paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable);
    return this;
  }
  
  public X509v2AttributeCertificateBuilder addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, byte[] paramArrayOfbyte) throws CertIOException {
    this.extGenerator.addExtension(paramASN1ObjectIdentifier, paramBoolean, paramArrayOfbyte);
    return this;
  }
  
  public X509v2AttributeCertificateBuilder addExtension(Extension paramExtension) throws CertIOException {
    this.extGenerator.addExtension(paramExtension);
    return this;
  }
  
  public X509v2AttributeCertificateBuilder replaceExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    try {
      this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable.toASN1Primitive().getEncoded("DER")));
    } catch (IOException iOException) {
      throw new CertIOException("cannot encode extension: " + iOException.getMessage(), iOException);
    } 
    return this;
  }
  
  public X509v2AttributeCertificateBuilder replaceExtension(Extension paramExtension) throws CertIOException {
    this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, paramExtension);
    return this;
  }
  
  public X509v2AttributeCertificateBuilder replaceExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, byte[] paramArrayOfbyte) throws CertIOException {
    this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(paramASN1ObjectIdentifier, paramBoolean, paramArrayOfbyte));
    return this;
  }
  
  public X509v2AttributeCertificateBuilder removeExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.extGenerator = CertUtils.doRemoveExtension(this.extGenerator, paramASN1ObjectIdentifier);
    return this;
  }
  
  public X509AttributeCertificateHolder build(ContentSigner paramContentSigner) {
    this.acInfoGen.setSignature(paramContentSigner.getAlgorithmIdentifier());
    if (!this.extGenerator.isEmpty())
      this.acInfoGen.setExtensions(this.extGenerator.generate()); 
    return CertUtils.generateFullAttrCert(paramContentSigner, this.acInfoGen.generateAttributeCertificateInfo());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\X509v2AttributeCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */