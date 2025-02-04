package org.bouncycastle.tsp.ers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.bouncycastle.operator.DigestCalculator;

public class ERSFileData extends ERSCachingData {
  private final File content;
  
  public ERSFileData(File paramFile) throws FileNotFoundException {
    if (paramFile.isDirectory())
      throw new IllegalArgumentException("directory not allowed as ERSFileData"); 
    if (!paramFile.exists())
      throw new FileNotFoundException(paramFile.getAbsolutePath() + " does not exist"); 
    if (!paramFile.canRead())
      throw new FileNotFoundException(paramFile.getAbsolutePath() + " is not readable"); 
    this.content = paramFile;
  }
  
  protected byte[] calculateHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    try {
      FileInputStream fileInputStream = new FileInputStream(this.content);
      byte[] arrayOfByte = ERSUtil.calculateDigest(paramDigestCalculator, fileInputStream);
      fileInputStream.close();
      return (paramArrayOfbyte != null) ? ERSUtil.concatPreviousHashes(paramDigestCalculator, paramArrayOfbyte, arrayOfByte) : arrayOfByte;
    } catch (IOException iOException) {
      throw new IllegalStateException("unable to process " + this.content.getAbsolutePath());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSFileData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */