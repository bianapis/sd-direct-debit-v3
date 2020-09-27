package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceAnalysis;
import org.bian.dto.BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckRetrieveOutputModel
 */
public class BQFundsAvailableCheckRetrieveOutputModel   {
  private String fundsAvailableCheckPreconditions = null;

  private String fundsAvailableCheckFeatureSchedule = null;

  private String fundsAvailableCheckPostconditions = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceType = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceDescription = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs = null;

  private String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct = null;

  private String fundsAvailableCheckRetrieveActionTaskReference = null;

  private Object fundsAvailableCheckRetrieveActionTaskRecord = null;

  private String fundsAvailableCheckRetrieveActionResponse = null;

  private BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceReport fundsAvailableCheckInstanceReport = null;

  private BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceAnalysis fundsAvailableCheckInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Funds Available Check instance retrieve service call 
   * @return fundsAvailableCheckRetrieveActionTaskReference
  **/

  public String getFundsAvailableCheckRetrieveActionTaskReference() {
    return fundsAvailableCheckRetrieveActionTaskReference;
  }

  public void setFundsAvailableCheckRetrieveActionTaskReference(String fundsAvailableCheckRetrieveActionTaskReference) {
    this.fundsAvailableCheckRetrieveActionTaskReference = fundsAvailableCheckRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fundsAvailableCheckRetrieveActionTaskRecord
  **/

  public Object getFundsAvailableCheckRetrieveActionTaskRecord() {
    return fundsAvailableCheckRetrieveActionTaskRecord;
  }

  public void setFundsAvailableCheckRetrieveActionTaskRecord(Object fundsAvailableCheckRetrieveActionTaskRecord) {
    this.fundsAvailableCheckRetrieveActionTaskRecord = fundsAvailableCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fundsAvailableCheckRetrieveActionResponse
  **/

  public String getFundsAvailableCheckRetrieveActionResponse() {
    return fundsAvailableCheckRetrieveActionResponse;
  }

  public void setFundsAvailableCheckRetrieveActionResponse(String fundsAvailableCheckRetrieveActionResponse) {
    this.fundsAvailableCheckRetrieveActionResponse = fundsAvailableCheckRetrieveActionResponse;
  }


  /**
   * Get fundsAvailableCheckInstanceReport
   * @return fundsAvailableCheckInstanceReport
  **/

  public BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceReport getFundsAvailableCheckInstanceReport() {
    return fundsAvailableCheckInstanceReport;
  }

  public void setFundsAvailableCheckInstanceReport(BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceReport fundsAvailableCheckInstanceReport) {
    this.fundsAvailableCheckInstanceReport = fundsAvailableCheckInstanceReport;
  }


  /**
   * Get fundsAvailableCheckInstanceAnalysis
   * @return fundsAvailableCheckInstanceAnalysis
  **/

  public BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceAnalysis getFundsAvailableCheckInstanceAnalysis() {
    return fundsAvailableCheckInstanceAnalysis;
  }

  public void setFundsAvailableCheckInstanceAnalysis(BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceAnalysis fundsAvailableCheckInstanceAnalysis) {
    this.fundsAvailableCheckInstanceAnalysis = fundsAvailableCheckInstanceAnalysis;
  }


}

