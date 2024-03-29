package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class Field implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Field() {
  }
    
  
  /**
   * element  : autoNumber of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo autoNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","autoNumber","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean autoNumber__is_set = false;

  private boolean autoNumber;

  public boolean getAutoNumber() {
    return autoNumber;
  }

  

  public boolean isAutoNumber() {
    return autoNumber;
  }

  

  public void setAutoNumber(boolean autoNumber) {
    this.autoNumber = autoNumber;
    autoNumber__is_set = true;
  }
  
  /**
   * element  : byteLength of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo byteLength__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","byteLength","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean byteLength__is_set = false;

  private int byteLength;

  public int getByteLength() {
    return byteLength;
  }

  

  public void setByteLength(int byteLength) {
    this.byteLength = byteLength;
    byteLength__is_set = true;
  }
  
  /**
   * element  : calculated of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo calculated__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","calculated","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean calculated__is_set = false;

  private boolean calculated;

  public boolean getCalculated() {
    return calculated;
  }

  

  public boolean isCalculated() {
    return calculated;
  }

  

  public void setCalculated(boolean calculated) {
    this.calculated = calculated;
    calculated__is_set = true;
  }
  
  /**
   * element  : calculatedFormula of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo calculatedFormula__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","calculatedFormula","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean calculatedFormula__is_set = false;

  private java.lang.String calculatedFormula;

  public java.lang.String getCalculatedFormula() {
    return calculatedFormula;
  }

  

  public void setCalculatedFormula(java.lang.String calculatedFormula) {
    this.calculatedFormula = calculatedFormula;
    calculatedFormula__is_set = true;
  }
  
  /**
   * element  : caseSensitive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo caseSensitive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","caseSensitive","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean caseSensitive__is_set = false;

  private boolean caseSensitive;

  public boolean getCaseSensitive() {
    return caseSensitive;
  }

  

  public boolean isCaseSensitive() {
    return caseSensitive;
  }

  

  public void setCaseSensitive(boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    caseSensitive__is_set = true;
  }
  
  /**
   * element  : controllerName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo controllerName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","controllerName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean controllerName__is_set = false;

  private java.lang.String controllerName;

  public java.lang.String getControllerName() {
    return controllerName;
  }

  

  public void setControllerName(java.lang.String controllerName) {
    this.controllerName = controllerName;
    controllerName__is_set = true;
  }
  
  /**
   * element  : createable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo createable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","createable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean createable__is_set = false;

  private boolean createable;

  public boolean getCreateable() {
    return createable;
  }

  

  public boolean isCreateable() {
    return createable;
  }

  

  public void setCreateable(boolean createable) {
    this.createable = createable;
    createable__is_set = true;
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
   * element  : defaultValueFormula of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo defaultValueFormula__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","defaultValueFormula","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean defaultValueFormula__is_set = false;

  private java.lang.String defaultValueFormula;

  public java.lang.String getDefaultValueFormula() {
    return defaultValueFormula;
  }

  

  public void setDefaultValueFormula(java.lang.String defaultValueFormula) {
    this.defaultValueFormula = defaultValueFormula;
    defaultValueFormula__is_set = true;
  }
  
  /**
   * element  : defaultedOnCreate of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo defaultedOnCreate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","defaultedOnCreate","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean defaultedOnCreate__is_set = false;

  private boolean defaultedOnCreate;

  public boolean getDefaultedOnCreate() {
    return defaultedOnCreate;
  }

  

  public boolean isDefaultedOnCreate() {
    return defaultedOnCreate;
  }

  

  public void setDefaultedOnCreate(boolean defaultedOnCreate) {
    this.defaultedOnCreate = defaultedOnCreate;
    defaultedOnCreate__is_set = true;
  }
  
  /**
   * element  : dependentPicklist of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dependentPicklist__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","dependentPicklist","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean dependentPicklist__is_set = false;

  private boolean dependentPicklist;

  public boolean getDependentPicklist() {
    return dependentPicklist;
  }

  

  public boolean isDependentPicklist() {
    return dependentPicklist;
  }

  

  public void setDependentPicklist(boolean dependentPicklist) {
    this.dependentPicklist = dependentPicklist;
    dependentPicklist__is_set = true;
  }
  
  /**
   * element  : deprecatedAndHidden of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo deprecatedAndHidden__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","deprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean deprecatedAndHidden__is_set = false;

  private boolean deprecatedAndHidden;

  public boolean getDeprecatedAndHidden() {
    return deprecatedAndHidden;
  }

  

  public boolean isDeprecatedAndHidden() {
    return deprecatedAndHidden;
  }

  

  public void setDeprecatedAndHidden(boolean deprecatedAndHidden) {
    this.deprecatedAndHidden = deprecatedAndHidden;
    deprecatedAndHidden__is_set = true;
  }
  
  /**
   * element  : digits of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo digits__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","digits","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean digits__is_set = false;

  private int digits;

  public int getDigits() {
    return digits;
  }

  

  public void setDigits(int digits) {
    this.digits = digits;
    digits__is_set = true;
  }
  
  /**
   * element  : externalId of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo externalId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","externalId","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean externalId__is_set = false;

  private boolean externalId;

  public boolean getExternalId() {
    return externalId;
  }

  

  public boolean isExternalId() {
    return externalId;
  }

  

  public void setExternalId(boolean externalId) {
    this.externalId = externalId;
    externalId__is_set = true;
  }
  
  /**
   * element  : filterable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo filterable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","filterable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean filterable__is_set = false;

  private boolean filterable;

  public boolean getFilterable() {
    return filterable;
  }

  

  public boolean isFilterable() {
    return filterable;
  }

  

  public void setFilterable(boolean filterable) {
    this.filterable = filterable;
    filterable__is_set = true;
  }
  
  /**
   * element  : groupable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo groupable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","groupable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean groupable__is_set = false;

  private boolean groupable;

  public boolean getGroupable() {
    return groupable;
  }

  

  public boolean isGroupable() {
    return groupable;
  }

  

  public void setGroupable(boolean groupable) {
    this.groupable = groupable;
    groupable__is_set = true;
  }
  
  /**
   * element  : htmlFormatted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo htmlFormatted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","htmlFormatted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean htmlFormatted__is_set = false;

  private boolean htmlFormatted;

  public boolean getHtmlFormatted() {
    return htmlFormatted;
  }

  

  public boolean isHtmlFormatted() {
    return htmlFormatted;
  }

  

  public void setHtmlFormatted(boolean htmlFormatted) {
    this.htmlFormatted = htmlFormatted;
    htmlFormatted__is_set = true;
  }
  
  /**
   * element  : idLookup of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo idLookup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","idLookup","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean idLookup__is_set = false;

  private boolean idLookup;

  public boolean getIdLookup() {
    return idLookup;
  }

  

  public boolean isIdLookup() {
    return idLookup;
  }

  

  public void setIdLookup(boolean idLookup) {
    this.idLookup = idLookup;
    idLookup__is_set = true;
  }
  
  /**
   * element  : inlineHelpText of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo inlineHelpText__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","inlineHelpText","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean inlineHelpText__is_set = false;

  private java.lang.String inlineHelpText;

  public java.lang.String getInlineHelpText() {
    return inlineHelpText;
  }

  

  public void setInlineHelpText(java.lang.String inlineHelpText) {
    this.inlineHelpText = inlineHelpText;
    inlineHelpText__is_set = true;
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
   * element  : length of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo length__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","length","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean length__is_set = false;

  private int length;

  public int getLength() {
    return length;
  }

  

  public void setLength(int length) {
    this.length = length;
    length__is_set = true;
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
   * element  : nameField of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo nameField__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","nameField","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean nameField__is_set = false;

  private boolean nameField;

  public boolean getNameField() {
    return nameField;
  }

  

  public boolean isNameField() {
    return nameField;
  }

  

  public void setNameField(boolean nameField) {
    this.nameField = nameField;
    nameField__is_set = true;
  }
  
  /**
   * element  : namePointing of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo namePointing__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","namePointing","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean namePointing__is_set = false;

  private boolean namePointing;

  public boolean getNamePointing() {
    return namePointing;
  }

  

  public boolean isNamePointing() {
    return namePointing;
  }

  

  public void setNamePointing(boolean namePointing) {
    this.namePointing = namePointing;
    namePointing__is_set = true;
  }
  
  /**
   * element  : nillable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo nillable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","nillable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean nillable__is_set = false;

  private boolean nillable;

  public boolean getNillable() {
    return nillable;
  }

  

  public boolean isNillable() {
    return nillable;
  }

  

  public void setNillable(boolean nillable) {
    this.nillable = nillable;
    nillable__is_set = true;
  }
  
  /**
   * element  : picklistValues of type {urn:partner.soap.sforce.com}PicklistEntry
   * java type: com.sforce.soap.partner.PicklistEntry[]
   */
  private static final com.sforce.ws.bind.TypeInfo picklistValues__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","picklistValues","urn:partner.soap.sforce.com","PicklistEntry",0,-1,true);

  private boolean picklistValues__is_set = false;

  private com.sforce.soap.partner.PicklistEntry[] picklistValues = new com.sforce.soap.partner.PicklistEntry[0];

  public com.sforce.soap.partner.PicklistEntry[] getPicklistValues() {
    return picklistValues;
  }

  

  public void setPicklistValues(com.sforce.soap.partner.PicklistEntry[] picklistValues) {
    this.picklistValues = picklistValues;
    picklistValues__is_set = true;
  }
  
  /**
   * element  : precision of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo precision__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","precision","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean precision__is_set = false;

  private int precision;

  public int getPrecision() {
    return precision;
  }

  

  public void setPrecision(int precision) {
    this.precision = precision;
    precision__is_set = true;
  }
  
  /**
   * element  : referenceTo of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo referenceTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","referenceTo","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean referenceTo__is_set = false;

  private java.lang.String[] referenceTo = new java.lang.String[0];

  public java.lang.String[] getReferenceTo() {
    return referenceTo;
  }

  

  public void setReferenceTo(java.lang.String[] referenceTo) {
    this.referenceTo = referenceTo;
    referenceTo__is_set = true;
  }
  
  /**
   * element  : relationshipName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo relationshipName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","relationshipName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean relationshipName__is_set = false;

  private java.lang.String relationshipName;

  public java.lang.String getRelationshipName() {
    return relationshipName;
  }

  

  public void setRelationshipName(java.lang.String relationshipName) {
    this.relationshipName = relationshipName;
    relationshipName__is_set = true;
  }
  
  /**
   * element  : relationshipOrder of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo relationshipOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","relationshipOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean relationshipOrder__is_set = false;

  private int relationshipOrder;

  public int getRelationshipOrder() {
    return relationshipOrder;
  }

  

  public void setRelationshipOrder(int relationshipOrder) {
    this.relationshipOrder = relationshipOrder;
    relationshipOrder__is_set = true;
  }
  
  /**
   * element  : restrictedPicklist of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo restrictedPicklist__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","restrictedPicklist","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean restrictedPicklist__is_set = false;

  private boolean restrictedPicklist;

  public boolean getRestrictedPicklist() {
    return restrictedPicklist;
  }

  

  public boolean isRestrictedPicklist() {
    return restrictedPicklist;
  }

  

  public void setRestrictedPicklist(boolean restrictedPicklist) {
    this.restrictedPicklist = restrictedPicklist;
    restrictedPicklist__is_set = true;
  }
  
  /**
   * element  : scale of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo scale__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","scale","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean scale__is_set = false;

  private int scale;

  public int getScale() {
    return scale;
  }

  

  public void setScale(int scale) {
    this.scale = scale;
    scale__is_set = true;
  }
  
  /**
   * element  : soapType of type {urn:partner.soap.sforce.com}soapType
   * java type: com.sforce.soap.partner.SoapType
   */
  private static final com.sforce.ws.bind.TypeInfo soapType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","soapType","urn:partner.soap.sforce.com","soapType",1,1,true);

  private boolean soapType__is_set = false;

  private com.sforce.soap.partner.SoapType soapType;

  public com.sforce.soap.partner.SoapType getSoapType() {
    return soapType;
  }

  

  public void setSoapType(com.sforce.soap.partner.SoapType soapType) {
    this.soapType = soapType;
    soapType__is_set = true;
  }
  
  /**
   * element  : sortable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo sortable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sortable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean sortable__is_set = false;

  private boolean sortable;

  public boolean getSortable() {
    return sortable;
  }

  

  public boolean isSortable() {
    return sortable;
  }

  

  public void setSortable(boolean sortable) {
    this.sortable = sortable;
    sortable__is_set = true;
  }
  
  /**
   * element  : type of type {urn:partner.soap.sforce.com}fieldType
   * java type: com.sforce.soap.partner.FieldType
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","type","urn:partner.soap.sforce.com","fieldType",1,1,true);

  private boolean type__is_set = false;

  private com.sforce.soap.partner.FieldType type;

  public com.sforce.soap.partner.FieldType getType() {
    return type;
  }

  

  public void setType(com.sforce.soap.partner.FieldType type) {
    this.type = type;
    type__is_set = true;
  }
  
  /**
   * element  : unique of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo unique__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","unique","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean unique__is_set = false;

  private boolean unique;

  public boolean getUnique() {
    return unique;
  }

  

  public boolean isUnique() {
    return unique;
  }

  

  public void setUnique(boolean unique) {
    this.unique = unique;
    unique__is_set = true;
  }
  
  /**
   * element  : updateable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo updateable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","updateable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean updateable__is_set = false;

  private boolean updateable;

  public boolean getUpdateable() {
    return updateable;
  }

  

  public boolean isUpdateable() {
    return updateable;
  }

  

  public void setUpdateable(boolean updateable) {
    this.updateable = updateable;
    updateable__is_set = true;
  }
  
  /**
   * element  : writeRequiresMasterRead of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo writeRequiresMasterRead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","writeRequiresMasterRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean writeRequiresMasterRead__is_set = false;

  private boolean writeRequiresMasterRead;

  public boolean getWriteRequiresMasterRead() {
    return writeRequiresMasterRead;
  }

  

  public boolean isWriteRequiresMasterRead() {
    return writeRequiresMasterRead;
  }

  

  public void setWriteRequiresMasterRead(boolean writeRequiresMasterRead) {
    this.writeRequiresMasterRead = writeRequiresMasterRead;
    writeRequiresMasterRead__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, autoNumber__typeInfo, autoNumber, autoNumber__is_set);
    __typeMapper.writeInt(__out, byteLength__typeInfo, byteLength, byteLength__is_set);
    __typeMapper.writeBoolean(__out, calculated__typeInfo, calculated, calculated__is_set);
    __typeMapper.writeString(__out, calculatedFormula__typeInfo, calculatedFormula, calculatedFormula__is_set);
    __typeMapper.writeBoolean(__out, caseSensitive__typeInfo, caseSensitive, caseSensitive__is_set);
    __typeMapper.writeString(__out, controllerName__typeInfo, controllerName, controllerName__is_set);
    __typeMapper.writeBoolean(__out, createable__typeInfo, createable, createable__is_set);
    __typeMapper.writeBoolean(__out, custom__typeInfo, custom, custom__is_set);
    __typeMapper.writeString(__out, defaultValueFormula__typeInfo, defaultValueFormula, defaultValueFormula__is_set);
    __typeMapper.writeBoolean(__out, defaultedOnCreate__typeInfo, defaultedOnCreate, defaultedOnCreate__is_set);
    __typeMapper.writeBoolean(__out, dependentPicklist__typeInfo, dependentPicklist, dependentPicklist__is_set);
    __typeMapper.writeBoolean(__out, deprecatedAndHidden__typeInfo, deprecatedAndHidden, deprecatedAndHidden__is_set);
    __typeMapper.writeInt(__out, digits__typeInfo, digits, digits__is_set);
    __typeMapper.writeBoolean(__out, externalId__typeInfo, externalId, externalId__is_set);
    __typeMapper.writeBoolean(__out, filterable__typeInfo, filterable, filterable__is_set);
    __typeMapper.writeBoolean(__out, groupable__typeInfo, groupable, groupable__is_set);
    __typeMapper.writeBoolean(__out, htmlFormatted__typeInfo, htmlFormatted, htmlFormatted__is_set);
    __typeMapper.writeBoolean(__out, idLookup__typeInfo, idLookup, idLookup__is_set);
    __typeMapper.writeString(__out, inlineHelpText__typeInfo, inlineHelpText, inlineHelpText__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeInt(__out, length__typeInfo, length, length__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeBoolean(__out, nameField__typeInfo, nameField, nameField__is_set);
    __typeMapper.writeBoolean(__out, namePointing__typeInfo, namePointing, namePointing__is_set);
    __typeMapper.writeBoolean(__out, nillable__typeInfo, nillable, nillable__is_set);
    __typeMapper.writeObject(__out, picklistValues__typeInfo, picklistValues, picklistValues__is_set);
    __typeMapper.writeInt(__out, precision__typeInfo, precision, precision__is_set);
    __typeMapper.writeObject(__out, referenceTo__typeInfo, referenceTo, referenceTo__is_set);
    __typeMapper.writeString(__out, relationshipName__typeInfo, relationshipName, relationshipName__is_set);
    __typeMapper.writeInt(__out, relationshipOrder__typeInfo, relationshipOrder, relationshipOrder__is_set);
    __typeMapper.writeBoolean(__out, restrictedPicklist__typeInfo, restrictedPicklist, restrictedPicklist__is_set);
    __typeMapper.writeInt(__out, scale__typeInfo, scale, scale__is_set);
    __typeMapper.writeObject(__out, soapType__typeInfo, soapType, soapType__is_set);
    __typeMapper.writeBoolean(__out, sortable__typeInfo, sortable, sortable__is_set);
    __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
    __typeMapper.writeBoolean(__out, unique__typeInfo, unique, unique__is_set);
    __typeMapper.writeBoolean(__out, updateable__typeInfo, updateable, updateable__is_set);
    __typeMapper.writeBoolean(__out, writeRequiresMasterRead__typeInfo, writeRequiresMasterRead, writeRequiresMasterRead__is_set);
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
    if (__typeMapper.verifyElement(__in, autoNumber__typeInfo)) {
      setAutoNumber((boolean)__typeMapper.readBoolean(__in, autoNumber__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, byteLength__typeInfo)) {
      setByteLength((int)__typeMapper.readInt(__in, byteLength__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, calculated__typeInfo)) {
      setCalculated((boolean)__typeMapper.readBoolean(__in, calculated__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, calculatedFormula__typeInfo)) {
      setCalculatedFormula((java.lang.String)__typeMapper.readString(__in, calculatedFormula__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, caseSensitive__typeInfo)) {
      setCaseSensitive((boolean)__typeMapper.readBoolean(__in, caseSensitive__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, controllerName__typeInfo)) {
      setControllerName((java.lang.String)__typeMapper.readString(__in, controllerName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, createable__typeInfo)) {
      setCreateable((boolean)__typeMapper.readBoolean(__in, createable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, custom__typeInfo)) {
      setCustom((boolean)__typeMapper.readBoolean(__in, custom__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, defaultValueFormula__typeInfo)) {
      setDefaultValueFormula((java.lang.String)__typeMapper.readString(__in, defaultValueFormula__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, defaultedOnCreate__typeInfo)) {
      setDefaultedOnCreate((boolean)__typeMapper.readBoolean(__in, defaultedOnCreate__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dependentPicklist__typeInfo)) {
      setDependentPicklist((boolean)__typeMapper.readBoolean(__in, dependentPicklist__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, deprecatedAndHidden__typeInfo)) {
      setDeprecatedAndHidden((boolean)__typeMapper.readBoolean(__in, deprecatedAndHidden__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, digits__typeInfo)) {
      setDigits((int)__typeMapper.readInt(__in, digits__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, externalId__typeInfo)) {
      setExternalId((boolean)__typeMapper.readBoolean(__in, externalId__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, filterable__typeInfo)) {
      setFilterable((boolean)__typeMapper.readBoolean(__in, filterable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, groupable__typeInfo)) {
      setGroupable((boolean)__typeMapper.readBoolean(__in, groupable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, htmlFormatted__typeInfo)) {
      setHtmlFormatted((boolean)__typeMapper.readBoolean(__in, htmlFormatted__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, idLookup__typeInfo)) {
      setIdLookup((boolean)__typeMapper.readBoolean(__in, idLookup__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, inlineHelpText__typeInfo)) {
      setInlineHelpText((java.lang.String)__typeMapper.readString(__in, inlineHelpText__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, length__typeInfo)) {
      setLength((int)__typeMapper.readInt(__in, length__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, nameField__typeInfo)) {
      setNameField((boolean)__typeMapper.readBoolean(__in, nameField__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, namePointing__typeInfo)) {
      setNamePointing((boolean)__typeMapper.readBoolean(__in, namePointing__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, nillable__typeInfo)) {
      setNillable((boolean)__typeMapper.readBoolean(__in, nillable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, picklistValues__typeInfo)) {
      setPicklistValues((com.sforce.soap.partner.PicklistEntry[])__typeMapper.readObject(__in, picklistValues__typeInfo, com.sforce.soap.partner.PicklistEntry[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, precision__typeInfo)) {
      setPrecision((int)__typeMapper.readInt(__in, precision__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, referenceTo__typeInfo)) {
      setReferenceTo((java.lang.String[])__typeMapper.readObject(__in, referenceTo__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, relationshipName__typeInfo)) {
      setRelationshipName((java.lang.String)__typeMapper.readString(__in, relationshipName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, relationshipOrder__typeInfo)) {
      setRelationshipOrder((int)__typeMapper.readInt(__in, relationshipOrder__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, restrictedPicklist__typeInfo)) {
      setRestrictedPicklist((boolean)__typeMapper.readBoolean(__in, restrictedPicklist__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, scale__typeInfo)) {
      setScale((int)__typeMapper.readInt(__in, scale__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, soapType__typeInfo)) {
      setSoapType((com.sforce.soap.partner.SoapType)__typeMapper.readObject(__in, soapType__typeInfo, com.sforce.soap.partner.SoapType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sortable__typeInfo)) {
      setSortable((boolean)__typeMapper.readBoolean(__in, sortable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((com.sforce.soap.partner.FieldType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.partner.FieldType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, unique__typeInfo)) {
      setUnique((boolean)__typeMapper.readBoolean(__in, unique__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, updateable__typeInfo)) {
      setUpdateable((boolean)__typeMapper.readBoolean(__in, updateable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, writeRequiresMasterRead__typeInfo)) {
      setWriteRequiresMasterRead((boolean)__typeMapper.readBoolean(__in, writeRequiresMasterRead__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Field ");
    
    sb.append(" autoNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(autoNumber)+"'\n");
    sb.append(" byteLength=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(byteLength)+"'\n");
    sb.append(" calculated=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(calculated)+"'\n");
    sb.append(" calculatedFormula=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(calculatedFormula)+"'\n");
    sb.append(" caseSensitive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(caseSensitive)+"'\n");
    sb.append(" controllerName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(controllerName)+"'\n");
    sb.append(" createable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(createable)+"'\n");
    sb.append(" custom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(custom)+"'\n");
    sb.append(" defaultValueFormula=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultValueFormula)+"'\n");
    sb.append(" defaultedOnCreate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultedOnCreate)+"'\n");
    sb.append(" dependentPicklist=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dependentPicklist)+"'\n");
    sb.append(" deprecatedAndHidden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(deprecatedAndHidden)+"'\n");
    sb.append(" digits=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(digits)+"'\n");
    sb.append(" externalId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(externalId)+"'\n");
    sb.append(" filterable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(filterable)+"'\n");
    sb.append(" groupable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(groupable)+"'\n");
    sb.append(" htmlFormatted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(htmlFormatted)+"'\n");
    sb.append(" idLookup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(idLookup)+"'\n");
    sb.append(" inlineHelpText=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(inlineHelpText)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" length=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(length)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" nameField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(nameField)+"'\n");
    sb.append(" namePointing=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(namePointing)+"'\n");
    sb.append(" nillable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(nillable)+"'\n");
    sb.append(" picklistValues=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(picklistValues)+"'\n");
    sb.append(" precision=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(precision)+"'\n");
    sb.append(" referenceTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(referenceTo)+"'\n");
    sb.append(" relationshipName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(relationshipName)+"'\n");
    sb.append(" relationshipOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(relationshipOrder)+"'\n");
    sb.append(" restrictedPicklist=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(restrictedPicklist)+"'\n");
    sb.append(" scale=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(scale)+"'\n");
    sb.append(" soapType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(soapType)+"'\n");
    sb.append(" sortable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortable)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append(" unique=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(unique)+"'\n");
    sb.append(" updateable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(updateable)+"'\n");
    sb.append(" writeRequiresMasterRead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(writeRequiresMasterRead)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}