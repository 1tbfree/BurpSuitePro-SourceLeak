package org.bouncycastle.asn1;

public class ASN1ParsingException extends IllegalStateException {
  private Throwable cause;
  
  public ASN1ParsingException(String paramString) {
    super(paramString);
  }
  
  public ASN1ParsingException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1ParsingException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */