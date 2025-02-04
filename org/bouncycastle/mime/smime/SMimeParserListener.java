package org.bouncycastle.mime.smime;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.bouncycastle.cms.CMSEnvelopedDataParser;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.OriginatorInformation;
import org.bouncycastle.cms.RecipientInformationStore;
import org.bouncycastle.cms.SignerInformationStore;
import org.bouncycastle.mime.ConstantMimeContext;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeIOException;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.mime.MimeParserListener;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.io.Streams;

public abstract class SMimeParserListener implements MimeParserListener {
  private DigestCalculator[] digestCalculators;
  
  private SMimeMultipartContext parent;
  
  public MimeContext createContext(MimeParserContext paramMimeParserContext, Headers paramHeaders) {
    if (paramHeaders.isMultipart()) {
      this.parent = new SMimeMultipartContext(paramMimeParserContext, paramHeaders);
      this.digestCalculators = this.parent.getDigestCalculators();
      return (MimeContext)this.parent;
    } 
    return (MimeContext)new ConstantMimeContext();
  }
  
  public void object(MimeParserContext paramMimeParserContext, Headers paramHeaders, InputStream paramInputStream) throws IOException {
    try {
      if (paramHeaders.getContentType().equals("application/pkcs7-signature") || paramHeaders.getContentType().equals("application/x-pkcs7-signature")) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        for (byte b = 0; b != this.digestCalculators.length; b++) {
          this.digestCalculators[b].getOutputStream().close();
          hashMap.put(this.digestCalculators[b].getAlgorithmIdentifier().getAlgorithm(), this.digestCalculators[b].getDigest());
        } 
        byte[] arrayOfByte = Streams.readAll(paramInputStream);
        CMSSignedData cMSSignedData = new CMSSignedData(hashMap, arrayOfByte);
        signedData(paramMimeParserContext, paramHeaders, cMSSignedData.getCertificates(), cMSSignedData.getCRLs(), cMSSignedData.getAttributeCertificates(), cMSSignedData.getSignerInfos());
      } else if (paramHeaders.getContentType().equals("application/pkcs7-mime") || paramHeaders.getContentType().equals("application/x-pkcs7-mime")) {
        CMSEnvelopedDataParser cMSEnvelopedDataParser = new CMSEnvelopedDataParser(paramInputStream);
        envelopedData(paramMimeParserContext, paramHeaders, cMSEnvelopedDataParser.getOriginatorInfo(), cMSEnvelopedDataParser.getRecipientInfos());
        cMSEnvelopedDataParser.close();
      } else {
        content(paramMimeParserContext, paramHeaders, paramInputStream);
      } 
    } catch (CMSException cMSException) {
      throw new MimeIOException("CMS failure: " + cMSException.getMessage(), cMSException);
    } 
  }
  
  public void content(MimeParserContext paramMimeParserContext, Headers paramHeaders, InputStream paramInputStream) throws IOException {
    throw new IllegalStateException("content handling not implemented");
  }
  
  public void signedData(MimeParserContext paramMimeParserContext, Headers paramHeaders, Store paramStore1, Store paramStore2, Store paramStore3, SignerInformationStore paramSignerInformationStore) throws IOException, CMSException {
    throw new IllegalStateException("signedData handling not implemented");
  }
  
  public void envelopedData(MimeParserContext paramMimeParserContext, Headers paramHeaders, OriginatorInformation paramOriginatorInformation, RecipientInformationStore paramRecipientInformationStore) throws IOException, CMSException {
    throw new IllegalStateException("envelopedData handling not implemented");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\smime\SMimeParserListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */