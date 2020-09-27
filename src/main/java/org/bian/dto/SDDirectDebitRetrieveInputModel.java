package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveInputModelDirectDebitOfferedService;
import org.bian.dto.SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveInputModel
 */
public class SDDirectDebitRetrieveInputModel   {
  private Object directDebitRetrieveActionTaskRecord = null;

  private String directDebitRetrieveActionRequest = null;

  private SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecord directDebitRetrieveActionRecord = null;

  private SDDirectDebitRetrieveInputModelDirectDebitOfferedService directDebitOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return directDebitRetrieveActionTaskRecord
  **/

  public Object getDirectDebitRetrieveActionTaskRecord() {
    return directDebitRetrieveActionTaskRecord;
  }

  public void setDirectDebitRetrieveActionTaskRecord(Object directDebitRetrieveActionTaskRecord) {
    this.directDebitRetrieveActionTaskRecord = directDebitRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return directDebitRetrieveActionRequest
  **/

  public String getDirectDebitRetrieveActionRequest() {
    return directDebitRetrieveActionRequest;
  }

  public void setDirectDebitRetrieveActionRequest(String directDebitRetrieveActionRequest) {
    this.directDebitRetrieveActionRequest = directDebitRetrieveActionRequest;
  }


  /**
   * Get directDebitRetrieveActionRecord
   * @return directDebitRetrieveActionRecord
  **/

  public SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecord getDirectDebitRetrieveActionRecord() {
    return directDebitRetrieveActionRecord;
  }

  public void setDirectDebitRetrieveActionRecord(SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecord directDebitRetrieveActionRecord) {
    this.directDebitRetrieveActionRecord = directDebitRetrieveActionRecord;
  }


  /**
   * Get directDebitOfferedService
   * @return directDebitOfferedService
  **/

  public SDDirectDebitRetrieveInputModelDirectDebitOfferedService getDirectDebitOfferedService() {
    return directDebitOfferedService;
  }

  public void setDirectDebitOfferedService(SDDirectDebitRetrieveInputModelDirectDebitOfferedService directDebitOfferedService) {
    this.directDebitOfferedService = directDebitOfferedService;
  }


}

