package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

public final class TnepresEngine extends SerpentEngineBase {
  public String getAlgorithmName() {
    return "Tnepres";
  }
  
  protected int[] makeWorkingKey(byte[] paramArrayOfbyte) throws IllegalArgumentException {
    int[] arrayOfInt1 = new int[16];
    int i = 0;
    byte b1 = 0;
    for (i = paramArrayOfbyte.length - 4; i > 0; i -= 4)
      arrayOfInt1[b1++] = Pack.bigEndianToInt(paramArrayOfbyte, i); 
    if (i == 0) {
      arrayOfInt1[b1++] = Pack.bigEndianToInt(paramArrayOfbyte, 0);
      if (b1 < 8)
        arrayOfInt1[b1] = 1; 
    } else {
      throw new IllegalArgumentException("key must be a multiple of 4 bytes");
    } 
    char c = '';
    int[] arrayOfInt2 = new int[c];
    byte b2;
    for (b2 = 8; b2 < 16; b2++)
      arrayOfInt1[b2] = rotateLeft(arrayOfInt1[b2 - 8] ^ arrayOfInt1[b2 - 5] ^ arrayOfInt1[b2 - 3] ^ arrayOfInt1[b2 - 1] ^ 0x9E3779B9 ^ b2 - 8, 11); 
    System.arraycopy(arrayOfInt1, 8, arrayOfInt2, 0, 8);
    for (b2 = 8; b2 < c; b2++)
      arrayOfInt2[b2] = rotateLeft(arrayOfInt2[b2 - 8] ^ arrayOfInt2[b2 - 5] ^ arrayOfInt2[b2 - 3] ^ arrayOfInt2[b2 - 1] ^ 0x9E3779B9 ^ b2, 11); 
    int[] arrayOfInt3 = new int[4];
    sb3(arrayOfInt3, arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], arrayOfInt2[3]);
    arrayOfInt2[0] = arrayOfInt3[0];
    arrayOfInt2[1] = arrayOfInt3[1];
    arrayOfInt2[2] = arrayOfInt3[2];
    arrayOfInt2[3] = arrayOfInt3[3];
    sb2(arrayOfInt3, arrayOfInt2[4], arrayOfInt2[5], arrayOfInt2[6], arrayOfInt2[7]);
    arrayOfInt2[4] = arrayOfInt3[0];
    arrayOfInt2[5] = arrayOfInt3[1];
    arrayOfInt2[6] = arrayOfInt3[2];
    arrayOfInt2[7] = arrayOfInt3[3];
    sb1(arrayOfInt3, arrayOfInt2[8], arrayOfInt2[9], arrayOfInt2[10], arrayOfInt2[11]);
    arrayOfInt2[8] = arrayOfInt3[0];
    arrayOfInt2[9] = arrayOfInt3[1];
    arrayOfInt2[10] = arrayOfInt3[2];
    arrayOfInt2[11] = arrayOfInt3[3];
    sb0(arrayOfInt3, arrayOfInt2[12], arrayOfInt2[13], arrayOfInt2[14], arrayOfInt2[15]);
    arrayOfInt2[12] = arrayOfInt3[0];
    arrayOfInt2[13] = arrayOfInt3[1];
    arrayOfInt2[14] = arrayOfInt3[2];
    arrayOfInt2[15] = arrayOfInt3[3];
    sb7(arrayOfInt3, arrayOfInt2[16], arrayOfInt2[17], arrayOfInt2[18], arrayOfInt2[19]);
    arrayOfInt2[16] = arrayOfInt3[0];
    arrayOfInt2[17] = arrayOfInt3[1];
    arrayOfInt2[18] = arrayOfInt3[2];
    arrayOfInt2[19] = arrayOfInt3[3];
    sb6(arrayOfInt3, arrayOfInt2[20], arrayOfInt2[21], arrayOfInt2[22], arrayOfInt2[23]);
    arrayOfInt2[20] = arrayOfInt3[0];
    arrayOfInt2[21] = arrayOfInt3[1];
    arrayOfInt2[22] = arrayOfInt3[2];
    arrayOfInt2[23] = arrayOfInt3[3];
    sb5(arrayOfInt3, arrayOfInt2[24], arrayOfInt2[25], arrayOfInt2[26], arrayOfInt2[27]);
    arrayOfInt2[24] = arrayOfInt3[0];
    arrayOfInt2[25] = arrayOfInt3[1];
    arrayOfInt2[26] = arrayOfInt3[2];
    arrayOfInt2[27] = arrayOfInt3[3];
    sb4(arrayOfInt3, arrayOfInt2[28], arrayOfInt2[29], arrayOfInt2[30], arrayOfInt2[31]);
    arrayOfInt2[28] = arrayOfInt3[0];
    arrayOfInt2[29] = arrayOfInt3[1];
    arrayOfInt2[30] = arrayOfInt3[2];
    arrayOfInt2[31] = arrayOfInt3[3];
    sb3(arrayOfInt3, arrayOfInt2[32], arrayOfInt2[33], arrayOfInt2[34], arrayOfInt2[35]);
    arrayOfInt2[32] = arrayOfInt3[0];
    arrayOfInt2[33] = arrayOfInt3[1];
    arrayOfInt2[34] = arrayOfInt3[2];
    arrayOfInt2[35] = arrayOfInt3[3];
    sb2(arrayOfInt3, arrayOfInt2[36], arrayOfInt2[37], arrayOfInt2[38], arrayOfInt2[39]);
    arrayOfInt2[36] = arrayOfInt3[0];
    arrayOfInt2[37] = arrayOfInt3[1];
    arrayOfInt2[38] = arrayOfInt3[2];
    arrayOfInt2[39] = arrayOfInt3[3];
    sb1(arrayOfInt3, arrayOfInt2[40], arrayOfInt2[41], arrayOfInt2[42], arrayOfInt2[43]);
    arrayOfInt2[40] = arrayOfInt3[0];
    arrayOfInt2[41] = arrayOfInt3[1];
    arrayOfInt2[42] = arrayOfInt3[2];
    arrayOfInt2[43] = arrayOfInt3[3];
    sb0(arrayOfInt3, arrayOfInt2[44], arrayOfInt2[45], arrayOfInt2[46], arrayOfInt2[47]);
    arrayOfInt2[44] = arrayOfInt3[0];
    arrayOfInt2[45] = arrayOfInt3[1];
    arrayOfInt2[46] = arrayOfInt3[2];
    arrayOfInt2[47] = arrayOfInt3[3];
    sb7(arrayOfInt3, arrayOfInt2[48], arrayOfInt2[49], arrayOfInt2[50], arrayOfInt2[51]);
    arrayOfInt2[48] = arrayOfInt3[0];
    arrayOfInt2[49] = arrayOfInt3[1];
    arrayOfInt2[50] = arrayOfInt3[2];
    arrayOfInt2[51] = arrayOfInt3[3];
    sb6(arrayOfInt3, arrayOfInt2[52], arrayOfInt2[53], arrayOfInt2[54], arrayOfInt2[55]);
    arrayOfInt2[52] = arrayOfInt3[0];
    arrayOfInt2[53] = arrayOfInt3[1];
    arrayOfInt2[54] = arrayOfInt3[2];
    arrayOfInt2[55] = arrayOfInt3[3];
    sb5(arrayOfInt3, arrayOfInt2[56], arrayOfInt2[57], arrayOfInt2[58], arrayOfInt2[59]);
    arrayOfInt2[56] = arrayOfInt3[0];
    arrayOfInt2[57] = arrayOfInt3[1];
    arrayOfInt2[58] = arrayOfInt3[2];
    arrayOfInt2[59] = arrayOfInt3[3];
    sb4(arrayOfInt3, arrayOfInt2[60], arrayOfInt2[61], arrayOfInt2[62], arrayOfInt2[63]);
    arrayOfInt2[60] = arrayOfInt3[0];
    arrayOfInt2[61] = arrayOfInt3[1];
    arrayOfInt2[62] = arrayOfInt3[2];
    arrayOfInt2[63] = arrayOfInt3[3];
    sb3(arrayOfInt3, arrayOfInt2[64], arrayOfInt2[65], arrayOfInt2[66], arrayOfInt2[67]);
    arrayOfInt2[64] = arrayOfInt3[0];
    arrayOfInt2[65] = arrayOfInt3[1];
    arrayOfInt2[66] = arrayOfInt3[2];
    arrayOfInt2[67] = arrayOfInt3[3];
    sb2(arrayOfInt3, arrayOfInt2[68], arrayOfInt2[69], arrayOfInt2[70], arrayOfInt2[71]);
    arrayOfInt2[68] = arrayOfInt3[0];
    arrayOfInt2[69] = arrayOfInt3[1];
    arrayOfInt2[70] = arrayOfInt3[2];
    arrayOfInt2[71] = arrayOfInt3[3];
    sb1(arrayOfInt3, arrayOfInt2[72], arrayOfInt2[73], arrayOfInt2[74], arrayOfInt2[75]);
    arrayOfInt2[72] = arrayOfInt3[0];
    arrayOfInt2[73] = arrayOfInt3[1];
    arrayOfInt2[74] = arrayOfInt3[2];
    arrayOfInt2[75] = arrayOfInt3[3];
    sb0(arrayOfInt3, arrayOfInt2[76], arrayOfInt2[77], arrayOfInt2[78], arrayOfInt2[79]);
    arrayOfInt2[76] = arrayOfInt3[0];
    arrayOfInt2[77] = arrayOfInt3[1];
    arrayOfInt2[78] = arrayOfInt3[2];
    arrayOfInt2[79] = arrayOfInt3[3];
    sb7(arrayOfInt3, arrayOfInt2[80], arrayOfInt2[81], arrayOfInt2[82], arrayOfInt2[83]);
    arrayOfInt2[80] = arrayOfInt3[0];
    arrayOfInt2[81] = arrayOfInt3[1];
    arrayOfInt2[82] = arrayOfInt3[2];
    arrayOfInt2[83] = arrayOfInt3[3];
    sb6(arrayOfInt3, arrayOfInt2[84], arrayOfInt2[85], arrayOfInt2[86], arrayOfInt2[87]);
    arrayOfInt2[84] = arrayOfInt3[0];
    arrayOfInt2[85] = arrayOfInt3[1];
    arrayOfInt2[86] = arrayOfInt3[2];
    arrayOfInt2[87] = arrayOfInt3[3];
    sb5(arrayOfInt3, arrayOfInt2[88], arrayOfInt2[89], arrayOfInt2[90], arrayOfInt2[91]);
    arrayOfInt2[88] = arrayOfInt3[0];
    arrayOfInt2[89] = arrayOfInt3[1];
    arrayOfInt2[90] = arrayOfInt3[2];
    arrayOfInt2[91] = arrayOfInt3[3];
    sb4(arrayOfInt3, arrayOfInt2[92], arrayOfInt2[93], arrayOfInt2[94], arrayOfInt2[95]);
    arrayOfInt2[92] = arrayOfInt3[0];
    arrayOfInt2[93] = arrayOfInt3[1];
    arrayOfInt2[94] = arrayOfInt3[2];
    arrayOfInt2[95] = arrayOfInt3[3];
    sb3(arrayOfInt3, arrayOfInt2[96], arrayOfInt2[97], arrayOfInt2[98], arrayOfInt2[99]);
    arrayOfInt2[96] = arrayOfInt3[0];
    arrayOfInt2[97] = arrayOfInt3[1];
    arrayOfInt2[98] = arrayOfInt3[2];
    arrayOfInt2[99] = arrayOfInt3[3];
    sb2(arrayOfInt3, arrayOfInt2[100], arrayOfInt2[101], arrayOfInt2[102], arrayOfInt2[103]);
    arrayOfInt2[100] = arrayOfInt3[0];
    arrayOfInt2[101] = arrayOfInt3[1];
    arrayOfInt2[102] = arrayOfInt3[2];
    arrayOfInt2[103] = arrayOfInt3[3];
    sb1(arrayOfInt3, arrayOfInt2[104], arrayOfInt2[105], arrayOfInt2[106], arrayOfInt2[107]);
    arrayOfInt2[104] = arrayOfInt3[0];
    arrayOfInt2[105] = arrayOfInt3[1];
    arrayOfInt2[106] = arrayOfInt3[2];
    arrayOfInt2[107] = arrayOfInt3[3];
    sb0(arrayOfInt3, arrayOfInt2[108], arrayOfInt2[109], arrayOfInt2[110], arrayOfInt2[111]);
    arrayOfInt2[108] = arrayOfInt3[0];
    arrayOfInt2[109] = arrayOfInt3[1];
    arrayOfInt2[110] = arrayOfInt3[2];
    arrayOfInt2[111] = arrayOfInt3[3];
    sb7(arrayOfInt3, arrayOfInt2[112], arrayOfInt2[113], arrayOfInt2[114], arrayOfInt2[115]);
    arrayOfInt2[112] = arrayOfInt3[0];
    arrayOfInt2[113] = arrayOfInt3[1];
    arrayOfInt2[114] = arrayOfInt3[2];
    arrayOfInt2[115] = arrayOfInt3[3];
    sb6(arrayOfInt3, arrayOfInt2[116], arrayOfInt2[117], arrayOfInt2[118], arrayOfInt2[119]);
    arrayOfInt2[116] = arrayOfInt3[0];
    arrayOfInt2[117] = arrayOfInt3[1];
    arrayOfInt2[118] = arrayOfInt3[2];
    arrayOfInt2[119] = arrayOfInt3[3];
    sb5(arrayOfInt3, arrayOfInt2[120], arrayOfInt2[121], arrayOfInt2[122], arrayOfInt2[123]);
    arrayOfInt2[120] = arrayOfInt3[0];
    arrayOfInt2[121] = arrayOfInt3[1];
    arrayOfInt2[122] = arrayOfInt3[2];
    arrayOfInt2[123] = arrayOfInt3[3];
    sb4(arrayOfInt3, arrayOfInt2[124], arrayOfInt2[125], arrayOfInt2[126], arrayOfInt2[127]);
    arrayOfInt2[124] = arrayOfInt3[0];
    arrayOfInt2[125] = arrayOfInt3[1];
    arrayOfInt2[126] = arrayOfInt3[2];
    arrayOfInt2[127] = arrayOfInt3[3];
    sb3(arrayOfInt3, arrayOfInt2[128], arrayOfInt2[129], arrayOfInt2[130], arrayOfInt2[131]);
    arrayOfInt2[128] = arrayOfInt3[0];
    arrayOfInt2[129] = arrayOfInt3[1];
    arrayOfInt2[130] = arrayOfInt3[2];
    arrayOfInt2[131] = arrayOfInt3[3];
    return arrayOfInt2;
  }
  
  protected void encryptBlock(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    int[] arrayOfInt = new int[4];
    arrayOfInt[3] = Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1);
    arrayOfInt[2] = Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1 + 4);
    arrayOfInt[1] = Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1 + 8);
    arrayOfInt[0] = Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1 + 12);
    sb0(arrayOfInt, this.wKey[0] ^ arrayOfInt[0], this.wKey[1] ^ arrayOfInt[1], this.wKey[2] ^ arrayOfInt[2], this.wKey[3] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb1(arrayOfInt, this.wKey[4] ^ arrayOfInt[0], this.wKey[5] ^ arrayOfInt[1], this.wKey[6] ^ arrayOfInt[2], this.wKey[7] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb2(arrayOfInt, this.wKey[8] ^ arrayOfInt[0], this.wKey[9] ^ arrayOfInt[1], this.wKey[10] ^ arrayOfInt[2], this.wKey[11] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb3(arrayOfInt, this.wKey[12] ^ arrayOfInt[0], this.wKey[13] ^ arrayOfInt[1], this.wKey[14] ^ arrayOfInt[2], this.wKey[15] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb4(arrayOfInt, this.wKey[16] ^ arrayOfInt[0], this.wKey[17] ^ arrayOfInt[1], this.wKey[18] ^ arrayOfInt[2], this.wKey[19] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb5(arrayOfInt, this.wKey[20] ^ arrayOfInt[0], this.wKey[21] ^ arrayOfInt[1], this.wKey[22] ^ arrayOfInt[2], this.wKey[23] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb6(arrayOfInt, this.wKey[24] ^ arrayOfInt[0], this.wKey[25] ^ arrayOfInt[1], this.wKey[26] ^ arrayOfInt[2], this.wKey[27] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb7(arrayOfInt, this.wKey[28] ^ arrayOfInt[0], this.wKey[29] ^ arrayOfInt[1], this.wKey[30] ^ arrayOfInt[2], this.wKey[31] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb0(arrayOfInt, this.wKey[32] ^ arrayOfInt[0], this.wKey[33] ^ arrayOfInt[1], this.wKey[34] ^ arrayOfInt[2], this.wKey[35] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb1(arrayOfInt, this.wKey[36] ^ arrayOfInt[0], this.wKey[37] ^ arrayOfInt[1], this.wKey[38] ^ arrayOfInt[2], this.wKey[39] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb2(arrayOfInt, this.wKey[40] ^ arrayOfInt[0], this.wKey[41] ^ arrayOfInt[1], this.wKey[42] ^ arrayOfInt[2], this.wKey[43] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb3(arrayOfInt, this.wKey[44] ^ arrayOfInt[0], this.wKey[45] ^ arrayOfInt[1], this.wKey[46] ^ arrayOfInt[2], this.wKey[47] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb4(arrayOfInt, this.wKey[48] ^ arrayOfInt[0], this.wKey[49] ^ arrayOfInt[1], this.wKey[50] ^ arrayOfInt[2], this.wKey[51] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb5(arrayOfInt, this.wKey[52] ^ arrayOfInt[0], this.wKey[53] ^ arrayOfInt[1], this.wKey[54] ^ arrayOfInt[2], this.wKey[55] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb6(arrayOfInt, this.wKey[56] ^ arrayOfInt[0], this.wKey[57] ^ arrayOfInt[1], this.wKey[58] ^ arrayOfInt[2], this.wKey[59] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb7(arrayOfInt, this.wKey[60] ^ arrayOfInt[0], this.wKey[61] ^ arrayOfInt[1], this.wKey[62] ^ arrayOfInt[2], this.wKey[63] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb0(arrayOfInt, this.wKey[64] ^ arrayOfInt[0], this.wKey[65] ^ arrayOfInt[1], this.wKey[66] ^ arrayOfInt[2], this.wKey[67] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb1(arrayOfInt, this.wKey[68] ^ arrayOfInt[0], this.wKey[69] ^ arrayOfInt[1], this.wKey[70] ^ arrayOfInt[2], this.wKey[71] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb2(arrayOfInt, this.wKey[72] ^ arrayOfInt[0], this.wKey[73] ^ arrayOfInt[1], this.wKey[74] ^ arrayOfInt[2], this.wKey[75] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb3(arrayOfInt, this.wKey[76] ^ arrayOfInt[0], this.wKey[77] ^ arrayOfInt[1], this.wKey[78] ^ arrayOfInt[2], this.wKey[79] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb4(arrayOfInt, this.wKey[80] ^ arrayOfInt[0], this.wKey[81] ^ arrayOfInt[1], this.wKey[82] ^ arrayOfInt[2], this.wKey[83] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb5(arrayOfInt, this.wKey[84] ^ arrayOfInt[0], this.wKey[85] ^ arrayOfInt[1], this.wKey[86] ^ arrayOfInt[2], this.wKey[87] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb6(arrayOfInt, this.wKey[88] ^ arrayOfInt[0], this.wKey[89] ^ arrayOfInt[1], this.wKey[90] ^ arrayOfInt[2], this.wKey[91] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb7(arrayOfInt, this.wKey[92] ^ arrayOfInt[0], this.wKey[93] ^ arrayOfInt[1], this.wKey[94] ^ arrayOfInt[2], this.wKey[95] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb0(arrayOfInt, this.wKey[96] ^ arrayOfInt[0], this.wKey[97] ^ arrayOfInt[1], this.wKey[98] ^ arrayOfInt[2], this.wKey[99] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb1(arrayOfInt, this.wKey[100] ^ arrayOfInt[0], this.wKey[101] ^ arrayOfInt[1], this.wKey[102] ^ arrayOfInt[2], this.wKey[103] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb2(arrayOfInt, this.wKey[104] ^ arrayOfInt[0], this.wKey[105] ^ arrayOfInt[1], this.wKey[106] ^ arrayOfInt[2], this.wKey[107] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb3(arrayOfInt, this.wKey[108] ^ arrayOfInt[0], this.wKey[109] ^ arrayOfInt[1], this.wKey[110] ^ arrayOfInt[2], this.wKey[111] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb4(arrayOfInt, this.wKey[112] ^ arrayOfInt[0], this.wKey[113] ^ arrayOfInt[1], this.wKey[114] ^ arrayOfInt[2], this.wKey[115] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb5(arrayOfInt, this.wKey[116] ^ arrayOfInt[0], this.wKey[117] ^ arrayOfInt[1], this.wKey[118] ^ arrayOfInt[2], this.wKey[119] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb6(arrayOfInt, this.wKey[120] ^ arrayOfInt[0], this.wKey[121] ^ arrayOfInt[1], this.wKey[122] ^ arrayOfInt[2], this.wKey[123] ^ arrayOfInt[3]);
    LT(arrayOfInt);
    sb7(arrayOfInt, this.wKey[124] ^ arrayOfInt[0], this.wKey[125] ^ arrayOfInt[1], this.wKey[126] ^ arrayOfInt[2], this.wKey[127] ^ arrayOfInt[3]);
    Pack.intToBigEndian(this.wKey[131] ^ arrayOfInt[3], paramArrayOfbyte2, paramInt2);
    Pack.intToBigEndian(this.wKey[130] ^ arrayOfInt[2], paramArrayOfbyte2, paramInt2 + 4);
    Pack.intToBigEndian(this.wKey[129] ^ arrayOfInt[1], paramArrayOfbyte2, paramInt2 + 8);
    Pack.intToBigEndian(this.wKey[128] ^ arrayOfInt[0], paramArrayOfbyte2, paramInt2 + 12);
  }
  
  protected void decryptBlock(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    int[] arrayOfInt = new int[4];
    arrayOfInt[3] = this.wKey[131] ^ Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1);
    arrayOfInt[2] = this.wKey[130] ^ Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1 + 4);
    arrayOfInt[1] = this.wKey[129] ^ Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1 + 8);
    arrayOfInt[0] = this.wKey[128] ^ Pack.bigEndianToInt(paramArrayOfbyte1, paramInt1 + 12);
    ib7(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[124];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[125];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[126];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[127];
    inverseLT(arrayOfInt);
    ib6(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[120];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[121];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[122];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[123];
    inverseLT(arrayOfInt);
    ib5(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[116];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[117];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[118];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[119];
    inverseLT(arrayOfInt);
    ib4(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[112];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[113];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[114];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[115];
    inverseLT(arrayOfInt);
    ib3(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[108];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[109];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[110];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[111];
    inverseLT(arrayOfInt);
    ib2(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[104];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[105];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[106];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[107];
    inverseLT(arrayOfInt);
    ib1(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[100];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[101];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[102];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[103];
    inverseLT(arrayOfInt);
    ib0(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[96];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[97];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[98];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[99];
    inverseLT(arrayOfInt);
    ib7(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[92];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[93];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[94];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[95];
    inverseLT(arrayOfInt);
    ib6(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[88];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[89];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[90];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[91];
    inverseLT(arrayOfInt);
    ib5(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[84];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[85];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[86];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[87];
    inverseLT(arrayOfInt);
    ib4(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[80];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[81];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[82];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[83];
    inverseLT(arrayOfInt);
    ib3(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[76];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[77];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[78];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[79];
    inverseLT(arrayOfInt);
    ib2(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[72];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[73];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[74];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[75];
    inverseLT(arrayOfInt);
    ib1(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[68];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[69];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[70];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[71];
    inverseLT(arrayOfInt);
    ib0(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[64];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[65];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[66];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[67];
    inverseLT(arrayOfInt);
    ib7(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[60];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[61];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[62];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[63];
    inverseLT(arrayOfInt);
    ib6(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[56];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[57];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[58];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[59];
    inverseLT(arrayOfInt);
    ib5(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[52];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[53];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[54];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[55];
    inverseLT(arrayOfInt);
    ib4(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[48];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[49];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[50];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[51];
    inverseLT(arrayOfInt);
    ib3(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[44];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[45];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[46];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[47];
    inverseLT(arrayOfInt);
    ib2(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[40];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[41];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[42];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[43];
    inverseLT(arrayOfInt);
    ib1(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[36];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[37];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[38];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[39];
    inverseLT(arrayOfInt);
    ib0(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[32];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[33];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[34];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[35];
    inverseLT(arrayOfInt);
    ib7(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[28];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[29];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[30];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[31];
    inverseLT(arrayOfInt);
    ib6(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[24];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[25];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[26];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[27];
    inverseLT(arrayOfInt);
    ib5(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[20];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[21];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[22];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[23];
    inverseLT(arrayOfInt);
    ib4(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[16];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[17];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[18];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[19];
    inverseLT(arrayOfInt);
    ib3(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[12];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[13];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[14];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[15];
    inverseLT(arrayOfInt);
    ib2(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[8];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[9];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[10];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[11];
    inverseLT(arrayOfInt);
    ib1(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    arrayOfInt[0] = arrayOfInt[0] ^ this.wKey[4];
    arrayOfInt[1] = arrayOfInt[1] ^ this.wKey[5];
    arrayOfInt[2] = arrayOfInt[2] ^ this.wKey[6];
    arrayOfInt[3] = arrayOfInt[3] ^ this.wKey[7];
    inverseLT(arrayOfInt);
    ib0(arrayOfInt, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    Pack.intToBigEndian(arrayOfInt[3] ^ this.wKey[3], paramArrayOfbyte2, paramInt2);
    Pack.intToBigEndian(arrayOfInt[2] ^ this.wKey[2], paramArrayOfbyte2, paramInt2 + 4);
    Pack.intToBigEndian(arrayOfInt[1] ^ this.wKey[1], paramArrayOfbyte2, paramInt2 + 8);
    Pack.intToBigEndian(arrayOfInt[0] ^ this.wKey[0], paramArrayOfbyte2, paramInt2 + 12);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\TnepresEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */