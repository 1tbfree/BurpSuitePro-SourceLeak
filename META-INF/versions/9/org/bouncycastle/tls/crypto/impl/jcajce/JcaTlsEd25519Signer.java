package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsEdDSASigner;

public class JcaTlsEd25519Signer extends JcaTlsEdDSASigner {
  public JcaTlsEd25519Signer(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey) {
    super(paramJcaTlsCrypto, paramPrivateKey, (short)7, "Ed25519");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsEd25519Signer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */