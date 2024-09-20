package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.BigIntegers;

public class Point256 extends ASN1Object {
  private final ASN1OctetString x;
  
  private final ASN1OctetString y;
  
  public Point256(ASN1OctetString paramASN1OctetString1, ASN1OctetString paramASN1OctetString2) {
    if (paramASN1OctetString1 == null || (paramASN1OctetString1.getOctets()).length != 32)
      throw new IllegalArgumentException("x must be 32 bytes long"); 
    if (paramASN1OctetString2 == null || (paramASN1OctetString2.getOctets()).length != 32)
      throw new IllegalArgumentException("y must be 32 bytes long"); 
    this.x = paramASN1OctetString1;
    this.y = paramASN1OctetString2;
  }
  
  private Point256(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.x = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    this.y = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
    if ((this.x.getOctets()).length != 32)
      throw new IllegalArgumentException("x must be 32 bytes long"); 
    if ((this.y.getOctets()).length != 32)
      throw new IllegalArgumentException("y must be 32 bytes long"); 
  }
  
  public static Point256 getInstance(Object paramObject) {
    return (paramObject instanceof Point256) ? (Point256)paramObject : ((paramObject != null) ? new Point256(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getX() {
    return this.x;
  }
  
  public ASN1OctetString getY() {
    return this.y;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.x, (ASN1Encodable)this.y });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString x;
    
    private ASN1OctetString y;
    
    public Builder setX(ASN1OctetString param1ASN1OctetString) {
      this.x = param1ASN1OctetString;
      return this;
    }
    
    public Builder setY(ASN1OctetString param1ASN1OctetString) {
      this.y = param1ASN1OctetString;
      return this;
    }
    
    public Builder setX(byte[] param1ArrayOfbyte) {
      this.x = (ASN1OctetString)new DEROctetString(param1ArrayOfbyte);
      return this;
    }
    
    public Builder setY(byte[] param1ArrayOfbyte) {
      this.y = (ASN1OctetString)new DEROctetString(param1ArrayOfbyte);
      return this;
    }
    
    public Builder setX(BigInteger param1BigInteger) {
      return setX(BigIntegers.asUnsignedByteArray(32, param1BigInteger));
    }
    
    public Builder setY(BigInteger param1BigInteger) {
      return setY(BigIntegers.asUnsignedByteArray(32, param1BigInteger));
    }
    
    public Point256 createPoint256() {
      return new Point256(this.x, this.y);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Point256.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */