package META-INF.versions.9.org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.crypto.digests.GeneralDigest;
import org.bouncycastle.crypto.digests.Utils;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA256Digest extends GeneralDigest implements SavableDigest {
  private static final int DIGEST_LENGTH = 32;
  
  private int H1;
  
  private int H2;
  
  private int H3;
  
  private int H4;
  
  private int H5;
  
  private int H6;
  
  private int H7;
  
  private int H8;
  
  private int[] X = new int[64];
  
  private int xOff;
  
  static final int[] K = new int[] { 
      1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 
      607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 
      770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 
      113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, 
      -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 
      659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, 
      -1866530822, -1538233109, -1090935817, -965641998 };
  
  public static SavableDigest newInstance() {
    return new org.bouncycastle.crypto.digests.SHA256Digest();
  }
  
  public static SavableDigest newInstance(CryptoServicePurpose paramCryptoServicePurpose) {
    return new org.bouncycastle.crypto.digests.SHA256Digest(paramCryptoServicePurpose);
  }
  
  public static SavableDigest newInstance(Digest paramDigest) {
    if (paramDigest instanceof org.bouncycastle.crypto.digests.SHA256Digest)
      return new org.bouncycastle.crypto.digests.SHA256Digest((org.bouncycastle.crypto.digests.SHA256Digest)paramDigest); 
    throw new IllegalArgumentException("receiver digest not available for input type " + ((paramDigest != null) ? paramDigest.getClass().getName() : "null"));
  }
  
  public static SavableDigest newInstance(byte[] paramArrayOfbyte) {
    return new org.bouncycastle.crypto.digests.SHA256Digest(paramArrayOfbyte);
  }
  
  public SHA256Digest() {
    this(CryptoServicePurpose.ANY);
  }
  
  public SHA256Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    super(paramCryptoServicePurpose);
    CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    reset();
  }
  
  public SHA256Digest(org.bouncycastle.crypto.digests.SHA256Digest paramSHA256Digest) {
    super(paramSHA256Digest);
    copyIn(paramSHA256Digest);
  }
  
  private void copyIn(org.bouncycastle.crypto.digests.SHA256Digest paramSHA256Digest) {
    copyIn(paramSHA256Digest);
    this.H1 = paramSHA256Digest.H1;
    this.H2 = paramSHA256Digest.H2;
    this.H3 = paramSHA256Digest.H3;
    this.H4 = paramSHA256Digest.H4;
    this.H5 = paramSHA256Digest.H5;
    this.H6 = paramSHA256Digest.H6;
    this.H7 = paramSHA256Digest.H7;
    this.H8 = paramSHA256Digest.H8;
    System.arraycopy(paramSHA256Digest.X, 0, this.X, 0, paramSHA256Digest.X.length);
    this.xOff = paramSHA256Digest.xOff;
  }
  
  public SHA256Digest(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    this.H1 = Pack.bigEndianToInt(paramArrayOfbyte, 16);
    this.H2 = Pack.bigEndianToInt(paramArrayOfbyte, 20);
    this.H3 = Pack.bigEndianToInt(paramArrayOfbyte, 24);
    this.H4 = Pack.bigEndianToInt(paramArrayOfbyte, 28);
    this.H5 = Pack.bigEndianToInt(paramArrayOfbyte, 32);
    this.H6 = Pack.bigEndianToInt(paramArrayOfbyte, 36);
    this.H7 = Pack.bigEndianToInt(paramArrayOfbyte, 40);
    this.H8 = Pack.bigEndianToInt(paramArrayOfbyte, 44);
    this.xOff = Pack.bigEndianToInt(paramArrayOfbyte, 48);
    for (byte b = 0; b != this.xOff; b++)
      this.X[b] = Pack.bigEndianToInt(paramArrayOfbyte, 52 + b * 4); 
  }
  
  public String getAlgorithmName() {
    return "SHA-256";
  }
  
  public int getDigestSize() {
    return 32;
  }
  
  protected void processWord(byte[] paramArrayOfbyte, int paramInt) {
    this.X[this.xOff] = Pack.bigEndianToInt(paramArrayOfbyte, paramInt);
    if (++this.xOff == 16)
      processBlock(); 
  }
  
  protected void processLength(long paramLong) {
    if (this.xOff > 14)
      processBlock(); 
    this.X[14] = (int)(paramLong >>> 32L);
    this.X[15] = (int)(paramLong & 0xFFFFFFFFFFFFFFFFL);
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    finish();
    Pack.intToBigEndian(this.H1, paramArrayOfbyte, paramInt);
    Pack.intToBigEndian(this.H2, paramArrayOfbyte, paramInt + 4);
    Pack.intToBigEndian(this.H3, paramArrayOfbyte, paramInt + 8);
    Pack.intToBigEndian(this.H4, paramArrayOfbyte, paramInt + 12);
    Pack.intToBigEndian(this.H5, paramArrayOfbyte, paramInt + 16);
    Pack.intToBigEndian(this.H6, paramArrayOfbyte, paramInt + 20);
    Pack.intToBigEndian(this.H7, paramArrayOfbyte, paramInt + 24);
    Pack.intToBigEndian(this.H8, paramArrayOfbyte, paramInt + 28);
    reset();
    return 32;
  }
  
  public void reset() {
    super.reset();
    this.H1 = 1779033703;
    this.H2 = -1150833019;
    this.H3 = 1013904242;
    this.H4 = -1521486534;
    this.H5 = 1359893119;
    this.H6 = -1694144372;
    this.H7 = 528734635;
    this.H8 = 1541459225;
    this.xOff = 0;
    for (byte b = 0; b != this.X.length; b++)
      this.X[b] = 0; 
  }
  
  protected void processBlock() {
    int i;
    for (i = 16; i <= 63; i++)
      this.X[i] = Theta1(this.X[i - 2]) + this.X[i - 7] + Theta0(this.X[i - 15]) + this.X[i - 16]; 
    i = this.H1;
    int j = this.H2;
    int k = this.H3;
    int m = this.H4;
    int n = this.H5;
    int i1 = this.H6;
    int i2 = this.H7;
    int i3 = this.H8;
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b2 < 8; b2++) {
      i3 += Sum1(n) + Ch(n, i1, i2) + K[b1] + this.X[b1];
      m += i3;
      i3 += Sum0(i) + Maj(i, j, k);
      i2 += Sum1(m) + Ch(m, n, i1) + K[++b1] + this.X[b1];
      k += i2;
      i2 += Sum0(i3) + Maj(i3, i, j);
      i1 += Sum1(k) + Ch(k, m, n) + K[++b1] + this.X[b1];
      j += i1;
      i1 += Sum0(i2) + Maj(i2, i3, i);
      n += Sum1(j) + Ch(j, k, m) + K[++b1] + this.X[b1];
      i += n;
      n += Sum0(i1) + Maj(i1, i2, i3);
      m += Sum1(i) + Ch(i, j, k) + K[++b1] + this.X[b1];
      i3 += m;
      m += Sum0(n) + Maj(n, i1, i2);
      k += Sum1(i3) + Ch(i3, i, j) + K[++b1] + this.X[b1];
      i2 += k;
      k += Sum0(m) + Maj(m, n, i1);
      j += Sum1(i2) + Ch(i2, i3, i) + K[++b1] + this.X[b1];
      i1 += j;
      j += Sum0(k) + Maj(k, m, n);
      i += Sum1(i1) + Ch(i1, i2, i3) + K[++b1] + this.X[b1];
      n += i;
      i += Sum0(j) + Maj(j, k, m);
      b1++;
    } 
    this.H1 += i;
    this.H2 += j;
    this.H3 += k;
    this.H4 += m;
    this.H5 += n;
    this.H6 += i1;
    this.H7 += i2;
    this.H8 += i3;
    this.xOff = 0;
    for (b2 = 0; b2 < 16; b2++)
      this.X[b2] = 0; 
  }
  
  private static int Ch(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 & paramInt2 ^ (paramInt1 ^ 0xFFFFFFFF) & paramInt3;
  }
  
  private static int Maj(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 & paramInt2 | paramInt3 & (paramInt1 ^ paramInt2);
  }
  
  private static int Sum0(int paramInt) {
    return (paramInt >>> 2 | paramInt << 30) ^ (paramInt >>> 13 | paramInt << 19) ^ (paramInt >>> 22 | paramInt << 10);
  }
  
  private static int Sum1(int paramInt) {
    return (paramInt >>> 6 | paramInt << 26) ^ (paramInt >>> 11 | paramInt << 21) ^ (paramInt >>> 25 | paramInt << 7);
  }
  
  private static int Theta0(int paramInt) {
    return (paramInt >>> 7 | paramInt << 25) ^ (paramInt >>> 18 | paramInt << 14) ^ paramInt >>> 3;
  }
  
  private static int Theta1(int paramInt) {
    return (paramInt >>> 17 | paramInt << 15) ^ (paramInt >>> 19 | paramInt << 13) ^ paramInt >>> 10;
  }
  
  public Memoable copy() {
    return (Memoable)new org.bouncycastle.crypto.digests.SHA256Digest(this);
  }
  
  public void reset(Memoable paramMemoable) {
    org.bouncycastle.crypto.digests.SHA256Digest sHA256Digest = (org.bouncycastle.crypto.digests.SHA256Digest)paramMemoable;
    copyIn(sHA256Digest);
  }
  
  public byte[] getEncodedState() {
    byte[] arrayOfByte = new byte[52 + this.xOff * 4 + 1];
    populateState(arrayOfByte);
    Pack.intToBigEndian(this.H1, arrayOfByte, 16);
    Pack.intToBigEndian(this.H2, arrayOfByte, 20);
    Pack.intToBigEndian(this.H3, arrayOfByte, 24);
    Pack.intToBigEndian(this.H4, arrayOfByte, 28);
    Pack.intToBigEndian(this.H5, arrayOfByte, 32);
    Pack.intToBigEndian(this.H6, arrayOfByte, 36);
    Pack.intToBigEndian(this.H7, arrayOfByte, 40);
    Pack.intToBigEndian(this.H8, arrayOfByte, 44);
    Pack.intToBigEndian(this.xOff, arrayOfByte, 48);
    for (byte b = 0; b != this.xOff; b++)
      Pack.intToBigEndian(this.X[b], arrayOfByte, 52 + b * 4); 
    arrayOfByte[arrayOfByte.length - 1] = (byte)this.purpose.ordinal();
    return arrayOfByte;
  }
  
  protected CryptoServiceProperties cryptoServiceProperties() {
    return Utils.getDefaultProperties((Digest)this, 256, this.purpose);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\digests\SHA256Digest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */