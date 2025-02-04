package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public abstract class ASN1NumericString extends ASN1Primitive implements ASN1String {
  static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1NumericString.class, 18) {
      ASN1Primitive fromImplicitPrimitive(DEROctetString param1DEROctetString) {
        return ASN1NumericString.createPrimitive(param1DEROctetString.getOctets());
      }
    };
  
  final byte[] contents;
  
  public static ASN1NumericString getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof ASN1NumericString)
      return (ASN1NumericString)paramObject; 
    if (paramObject instanceof ASN1Encodable) {
      ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
      if (aSN1Primitive instanceof ASN1NumericString)
        return (ASN1NumericString)aSN1Primitive; 
    } 
    if (paramObject instanceof byte[])
      try {
        return (ASN1NumericString)TYPE.fromByteArray((byte[])paramObject);
      } catch (Exception exception) {
        throw new IllegalArgumentException("encoding error in getInstance: " + exception.toString());
      }  
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static ASN1NumericString getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return (ASN1NumericString)TYPE.getContextInstance(paramASN1TaggedObject, paramBoolean);
  }
  
  ASN1NumericString(String paramString, boolean paramBoolean) {
    if (paramBoolean && !isNumericString(paramString))
      throw new IllegalArgumentException("string contains illegal characters"); 
    this.contents = Strings.toByteArray(paramString);
  }
  
  ASN1NumericString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.contents = paramBoolean ? Arrays.clone(paramArrayOfbyte) : paramArrayOfbyte;
  }
  
  public final String getString() {
    return Strings.fromByteArray(this.contents);
  }
  
  public String toString() {
    return getString();
  }
  
  public final byte[] getOctets() {
    return Arrays.clone(this.contents);
  }
  
  final boolean encodeConstructed() {
    return false;
  }
  
  final int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, this.contents.length);
  }
  
  final void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 18, this.contents);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(this.contents);
  }
  
  final boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    if (!(paramASN1Primitive instanceof ASN1NumericString))
      return false; 
    ASN1NumericString aSN1NumericString = (ASN1NumericString)paramASN1Primitive;
    return Arrays.areEqual(this.contents, aSN1NumericString.contents);
  }
  
  public static boolean isNumericString(String paramString) {
    int i = paramString.length() - 1;
    while (i >= 0) {
      char c = paramString.charAt(i);
      if (c > '')
        return false; 
      if (('0' <= c && c <= '9') || c == ' ') {
        i--;
        continue;
      } 
      return false;
    } 
    return true;
  }
  
  static boolean isNumericString(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      switch (paramArrayOfbyte[b]) {
        case 32:
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 54:
        case 55:
        case 56:
        case 57:
          break;
        default:
          return false;
      } 
    } 
    return true;
  }
  
  static ASN1NumericString createPrimitive(byte[] paramArrayOfbyte) {
    return new DERNumericString(paramArrayOfbyte, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1NumericString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */