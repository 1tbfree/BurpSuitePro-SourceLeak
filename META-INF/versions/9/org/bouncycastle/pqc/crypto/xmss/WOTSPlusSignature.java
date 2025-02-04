package META-INF.versions.9.org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

final class WOTSPlusSignature {
  private byte[][] signature;
  
  protected WOTSPlusSignature(WOTSPlusParameters paramWOTSPlusParameters, byte[][] paramArrayOfbyte) {
    if (paramWOTSPlusParameters == null)
      throw new NullPointerException("params == null"); 
    if (paramArrayOfbyte == null)
      throw new NullPointerException("signature == null"); 
    if (XMSSUtil.hasNullPointer(paramArrayOfbyte))
      throw new NullPointerException("signature byte array == null"); 
    if (paramArrayOfbyte.length != paramWOTSPlusParameters.getLen())
      throw new IllegalArgumentException("wrong signature size"); 
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if ((paramArrayOfbyte[b]).length != paramWOTSPlusParameters.getTreeDigestSize())
        throw new IllegalArgumentException("wrong signature format"); 
    } 
    this.signature = XMSSUtil.cloneArray(paramArrayOfbyte);
  }
  
  public byte[][] toByteArray() {
    return XMSSUtil.cloneArray(this.signature);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\xmss\WOTSPlusSignature.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */