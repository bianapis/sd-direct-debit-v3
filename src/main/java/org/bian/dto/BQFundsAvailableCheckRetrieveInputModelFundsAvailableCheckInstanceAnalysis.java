package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceAnalysis
 */
public class BQFundsAvailableCheckRetrieveInputModelFundsAvailableCheckInstanceAnalysis   {
  private String fundsAvailableCheckInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fundsAvailableCheckInstanceAnalysisReference
  **/

  public String getFundsAvailableCheckInstanceAnalysisReference() {
    return fundsAvailableCheckInstanceAnalysisReference;
  }

  public void setFundsAvailableCheckInstanceAnalysisReference(String fundsAvailableCheckInstanceAnalysisReference) {
    this.fundsAvailableCheckInstanceAnalysisReference = fundsAvailableCheckInstanceAnalysisReference;
  }


}

