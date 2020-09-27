package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceAnalysis
 */
public class BQPaymentTrackingRetrieveInputModelPaymentTrackingInstanceAnalysis   {
  private String paymentTrackingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentTrackingInstanceAnalysisReference
  **/

  public String getPaymentTrackingInstanceAnalysisReference() {
    return paymentTrackingInstanceAnalysisReference;
  }

  public void setPaymentTrackingInstanceAnalysisReference(String paymentTrackingInstanceAnalysisReference) {
    this.paymentTrackingInstanceAnalysisReference = paymentTrackingInstanceAnalysisReference;
  }


}

