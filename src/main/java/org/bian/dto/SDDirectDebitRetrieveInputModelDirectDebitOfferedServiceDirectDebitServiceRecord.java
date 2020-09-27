package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveInputModelDirectDebitOfferedServiceDirectDebitServiceRecord
 */
public class SDDirectDebitRetrieveInputModelDirectDebitOfferedServiceDirectDebitServiceRecord   {
  private String directDebitServiceVersion = null;


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


}

