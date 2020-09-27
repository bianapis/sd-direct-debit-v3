package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceReport
 */
public class BQFundsAvailableCheckRetrieveOutputModelFundsAvailableCheckInstanceReport   {
  private Object fundsAvailableCheckInstanceReportRecord = null;

  private String fundsAvailableCheckInstanceReportType = null;

  private String fundsAvailableCheckInstanceReportParameters = null;

  private Object fundsAvailableCheckInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fundsAvailableCheckInstanceReportRecord
  **/

  public Object getFundsAvailableCheckInstanceReportRecord() {
    return fundsAvailableCheckInstanceReportRecord;
  }

  public void setFundsAvailableCheckInstanceReportRecord(Object fundsAvailableCheckInstanceReportRecord) {
    this.fundsAvailableCheckInstanceReportRecord = fundsAvailableCheckInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fundsAvailableCheckInstanceReportType
  **/

  public String getFundsAvailableCheckInstanceReportType() {
    return fundsAvailableCheckInstanceReportType;
  }

  public void setFundsAvailableCheckInstanceReportType(String fundsAvailableCheckInstanceReportType) {
    this.fundsAvailableCheckInstanceReportType = fundsAvailableCheckInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fundsAvailableCheckInstanceReportParameters
  **/

  public String getFundsAvailableCheckInstanceReportParameters() {
    return fundsAvailableCheckInstanceReportParameters;
  }

  public void setFundsAvailableCheckInstanceReportParameters(String fundsAvailableCheckInstanceReportParameters) {
    this.fundsAvailableCheckInstanceReportParameters = fundsAvailableCheckInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fundsAvailableCheckInstanceReport
  **/

  public Object getFundsAvailableCheckInstanceReport() {
    return fundsAvailableCheckInstanceReport;
  }

  public void setFundsAvailableCheckInstanceReport(Object fundsAvailableCheckInstanceReport) {
    this.fundsAvailableCheckInstanceReport = fundsAvailableCheckInstanceReport;
  }


}

