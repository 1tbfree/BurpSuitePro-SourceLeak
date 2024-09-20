package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSKeyframeRule")
public class CSSKeyframeRule {
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zvd(Zp = "origin")
  public final StyleSheetOrigin origin;
  
  @Zvd(Zp = "keyText")
  public final Value keyText;
  
  @Zvd(Zp = "style")
  public final CSSStyle style;
  
  @Zox
  public CSSKeyframeRule(@Zc5(Ze = "styleSheetId", ZS = "null") String paramString, @Zc5(Ze = "origin") StyleSheetOrigin paramStyleSheetOrigin, @Zc5(Ze = "keyText") Value paramValue, @Zc5(Ze = "style") CSSStyle paramCSSStyle) {
    this.styleSheetId = paramString;
    this.origin = paramStyleSheetOrigin;
    this.keyText = paramValue;
    this.style = paramCSSStyle;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSKeyframeRule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */