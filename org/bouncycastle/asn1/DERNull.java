package org.bouncycastle.asn1;

import java.io.IOException;

public class DERNull extends ASN1Null {
  public static final DERNull INSTANCE = new DERNull();
  
  private static final byte[] zeroBytes = new byte[0];
  
  boolean encodeConstructed() {
    return false;
  }
  
  int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, 0);
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 5, zeroBytes);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DERNull.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */