package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class AttributeCertificate extends ASN1Object {
  AttributeCertificateInfo acinfo;
  
  AlgorithmIdentifier signatureAlgorithm;
  
  ASN1BitString signatureValue;
  
  public static AttributeCertificate getInstance(Object paramObject) {
    return (paramObject instanceof AttributeCertificate) ? (AttributeCertificate)paramObject : ((paramObject != null) ? new AttributeCertificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public AttributeCertificate(AttributeCertificateInfo paramAttributeCertificateInfo, AlgorithmIdentifier paramAlgorithmIdentifier, ASN1BitString paramASN1BitString) {
    this.acinfo = paramAttributeCertificateInfo;
    this.signatureAlgorithm = paramAlgorithmIdentifier;
    this.signatureValue = paramASN1BitString;
  }
  
  private AttributeCertificate(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("Bad sequence size: " + paramASN1Sequence.size()); 
    this.acinfo = AttributeCertificateInfo.getInstance(paramASN1Sequence.getObjectAt(0));
    this.signatureAlgorithm = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
    this.signatureValue = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public AttributeCertificateInfo getAcinfo() {
    return this.acinfo;
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return this.signatureAlgorithm;
  }
  
  public ASN1BitString getSignatureValue() {
    return this.signatureValue;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.acinfo);
    aSN1EncodableVector.add((ASN1Encodable)this.signatureAlgorithm);
    aSN1EncodableVector.add((ASN1Encodable)this.signatureValue);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\AttributeCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */