package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class DefaultXMSSMTOid implements XMSSOid {
  private static final Map<String, DefaultXMSSMTOid> oidLookupTable;
  
  private final int oid;
  
  private final String stringRepresentation;
  
  private DefaultXMSSMTOid(int paramInt, String paramString) {
    this.oid = paramInt;
    this.stringRepresentation = paramString;
  }
  
  public static DefaultXMSSMTOid lookup(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramString == null)
      throw new NullPointerException("algorithmName == null"); 
    return oidLookupTable.get(createKey(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5));
  }
  
  private static String createKey(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramString == null)
      throw new NullPointerException("algorithmName == null"); 
    return paramString + "-" + paramInt1 + "-" + paramInt2 + "-" + paramInt3 + "-" + paramInt4 + "-" + paramInt5;
  }
  
  public int getOid() {
    return this.oid;
  }
  
  public String toString() {
    return this.stringRepresentation;
  }
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(createKey("SHA-256", 32, 16, 67, 20, 2), new DefaultXMSSMTOid(1, "XMSSMT_SHA2_20/2_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 20, 4), new DefaultXMSSMTOid(2, "XMSSMT_SHA2_20/4_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 40, 2), new DefaultXMSSMTOid(3, "XMSSMT_SHA2_40/2_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 40, 4), new DefaultXMSSMTOid(4, "XMSSMT_SHA2_40/4_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 40, 8), new DefaultXMSSMTOid(5, "XMSSMT_SHA2_40/8_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 60, 3), new DefaultXMSSMTOid(6, "XMSSMT_SHA2_60/3_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 60, 6), new DefaultXMSSMTOid(7, "XMSSMT_SHA2_60/6_256"));
    hashMap.put(createKey("SHA-256", 32, 16, 67, 60, 12), new DefaultXMSSMTOid(8, "XMSSMT_SHA2_60/12_256"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 20, 2), new DefaultXMSSMTOid(9, "XMSSMT_SHA2_20/2_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 20, 4), new DefaultXMSSMTOid(10, "XMSSMT_SHA2_20/4_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 40, 2), new DefaultXMSSMTOid(11, "XMSSMT_SHA2_40/2_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 40, 4), new DefaultXMSSMTOid(12, "XMSSMT_SHA2_40/4_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 40, 8), new DefaultXMSSMTOid(13, "XMSSMT_SHA2_40/8_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 60, 3), new DefaultXMSSMTOid(14, "XMSSMT_SHA2_60/3_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 60, 6), new DefaultXMSSMTOid(15, "XMSSMT_SHA2_60/6_512"));
    hashMap.put(createKey("SHA-512", 64, 16, 131, 60, 12), new DefaultXMSSMTOid(16, "XMSSMT_SHA2_60/12_512"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 20, 2), new DefaultXMSSMTOid(17, "XMSSMT_SHAKE_20/2_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 20, 4), new DefaultXMSSMTOid(18, "XMSSMT_SHAKE_20/4_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 40, 2), new DefaultXMSSMTOid(19, "XMSSMT_SHAKE_40/2_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 40, 4), new DefaultXMSSMTOid(20, "XMSSMT_SHAKE_40/4_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 40, 8), new DefaultXMSSMTOid(21, "XMSSMT_SHAKE_40/8_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 60, 3), new DefaultXMSSMTOid(22, "XMSSMT_SHAKE_60/3_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 60, 6), new DefaultXMSSMTOid(23, "XMSSMT_SHAKE_60/6_256"));
    hashMap.put(createKey("SHAKE128", 32, 16, 67, 60, 12), new DefaultXMSSMTOid(24, "XMSSMT_SHAKE_60/12_256"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 20, 2), new DefaultXMSSMTOid(25, "XMSSMT_SHAKE_20/2_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 20, 4), new DefaultXMSSMTOid(26, "XMSSMT_SHAKE_20/4_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 40, 2), new DefaultXMSSMTOid(27, "XMSSMT_SHAKE_40/2_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 40, 4), new DefaultXMSSMTOid(28, "XMSSMT_SHAKE_40/4_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 40, 8), new DefaultXMSSMTOid(29, "XMSSMT_SHAKE_40/8_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 60, 3), new DefaultXMSSMTOid(30, "XMSSMT_SHAKE_60/3_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 60, 6), new DefaultXMSSMTOid(31, "XMSSMT_SHAKE_60/6_512"));
    hashMap.put(createKey("SHAKE256", 64, 16, 131, 60, 12), new DefaultXMSSMTOid(32, "XMSSMT_SHAKE_60/12_512"));
    oidLookupTable = Collections.unmodifiableMap(hashMap);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xmss\DefaultXMSSMTOid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */