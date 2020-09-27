package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceAnalysis;
import org.bian.dto.BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckRetrieveInputModel
 */
public class BQFundsAvailableCheckRetrieveInputModel   {
  private Object fundsAvailableCheckRetrieveActionTaskRecord = null;

  private String fundsAvailableCheckRetrieveActionRequest = null;

  private BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceReport fundsAvailableCheckInstanceReport = null;

  private BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceAnalysis fundsAvailableCheckInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fundsAvailableCheckRetrieveActionTaskRecord
  **/

  public Object getFundsAvailableCheckRetrieveActionTaskRecord() {
    return fundsAvailableCheckRetrieveActionTaskRecord;
  }

  public void setFundsAvailableCheckRetrieveActionTaskRecord(Object fundsAvailableCheckRetrieveActionTaskRecord) {
    this.fundsAvailableCheckRetrieveActionTaskRecord = fundsAvailableCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fundsAvailableCheckRetrieveActionRequest
  **/

  public String getFundsAvailableCheckRetrieveActionRequest() {
    return fundsAvailableCheckRetrieveActionRequest;
  }

  public void setFundsAvailableCheckRetrieveActionRequest(String fundsAvailableCheckRetrieveActionRequest) {
    this.fundsAvailableCheckRetrieveActionRequest = fundsAvailableCheckRetrieveActionRequest;
  }


  /**
   * Get fundsAvailableCheckInstanceReport
   * @return fundsAvailableCheckInstanceReport
  **/

  public BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceReport getFundsAvailableCheckInstanceReport() {
    return fundsAvailableCheckInstanceReport;
  }

  public void setFundsAvailableCheckInstanceReport(BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceReport fundsAvailableCheckInstanceReport) {
    this.fundsAvailableCheckInstanceReport = fundsAvailableCheckInstanceReport;
  }


  /**
   * Get fundsAvailableCheckInstanceAnalysis
   * @return fundsAvailableCheckInstanceAnalysis
  **/

  public BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceAnalysis getFundsAvailableCheckInstanceAnalysis() {
    return fundsAvailableCheckInstanceAnalysis;
  }

  public void setFundsAvailableCheckInstanceAnalysis(BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceAnalysis fundsAvailableCheckInstanceAnalysis) {
    this.fundsAvailableCheckInstanceAnalysis = fundsAvailableCheckInstanceAnalysis;
  }


}

