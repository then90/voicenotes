package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class MruHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public MruHeader_element() {
  }
    
  
  /**
   * element  : updateMru of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo updateMru__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","updateMru","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean updateMru__is_set = false;

  private boolean updateMru;

  public boolean getUpdateMru() {
    return updateMru;
  }

  

  public boolean isUpdateMru() {
    return updateMru;
  }

  

  public void setUpdateMru(boolean updateMru) {
    this.updateMru = updateMru;
    updateMru__is_set = true;
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
    __typeMapper.writeBoolean(__out, updateMru__typeInfo, updateMru, updateMru__is_set);
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
    if (__typeMapper.verifyElement(__in, updateMru__typeInfo)) {
      setUpdateMru((boolean)__typeMapper.readBoolean(__in, updateMru__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[MruHeader_element ");
    sb.append(super.toString());
    sb.append(" updateMru=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(updateMru)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}