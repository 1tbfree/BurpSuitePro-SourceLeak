package org.bouncycastle.tsp.cms;

import org.bouncycastle.tsp.TimeStampToken;

public class ImprintDigestInvalidException extends Exception {
  private TimeStampToken token;
  
  public ImprintDigestInvalidException(String paramString, TimeStampToken paramTimeStampToken) {
    super(paramString);
    this.token = paramTimeStampToken;
  }
  
  public TimeStampToken getTimeStampToken() {
    return this.token;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\cms\ImprintDigestInvalidException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */