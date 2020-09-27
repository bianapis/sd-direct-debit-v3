package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQVerifyMandateRetrieveInputModelVerifyMandateInstanceReport
 */
public class BQVerifyMandateRetrieveInputModelVerifyMandateInstanceReport   {
  private String verifyMandateInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return verifyMandateInstanceReportReference
  **/

  public String getVerifyMandateInstanceReportReference() {
    return verifyMandateInstanceReportReference;
  }

  public void setVerifyMandateInstanceReportReference(String verifyMandateInstanceReportReference) {
    this.verifyMandateInstanceReportReference = verifyMandateInstanceReportReference;
  }


}

