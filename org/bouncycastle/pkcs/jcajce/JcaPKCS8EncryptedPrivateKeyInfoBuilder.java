package org.bouncycastle.pkcs.jcajce;

import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder;

public class JcaPKCS8EncryptedPrivateKeyInfoBuilder extends PKCS8EncryptedPrivateKeyInfoBuilder {
  public JcaPKCS8EncryptedPrivateKeyInfoBuilder(PrivateKey paramPrivateKey) {
    super(PrivateKeyInfo.getInstance(paramPrivateKey.getEncoded()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\jcajce\JcaPKCS8EncryptedPrivateKeyInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */