package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class MergeResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public MergeResult() {
  }
    
  
  /**
   * element  : errors of type {urn:partner.soap.sforce.com}Error
   * java type: com.sforce.soap.partner.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","errors","urn:partner.soap.sforce.com","Error",0,-1,true);

  private boolean errors__is_set = false;

  private com.sforce.soap.partner.Error[] errors = new com.sforce.soap.partner.Error[0];

  public com.sforce.soap.partner.Error[] getErrors() {
    return errors;
  }

  

  public void setErrors(com.sforce.soap.partner.Error[] errors) {
    this.errors = errors;
    errors__is_set = true;
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
   * element  : mergedRecordIds of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo mergedRecordIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","mergedRecordIds","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean mergedRecordIds__is_set = false;

  private java.lang.String[] mergedRecordIds = new java.lang.String[0];

  public java.lang.String[] getMergedRecordIds() {
    return mergedRecordIds;
  }

  

  public void setMergedRecordIds(java.lang.String[] mergedRecordIds) {
    this.mergedRecordIds = mergedRecordIds;
    mergedRecordIds__is_set = true;
  }
  
  /**
   * element  : success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean success__is_set = false;

  private boolean success;

  public boolean getSuccess() {
    return success;
  }

  

  public boolean isSuccess() {
    return success;
  }

  

  public void setSuccess(boolean success) {
    this.success = success;
    success__is_set = true;
  }
  
  /**
   * element  : updatedRelatedIds of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo updatedRelatedIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","updatedRelatedIds","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean updatedRelatedIds__is_set = false;

  private java.lang.String[] updatedRelatedIds = new java.lang.String[0];

  public java.lang.String[] getUpdatedRelatedIds() {
    return updatedRelatedIds;
  }

  

  public void setUpdatedRelatedIds(java.lang.String[] updatedRelatedIds) {
    this.updatedRelatedIds = updatedRelatedIds;
    updatedRelatedIds__is_set = true;
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
   
    __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
    __typeMapper.writeObject(__out, mergedRecordIds__typeInfo, mergedRecordIds, mergedRecordIds__is_set);
    __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
    __typeMapper.writeObject(__out, updatedRelatedIds__typeInfo, updatedRelatedIds, updatedRelatedIds__is_set);
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
    if (__typeMapper.isElement(__in, errors__typeInfo)) {
      setErrors((com.sforce.soap.partner.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.partner.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, mergedRecordIds__typeInfo)) {
      setMergedRecordIds((java.lang.String[])__typeMapper.readObject(__in, mergedRecordIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, updatedRelatedIds__typeInfo)) {
      setUpdatedRelatedIds((java.lang.String[])__typeMapper.readObject(__in, updatedRelatedIds__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[MergeResult ");
    
    sb.append(" errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errors)+"'\n");
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append(" mergedRecordIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(mergedRecordIds)+"'\n");
    sb.append(" success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");
    sb.append(" updatedRelatedIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(updatedRelatedIds)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}