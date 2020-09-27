package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceAnalysis;
import org.bian.dto.BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceReport;

import javax.validation.Valid;
  
/**
 * BQVerifyMandateRetrieveOutputModel
 */
public class BQVerifyMandateRetrieveOutputModel   {
  private String verifyMandatePreconditions = null;

  private String verifyMandateFeatureSchedule = null;

  private String directDebitMandateCheck = null;

  private String verifyMandatePostconditions = null;

  private String verifyMandateDirectDebitMandateCheckServiceType = null;

  private String verifyMandateDirectDebitMandateCheckServiceDescription = null;

  private String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs = null;

  private String verifyMandateDirectDebitMandateCheckServiceWorkProduct = null;

  private String verifyMandateDirectDebitMandateCheckServiceName = null;

  private String verifyMandateRetrieveActionTaskReference = null;

  private Object verifyMandateRetrieveActionTaskRecord = null;

  private String verifyMandateRetrieveActionResponse = null;

  private BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceReport verifyMandateInstanceReport = null;

  private BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceAnalysis verifyMandateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return verifyMandatePreconditions
  **/

  public String getVerifyMandatePreconditions() {
    return verifyMandatePreconditions;
  }

  public void setVerifyMandatePreconditions(String verifyMandatePreconditions) {
    this.verifyMandatePreconditions = verifyMandatePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return verifyMandateFeatureSchedule
  **/

  public String getVerifyMandateFeatureSchedule() {
    return verifyMandateFeatureSchedule;
  }

  public void setVerifyMandateFeatureSchedule(String verifyMandateFeatureSchedule) {
    this.verifyMandateFeatureSchedule = verifyMandateFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Direct Debit Arrangement specific Business Service 
   * @return directDebitMandateCheck
  **/

  public String getDirectDebitMandateCheck() {
    return directDebitMandateCheck;
  }

  public void setDirectDebitMandateCheck(String directDebitMandateCheck) {
    this.directDebitMandateCheck = directDebitMandateCheck;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return verifyMandatePostconditions
  **/

  public String getVerifyMandatePostconditions() {
    return verifyMandatePostconditions;
  }

  public void setVerifyMandatePostconditions(String verifyMandatePostconditions) {
    this.verifyMandatePostconditions = verifyMandatePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return verifyMandateDirectDebitMandateCheckServiceType
  **/

  public String getVerifyMandateDirectDebitMandateCheckServiceType() {
    return verifyMandateDirectDebitMandateCheckServiceType;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceType(String verifyMandateDirectDebitMandateCheckServiceType) {
    this.verifyMandateDirectDebitMandateCheckServiceType = verifyMandateDirectDebitMandateCheckServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return verifyMandateDirectDebitMandateCheckServiceDescription
  **/

  public String getVerifyMandateDirectDebitMandateCheckServiceDescription() {
    return verifyMandateDirectDebitMandateCheckServiceDescription;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceDescription(String verifyMandateDirectDebitMandateCheckServiceDescription) {
    this.verifyMandateDirectDebitMandateCheckServiceDescription = verifyMandateDirectDebitMandateCheckServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return verifyMandateDirectDebitMandateCheckServiceInputsandOuputs
  **/

  public String getVerifyMandateDirectDebitMandateCheckServiceInputsandOuputs() {
    return verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceInputsandOuputs(String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs) {
    this.verifyMandateDirectDebitMandateCheckServiceInputsandOuputs = verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return verifyMandateDirectDebitMandateCheckServiceWorkProduct
  **/

  public String getVerifyMandateDirectDebitMandateCheckServiceWorkProduct() {
    return verifyMandateDirectDebitMandateCheckServiceWorkProduct;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceWorkProduct(String verifyMandateDirectDebitMandateCheckServiceWorkProduct) {
    this.verifyMandateDirectDebitMandateCheckServiceWorkProduct = verifyMandateDirectDebitMandateCheckServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return verifyMandateDirectDebitMandateCheckServiceName
  **/

  public String getVerifyMandateDirectDebitMandateCheckServiceName() {
    return verifyMandateDirectDebitMandateCheckServiceName;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceName(String verifyMandateDirectDebitMandateCheckServiceName) {
    this.verifyMandateDirectDebitMandateCheckServiceName = verifyMandateDirectDebitMandateCheckServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Verify Mandate instance retrieve service call 
   * @return verifyMandateRetrieveActionTaskReference
  **/

  public String getVerifyMandateRetrieveActionTaskReference() {
    return verifyMandateRetrieveActionTaskReference;
  }

  public void setVerifyMandateRetrieveActionTaskReference(String verifyMandateRetrieveActionTaskReference) {
    this.verifyMandateRetrieveActionTaskReference = verifyMandateRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return verifyMandateRetrieveActionTaskRecord
  **/

  public Object getVerifyMandateRetrieveActionTaskRecord() {
    return verifyMandateRetrieveActionTaskRecord;
  }

  public void setVerifyMandateRetrieveActionTaskRecord(Object verifyMandateRetrieveActionTaskRecord) {
    this.verifyMandateRetrieveActionTaskRecord = verifyMandateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return verifyMandateRetrieveActionResponse
  **/

  public String getVerifyMandateRetrieveActionResponse() {
    return verifyMandateRetrieveActionResponse;
  }

  public void setVerifyMandateRetrieveActionResponse(String verifyMandateRetrieveActionResponse) {
    this.verifyMandateRetrieveActionResponse = verifyMandateRetrieveActionResponse;
  }


  /**
   * Get verifyMandateInstanceReport
   * @return verifyMandateInstanceReport
  **/

  public BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceReport getVerifyMandateInstanceReport() {
    return verifyMandateInstanceReport;
  }

  public void setVerifyMandateInstanceReport(BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceReport verifyMandateInstanceReport) {
    this.verifyMandateInstanceReport = verifyMandateInstanceReport;
  }


  /**
   * Get verifyMandateInstanceAnalysis
   * @return verifyMandateInstanceAnalysis
  **/

  public BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceAnalysis getVerifyMandateInstanceAnalysis() {
    return verifyMandateInstanceAnalysis;
  }

  public void setVerifyMandateInstanceAnalysis(BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceAnalysis verifyMandateInstanceAnalysis) {
    this.verifyMandateInstanceAnalysis = verifyMandateInstanceAnalysis;
  }


}

