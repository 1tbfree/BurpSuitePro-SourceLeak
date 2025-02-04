package org.bouncycastle.crypto.util;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public abstract class PBKDFConfig {
  private final ASN1ObjectIdentifier algorithm;
  
  protected PBKDFConfig(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.algorithm = paramASN1ObjectIdentifier;
  }
  
  public ASN1ObjectIdentifier getAlgorithm() {
    return this.algorithm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypt\\util\PBKDFConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */