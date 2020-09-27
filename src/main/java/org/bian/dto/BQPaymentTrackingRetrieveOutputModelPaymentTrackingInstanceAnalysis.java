package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTrackingRetrieveOutputModelPaymentTrackingInstanceAnalysis
 */
public class BQPaymentTrackingRetrieveOutputModelPaymentTrackingInstanceAnalysis   {
  private Object paymentTrackingInstanceAnalysisRecord = null;

  private String paymentTrackingInstanceAnalysisReportType = null;

  private String paymentTrackingInstanceAnalysisParameters = null;

  private Object paymentTrackingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentTrackingInstanceAnalysisRecord
  **/

  public Object getPaymentTrackingInstanceAnalysisRecord() {
    return paymentTrackingInstanceAnalysisRecord;
  }

  public void setPaymentTrackingInstanceAnalysisRecord(Object paymentTrackingInstanceAnalysisRecord) {
    this.paymentTrackingInstanceAnalysisRecord = paymentTrackingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentTrackingInstanceAnalysisReportType
  **/

  public String getPaymentTrackingInstanceAnalysisReportType() {
    return paymentTrackingInstanceAnalysisReportType;
  }

  public void setPaymentTrackingInstanceAnalysisReportType(String paymentTrackingInstanceAnalysisReportType) {
    this.paymentTrackingInstanceAnalysisReportType = paymentTrackingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentTrackingInstanceAnalysisParameters
  **/

  public String getPaymentTrackingInstanceAnalysisParameters() {
    return paymentTrackingInstanceAnalysisParameters;
  }

  public void setPaymentTrackingInstanceAnalysisParameters(String paymentTrackingInstanceAnalysisParameters) {
    this.paymentTrackingInstanceAnalysisParameters = paymentTrackingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentTrackingInstanceAnalysisReport
  **/

  public Object getPaymentTrackingInstanceAnalysisReport() {
    return paymentTrackingInstanceAnalysisReport;
  }

  public void setPaymentTrackingInstanceAnalysisReport(Object paymentTrackingInstanceAnalysisReport) {
    this.paymentTrackingInstanceAnalysisReport = paymentTrackingInstanceAnalysisReport;
  }


}

