package META-INF.versions.9.org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.Stack;
import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.pqc.crypto.xmss.WOTSPlus;
import org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSAddress;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;
import org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil;

class BDSTreeHash implements Serializable, Cloneable {
  private static final long serialVersionUID = 1L;
  
  private XMSSNode tailNode;
  
  private final int initialHeight;
  
  private int height;
  
  private int nextIndex;
  
  private boolean initialized;
  
  private boolean finished;
  
  BDSTreeHash(int paramInt) {
    this.initialHeight = paramInt;
    this.initialized = false;
    this.finished = false;
  }
  
  void initialize(int paramInt) {
    this.tailNode = null;
    this.height = this.initialHeight;
    this.nextIndex = paramInt;
    this.initialized = true;
    this.finished = false;
  }
  
  void update(Stack<XMSSNode> paramStack, WOTSPlus paramWOTSPlus, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, OTSHashAddress paramOTSHashAddress) {
    if (paramOTSHashAddress == null)
      throw new NullPointerException("otsHashAddress == null"); 
    if (this.finished || !this.initialized)
      throw new IllegalStateException("finished or not initialized"); 
    paramOTSHashAddress = (OTSHashAddress)((OTSHashAddress.Builder)((OTSHashAddress.Builder)((OTSHashAddress.Builder)(new OTSHashAddress.Builder()).withLayerAddress(paramOTSHashAddress.getLayerAddress())).withTreeAddress(paramOTSHashAddress.getTreeAddress())).withOTSAddress(this.nextIndex).withChainAddress(paramOTSHashAddress.getChainAddress()).withHashAddress(paramOTSHashAddress.getHashAddress()).withKeyAndMask(paramOTSHashAddress.getKeyAndMask())).build();
    LTreeAddress lTreeAddress = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(paramOTSHashAddress.getLayerAddress())).withTreeAddress(paramOTSHashAddress.getTreeAddress())).withLTreeAddress(this.nextIndex).build();
    HashTreeAddress hashTreeAddress = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(paramOTSHashAddress.getLayerAddress())).withTreeAddress(paramOTSHashAddress.getTreeAddress())).withTreeIndex(this.nextIndex).build();
    paramWOTSPlus.importKeys(paramWOTSPlus.getWOTSPlusSecretKey(paramArrayOfbyte2, paramOTSHashAddress), paramArrayOfbyte1);
    WOTSPlusPublicKeyParameters wOTSPlusPublicKeyParameters = paramWOTSPlus.getPublicKey(paramOTSHashAddress);
    XMSSNode xMSSNode = XMSSNodeUtil.lTree(paramWOTSPlus, wOTSPlusPublicKeyParameters, lTreeAddress);
    while (!paramStack.isEmpty() && ((XMSSNode)paramStack.peek()).getHeight() == xMSSNode.getHeight() && ((XMSSNode)paramStack.peek()).getHeight() != this.initialHeight) {
      hashTreeAddress = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex((hashTreeAddress.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask())).build();
      xMSSNode = XMSSNodeUtil.randomizeHash(paramWOTSPlus, paramStack.pop(), xMSSNode, (XMSSAddress)hashTreeAddress);
      xMSSNode = new XMSSNode(xMSSNode.getHeight() + 1, xMSSNode.getValue());
      hashTreeAddress = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight() + 1).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(hashTreeAddress.getKeyAndMask())).build();
    } 
    if (this.tailNode == null) {
      this.tailNode = xMSSNode;
    } else if (this.tailNode.getHeight() == xMSSNode.getHeight()) {
      hashTreeAddress = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex((hashTreeAddress.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask())).build();
      xMSSNode = XMSSNodeUtil.randomizeHash(paramWOTSPlus, this.tailNode, xMSSNode, (XMSSAddress)hashTreeAddress);
      xMSSNode = new XMSSNode(this.tailNode.getHeight() + 1, xMSSNode.getValue());
      this.tailNode = xMSSNode;
      hashTreeAddress = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight() + 1).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(hashTreeAddress.getKeyAndMask())).build();
    } else {
      paramStack.push(xMSSNode);
    } 
    if (this.tailNode.getHeight() == this.initialHeight) {
      this.finished = true;
    } else {
      this.height = xMSSNode.getHeight();
      this.nextIndex++;
    } 
  }
  
  int getHeight() {
    return (!this.initialized || this.finished) ? Integer.MAX_VALUE : this.height;
  }
  
  int getIndexLeaf() {
    return this.nextIndex;
  }
  
  void setNode(XMSSNode paramXMSSNode) {
    this.tailNode = paramXMSSNode;
    this.height = paramXMSSNode.getHeight();
    if (this.height == this.initialHeight)
      this.finished = true; 
  }
  
  boolean isFinished() {
    return this.finished;
  }
  
  boolean isInitialized() {
    return this.initialized;
  }
  
  public XMSSNode getTailNode() {
    return this.tailNode;
  }
  
  protected org.bouncycastle.pqc.crypto.xmss.BDSTreeHash clone() {
    org.bouncycastle.pqc.crypto.xmss.BDSTreeHash bDSTreeHash = new org.bouncycastle.pqc.crypto.xmss.BDSTreeHash(this.initialHeight);
    bDSTreeHash.tailNode = this.tailNode;
    bDSTreeHash.height = this.height;
    bDSTreeHash.nextIndex = this.nextIndex;
    bDSTreeHash.initialized = this.initialized;
    bDSTreeHash.finished = this.finished;
    return bDSTreeHash;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\xmss\BDSTreeHash.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */