package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementRetrieveOutputModelDirectDebitArrangementInstanceAnalysis
 */
public class CRDirectDebitArrangementRetrieveOutputModelDirectDebitArrangementInstanceAnalysis   {
  private String directDebitArrangementInstanceAnalysisData = null;

  private String directDebitArrangementInstanceAnalysisReportType = null;

  private Object directDebitArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return directDebitArrangementInstanceAnalysisData
  **/

  public String getDirectDebitArrangementInstanceAnalysisData() {
    return directDebitArrangementInstanceAnalysisData;
  }

  public void setDirectDebitArrangementInstanceAnalysisData(String directDebitArrangementInstanceAnalysisData) {
    this.directDebitArrangementInstanceAnalysisData = directDebitArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return directDebitArrangementInstanceAnalysisReport
  **/

  public Object getDirectDebitArrangementInstanceAnalysisReport() {
    return directDebitArrangementInstanceAnalysisReport;
  }

  public void setDirectDebitArrangementInstanceAnalysisReport(Object directDebitArrangementInstanceAnalysisReport) {
    this.directDebitArrangementInstanceAnalysisReport = directDebitArrangementInstanceAnalysisReport;
  }


}

