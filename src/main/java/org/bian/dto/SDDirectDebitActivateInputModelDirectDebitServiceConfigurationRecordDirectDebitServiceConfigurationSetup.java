package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup
 */
public class SDDirectDebitActivateInputModelDirectDebitServiceConfigurationRecordDirectDebitServiceConfigurationSetup   {
  private String directDebitServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return directDebitServiceConfigurationParameter
  **/

  public String getDirectDebitServiceConfigurationParameter() {
    return directDebitServiceConfigurationParameter;
  }

  public void setDirectDebitServiceConfigurationParameter(String directDebitServiceConfigurationParameter) {
    this.directDebitServiceConfigurationParameter = directDebitServiceConfigurationParameter;
  }


}

