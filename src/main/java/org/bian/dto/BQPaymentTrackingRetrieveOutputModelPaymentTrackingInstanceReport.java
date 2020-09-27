package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTrackingRetrieveOutputModelPaymentTrackingInstanceReport
 */
public class BQPaymentTrackingRetrieveOutputModelPaymentTrackingInstanceReport   {
  private Object paymentTrackingInstanceReportRecord = null;

  private String paymentTrackingInstanceReportType = null;

  private String paymentTrackingInstanceReportParameters = null;

  private Object paymentTrackingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentTrackingInstanceReportRecord
  **/

  public Object getPaymentTrackingInstanceReportRecord() {
    return paymentTrackingInstanceReportRecord;
  }

  public void setPaymentTrackingInstanceReportRecord(Object paymentTrackingInstanceReportRecord) {
    this.paymentTrackingInstanceReportRecord = paymentTrackingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentTrackingInstanceReportType
  **/

  public String getPaymentTrackingInstanceReportType() {
    return paymentTrackingInstanceReportType;
  }

  public void setPaymentTrackingInstanceReportType(String paymentTrackingInstanceReportType) {
    this.paymentTrackingInstanceReportType = paymentTrackingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentTrackingInstanceReportParameters
  **/

  public String getPaymentTrackingInstanceReportParameters() {
    return paymentTrackingInstanceReportParameters;
  }

  public void setPaymentTrackingInstanceReportParameters(String paymentTrackingInstanceReportParameters) {
    this.paymentTrackingInstanceReportParameters = paymentTrackingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentTrackingInstanceReport
  **/

  public Object getPaymentTrackingInstanceReport() {
    return paymentTrackingInstanceReport;
  }

  public void setPaymentTrackingInstanceReport(Object paymentTrackingInstanceReport) {
    this.paymentTrackingInstanceReport = paymentTrackingInstanceReport;
  }


}

