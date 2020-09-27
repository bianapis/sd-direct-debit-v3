package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceReport
 */
public class BQVerifyMandateRetrieveOutputModelVerifyMandateInstanceReport   {
  private Object verifyMandateInstanceReportRecord = null;

  private String verifyMandateInstanceReportType = null;

  private String verifyMandateInstanceReportParameters = null;

  private Object verifyMandateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return verifyMandateInstanceReportRecord
  **/

  public Object getVerifyMandateInstanceReportRecord() {
    return verifyMandateInstanceReportRecord;
  }

  public void setVerifyMandateInstanceReportRecord(Object verifyMandateInstanceReportRecord) {
    this.verifyMandateInstanceReportRecord = verifyMandateInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return verifyMandateInstanceReportType
  **/

  public String getVerifyMandateInstanceReportType() {
    return verifyMandateInstanceReportType;
  }

  public void setVerifyMandateInstanceReportType(String verifyMandateInstanceReportType) {
    this.verifyMandateInstanceReportType = verifyMandateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return verifyMandateInstanceReportParameters
  **/

  public String getVerifyMandateInstanceReportParameters() {
    return verifyMandateInstanceReportParameters;
  }

  public void setVerifyMandateInstanceReportParameters(String verifyMandateInstanceReportParameters) {
    this.verifyMandateInstanceReportParameters = verifyMandateInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return verifyMandateInstanceReport
  **/

  public Object getVerifyMandateInstanceReport() {
    return verifyMandateInstanceReport;
  }

  public void setVerifyMandateInstanceReport(Object verifyMandateInstanceReport) {
    this.verifyMandateInstanceReport = verifyMandateInstanceReport;
  }


}

