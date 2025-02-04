package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

public class ExtCertPathValidatorException extends CertPathValidatorException implements ExtException {
  private Throwable cause;
  
  public ExtCertPathValidatorException(String paramString) {
    super(paramString);
  }
  
  public ExtCertPathValidatorException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public ExtCertPathValidatorException(String paramString, Throwable paramThrowable, CertPath paramCertPath, int paramInt) {
    super(paramString, paramThrowable, paramCertPath, paramInt);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\exception\ExtCertPathValidatorException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */