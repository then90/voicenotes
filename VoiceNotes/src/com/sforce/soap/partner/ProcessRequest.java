package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class ProcessRequest implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ProcessRequest() {
  }
    
  
  /**
   * element  : comments of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo comments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","comments","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean comments__is_set = false;

  private java.lang.String comments;

  public java.lang.String getComments() {
    return comments;
  }

  

  public void setComments(java.lang.String comments) {
    this.comments = comments;
    comments__is_set = true;
  }
  
  /**
   * element  : nextApproverIds of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo nextApproverIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","nextApproverIds","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean nextApproverIds__is_set = false;

  private java.lang.String[] nextApproverIds = new java.lang.String[0];

  public java.lang.String[] getNextApproverIds() {
    return nextApproverIds;
  }

  

  public void setNextApproverIds(java.lang.String[] nextApproverIds) {
    this.nextApproverIds = nextApproverIds;
    nextApproverIds__is_set = true;
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
   
    __typeMapper.writeString(__out, comments__typeInfo, comments, comments__is_set);
    __typeMapper.writeObject(__out, nextApproverIds__typeInfo, nextApproverIds, nextApproverIds__is_set);
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
    if (__typeMapper.verifyElement(__in, comments__typeInfo)) {
      setComments((java.lang.String)__typeMapper.readString(__in, comments__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, nextApproverIds__typeInfo)) {
      setNextApproverIds((java.lang.String[])__typeMapper.readObject(__in, nextApproverIds__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProcessRequest ");
    
    sb.append(" comments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(comments)+"'\n");
    sb.append(" nextApproverIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(nextApproverIds)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}