package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveInputModelDirectDebitOfferedServiceDirectDebitServiceRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveInputModelDirectDebitOfferedService
 */
public class SDDirectDebitRetrieveInputModelDirectDebitOfferedService   {
  private String directDebitServiceReference = null;

  private SDDirectDebitRetrieveInputModelDirectDebitOfferedServiceDirectDebitServiceRecord directDebitServiceRecord = null;


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

  public SDDirectDebitRetrieveInputModelDirectDebitOfferedServiceDirectDebitServiceRecord getDirectDebitServiceRecord() {
    return directDebitServiceRecord;
  }

  public void setDirectDebitServiceRecord(SDDirectDebitRetrieveInputModelDirectDebitOfferedServiceDirectDebitServiceRecord directDebitServiceRecord) {
    this.directDebitServiceRecord = directDebitServiceRecord;
  }


}

