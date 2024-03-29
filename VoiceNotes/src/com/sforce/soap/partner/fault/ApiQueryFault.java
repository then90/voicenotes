package com.sforce.soap.partner.fault;

/**
 * Generated class, please do not edit.
 */
public class ApiQueryFault extends com.sforce.soap.partner.fault.ApiFault {

  /**
   * Constructor
   */
  public ApiQueryFault() {
  }
    
  
  /**
   * element  : row of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo row__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:fault.partner.soap.sforce.com","row","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean row__is_set = false;

  private int row;

  public int getRow() {
    return row;
  }

  

  public void setRow(int row) {
    this.row = row;
    row__is_set = true;
  }
  
  /**
   * element  : column of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo column__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:fault.partner.soap.sforce.com","column","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean column__is_set = false;

  private int column;

  public int getColumn() {
    return column;
  }

  

  public void setColumn(int column) {
    this.column = column;
    column__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:fault.partner.soap.sforce.com", "ApiQueryFault");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeInt(__out, row__typeInfo, row, row__is_set);
    __typeMapper.writeInt(__out, column__typeInfo, column, column__is_set);
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
    if (__typeMapper.verifyElement(__in, row__typeInfo)) {
      setRow((int)__typeMapper.readInt(__in, row__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, column__typeInfo)) {
      setColumn((int)__typeMapper.readInt(__in, column__typeInfo, int.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApiQueryFault ");
    sb.append(super.toString());
    sb.append(" row=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(row)+"'\n");
    sb.append(" column=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(column)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}