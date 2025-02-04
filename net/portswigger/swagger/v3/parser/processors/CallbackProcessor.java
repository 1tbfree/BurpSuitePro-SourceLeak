package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class CallbackProcessor {
  private final ResolverCache cache;
  
  private final OperationProcessor operationProcessor;
  
  private final ParameterProcessor parameterProcessor;
  
  private final OpenAPI openAPI;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private static final String a;
  
  public CallbackProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public CallbackProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.cache = paramResolverCache;
    this.operationProcessor = new OperationProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.parameterProcessor = new ParameterProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
    this.openAPI = paramOpenAPI;
  }
  
  public void processCallback(Callback paramCallback) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramCallback.get$ref() != null)
      processReferenceCallback(paramCallback); 
    for (String str : paramCallback.keySet()) {
      PathItem pathItem = (PathItem)paramCallback.get(str);
      Map map = pathItem.readOperationsMap();
      for (PathItem.HttpMethod httpMethod : map.keySet()) {
        Operation operation = (Operation)map.get(httpMethod);
        this.operationProcessor.processOperation(operation);
        if (arrayOfZbqc == null)
          break; 
      } 
      List list = pathItem.getParameters();
      if (list != null)
        for (Parameter parameter : list) {
          this.parameterProcessor.processParameter(parameter);
          if (arrayOfZbqc == null)
            break; 
        }  
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public void processReferenceCallback(Callback paramCallback) {
    String str = paramCallback.get$ref();
    RefFormat refFormat = RefUtils.computeRefFormat(str);
    if (RefUtils.isAnExternalRefFormat(refFormat)) {
      String str1 = this.externalRefProcessor.processRefToExternalCallback(str, refFormat);
      if (str1 != null)
        paramCallback.set$ref(a + a); 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: ldc 'BTrF>riXE2 pJ\\t:T'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v3/parser/processors/CallbackProcessor.a : Ljava/lang/String;
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
    //   80: bipush #67
    //   82: goto -> 112
    //   85: bipush #89
    //   87: goto -> 112
    //   90: bipush #62
    //   92: goto -> 112
    //   95: bipush #63
    //   97: goto -> 112
    //   100: bipush #9
    //   102: goto -> 112
    //   105: bipush #72
    //   107: goto -> 112
    //   110: bipush #115
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\CallbackProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */