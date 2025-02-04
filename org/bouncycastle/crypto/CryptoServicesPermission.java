package org.bouncycastle.crypto;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

public class CryptoServicesPermission extends Permission {
  public static final String GLOBAL_CONFIG = "globalConfig";
  
  public static final String THREAD_LOCAL_CONFIG = "threadLocalConfig";
  
  public static final String DEFAULT_RANDOM = "defaultRandomConfig";
  
  public static final String CONSTRAINTS = "constraints";
  
  private final Set<String> actions = new HashSet<>();
  
  public CryptoServicesPermission(String paramString) {
    super(paramString);
    this.actions.add(paramString);
  }
  
  public boolean implies(Permission paramPermission) {
    if (paramPermission instanceof CryptoServicesPermission) {
      CryptoServicesPermission cryptoServicesPermission = (CryptoServicesPermission)paramPermission;
      if (getName().equals(cryptoServicesPermission.getName()))
        return true; 
      if (this.actions.containsAll(cryptoServicesPermission.actions))
        return true; 
    } 
    return false;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof CryptoServicesPermission) {
      CryptoServicesPermission cryptoServicesPermission = (CryptoServicesPermission)paramObject;
      if (this.actions.equals(cryptoServicesPermission.actions))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return this.actions.hashCode();
  }
  
  public String getActions() {
    return this.actions.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\CryptoServicesPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */