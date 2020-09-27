package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitOfferedService;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveOutputModel
 */
public class SDDirectDebitRetrieveOutputModel   {
  private String directDebitRetrieveActionTaskReference = null;

  private Object directDebitRetrieveActionTaskRecord = null;

  private String directDebitRetrieveActionResponse = null;

  private SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecord directDebitRetrieveActionRecord = null;

  private SDDirectDebitRetrieveOutputModelDirectDebitOfferedService directDebitOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return directDebitRetrieveActionTaskReference
  **/

  public String getDirectDebitRetrieveActionTaskReference() {
    return directDebitRetrieveActionTaskReference;
  }

  public void setDirectDebitRetrieveActionTaskReference(String directDebitRetrieveActionTaskReference) {
    this.directDebitRetrieveActionTaskReference = directDebitRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return directDebitRetrieveActionResponse
  **/

  public String getDirectDebitRetrieveActionResponse() {
    return directDebitRetrieveActionResponse;
  }

  public void setDirectDebitRetrieveActionResponse(String directDebitRetrieveActionResponse) {
    this.directDebitRetrieveActionResponse = directDebitRetrieveActionResponse;
  }


  /**
   * Get directDebitRetrieveActionRecord
   * @return directDebitRetrieveActionRecord
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecord getDirectDebitRetrieveActionRecord() {
    return directDebitRetrieveActionRecord;
  }

  public void setDirectDebitRetrieveActionRecord(SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecord directDebitRetrieveActionRecord) {
    this.directDebitRetrieveActionRecord = directDebitRetrieveActionRecord;
  }


  /**
   * Get directDebitOfferedService
   * @return directDebitOfferedService
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitOfferedService getDirectDebitOfferedService() {
    return directDebitOfferedService;
  }

  public void setDirectDebitOfferedService(SDDirectDebitRetrieveOutputModelDirectDebitOfferedService directDebitOfferedService) {
    this.directDebitOfferedService = directDebitOfferedService;
  }


}

