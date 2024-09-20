package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.dom.CharacterDataModified")
public class CharacterDataModified implements Zl {
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zvd(Zp = "characterData")
  public final String characterData;
  
  @Zox
  public CharacterDataModified(@Zc5(Ze = "nodeId") Integer paramInteger, @Zc5(Ze = "characterData") String paramString) {
    this.nodeId = paramInteger;
    this.characterData = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\CharacterDataModified.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */