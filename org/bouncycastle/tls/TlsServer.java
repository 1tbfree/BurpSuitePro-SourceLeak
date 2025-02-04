package org.bouncycastle.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

public interface TlsServer extends TlsPeer {
  void init(TlsServerContext paramTlsServerContext);
  
  TlsSession getSessionToResume(byte[] paramArrayOfbyte);
  
  byte[] getNewSessionID();
  
  TlsPSKExternal getExternalPSK(Vector paramVector);
  
  void notifySession(TlsSession paramTlsSession);
  
  void notifyClientVersion(ProtocolVersion paramProtocolVersion) throws IOException;
  
  void notifyFallback(boolean paramBoolean) throws IOException;
  
  void notifyOfferedCipherSuites(int[] paramArrayOfint) throws IOException;
  
  void processClientExtensions(Hashtable paramHashtable) throws IOException;
  
  ProtocolVersion getServerVersion() throws IOException;
  
  int[] getSupportedGroups() throws IOException;
  
  int getSelectedCipherSuite() throws IOException;
  
  Hashtable getServerExtensions() throws IOException;
  
  void getServerExtensionsForConnection(Hashtable paramHashtable) throws IOException;
  
  Vector getServerSupplementalData() throws IOException;
  
  TlsCredentials getCredentials() throws IOException;
  
  CertificateStatus getCertificateStatus() throws IOException;
  
  CertificateRequest getCertificateRequest() throws IOException;
  
  TlsPSKIdentityManager getPSKIdentityManager() throws IOException;
  
  TlsSRPLoginParameters getSRPLoginParameters() throws IOException;
  
  TlsDHConfig getDHConfig() throws IOException;
  
  TlsECConfig getECDHConfig() throws IOException;
  
  void processClientSupplementalData(Vector paramVector) throws IOException;
  
  void notifyClientCertificate(Certificate paramCertificate) throws IOException;
  
  NewSessionTicket getNewSessionTicket() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */