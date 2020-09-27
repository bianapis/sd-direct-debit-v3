package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecordDirectDebitServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecord
 */
public class SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecord   {
  private String directDebitServiceType = null;

  private String directDebitServiceVersion = null;

  private String directDebitServiceDescription = null;

  private SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecordDirectDebitServicePoliciesandGuidelines directDebitServicePoliciesandGuidelines = null;

  private String directDebitServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return directDebitServiceType
  **/

  public String getDirectDebitServiceType() {
    return directDebitServiceType;
  }

  public void setDirectDebitServiceType(String directDebitServiceType) {
    this.directDebitServiceType = directDebitServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return directDebitServiceVersion
  **/

  public String getDirectDebitServiceVersion() {
    return directDebitServiceVersion;
  }

  public void setDirectDebitServiceVersion(String directDebitServiceVersion) {
    this.directDebitServiceVersion = directDebitServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return directDebitServiceDescription
  **/

  public String getDirectDebitServiceDescription() {
    return directDebitServiceDescription;
  }

  public void setDirectDebitServiceDescription(String directDebitServiceDescription) {
    this.directDebitServiceDescription = directDebitServiceDescription;
  }


  /**
   * Get directDebitServicePoliciesandGuidelines
   * @return directDebitServicePoliciesandGuidelines
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecordDirectDebitServicePoliciesandGuidelines getDirectDebitServicePoliciesandGuidelines() {
    return directDebitServicePoliciesandGuidelines;
  }

  public void setDirectDebitServicePoliciesandGuidelines(SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecordDirectDebitServicePoliciesandGuidelines directDebitServicePoliciesandGuidelines) {
    this.directDebitServicePoliciesandGuidelines = directDebitServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return directDebitServiceSchedule
  **/

  public String getDirectDebitServiceSchedule() {
    return directDebitServiceSchedule;
  }

  public void setDirectDebitServiceSchedule(String directDebitServiceSchedule) {
    this.directDebitServiceSchedule = directDebitServiceSchedule;
  }


}

