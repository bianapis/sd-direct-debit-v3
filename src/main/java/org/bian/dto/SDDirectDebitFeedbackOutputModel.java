package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitFeedbackOutputModelDirectDebitFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitFeedbackOutputModel
 */
public class SDDirectDebitFeedbackOutputModel   {
  private String directDebitFeedbackActionTaskReference = null;

  private Object directDebitFeedbackActionTaskRecord = null;

  private SDDirectDebitFeedbackOutputModelDirectDebitFeedbackActionRecord directDebitFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return directDebitFeedbackActionTaskReference
  **/

  public String getDirectDebitFeedbackActionTaskReference() {
    return directDebitFeedbackActionTaskReference;
  }

  public void setDirectDebitFeedbackActionTaskReference(String directDebitFeedbackActionTaskReference) {
    this.directDebitFeedbackActionTaskReference = directDebitFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return directDebitFeedbackActionTaskRecord
  **/

  public Object getDirectDebitFeedbackActionTaskRecord() {
    return directDebitFeedbackActionTaskRecord;
  }

  public void setDirectDebitFeedbackActionTaskRecord(Object directDebitFeedbackActionTaskRecord) {
    this.directDebitFeedbackActionTaskRecord = directDebitFeedbackActionTaskRecord;
  }


  /**
   * Get directDebitFeedbackActionRecord
   * @return directDebitFeedbackActionRecord
  **/

  public SDDirectDebitFeedbackOutputModelDirectDebitFeedbackActionRecord getDirectDebitFeedbackActionRecord() {
    return directDebitFeedbackActionRecord;
  }

  public void setDirectDebitFeedbackActionRecord(SDDirectDebitFeedbackOutputModelDirectDebitFeedbackActionRecord directDebitFeedbackActionRecord) {
    this.directDebitFeedbackActionRecord = directDebitFeedbackActionRecord;
  }


}

