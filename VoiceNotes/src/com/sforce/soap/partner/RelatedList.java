package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class RelatedList implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public RelatedList() {
  }
    
  
  /**
   * element  : columns of type {urn:partner.soap.sforce.com}RelatedListColumn
   * java type: com.sforce.soap.partner.RelatedListColumn[]
   */
  private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","columns","urn:partner.soap.sforce.com","RelatedListColumn",1,-1,true);

  private boolean columns__is_set = false;

  private com.sforce.soap.partner.RelatedListColumn[] columns = new com.sforce.soap.partner.RelatedListColumn[0];

  public com.sforce.soap.partner.RelatedListColumn[] getColumns() {
    return columns;
  }

  

  public void setColumns(com.sforce.soap.partner.RelatedListColumn[] columns) {
    this.columns = columns;
    columns__is_set = true;
  }
  
  /**
   * element  : custom of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo custom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","custom","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean custom__is_set = false;

  private boolean custom;

  public boolean getCustom() {
    return custom;
  }

  

  public boolean isCustom() {
    return custom;
  }

  

  public void setCustom(boolean custom) {
    this.custom = custom;
    custom__is_set = true;
  }
  
  /**
   * element  : field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean field__is_set = false;

  private java.lang.String field;

  public java.lang.String getField() {
    return field;
  }

  

  public void setField(java.lang.String field) {
    this.field = field;
    field__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : limitRows of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo limitRows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","limitRows","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean limitRows__is_set = false;

  private int limitRows;

  public int getLimitRows() {
    return limitRows;
  }

  

  public void setLimitRows(int limitRows) {
    this.limitRows = limitRows;
    limitRows__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : sobject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sobject","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sobject__is_set = false;

  private java.lang.String sobject;

  public java.lang.String getSobject() {
    return sobject;
  }

  

  public void setSobject(java.lang.String sobject) {
    this.sobject = sobject;
    sobject__is_set = true;
  }
  
  /**
   * element  : sort of type {urn:partner.soap.sforce.com}RelatedListSort
   * java type: com.sforce.soap.partner.RelatedListSort[]
   */
  private static final com.sforce.ws.bind.TypeInfo sort__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sort","urn:partner.soap.sforce.com","RelatedListSort",0,-1,true);

  private boolean sort__is_set = false;

  private com.sforce.soap.partner.RelatedListSort[] sort = new com.sforce.soap.partner.RelatedListSort[0];

  public com.sforce.soap.partner.RelatedListSort[] getSort() {
    return sort;
  }

  

  public void setSort(com.sforce.soap.partner.RelatedListSort[] sort) {
    this.sort = sort;
    sort__is_set = true;
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
   
    __typeMapper.writeObject(__out, columns__typeInfo, columns, columns__is_set);
    __typeMapper.writeBoolean(__out, custom__typeInfo, custom, custom__is_set);
    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeInt(__out, limitRows__typeInfo, limitRows, limitRows__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, sobject__typeInfo, sobject, sobject__is_set);
    __typeMapper.writeObject(__out, sort__typeInfo, sort, sort__is_set);
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
    if (__typeMapper.verifyElement(__in, columns__typeInfo)) {
      setColumns((com.sforce.soap.partner.RelatedListColumn[])__typeMapper.readObject(__in, columns__typeInfo, com.sforce.soap.partner.RelatedListColumn[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, custom__typeInfo)) {
      setCustom((boolean)__typeMapper.readBoolean(__in, custom__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, limitRows__typeInfo)) {
      setLimitRows((int)__typeMapper.readInt(__in, limitRows__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobject__typeInfo)) {
      setSobject((java.lang.String)__typeMapper.readString(__in, sobject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sort__typeInfo)) {
      setSort((com.sforce.soap.partner.RelatedListSort[])__typeMapper.readObject(__in, sort__typeInfo, com.sforce.soap.partner.RelatedListSort[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RelatedList ");
    
    sb.append(" columns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");
    sb.append(" custom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(custom)+"'\n");
    sb.append(" field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" limitRows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(limitRows)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" sobject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobject)+"'\n");
    sb.append(" sort=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sort)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}