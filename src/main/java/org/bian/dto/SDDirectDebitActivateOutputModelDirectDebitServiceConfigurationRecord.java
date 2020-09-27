package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup;
import org.bian.dto.SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement;
import org.bian.dto.SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecord
 */
public class SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecord   {
  private String directDebitServiceConfigurationSettingReference = null;

  private String directDebitServiceConfigurationSettingDescription = null;

  private SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup = null;

  private SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription directDebitServiceSubscription = null;

  private SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement directDebitServiceAgreement = null;

  private String directDebitServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return directDebitServiceConfigurationSettingDescription
  **/

  public String getDirectDebitServiceConfigurationSettingDescription() {
    return directDebitServiceConfigurationSettingDescription;
  }

  public void setDirectDebitServiceConfigurationSettingDescription(String directDebitServiceConfigurationSettingDescription) {
    this.directDebitServiceConfigurationSettingDescription = directDebitServiceConfigurationSettingDescription;
  }


  /**
   * Get directDebitServiceConfigurationSetup
   * @return directDebitServiceConfigurationSetup
  **/

  public SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup getDirectDebitServiceConfigurationSetup() {
    return directDebitServiceConfigurationSetup;
  }

  public void setDirectDebitServiceConfigurationSetup(SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup) {
    this.directDebitServiceConfigurationSetup = directDebitServiceConfigurationSetup;
  }


  /**
   * Get directDebitServiceSubscription
   * @return directDebitServiceSubscription
  **/

  public SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription getDirectDebitServiceSubscription() {
    return directDebitServiceSubscription;
  }

  public void setDirectDebitServiceSubscription(SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription directDebitServiceSubscription) {
    this.directDebitServiceSubscription = directDebitServiceSubscription;
  }


  /**
   * Get directDebitServiceAgreement
   * @return directDebitServiceAgreement
  **/

  public SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement getDirectDebitServiceAgreement() {
    return directDebitServiceAgreement;
  }

  public void setDirectDebitServiceAgreement(SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement directDebitServiceAgreement) {
    this.directDebitServiceAgreement = directDebitServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return directDebitServiceStatus
  **/

  public String getDirectDebitServiceStatus() {
    return directDebitServiceStatus;
  }

  public void setDirectDebitServiceStatus(String directDebitServiceStatus) {
    this.directDebitServiceStatus = directDebitServiceStatus;
  }


}

