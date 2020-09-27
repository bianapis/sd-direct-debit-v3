package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecordDirectDebitServicePoliciesandGuidelines
 */
public class SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecordDirectDebitServicePoliciesandGuidelines   {
  private String directDebitServiceEligibility = null;

  private String directDebitServiceIntendedUses = null;

  private String directDebitServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return directDebitServiceEligibility
  **/

  public String getDirectDebitServiceEligibility() {
    return directDebitServiceEligibility;
  }

  public void setDirectDebitServiceEligibility(String directDebitServiceEligibility) {
    this.directDebitServiceEligibility = directDebitServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return directDebitServiceIntendedUses
  **/

  public String getDirectDebitServiceIntendedUses() {
    return directDebitServiceIntendedUses;
  }

  public void setDirectDebitServiceIntendedUses(String directDebitServiceIntendedUses) {
    this.directDebitServiceIntendedUses = directDebitServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return directDebitServicePricingandTerms
  **/

  public String getDirectDebitServicePricingandTerms() {
    return directDebitServicePricingandTerms;
  }

  public void setDirectDebitServicePricingandTerms(String directDebitServicePricingandTerms) {
    this.directDebitServicePricingandTerms = directDebitServicePricingandTerms;
  }


}

