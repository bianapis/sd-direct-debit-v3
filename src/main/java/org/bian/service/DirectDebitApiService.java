/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DirectDebitApiService {

	SDDirectDebitActivateOutputModel activate(SDDirectDebitActivateInputModel request);
	
	SDDirectDebitConfigureOutputModel configure(String sdReferenceId, SDDirectDebitConfigureInputModel request);
	
	BQPaymentTrackingControlOutputModel controlPaymenttracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentTrackingControlInputModel request);
	
	CRDirectDebitArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementControlInputModel request);
	
	BQFundsAvailableCheckExchangeOutputModel exchangeFundsavailablecheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFundsAvailableCheckExchangeInputModel request);
	
	BQPaymentInitiationExchangeOutputModel exchangePaymentinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentInitiationExchangeInputModel request);
	
	CRDirectDebitArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementExchangeInputModel request);
	
	BQVerifyMandateExchangeOutputModel exchangeVerifymandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQVerifyMandateExchangeInputModel request);
	
	BQPaymentTrackingExecuteOutputModel executePaymenttracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentTrackingExecuteInputModel request);
	
	CRDirectDebitArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementExecuteInputModel request);
	
	SDDirectDebitFeedbackOutputModel feedback(String sdReferenceId, SDDirectDebitFeedbackInputModel request);
	
	CRDirectDebitArrangementInitiateOutputModel initiate(String sdReferenceId, CRDirectDebitArrangementInitiateInputModel request);
	
	BQPaymentTrackingInitiateOutputModel initiatePaymenttracking(String sdReferenceId, String crReferenceId, BQPaymentTrackingInitiateInputModel request);
	
	BQReportingInitiateOutputModel initiateReporting(String sdReferenceId, String crReferenceId, BQReportingInitiateInputModel request);
	
	BQFundsAvailableCheckRequestOutputModel requestFundsavailablecheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFundsAvailableCheckRequestInputModel request);
	
	CRDirectDebitArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementRequestInputModel request);
	
	CRDirectDebitArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQFundsAvailableCheckRetrieveOutputModel retrieveFundsavailablecheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentInitiationRetrieveOutputModel retrievePaymentinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentTrackingRetrieveOutputModel retrievePaymenttracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReportingRetrieveOutputModel retrieveReporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQVerifyMandateRetrieveOutputModel retrieveVerifymandate(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDDirectDebitRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRDirectDebitArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementUpdateInputModel request);
	
}
