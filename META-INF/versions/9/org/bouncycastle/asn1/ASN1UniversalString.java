package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.util.Arrays;

public abstract class ASN1UniversalString extends ASN1Primitive implements ASN1String {
  static final ASN1UniversalType TYPE = (ASN1UniversalType)new Object(org.bouncycastle.asn1.ASN1UniversalString.class, 28);
  
  private static final char[] table = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'A', 'B', 'C', 'D', 'E', 'F' };
  
  final byte[] contents;
  
  public static org.bouncycastle.asn1.ASN1UniversalString getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof org.bouncycastle.asn1.ASN1UniversalString)
      return (org.bouncycastle.asn1.ASN1UniversalString)paramObject; 
    if (paramObject instanceof ASN1Encodable) {
      ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
      if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UniversalString)
        return (org.bouncycastle.asn1.ASN1UniversalString)aSN1Primitive; 
    } 
    if (paramObject instanceof byte[])
      try {
        return (org.bouncycastle.asn1.ASN1UniversalString)TYPE.fromByteArray((byte[])paramObject);
      } catch (Exception exception) {
        throw new IllegalArgumentException("encoding error getInstance: " + exception.toString());
      }  
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static org.bouncycastle.asn1.ASN1UniversalString getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return (org.bouncycastle.asn1.ASN1UniversalString)TYPE.getContextInstance(paramASN1TaggedObject, paramBoolean);
  }
  
  ASN1UniversalString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.contents = paramBoolean ? Arrays.clone(paramArrayOfbyte) : paramArrayOfbyte;
  }
  
  public final String getString() {
    int i = this.contents.length;
    StringBuffer stringBuffer = new StringBuffer(3 + 2 * (ASN1OutputStream.getLengthOfDL(i) + i));
    stringBuffer.append("#1C");
    encodeHexDL(stringBuffer, i);
    for (byte b = 0; b < i; b++)
      encodeHexByte(stringBuffer, this.contents[b]); 
    return stringBuffer.toString();
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
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 28, this.contents);
  }
  
  final boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    if (!(paramASN1Primitive instanceof org.bouncycastle.asn1.ASN1UniversalString))
      return false; 
    org.bouncycastle.asn1.ASN1UniversalString aSN1UniversalString = (org.bouncycastle.asn1.ASN1UniversalString)paramASN1Primitive;
    return Arrays.areEqual(this.contents, aSN1UniversalString.contents);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(this.contents);
  }
  
  static org.bouncycastle.asn1.ASN1UniversalString createPrimitive(byte[] paramArrayOfbyte) {
    return (org.bouncycastle.asn1.ASN1UniversalString)new DERUniversalString(paramArrayOfbyte, false);
  }
  
  private static void encodeHexByte(StringBuffer paramStringBuffer, int paramInt) {
    paramStringBuffer.append(table[paramInt >>> 4 & 0xF]);
    paramStringBuffer.append(table[paramInt & 0xF]);
  }
  
  private static void encodeHexDL(StringBuffer paramStringBuffer, int paramInt) {
    if (paramInt < 128) {
      encodeHexByte(paramStringBuffer, paramInt);
      return;
    } 
    byte[] arrayOfByte = new byte[5];
    byte b = 5;
    while (true) {
      arrayOfByte[--b] = (byte)paramInt;
      paramInt >>>= 8;
      if (paramInt == 0) {
        int i = arrayOfByte.length - b;
        arrayOfByte[--b] = (byte)(0x80 | i);
        do {
          encodeHexByte(paramStringBuffer, arrayOfByte[b++]);
        } while (b < arrayOfByte.length);
        return;
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1UniversalString.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */