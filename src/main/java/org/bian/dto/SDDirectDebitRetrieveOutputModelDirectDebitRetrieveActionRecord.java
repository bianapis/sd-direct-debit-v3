package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis;
import org.bian.dto.SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecord
 */
public class SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecord   {
  private SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis directDebitActivityAnalysis = null;

  private SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis directDebitPerformanceAnalysis = null;

  private SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get directDebitActivityAnalysis
   * @return directDebitActivityAnalysis
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis getDirectDebitActivityAnalysis() {
    return directDebitActivityAnalysis;
  }

  public void setDirectDebitActivityAnalysis(SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis directDebitActivityAnalysis) {
    this.directDebitActivityAnalysis = directDebitActivityAnalysis;
  }


  /**
   * Get directDebitPerformanceAnalysis
   * @return directDebitPerformanceAnalysis
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis getDirectDebitPerformanceAnalysis() {
    return directDebitPerformanceAnalysis;
  }

  public void setDirectDebitPerformanceAnalysis(SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis directDebitPerformanceAnalysis) {
    this.directDebitPerformanceAnalysis = directDebitPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDDirectDebitRetrieveOutputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

