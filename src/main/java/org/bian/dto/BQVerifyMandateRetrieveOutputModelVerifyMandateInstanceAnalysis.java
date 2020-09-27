package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceAnalysis
 */
public class BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceAnalysis   {
  private Object verifyMandateInstanceAnalysisRecord = null;

  private String verifyMandateInstanceAnalysisReportType = null;

  private String verifyMandateInstanceAnalysisParameters = null;

  private Object verifyMandateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return verifyMandateInstanceAnalysisRecord
  **/

  public Object getVerifyMandateInstanceAnalysisRecord() {
    return verifyMandateInstanceAnalysisRecord;
  }

  public void setVerifyMandateInstanceAnalysisRecord(Object verifyMandateInstanceAnalysisRecord) {
    this.verifyMandateInstanceAnalysisRecord = verifyMandateInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return verifyMandateInstanceAnalysisReportType
  **/

  public String getVerifyMandateInstanceAnalysisReportType() {
    return verifyMandateInstanceAnalysisReportType;
  }

  public void setVerifyMandateInstanceAnalysisReportType(String verifyMandateInstanceAnalysisReportType) {
    this.verifyMandateInstanceAnalysisReportType = verifyMandateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return verifyMandateInstanceAnalysisParameters
  **/

  public String getVerifyMandateInstanceAnalysisParameters() {
    return verifyMandateInstanceAnalysisParameters;
  }

  public void setVerifyMandateInstanceAnalysisParameters(String verifyMandateInstanceAnalysisParameters) {
    this.verifyMandateInstanceAnalysisParameters = verifyMandateInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return verifyMandateInstanceAnalysisReport
  **/

  public Object getVerifyMandateInstanceAnalysisReport() {
    return verifyMandateInstanceAnalysisReport;
  }

  public void setVerifyMandateInstanceAnalysisReport(Object verifyMandateInstanceAnalysisReport) {
    this.verifyMandateInstanceAnalysisReport = verifyMandateInstanceAnalysisReport;
  }


}

