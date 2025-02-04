package org.bouncycastle.crypto.examples;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup;
import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroups;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound2Payload;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound3Payload;
import org.bouncycastle.crypto.digests.SHA256Digest;

public class JPAKEExample {
  public static void main(String[] paramArrayOfString) throws CryptoException {
    JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup = JPAKEPrimeOrderGroups.NIST_3072;
    BigInteger bigInteger1 = jPAKEPrimeOrderGroup.getP();
    BigInteger bigInteger2 = jPAKEPrimeOrderGroup.getQ();
    BigInteger bigInteger3 = jPAKEPrimeOrderGroup.getG();
    String str1 = "password";
    String str2 = "password";
    System.out.println("********* Initialization **********");
    System.out.println("Public parameters for the cyclic group:");
    System.out.println("p (" + bigInteger1.bitLength() + " bits): " + bigInteger1.toString(16));
    System.out.println("q (" + bigInteger2.bitLength() + " bits): " + bigInteger2.toString(16));
    System.out.println("g (" + bigInteger1.bitLength() + " bits): " + bigInteger3.toString(16));
    System.out.println("p mod q = " + bigInteger1.mod(bigInteger2).toString(16));
    System.out.println("g^{q} mod p = " + bigInteger3.modPow(bigInteger2, bigInteger1).toString(16));
    System.out.println("");
    System.out.println("(Secret passwords used by Alice and Bob: \"" + str1 + "\" and \"" + str2 + "\")\n");
    SavableDigest savableDigest = SHA256Digest.newInstance();
    SecureRandom secureRandom = new SecureRandom();
    JPAKEParticipant jPAKEParticipant1 = new JPAKEParticipant("alice", str1.toCharArray(), jPAKEPrimeOrderGroup, (Digest)savableDigest, secureRandom);
    JPAKEParticipant jPAKEParticipant2 = new JPAKEParticipant("bob", str2.toCharArray(), jPAKEPrimeOrderGroup, (Digest)savableDigest, secureRandom);
    JPAKERound1Payload jPAKERound1Payload1 = jPAKEParticipant1.createRound1PayloadToSend();
    JPAKERound1Payload jPAKERound1Payload2 = jPAKEParticipant2.createRound1PayloadToSend();
    System.out.println("************ Round 1 **************");
    System.out.println("Alice sends to Bob: ");
    System.out.println("g^{x1}=" + jPAKERound1Payload1.getGx1().toString(16));
    System.out.println("g^{x2}=" + jPAKERound1Payload1.getGx2().toString(16));
    System.out.println("KP{x1}={" + jPAKERound1Payload1.getKnowledgeProofForX1()[0].toString(16) + "};{" + jPAKERound1Payload1.getKnowledgeProofForX1()[1].toString(16) + "}");
    System.out.println("KP{x2}={" + jPAKERound1Payload1.getKnowledgeProofForX2()[0].toString(16) + "};{" + jPAKERound1Payload1.getKnowledgeProofForX2()[1].toString(16) + "}");
    System.out.println("");
    System.out.println("Bob sends to Alice: ");
    System.out.println("g^{x3}=" + jPAKERound1Payload2.getGx1().toString(16));
    System.out.println("g^{x4}=" + jPAKERound1Payload2.getGx2().toString(16));
    System.out.println("KP{x3}={" + jPAKERound1Payload2.getKnowledgeProofForX1()[0].toString(16) + "};{" + jPAKERound1Payload2.getKnowledgeProofForX1()[1].toString(16) + "}");
    System.out.println("KP{x4}={" + jPAKERound1Payload2.getKnowledgeProofForX2()[0].toString(16) + "};{" + jPAKERound1Payload2.getKnowledgeProofForX2()[1].toString(16) + "}");
    System.out.println("");
    jPAKEParticipant1.validateRound1PayloadReceived(jPAKERound1Payload2);
    System.out.println("Alice checks g^{x4}!=1: OK");
    System.out.println("Alice checks KP{x3}: OK");
    System.out.println("Alice checks KP{x4}: OK");
    System.out.println("");
    jPAKEParticipant2.validateRound1PayloadReceived(jPAKERound1Payload1);
    System.out.println("Bob checks g^{x2}!=1: OK");
    System.out.println("Bob checks KP{x1},: OK");
    System.out.println("Bob checks KP{x2},: OK");
    System.out.println("");
    JPAKERound2Payload jPAKERound2Payload1 = jPAKEParticipant1.createRound2PayloadToSend();
    JPAKERound2Payload jPAKERound2Payload2 = jPAKEParticipant2.createRound2PayloadToSend();
    System.out.println("************ Round 2 **************");
    System.out.println("Alice sends to Bob: ");
    System.out.println("A=" + jPAKERound2Payload1.getA().toString(16));
    System.out.println("KP{x2*s}={" + jPAKERound2Payload1.getKnowledgeProofForX2s()[0].toString(16) + "},{" + jPAKERound2Payload1.getKnowledgeProofForX2s()[1].toString(16) + "}");
    System.out.println("");
    System.out.println("Bob sends to Alice");
    System.out.println("B=" + jPAKERound2Payload2.getA().toString(16));
    System.out.println("KP{x4*s}={" + jPAKERound2Payload2.getKnowledgeProofForX2s()[0].toString(16) + "},{" + jPAKERound2Payload2.getKnowledgeProofForX2s()[1].toString(16) + "}");
    System.out.println("");
    jPAKEParticipant1.validateRound2PayloadReceived(jPAKERound2Payload2);
    System.out.println("Alice checks KP{x4*s}: OK\n");
    jPAKEParticipant2.validateRound2PayloadReceived(jPAKERound2Payload1);
    System.out.println("Bob checks KP{x2*s}: OK\n");
    BigInteger bigInteger4 = jPAKEParticipant1.calculateKeyingMaterial();
    BigInteger bigInteger5 = jPAKEParticipant2.calculateKeyingMaterial();
    System.out.println("********* After round 2 ***********");
    System.out.println("Alice computes key material \t K=" + bigInteger4.toString(16));
    System.out.println("Bob computes key material \t K=" + bigInteger5.toString(16));
    System.out.println();
    BigInteger bigInteger6 = deriveSessionKey(bigInteger4);
    BigInteger bigInteger7 = deriveSessionKey(bigInteger5);
    JPAKERound3Payload jPAKERound3Payload1 = jPAKEParticipant1.createRound3PayloadToSend(bigInteger4);
    JPAKERound3Payload jPAKERound3Payload2 = jPAKEParticipant2.createRound3PayloadToSend(bigInteger5);
    System.out.println("************ Round 3 **************");
    System.out.println("Alice sends to Bob: ");
    System.out.println("MacTag=" + jPAKERound3Payload1.getMacTag().toString(16));
    System.out.println("");
    System.out.println("Bob sends to Alice: ");
    System.out.println("MacTag=" + jPAKERound3Payload2.getMacTag().toString(16));
    System.out.println("");
    jPAKEParticipant1.validateRound3PayloadReceived(jPAKERound3Payload2, bigInteger4);
    System.out.println("Alice checks MacTag: OK\n");
    jPAKEParticipant2.validateRound3PayloadReceived(jPAKERound3Payload1, bigInteger5);
    System.out.println("Bob checks MacTag: OK\n");
    System.out.println();
    System.out.println("MacTags validated, therefore the keying material matches.");
  }
  
  private static BigInteger deriveSessionKey(BigInteger paramBigInteger) {
    SavableDigest savableDigest = SHA256Digest.newInstance();
    byte[] arrayOfByte1 = paramBigInteger.toByteArray();
    byte[] arrayOfByte2 = new byte[savableDigest.getDigestSize()];
    savableDigest.update(arrayOfByte1, 0, arrayOfByte1.length);
    savableDigest.doFinal(arrayOfByte2, 0);
    return new BigInteger(arrayOfByte2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\examples\JPAKEExample.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */