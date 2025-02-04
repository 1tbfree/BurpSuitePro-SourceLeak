package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.AuthenticatedData;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.util.io.TeeOutputStream;

public class CMSAuthenticatedDataStreamGenerator extends CMSAuthenticatedGenerator {
  private int bufferSize;
  
  private boolean berEncodeRecipientSet;
  
  private MacCalculator macCalculator;
  
  public void setBufferSize(int paramInt) {
    this.bufferSize = paramInt;
  }
  
  public void setBEREncodeRecipients(boolean paramBoolean) {
    this.berEncodeRecipientSet = paramBoolean;
  }
  
  public OutputStream open(OutputStream paramOutputStream, MacCalculator paramMacCalculator) throws CMSException {
    return open(CMSObjectIdentifiers.data, paramOutputStream, paramMacCalculator);
  }
  
  public OutputStream open(OutputStream paramOutputStream, MacCalculator paramMacCalculator, DigestCalculator paramDigestCalculator) throws CMSException {
    return open(CMSObjectIdentifiers.data, paramOutputStream, paramMacCalculator, paramDigestCalculator);
  }
  
  public OutputStream open(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, MacCalculator paramMacCalculator) throws CMSException {
    return open(paramASN1ObjectIdentifier, paramOutputStream, paramMacCalculator, (DigestCalculator)null);
  }
  
  public OutputStream open(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, MacCalculator paramMacCalculator, DigestCalculator paramDigestCalculator) throws CMSException {
    this.macCalculator = paramMacCalculator;
    try {
      TeeOutputStream teeOutputStream;
      ASN1EncodableVector aSN1EncodableVector = CMSUtils.getRecipentInfos(paramMacCalculator.getKey(), this.recipientInfoGenerators);
      BERSequenceGenerator bERSequenceGenerator1 = new BERSequenceGenerator(paramOutputStream);
      bERSequenceGenerator1.addObject((ASN1Primitive)CMSObjectIdentifiers.authenticatedData);
      BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator1.getRawOutputStream(), 0, true);
      bERSequenceGenerator2.addObject((ASN1Primitive)new ASN1Integer(AuthenticatedData.calculateVersion(this.originatorInfo)));
      CMSUtils.addOriginatorInfoToGenerator(bERSequenceGenerator2, this.originatorInfo);
      CMSUtils.addRecipientInfosToGenerator(aSN1EncodableVector, bERSequenceGenerator2, this.berEncodeRecipientSet);
      AlgorithmIdentifier algorithmIdentifier = paramMacCalculator.getAlgorithmIdentifier();
      bERSequenceGenerator2.getRawOutputStream().write(algorithmIdentifier.getEncoded());
      if (paramDigestCalculator != null)
        bERSequenceGenerator2.addObject((ASN1Primitive)new DERTaggedObject(false, 1, (ASN1Encodable)paramDigestCalculator.getAlgorithmIdentifier())); 
      BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
      bERSequenceGenerator3.addObject((ASN1Primitive)paramASN1ObjectIdentifier);
      OutputStream outputStream = CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this.bufferSize);
      if (paramDigestCalculator != null) {
        teeOutputStream = new TeeOutputStream(outputStream, paramDigestCalculator.getOutputStream());
      } else {
        teeOutputStream = new TeeOutputStream(outputStream, paramMacCalculator.getOutputStream());
      } 
      return new CmsAuthenticatedDataOutputStream(paramMacCalculator, paramDigestCalculator, paramASN1ObjectIdentifier, (OutputStream)teeOutputStream, bERSequenceGenerator1, bERSequenceGenerator2, bERSequenceGenerator3);
    } catch (IOException iOException) {
      throw new CMSException("exception decoding algorithm parameters.", iOException);
    } 
  }
  
  private class CmsAuthenticatedDataOutputStream extends OutputStream {
    private OutputStream dataStream;
    
    private BERSequenceGenerator cGen;
    
    private BERSequenceGenerator envGen;
    
    private BERSequenceGenerator eiGen;
    
    private MacCalculator macCalculator;
    
    private DigestCalculator digestCalculator;
    
    private ASN1ObjectIdentifier contentType;
    
    public CmsAuthenticatedDataOutputStream(MacCalculator param1MacCalculator, DigestCalculator param1DigestCalculator, ASN1ObjectIdentifier param1ASN1ObjectIdentifier, OutputStream param1OutputStream, BERSequenceGenerator param1BERSequenceGenerator1, BERSequenceGenerator param1BERSequenceGenerator2, BERSequenceGenerator param1BERSequenceGenerator3) {
      this.macCalculator = param1MacCalculator;
      this.digestCalculator = param1DigestCalculator;
      this.contentType = param1ASN1ObjectIdentifier;
      this.dataStream = param1OutputStream;
      this.cGen = param1BERSequenceGenerator1;
      this.envGen = param1BERSequenceGenerator2;
      this.eiGen = param1BERSequenceGenerator3;
    }
    
    public void write(int param1Int) throws IOException {
      this.dataStream.write(param1Int);
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      this.dataStream.write(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void write(byte[] param1ArrayOfbyte) throws IOException {
      this.dataStream.write(param1ArrayOfbyte);
    }
    
    public void close() throws IOException {
      Map map;
      this.dataStream.close();
      this.eiGen.close();
      if (this.digestCalculator != null) {
        map = Collections.unmodifiableMap(CMSAuthenticatedDataStreamGenerator.this.getBaseParameters(this.contentType, this.digestCalculator.getAlgorithmIdentifier(), this.macCalculator.getAlgorithmIdentifier(), this.digestCalculator.getDigest()));
        if (CMSAuthenticatedDataStreamGenerator.this.authGen == null)
          CMSAuthenticatedDataStreamGenerator.this.authGen = new DefaultAuthenticatedAttributeTableGenerator(); 
        DERSet dERSet = new DERSet(CMSAuthenticatedDataStreamGenerator.this.authGen.getAttributes(map).toASN1EncodableVector());
        OutputStream outputStream = this.macCalculator.getOutputStream();
        outputStream.write(dERSet.getEncoded("DER"));
        outputStream.close();
        this.envGen.addObject((ASN1Primitive)new DERTaggedObject(false, 2, (ASN1Encodable)dERSet));
      } else {
        map = Collections.EMPTY_MAP;
      } 
      this.envGen.addObject((ASN1Primitive)new DEROctetString(this.macCalculator.getMac()));
      CMSUtils.addAttriSetToGenerator(this.envGen, CMSAuthenticatedDataStreamGenerator.this.unauthGen, 3, map);
      this.envGen.close();
      this.cGen.close();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthenticatedDataStreamGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */