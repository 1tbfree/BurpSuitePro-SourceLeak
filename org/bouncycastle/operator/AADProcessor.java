package org.bouncycastle.operator;

import java.io.OutputStream;

public interface AADProcessor {
  OutputStream getAADStream();
  
  byte[] getMAC();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\AADProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */