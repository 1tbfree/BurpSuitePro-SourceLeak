package org.bouncycastle.asn1.crmf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class PKIPublicationInfo extends ASN1Object {
  public static final ASN1Integer dontPublish = new ASN1Integer(0L);
  
  public static final ASN1Integer pleasePublish = new ASN1Integer(1L);
  
  private ASN1Integer action;
  
  private ASN1Sequence pubInfos;
  
  private PKIPublicationInfo(ASN1Sequence paramASN1Sequence) {
    this.action = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() > 1)
      this.pubInfos = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(1)); 
  }
  
  public static PKIPublicationInfo getInstance(Object paramObject) {
    return (paramObject instanceof PKIPublicationInfo) ? (PKIPublicationInfo)paramObject : ((paramObject != null) ? new PKIPublicationInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PKIPublicationInfo(BigInteger paramBigInteger) {
    this(new ASN1Integer(paramBigInteger));
  }
  
  public PKIPublicationInfo(ASN1Integer paramASN1Integer) {
    this.action = paramASN1Integer;
  }
  
  public PKIPublicationInfo(SinglePubInfo paramSinglePubInfo) {
    this((paramSinglePubInfo != null) ? new SinglePubInfo[1] : (SinglePubInfo[])null);
  }
  
  public PKIPublicationInfo(SinglePubInfo[] paramArrayOfSinglePubInfo) {
    this.action = pleasePublish;
    if (paramArrayOfSinglePubInfo != null) {
      this.pubInfos = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfSinglePubInfo);
    } else {
      this.pubInfos = null;
    } 
  }
  
  public ASN1Integer getAction() {
    return this.action;
  }
  
  public SinglePubInfo[] getPubInfos() {
    if (this.pubInfos == null)
      return null; 
    SinglePubInfo[] arrayOfSinglePubInfo = new SinglePubInfo[this.pubInfos.size()];
    for (byte b = 0; b != arrayOfSinglePubInfo.length; b++)
      arrayOfSinglePubInfo[b] = SinglePubInfo.getInstance(this.pubInfos.getObjectAt(b)); 
    return arrayOfSinglePubInfo;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.action);
    if (this.pubInfos != null)
      aSN1EncodableVector.add((ASN1Encodable)this.pubInfos); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\crmf\PKIPublicationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */