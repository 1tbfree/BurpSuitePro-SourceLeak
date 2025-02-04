package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class TimeStampTokenEvidence extends ASN1Object {
  private TimeStampAndCRL[] timeStampAndCRLs;
  
  public TimeStampTokenEvidence(TimeStampAndCRL[] paramArrayOfTimeStampAndCRL) {
    this.timeStampAndCRLs = copy(paramArrayOfTimeStampAndCRL);
  }
  
  public TimeStampTokenEvidence(TimeStampAndCRL paramTimeStampAndCRL) {
    this.timeStampAndCRLs = new TimeStampAndCRL[1];
    this.timeStampAndCRLs[0] = paramTimeStampAndCRL;
  }
  
  private TimeStampTokenEvidence(ASN1Sequence paramASN1Sequence) {
    this.timeStampAndCRLs = new TimeStampAndCRL[paramASN1Sequence.size()];
    byte b = 0;
    Enumeration enumeration = paramASN1Sequence.getObjects();
    while (enumeration.hasMoreElements())
      this.timeStampAndCRLs[b++] = TimeStampAndCRL.getInstance(enumeration.nextElement()); 
  }
  
  public static TimeStampTokenEvidence getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static TimeStampTokenEvidence getInstance(Object paramObject) {
    return (paramObject instanceof TimeStampTokenEvidence) ? (TimeStampTokenEvidence)paramObject : ((paramObject != null) ? new TimeStampTokenEvidence(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public TimeStampAndCRL[] toTimeStampAndCRLArray() {
    return copy(this.timeStampAndCRLs);
  }
  
  private TimeStampAndCRL[] copy(TimeStampAndCRL[] paramArrayOfTimeStampAndCRL) {
    TimeStampAndCRL[] arrayOfTimeStampAndCRL = new TimeStampAndCRL[paramArrayOfTimeStampAndCRL.length];
    System.arraycopy(paramArrayOfTimeStampAndCRL, 0, arrayOfTimeStampAndCRL, 0, arrayOfTimeStampAndCRL.length);
    return arrayOfTimeStampAndCRL;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.timeStampAndCRLs.length);
    for (byte b = 0; b != this.timeStampAndCRLs.length; b++)
      aSN1EncodableVector.add((ASN1Encodable)this.timeStampAndCRLs[b]); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\TimeStampTokenEvidence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */