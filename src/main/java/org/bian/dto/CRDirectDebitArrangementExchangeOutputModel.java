package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementExchangeOutputModel
 */
public class CRDirectDebitArrangementExchangeOutputModel   {
  private String directDebitArrangementParameterType = null;

  private String directDebitArrangementSelectedOption = null;

  private String directDebitArrangementSchedule = null;

  private String directDebitArrangementStatus = null;

  private String directDebitArrangementExchangeActionTaskReference = null;

  private Object directDebitArrangementExchangeActionTaskRecord = null;

  private String directDebitArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Direct Debit Arrangement 
   * @return directDebitArrangementParameterType
  **/

  public String getDirectDebitArrangementParameterType() {
    return directDebitArrangementParameterType;
  }

  public void setDirectDebitArrangementParameterType(String directDebitArrangementParameterType) {
    this.directDebitArrangementParameterType = directDebitArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Direct Debit Arrangement 
   * @return directDebitArrangementSelectedOption
  **/

  public String getDirectDebitArrangementSelectedOption() {
    return directDebitArrangementSelectedOption;
  }

  public void setDirectDebitArrangementSelectedOption(String directDebitArrangementSelectedOption) {
    this.directDebitArrangementSelectedOption = directDebitArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Direct Debit Arrangement 
   * @return directDebitArrangementSchedule
  **/

  public String getDirectDebitArrangementSchedule() {
    return directDebitArrangementSchedule;
  }

  public void setDirectDebitArrangementSchedule(String directDebitArrangementSchedule) {
    this.directDebitArrangementSchedule = directDebitArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Direct Debit Arrangement 
   * @return directDebitArrangementStatus
  **/

  public String getDirectDebitArrangementStatus() {
    return directDebitArrangementStatus;
  }

  public void setDirectDebitArrangementStatus(String directDebitArrangementStatus) {
    this.directDebitArrangementStatus = directDebitArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Direct Debit Arrangement instance exchange service call 
   * @return directDebitArrangementExchangeActionTaskReference
  **/

  public String getDirectDebitArrangementExchangeActionTaskReference() {
    return directDebitArrangementExchangeActionTaskReference;
  }

  public void setDirectDebitArrangementExchangeActionTaskReference(String directDebitArrangementExchangeActionTaskReference) {
    this.directDebitArrangementExchangeActionTaskReference = directDebitArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return directDebitArrangementExchangeActionTaskRecord
  **/

  public Object getDirectDebitArrangementExchangeActionTaskRecord() {
    return directDebitArrangementExchangeActionTaskRecord;
  }

  public void setDirectDebitArrangementExchangeActionTaskRecord(Object directDebitArrangementExchangeActionTaskRecord) {
    this.directDebitArrangementExchangeActionTaskRecord = directDebitArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return directDebitArrangementExchangeActionResponse
  **/

  public String getDirectDebitArrangementExchangeActionResponse() {
    return directDebitArrangementExchangeActionResponse;
  }

  public void setDirectDebitArrangementExchangeActionResponse(String directDebitArrangementExchangeActionResponse) {
    this.directDebitArrangementExchangeActionResponse = directDebitArrangementExchangeActionResponse;
  }


}

