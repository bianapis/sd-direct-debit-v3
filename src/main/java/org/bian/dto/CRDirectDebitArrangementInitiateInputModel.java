package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementInitiateInputModel
 */
public class CRDirectDebitArrangementInitiateInputModel   {
  private String directDebitServicingSessionReference = null;

  private Object directDebitArrangementInitiateActionRecord = null;

  private String directDebitArrangementInstanceStatus = null;

  private String directDebitArrangementParameterType = null;

  private String directDebitArrangementSelectedOption = null;

  private String directDebitArrangementType = null;

  private String directDebitArrangementReference = null;

  private String directDebitArrangementSchedule = null;

  private String directDebitArrangementStatus = null;

  private String directDebitArrangementCurrency = null;

  private String directDebitArrangementRegulationReference = null;

  private String directDebitArrangementRegulationType = null;

  private String directDebitArrangementJurisdiction = null;

  private String directDebitArrangementBookingLocation = null;

  private String directDebitArrangementAccountType = null;

  private String directDebitArrangementAccountReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return directDebitServicingSessionReference
  **/

  public String getDirectDebitServicingSessionReference() {
    return directDebitServicingSessionReference;
  }

  public void setDirectDebitServicingSessionReference(String directDebitServicingSessionReference) {
    this.directDebitServicingSessionReference = directDebitServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return directDebitArrangementInitiateActionRecord
  **/

  public Object getDirectDebitArrangementInitiateActionRecord() {
    return directDebitArrangementInitiateActionRecord;
  }

  public void setDirectDebitArrangementInitiateActionRecord(Object directDebitArrangementInitiateActionRecord) {
    this.directDebitArrangementInitiateActionRecord = directDebitArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Direct Debit Arrangement instance (e.g. initialised, pending, active) 
   * @return directDebitArrangementInstanceStatus
  **/

  public String getDirectDebitArrangementInstanceStatus() {
    return directDebitArrangementInstanceStatus;
  }

  public void setDirectDebitArrangementInstanceStatus(String directDebitArrangementInstanceStatus) {
    this.directDebitArrangementInstanceStatus = directDebitArrangementInstanceStatus;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Direct Debit Arrangement 
   * @return directDebitArrangementType
  **/

  public String getDirectDebitArrangementType() {
    return directDebitArrangementType;
  }

  public void setDirectDebitArrangementType(String directDebitArrangementType) {
    this.directDebitArrangementType = directDebitArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Direct Debit Arrangement 
   * @return directDebitArrangementReference
  **/

  public String getDirectDebitArrangementReference() {
    return directDebitArrangementReference;
  }

  public void setDirectDebitArrangementReference(String directDebitArrangementReference) {
    this.directDebitArrangementReference = directDebitArrangementReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Direct Debit Arrangement 
   * @return directDebitArrangementCurrency
  **/

  public String getDirectDebitArrangementCurrency() {
    return directDebitArrangementCurrency;
  }

  public void setDirectDebitArrangementCurrency(String directDebitArrangementCurrency) {
    this.directDebitArrangementCurrency = directDebitArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Direct Debit Arrangement 
   * @return directDebitArrangementRegulationReference
  **/

  public String getDirectDebitArrangementRegulationReference() {
    return directDebitArrangementRegulationReference;
  }

  public void setDirectDebitArrangementRegulationReference(String directDebitArrangementRegulationReference) {
    this.directDebitArrangementRegulationReference = directDebitArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Direct Debit Arrangement 
   * @return directDebitArrangementRegulationType
  **/

  public String getDirectDebitArrangementRegulationType() {
    return directDebitArrangementRegulationType;
  }

  public void setDirectDebitArrangementRegulationType(String directDebitArrangementRegulationType) {
    this.directDebitArrangementRegulationType = directDebitArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Direct Debit Arrangement in case of legal dispute. 
   * @return directDebitArrangementJurisdiction
  **/

  public String getDirectDebitArrangementJurisdiction() {
    return directDebitArrangementJurisdiction;
  }

  public void setDirectDebitArrangementJurisdiction(String directDebitArrangementJurisdiction) {
    this.directDebitArrangementJurisdiction = directDebitArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Direct Debit Arrangement, are entered. 
   * @return directDebitArrangementBookingLocation
  **/

  public String getDirectDebitArrangementBookingLocation() {
    return directDebitArrangementBookingLocation;
  }

  public void setDirectDebitArrangementBookingLocation(String directDebitArrangementBookingLocation) {
    this.directDebitArrangementBookingLocation = directDebitArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Direct Debit Arrangement 
   * @return directDebitArrangementAccountType
  **/

  public String getDirectDebitArrangementAccountType() {
    return directDebitArrangementAccountType;
  }

  public void setDirectDebitArrangementAccountType(String directDebitArrangementAccountType) {
    this.directDebitArrangementAccountType = directDebitArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Direct Debit Arrangement 
   * @return directDebitArrangementAccountReference
  **/

  public String getDirectDebitArrangementAccountReference() {
    return directDebitArrangementAccountReference;
  }

  public void setDirectDebitArrangementAccountReference(String directDebitArrangementAccountReference) {
    this.directDebitArrangementAccountReference = directDebitArrangementAccountReference;
  }


}

