package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceAnalysis;
import org.bian.dto.BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentTrackingRetrieveInputModel
 */
public class BQPaymentTrackingRetrieveInputModel   {
  private Object paymentTrackingRetrieveActionTaskRecord = null;

  private String paymentTrackingRetrieveActionRequest = null;

  private BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceReport paymentTrackingInstanceReport = null;

  private BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceAnalysis paymentTrackingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentTrackingRetrieveActionTaskRecord
  **/

  public Object getPaymentTrackingRetrieveActionTaskRecord() {
    return paymentTrackingRetrieveActionTaskRecord;
  }

  public void setPaymentTrackingRetrieveActionTaskRecord(Object paymentTrackingRetrieveActionTaskRecord) {
    this.paymentTrackingRetrieveActionTaskRecord = paymentTrackingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentTrackingRetrieveActionRequest
  **/

  public String getPaymentTrackingRetrieveActionRequest() {
    return paymentTrackingRetrieveActionRequest;
  }

  public void setPaymentTrackingRetrieveActionRequest(String paymentTrackingRetrieveActionRequest) {
    this.paymentTrackingRetrieveActionRequest = paymentTrackingRetrieveActionRequest;
  }


  /**
   * Get paymentTrackingInstanceReport
   * @return paymentTrackingInstanceReport
  **/

  public BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceReport getPaymentTrackingInstanceReport() {
    return paymentTrackingInstanceReport;
  }

  public void setPaymentTrackingInstanceReport(BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceReport paymentTrackingInstanceReport) {
    this.paymentTrackingInstanceReport = paymentTrackingInstanceReport;
  }


  /**
   * Get paymentTrackingInstanceAnalysis
   * @return paymentTrackingInstanceAnalysis
  **/

  public BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceAnalysis getPaymentTrackingInstanceAnalysis() {
    return paymentTrackingInstanceAnalysis;
  }

  public void setPaymentTrackingInstanceAnalysis(BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceAnalysis paymentTrackingInstanceAnalysis) {
    this.paymentTrackingInstanceAnalysis = paymentTrackingInstanceAnalysis;
  }


}

