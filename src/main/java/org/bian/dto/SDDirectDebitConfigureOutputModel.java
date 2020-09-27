package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitConfigureOutputModelDirectDebitServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitConfigureOutputModel
 */
public class SDDirectDebitConfigureOutputModel   {
  private String directDebitConfigurationActionTaskReference = null;

  private Object directDebitConfigurationActionTaskRecord = null;

  private SDDirectDebitConfigureOutputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord = null;

  private String directDebitServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return directDebitConfigurationActionTaskReference
  **/

  public String getDirectDebitConfigurationActionTaskReference() {
    return directDebitConfigurationActionTaskReference;
  }

  public void setDirectDebitConfigurationActionTaskReference(String directDebitConfigurationActionTaskReference) {
    this.directDebitConfigurationActionTaskReference = directDebitConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return directDebitConfigurationActionTaskRecord
  **/

  public Object getDirectDebitConfigurationActionTaskRecord() {
    return directDebitConfigurationActionTaskRecord;
  }

  public void setDirectDebitConfigurationActionTaskRecord(Object directDebitConfigurationActionTaskRecord) {
    this.directDebitConfigurationActionTaskRecord = directDebitConfigurationActionTaskRecord;
  }


  /**
   * Get directDebitServiceConfigurationRecord
   * @return directDebitServiceConfigurationRecord
  **/

  public SDDirectDebitConfigureOutputModelDirectDebitServiceConfigurationRecord getDirectDebitServiceConfigurationRecord() {
    return directDebitServiceConfigurationRecord;
  }

  public void setDirectDebitServiceConfigurationRecord(SDDirectDebitConfigureOutputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord) {
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

