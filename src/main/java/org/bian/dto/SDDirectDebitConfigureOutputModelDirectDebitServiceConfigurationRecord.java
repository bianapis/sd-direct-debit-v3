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
 * SDDirectDebitConfigureOutputModelDirectDebitServiceConfigurationRecord
 */
public class SDDirectDebitConfigureOutputModelDirectDebitServiceConfigurationRecord   {
  private String directDebitServiceConfigurationSettingDescription = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription directDebitServiceSubscription = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceAgreement directDebitServiceAgreement = null;

  private String directDebitServiceStatus = null;


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

