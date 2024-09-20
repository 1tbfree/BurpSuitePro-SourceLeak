package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

class LazyConstructionEnumeration implements Enumeration {
  private ASN1InputStream aIn;
  
  private Object nextObj;
  
  public LazyConstructionEnumeration(byte[] paramArrayOfbyte) {
    this.aIn = new ASN1InputStream(paramArrayOfbyte, true);
    this.nextObj = readObject();
  }
  
  public boolean hasMoreElements() {
    return (this.nextObj != null);
  }
  
  public Object nextElement() {
    if (this.nextObj != null) {
      Object object = this.nextObj;
      this.nextObj = readObject();
      return object;
    } 
    throw new NoSuchElementException();
  }
  
  private Object readObject() {
    try {
      return this.aIn.readObject();
    } catch (IOException iOException) {
      throw new ASN1ParsingException("malformed ASN.1: " + iOException, iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\LazyConstructionEnumeration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */