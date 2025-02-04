package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException {
  private Throwable cause;
  
  ASN1Exception(String paramString) {
    super(paramString);
  }
  
  ASN1Exception(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1Exception.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */