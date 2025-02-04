package org.bouncycastle.pkcs;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;

public class PKCS10CertificationRequestBuilder {
  private SubjectPublicKeyInfo publicKeyInfo;
  
  private X500Name subject;
  
  private List attributes = new ArrayList();
  
  private boolean leaveOffEmpty = false;
  
  public PKCS10CertificationRequestBuilder(PKCS10CertificationRequestBuilder paramPKCS10CertificationRequestBuilder) {
    this.publicKeyInfo = paramPKCS10CertificationRequestBuilder.publicKeyInfo;
    this.subject = paramPKCS10CertificationRequestBuilder.subject;
    this.leaveOffEmpty = paramPKCS10CertificationRequestBuilder.leaveOffEmpty;
    this.attributes = new ArrayList(paramPKCS10CertificationRequestBuilder.attributes);
  }
  
  public PKCS10CertificationRequestBuilder(X500Name paramX500Name, SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    this.subject = paramX500Name;
    this.publicKeyInfo = paramSubjectPublicKeyInfo;
  }
  
  public PKCS10CertificationRequestBuilder setAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    Iterator<Attribute> iterator = this.attributes.iterator();
    while (iterator.hasNext()) {
      if (((Attribute)iterator.next()).getAttrType().equals((ASN1Primitive)paramASN1ObjectIdentifier))
        throw new IllegalStateException("Attribute " + paramASN1ObjectIdentifier.toString() + " is already set"); 
    } 
    addAttribute(paramASN1ObjectIdentifier, paramASN1Encodable);
    return this;
  }
  
  public PKCS10CertificationRequestBuilder setAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable[] paramArrayOfASN1Encodable) {
    Iterator<Attribute> iterator = this.attributes.iterator();
    while (iterator.hasNext()) {
      if (((Attribute)iterator.next()).getAttrType().equals((ASN1Primitive)paramASN1ObjectIdentifier))
        throw new IllegalStateException("Attribute " + paramASN1ObjectIdentifier.toString() + " is already set"); 
    } 
    addAttribute(paramASN1ObjectIdentifier, paramArrayOfASN1Encodable);
    return this;
  }
  
  public PKCS10CertificationRequestBuilder addAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    this.attributes.add(new Attribute(paramASN1ObjectIdentifier, (ASN1Set)new DERSet(paramASN1Encodable)));
    return this;
  }
  
  public PKCS10CertificationRequestBuilder addAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable[] paramArrayOfASN1Encodable) {
    this.attributes.add(new Attribute(paramASN1ObjectIdentifier, (ASN1Set)new DERSet(paramArrayOfASN1Encodable)));
    return this;
  }
  
  public PKCS10CertificationRequestBuilder setLeaveOffEmptyAttributes(boolean paramBoolean) {
    this.leaveOffEmpty = paramBoolean;
    return this;
  }
  
  public PKCS10CertificationRequest build(ContentSigner paramContentSigner) {
    CertificationRequestInfo certificationRequestInfo;
    if (this.attributes.isEmpty()) {
      if (this.leaveOffEmpty) {
        certificationRequestInfo = new CertificationRequestInfo(this.subject, this.publicKeyInfo, null);
      } else {
        certificationRequestInfo = new CertificationRequestInfo(this.subject, this.publicKeyInfo, (ASN1Set)new DERSet());
      } 
    } else {
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      Iterator iterator = this.attributes.iterator();
      while (iterator.hasNext())
        aSN1EncodableVector.add((ASN1Encodable)Attribute.getInstance(iterator.next())); 
      certificationRequestInfo = new CertificationRequestInfo(this.subject, this.publicKeyInfo, (ASN1Set)new DERSet(aSN1EncodableVector));
    } 
    try {
      OutputStream outputStream = paramContentSigner.getOutputStream();
      outputStream.write(certificationRequestInfo.getEncoded("DER"));
      outputStream.close();
      return new PKCS10CertificationRequest(new CertificationRequest(certificationRequestInfo, paramContentSigner.getAlgorithmIdentifier(), (ASN1BitString)new DERBitString(paramContentSigner.getSignature())));
    } catch (IOException iOException) {
      throw new IllegalStateException("cannot produce certification request signature");
    } 
  }
  
  public PKCS10CertificationRequest build(ContentSigner paramContentSigner1, SubjectPublicKeyInfo paramSubjectPublicKeyInfo, ContentSigner paramContentSigner2) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Iterator iterator = this.attributes.iterator();
    while (iterator.hasNext())
      aSN1EncodableVector.add((ASN1Encodable)Attribute.getInstance(iterator.next())); 
    aSN1EncodableVector.add((ASN1Encodable)new Attribute(Extension.subjectAltPublicKeyInfo, (ASN1Set)new DERSet((ASN1Encodable)paramSubjectPublicKeyInfo)));
    aSN1EncodableVector.add((ASN1Encodable)new Attribute(Extension.altSignatureAlgorithm, (ASN1Set)new DERSet((ASN1Encodable)paramContentSigner2.getAlgorithmIdentifier())));
    CertificationRequestInfo certificationRequestInfo = new CertificationRequestInfo(this.subject, this.publicKeyInfo, (ASN1Set)new DERSet(aSN1EncodableVector));
    try {
      OutputStream outputStream = paramContentSigner2.getOutputStream();
      outputStream.write(certificationRequestInfo.getEncoded("DER"));
      outputStream.close();
      aSN1EncodableVector.add((ASN1Encodable)new Attribute(Extension.altSignatureValue, (ASN1Set)new DERSet((ASN1Encodable)new DERBitString(paramContentSigner2.getSignature()))));
      certificationRequestInfo = new CertificationRequestInfo(this.subject, this.publicKeyInfo, (ASN1Set)new DERSet(aSN1EncodableVector));
    } catch (IOException iOException) {
      throw new IllegalStateException("cannot produce certification request signature");
    } 
    try {
      OutputStream outputStream = paramContentSigner1.getOutputStream();
      outputStream.write(certificationRequestInfo.getEncoded("DER"));
      outputStream.close();
      return new PKCS10CertificationRequest(new CertificationRequest(certificationRequestInfo, paramContentSigner1.getAlgorithmIdentifier(), (ASN1BitString)new DERBitString(paramContentSigner1.getSignature())));
    } catch (IOException iOException) {
      throw new IllegalStateException("cannot produce certification request signature");
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\PKCS10CertificationRequestBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */