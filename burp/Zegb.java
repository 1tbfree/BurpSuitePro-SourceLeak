package burp;

import burp.api.montoya.collaborator.CollaboratorClient;
import burp.api.montoya.collaborator.CollaboratorPayload;
import burp.api.montoya.collaborator.CollaboratorServer;
import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.collaborator.InteractionFilter;
import burp.api.montoya.collaborator.PayloadOption;
import burp.api.montoya.collaborator.SecretKey;
import java.util.List;

class Zegb implements CollaboratorClient {
  private final Zg13 ZN;
  
  private final CollaboratorClient ZB;
  
  private static final String a;
  
  Zegb(Zg13 paramZg13, CollaboratorClient paramCollaboratorClient) {
    this.ZN = paramZg13;
    this.ZB = paramCollaboratorClient;
  }
  
  public CollaboratorPayload generatePayload(PayloadOption... paramVarArgs) {
    ZW();
    return this.ZB.generatePayload(paramVarArgs);
  }
  
  public CollaboratorPayload generatePayload(String paramString, PayloadOption... paramVarArgs) {
    ZW();
    return this.ZB.generatePayload(paramString, paramVarArgs);
  }
  
  public List<Interaction> getAllInteractions() {
    ZW();
    return this.ZB.getAllInteractions();
  }
  
  public List<Interaction> getInteractions(InteractionFilter paramInteractionFilter) {
    ZW();
    return this.ZB.getInteractions(paramInteractionFilter);
  }
  
  public CollaboratorServer server() {
    ZW();
    return this.ZB.server();
  }
  
  public SecretKey getSecretKey() {
    ZW();
    return this.ZB.getSecretKey();
  }
  
  private void ZW() {
    try {
      if (!this.ZN.ZA())
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #91
    //   2: ldc 'K&i)OTe 5{f~Z}&9`m'xk`^mL=w)xSlLkff^jtvyxRf''
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zegb.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #82
    //   82: goto -> 112
    //   85: bipush #55
    //   87: goto -> 112
    //   90: bipush #15
    //   92: goto -> 112
    //   95: bipush #66
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #87
    //   107: goto -> 112
    //   110: bipush #96
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */