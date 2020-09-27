package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQVerifyMandateExchangeOutputModel
 */
public class BQVerifyMandateExchangeOutputModel   {
  private String verifyMandatePreconditions = null;

  private String verifyMandateFeatureSchedule = null;

  private String directDebitMandateCheck = null;

  private String verifyMandatePostconditions = null;

  private String verifyMandateDirectDebitMandateCheckServiceType = null;

  private String verifyMandateDirectDebitMandateCheckServiceDescription = null;

  private String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs = null;

  private String verifyMandateDirectDebitMandateCheckServiceWorkProduct = null;

  private String verifyMandateDirectDebitMandateCheckServiceName = null;

  private String verifyMandateExchangeActionTaskReference = null;

  private Object verifyMandateExchangeActionTaskRecord = null;

  private String verifyMandateExchangeActionResponse = null;

  private String verifyMandateInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Verify Mandate instance exchange service call 
   * @return verifyMandateExchangeActionTaskReference
  **/

  public String getVerifyMandateExchangeActionTaskReference() {
    return verifyMandateExchangeActionTaskReference;
  }

  public void setVerifyMandateExchangeActionTaskReference(String verifyMandateExchangeActionTaskReference) {
    this.verifyMandateExchangeActionTaskReference = verifyMandateExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return verifyMandateExchangeActionTaskRecord
  **/

  public Object getVerifyMandateExchangeActionTaskRecord() {
    return verifyMandateExchangeActionTaskRecord;
  }

  public void setVerifyMandateExchangeActionTaskRecord(Object verifyMandateExchangeActionTaskRecord) {
    this.verifyMandateExchangeActionTaskRecord = verifyMandateExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return verifyMandateExchangeActionResponse
  **/

  public String getVerifyMandateExchangeActionResponse() {
    return verifyMandateExchangeActionResponse;
  }

  public void setVerifyMandateExchangeActionResponse(String verifyMandateExchangeActionResponse) {
    this.verifyMandateExchangeActionResponse = verifyMandateExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Verify Mandate instance (e.g. accepted, rejected, verified) 
   * @return verifyMandateInstanceStatus
  **/

  public String getVerifyMandateInstanceStatus() {
    return verifyMandateInstanceStatus;
  }

  public void setVerifyMandateInstanceStatus(String verifyMandateInstanceStatus) {
    this.verifyMandateInstanceStatus = verifyMandateInstanceStatus;
  }


}

