package org.bouncycastle.pqc.crypto.sphincsplus;

class SIG_FORS {
  final byte[][] authPath;
  
  final byte[] sk;
  
  SIG_FORS(byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1) {
    this.authPath = paramArrayOfbyte1;
    this.sk = paramArrayOfbyte;
  }
  
  byte[] getSK() {
    return this.sk;
  }
  
  public byte[][] getAuthPath() {
    return this.authPath;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SIG_FORS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */