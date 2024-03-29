package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DeletedRecord implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DeletedRecord() {
  }
    
  
  /**
   * element  : deletedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo deletedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","deletedDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true);

  private boolean deletedDate__is_set = false;

  private java.util.Calendar deletedDate;

  public java.util.Calendar getDeletedDate() {
    return deletedDate;
  }

  

  public void setDeletedDate(java.util.Calendar deletedDate) {
    this.deletedDate = deletedDate;
    deletedDate__is_set = true;
  }
  
  /**
   * element  : id of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","id","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean id__is_set = false;

  private java.lang.String id;

  public java.lang.String getId() {
    return id;
  }

  

  public void setId(java.lang.String id) {
    this.id = id;
    id__is_set = true;
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
   
    __typeMapper.writeObject(__out, deletedDate__typeInfo, deletedDate, deletedDate__is_set);
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
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
    if (__typeMapper.verifyElement(__in, deletedDate__typeInfo)) {
      setDeletedDate((java.util.Calendar)__typeMapper.readObject(__in, deletedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DeletedRecord ");
    
    sb.append(" deletedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(deletedDate)+"'\n");
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}