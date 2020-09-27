package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceAnalysis
 */
public class BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceAnalysis   {
  private Object fundsAvailableCheckInstanceAnalysisRecord = null;

  private String fundsAvailableCheckInstanceAnalysisReportType = null;

  private String fundsAvailableCheckInstanceAnalysisParameters = null;

  private Object fundsAvailableCheckInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fundsAvailableCheckInstanceAnalysisRecord
  **/

  public Object getFundsAvailableCheckInstanceAnalysisRecord() {
    return fundsAvailableCheckInstanceAnalysisRecord;
  }

  public void setFundsAvailableCheckInstanceAnalysisRecord(Object fundsAvailableCheckInstanceAnalysisRecord) {
    this.fundsAvailableCheckInstanceAnalysisRecord = fundsAvailableCheckInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fundsAvailableCheckInstanceAnalysisReportType
  **/

  public String getFundsAvailableCheckInstanceAnalysisReportType() {
    return fundsAvailableCheckInstanceAnalysisReportType;
  }

  public void setFundsAvailableCheckInstanceAnalysisReportType(String fundsAvailableCheckInstanceAnalysisReportType) {
    this.fundsAvailableCheckInstanceAnalysisReportType = fundsAvailableCheckInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fundsAvailableCheckInstanceAnalysisParameters
  **/

  public String getFundsAvailableCheckInstanceAnalysisParameters() {
    return fundsAvailableCheckInstanceAnalysisParameters;
  }

  public void setFundsAvailableCheckInstanceAnalysisParameters(String fundsAvailableCheckInstanceAnalysisParameters) {
    this.fundsAvailableCheckInstanceAnalysisParameters = fundsAvailableCheckInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fundsAvailableCheckInstanceAnalysisReport
  **/

  public Object getFundsAvailableCheckInstanceAnalysisReport() {
    return fundsAvailableCheckInstanceAnalysisReport;
  }

  public void setFundsAvailableCheckInstanceAnalysisReport(Object fundsAvailableCheckInstanceAnalysisReport) {
    this.fundsAvailableCheckInstanceAnalysisReport = fundsAvailableCheckInstanceAnalysisReport;
  }


}

