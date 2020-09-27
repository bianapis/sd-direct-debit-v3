package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitConfigureInputModel
 */
public class SDDirectDebitConfigureInputModel   {
  private Object directDebitConfigurationActionTaskRecord = null;

  private String directDebitServicingSessionReference = null;

  private String directDebitServiceReference = null;

  private SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return directDebitServiceReference
  **/

  public String getDirectDebitServiceReference() {
    return directDebitServiceReference;
  }

  public void setDirectDebitServiceReference(String directDebitServiceReference) {
    this.directDebitServiceReference = directDebitServiceReference;
  }


  /**
   * Get directDebitServiceConfigurationRecord
   * @return directDebitServiceConfigurationRecord
  **/

  public SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecord getDirectDebitServiceConfigurationRecord() {
    return directDebitServiceConfigurationRecord;
  }

  public void setDirectDebitServiceConfigurationRecord(SDDirectDebitConfigureInputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord) {
    this.directDebitServiceConfigurationRecord = directDebitServiceConfigurationRecord;
  }


}

