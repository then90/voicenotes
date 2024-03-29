package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoftphoneScreenPopOption implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeSoftphoneScreenPopOption() {
  }
    
  
  /**
   * element  : matchType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo matchType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","matchType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean matchType__is_set = false;

  private java.lang.String matchType;

  public java.lang.String getMatchType() {
    return matchType;
  }

  

  public void setMatchType(java.lang.String matchType) {
    this.matchType = matchType;
    matchType__is_set = true;
  }
  
  /**
   * element  : screenPopData of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo screenPopData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","screenPopData","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean screenPopData__is_set = false;

  private java.lang.String screenPopData;

  public java.lang.String getScreenPopData() {
    return screenPopData;
  }

  

  public void setScreenPopData(java.lang.String screenPopData) {
    this.screenPopData = screenPopData;
    screenPopData__is_set = true;
  }
  
  /**
   * element  : screenPopType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo screenPopType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","screenPopType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean screenPopType__is_set = false;

  private java.lang.String screenPopType;

  public java.lang.String getScreenPopType() {
    return screenPopType;
  }

  

  public void setScreenPopType(java.lang.String screenPopType) {
    this.screenPopType = screenPopType;
    screenPopType__is_set = true;
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
   
    __typeMapper.writeString(__out, matchType__typeInfo, matchType, matchType__is_set);
    __typeMapper.writeString(__out, screenPopData__typeInfo, screenPopData, screenPopData__is_set);
    __typeMapper.writeString(__out, screenPopType__typeInfo, screenPopType, screenPopType__is_set);
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
    if (__typeMapper.verifyElement(__in, matchType__typeInfo)) {
      setMatchType((java.lang.String)__typeMapper.readString(__in, matchType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, screenPopData__typeInfo)) {
      setScreenPopData((java.lang.String)__typeMapper.readString(__in, screenPopData__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, screenPopType__typeInfo)) {
      setScreenPopType((java.lang.String)__typeMapper.readString(__in, screenPopType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoftphoneScreenPopOption ");
    
    sb.append(" matchType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(matchType)+"'\n");
    sb.append(" screenPopData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(screenPopData)+"'\n");
    sb.append(" screenPopType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(screenPopType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}