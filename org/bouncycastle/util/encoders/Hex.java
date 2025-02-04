package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

public class Hex {
  private static final HexEncoder encoder = new HexEncoder();
  
  public static String toHexString(byte[] paramArrayOfbyte) {
    return toHexString(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static String toHexString(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = encode(paramArrayOfbyte, paramInt1, paramInt2);
    return Strings.fromByteArray(arrayOfByte);
  }
  
  public static byte[] encode(byte[] paramArrayOfbyte) {
    return encode(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static byte[] encode(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      encoder.encode(paramArrayOfbyte, paramInt1, paramInt2, byteArrayOutputStream);
    } catch (Exception exception) {
      throw new EncoderException("exception encoding Hex string: " + exception.getMessage(), exception);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static int encode(byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    return encoder.encode(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramOutputStream);
  }
  
  public static int encode(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, OutputStream paramOutputStream) throws IOException {
    return encoder.encode(paramArrayOfbyte, paramInt1, paramInt2, paramOutputStream);
  }
  
  public static byte[] decode(byte[] paramArrayOfbyte) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      encoder.decode(paramArrayOfbyte, 0, paramArrayOfbyte.length, byteArrayOutputStream);
    } catch (Exception exception) {
      throw new DecoderException("exception decoding Hex data: " + exception.getMessage(), exception);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] decode(String paramString) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      encoder.decode(paramString, byteArrayOutputStream);
    } catch (Exception exception) {
      throw new DecoderException("exception decoding Hex string: " + exception.getMessage(), exception);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static int decode(String paramString, OutputStream paramOutputStream) throws IOException {
    return encoder.decode(paramString, paramOutputStream);
  }
  
  public static byte[] decodeStrict(String paramString) {
    try {
      return encoder.decodeStrict(paramString, 0, paramString.length());
    } catch (Exception exception) {
      throw new DecoderException("exception decoding Hex string: " + exception.getMessage(), exception);
    } 
  }
  
  public static byte[] decodeStrict(String paramString, int paramInt1, int paramInt2) {
    try {
      return encoder.decodeStrict(paramString, paramInt1, paramInt2);
    } catch (Exception exception) {
      throw new DecoderException("exception decoding Hex string: " + exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\encoders\Hex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */