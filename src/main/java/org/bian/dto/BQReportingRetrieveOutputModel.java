package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingRetrieveOutputModelReportingInstanceAnalysis;
import org.bian.dto.BQReportingRetrieveOutputModelReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveOutputModel
 */
public class BQReportingRetrieveOutputModel   {
  private String reportingPreconditions = null;

  private String reportingFeatureSchedule = null;

  private String businessService = null;

  private String reportingPostconditions = null;

  private String reportingServiceType = null;

  private String reportingServiceDescription = null;

  private String reportingServiceInputsandOuputs = null;

  private String reportingServiceWorkProduct = null;

  private String reportingServiceName = null;

  private String reportingRetrieveActionTaskReference = null;

  private Object reportingRetrieveActionTaskRecord = null;

  private String reportingRetrieveActionResponse = null;

  private BQReportingRetrieveOutputModelReportingInstanceReport reportingInstanceReport = null;

  private BQReportingRetrieveOutputModelReportingInstanceAnalysis reportingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return reportingPreconditions
  **/

  public String getReportingPreconditions() {
    return reportingPreconditions;
  }

  public void setReportingPreconditions(String reportingPreconditions) {
    this.reportingPreconditions = reportingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return reportingFeatureSchedule
  **/

  public String getReportingFeatureSchedule() {
    return reportingFeatureSchedule;
  }

  public void setReportingFeatureSchedule(String reportingFeatureSchedule) {
    this.reportingFeatureSchedule = reportingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Direct Debit Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return reportingPostconditions
  **/

  public String getReportingPostconditions() {
    return reportingPostconditions;
  }

  public void setReportingPostconditions(String reportingPostconditions) {
    this.reportingPostconditions = reportingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return reportingServiceType
  **/

  public String getReportingServiceType() {
    return reportingServiceType;
  }

  public void setReportingServiceType(String reportingServiceType) {
    this.reportingServiceType = reportingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return reportingServiceDescription
  **/

  public String getReportingServiceDescription() {
    return reportingServiceDescription;
  }

  public void setReportingServiceDescription(String reportingServiceDescription) {
    this.reportingServiceDescription = reportingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return reportingServiceInputsandOuputs
  **/

  public String getReportingServiceInputsandOuputs() {
    return reportingServiceInputsandOuputs;
  }

  public void setReportingServiceInputsandOuputs(String reportingServiceInputsandOuputs) {
    this.reportingServiceInputsandOuputs = reportingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return reportingServiceWorkProduct
  **/

  public String getReportingServiceWorkProduct() {
    return reportingServiceWorkProduct;
  }

  public void setReportingServiceWorkProduct(String reportingServiceWorkProduct) {
    this.reportingServiceWorkProduct = reportingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return reportingServiceName
  **/

  public String getReportingServiceName() {
    return reportingServiceName;
  }

  public void setReportingServiceName(String reportingServiceName) {
    this.reportingServiceName = reportingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reporting instance retrieve service call 
   * @return reportingRetrieveActionTaskReference
  **/

  public String getReportingRetrieveActionTaskReference() {
    return reportingRetrieveActionTaskReference;
  }

  public void setReportingRetrieveActionTaskReference(String reportingRetrieveActionTaskReference) {
    this.reportingRetrieveActionTaskReference = reportingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reportingRetrieveActionTaskRecord
  **/

  public Object getReportingRetrieveActionTaskRecord() {
    return reportingRetrieveActionTaskRecord;
  }

  public void setReportingRetrieveActionTaskRecord(Object reportingRetrieveActionTaskRecord) {
    this.reportingRetrieveActionTaskRecord = reportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return reportingRetrieveActionResponse
  **/

  public String getReportingRetrieveActionResponse() {
    return reportingRetrieveActionResponse;
  }

  public void setReportingRetrieveActionResponse(String reportingRetrieveActionResponse) {
    this.reportingRetrieveActionResponse = reportingRetrieveActionResponse;
  }


  /**
   * Get reportingInstanceReport
   * @return reportingInstanceReport
  **/

  public BQReportingRetrieveOutputModelReportingInstanceReport getReportingInstanceReport() {
    return reportingInstanceReport;
  }

  public void setReportingInstanceReport(BQReportingRetrieveOutputModelReportingInstanceReport reportingInstanceReport) {
    this.reportingInstanceReport = reportingInstanceReport;
  }


  /**
   * Get reportingInstanceAnalysis
   * @return reportingInstanceAnalysis
  **/

  public BQReportingRetrieveOutputModelReportingInstanceAnalysis getReportingInstanceAnalysis() {
    return reportingInstanceAnalysis;
  }

  public void setReportingInstanceAnalysis(BQReportingRetrieveOutputModelReportingInstanceAnalysis reportingInstanceAnalysis) {
    this.reportingInstanceAnalysis = reportingInstanceAnalysis;
  }


}

