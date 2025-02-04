package org.bouncycastle.jce.provider;

import java.util.Collection;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.X509CollectionStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;

public class X509StoreCertCollection extends X509StoreSpi {
  private CollectionStore _store;
  
  public void engineInit(X509StoreParameters paramX509StoreParameters) {
    if (!(paramX509StoreParameters instanceof X509CollectionStoreParameters))
      throw new IllegalArgumentException(paramX509StoreParameters.toString()); 
    this._store = new CollectionStore(((X509CollectionStoreParameters)paramX509StoreParameters).getCollection());
  }
  
  public Collection engineGetMatches(Selector paramSelector) {
    return this._store.getMatches(paramSelector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\provider\X509StoreCertCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */