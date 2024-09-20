package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.CrossOriginOpenerPolicyStatus")
public class CrossOriginOpenerPolicyStatus {
  @Zvd(Zp = "value")
  public final CrossOriginOpenerPolicyValue value;
  
  @Zvd(Zp = "reportOnlyValue")
  public final CrossOriginOpenerPolicyValue reportOnlyValue;
  
  @Zvd(Zp = "reportingEndpoint")
  @Zj
  public final String reportingEndpoint;
  
  @Zvd(Zp = "reportOnlyReportingEndpoint")
  @Zj
  public final String reportOnlyReportingEndpoint;
  
  @Zox
  public CrossOriginOpenerPolicyStatus(@Zc5(Ze = "value") CrossOriginOpenerPolicyValue paramCrossOriginOpenerPolicyValue1, @Zc5(Ze = "reportOnlyValue") CrossOriginOpenerPolicyValue paramCrossOriginOpenerPolicyValue2, @Zc5(Ze = "reportingEndpoint", ZS = "null") String paramString1, @Zc5(Ze = "reportOnlyReportingEndpoint", ZS = "null") String paramString2) {
    this.value = paramCrossOriginOpenerPolicyValue1;
    this.reportOnlyValue = paramCrossOriginOpenerPolicyValue2;
    this.reportingEndpoint = paramString1;
    this.reportOnlyReportingEndpoint = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\CrossOriginOpenerPolicyStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */