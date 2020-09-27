package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiationRetrieveOutputModelPaymentInitiationInstanceReport
 */
public class BQPaymentInitiationRetrieveOutputModelPaymentInitiationInstanceReport   {
  private Object paymentInitiationInstanceReportRecord = null;

  private String paymentInitiationInstanceReportType = null;

  private String paymentInitiationInstanceReportParameters = null;

  private Object paymentInitiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentInitiationInstanceReportRecord
  **/

  public Object getPaymentInitiationInstanceReportRecord() {
    return paymentInitiationInstanceReportRecord;
  }

  public void setPaymentInitiationInstanceReportRecord(Object paymentInitiationInstanceReportRecord) {
    this.paymentInitiationInstanceReportRecord = paymentInitiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentInitiationInstanceReportType
  **/

  public String getPaymentInitiationInstanceReportType() {
    return paymentInitiationInstanceReportType;
  }

  public void setPaymentInitiationInstanceReportType(String paymentInitiationInstanceReportType) {
    this.paymentInitiationInstanceReportType = paymentInitiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentInitiationInstanceReportParameters
  **/

  public String getPaymentInitiationInstanceReportParameters() {
    return paymentInitiationInstanceReportParameters;
  }

  public void setPaymentInitiationInstanceReportParameters(String paymentInitiationInstanceReportParameters) {
    this.paymentInitiationInstanceReportParameters = paymentInitiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentInitiationInstanceReport
  **/

  public Object getPaymentInitiationInstanceReport() {
    return paymentInitiationInstanceReport;
  }

  public void setPaymentInitiationInstanceReport(Object paymentInitiationInstanceReport) {
    this.paymentInitiationInstanceReport = paymentInitiationInstanceReport;
  }


}

