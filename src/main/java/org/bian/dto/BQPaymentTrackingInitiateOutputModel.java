package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTrackingInitiateOutputModel
 */
public class BQPaymentTrackingInitiateOutputModel   {
  private String paymentTrackingInstanceReference = null;

  private String paymentTrackingInitiateActionReference = null;

  private Object paymentTrackingInitiateActionRecord = null;

  private String paymentTrackingInstanceStatus = null;

  private String paymentTrackingPreconditions = null;

  private String paymentTrackingFeatureSchedule = null;

  private String directDebitPaymentTracking = null;

  private String paymentTrackingPostconditions = null;

  private String paymentTrackingDirectDebitPaymentTrackingServiceType = null;

  private String paymentTrackingDirectDebitPaymentTrackingServiceDescription = null;

  private String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs = null;

  private String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct = null;

  private String paymentTrackingDirectDebitPaymentTrackingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Tracking instance 
   * @return paymentTrackingInstanceReference
  **/

  public String getPaymentTrackingInstanceReference() {
    return paymentTrackingInstanceReference;
  }

  public void setPaymentTrackingInstanceReference(String paymentTrackingInstanceReference) {
    this.paymentTrackingInstanceReference = paymentTrackingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentTrackingInitiateActionReference
  **/

  public String getPaymentTrackingInitiateActionReference() {
    return paymentTrackingInitiateActionReference;
  }

  public void setPaymentTrackingInitiateActionReference(String paymentTrackingInitiateActionReference) {
    this.paymentTrackingInitiateActionReference = paymentTrackingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentTrackingInitiateActionRecord
  **/

  public Object getPaymentTrackingInitiateActionRecord() {
    return paymentTrackingInitiateActionRecord;
  }

  public void setPaymentTrackingInitiateActionRecord(Object paymentTrackingInitiateActionRecord) {
    this.paymentTrackingInitiateActionRecord = paymentTrackingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment Tracking instance (e.g. initialised, pending, active) 
   * @return paymentTrackingInstanceStatus
  **/

  public String getPaymentTrackingInstanceStatus() {
    return paymentTrackingInstanceStatus;
  }

  public void setPaymentTrackingInstanceStatus(String paymentTrackingInstanceStatus) {
    this.paymentTrackingInstanceStatus = paymentTrackingInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return paymentTrackingPreconditions
  **/

  public String getPaymentTrackingPreconditions() {
    return paymentTrackingPreconditions;
  }

  public void setPaymentTrackingPreconditions(String paymentTrackingPreconditions) {
    this.paymentTrackingPreconditions = paymentTrackingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return paymentTrackingFeatureSchedule
  **/

  public String getPaymentTrackingFeatureSchedule() {
    return paymentTrackingFeatureSchedule;
  }

  public void setPaymentTrackingFeatureSchedule(String paymentTrackingFeatureSchedule) {
    this.paymentTrackingFeatureSchedule = paymentTrackingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Direct Debit Arrangement specific Business Service 
   * @return directDebitPaymentTracking
  **/

  public String getDirectDebitPaymentTracking() {
    return directDebitPaymentTracking;
  }

  public void setDirectDebitPaymentTracking(String directDebitPaymentTracking) {
    this.directDebitPaymentTracking = directDebitPaymentTracking;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return paymentTrackingPostconditions
  **/

  public String getPaymentTrackingPostconditions() {
    return paymentTrackingPostconditions;
  }

  public void setPaymentTrackingPostconditions(String paymentTrackingPostconditions) {
    this.paymentTrackingPostconditions = paymentTrackingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return paymentTrackingDirectDebitPaymentTrackingServiceType
  **/

  public String getPaymentTrackingDirectDebitPaymentTrackingServiceType() {
    return paymentTrackingDirectDebitPaymentTrackingServiceType;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceType(String paymentTrackingDirectDebitPaymentTrackingServiceType) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceType = paymentTrackingDirectDebitPaymentTrackingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return paymentTrackingDirectDebitPaymentTrackingServiceDescription
  **/

  public String getPaymentTrackingDirectDebitPaymentTrackingServiceDescription() {
    return paymentTrackingDirectDebitPaymentTrackingServiceDescription;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceDescription(String paymentTrackingDirectDebitPaymentTrackingServiceDescription) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceDescription = paymentTrackingDirectDebitPaymentTrackingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs
  **/

  public String getPaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs() {
    return paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs(String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs = paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct
  **/

  public String getPaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct() {
    return paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct(String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct = paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return paymentTrackingDirectDebitPaymentTrackingServiceName
  **/

  public String getPaymentTrackingDirectDebitPaymentTrackingServiceName() {
    return paymentTrackingDirectDebitPaymentTrackingServiceName;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceName(String paymentTrackingDirectDebitPaymentTrackingServiceName) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceName = paymentTrackingDirectDebitPaymentTrackingServiceName;
  }


}

