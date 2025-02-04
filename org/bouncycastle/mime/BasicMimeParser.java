package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.mime.encoding.Base64InputStream;
import org.bouncycastle.mime.encoding.QuotedPrintableInputStream;

public class BasicMimeParser implements MimeParser {
  private final InputStream src;
  
  private final MimeParserContext parserContext;
  
  private final String defaultContentTransferEncoding;
  
  private Headers headers;
  
  private boolean isMultipart = false;
  
  private final String boundary;
  
  public BasicMimeParser(InputStream paramInputStream) throws IOException {
    this(null, new Headers(paramInputStream, "7bit"), paramInputStream);
  }
  
  public BasicMimeParser(MimeParserContext paramMimeParserContext, InputStream paramInputStream) throws IOException {
    this(paramMimeParserContext, new Headers(paramInputStream, paramMimeParserContext.getDefaultContentTransferEncoding()), paramInputStream);
  }
  
  public BasicMimeParser(Headers paramHeaders, InputStream paramInputStream) {
    this(null, paramHeaders, paramInputStream);
  }
  
  public BasicMimeParser(MimeParserContext paramMimeParserContext, Headers paramHeaders, InputStream paramInputStream) {
    if (paramHeaders.isMultipart()) {
      this.isMultipart = true;
      this.boundary = paramHeaders.getBoundary();
    } else {
      this.boundary = null;
    } 
    this.headers = paramHeaders;
    this.parserContext = paramMimeParserContext;
    this.src = paramInputStream;
    this.defaultContentTransferEncoding = (paramMimeParserContext != null) ? paramMimeParserContext.getDefaultContentTransferEncoding() : "7bit";
  }
  
  public void parse(MimeParserListener paramMimeParserListener) throws IOException {
    MimeContext mimeContext = paramMimeParserListener.createContext(this.parserContext, this.headers);
    if (this.isMultipart) {
      MimeMultipartContext mimeMultipartContext = (MimeMultipartContext)mimeContext;
      String str2 = "--" + this.boundary;
      boolean bool = false;
      byte b = 0;
      LineReader lineReader = new LineReader(this.src);
      String str1;
      while ((str1 = lineReader.readLine()) != null && !"--".equals(str1)) {
        if (bool) {
          BoundaryLimitedInputStream boundaryLimitedInputStream = new BoundaryLimitedInputStream(this.src, this.boundary);
          Headers headers = new Headers(boundaryLimitedInputStream, this.defaultContentTransferEncoding);
          MimeContext mimeContext1 = mimeMultipartContext.createContext(b++);
          InputStream inputStream = mimeContext1.applyContext(headers, boundaryLimitedInputStream);
          paramMimeParserListener.object(this.parserContext, headers, processStream(headers, inputStream));
          if (inputStream.read() >= 0)
            throw new IOException("MIME object not fully processed"); 
          continue;
        } 
        if (str2.equals(str1)) {
          bool = true;
          BoundaryLimitedInputStream boundaryLimitedInputStream = new BoundaryLimitedInputStream(this.src, this.boundary);
          Headers headers = new Headers(boundaryLimitedInputStream, this.defaultContentTransferEncoding);
          MimeContext mimeContext1 = mimeMultipartContext.createContext(b++);
          InputStream inputStream = mimeContext1.applyContext(headers, boundaryLimitedInputStream);
          paramMimeParserListener.object(this.parserContext, headers, processStream(headers, inputStream));
          if (inputStream.read() >= 0)
            throw new IOException("MIME object not fully processed"); 
        } 
      } 
    } else {
      InputStream inputStream = mimeContext.applyContext(this.headers, this.src);
      paramMimeParserListener.object(this.parserContext, this.headers, processStream(this.headers, inputStream));
    } 
  }
  
  public boolean isMultipart() {
    return this.isMultipart;
  }
  
  private InputStream processStream(Headers paramHeaders, InputStream paramInputStream) {
    return (InputStream)(paramHeaders.getContentTransferEncoding().equals("base64") ? new Base64InputStream(paramInputStream) : (paramHeaders.getContentTransferEncoding().equals("quoted-printable") ? new QuotedPrintableInputStream(paramInputStream) : paramInputStream));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\BasicMimeParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */