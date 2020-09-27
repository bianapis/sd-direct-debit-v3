package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceReportRecord
 */
public class CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceReportRecord   {
  private String directDebitArrangementInstanceReportReference = null;

  private String directDebitArrangementInstanceReportType = null;

  private String directDebitArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return directDebitArrangementInstanceReportReference
  **/

  public String getDirectDebitArrangementInstanceReportReference() {
    return directDebitArrangementInstanceReportReference;
  }

  public void setDirectDebitArrangementInstanceReportReference(String directDebitArrangementInstanceReportReference) {
    this.directDebitArrangementInstanceReportReference = directDebitArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return directDebitArrangementInstanceReportType
  **/

  public String getDirectDebitArrangementInstanceReportType() {
    return directDebitArrangementInstanceReportType;
  }

  public void setDirectDebitArrangementInstanceReportType(String directDebitArrangementInstanceReportType) {
    this.directDebitArrangementInstanceReportType = directDebitArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return directDebitArrangementInstanceReportParameters
  **/

  public String getDirectDebitArrangementInstanceReportParameters() {
    return directDebitArrangementInstanceReportParameters;
  }

  public void setDirectDebitArrangementInstanceReportParameters(String directDebitArrangementInstanceReportParameters) {
    this.directDebitArrangementInstanceReportParameters = directDebitArrangementInstanceReportParameters;
  }


}

