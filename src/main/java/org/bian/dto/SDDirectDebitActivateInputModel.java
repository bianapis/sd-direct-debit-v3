package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateInputModel
 */
public class SDDirectDebitActivateInputModel   {
  private Object directDebitActivationActionTaskRecord = null;

  private String directDebitCenterReference = null;

  private String directDebitServiceReference = null;

  private SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return directDebitCenterReference
  **/

  public String getDirectDebitCenterReference() {
    return directDebitCenterReference;
  }

  public void setDirectDebitCenterReference(String directDebitCenterReference) {
    this.directDebitCenterReference = directDebitCenterReference;
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

  public SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecord getDirectDebitServiceConfigurationRecord() {
    return directDebitServiceConfigurationRecord;
  }

  public void setDirectDebitServiceConfigurationRecord(SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecord directDebitServiceConfigurationRecord) {
    this.directDebitServiceConfigurationRecord = directDebitServiceConfigurationRecord;
  }


}

