package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class EmailHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public EmailHeader_element() {
  }
    
  
  /**
   * element  : triggerAutoResponseEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo triggerAutoResponseEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","triggerAutoResponseEmail","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean triggerAutoResponseEmail__is_set = false;

  private boolean triggerAutoResponseEmail;

  public boolean getTriggerAutoResponseEmail() {
    return triggerAutoResponseEmail;
  }

  

  public boolean isTriggerAutoResponseEmail() {
    return triggerAutoResponseEmail;
  }

  

  public void setTriggerAutoResponseEmail(boolean triggerAutoResponseEmail) {
    this.triggerAutoResponseEmail = triggerAutoResponseEmail;
    triggerAutoResponseEmail__is_set = true;
  }
  
  /**
   * element  : triggerOtherEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo triggerOtherEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","triggerOtherEmail","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean triggerOtherEmail__is_set = false;

  private boolean triggerOtherEmail;

  public boolean getTriggerOtherEmail() {
    return triggerOtherEmail;
  }

  

  public boolean isTriggerOtherEmail() {
    return triggerOtherEmail;
  }

  

  public void setTriggerOtherEmail(boolean triggerOtherEmail) {
    this.triggerOtherEmail = triggerOtherEmail;
    triggerOtherEmail__is_set = true;
  }
  
  /**
   * element  : triggerUserEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo triggerUserEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","triggerUserEmail","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean triggerUserEmail__is_set = false;

  private boolean triggerUserEmail;

  public boolean getTriggerUserEmail() {
    return triggerUserEmail;
  }

  

  public boolean isTriggerUserEmail() {
    return triggerUserEmail;
  }

  

  public void setTriggerUserEmail(boolean triggerUserEmail) {
    this.triggerUserEmail = triggerUserEmail;
    triggerUserEmail__is_set = true;
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
    __typeMapper.writeBoolean(__out, triggerAutoResponseEmail__typeInfo, triggerAutoResponseEmail, triggerAutoResponseEmail__is_set);
    __typeMapper.writeBoolean(__out, triggerOtherEmail__typeInfo, triggerOtherEmail, triggerOtherEmail__is_set);
    __typeMapper.writeBoolean(__out, triggerUserEmail__typeInfo, triggerUserEmail, triggerUserEmail__is_set);
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
    if (__typeMapper.verifyElement(__in, triggerAutoResponseEmail__typeInfo)) {
      setTriggerAutoResponseEmail((boolean)__typeMapper.readBoolean(__in, triggerAutoResponseEmail__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, triggerOtherEmail__typeInfo)) {
      setTriggerOtherEmail((boolean)__typeMapper.readBoolean(__in, triggerOtherEmail__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, triggerUserEmail__typeInfo)) {
      setTriggerUserEmail((boolean)__typeMapper.readBoolean(__in, triggerUserEmail__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailHeader_element ");
    sb.append(super.toString());
    sb.append(" triggerAutoResponseEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(triggerAutoResponseEmail)+"'\n");
    sb.append(" triggerOtherEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(triggerOtherEmail)+"'\n");
    sb.append(" triggerUserEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(triggerUserEmail)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}