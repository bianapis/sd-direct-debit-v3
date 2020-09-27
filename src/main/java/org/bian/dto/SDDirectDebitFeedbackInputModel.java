package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitFeedbackInputModelDirectDebitFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDDirectDebitFeedbackInputModel
 */
public class SDDirectDebitFeedbackInputModel   {
  private Object directDebitFeedbackActionTaskRecord = null;

  private SDDirectDebitFeedbackInputModelDirectDebitFeedbackActionRecord directDebitFeedbackActionRecord = null;


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

  public SDDirectDebitFeedbackInputModelDirectDebitFeedbackActionRecord getDirectDebitFeedbackActionRecord() {
    return directDebitFeedbackActionRecord;
  }

  public void setDirectDebitFeedbackActionRecord(SDDirectDebitFeedbackInputModelDirectDebitFeedbackActionRecord directDebitFeedbackActionRecord) {
    this.directDebitFeedbackActionRecord = directDebitFeedbackActionRecord;
  }


}

