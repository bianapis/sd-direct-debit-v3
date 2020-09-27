package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement;
import org.bian.dto.SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup;
import org.bian.dto.SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecord
 */
public class SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecord   {
  private String directDebitServiceConfigurationSettingReference = null;

  private String directDebitServiceConfigurationSettingType = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription directDebitServiceSubscription = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement directDebitServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return directDebitServiceConfigurationSettingReference
  **/

  public String getDirectDebitServiceConfigurationSettingReference() {
    return directDebitServiceConfigurationSettingReference;
  }

  public void setDirectDebitServiceConfigurationSettingReference(String directDebitServiceConfigurationSettingReference) {
    this.directDebitServiceConfigurationSettingReference = directDebitServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return directDebitServiceConfigurationSettingType
  **/

  public String getDirectDebitServiceConfigurationSettingType() {
    return directDebitServiceConfigurationSettingType;
  }

  public void setDirectDebitServiceConfigurationSettingType(String directDebitServiceConfigurationSettingType) {
    this.directDebitServiceConfigurationSettingType = directDebitServiceConfigurationSettingType;
  }


  /**
   * Get directDebitServiceConfigurationSetup
   * @return directDebitServiceConfigurationSetup
  **/

  public SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup getDirectDebitServiceConfigurationSetup() {
    return directDebitServiceConfigurationSetup;
  }

  public void setDirectDebitServiceConfigurationSetup(SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup) {
    this.directDebitServiceConfigurationSetup = directDebitServiceConfigurationSetup;
  }


  /**
   * Get directDebitServiceSubscription
   * @return directDebitServiceSubscription
  **/

  public SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription getDirectDebitServiceSubscription() {
    return directDebitServiceSubscription;
  }

  public void setDirectDebitServiceSubscription(SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription directDebitServiceSubscription) {
    this.directDebitServiceSubscription = directDebitServiceSubscription;
  }


  /**
   * Get directDebitServiceAgreement
   * @return directDebitServiceAgreement
  **/

  public SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement getDirectDebitServiceAgreement() {
    return directDebitServiceAgreement;
  }

  public void setDirectDebitServiceAgreement(SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement directDebitServiceAgreement) {
    this.directDebitServiceAgreement = directDebitServiceAgreement;
  }


}

