package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitArrangementExchangeInputModelDirectDebitArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiationExchangeInputModel
 */
public class BQPaymentInitiationExchangeInputModel   {
  private String directDebitArrangementInstanceReference = null;

  private String paymentInitiationInstanceReference = null;

  private String paymentInitiationPreconditions = null;

  private String paymentInitiationFeatureSchedule = null;

  private String directDebitPaymentInitiation = null;

  private String paymentInitiationPostconditions = null;

  private String paymentInitiationDirectDebitPaymentInitiationServiceType = null;

  private String paymentInitiationDirectDebitPaymentInitiationServiceDescription = null;

  private String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs = null;

  private String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct = null;

  private String paymentInitiationDirectDebitPaymentInitiationServiceName = null;

  private Object paymentInitiationExchangeActionTaskRecord = null;

  private CRDirectDebitArrangementExchangeInputModelDirectDebitArrangementExchangeActionRequest paymentInitiationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Initiation instance 
   * @return paymentInitiationInstanceReference
  **/

  public String getPaymentInitiationInstanceReference() {
    return paymentInitiationInstanceReference;
  }

  public void setPaymentInitiationInstanceReference(String paymentInitiationInstanceReference) {
    this.paymentInitiationInstanceReference = paymentInitiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return paymentInitiationPreconditions
  **/

  public String getPaymentInitiationPreconditions() {
    return paymentInitiationPreconditions;
  }

  public void setPaymentInitiationPreconditions(String paymentInitiationPreconditions) {
    this.paymentInitiationPreconditions = paymentInitiationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return paymentInitiationFeatureSchedule
  **/

  public String getPaymentInitiationFeatureSchedule() {
    return paymentInitiationFeatureSchedule;
  }

  public void setPaymentInitiationFeatureSchedule(String paymentInitiationFeatureSchedule) {
    this.paymentInitiationFeatureSchedule = paymentInitiationFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Direct Debit Arrangement specific Business Service 
   * @return directDebitPaymentInitiation
  **/

  public String getDirectDebitPaymentInitiation() {
    return directDebitPaymentInitiation;
  }

  public void setDirectDebitPaymentInitiation(String directDebitPaymentInitiation) {
    this.directDebitPaymentInitiation = directDebitPaymentInitiation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return paymentInitiationPostconditions
  **/

  public String getPaymentInitiationPostconditions() {
    return paymentInitiationPostconditions;
  }

  public void setPaymentInitiationPostconditions(String paymentInitiationPostconditions) {
    this.paymentInitiationPostconditions = paymentInitiationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return paymentInitiationDirectDebitPaymentInitiationServiceType
  **/

  public String getPaymentInitiationDirectDebitPaymentInitiationServiceType() {
    return paymentInitiationDirectDebitPaymentInitiationServiceType;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceType(String paymentInitiationDirectDebitPaymentInitiationServiceType) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceType = paymentInitiationDirectDebitPaymentInitiationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return paymentInitiationDirectDebitPaymentInitiationServiceDescription
  **/

  public String getPaymentInitiationDirectDebitPaymentInitiationServiceDescription() {
    return paymentInitiationDirectDebitPaymentInitiationServiceDescription;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceDescription(String paymentInitiationDirectDebitPaymentInitiationServiceDescription) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceDescription = paymentInitiationDirectDebitPaymentInitiationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs
  **/

  public String getPaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs() {
    return paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs(String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs = paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct
  **/

  public String getPaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct() {
    return paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct(String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct = paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return paymentInitiationDirectDebitPaymentInitiationServiceName
  **/

  public String getPaymentInitiationDirectDebitPaymentInitiationServiceName() {
    return paymentInitiationDirectDebitPaymentInitiationServiceName;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceName(String paymentInitiationDirectDebitPaymentInitiationServiceName) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceName = paymentInitiationDirectDebitPaymentInitiationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentInitiationExchangeActionTaskRecord
  **/

  public Object getPaymentInitiationExchangeActionTaskRecord() {
    return paymentInitiationExchangeActionTaskRecord;
  }

  public void setPaymentInitiationExchangeActionTaskRecord(Object paymentInitiationExchangeActionTaskRecord) {
    this.paymentInitiationExchangeActionTaskRecord = paymentInitiationExchangeActionTaskRecord;
  }


  /**
   * Get paymentInitiationExchangeActionRequest
   * @return paymentInitiationExchangeActionRequest
  **/

  public CRDirectDebitArrangementExchangeInputModelDirectDebitArrangementExchangeActionRequest getPaymentInitiationExchangeActionRequest() {
    return paymentInitiationExchangeActionRequest;
  }

  public void setPaymentInitiationExchangeActionRequest(CRDirectDebitArrangementExchangeInputModelDirectDebitArrangementExchangeActionRequest paymentInitiationExchangeActionRequest) {
    this.paymentInitiationExchangeActionRequest = paymentInitiationExchangeActionRequest;
  }


}

