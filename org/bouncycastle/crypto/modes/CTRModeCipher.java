package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.MultiBlockCipher;
import org.bouncycastle.crypto.SkippingStreamCipher;

public interface CTRModeCipher extends MultiBlockCipher, SkippingStreamCipher {
  BlockCipher getUnderlyingCipher();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\CTRModeCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */