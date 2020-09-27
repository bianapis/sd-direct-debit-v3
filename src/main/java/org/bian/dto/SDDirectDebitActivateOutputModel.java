package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateOutputModel
 */
public class SDDirectDebitActivateOutputModel   {
  private String directDebitActivationActionTaskReference = null;

  private Object directDebitActivationActionTaskRecord = null;

  private String directDebitServicingSessionReference = null;

  private Object directDebitServicingSessionRecord = null;

  private SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord = null;

  private String directDebitServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return directDebitActivationActionTaskReference
  **/

  public String getDirectDebitActivationActionTaskReference() {
    return directDebitActivationActionTaskReference;
  }

  public void setDirectDebitActivationActionTaskReference(String directDebitActivationActionTaskReference) {
    this.directDebitActivationActionTaskReference = directDebitActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return directDebitActivationActionTaskRecord
  **/

  public Object getDirectDebitActivationActionTaskRecord() {
    return directDebitActivationActionTaskRecord;
  }

  public void setDirectDebitActivationActionTaskRecord(Object directDebitActivationActionTaskRecord) {
    this.directDebitActivationActionTaskRecord = directDebitActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return directDebitServicingSessionReference
  **/

  public String getDirectDebitServicingSessionReference() {
    return directDebitServicingSessionReference;
  }

  public void setDirectDebitServicingSessionReference(String directDebitServicingSessionReference) {
    this.directDebitServicingSessionReference = directDebitServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return directDebitServicingSessionRecord
  **/

  public Object getDirectDebitServicingSessionRecord() {
    return directDebitServicingSessionRecord;
  }

  public void setDirectDebitServicingSessionRecord(Object directDebitServicingSessionRecord) {
    this.directDebitServicingSessionRecord = directDebitServicingSessionRecord;
  }


  /**
   * Get directDebitServiceConfigurationRecord
   * @return directDebitServiceConfigurationRecord
  **/

  public SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecord getDirectDebitServiceConfigurationRecord() {
    return directDebitServiceConfigurationRecord;
  }

  public void setDirectDebitServiceConfigurationRecord(SDDirectDebitActivateOutputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord) {
    this.directDebitServiceConfigurationRecord = directDebitServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return directDebitServicingSessionStatus
  **/

  public String getDirectDebitServicingSessionStatus() {
    return directDebitServicingSessionStatus;
  }

  public void setDirectDebitServicingSessionStatus(String directDebitServicingSessionStatus) {
    this.directDebitServicingSessionStatus = directDebitServicingSessionStatus;
  }


}

