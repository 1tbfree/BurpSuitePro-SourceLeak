package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.Certificate;

public class CscaMasterList extends ASN1Object {
  private ASN1Integer version = new ASN1Integer(0L);
  
  private Certificate[] certList;
  
  public static CscaMasterList getInstance(Object paramObject) {
    return (paramObject instanceof CscaMasterList) ? (CscaMasterList)paramObject : ((paramObject != null) ? new CscaMasterList(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private CscaMasterList(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence == null || paramASN1Sequence.size() == 0)
      throw new IllegalArgumentException("null or empty sequence passed."); 
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("Incorrect sequence size: " + paramASN1Sequence.size()); 
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0));
    ASN1Set aSN1Set = ASN1Set.getInstance(paramASN1Sequence.getObjectAt(1));
    this.certList = new Certificate[aSN1Set.size()];
    for (byte b = 0; b < this.certList.length; b++)
      this.certList[b] = Certificate.getInstance(aSN1Set.getObjectAt(b)); 
  }
  
  public CscaMasterList(Certificate[] paramArrayOfCertificate) {
    this.certList = copyCertList(paramArrayOfCertificate);
  }
  
  public int getVersion() {
    return this.version.intValueExact();
  }
  
  public Certificate[] getCertStructs() {
    return copyCertList(this.certList);
  }
  
  private Certificate[] copyCertList(Certificate[] paramArrayOfCertificate) {
    Certificate[] arrayOfCertificate = new Certificate[paramArrayOfCertificate.length];
    for (byte b = 0; b != arrayOfCertificate.length; b++)
      arrayOfCertificate[b] = paramArrayOfCertificate[b]; 
    return arrayOfCertificate;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    aSN1EncodableVector.add((ASN1Encodable)new DERSet((ASN1Encodable[])this.certList));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\icao\CscaMasterList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */