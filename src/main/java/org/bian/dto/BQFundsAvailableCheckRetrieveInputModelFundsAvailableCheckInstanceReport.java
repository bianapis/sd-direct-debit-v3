package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceReport
 */
public class BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceReport   {
  private String fundsAvailableCheckInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fundsAvailableCheckInstanceReportReference
  **/

  public String getFundsAvailableCheckInstanceReportReference() {
    return fundsAvailableCheckInstanceReportReference;
  }

  public void setFundsAvailableCheckInstanceReportReference(String fundsAvailableCheckInstanceReportReference) {
    this.fundsAvailableCheckInstanceReportReference = fundsAvailableCheckInstanceReportReference;
  }


}

