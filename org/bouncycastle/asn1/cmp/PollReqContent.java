package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class PollReqContent extends ASN1Object {
  private final ASN1Sequence content;
  
  private PollReqContent(ASN1Sequence paramASN1Sequence) {
    this.content = paramASN1Sequence;
  }
  
  public PollReqContent(ASN1Integer paramASN1Integer) {
    this((ASN1Sequence)new DERSequence((ASN1Encodable)new DERSequence((ASN1Encodable)paramASN1Integer)));
  }
  
  public PollReqContent(ASN1Integer[] paramArrayOfASN1Integer) {
    this((ASN1Sequence)new DERSequence((ASN1Encodable[])intsToSequence(paramArrayOfASN1Integer)));
  }
  
  public PollReqContent(BigInteger paramBigInteger) {
    this(new ASN1Integer(paramBigInteger));
  }
  
  public PollReqContent(BigInteger[] paramArrayOfBigInteger) {
    this(intsToASN1(paramArrayOfBigInteger));
  }
  
  public static PollReqContent getInstance(Object paramObject) {
    return (paramObject instanceof PollReqContent) ? (PollReqContent)paramObject : ((paramObject != null) ? new PollReqContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private static ASN1Integer[] sequenceToASN1IntegerArray(ASN1Sequence paramASN1Sequence) {
    ASN1Integer[] arrayOfASN1Integer = new ASN1Integer[paramASN1Sequence.size()];
    for (byte b = 0; b != arrayOfASN1Integer.length; b++)
      arrayOfASN1Integer[b] = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(b)); 
    return arrayOfASN1Integer;
  }
  
  private static DERSequence[] intsToSequence(ASN1Integer[] paramArrayOfASN1Integer) {
    DERSequence[] arrayOfDERSequence = new DERSequence[paramArrayOfASN1Integer.length];
    for (byte b = 0; b != arrayOfDERSequence.length; b++)
      arrayOfDERSequence[b] = new DERSequence((ASN1Encodable)paramArrayOfASN1Integer[b]); 
    return arrayOfDERSequence;
  }
  
  private static ASN1Integer[] intsToASN1(BigInteger[] paramArrayOfBigInteger) {
    ASN1Integer[] arrayOfASN1Integer = new ASN1Integer[paramArrayOfBigInteger.length];
    for (byte b = 0; b != arrayOfASN1Integer.length; b++)
      arrayOfASN1Integer[b] = new ASN1Integer(paramArrayOfBigInteger[b]); 
    return arrayOfASN1Integer;
  }
  
  public ASN1Integer[][] getCertReqIds() {
    ASN1Integer[][] arrayOfASN1Integer = new ASN1Integer[this.content.size()][];
    for (byte b = 0; b != arrayOfASN1Integer.length; b++)
      arrayOfASN1Integer[b] = sequenceToASN1IntegerArray((ASN1Sequence)this.content.getObjectAt(b)); 
    return arrayOfASN1Integer;
  }
  
  public BigInteger[] getCertReqIdValues() {
    BigInteger[] arrayOfBigInteger = new BigInteger[this.content.size()];
    for (byte b = 0; b != arrayOfBigInteger.length; b++)
      arrayOfBigInteger[b] = ASN1Integer.getInstance(ASN1Sequence.getInstance(this.content.getObjectAt(b)).getObjectAt(0)).getValue(); 
    return arrayOfBigInteger;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.content;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\PollReqContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */