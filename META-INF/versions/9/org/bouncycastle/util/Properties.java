package META-INF.versions.9.org.bouncycastle.util;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.bouncycastle.util.Strings;

public class Properties {
  public static final String EMULATE_ORACLE = "org.bouncycastle.emulate.oracle";
  
  private static final ThreadLocal threadProperties = new ThreadLocal();
  
  public static boolean isOverrideSet(String paramString) {
    try {
      return isSetTrue(getPropertyValue(paramString));
    } catch (AccessControlException accessControlException) {
      return false;
    } 
  }
  
  public static boolean isOverrideSetTo(String paramString, boolean paramBoolean) {
    try {
      String str = getPropertyValue(paramString);
      return paramBoolean ? isSetTrue(str) : isSetFalse(str);
    } catch (AccessControlException accessControlException) {
      return false;
    } 
  }
  
  public static boolean setThreadOverride(String paramString, boolean paramBoolean) {
    boolean bool = isOverrideSet(paramString);
    Map<Object, Object> map = threadProperties.get();
    if (map == null) {
      map = new HashMap<>();
      threadProperties.set(map);
    } 
    map.put(paramString, paramBoolean ? "true" : "false");
    return bool;
  }
  
  public static boolean removeThreadOverride(String paramString) {
    Map map = threadProperties.get();
    if (map != null) {
      String str = (String)map.remove(paramString);
      if (str != null) {
        if (map.isEmpty())
          threadProperties.remove(); 
        return "true".equals(Strings.toLowerCase(str));
      } 
    } 
    return false;
  }
  
  public static int asInteger(String paramString, int paramInt) {
    String str = getPropertyValue(paramString);
    return (str != null) ? Integer.parseInt(str) : paramInt;
  }
  
  public static BigInteger asBigInteger(String paramString) {
    String str = getPropertyValue(paramString);
    return (str != null) ? new BigInteger(str) : null;
  }
  
  public static Set<String> asKeySet(String paramString) {
    HashSet<String> hashSet = new HashSet();
    String str = getPropertyValue(paramString);
    if (str != null) {
      StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
      while (stringTokenizer.hasMoreElements())
        hashSet.add(Strings.toLowerCase(stringTokenizer.nextToken()).trim()); 
    } 
    return Collections.unmodifiableSet(hashSet);
  }
  
  public static String getPropertyValue(String paramString) {
    String str = AccessController.<String>doPrivileged((PrivilegedAction<String>)new Object(paramString));
    if (str != null)
      return str; 
    Map map = threadProperties.get();
    if (map != null) {
      String str1 = (String)map.get(paramString);
      if (str1 != null)
        return str1; 
    } 
    return AccessController.<String>doPrivileged((PrivilegedAction<String>)new Object(paramString));
  }
  
  public static String getPropertyValue(String paramString1, String paramString2) {
    String str = getPropertyValue(paramString1);
    return (str == null) ? paramString2 : str;
  }
  
  private static boolean isSetFalse(String paramString) {
    return (paramString == null || paramString.length() != 5) ? false : (((paramString.charAt(0) == 'f' || paramString.charAt(0) == 'F') && (paramString.charAt(1) == 'a' || paramString.charAt(1) == 'A') && (paramString.charAt(2) == 'l' || paramString.charAt(2) == 'L') && (paramString.charAt(3) == 's' || paramString.charAt(3) == 'S') && (paramString.charAt(4) == 'e' || paramString.charAt(4) == 'E')));
  }
  
  private static boolean isSetTrue(String paramString) {
    return (paramString == null || paramString.length() != 4) ? false : (((paramString.charAt(0) == 't' || paramString.charAt(0) == 'T') && (paramString.charAt(1) == 'r' || paramString.charAt(1) == 'R') && (paramString.charAt(2) == 'u' || paramString.charAt(2) == 'U') && (paramString.charAt(3) == 'e' || paramString.charAt(3) == 'E')));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastl\\util\Properties.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */