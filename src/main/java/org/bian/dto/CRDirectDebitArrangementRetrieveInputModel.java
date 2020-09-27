package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceAnalysis;
import org.bian.dto.CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementRetrieveInputModel
 */
public class CRDirectDebitArrangementRetrieveInputModel   {
  private Object directDebitArrangementRetrieveActionTaskRecord = null;

  private String directDebitArrangementRetrieveActionRequest = null;

  private CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceReportRecord directDebitArrangementInstanceReportRecord = null;

  private CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceAnalysis directDebitArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return directDebitArrangementRetrieveActionTaskRecord
  **/

  public Object getDirectDebitArrangementRetrieveActionTaskRecord() {
    return directDebitArrangementRetrieveActionTaskRecord;
  }

  public void setDirectDebitArrangementRetrieveActionTaskRecord(Object directDebitArrangementRetrieveActionTaskRecord) {
    this.directDebitArrangementRetrieveActionTaskRecord = directDebitArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return directDebitArrangementRetrieveActionRequest
  **/

  public String getDirectDebitArrangementRetrieveActionRequest() {
    return directDebitArrangementRetrieveActionRequest;
  }

  public void setDirectDebitArrangementRetrieveActionRequest(String directDebitArrangementRetrieveActionRequest) {
    this.directDebitArrangementRetrieveActionRequest = directDebitArrangementRetrieveActionRequest;
  }


  /**
   * Get directDebitArrangementInstanceReportRecord
   * @return directDebitArrangementInstanceReportRecord
  **/

  public CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceReportRecord getDirectDebitArrangementInstanceReportRecord() {
    return directDebitArrangementInstanceReportRecord;
  }

  public void setDirectDebitArrangementInstanceReportRecord(CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceReportRecord directDebitArrangementInstanceReportRecord) {
    this.directDebitArrangementInstanceReportRecord = directDebitArrangementInstanceReportRecord;
  }


  /**
   * Get directDebitArrangementInstanceAnalysis
   * @return directDebitArrangementInstanceAnalysis
  **/

  public CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceAnalysis getDirectDebitArrangementInstanceAnalysis() {
    return directDebitArrangementInstanceAnalysis;
  }

  public void setDirectDebitArrangementInstanceAnalysis(CRDirectDebitArrangementRetrieveInputModelDirectDebitArrangementInstanceAnalysis directDebitArrangementInstanceAnalysis) {
    this.directDebitArrangementInstanceAnalysis = directDebitArrangementInstanceAnalysis;
  }


}

