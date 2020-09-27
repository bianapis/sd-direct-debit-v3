package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiationRetrieveOutputModelPaymentInitiationInstanceAnalysis
 */
public class BQPaymentInitiationRetrieveOutputModelPaymentInitiationInstanceAnalysis   {
  private Object paymentInitiationInstanceAnalysisRecord = null;

  private String paymentInitiationInstanceAnalysisReportType = null;

  private String paymentInitiationInstanceAnalysisParameters = null;

  private Object paymentInitiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentInitiationInstanceAnalysisRecord
  **/

  public Object getPaymentInitiationInstanceAnalysisRecord() {
    return paymentInitiationInstanceAnalysisRecord;
  }

  public void setPaymentInitiationInstanceAnalysisRecord(Object paymentInitiationInstanceAnalysisRecord) {
    this.paymentInitiationInstanceAnalysisRecord = paymentInitiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentInitiationInstanceAnalysisReportType
  **/

  public String getPaymentInitiationInstanceAnalysisReportType() {
    return paymentInitiationInstanceAnalysisReportType;
  }

  public void setPaymentInitiationInstanceAnalysisReportType(String paymentInitiationInstanceAnalysisReportType) {
    this.paymentInitiationInstanceAnalysisReportType = paymentInitiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentInitiationInstanceAnalysisParameters
  **/

  public String getPaymentInitiationInstanceAnalysisParameters() {
    return paymentInitiationInstanceAnalysisParameters;
  }

  public void setPaymentInitiationInstanceAnalysisParameters(String paymentInitiationInstanceAnalysisParameters) {
    this.paymentInitiationInstanceAnalysisParameters = paymentInitiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentInitiationInstanceAnalysisReport
  **/

  public Object getPaymentInitiationInstanceAnalysisReport() {
    return paymentInitiationInstanceAnalysisReport;
  }

  public void setPaymentInitiationInstanceAnalysisReport(Object paymentInitiationInstanceAnalysisReport) {
    this.paymentInitiationInstanceAnalysisReport = paymentInitiationInstanceAnalysisReport;
  }


}

