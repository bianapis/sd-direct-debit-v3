package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecord
 */
public class SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecord   {
  private String directDebitServiceConfigurationSettingReference = null;

  private String directDebitServiceConfigurationSettingType = null;

  private SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup = null;


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

  public SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup getDirectDebitServiceConfigurationSetup() {
    return directDebitServiceConfigurationSetup;
  }

  public void setDirectDebitServiceConfigurationSetup(SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup directDebitServiceConfigurationSetup) {
    this.directDebitServiceConfigurationSetup = directDebitServiceConfigurationSetup;
  }


}

