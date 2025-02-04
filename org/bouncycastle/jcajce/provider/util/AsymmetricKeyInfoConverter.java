package org.bouncycastle.jcajce.provider.util;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public interface AsymmetricKeyInfoConverter {
  PrivateKey generatePrivate(PrivateKeyInfo paramPrivateKeyInfo) throws IOException;
  
  PublicKey generatePublic(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provide\\util\AsymmetricKeyInfoConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */