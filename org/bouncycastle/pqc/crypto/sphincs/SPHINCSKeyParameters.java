package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class SPHINCSKeyParameters extends AsymmetricKeyParameter {
  public static final String SHA512_256 = "SHA-512/256";
  
  public static final String SHA3_256 = "SHA3-256";
  
  private final String treeDigest;
  
  protected SPHINCSKeyParameters(boolean paramBoolean, String paramString) {
    super(paramBoolean);
    this.treeDigest = paramString;
  }
  
  public String getTreeDigest() {
    return this.treeDigest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincs\SPHINCSKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */