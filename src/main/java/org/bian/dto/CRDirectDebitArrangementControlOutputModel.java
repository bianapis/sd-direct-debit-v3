package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementControlOutputModel
 */
public class CRDirectDebitArrangementControlOutputModel   {
  private String directDebitArrangementParameterType = null;

  private String directDebitArrangementSelectedOption = null;

  private String directDebitArrangementSchedule = null;

  private String directDebitArrangementStatus = null;

  private String directDebitArrangementControlActionTaskReference = null;

  private Object directDebitArrangementControlActionTaskRecord = null;

  private String directDebitArrangementControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Direct Debit Arrangement instance control processing service call 
   * @return directDebitArrangementControlActionTaskReference
  **/

  public String getDirectDebitArrangementControlActionTaskReference() {
    return directDebitArrangementControlActionTaskReference;
  }

  public void setDirectDebitArrangementControlActionTaskReference(String directDebitArrangementControlActionTaskReference) {
    this.directDebitArrangementControlActionTaskReference = directDebitArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return directDebitArrangementControlActionTaskRecord
  **/

  public Object getDirectDebitArrangementControlActionTaskRecord() {
    return directDebitArrangementControlActionTaskRecord;
  }

  public void setDirectDebitArrangementControlActionTaskRecord(Object directDebitArrangementControlActionTaskRecord) {
    this.directDebitArrangementControlActionTaskRecord = directDebitArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return directDebitArrangementControlActionResponse
  **/

  public String getDirectDebitArrangementControlActionResponse() {
    return directDebitArrangementControlActionResponse;
  }

  public void setDirectDebitArrangementControlActionResponse(String directDebitArrangementControlActionResponse) {
    this.directDebitArrangementControlActionResponse = directDebitArrangementControlActionResponse;
  }


}

