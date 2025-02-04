package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class BERSequenceGenerator extends BERGenerator {
  public BERSequenceGenerator(OutputStream paramOutputStream) throws IOException {
    super(paramOutputStream);
    writeBERHeader(48);
  }
  
  public BERSequenceGenerator(OutputStream paramOutputStream, int paramInt, boolean paramBoolean) throws IOException {
    super(paramOutputStream, paramInt, paramBoolean);
    writeBERHeader(48);
  }
  
  public void addObject(ASN1Encodable paramASN1Encodable) throws IOException {
    paramASN1Encodable.toASN1Primitive().encodeTo(this._out);
  }
  
  public void addObject(ASN1Primitive paramASN1Primitive) throws IOException {
    paramASN1Primitive.encodeTo(this._out);
  }
  
  public void close() throws IOException {
    writeBEREnd();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\BERSequenceGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */