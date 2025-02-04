package META-INF.versions.9.org.bouncycastle.jcajce.provider.config;

import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public interface ConfigurableProvider {
  public static final String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";
  
  public static final String EC_IMPLICITLY_CA = "ecImplicitlyCa";
  
  public static final String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";
  
  public static final String DH_DEFAULT_PARAMS = "DhDefaultParams";
  
  public static final String ACCEPTABLE_EC_CURVES = "acceptableEcCurves";
  
  public static final String ADDITIONAL_EC_PARAMETERS = "additionalEcParameters";
  
  void setParameter(String paramString, Object paramObject);
  
  void addAlgorithm(String paramString1, String paramString2);
  
  void addAlgorithm(String paramString1, String paramString2, Map<String, String> paramMap);
  
  void addAlgorithm(String paramString1, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString2);
  
  void addAlgorithm(String paramString1, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString2, Map<String, String> paramMap);
  
  boolean hasAlgorithm(String paramString1, String paramString2);
  
  void addKeyInfoConverter(ASN1ObjectIdentifier paramASN1ObjectIdentifier, AsymmetricKeyInfoConverter paramAsymmetricKeyInfoConverter);
  
  AsymmetricKeyInfoConverter getKeyInfoConverter(ASN1ObjectIdentifier paramASN1ObjectIdentifier);
  
  void addAttributes(String paramString, Map<String, String> paramMap);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jcajce\provider\config\ConfigurableProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */