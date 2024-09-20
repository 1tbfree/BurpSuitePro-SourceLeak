package META-INF.versions.9.org.bouncycastle.pqc.crypto.lms;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSSignature;
import org.bouncycastle.util.Encodable;

class LMSSignedPubKey implements Encodable {
  private final LMSSignature signature;
  
  private final LMSPublicKeyParameters publicKey;
  
  public LMSSignedPubKey(LMSSignature paramLMSSignature, LMSPublicKeyParameters paramLMSPublicKeyParameters) {
    this.signature = paramLMSSignature;
    this.publicKey = paramLMSPublicKeyParameters;
  }
  
  public LMSSignature getSignature() {
    return this.signature;
  }
  
  public LMSPublicKeyParameters getPublicKey() {
    return this.publicKey;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey lMSSignedPubKey = (org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey)paramObject;
    return ((this.signature != null) ? !this.signature.equals(lMSSignedPubKey.signature) : (lMSSignedPubKey.signature != null)) ? false : ((this.publicKey != null) ? this.publicKey.equals(lMSSignedPubKey.publicKey) : ((lMSSignedPubKey.publicKey == null)));
  }
  
  public int hashCode() {
    null = (this.signature != null) ? this.signature.hashCode() : 0;
    return 31 * null + ((this.publicKey != null) ? this.publicKey.hashCode() : 0);
  }
  
  public byte[] getEncoded() throws IOException {
    return Composer.compose().bytes(this.signature.getEncoded()).bytes(this.publicKey.getEncoded()).build();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\lms\LMSSignedPubKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */