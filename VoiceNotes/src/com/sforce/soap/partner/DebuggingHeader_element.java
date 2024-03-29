package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DebuggingHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DebuggingHeader_element() {
  }
    
  
  /**
   * element  : debugLevel of type {urn:partner.soap.sforce.com}DebugLevel
   * java type: com.sforce.soap.partner.DebugLevel
   */
  private static final com.sforce.ws.bind.TypeInfo debugLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","debugLevel","urn:partner.soap.sforce.com","DebugLevel",1,1,true);

  private boolean debugLevel__is_set = false;

  private com.sforce.soap.partner.DebugLevel debugLevel;

  public com.sforce.soap.partner.DebugLevel getDebugLevel() {
    return debugLevel;
  }

  

  public void setDebugLevel(com.sforce.soap.partner.DebugLevel debugLevel) {
    this.debugLevel = debugLevel;
    debugLevel__is_set = true;
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
    __typeMapper.writeObject(__out, debugLevel__typeInfo, debugLevel, debugLevel__is_set);
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
    if (__typeMapper.verifyElement(__in, debugLevel__typeInfo)) {
      setDebugLevel((com.sforce.soap.partner.DebugLevel)__typeMapper.readObject(__in, debugLevel__typeInfo, com.sforce.soap.partner.DebugLevel.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DebuggingHeader_element ");
    sb.append(super.toString());
    sb.append(" debugLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(debugLevel)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}