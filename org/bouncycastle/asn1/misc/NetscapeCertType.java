package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.DERBitString;

public class NetscapeCertType extends DERBitString {
  public static final int sslClient = 128;
  
  public static final int sslServer = 64;
  
  public static final int smime = 32;
  
  public static final int objectSigning = 16;
  
  public static final int reserved = 8;
  
  public static final int sslCA = 4;
  
  public static final int smimeCA = 2;
  
  public static final int objectSigningCA = 1;
  
  public NetscapeCertType(int paramInt) {
    super(getBytes(paramInt), getPadBits(paramInt));
  }
  
  public NetscapeCertType(ASN1BitString paramASN1BitString) {
    super(paramASN1BitString.getBytes(), paramASN1BitString.getPadBits());
  }
  
  public boolean hasUsages(int paramInt) {
    return ((intValue() & paramInt) == paramInt);
  }
  
  public String toString() {
    return "NetscapeCertType: 0x" + Integer.toHexString(intValue());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\misc\NetscapeCertType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */