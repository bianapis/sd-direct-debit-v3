package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingInitiateInputModel
 */
public class BQReportingInitiateInputModel   {
  private String directDebitArrangementInstanceReference = null;

  private Object reportingInitiateActionRecord = null;

  private String reportingPreconditions = null;

  private String reportingFeatureSchedule = null;

  private String businessService = null;

  private String reportingPostconditions = null;

  private String reportingServiceType = null;

  private String reportingServiceDescription = null;

  private String reportingServiceInputsandOuputs = null;

  private String reportingServiceWorkProduct = null;

  private String reportingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Direct Debit Arrangement instance 
   * @return directDebitArrangementInstanceReference
  **/

  public String getDirectDebitArrangementInstanceReference() {
    return directDebitArrangementInstanceReference;
  }

  public void setDirectDebitArrangementInstanceReference(String directDebitArrangementInstanceReference) {
    this.directDebitArrangementInstanceReference = directDebitArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return reportingInitiateActionRecord
  **/

  public Object getReportingInitiateActionRecord() {
    return reportingInitiateActionRecord;
  }

  public void setReportingInitiateActionRecord(Object reportingInitiateActionRecord) {
    this.reportingInitiateActionRecord = reportingInitiateActionRecord;
  }


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


}

