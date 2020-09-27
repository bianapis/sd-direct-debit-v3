/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class DirectDebitApiController {

	@Autowired
	DirectDebitApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDDirectDebitActivateOutputModel> activate(@RequestBody BianRequest<SDDirectDebitActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDDirectDebitConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDirectDebitConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("paymenttracking")
	@Fulfill.Control
	public BianResponse<BQPaymentTrackingControlOutputModel> controlPaymenttracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentTrackingControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlPaymenttracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRDirectDebitArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fundsavailablecheck")
	@Fulfill.Exchange
	public BianResponse<BQFundsAvailableCheckExchangeOutputModel> exchangeFundsavailablecheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFundsAvailableCheckExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFundsavailablecheck(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("paymentinitiation")
	@Fulfill.Exchange
	public BianResponse<BQPaymentInitiationExchangeOutputModel> exchangePaymentinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentInitiationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePaymentinitiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRDirectDebitArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("verifymandate")
	@Fulfill.Exchange
	public BianResponse<BQVerifyMandateExchangeOutputModel> exchangeVerifymandate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQVerifyMandateExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeVerifymandate(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("paymenttracking")
	@Fulfill.Execute
	public BianResponse<BQPaymentTrackingExecuteOutputModel> executePaymenttracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentTrackingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executePaymenttracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRDirectDebitArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDDirectDebitFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDirectDebitFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRDirectDebitArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRDirectDebitArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("paymenttracking")
	@Fulfill.Initiate
	public BianResponse<BQPaymentTrackingInitiateOutputModel> initiatePaymenttracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentTrackingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePaymenttracking(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reporting")
	@Fulfill.Initiate
	public BianResponse<BQReportingInitiateOutputModel> initiateReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQReportingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateReporting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fundsavailablecheck")
	@Fulfill.Request
	public BianResponse<BQFundsAvailableCheckRequestOutputModel> requestFundsavailablecheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFundsAvailableCheckRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFundsavailablecheck(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRDirectDebitArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRDirectDebitArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("fundsavailablecheck")
	@Fulfill.Retrieve
	public BianResponse<BQFundsAvailableCheckRetrieveOutputModel> retrieveFundsavailablecheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFundsavailablecheck(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("paymentinitiation")
	@Fulfill.Retrieve
	public BianResponse<BQPaymentInitiationRetrieveOutputModel> retrievePaymentinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePaymentinitiation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("paymenttracking")
	@Fulfill.Retrieve
	public BianResponse<BQPaymentTrackingRetrieveOutputModel> retrievePaymenttracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePaymenttracking(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reporting")
	@Fulfill.Retrieve
	public BianResponse<BQReportingRetrieveOutputModel> retrieveReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReporting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("verifymandate")
	@Fulfill.Retrieve
	public BianResponse<BQVerifyMandateRetrieveOutputModel> retrieveVerifymandate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveVerifymandate(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDDirectDebitRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRDirectDebitArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}
