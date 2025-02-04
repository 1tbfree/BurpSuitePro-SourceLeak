package org.bouncycastle.asn1.cmp;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

public class CMPCertificate extends ASN1Object implements ASN1Choice {
  private Certificate x509v3PKCert;
  
  private int otherTagValue;
  
  private ASN1Object otherCert;
  
  public CMPCertificate(AttributeCertificate paramAttributeCertificate) {
    this(1, (ASN1Object)paramAttributeCertificate);
  }
  
  public CMPCertificate(int paramInt, ASN1Object paramASN1Object) {
    this.otherTagValue = paramInt;
    this.otherCert = paramASN1Object;
  }
  
  public CMPCertificate(Certificate paramCertificate) {
    if (paramCertificate.getVersionNumber() != 3)
      throw new IllegalArgumentException("only version 3 certificates allowed"); 
    this.x509v3PKCert = paramCertificate;
  }
  
  public static CMPCertificate getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    if (paramASN1TaggedObject != null) {
      if (paramBoolean)
        return getInstance(paramASN1TaggedObject.getExplicitBaseObject()); 
      throw new IllegalArgumentException("tag must be explicit");
    } 
    return null;
  }
  
  public static CMPCertificate getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof CMPCertificate)
      return (CMPCertificate)paramObject; 
    if (paramObject instanceof byte[])
      try {
        paramObject = ASN1Primitive.fromByteArray((byte[])paramObject);
      } catch (IOException iOException) {
        throw new IllegalArgumentException("Invalid encoding in CMPCertificate");
      }  
    if (paramObject instanceof org.bouncycastle.asn1.ASN1Sequence)
      return new CMPCertificate(Certificate.getInstance(paramObject)); 
    if (paramObject instanceof ASN1TaggedObject) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(paramObject, 128);
      return new CMPCertificate(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getBaseObject());
    } 
    throw new IllegalArgumentException("Invalid object: " + paramObject.getClass().getName());
  }
  
  public boolean isX509v3PKCert() {
    return (this.x509v3PKCert != null);
  }
  
  public Certificate getX509v3PKCert() {
    return this.x509v3PKCert;
  }
  
  public AttributeCertificate getX509v2AttrCert() {
    return AttributeCertificate.getInstance(this.otherCert);
  }
  
  public int getOtherCertTag() {
    return this.otherTagValue;
  }
  
  public ASN1Object getOtherCert() {
    return this.otherCert;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)((this.otherCert != null) ? new DERTaggedObject(true, this.otherTagValue, (ASN1Encodable)this.otherCert) : this.x509v3PKCert.toASN1Primitive());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CMPCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */