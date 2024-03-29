package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeDataCategoryGroupStructures_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeDataCategoryGroupStructures_element() {
  }
    
  
  /**
   * element  : pairs of type {urn:partner.soap.sforce.com}DataCategoryGroupSobjectTypePair
   * java type: com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[]
   */
  private static final com.sforce.ws.bind.TypeInfo pairs__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","pairs","urn:partner.soap.sforce.com","DataCategoryGroupSobjectTypePair",0,100,true);

  private boolean pairs__is_set = false;

  private com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs = new com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[0];

  public com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] getPairs() {
    return pairs;
  }

  

  public void setPairs(com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs) {
    this.pairs = pairs;
    pairs__is_set = true;
  }
  
  /**
   * element  : topCategoriesOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo topCategoriesOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","topCategoriesOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean topCategoriesOnly__is_set = false;

  private boolean topCategoriesOnly;

  public boolean getTopCategoriesOnly() {
    return topCategoriesOnly;
  }

  

  public boolean isTopCategoriesOnly() {
    return topCategoriesOnly;
  }

  

  public void setTopCategoriesOnly(boolean topCategoriesOnly) {
    this.topCategoriesOnly = topCategoriesOnly;
    topCategoriesOnly__is_set = true;
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
   
    __typeMapper.writeObject(__out, pairs__typeInfo, pairs, pairs__is_set);
    __typeMapper.writeBoolean(__out, topCategoriesOnly__typeInfo, topCategoriesOnly, topCategoriesOnly__is_set);
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
    if (__typeMapper.isElement(__in, pairs__typeInfo)) {
      setPairs((com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[])__typeMapper.readObject(__in, pairs__typeInfo, com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, topCategoriesOnly__typeInfo)) {
      setTopCategoriesOnly((boolean)__typeMapper.readBoolean(__in, topCategoriesOnly__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeDataCategoryGroupStructures_element ");
    
    sb.append(" pairs=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(pairs)+"'\n");
    sb.append(" topCategoriesOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(topCategoriesOnly)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}