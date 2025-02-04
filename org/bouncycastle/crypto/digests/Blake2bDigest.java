package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

public class Blake2bDigest implements ExtendedDigest {
  private static final long[] blake2b_IV = new long[] { 7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L };
  
  private static final byte[][] blake2b_sigma = new byte[][] { 
      { 
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
        10, 11, 12, 13, 14, 15 }, { 
        14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 
        0, 2, 11, 7, 5, 3 }, { 
        11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 
        3, 6, 7, 1, 9, 4 }, { 
        7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 
        5, 10, 4, 0, 15, 8 }, { 
        9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 
        11, 12, 6, 8, 3, 13 }, { 
        2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 
        7, 5, 15, 14, 1, 9 }, { 
        12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 
        6, 3, 9, 2, 8, 11 }, { 
        13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 
        15, 4, 8, 6, 2, 10 }, { 
        6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 
        13, 7, 1, 4, 10, 5 }, { 
        10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 
        9, 14, 3, 12, 13, 0 }, 
      { 
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
        10, 11, 12, 13, 14, 15 }, { 
        14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 
        0, 2, 11, 7, 5, 3 } };
  
  private static int ROUNDS = 12;
  
  private static final int BLOCK_LENGTH_BYTES = 128;
  
  private int digestLength = 64;
  
  private int keyLength = 0;
  
  private byte[] salt = null;
  
  private byte[] personalization = null;
  
  private byte[] key = null;
  
  private int fanout = 1;
  
  private int depth = 1;
  
  private int leafLength = 0;
  
  private long nodeOffset = 0L;
  
  private int nodeDepth = 0;
  
  private int innerHashLength = 0;
  
  private boolean isLastNode = false;
  
  private byte[] buffer = null;
  
  private int bufferPos = 0;
  
  private long[] internalState = new long[16];
  
  private long[] chainValue = null;
  
  private long t0 = 0L;
  
  private long t1 = 0L;
  
  private long f0 = 0L;
  
  private long f1 = 0L;
  
  private final CryptoServicePurpose purpose;
  
  public Blake2bDigest() {
    this(512, CryptoServicePurpose.ANY);
  }
  
  public Blake2bDigest(int paramInt) {
    this(paramInt, CryptoServicePurpose.ANY);
  }
  
  public Blake2bDigest(Blake2bDigest paramBlake2bDigest) {
    this.bufferPos = paramBlake2bDigest.bufferPos;
    this.buffer = Arrays.clone(paramBlake2bDigest.buffer);
    this.keyLength = paramBlake2bDigest.keyLength;
    this.key = Arrays.clone(paramBlake2bDigest.key);
    this.digestLength = paramBlake2bDigest.digestLength;
    this.chainValue = Arrays.clone(paramBlake2bDigest.chainValue);
    this.personalization = Arrays.clone(paramBlake2bDigest.personalization);
    this.salt = Arrays.clone(paramBlake2bDigest.salt);
    this.t0 = paramBlake2bDigest.t0;
    this.t1 = paramBlake2bDigest.t1;
    this.f0 = paramBlake2bDigest.f0;
    this.purpose = paramBlake2bDigest.purpose;
  }
  
  public Blake2bDigest(int paramInt, CryptoServicePurpose paramCryptoServicePurpose) {
    this.purpose = paramCryptoServicePurpose;
    if (paramInt < 8 || paramInt > 512 || paramInt % 8 != 0)
      throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512"); 
    this.buffer = new byte[128];
    this.keyLength = 0;
    this.digestLength = paramInt / 8;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties((Digest)this, paramInt, paramCryptoServicePurpose));
    init();
  }
  
  public Blake2bDigest(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, CryptoServicePurpose.ANY);
  }
  
  public Blake2bDigest(byte[] paramArrayOfbyte, CryptoServicePurpose paramCryptoServicePurpose) {
    this.buffer = new byte[128];
    if (paramArrayOfbyte != null) {
      this.key = new byte[paramArrayOfbyte.length];
      System.arraycopy(paramArrayOfbyte, 0, this.key, 0, paramArrayOfbyte.length);
      if (paramArrayOfbyte.length > 64)
        throw new IllegalArgumentException("Keys > 64 are not supported"); 
      this.keyLength = paramArrayOfbyte.length;
      System.arraycopy(paramArrayOfbyte, 0, this.buffer, 0, paramArrayOfbyte.length);
      this.bufferPos = 128;
    } 
    this.purpose = paramCryptoServicePurpose;
    this.digestLength = 64;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties((Digest)this, this.digestLength * 8, paramCryptoServicePurpose));
    init();
  }
  
  public Blake2bDigest(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this(paramArrayOfbyte1, paramInt, paramArrayOfbyte2, paramArrayOfbyte3, CryptoServicePurpose.ANY);
  }
  
  public Blake2bDigest(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, CryptoServicePurpose paramCryptoServicePurpose) {
    this.purpose = paramCryptoServicePurpose;
    this.buffer = new byte[128];
    if (paramInt < 1 || paramInt > 64)
      throw new IllegalArgumentException("Invalid digest length (required: 1 - 64)"); 
    this.digestLength = paramInt;
    if (paramArrayOfbyte2 != null) {
      if (paramArrayOfbyte2.length != 16)
        throw new IllegalArgumentException("salt length must be exactly 16 bytes"); 
      this.salt = new byte[16];
      System.arraycopy(paramArrayOfbyte2, 0, this.salt, 0, paramArrayOfbyte2.length);
    } 
    if (paramArrayOfbyte3 != null) {
      if (paramArrayOfbyte3.length != 16)
        throw new IllegalArgumentException("personalization length must be exactly 16 bytes"); 
      this.personalization = new byte[16];
      System.arraycopy(paramArrayOfbyte3, 0, this.personalization, 0, paramArrayOfbyte3.length);
    } 
    if (paramArrayOfbyte1 != null) {
      this.key = new byte[paramArrayOfbyte1.length];
      System.arraycopy(paramArrayOfbyte1, 0, this.key, 0, paramArrayOfbyte1.length);
      if (paramArrayOfbyte1.length > 64)
        throw new IllegalArgumentException("Keys > 64 are not supported"); 
      this.keyLength = paramArrayOfbyte1.length;
      System.arraycopy(paramArrayOfbyte1, 0, this.buffer, 0, paramArrayOfbyte1.length);
      this.bufferPos = 128;
    } 
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties((Digest)this, paramInt * 8, paramCryptoServicePurpose));
    init();
  }
  
  public Blake2bDigest(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.buffer = new byte[128];
    this.purpose = CryptoServicePurpose.ANY;
    this.digestLength = paramArrayOfbyte2[0];
    this.keyLength = paramArrayOfbyte2[1];
    this.fanout = paramArrayOfbyte2[2];
    this.depth = paramArrayOfbyte2[3];
    this.leafLength = Pack.littleEndianToInt(paramArrayOfbyte2, 4);
    this.nodeOffset |= Pack.littleEndianToInt(paramArrayOfbyte2, 8);
    this.nodeDepth = paramArrayOfbyte2[16];
    this.innerHashLength = paramArrayOfbyte2[17];
    init();
  }
  
  private void init() {
    if (this.chainValue == null) {
      this.chainValue = new long[8];
      this.chainValue[0] = blake2b_IV[0] ^ (this.digestLength | this.keyLength << 8 | this.fanout << 16 | this.depth << 24 | this.leafLength << 32);
      this.chainValue[1] = blake2b_IV[1] ^ this.nodeOffset;
      this.chainValue[2] = blake2b_IV[2] ^ (this.nodeDepth | this.innerHashLength << 8);
      this.chainValue[3] = blake2b_IV[3];
      this.chainValue[4] = blake2b_IV[4];
      this.chainValue[5] = blake2b_IV[5];
      if (this.salt != null) {
        this.chainValue[4] = this.chainValue[4] ^ Pack.littleEndianToLong(this.salt, 0);
        this.chainValue[5] = this.chainValue[5] ^ Pack.littleEndianToLong(this.salt, 8);
      } 
      this.chainValue[6] = blake2b_IV[6];
      this.chainValue[7] = blake2b_IV[7];
      if (this.personalization != null) {
        this.chainValue[6] = this.chainValue[6] ^ Pack.littleEndianToLong(this.personalization, 0);
        this.chainValue[7] = this.chainValue[7] ^ Pack.littleEndianToLong(this.personalization, 8);
      } 
    } 
  }
  
  private void initializeInternalState() {
    System.arraycopy(this.chainValue, 0, this.internalState, 0, this.chainValue.length);
    System.arraycopy(blake2b_IV, 0, this.internalState, this.chainValue.length, 4);
    this.internalState[12] = this.t0 ^ blake2b_IV[4];
    this.internalState[13] = this.t1 ^ blake2b_IV[5];
    this.internalState[14] = this.f0 ^ blake2b_IV[6];
    this.internalState[15] = this.f1 ^ blake2b_IV[7];
  }
  
  public void update(byte paramByte) {
    int i = 0;
    i = 128 - this.bufferPos;
    if (i == 0) {
      this.t0 += 128L;
      if (this.t0 == 0L)
        this.t1++; 
      compress(this.buffer, 0);
      Arrays.fill(this.buffer, (byte)0);
      this.buffer[0] = paramByte;
      this.bufferPos = 1;
    } else {
      this.buffer[this.bufferPos] = paramByte;
      this.bufferPos++;
      return;
    } 
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null || paramInt2 == 0)
      return; 
    int i = 0;
    if (this.bufferPos != 0) {
      i = 128 - this.bufferPos;
      if (i < paramInt2) {
        System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, this.bufferPos, i);
        this.t0 += 128L;
        if (this.t0 == 0L)
          this.t1++; 
        compress(this.buffer, 0);
        this.bufferPos = 0;
        Arrays.fill(this.buffer, (byte)0);
      } else {
        System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, this.bufferPos, paramInt2);
        this.bufferPos += paramInt2;
        return;
      } 
    } 
    int k = paramInt1 + paramInt2 - 128;
    int j;
    for (j = paramInt1 + i; j < k; j += 128) {
      this.t0 += 128L;
      if (this.t0 == 0L)
        this.t1++; 
      compress(paramArrayOfbyte, j);
    } 
    System.arraycopy(paramArrayOfbyte, j, this.buffer, 0, paramInt1 + paramInt2 - j);
    this.bufferPos += paramInt1 + paramInt2 - j;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt > paramArrayOfbyte.length - this.digestLength)
      throw new OutputLengthException("output buffer too short"); 
    this.f0 = -1L;
    if (this.isLastNode)
      this.f1 = -1L; 
    this.t0 += this.bufferPos;
    if (this.bufferPos > 0 && this.t0 == 0L)
      this.t1++; 
    compress(this.buffer, 0);
    Arrays.fill(this.buffer, (byte)0);
    Arrays.fill(this.internalState, 0L);
    int i = this.digestLength >>> 3;
    int j = this.digestLength & 0x7;
    Pack.longToLittleEndian(this.chainValue, 0, i, paramArrayOfbyte, paramInt);
    if (j > 0) {
      byte[] arrayOfByte = new byte[8];
      Pack.longToLittleEndian(this.chainValue[i], arrayOfByte, 0);
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt + this.digestLength - j, j);
    } 
    Arrays.fill(this.chainValue, 0L);
    reset();
    return this.digestLength;
  }
  
  public void reset() {
    this.bufferPos = 0;
    this.f0 = 0L;
    this.f1 = 0L;
    this.t0 = 0L;
    this.t1 = 0L;
    this.isLastNode = false;
    this.chainValue = null;
    Arrays.fill(this.buffer, (byte)0);
    if (this.key != null) {
      System.arraycopy(this.key, 0, this.buffer, 0, this.key.length);
      this.bufferPos = 128;
    } 
    init();
  }
  
  private void compress(byte[] paramArrayOfbyte, int paramInt) {
    initializeInternalState();
    long[] arrayOfLong = new long[16];
    Pack.littleEndianToLong(paramArrayOfbyte, paramInt, arrayOfLong);
    byte b;
    for (b = 0; b < ROUNDS; b++) {
      G(arrayOfLong[blake2b_sigma[b][0]], arrayOfLong[blake2b_sigma[b][1]], 0, 4, 8, 12);
      G(arrayOfLong[blake2b_sigma[b][2]], arrayOfLong[blake2b_sigma[b][3]], 1, 5, 9, 13);
      G(arrayOfLong[blake2b_sigma[b][4]], arrayOfLong[blake2b_sigma[b][5]], 2, 6, 10, 14);
      G(arrayOfLong[blake2b_sigma[b][6]], arrayOfLong[blake2b_sigma[b][7]], 3, 7, 11, 15);
      G(arrayOfLong[blake2b_sigma[b][8]], arrayOfLong[blake2b_sigma[b][9]], 0, 5, 10, 15);
      G(arrayOfLong[blake2b_sigma[b][10]], arrayOfLong[blake2b_sigma[b][11]], 1, 6, 11, 12);
      G(arrayOfLong[blake2b_sigma[b][12]], arrayOfLong[blake2b_sigma[b][13]], 2, 7, 8, 13);
      G(arrayOfLong[blake2b_sigma[b][14]], arrayOfLong[blake2b_sigma[b][15]], 3, 4, 9, 14);
    } 
    for (b = 0; b < this.chainValue.length; b++)
      this.chainValue[b] = this.chainValue[b] ^ this.internalState[b] ^ this.internalState[b + 8]; 
  }
  
  private void G(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.internalState[paramInt1] = this.internalState[paramInt1] + this.internalState[paramInt2] + paramLong1;
    this.internalState[paramInt4] = Longs.rotateRight(this.internalState[paramInt4] ^ this.internalState[paramInt1], 32);
    this.internalState[paramInt3] = this.internalState[paramInt3] + this.internalState[paramInt4];
    this.internalState[paramInt2] = Longs.rotateRight(this.internalState[paramInt2] ^ this.internalState[paramInt3], 24);
    this.internalState[paramInt1] = this.internalState[paramInt1] + this.internalState[paramInt2] + paramLong2;
    this.internalState[paramInt4] = Longs.rotateRight(this.internalState[paramInt4] ^ this.internalState[paramInt1], 16);
    this.internalState[paramInt3] = this.internalState[paramInt3] + this.internalState[paramInt4];
    this.internalState[paramInt2] = Longs.rotateRight(this.internalState[paramInt2] ^ this.internalState[paramInt3], 63);
  }
  
  protected void setAsLastNode() {
    this.isLastNode = true;
  }
  
  public String getAlgorithmName() {
    return "BLAKE2b";
  }
  
  public int getDigestSize() {
    return this.digestLength;
  }
  
  public int getByteLength() {
    return 128;
  }
  
  public void clearKey() {
    if (this.key != null) {
      Arrays.fill(this.key, (byte)0);
      Arrays.fill(this.buffer, (byte)0);
    } 
  }
  
  public void clearSalt() {
    if (this.salt != null)
      Arrays.fill(this.salt, (byte)0); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Blake2bDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */