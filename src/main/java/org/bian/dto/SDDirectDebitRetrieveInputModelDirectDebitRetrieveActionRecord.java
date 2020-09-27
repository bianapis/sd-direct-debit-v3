package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis;
import org.bian.dto.SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecord
 */
public class SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecord   {
  private SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis directDebitActivityAnalysis = null;

  private SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis directDebitPerformanceAnalysis = null;

  private SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get directDebitActivityAnalysis
   * @return directDebitActivityAnalysis
  **/

  public SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis getDirectDebitActivityAnalysis() {
    return directDebitActivityAnalysis;
  }

  public void setDirectDebitActivityAnalysis(SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitActivityAnalysis directDebitActivityAnalysis) {
    this.directDebitActivityAnalysis = directDebitActivityAnalysis;
  }


  /**
   * Get directDebitPerformanceAnalysis
   * @return directDebitPerformanceAnalysis
  **/

  public SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis getDirectDebitPerformanceAnalysis() {
    return directDebitPerformanceAnalysis;
  }

  public void setDirectDebitPerformanceAnalysis(SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordDirectDebitPerformanceAnalysis directDebitPerformanceAnalysis) {
    this.directDebitPerformanceAnalysis = directDebitPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDDirectDebitRetrieveInputModelDirectDebitRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

