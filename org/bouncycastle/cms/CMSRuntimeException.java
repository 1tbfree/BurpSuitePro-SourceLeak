package org.bouncycastle.cms;

public class CMSRuntimeException extends RuntimeException {
  Exception e;
  
  public CMSRuntimeException(String paramString) {
    super(paramString);
  }
  
  public CMSRuntimeException(String paramString, Exception paramException) {
    super(paramString);
    this.e = paramException;
  }
  
  public Exception getUnderlyingException() {
    return this.e;
  }
  
  public Throwable getCause() {
    return this.e;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSRuntimeException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */