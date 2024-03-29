package com.sforce.soap.AccessController;

/**
 * Generated class, please do not edit.
 */
public class SessionHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SessionHeader_element() {
  }
    
  
  /**
   * element  : sessionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sessionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","sessionId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sessionId__is_set = false;

  private java.lang.String sessionId;

  public java.lang.String getSessionId() {
    return sessionId;
  }

  

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    sessionId__is_set = true;
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
    __typeMapper.writeString(__out, sessionId__typeInfo, sessionId, sessionId__is_set);
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
    if (__typeMapper.verifyElement(__in, sessionId__typeInfo)) {
      setSessionId((java.lang.String)__typeMapper.readString(__in, sessionId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SessionHeader_element ");
    sb.append(super.toString());
    sb.append(" sessionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sessionId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}