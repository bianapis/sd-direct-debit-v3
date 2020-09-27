package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription
 */
public class SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecordDirectDebitServiceSubscription   {
  private String directDebitServiceSubscriberReference = null;

  private String directDebitServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return directDebitServiceSubscriberReference
  **/

  public String getDirectDebitServiceSubscriberReference() {
    return directDebitServiceSubscriberReference;
  }

  public void setDirectDebitServiceSubscriberReference(String directDebitServiceSubscriberReference) {
    this.directDebitServiceSubscriberReference = directDebitServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return directDebitServiceSubscriberAccessProfile
  **/

  public String getDirectDebitServiceSubscriberAccessProfile() {
    return directDebitServiceSubscriberAccessProfile;
  }

  public void setDirectDebitServiceSubscriberAccessProfile(String directDebitServiceSubscriberAccessProfile) {
    this.directDebitServiceSubscriberAccessProfile = directDebitServiceSubscriberAccessProfile;
  }


}

