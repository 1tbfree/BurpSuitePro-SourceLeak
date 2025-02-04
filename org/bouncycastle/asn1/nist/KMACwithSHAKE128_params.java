package org.bouncycastle.asn1.nist;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class KMACwithSHAKE128_params extends ASN1Object {
  private static final byte[] EMPTY_STRING = new byte[0];
  
  private static final int DEF_LENGTH = 256;
  
  private final int outputLength;
  
  private final byte[] customizationString;
  
  public KMACwithSHAKE128_params(int paramInt) {
    this.outputLength = paramInt;
    this.customizationString = EMPTY_STRING;
  }
  
  public KMACwithSHAKE128_params(int paramInt, byte[] paramArrayOfbyte) {
    this.outputLength = paramInt;
    this.customizationString = Arrays.clone(paramArrayOfbyte);
  }
  
  public static KMACwithSHAKE128_params getInstance(Object paramObject) {
    return (paramObject instanceof KMACwithSHAKE128_params) ? (KMACwithSHAKE128_params)paramObject : ((paramObject != null) ? new KMACwithSHAKE128_params(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private KMACwithSHAKE128_params(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() > 2)
      throw new IllegalArgumentException("sequence size greater than 2"); 
    if (paramASN1Sequence.size() == 2) {
      this.outputLength = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
      this.customizationString = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
    } else if (paramASN1Sequence.size() == 1) {
      if (paramASN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
        this.outputLength = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
        this.customizationString = EMPTY_STRING;
      } else {
        this.outputLength = 256;
        this.customizationString = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0)).getOctets());
      } 
    } else {
      this.outputLength = 256;
      this.customizationString = EMPTY_STRING;
    } 
  }
  
  public int getOutputLength() {
    return this.outputLength;
  }
  
  public byte[] getCustomizationString() {
    return Arrays.clone(this.customizationString);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    if (this.outputLength != 256)
      aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.outputLength)); 
    if (this.customizationString.length != 0)
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(getCustomizationString())); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\nist\KMACwithSHAKE128_params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */