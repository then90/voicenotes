package com.sforce.soap.partner;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.bind.XMLizable;
import com.sforce.ws.bind.TypeMapper;

import java.util.HashMap;

import com.mavens.xml.namespace.QName;

/**
 * Generated class, please do not edit.
 */
public class PartnerConnection {

  private TypeMapper __typeMapper = new TypeMapper();
  private ConnectorConfig __config;
  private HashMap<QName, XMLizable> __extraHeaders = new HashMap<QName, XMLizable>();

  public ConnectorConfig getConfig() {
    return __config;
  }

  
  private com.sforce.soap.partner.MruHeader_element __MruHeader;

  public void setMruHeader(boolean updateMru) {
    __MruHeader = new com.sforce.soap.partner.MruHeader_element();
     
       __MruHeader.setUpdateMru(updateMru);
  }

  public void clearMruHeader() {
    __MruHeader = null;
  }

  public com.sforce.soap.partner.MruHeader_element getMruHeader() {
    return  __MruHeader;
  }

  public void __setMruHeader(com.sforce.soap.partner.MruHeader_element __header) {
    __MruHeader = __header ;
  }

  
  private com.sforce.soap.partner.CallOptions_element __CallOptions;

  public void setCallOptions(java.lang.String client,java.lang.String defaultNamespace) {
    __CallOptions = new com.sforce.soap.partner.CallOptions_element();
     
       __CallOptions.setClient(client);
       __CallOptions.setDefaultNamespace(defaultNamespace);
  }

  public void clearCallOptions() {
    __CallOptions = null;
  }

  public com.sforce.soap.partner.CallOptions_element getCallOptions() {
    return  __CallOptions;
  }

  public void __setCallOptions(com.sforce.soap.partner.CallOptions_element __header) {
    __CallOptions = __header ;
  }

  
  private com.sforce.soap.partner.PackageVersionHeader_element __PackageVersionHeader;

  public void setPackageVersionHeader(com.sforce.soap.partner.PackageVersion[] packageVersions) {
    __PackageVersionHeader = new com.sforce.soap.partner.PackageVersionHeader_element();
     
       __PackageVersionHeader.setPackageVersions(packageVersions);
  }

  public void clearPackageVersionHeader() {
    __PackageVersionHeader = null;
  }

  public com.sforce.soap.partner.PackageVersionHeader_element getPackageVersionHeader() {
    return  __PackageVersionHeader;
  }

  public void __setPackageVersionHeader(com.sforce.soap.partner.PackageVersionHeader_element __header) {
    __PackageVersionHeader = __header ;
  }

  
  private com.sforce.soap.partner.LocaleOptions_element __LocaleOptions;

  public void setLocaleOptions(java.lang.String language) {
    __LocaleOptions = new com.sforce.soap.partner.LocaleOptions_element();
     
       __LocaleOptions.setLanguage(language);
  }

  public void clearLocaleOptions() {
    __LocaleOptions = null;
  }

  public com.sforce.soap.partner.LocaleOptions_element getLocaleOptions() {
    return  __LocaleOptions;
  }

  public void __setLocaleOptions(com.sforce.soap.partner.LocaleOptions_element __header) {
    __LocaleOptions = __header ;
  }

  
  private com.sforce.soap.partner.EmailHeader_element __EmailHeader;

  public void setEmailHeader(boolean triggerAutoResponseEmail,boolean triggerOtherEmail,boolean triggerUserEmail) {
    __EmailHeader = new com.sforce.soap.partner.EmailHeader_element();
     
       __EmailHeader.setTriggerAutoResponseEmail(triggerAutoResponseEmail);
       __EmailHeader.setTriggerOtherEmail(triggerOtherEmail);
       __EmailHeader.setTriggerUserEmail(triggerUserEmail);
  }

  public void clearEmailHeader() {
    __EmailHeader = null;
  }

  public com.sforce.soap.partner.EmailHeader_element getEmailHeader() {
    return  __EmailHeader;
  }

  public void __setEmailHeader(com.sforce.soap.partner.EmailHeader_element __header) {
    __EmailHeader = __header ;
  }

  
  private com.sforce.soap.partner.DebuggingInfo_element __DebuggingInfo;

  public void setDebuggingInfo(java.lang.String debugLog) {
    __DebuggingInfo = new com.sforce.soap.partner.DebuggingInfo_element();
     
       __DebuggingInfo.setDebugLog(debugLog);
  }

  public void clearDebuggingInfo() {
    __DebuggingInfo = null;
  }

  public com.sforce.soap.partner.DebuggingInfo_element getDebuggingInfo() {
    return  __DebuggingInfo;
  }

  public void __setDebuggingInfo(com.sforce.soap.partner.DebuggingInfo_element __header) {
    __DebuggingInfo = __header ;
  }

  
  private com.sforce.soap.partner.SessionHeader_element __SessionHeader;

  public void setSessionHeader(java.lang.String sessionId) {
    __SessionHeader = new com.sforce.soap.partner.SessionHeader_element();
     
       __SessionHeader.setSessionId(sessionId);
  }

  public void clearSessionHeader() {
    __SessionHeader = null;
  }

  public com.sforce.soap.partner.SessionHeader_element getSessionHeader() {
    return  __SessionHeader;
  }

  public void __setSessionHeader(com.sforce.soap.partner.SessionHeader_element __header) {
    __SessionHeader = __header ;
  }

  
  private com.sforce.soap.partner.DebuggingHeader_element __DebuggingHeader;

  public void setDebuggingHeader(com.sforce.soap.partner.DebugLevel debugLevel) {
    __DebuggingHeader = new com.sforce.soap.partner.DebuggingHeader_element();
     
       __DebuggingHeader.setDebugLevel(debugLevel);
  }

  public void clearDebuggingHeader() {
    __DebuggingHeader = null;
  }

  public com.sforce.soap.partner.DebuggingHeader_element getDebuggingHeader() {
    return  __DebuggingHeader;
  }

  public void __setDebuggingHeader(com.sforce.soap.partner.DebuggingHeader_element __header) {
    __DebuggingHeader = __header ;
  }

  
  private com.sforce.soap.partner.DisableFeedTrackingHeader_element __DisableFeedTrackingHeader;

  public void setDisableFeedTrackingHeader(boolean disableFeedTracking) {
    __DisableFeedTrackingHeader = new com.sforce.soap.partner.DisableFeedTrackingHeader_element();
     
       __DisableFeedTrackingHeader.setDisableFeedTracking(disableFeedTracking);
  }

  public void clearDisableFeedTrackingHeader() {
    __DisableFeedTrackingHeader = null;
  }

  public com.sforce.soap.partner.DisableFeedTrackingHeader_element getDisableFeedTrackingHeader() {
    return  __DisableFeedTrackingHeader;
  }

  public void __setDisableFeedTrackingHeader(com.sforce.soap.partner.DisableFeedTrackingHeader_element __header) {
    __DisableFeedTrackingHeader = __header ;
  }

  
  private com.sforce.soap.partner.LoginScopeHeader_element __LoginScopeHeader;

  public void setLoginScopeHeader(java.lang.String organizationId,java.lang.String portalId) {
    __LoginScopeHeader = new com.sforce.soap.partner.LoginScopeHeader_element();
     
       __LoginScopeHeader.setOrganizationId(organizationId);
       __LoginScopeHeader.setPortalId(portalId);
  }

  public void clearLoginScopeHeader() {
    __LoginScopeHeader = null;
  }

  public com.sforce.soap.partner.LoginScopeHeader_element getLoginScopeHeader() {
    return  __LoginScopeHeader;
  }

  public void __setLoginScopeHeader(com.sforce.soap.partner.LoginScopeHeader_element __header) {
    __LoginScopeHeader = __header ;
  }

  
  private com.sforce.soap.partner.AllowFieldTruncationHeader_element __AllowFieldTruncationHeader;

  public void setAllowFieldTruncationHeader(boolean allowFieldTruncation) {
    __AllowFieldTruncationHeader = new com.sforce.soap.partner.AllowFieldTruncationHeader_element();
     
       __AllowFieldTruncationHeader.setAllowFieldTruncation(allowFieldTruncation);
  }

  public void clearAllowFieldTruncationHeader() {
    __AllowFieldTruncationHeader = null;
  }

  public com.sforce.soap.partner.AllowFieldTruncationHeader_element getAllowFieldTruncationHeader() {
    return  __AllowFieldTruncationHeader;
  }

  public void __setAllowFieldTruncationHeader(com.sforce.soap.partner.AllowFieldTruncationHeader_element __header) {
    __AllowFieldTruncationHeader = __header ;
  }

  
  private com.sforce.soap.partner.UserTerritoryDeleteHeader_element __UserTerritoryDeleteHeader;

  public void setUserTerritoryDeleteHeader(java.lang.String transferToUserId) {
    __UserTerritoryDeleteHeader = new com.sforce.soap.partner.UserTerritoryDeleteHeader_element();
     
       __UserTerritoryDeleteHeader.setTransferToUserId(transferToUserId);
  }

  public void clearUserTerritoryDeleteHeader() {
    __UserTerritoryDeleteHeader = null;
  }

  public com.sforce.soap.partner.UserTerritoryDeleteHeader_element getUserTerritoryDeleteHeader() {
    return  __UserTerritoryDeleteHeader;
  }

  public void __setUserTerritoryDeleteHeader(com.sforce.soap.partner.UserTerritoryDeleteHeader_element __header) {
    __UserTerritoryDeleteHeader = __header ;
  }

  
  private com.sforce.soap.partner.QueryOptions_element __QueryOptions;

  public void setQueryOptions(int batchSize) {
    __QueryOptions = new com.sforce.soap.partner.QueryOptions_element();
     
       __QueryOptions.setBatchSize(batchSize);
  }

  public void clearQueryOptions() {
    __QueryOptions = null;
  }

  public com.sforce.soap.partner.QueryOptions_element getQueryOptions() {
    return  __QueryOptions;
  }

  public void __setQueryOptions(com.sforce.soap.partner.QueryOptions_element __header) {
    __QueryOptions = __header ;
  }

  
  private com.sforce.soap.partner.AssignmentRuleHeader_element __AssignmentRuleHeader;

  public void setAssignmentRuleHeader(java.lang.String assignmentRuleId,java.lang.Boolean useDefaultRule) {
    __AssignmentRuleHeader = new com.sforce.soap.partner.AssignmentRuleHeader_element();
     
       __AssignmentRuleHeader.setAssignmentRuleId(assignmentRuleId);
       __AssignmentRuleHeader.setUseDefaultRule(useDefaultRule);
  }

  public void clearAssignmentRuleHeader() {
    __AssignmentRuleHeader = null;
  }

  public com.sforce.soap.partner.AssignmentRuleHeader_element getAssignmentRuleHeader() {
    return  __AssignmentRuleHeader;
  }

  public void __setAssignmentRuleHeader(com.sforce.soap.partner.AssignmentRuleHeader_element __header) {
    __AssignmentRuleHeader = __header ;
  }

  

  public PartnerConnection(ConnectorConfig config) throws ConnectionException {
    this.__config = config;
    this.__typeMapper.setPackagePrefix(null);
    this.__typeMapper.setConfig(config);

    
    config.verifyPartnerEndpoint();
    if (!config.isManualLogin()) {
      if (config.getSessionId()==null) {
        config.setServiceEndpoint(config.getAuthEndpoint());
        com.sforce.soap.partner.LoginResult result = login(config.getUsername(), config.getPassword());
        config.setSessionId(result.getSessionId());
        config.setServiceEndpoint(result.getServerUrl());
      } else {
        if (config.getServiceEndpoint() == null) {
          throw new com.sforce.ws.ConnectionException("Please set ServiceEndpoint");
        }
      }
    }
    

    
      __SessionHeader = new SessionHeader_element();
      __SessionHeader.setSessionId(config.getSessionId());
    
  }

  private com.sforce.ws.transport.SoapConnection newConnection() {
      com.sforce.ws.transport.SoapConnection __c   = new com.sforce.ws.transport.SoapConnection(
           __config.getServiceEndpoint(), "urn:sobject.partner.soap.sforce.com", __typeMapper, __config);

      __c.setConnection(this);
      __c.setKnownHeaders(knownHeaders);
      return __c;
   }

  
  public com.sforce.soap.partner.LeadConvertResult[] convertLead(com.sforce.soap.partner.LeadConvert[] leadConverts)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.ConvertLead_element __request = new com.sforce.soap.partner.ConvertLead_element();
    com.sforce.soap.partner.ConvertLeadResponse_element __response = new com.sforce.soap.partner.ConvertLeadResponse_element();

  
    __request.setLeadConverts(leadConverts);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.ConvertLeadResponse_element) __connection.send("",
       convertLead_qname, __request, convertLeadResponse_qname,
       com.sforce.soap.partner.ConvertLeadResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs,boolean topCategoriesOnly)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeDataCategoryGroupStructures_element __request = new com.sforce.soap.partner.DescribeDataCategoryGroupStructures_element();
    com.sforce.soap.partner.DescribeDataCategoryGroupStructuresResponse_element __response = new com.sforce.soap.partner.DescribeDataCategoryGroupStructuresResponse_element();

  
    __request.setPairs(pairs);
    __request.setTopCategoriesOnly(topCategoriesOnly);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeDataCategoryGroupStructuresResponse_element) __connection.send("",
       describeDataCategoryGroupStructures_qname, __request, describeDataCategoryGroupStructuresResponse_qname,
       com.sforce.soap.partner.DescribeDataCategoryGroupStructuresResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.SendEmailResult[] sendEmail(com.sforce.soap.partner.Email[] messages)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.SendEmail_element __request = new com.sforce.soap.partner.SendEmail_element();
    com.sforce.soap.partner.SendEmailResponse_element __response = new com.sforce.soap.partner.SendEmailResponse_element();

  
    __request.setMessages(messages);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.SendEmailResponse_element) __connection.send("",
       sendEmail_qname, __request, sendEmailResponse_qname,
       com.sforce.soap.partner.SendEmailResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeGlobalResult describeGlobal()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeGlobal_element __request = new com.sforce.soap.partner.DescribeGlobal_element();
    com.sforce.soap.partner.DescribeGlobalResponse_element __response = new com.sforce.soap.partner.DescribeGlobalResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeGlobalResponse_element) __connection.send("",
       describeGlobal_qname, __request, describeGlobalResponse_qname,
       com.sforce.soap.partner.DescribeGlobalResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.sobject.SObject[] retrieve(java.lang.String fieldList,java.lang.String sObjectType,java.lang.String[] ids)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Retrieve_element __request = new com.sforce.soap.partner.Retrieve_element();
    com.sforce.soap.partner.RetrieveResponse_element __response = new com.sforce.soap.partner.RetrieveResponse_element();

  
    __request.setFieldList(fieldList);
    __request.setSObjectType(sObjectType);
    __request.setIds(ids);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.RetrieveResponse_element) __connection.send("",
       retrieve_qname, __request, retrieveResponse_qname,
       com.sforce.soap.partner.RetrieveResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeLayoutResult describeLayout(java.lang.String sObjectType,java.lang.String[] recordTypeIds)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeLayout_element __request = new com.sforce.soap.partner.DescribeLayout_element();
    com.sforce.soap.partner.DescribeLayoutResponse_element __response = new com.sforce.soap.partner.DescribeLayoutResponse_element();

  
    __request.setSObjectType(sObjectType);
    __request.setRecordTypeIds(recordTypeIds);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeLayoutResponse_element) __connection.send("",
       describeLayout_qname, __request, describeLayoutResponse_qname,
       com.sforce.soap.partner.DescribeLayoutResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.EmptyRecycleBin_element __request = new com.sforce.soap.partner.EmptyRecycleBin_element();
    com.sforce.soap.partner.EmptyRecycleBinResponse_element __response = new com.sforce.soap.partner.EmptyRecycleBinResponse_element();

  
    __request.setIds(ids);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.EmptyRecycleBinResponse_element) __connection.send("",
       emptyRecycleBin_qname, __request, emptyRecycleBinResponse_qname,
       com.sforce.soap.partner.EmptyRecycleBinResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.ProcessResult[] process(com.sforce.soap.partner.ProcessRequest[] actions)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Process_element __request = new com.sforce.soap.partner.Process_element();
    com.sforce.soap.partner.ProcessResponse_element __response = new com.sforce.soap.partner.ProcessResponse_element();

  
    __request.setActions(actions);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.ProcessResponse_element) __connection.send("",
       process_qname, __request, processResponse_qname,
       com.sforce.soap.partner.ProcessResponse_element.class);

    return __response.getResult();
  }
  
  public void logout()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Logout_element __request = new com.sforce.soap.partner.Logout_element();
    com.sforce.soap.partner.LogoutResponse_element __response = new com.sforce.soap.partner.LogoutResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.LogoutResponse_element) __connection.send("",
       logout_qname, __request, logoutResponse_qname,
       com.sforce.soap.partner.LogoutResponse_element.class);

    
  }
  
  public com.sforce.soap.partner.SaveResult[] create(com.sforce.soap.partner.sobject.SObject[] sObjects)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Create_element __request = new com.sforce.soap.partner.Create_element();
    com.sforce.soap.partner.CreateResponse_element __response = new com.sforce.soap.partner.CreateResponse_element();

  
    __request.setSObjects(sObjects);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AssignmentRuleHeader != null) __connection.addHeader(AssignmentRuleHeader_qname, __AssignmentRuleHeader);
    
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__EmailHeader != null) __connection.addHeader(EmailHeader_qname, __EmailHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.CreateResponse_element) __connection.send("",
       create_qname, __request, createResponse_qname,
       com.sforce.soap.partner.CreateResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.InvalidateSessions_element __request = new com.sforce.soap.partner.InvalidateSessions_element();
    com.sforce.soap.partner.InvalidateSessionsResponse_element __response = new com.sforce.soap.partner.InvalidateSessionsResponse_element();

  
    __request.setSessionIds(sessionIds);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.InvalidateSessionsResponse_element) __connection.send("",
       invalidateSessions_qname, __request, invalidateSessionsResponse_qname,
       com.sforce.soap.partner.InvalidateSessionsResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.GetUserInfoResult getUserInfo()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.GetUserInfo_element __request = new com.sforce.soap.partner.GetUserInfo_element();
    com.sforce.soap.partner.GetUserInfoResponse_element __response = new com.sforce.soap.partner.GetUserInfoResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.GetUserInfoResponse_element) __connection.send("",
       getUserInfo_qname, __request, getUserInfoResponse_qname,
       com.sforce.soap.partner.GetUserInfoResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.GetServerTimestampResult getServerTimestamp()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.GetServerTimestamp_element __request = new com.sforce.soap.partner.GetServerTimestamp_element();
    com.sforce.soap.partner.GetServerTimestampResponse_element __response = new com.sforce.soap.partner.GetServerTimestampResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.GetServerTimestampResponse_element) __connection.send("",
       getServerTimestamp_qname, __request, getServerTimestampResponse_qname,
       com.sforce.soap.partner.GetServerTimestampResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.GetDeletedResult getDeleted(java.lang.String sObjectType,java.util.Calendar startDate,java.util.Calendar endDate)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.GetDeleted_element __request = new com.sforce.soap.partner.GetDeleted_element();
    com.sforce.soap.partner.GetDeletedResponse_element __response = new com.sforce.soap.partner.GetDeletedResponse_element();

  
    __request.setSObjectType(sObjectType);
    __request.setStartDate(startDate);
    __request.setEndDate(endDate);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.GetDeletedResponse_element) __connection.send("",
       getDeleted_qname, __request, getDeletedResponse_qname,
       com.sforce.soap.partner.GetDeletedResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.SetPasswordResult setPassword(java.lang.String userId,java.lang.String password)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.SetPassword_element __request = new com.sforce.soap.partner.SetPassword_element();
    com.sforce.soap.partner.SetPasswordResponse_element __response = new com.sforce.soap.partner.SetPasswordResponse_element();

  
    __request.setUserId(userId);
    __request.setPassword(password);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.SetPasswordResponse_element) __connection.send("",
       setPassword_qname, __request, setPasswordResponse_qname,
       com.sforce.soap.partner.SetPasswordResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DeleteResult[] delete(java.lang.String[] ids)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Delete_element __request = new com.sforce.soap.partner.Delete_element();
    com.sforce.soap.partner.DeleteResponse_element __response = new com.sforce.soap.partner.DeleteResponse_element();

  
    __request.setIds(ids);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__UserTerritoryDeleteHeader != null) __connection.addHeader(UserTerritoryDeleteHeader_qname, __UserTerritoryDeleteHeader);
    
    if (__EmailHeader != null) __connection.addHeader(EmailHeader_qname, __EmailHeader);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DeleteResponse_element) __connection.send("",
       delete_qname, __request, deleteResponse_qname,
       com.sforce.soap.partner.DeleteResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeTabSetResult[] describeTabs()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeTabs_element __request = new com.sforce.soap.partner.DescribeTabs_element();
    com.sforce.soap.partner.DescribeTabsResponse_element __response = new com.sforce.soap.partner.DescribeTabsResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeTabsResponse_element) __connection.send("",
       describeTabs_qname, __request, describeTabsResponse_qname,
       com.sforce.soap.partner.DescribeTabsResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.LoginResult login(java.lang.String username,java.lang.String password)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Login_element __request = new com.sforce.soap.partner.Login_element();
    com.sforce.soap.partner.LoginResponse_element __response = new com.sforce.soap.partner.LoginResponse_element();

  
    __request.setUsername(username);
    __request.setPassword(password);

    
    if (__LoginScopeHeader != null) __connection.addHeader(LoginScopeHeader_qname, __LoginScopeHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.LoginResponse_element) __connection.send("",
       login_qname, __request, loginResponse_qname,
       com.sforce.soap.partner.LoginResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.SearchResult search(java.lang.String searchString)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Search_element __request = new com.sforce.soap.partner.Search_element();
    com.sforce.soap.partner.SearchResponse_element __response = new com.sforce.soap.partner.SearchResponse_element();

  
    __request.setSearchString(searchString);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.SearchResponse_element) __connection.send("",
       search_qname, __request, searchResponse_qname,
       com.sforce.soap.partner.SearchResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.QueryResult queryMore(java.lang.String queryLocator)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.QueryMore_element __request = new com.sforce.soap.partner.QueryMore_element();
    com.sforce.soap.partner.QueryMoreResponse_element __response = new com.sforce.soap.partner.QueryMoreResponse_element();

  
    __request.setQueryLocator(queryLocator);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.QueryMoreResponse_element) __connection.send("",
       queryMore_qname, __request, queryMoreResponse_qname,
       com.sforce.soap.partner.QueryMoreResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeDataCategoryGroups_element __request = new com.sforce.soap.partner.DescribeDataCategoryGroups_element();
    com.sforce.soap.partner.DescribeDataCategoryGroupsResponse_element __response = new com.sforce.soap.partner.DescribeDataCategoryGroupsResponse_element();

  
    __request.setSObjectType(sObjectType);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeDataCategoryGroupsResponse_element) __connection.send("",
       describeDataCategoryGroups_qname, __request, describeDataCategoryGroupsResponse_qname,
       com.sforce.soap.partner.DescribeDataCategoryGroupsResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeSoftphoneLayout_element __request = new com.sforce.soap.partner.DescribeSoftphoneLayout_element();
    com.sforce.soap.partner.DescribeSoftphoneLayoutResponse_element __response = new com.sforce.soap.partner.DescribeSoftphoneLayoutResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeSoftphoneLayoutResponse_element) __connection.send("",
       describeSoftphoneLayout_qname, __request, describeSoftphoneLayoutResponse_qname,
       com.sforce.soap.partner.DescribeSoftphoneLayoutResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeSObjectResult describeSObject(java.lang.String sObjectType)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeSObject_element __request = new com.sforce.soap.partner.DescribeSObject_element();
    com.sforce.soap.partner.DescribeSObjectResponse_element __response = new com.sforce.soap.partner.DescribeSObjectResponse_element();

  
    __request.setSObjectType(sObjectType);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__LocaleOptions != null) __connection.addHeader(LocaleOptions_qname, __LocaleOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeSObjectResponse_element) __connection.send("",
       describeSObject_qname, __request, describeSObjectResponse_qname,
       com.sforce.soap.partner.DescribeSObjectResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.DescribeSObjects_element __request = new com.sforce.soap.partner.DescribeSObjects_element();
    com.sforce.soap.partner.DescribeSObjectsResponse_element __response = new com.sforce.soap.partner.DescribeSObjectsResponse_element();

  
    __request.setSObjectType(sObjectType);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__LocaleOptions != null) __connection.addHeader(LocaleOptions_qname, __LocaleOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.DescribeSObjectsResponse_element) __connection.send("",
       describeSObjects_qname, __request, describeSObjectsResponse_qname,
       com.sforce.soap.partner.DescribeSObjectsResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.GetUpdatedResult getUpdated(java.lang.String sObjectType,java.util.Calendar startDate,java.util.Calendar endDate)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.GetUpdated_element __request = new com.sforce.soap.partner.GetUpdated_element();
    com.sforce.soap.partner.GetUpdatedResponse_element __response = new com.sforce.soap.partner.GetUpdatedResponse_element();

  
    __request.setSObjectType(sObjectType);
    __request.setStartDate(startDate);
    __request.setEndDate(endDate);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.GetUpdatedResponse_element) __connection.send("",
       getUpdated_qname, __request, getUpdatedResponse_qname,
       com.sforce.soap.partner.GetUpdatedResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.UpsertResult[] upsert(java.lang.String externalIDFieldName,com.sforce.soap.partner.sobject.SObject[] sObjects)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Upsert_element __request = new com.sforce.soap.partner.Upsert_element();
    com.sforce.soap.partner.UpsertResponse_element __response = new com.sforce.soap.partner.UpsertResponse_element();

  
    __request.setExternalIDFieldName(externalIDFieldName);
    __request.setSObjects(sObjects);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AssignmentRuleHeader != null) __connection.addHeader(AssignmentRuleHeader_qname, __AssignmentRuleHeader);
    
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__EmailHeader != null) __connection.addHeader(EmailHeader_qname, __EmailHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.UpsertResponse_element) __connection.send("",
       upsert_qname, __request, upsertResponse_qname,
       com.sforce.soap.partner.UpsertResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.QueryResult queryAll(java.lang.String queryString)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.QueryAll_element __request = new com.sforce.soap.partner.QueryAll_element();
    com.sforce.soap.partner.QueryAllResponse_element __response = new com.sforce.soap.partner.QueryAllResponse_element();

  
    __request.setQueryString(queryString);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.QueryAllResponse_element) __connection.send("",
       queryAll_qname, __request, queryAllResponse_qname,
       com.sforce.soap.partner.QueryAllResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.ResetPasswordResult resetPassword(java.lang.String userId)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.ResetPassword_element __request = new com.sforce.soap.partner.ResetPassword_element();
    com.sforce.soap.partner.ResetPasswordResponse_element __response = new com.sforce.soap.partner.ResetPasswordResponse_element();

  
    __request.setUserId(userId);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__EmailHeader != null) __connection.addHeader(EmailHeader_qname, __EmailHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.ResetPasswordResponse_element) __connection.send("",
       resetPassword_qname, __request, resetPasswordResponse_qname,
       com.sforce.soap.partner.ResetPasswordResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.MergeResult[] merge(com.sforce.soap.partner.MergeRequest[] request)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Merge_element __request = new com.sforce.soap.partner.Merge_element();
    com.sforce.soap.partner.MergeResponse_element __response = new com.sforce.soap.partner.MergeResponse_element();

  
    __request.setRequest(request);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AssignmentRuleHeader != null) __connection.addHeader(AssignmentRuleHeader_qname, __AssignmentRuleHeader);
    
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__EmailHeader != null) __connection.addHeader(EmailHeader_qname, __EmailHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.MergeResponse_element) __connection.send("",
       merge_qname, __request, mergeResponse_qname,
       com.sforce.soap.partner.MergeResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.QueryResult query(java.lang.String queryString)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Query_element __request = new com.sforce.soap.partner.Query_element();
    com.sforce.soap.partner.QueryResponse_element __response = new com.sforce.soap.partner.QueryResponse_element();

  
    __request.setQueryString(queryString);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.QueryResponse_element) __connection.send("",
       query_qname, __request, queryResponse_qname,
       com.sforce.soap.partner.QueryResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.SaveResult[] update(com.sforce.soap.partner.sobject.SObject[] sObjects)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Update_element __request = new com.sforce.soap.partner.Update_element();
    com.sforce.soap.partner.UpdateResponse_element __response = new com.sforce.soap.partner.UpdateResponse_element();

  
    __request.setSObjects(sObjects);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AssignmentRuleHeader != null) __connection.addHeader(AssignmentRuleHeader_qname, __AssignmentRuleHeader);
    
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    
    if (__EmailHeader != null) __connection.addHeader(EmailHeader_qname, __EmailHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.UpdateResponse_element) __connection.send("",
       update_qname, __request, updateResponse_qname,
       com.sforce.soap.partner.UpdateResponse_element.class);

    return __response.getResult();
  }
  
  public com.sforce.soap.partner.UndeleteResult[] undelete(java.lang.String[] ids)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.Undelete_element __request = new com.sforce.soap.partner.Undelete_element();
    com.sforce.soap.partner.UndeleteResponse_element __response = new com.sforce.soap.partner.UndeleteResponse_element();

  
    __request.setIds(ids);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    
    if (__DisableFeedTrackingHeader != null) __connection.addHeader(DisableFeedTrackingHeader_qname, __DisableFeedTrackingHeader);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__PackageVersionHeader != null) __connection.addHeader(PackageVersionHeader_qname, __PackageVersionHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.UndeleteResponse_element) __connection.send("",
       undelete_qname, __request, undeleteResponse_qname,
       com.sforce.soap.partner.UndeleteResponse_element.class);

    return __response.getResult();
  }
  


  private void addHeaders(com.sforce.ws.transport.SoapConnection __connection) {
    for(java.util.Map.Entry<QName, XMLizable> entry : __extraHeaders.entrySet()) {
      __connection.addHeader(entry.getKey(), entry.getValue());
    }
  }

  public void addExtraHeader(QName __headerName, XMLizable __value) {
    __extraHeaders.put(__headerName, __value);
  }

	public void removeExtraHeader(QName __headerName) {
		__extraHeaders.remove(__headerName);
	}

	public XMLizable getExtraHeader(QName __headerName) {
		return __extraHeaders.get(__headerName);
	}
	
	public void clearExtraHeaders() {
		__extraHeaders = new HashMap<QName, XMLizable>();
	}    private static final com.mavens.xml.namespace.QName convertLead_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead");
    private static final com.mavens.xml.namespace.QName convertLeadResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLeadResponse");
    private static final com.mavens.xml.namespace.QName describeDataCategoryGroupStructures_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeDataCategoryGroupStructures");
    private static final com.mavens.xml.namespace.QName describeDataCategoryGroupStructuresResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeDataCategoryGroupStructuresResponse");
    private static final com.mavens.xml.namespace.QName sendEmail_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail");
    private static final com.mavens.xml.namespace.QName sendEmailResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmailResponse");
    private static final com.mavens.xml.namespace.QName describeGlobal_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal");
    private static final com.mavens.xml.namespace.QName describeGlobalResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobalResponse");
    private static final com.mavens.xml.namespace.QName retrieve_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve");
    private static final com.mavens.xml.namespace.QName retrieveResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieveResponse");
    private static final com.mavens.xml.namespace.QName describeLayout_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout");
    private static final com.mavens.xml.namespace.QName describeLayoutResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayoutResponse");
    private static final com.mavens.xml.namespace.QName emptyRecycleBin_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin");
    private static final com.mavens.xml.namespace.QName emptyRecycleBinResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBinResponse");
    private static final com.mavens.xml.namespace.QName process_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "process");
    private static final com.mavens.xml.namespace.QName processResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "processResponse");
    private static final com.mavens.xml.namespace.QName logout_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "logout");
    private static final com.mavens.xml.namespace.QName logoutResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "logoutResponse");
    private static final com.mavens.xml.namespace.QName create_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "create");
    private static final com.mavens.xml.namespace.QName createResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "createResponse");
    private static final com.mavens.xml.namespace.QName invalidateSessions_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions");
    private static final com.mavens.xml.namespace.QName invalidateSessionsResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessionsResponse");
    private static final com.mavens.xml.namespace.QName getUserInfo_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo");
    private static final com.mavens.xml.namespace.QName getUserInfoResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfoResponse");
    private static final com.mavens.xml.namespace.QName getServerTimestamp_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp");
    private static final com.mavens.xml.namespace.QName getServerTimestampResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestampResponse");
    private static final com.mavens.xml.namespace.QName getDeleted_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted");
    private static final com.mavens.xml.namespace.QName getDeletedResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeletedResponse");
    private static final com.mavens.xml.namespace.QName setPassword_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword");
    private static final com.mavens.xml.namespace.QName setPasswordResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "setPasswordResponse");
    private static final com.mavens.xml.namespace.QName delete_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "delete");
    private static final com.mavens.xml.namespace.QName deleteResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "deleteResponse");
    private static final com.mavens.xml.namespace.QName describeTabs_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs");
    private static final com.mavens.xml.namespace.QName describeTabsResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabsResponse");
    private static final com.mavens.xml.namespace.QName login_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "login");
    private static final com.mavens.xml.namespace.QName loginResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "loginResponse");
    private static final com.mavens.xml.namespace.QName search_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "search");
    private static final com.mavens.xml.namespace.QName searchResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "searchResponse");
    private static final com.mavens.xml.namespace.QName queryMore_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore");
    private static final com.mavens.xml.namespace.QName queryMoreResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMoreResponse");
    private static final com.mavens.xml.namespace.QName describeDataCategoryGroups_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeDataCategoryGroups");
    private static final com.mavens.xml.namespace.QName describeDataCategoryGroupsResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeDataCategoryGroupsResponse");
    private static final com.mavens.xml.namespace.QName describeSoftphoneLayout_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout");
    private static final com.mavens.xml.namespace.QName describeSoftphoneLayoutResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayoutResponse");
    private static final com.mavens.xml.namespace.QName describeSObject_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject");
    private static final com.mavens.xml.namespace.QName describeSObjectResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjectResponse");
    private static final com.mavens.xml.namespace.QName describeSObjects_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects");
    private static final com.mavens.xml.namespace.QName describeSObjectsResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjectsResponse");
    private static final com.mavens.xml.namespace.QName getUpdated_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated");
    private static final com.mavens.xml.namespace.QName getUpdatedResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdatedResponse");
    private static final com.mavens.xml.namespace.QName upsert_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert");
    private static final com.mavens.xml.namespace.QName upsertResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "upsertResponse");
    private static final com.mavens.xml.namespace.QName queryAll_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll");
    private static final com.mavens.xml.namespace.QName queryAllResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAllResponse");
    private static final com.mavens.xml.namespace.QName resetPassword_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword");
    private static final com.mavens.xml.namespace.QName resetPasswordResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPasswordResponse");
    private static final com.mavens.xml.namespace.QName merge_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "merge");
    private static final com.mavens.xml.namespace.QName mergeResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "mergeResponse");
    private static final com.mavens.xml.namespace.QName query_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "query");
    private static final com.mavens.xml.namespace.QName queryResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "queryResponse");
    private static final com.mavens.xml.namespace.QName update_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "update");
    private static final com.mavens.xml.namespace.QName updateResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "updateResponse");
    private static final com.mavens.xml.namespace.QName undelete_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete");
    private static final com.mavens.xml.namespace.QName undeleteResponse_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "undeleteResponse");
    private static final com.mavens.xml.namespace.QName MruHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "MruHeader");
    private static final com.mavens.xml.namespace.QName CallOptions_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "CallOptions");
    private static final com.mavens.xml.namespace.QName PackageVersionHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "PackageVersionHeader");
    private static final com.mavens.xml.namespace.QName LocaleOptions_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "LocaleOptions");
    private static final com.mavens.xml.namespace.QName EmailHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "EmailHeader");
    private static final com.mavens.xml.namespace.QName DebuggingInfo_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "DebuggingInfo");
    private static final com.mavens.xml.namespace.QName SessionHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "SessionHeader");
    private static final com.mavens.xml.namespace.QName DebuggingHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "DebuggingHeader");
    private static final com.mavens.xml.namespace.QName DisableFeedTrackingHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "DisableFeedTrackingHeader");
    private static final com.mavens.xml.namespace.QName LoginScopeHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "LoginScopeHeader");
    private static final com.mavens.xml.namespace.QName AllowFieldTruncationHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "AllowFieldTruncationHeader");
    private static final com.mavens.xml.namespace.QName UserTerritoryDeleteHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "UserTerritoryDeleteHeader");
    private static final com.mavens.xml.namespace.QName QueryOptions_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "QueryOptions");
    private static final com.mavens.xml.namespace.QName AssignmentRuleHeader_qname = new com.mavens.xml.namespace.QName("urn:partner.soap.sforce.com", "AssignmentRuleHeader");


  private static HashMap<QName, java.lang.Class> knownHeaders = new HashMap<QName, java.lang.Class>();

  static {  knownHeaders.put(MruHeader_qname,com.sforce.soap.partner.MruHeader_element.class);
  knownHeaders.put(CallOptions_qname,com.sforce.soap.partner.CallOptions_element.class);
  knownHeaders.put(PackageVersionHeader_qname,com.sforce.soap.partner.PackageVersionHeader_element.class);
  knownHeaders.put(LocaleOptions_qname,com.sforce.soap.partner.LocaleOptions_element.class);
  knownHeaders.put(EmailHeader_qname,com.sforce.soap.partner.EmailHeader_element.class);
  knownHeaders.put(DebuggingInfo_qname,com.sforce.soap.partner.DebuggingInfo_element.class);
  knownHeaders.put(SessionHeader_qname,com.sforce.soap.partner.SessionHeader_element.class);
  knownHeaders.put(DebuggingHeader_qname,com.sforce.soap.partner.DebuggingHeader_element.class);
  knownHeaders.put(DisableFeedTrackingHeader_qname,com.sforce.soap.partner.DisableFeedTrackingHeader_element.class);
  knownHeaders.put(LoginScopeHeader_qname,com.sforce.soap.partner.LoginScopeHeader_element.class);
  knownHeaders.put(AllowFieldTruncationHeader_qname,com.sforce.soap.partner.AllowFieldTruncationHeader_element.class);
  knownHeaders.put(UserTerritoryDeleteHeader_qname,com.sforce.soap.partner.UserTerritoryDeleteHeader_element.class);
  knownHeaders.put(QueryOptions_qname,com.sforce.soap.partner.QueryOptions_element.class);
  knownHeaders.put(AssignmentRuleHeader_qname,com.sforce.soap.partner.AssignmentRuleHeader_element.class);

  }
}