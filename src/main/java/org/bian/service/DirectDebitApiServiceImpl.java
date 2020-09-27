/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DirectDebitApiServiceImpl implements DirectDebitApiService {

	public SDDirectDebitActivateOutputModel activate(SDDirectDebitActivateInputModel request){
		return JsonReader.read("activate-SDDirectDebitActivateOutputModel.json",new TypeReference<SDDirectDebitActivateOutputModel>(){});
	}
	
	public SDDirectDebitConfigureOutputModel configure(String sdReferenceId, SDDirectDebitConfigureInputModel request){
		return JsonReader.read("configure-SDDirectDebitConfigureOutputModel.json",new TypeReference<SDDirectDebitConfigureOutputModel>(){});
	}
	
	public BQPaymentTrackingControlOutputModel controlPaymenttracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentTrackingControlInputModel request){
		return JsonReader.read("control-BQPaymentTrackingControlOutputModel.json",new TypeReference<BQPaymentTrackingControlOutputModel>(){});
	}
	
	public CRDirectDebitArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementControlInputModel request){
		return JsonReader.read("control-CRDirectDebitArrangementControlOutputModel.json",new TypeReference<CRDirectDebitArrangementControlOutputModel>(){});
	}
	
	public BQFundsAvailableCheckExchangeOutputModel exchangeFundsavailablecheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFundsAvailableCheckExchangeInputModel request){
		return JsonReader.read("exchange-BQFundsAvailableCheckExchangeOutputModel.json",new TypeReference<BQFundsAvailableCheckExchangeOutputModel>(){});
	}
	
	public BQPaymentInitiationExchangeOutputModel exchangePaymentinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentInitiationExchangeOutputModel.json",new TypeReference<BQPaymentInitiationExchangeOutputModel>(){});
	}
	
	public CRDirectDebitArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRDirectDebitArrangementExchangeOutputModel.json",new TypeReference<CRDirectDebitArrangementExchangeOutputModel>(){});
	}
	
	public BQVerifyMandateExchangeOutputModel exchangeVerifymandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQVerifyMandateExchangeInputModel request){
		return JsonReader.read("exchange-BQVerifyMandateExchangeOutputModel.json",new TypeReference<BQVerifyMandateExchangeOutputModel>(){});
	}
	
	public BQPaymentTrackingExecuteOutputModel executePaymenttracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentTrackingExecuteInputModel request){
		return JsonReader.read("execute-BQPaymentTrackingExecuteOutputModel.json",new TypeReference<BQPaymentTrackingExecuteOutputModel>(){});
	}
	
	public CRDirectDebitArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRDirectDebitArrangementExecuteOutputModel.json",new TypeReference<CRDirectDebitArrangementExecuteOutputModel>(){});
	}
	
	public SDDirectDebitFeedbackOutputModel feedback(String sdReferenceId, SDDirectDebitFeedbackInputModel request){
		return JsonReader.read("feedback-SDDirectDebitFeedbackOutputModel.json",new TypeReference<SDDirectDebitFeedbackOutputModel>(){});
	}
	
	public CRDirectDebitArrangementInitiateOutputModel initiate(String sdReferenceId, CRDirectDebitArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRDirectDebitArrangementInitiateOutputModel.json",new TypeReference<CRDirectDebitArrangementInitiateOutputModel>(){});
	}
	
	public BQPaymentTrackingInitiateOutputModel initiatePaymenttracking(String sdReferenceId, String crReferenceId, BQPaymentTrackingInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentTrackingInitiateOutputModel.json",new TypeReference<BQPaymentTrackingInitiateOutputModel>(){});
	}
	
	public BQReportingInitiateOutputModel initiateReporting(String sdReferenceId, String crReferenceId, BQReportingInitiateInputModel request){
		return JsonReader.read("initiate-BQReportingInitiateOutputModel.json",new TypeReference<BQReportingInitiateOutputModel>(){});
	}
	
	public BQFundsAvailableCheckRequestOutputModel requestFundsavailablecheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFundsAvailableCheckRequestInputModel request){
		return JsonReader.read("request-BQFundsAvailableCheckRequestOutputModel.json",new TypeReference<BQFundsAvailableCheckRequestOutputModel>(){});
	}
	
	public CRDirectDebitArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementRequestInputModel request){
		return JsonReader.read("request-CRDirectDebitArrangementRequestOutputModel.json",new TypeReference<CRDirectDebitArrangementRequestOutputModel>(){});
	}
	
	public CRDirectDebitArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRDirectDebitArrangementRetrieveOutputModel.json",new TypeReference<CRDirectDebitArrangementRetrieveOutputModel>(){});
	}
	
	public BQFundsAvailableCheckRetrieveOutputModel retrieveFundsavailablecheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFundsAvailableCheckRetrieveOutputModel.json",new TypeReference<BQFundsAvailableCheckRetrieveOutputModel>(){});
	}
	
	public BQPaymentInitiationRetrieveOutputModel retrievePaymentinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentInitiationRetrieveOutputModel.json",new TypeReference<BQPaymentInitiationRetrieveOutputModel>(){});
	}
	
	public BQPaymentTrackingRetrieveOutputModel retrievePaymenttracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentTrackingRetrieveOutputModel.json",new TypeReference<BQPaymentTrackingRetrieveOutputModel>(){});
	}
	
	public BQReportingRetrieveOutputModel retrieveReporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReportingRetrieveOutputModel.json",new TypeReference<BQReportingRetrieveOutputModel>(){});
	}
	
	public BQVerifyMandateRetrieveOutputModel retrieveVerifymandate(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQVerifyMandateRetrieveOutputModel.json",new TypeReference<BQVerifyMandateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDDirectDebitRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDDirectDebitRetrieveOutputModel.json",new TypeReference<SDDirectDebitRetrieveOutputModel>(){});
	}
	
	public CRDirectDebitArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDirectDebitArrangementUpdateInputModel request){
		return JsonReader.read("update-CRDirectDebitArrangementUpdateOutputModel.json",new TypeReference<CRDirectDebitArrangementUpdateOutputModel>(){});
	}
	
}
