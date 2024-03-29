package com.sforce.soap.partner.fault;

/**
 * Generated class, please do not edit.
 */
public class ApiFault extends com.sforce.ws.SoapFaultException implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ApiFault() {
  }
    
  
  /**
   * element  : exceptionCode of type {urn:fault.partner.soap.sforce.com}ExceptionCode
   * java type: com.sforce.soap.partner.fault.ExceptionCode
   */
  private static final com.sforce.ws.bind.TypeInfo exceptionCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:fault.partner.soap.sforce.com","exceptionCode","urn:fault.partner.soap.sforce.com","ExceptionCode",1,1,true);

  private boolean exceptionCode__is_set = false;

  private com.sforce.soap.partner.fault.ExceptionCode exceptionCode;

  public com.sforce.soap.partner.fault.ExceptionCode getExceptionCode() {
    return exceptionCode;
  }

  

  public void setExceptionCode(com.sforce.soap.partner.fault.ExceptionCode exceptionCode) {
    this.exceptionCode = exceptionCode;
    exceptionCode__is_set = true;
  }
  
  /**
   * element  : exceptionMessage of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo exceptionMessage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:fault.partner.soap.sforce.com","exceptionMessage","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean exceptionMessage__is_set = false;

  private java.lang.String exceptionMessage;

  public java.lang.String getExceptionMessage() {
    return exceptionMessage;
  }

  

  public void setExceptionMessage(java.lang.String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    exceptionMessage__is_set = true;
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
   
    __typeMapper.writeObject(__out, exceptionCode__typeInfo, exceptionCode, exceptionCode__is_set);
    __typeMapper.writeString(__out, exceptionMessage__typeInfo, exceptionMessage, exceptionMessage__is_set);
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
    if (__typeMapper.verifyElement(__in, exceptionCode__typeInfo)) {
      setExceptionCode((com.sforce.soap.partner.fault.ExceptionCode)__typeMapper.readObject(__in, exceptionCode__typeInfo, com.sforce.soap.partner.fault.ExceptionCode.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, exceptionMessage__typeInfo)) {
      setExceptionMessage((java.lang.String)__typeMapper.readString(__in, exceptionMessage__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApiFault ");
    
    sb.append(" exceptionCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(exceptionCode)+"'\n");
    sb.append(" exceptionMessage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(exceptionMessage)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}