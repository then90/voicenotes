package com.sforce.soap.AccessController;

/**
 * Generated class, please do not edit.
 */
public class DebuggingInfo_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DebuggingInfo_element() {
  }
    
  
  /**
   * element  : debugLog of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo debugLog__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","debugLog","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean debugLog__is_set = false;

  private java.lang.String debugLog;

  public java.lang.String getDebugLog() {
    return debugLog;
  }

  

  public void setDebugLog(java.lang.String debugLog) {
    this.debugLog = debugLog;
    debugLog__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, debugLog__typeInfo, debugLog, debugLog__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, debugLog__typeInfo)) {
      setDebugLog((java.lang.String)__typeMapper.readString(__in, debugLog__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DebuggingInfo_element ");
    sb.append(super.toString());
    sb.append(" debugLog=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(debugLog)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}