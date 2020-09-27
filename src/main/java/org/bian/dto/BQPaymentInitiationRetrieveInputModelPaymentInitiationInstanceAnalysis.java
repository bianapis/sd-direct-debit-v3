package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceAnalysis
 */
public class BQPaymentInitiationRetrieveInputModelPaymentInitiationInstanceAnalysis   {
  private String paymentInitiationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentInitiationInstanceAnalysisReference
  **/

  public String getPaymentInitiationInstanceAnalysisReference() {
    return paymentInitiationInstanceAnalysisReference;
  }

  public void setPaymentInitiationInstanceAnalysisReference(String paymentInitiationInstanceAnalysisReference) {
    this.paymentInitiationInstanceAnalysisReference = paymentInitiationInstanceAnalysisReference;
  }


}

