package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveOutputModelDirectDebitOfferedService
 */
public class SDDirectDebitRetrieveOutputModelDirectDebitOfferedService   {
  private String directDebitServiceReference = null;

  private SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecord directDebitServiceRecord = null;


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
   * Get directDebitServiceRecord
   * @return directDebitServiceRecord
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecord getDirectDebitServiceRecord() {
    return directDebitServiceRecord;
  }

  public void setDirectDebitServiceRecord(SDDirectDebitRetrieveOutputModelDirectDebitOfferedServiceDirectDebitServiceRecord directDebitServiceRecord) {
    this.directDebitServiceRecord = directDebitServiceRecord;
  }


}

