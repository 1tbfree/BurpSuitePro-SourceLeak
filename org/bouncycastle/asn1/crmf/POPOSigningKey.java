package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class POPOSigningKey extends ASN1Object {
  private POPOSigningKeyInput poposkInput;
  
  private AlgorithmIdentifier algorithmIdentifier;
  
  private ASN1BitString signature;
  
  private POPOSigningKey(ASN1Sequence paramASN1Sequence) {
    byte b = 0;
    if (paramASN1Sequence.getObjectAt(b) instanceof ASN1TaggedObject) {
      ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)paramASN1Sequence.getObjectAt(b++);
      this.poposkInput = POPOSigningKeyInput.getInstance(ASN1Util.getContextBaseUniversal(aSN1TaggedObject, 0, false, 16));
    } 
    this.algorithmIdentifier = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(b++));
    this.signature = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(b));
  }
  
  public static POPOSigningKey getInstance(Object paramObject) {
    return (paramObject instanceof POPOSigningKey) ? (POPOSigningKey)paramObject : ((paramObject != null) ? new POPOSigningKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static POPOSigningKey getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public POPOSigningKey(POPOSigningKeyInput paramPOPOSigningKeyInput, AlgorithmIdentifier paramAlgorithmIdentifier, ASN1BitString paramASN1BitString) {
    this.poposkInput = paramPOPOSigningKeyInput;
    this.algorithmIdentifier = paramAlgorithmIdentifier;
    this.signature = paramASN1BitString;
  }
  
  public POPOSigningKeyInput getPoposkInput() {
    return this.poposkInput;
  }
  
  public AlgorithmIdentifier getAlgorithmIdentifier() {
    return this.algorithmIdentifier;
  }
  
  public ASN1BitString getSignature() {
    return this.signature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    if (this.poposkInput != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)this.poposkInput)); 
    aSN1EncodableVector.add((ASN1Encodable)this.algorithmIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)this.signature);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\crmf\POPOSigningKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */