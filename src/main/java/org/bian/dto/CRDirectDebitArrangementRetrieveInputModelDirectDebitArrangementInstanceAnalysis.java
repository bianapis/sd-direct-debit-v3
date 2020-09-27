package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceAnalysis
 */
public class CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceAnalysis   {
  private String directDebitArrangementInstanceAnalysisReference = null;

  private String directDebitArrangementInstanceAnalysisReportType = null;

  private String directDebitArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return directDebitArrangementInstanceAnalysisReference
  **/

  public String getDirectDebitArrangementInstanceAnalysisReference() {
    return directDebitArrangementInstanceAnalysisReference;
  }

  public void setDirectDebitArrangementInstanceAnalysisReference(String directDebitArrangementInstanceAnalysisReference) {
    this.directDebitArrangementInstanceAnalysisReference = directDebitArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return directDebitArrangementInstanceAnalysisReportType
  **/

  public String getDirectDebitArrangementInstanceAnalysisReportType() {
    return directDebitArrangementInstanceAnalysisReportType;
  }

  public void setDirectDebitArrangementInstanceAnalysisReportType(String directDebitArrangementInstanceAnalysisReportType) {
    this.directDebitArrangementInstanceAnalysisReportType = directDebitArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return directDebitArrangementInstanceAnalysisParameters
  **/

  public String getDirectDebitArrangementInstanceAnalysisParameters() {
    return directDebitArrangementInstanceAnalysisParameters;
  }

  public void setDirectDebitArrangementInstanceAnalysisParameters(String directDebitArrangementInstanceAnalysisParameters) {
    this.directDebitArrangementInstanceAnalysisParameters = directDebitArrangementInstanceAnalysisParameters;
  }


}

