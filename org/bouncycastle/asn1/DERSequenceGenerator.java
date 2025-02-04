package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DERSequenceGenerator extends DERGenerator {
  private final ByteArrayOutputStream _bOut = new ByteArrayOutputStream();
  
  public DERSequenceGenerator(OutputStream paramOutputStream) throws IOException {
    super(paramOutputStream);
  }
  
  public DERSequenceGenerator(OutputStream paramOutputStream, int paramInt, boolean paramBoolean) throws IOException {
    super(paramOutputStream, paramInt, paramBoolean);
  }
  
  public void addObject(ASN1Encodable paramASN1Encodable) throws IOException {
    paramASN1Encodable.toASN1Primitive().encodeTo(this._bOut, "DER");
  }
  
  public void addObject(ASN1Primitive paramASN1Primitive) throws IOException {
    paramASN1Primitive.encodeTo(this._bOut, "DER");
  }
  
  public OutputStream getRawOutputStream() {
    return this._bOut;
  }
  
  public void close() throws IOException {
    writeDEREncoded(48, this._bOut.toByteArray());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DERSequenceGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */