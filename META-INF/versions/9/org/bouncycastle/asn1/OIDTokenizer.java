package META-INF.versions.9.org.bouncycastle.asn1;

public class OIDTokenizer {
  private String oid;
  
  private int index;
  
  public OIDTokenizer(String paramString) {
    this.oid = paramString;
    this.index = 0;
  }
  
  public boolean hasMoreTokens() {
    return (this.index != -1);
  }
  
  public String nextToken() {
    if (this.index == -1)
      return null; 
    int i = this.oid.indexOf('.', this.index);
    if (i == -1) {
      String str1 = this.oid.substring(this.index);
      this.index = -1;
      return str1;
    } 
    String str = this.oid.substring(this.index, i);
    this.index = i + 1;
    return str;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\OIDTokenizer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */