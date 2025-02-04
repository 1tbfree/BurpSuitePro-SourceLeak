package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

public class X500Name extends ASN1Object implements ASN1Choice {
  private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
  
  private boolean isHashCodeCalculated;
  
  private int hashCodeValue;
  
  private X500NameStyle style;
  
  private RDN[] rdns;
  
  private DERSequence rdnSeq;
  
  public X500Name(X500NameStyle paramX500NameStyle, X500Name paramX500Name) {
    this.style = paramX500NameStyle;
    this.rdns = paramX500Name.rdns;
    this.rdnSeq = paramX500Name.rdnSeq;
  }
  
  public static X500Name getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, true));
  }
  
  public static X500Name getInstance(Object paramObject) {
    return (paramObject instanceof X500Name) ? (X500Name)paramObject : ((paramObject != null) ? new X500Name(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static X500Name getInstance(X500NameStyle paramX500NameStyle, Object paramObject) {
    return (paramObject instanceof X500Name) ? new X500Name(paramX500NameStyle, (X500Name)paramObject) : ((paramObject != null) ? new X500Name(paramX500NameStyle, ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private X500Name(ASN1Sequence paramASN1Sequence) {
    this(defaultStyle, paramASN1Sequence);
  }
  
  private X500Name(X500NameStyle paramX500NameStyle, ASN1Sequence paramASN1Sequence) {
    int i = paramASN1Sequence.size();
    this.style = paramX500NameStyle;
    this.rdns = new RDN[i];
    int j = 1;
    for (byte b = 0; b < i; b++) {
      ASN1Encodable aSN1Encodable = paramASN1Sequence.getObjectAt(b);
      RDN rDN = RDN.getInstance(aSN1Encodable);
      j &= (rDN == aSN1Encodable) ? 1 : 0;
      this.rdns[b] = rDN;
    } 
    if (j != 0) {
      this.rdnSeq = DERSequence.convert(paramASN1Sequence);
    } else {
      this.rdnSeq = new DERSequence((ASN1Encodable[])this.rdns);
    } 
  }
  
  public X500Name(RDN[] paramArrayOfRDN) {
    this(defaultStyle, paramArrayOfRDN);
  }
  
  public X500Name(X500NameStyle paramX500NameStyle, RDN[] paramArrayOfRDN) {
    this.style = paramX500NameStyle;
    this.rdns = (RDN[])paramArrayOfRDN.clone();
    this.rdnSeq = new DERSequence((ASN1Encodable[])this.rdns);
  }
  
  public X500Name(String paramString) {
    this(defaultStyle, paramString);
  }
  
  public X500Name(X500NameStyle paramX500NameStyle, String paramString) {
    this(paramX500NameStyle.fromString(paramString));
    this.style = paramX500NameStyle;
  }
  
  public RDN[] getRDNs() {
    return (RDN[])this.rdns.clone();
  }
  
  public ASN1ObjectIdentifier[] getAttributeTypes() {
    int i = this.rdns.length;
    int j = 0;
    for (byte b1 = 0; b1 < i; b1++) {
      RDN rDN = this.rdns[b1];
      j += rDN.size();
    } 
    ASN1ObjectIdentifier[] arrayOfASN1ObjectIdentifier = new ASN1ObjectIdentifier[j];
    int k = 0;
    for (byte b2 = 0; b2 < i; b2++) {
      RDN rDN = this.rdns[b2];
      k += rDN.collectAttributeTypes(arrayOfASN1ObjectIdentifier, k);
    } 
    return arrayOfASN1ObjectIdentifier;
  }
  
  public RDN[] getRDNs(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    RDN[] arrayOfRDN = new RDN[this.rdns.length];
    byte b1 = 0;
    for (byte b2 = 0; b2 != this.rdns.length; b2++) {
      RDN rDN = this.rdns[b2];
      if (rDN.containsAttributeType(paramASN1ObjectIdentifier))
        arrayOfRDN[b1++] = rDN; 
    } 
    if (b1 < arrayOfRDN.length) {
      RDN[] arrayOfRDN1 = new RDN[b1];
      System.arraycopy(arrayOfRDN, 0, arrayOfRDN1, 0, arrayOfRDN1.length);
      arrayOfRDN = arrayOfRDN1;
    } 
    return arrayOfRDN;
  }
  
  public int size() {
    return this.rdns.length;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.rdnSeq;
  }
  
  public int hashCode() {
    if (this.isHashCodeCalculated)
      return this.hashCodeValue; 
    this.isHashCodeCalculated = true;
    this.hashCodeValue = this.style.calculateHashCode(this);
    return this.hashCodeValue;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof X500Name) && !(paramObject instanceof ASN1Sequence))
      return false; 
    ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
    if (toASN1Primitive().equals(aSN1Primitive))
      return true; 
    try {
      return this.style.areEqual(this, getInstance(paramObject));
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public String toString() {
    return this.style.toString(this);
  }
  
  public static void setDefaultStyle(X500NameStyle paramX500NameStyle) {
    if (paramX500NameStyle == null)
      throw new NullPointerException("cannot set style to null"); 
    defaultStyle = paramX500NameStyle;
  }
  
  public static X500NameStyle getDefaultStyle() {
    return defaultStyle;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x500\X500Name.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */