package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckExchangeOutputModel
 */
public class BQFundsAvailableCheckExchangeOutputModel   {
  private String fundsAvailableCheckPreconditions = null;

  private String fundsAvailableCheckFeatureSchedule = null;

  private String fundsAvailableCheckPostconditions = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceType = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceDescription = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct = null;

  private String fundsAvailableCheckExchangeActionTaskReference = null;

  private Object fundsAvailableCheckExchangeActionTaskRecord = null;

  private String fundsAvailableCheckExchangeActionResponse = null;

  private String fundsAvailableCheckInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return fundsAvailableCheckPreconditions
  **/

  public String getFundsAvailableCheckPreconditions() {
    return fundsAvailableCheckPreconditions;
  }

  public void setFundsAvailableCheckPreconditions(String fundsAvailableCheckPreconditions) {
    this.fundsAvailableCheckPreconditions = fundsAvailableCheckPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return fundsAvailableCheckFeatureSchedule
  **/

  public String getFundsAvailableCheckFeatureSchedule() {
    return fundsAvailableCheckFeatureSchedule;
  }

  public void setFundsAvailableCheckFeatureSchedule(String fundsAvailableCheckFeatureSchedule) {
    this.fundsAvailableCheckFeatureSchedule = fundsAvailableCheckFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return fundsAvailableCheckPostconditions
  **/

  public String getFundsAvailableCheckPostconditions() {
    return fundsAvailableCheckPostconditions;
  }

  public void setFundsAvailableCheckPostconditions(String fundsAvailableCheckPostconditions) {
    this.fundsAvailableCheckPostconditions = fundsAvailableCheckPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return fundsAvailableCheckFundsAvailableCheckServiceType
  **/

  public String getFundsAvailableCheckFundsAvailableCheckServiceType() {
    return fundsAvailableCheckFundsAvailableCheckServiceType;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceType(String fundsAvailableCheckFundsAvailableCheckServiceType) {
    this.fundsAvailableCheckFundsAvailableCheckServiceType = fundsAvailableCheckFundsAvailableCheckServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return fundsAvailableCheckFundsAvailableCheckServiceDescription
  **/

  public String getFundsAvailableCheckFundsAvailableCheckServiceDescription() {
    return fundsAvailableCheckFundsAvailableCheckServiceDescription;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceDescription(String fundsAvailableCheckFundsAvailableCheckServiceDescription) {
    this.fundsAvailableCheckFundsAvailableCheckServiceDescription = fundsAvailableCheckFundsAvailableCheckServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs
  **/

  public String getFundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs() {
    return fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs(String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) {
    this.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs = fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return fundsAvailableCheckFundsAvailableCheckServiceWorkProduct
  **/

  public String getFundsAvailableCheckFundsAvailableCheckServiceWorkProduct() {
    return fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceWorkProduct(String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) {
    this.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct = fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Funds Available Check instance exchange service call 
   * @return fundsAvailableCheckExchangeActionTaskReference
  **/

  public String getFundsAvailableCheckExchangeActionTaskReference() {
    return fundsAvailableCheckExchangeActionTaskReference;
  }

  public void setFundsAvailableCheckExchangeActionTaskReference(String fundsAvailableCheckExchangeActionTaskReference) {
    this.fundsAvailableCheckExchangeActionTaskReference = fundsAvailableCheckExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fundsAvailableCheckExchangeActionTaskRecord
  **/

  public Object getFundsAvailableCheckExchangeActionTaskRecord() {
    return fundsAvailableCheckExchangeActionTaskRecord;
  }

  public void setFundsAvailableCheckExchangeActionTaskRecord(Object fundsAvailableCheckExchangeActionTaskRecord) {
    this.fundsAvailableCheckExchangeActionTaskRecord = fundsAvailableCheckExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return fundsAvailableCheckExchangeActionResponse
  **/

  public String getFundsAvailableCheckExchangeActionResponse() {
    return fundsAvailableCheckExchangeActionResponse;
  }

  public void setFundsAvailableCheckExchangeActionResponse(String fundsAvailableCheckExchangeActionResponse) {
    this.fundsAvailableCheckExchangeActionResponse = fundsAvailableCheckExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Funds Available Check instance (e.g. accepted, rejected, verified) 
   * @return fundsAvailableCheckInstanceStatus
  **/

  public String getFundsAvailableCheckInstanceStatus() {
    return fundsAvailableCheckInstanceStatus;
  }

  public void setFundsAvailableCheckInstanceStatus(String fundsAvailableCheckInstanceStatus) {
    this.fundsAvailableCheckInstanceStatus = fundsAvailableCheckInstanceStatus;
  }


}

