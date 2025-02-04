package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class PKIMessages extends ASN1Object {
  private final ASN1Sequence content;
  
  protected PKIMessages(ASN1Sequence paramASN1Sequence) {
    this.content = paramASN1Sequence;
  }
  
  public PKIMessages(PKIMessage paramPKIMessage) {
    this.content = (ASN1Sequence)new DERSequence((ASN1Encodable)paramPKIMessage);
  }
  
  public PKIMessages(PKIMessage[] paramArrayOfPKIMessage) {
    this.content = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfPKIMessage);
  }
  
  public static PKIMessages getInstance(Object paramObject) {
    return (paramObject instanceof PKIMessages) ? (PKIMessages)paramObject : ((paramObject != null) ? new PKIMessages(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PKIMessage[] toPKIMessageArray() {
    PKIMessage[] arrayOfPKIMessage = new PKIMessage[this.content.size()];
    for (byte b = 0; b != arrayOfPKIMessage.length; b++)
      arrayOfPKIMessage[b] = PKIMessage.getInstance(this.content.getObjectAt(b)); 
    return arrayOfPKIMessage;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.content;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\PKIMessages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */