package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class JPAKERound2Payload {
  private final String participantId;
  
  private final BigInteger a;
  
  private final BigInteger[] knowledgeProofForX2s;
  
  public JPAKERound2Payload(String paramString, BigInteger paramBigInteger, BigInteger[] paramArrayOfBigInteger) {
    JPAKEUtil.validateNotNull(paramString, "participantId");
    JPAKEUtil.validateNotNull(paramBigInteger, "a");
    JPAKEUtil.validateNotNull(paramArrayOfBigInteger, "knowledgeProofForX2s");
    this.participantId = paramString;
    this.a = paramBigInteger;
    this.knowledgeProofForX2s = Arrays.copyOf(paramArrayOfBigInteger, paramArrayOfBigInteger.length);
  }
  
  public String getParticipantId() {
    return this.participantId;
  }
  
  public BigInteger getA() {
    return this.a;
  }
  
  public BigInteger[] getKnowledgeProofForX2s() {
    return Arrays.copyOf(this.knowledgeProofForX2s, this.knowledgeProofForX2s.length);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\jpake\JPAKERound2Payload.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */