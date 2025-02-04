package org.bouncycastle.cert;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AltSignatureAlgorithm;
import org.bouncycastle.asn1.x509.AltSignatureValue;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Encodable;

public class X509CertificateHolder implements Encodable, Serializable {
  private static final long serialVersionUID = 20170722001L;
  
  private transient Certificate x509Certificate;
  
  private transient Extensions extensions;
  
  private static Certificate parseBytes(byte[] paramArrayOfbyte) throws IOException {
    try {
      return Certificate.getInstance(CertUtils.parseNonEmptyASN1(paramArrayOfbyte));
    } catch (ClassCastException classCastException) {
      throw new CertIOException("malformed data: " + classCastException.getMessage(), classCastException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CertIOException("malformed data: " + illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  public X509CertificateHolder(byte[] paramArrayOfbyte) throws IOException {
    this(parseBytes(paramArrayOfbyte));
  }
  
  public X509CertificateHolder(Certificate paramCertificate) {
    init(paramCertificate);
  }
  
  private void init(Certificate paramCertificate) {
    this.x509Certificate = paramCertificate;
    this.extensions = paramCertificate.getTBSCertificate().getExtensions();
  }
  
  public int getVersionNumber() {
    return this.x509Certificate.getVersionNumber();
  }
  
  public int getVersion() {
    return this.x509Certificate.getVersionNumber();
  }
  
  public boolean hasExtensions() {
    return (this.extensions != null);
  }
  
  public Extension getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (this.extensions != null) ? this.extensions.getExtension(paramASN1ObjectIdentifier) : null;
  }
  
  public Extensions getExtensions() {
    return this.extensions;
  }
  
  public List getExtensionOIDs() {
    return CertUtils.getExtensionOIDs(this.extensions);
  }
  
  public Set getCriticalExtensionOIDs() {
    return CertUtils.getCriticalExtensionOIDs(this.extensions);
  }
  
  public Set getNonCriticalExtensionOIDs() {
    return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
  }
  
  public BigInteger getSerialNumber() {
    return this.x509Certificate.getSerialNumber().getValue();
  }
  
  public X500Name getIssuer() {
    return X500Name.getInstance(this.x509Certificate.getIssuer());
  }
  
  public X500Name getSubject() {
    return X500Name.getInstance(this.x509Certificate.getSubject());
  }
  
  public Date getNotBefore() {
    return this.x509Certificate.getStartDate().getDate();
  }
  
  public Date getNotAfter() {
    return this.x509Certificate.getEndDate().getDate();
  }
  
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
    return this.x509Certificate.getSubjectPublicKeyInfo();
  }
  
  public Certificate toASN1Structure() {
    return this.x509Certificate;
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return this.x509Certificate.getSignatureAlgorithm();
  }
  
  public byte[] getSignature() {
    return this.x509Certificate.getSignature().getOctets();
  }
  
  public boolean isValidOn(Date paramDate) {
    return (!paramDate.before(this.x509Certificate.getStartDate().getDate()) && !paramDate.after(this.x509Certificate.getEndDate().getDate()));
  }
  
  public boolean isSignatureValid(ContentVerifierProvider paramContentVerifierProvider) throws CertException {
    ContentVerifier contentVerifier;
    TBSCertificate tBSCertificate = this.x509Certificate.getTBSCertificate();
    if (!CertUtils.isAlgIdEqual(tBSCertificate.getSignature(), this.x509Certificate.getSignatureAlgorithm()))
      throw new CertException("signature invalid - algorithm identifier mismatch"); 
    try {
      contentVerifier = paramContentVerifierProvider.get(tBSCertificate.getSignature());
      OutputStream outputStream = contentVerifier.getOutputStream();
      tBSCertificate.encodeTo(outputStream, "DER");
      outputStream.close();
    } catch (Exception exception) {
      throw new CertException("unable to process signature: " + exception.getMessage(), exception);
    } 
    return contentVerifier.verify(getSignature());
  }
  
  public boolean isAlternativeSignatureValid(ContentVerifierProvider paramContentVerifierProvider) throws CertException {
    ContentVerifier contentVerifier;
    TBSCertificate tBSCertificate = this.x509Certificate.getTBSCertificate();
    AltSignatureAlgorithm altSignatureAlgorithm = AltSignatureAlgorithm.fromExtensions(tBSCertificate.getExtensions());
    AltSignatureValue altSignatureValue = AltSignatureValue.fromExtensions(tBSCertificate.getExtensions());
    try {
      contentVerifier = paramContentVerifierProvider.get(AlgorithmIdentifier.getInstance(altSignatureAlgorithm.toASN1Primitive()));
      OutputStream outputStream = contentVerifier.getOutputStream();
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(tBSCertificate.toASN1Primitive());
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      for (byte b = 0; b != aSN1Sequence.size() - 1; b++) {
        if (b != 2)
          aSN1EncodableVector.add(aSN1Sequence.getObjectAt(b)); 
      } 
      aSN1EncodableVector.add((ASN1Encodable)CertUtils.trimExtensions(3, tBSCertificate.getExtensions()));
      (new DERSequence(aSN1EncodableVector)).encodeTo(outputStream, "DER");
      outputStream.close();
    } catch (Exception exception) {
      throw new CertException("unable to process signature: " + exception.getMessage(), exception);
    } 
    return contentVerifier.verify(altSignatureValue.getSignature().getOctets());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof X509CertificateHolder))
      return false; 
    X509CertificateHolder x509CertificateHolder = (X509CertificateHolder)paramObject;
    return this.x509Certificate.equals(x509CertificateHolder.x509Certificate);
  }
  
  public int hashCode() {
    return this.x509Certificate.hashCode();
  }
  
  public byte[] getEncoded() throws IOException {
    return this.x509Certificate.getEncoded();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    init(Certificate.getInstance(paramObjectInputStream.readObject()));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\X509CertificateHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */