package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;

public interface MQVPublicKey extends PublicKey {
  PublicKey getStaticKey();
  
  PublicKey getEphemeralKey();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\interfaces\MQVPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */