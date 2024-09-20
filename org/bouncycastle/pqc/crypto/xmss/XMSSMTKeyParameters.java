package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class XMSSMTKeyParameters extends AsymmetricKeyParameter {
  private final String treeDigest;
  
  public XMSSMTKeyParameters(boolean paramBoolean, String paramString) {
    super(paramBoolean);
    this.treeDigest = paramString;
  }
  
  public String getTreeDigest() {
    return this.treeDigest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xmss\XMSSMTKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */