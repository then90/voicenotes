package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class GetServerTimestampResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public GetServerTimestampResult() {
  }
    
  
  /**
   * element  : timestamp of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo timestamp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","timestamp","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true);

  private boolean timestamp__is_set = false;

  private java.util.Calendar timestamp;

  public java.util.Calendar getTimestamp() {
    return timestamp;
  }

  

  public void setTimestamp(java.util.Calendar timestamp) {
    this.timestamp = timestamp;
    timestamp__is_set = true;
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
   
    __typeMapper.writeObject(__out, timestamp__typeInfo, timestamp, timestamp__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, timestamp__typeInfo)) {
      setTimestamp((java.util.Calendar)__typeMapper.readObject(__in, timestamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[GetServerTimestampResult ");
    
    sb.append(" timestamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(timestamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}