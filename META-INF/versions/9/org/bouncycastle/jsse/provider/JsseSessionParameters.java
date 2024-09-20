package META-INF.versions.9.org.bouncycastle.jsse.provider;

import org.bouncycastle.jsse.BCSNIServerName;

class JsseSessionParameters {
  private final String endpointIDAlgorithm;
  
  private final BCSNIServerName matchedSNIServerName;
  
  JsseSessionParameters(String paramString, BCSNIServerName paramBCSNIServerName) {
    this.endpointIDAlgorithm = paramString;
    this.matchedSNIServerName = paramBCSNIServerName;
  }
  
  public String getEndpointIDAlgorithm() {
    return this.endpointIDAlgorithm;
  }
  
  public BCSNIServerName getMatchedSNIServerName() {
    return this.matchedSNIServerName;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\JsseSessionParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */