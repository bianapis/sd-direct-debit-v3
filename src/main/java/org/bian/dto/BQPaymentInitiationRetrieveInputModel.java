package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceAnalysis;
import org.bian.dto.BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiationRetrieveInputModel
 */
public class BQPaymentInitiationRetrieveInputModel   {
  private Object paymentInitiationRetrieveActionTaskRecord = null;

  private String paymentInitiationRetrieveActionRequest = null;

  private BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceReport paymentInitiationInstanceReport = null;

  private BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceAnalysis paymentInitiationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentInitiationRetrieveActionTaskRecord
  **/

  public Object getPaymentInitiationRetrieveActionTaskRecord() {
    return paymentInitiationRetrieveActionTaskRecord;
  }

  public void setPaymentInitiationRetrieveActionTaskRecord(Object paymentInitiationRetrieveActionTaskRecord) {
    this.paymentInitiationRetrieveActionTaskRecord = paymentInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentInitiationRetrieveActionRequest
  **/

  public String getPaymentInitiationRetrieveActionRequest() {
    return paymentInitiationRetrieveActionRequest;
  }

  public void setPaymentInitiationRetrieveActionRequest(String paymentInitiationRetrieveActionRequest) {
    this.paymentInitiationRetrieveActionRequest = paymentInitiationRetrieveActionRequest;
  }


  /**
   * Get paymentInitiationInstanceReport
   * @return paymentInitiationInstanceReport
  **/

  public BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceReport getPaymentInitiationInstanceReport() {
    return paymentInitiationInstanceReport;
  }

  public void setPaymentInitiationInstanceReport(BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceReport paymentInitiationInstanceReport) {
    this.paymentInitiationInstanceReport = paymentInitiationInstanceReport;
  }


  /**
   * Get paymentInitiationInstanceAnalysis
   * @return paymentInitiationInstanceAnalysis
  **/

  public BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceAnalysis getPaymentInitiationInstanceAnalysis() {
    return paymentInitiationInstanceAnalysis;
  }

  public void setPaymentInitiationInstanceAnalysis(BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceAnalysis paymentInitiationInstanceAnalysis) {
    this.paymentInitiationInstanceAnalysis = paymentInitiationInstanceAnalysis;
  }


}

