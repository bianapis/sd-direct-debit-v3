package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementRequestOutputModel
 */
public class CRDirectDebitArrangementRequestOutputModel   {
  private String directDebitArrangementParameterType = null;

  private String directDebitArrangementSelectedOption = null;

  private String directDebitArrangementSchedule = null;

  private String directDebitArrangementStatus = null;

  private String directDebitArrangementRequestActionTaskReference = null;

  private Object directDebitArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Direct Debit Arrangement instance request service call 
   * @return directDebitArrangementRequestActionTaskReference
  **/

  public String getDirectDebitArrangementRequestActionTaskReference() {
    return directDebitArrangementRequestActionTaskReference;
  }

  public void setDirectDebitArrangementRequestActionTaskReference(String directDebitArrangementRequestActionTaskReference) {
    this.directDebitArrangementRequestActionTaskReference = directDebitArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return directDebitArrangementRequestActionTaskRecord
  **/

  public Object getDirectDebitArrangementRequestActionTaskRecord() {
    return directDebitArrangementRequestActionTaskRecord;
  }

  public void setDirectDebitArrangementRequestActionTaskRecord(Object directDebitArrangementRequestActionTaskRecord) {
    this.directDebitArrangementRequestActionTaskRecord = directDebitArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

