package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitArrangementRetrieveOutputModelDirectDebitArrangementInstanceReportRecord
 */
public class CRDirectDebitArrangementRetrieveOutputModelDirectDebitArrangementInstanceReportRecord   {
  private String directDebitArrangementInstanceReportData = null;

  private String directDebitArrangementInstanceReportType = null;

  private Object directDebitArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return directDebitArrangementInstanceReportData
  **/

  public String getDirectDebitArrangementInstanceReportData() {
    return directDebitArrangementInstanceReportData;
  }

  public void setDirectDebitArrangementInstanceReportData(String directDebitArrangementInstanceReportData) {
    this.directDebitArrangementInstanceReportData = directDebitArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return directDebitArrangementInstanceReportType
  **/

  public String getDirectDebitArrangementInstanceReportType() {
    return directDebitArrangementInstanceReportType;
  }

  public void setDirectDebitArrangementInstanceReportType(String directDebitArrangementInstanceReportType) {
    this.directDebitArrangementInstanceReportType = directDebitArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return directDebitArrangementInstanceReport
  **/

  public Object getDirectDebitArrangementInstanceReport() {
    return directDebitArrangementInstanceReport;
  }

  public void setDirectDebitArrangementInstanceReport(Object directDebitArrangementInstanceReport) {
    this.directDebitArrangementInstanceReport = directDebitArrangementInstanceReport;
  }


}

