package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement
 */
public class SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement   {
  private String directDebitServiceAgreementReference = null;

  private String directDebitServiceUserReference = null;

  private String directDebitServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return directDebitServiceAgreementReference
  **/

  public String getDirectDebitServiceAgreementReference() {
    return directDebitServiceAgreementReference;
  }

  public void setDirectDebitServiceAgreementReference(String directDebitServiceAgreementReference) {
    this.directDebitServiceAgreementReference = directDebitServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return directDebitServiceUserReference
  **/

  public String getDirectDebitServiceUserReference() {
    return directDebitServiceUserReference;
  }

  public void setDirectDebitServiceUserReference(String directDebitServiceUserReference) {
    this.directDebitServiceUserReference = directDebitServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return directDebitServiceAgreementTermsandConditions
  **/

  public String getDirectDebitServiceAgreementTermsandConditions() {
    return directDebitServiceAgreementTermsandConditions;
  }

  public void setDirectDebitServiceAgreementTermsandConditions(String directDebitServiceAgreementTermsandConditions) {
    this.directDebitServiceAgreementTermsandConditions = directDebitServiceAgreementTermsandConditions;
  }


}

