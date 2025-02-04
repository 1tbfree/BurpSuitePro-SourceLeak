package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

public class KeyUsage extends ASN1Object {
  public static final int digitalSignature = 128;
  
  public static final int nonRepudiation = 64;
  
  public static final int keyEncipherment = 32;
  
  public static final int dataEncipherment = 16;
  
  public static final int keyAgreement = 8;
  
  public static final int keyCertSign = 4;
  
  public static final int cRLSign = 2;
  
  public static final int encipherOnly = 1;
  
  public static final int decipherOnly = 32768;
  
  private ASN1BitString bitString;
  
  public static KeyUsage getInstance(Object paramObject) {
    return (paramObject instanceof KeyUsage) ? (KeyUsage)paramObject : ((paramObject != null) ? new KeyUsage(ASN1BitString.getInstance(paramObject)) : null);
  }
  
  public static KeyUsage fromExtensions(Extensions paramExtensions) {
    return getInstance(Extensions.getExtensionParsedValue(paramExtensions, Extension.keyUsage));
  }
  
  public KeyUsage(int paramInt) {
    this.bitString = (ASN1BitString)new DERBitString(paramInt);
  }
  
  private KeyUsage(ASN1BitString paramASN1BitString) {
    this.bitString = paramASN1BitString;
  }
  
  public boolean hasUsages(int paramInt) {
    return ((this.bitString.intValue() & paramInt) == paramInt);
  }
  
  public byte[] getBytes() {
    return this.bitString.getBytes();
  }
  
  public int getPadBits() {
    return this.bitString.getPadBits();
  }
  
  public String toString() {
    byte[] arrayOfByte = this.bitString.getBytes();
    return (arrayOfByte.length == 1) ? ("KeyUsage: 0x" + Integer.toHexString(arrayOfByte[0] & 0xFF)) : ("KeyUsage: 0x" + Integer.toHexString((arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[0] & 0xFF));
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.bitString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\KeyUsage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */