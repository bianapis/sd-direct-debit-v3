package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQVerifyMandateRetrieveInputModelVerifyMandateInstanceAnalysis;
import org.bian.dto.BQVerifyMandateRetrieveInputModelVerifyMandateInstanceReport;

import javax.validation.Valid;
  
/**
 * BQVerifyMandateRetrieveInputModel
 */
public class BQVerifyMandateRetrieveInputModel   {
  private Object verifyMandateRetrieveActionTaskRecord = null;

  private String verifyMandateRetrieveActionRequest = null;

  private BQVerifyMandateRetrieveInputModelVerifyMandateInstanceReport verifyMandateInstanceReport = null;

  private BQVerifyMandateRetrieveInputModelVerifyMandateInstanceAnalysis verifyMandateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return verifyMandateRetrieveActionTaskRecord
  **/

  public Object getVerifyMandateRetrieveActionTaskRecord() {
    return verifyMandateRetrieveActionTaskRecord;
  }

  public void setVerifyMandateRetrieveActionTaskRecord(Object verifyMandateRetrieveActionTaskRecord) {
    this.verifyMandateRetrieveActionTaskRecord = verifyMandateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return verifyMandateRetrieveActionRequest
  **/

  public String getVerifyMandateRetrieveActionRequest() {
    return verifyMandateRetrieveActionRequest;
  }

  public void setVerifyMandateRetrieveActionRequest(String verifyMandateRetrieveActionRequest) {
    this.verifyMandateRetrieveActionRequest = verifyMandateRetrieveActionRequest;
  }


  /**
   * Get verifyMandateInstanceReport
   * @return verifyMandateInstanceReport
  **/

  public BQVerifyMandateRetrieveInputModelVerifyMandateInstanceReport getVerifyMandateInstanceReport() {
    return verifyMandateInstanceReport;
  }

  public void setVerifyMandateInstanceReport(BQVerifyMandateRetrieveInputModelVerifyMandateInstanceReport verifyMandateInstanceReport) {
    this.verifyMandateInstanceReport = verifyMandateInstanceReport;
  }


  /**
   * Get verifyMandateInstanceAnalysis
   * @return verifyMandateInstanceAnalysis
  **/

  public BQVerifyMandateRetrieveInputModelVerifyMandateInstanceAnalysis getVerifyMandateInstanceAnalysis() {
    return verifyMandateInstanceAnalysis;
  }

  public void setVerifyMandateInstanceAnalysis(BQVerifyMandateRetrieveInputModelVerifyMandateInstanceAnalysis verifyMandateInstanceAnalysis) {
    this.verifyMandateInstanceAnalysis = verifyMandateInstanceAnalysis;
  }


}

