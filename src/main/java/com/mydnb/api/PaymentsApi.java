package com.mydnb.api;

import com.mydnb.model.Payment;
import org.joda.time.LocalDate;
import com.mydnb.model.PaymentInitiation;
import java.util.List;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "payments", description = "the payments API")
public interface PaymentsApi {

    @ApiOperation(value = "Delete payment by id", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Gone forever", response = Void.class),
        @ApiResponse(code = 400, message = "Status 400", response = Void.class),
        @ApiResponse(code = 401, message = "Status 401", response = Void.class),
        @ApiResponse(code = 403, message = "Status 403", response = Void.class),
        @ApiResponse(code = 404, message = "Unknown paymentId", response = Void.class) })
    @RequestMapping(value = "/payments/{paymentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePayment(
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


);


    @ApiOperation(value = "Get due payment by payment id", notes = "Returns ```payment,``` complete with with ```paymentDetails```.  This endpoint may change, as it is offers the same as ```accounts/{accountNumber}/payments/due/{paymentId}```, and the placement is not decided yet.", response = Payment.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Payment.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Payment.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Payment.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Payment.class),
        @ApiResponse(code = 404, message = "Not Found", response = Payment.class) })
    @RequestMapping(value = "/payments/{accountNumber}/due/{paymentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Payment> getPaymentDueById(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


);


    @ApiOperation(value = "Get due payments for an account", notes = "Gets all due ```payment```s, both domestic and international.", response = Payment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Payment.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Payment.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Payment.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Payment.class),
        @ApiResponse(code = 404, message = "Not Found", response = Payment.class) })
    @RequestMapping(value = "/payments/{accountNumber}/due",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Payment>> getPaymentsDue(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,@ApiParam(value = "Filter for start date (included).") @RequestParam(value = "startDate", required = false) LocalDate startDate



,@ApiParam(value = "Filter for end date (included).") @RequestParam(value = "stopDate", required = false) LocalDate stopDate



);


    @ApiOperation(value = "Initiate payment", notes = "Domestic payment with KID or message.  Returns HTTP 201 and the ```PaymentId``` of the successfully created payment.  Example code test: ``` POST /payments HTTP/1.1 Accept: application/json Content-Length: 219 Content-Type: application/json  {   \"type\": \"MESSAGE\",   \"debitAccountNumber\": \"12345678901\",   \"creditAccountNumber\": \"12345678902\",   \"amount\": \"1500.00\",   \"paymentDate\": \"2018-01-01\",   \"message\": \"Open the pod doors, HAL\",   \"initiator\": \"Dave\" } ```  Response: ``` HTTP/1.1 201 Created date: Thu, 22 Feb 2018 16:00:14 GMT, Thu, 22 Feb 2018 16:00:14 GMT content-type: application/json; charset=UTF-8 content-length: 10  1234567890 ```  **Adding some dummy text to check rendering:** A ```payment``` is the trade of value from one party (such as a person or company) to another for goods, or services, or to fulfill a legal obligation.  Payment can take a variety of forms. Barter, the exchange of one good or service for another, is a form ```payment```. The most common means of payment involve use of money, cheque, or debit, credit ```card```or bank transfers. Payments may also take complicated forms, such as stock issues or the transfer of anything of value or benefit to the parties. In US law, the payer is the party making a payment while the payee is the party receiving the payment. In trade, payments are frequentceded by an invoice or bill.  In general, the payee is at liberty to determine what method of payment he or she will accept; though normally laws require the payer to accept the country's legal tender up to a prescribed limit. Payment is most commonly effected in the local currency of the payee, unless if the parties agree otherwise. Payment in another currency involves an additional foreign exchange transaction. The payee may compromise on a debt, ie., accept a part ```payment``` in full settlement of a debtor's obligation, or may offer a discount, for example, for payment in cash, or for prompt payment, etc. On the other hand, the payee may impose a surcharge, for example, as a late payment fee, or for use of a certain credit ```card```, etc.  The acceptance of a payment by the payee extinguishes a debt or other obligation. A creditor cannot unreasonably refuse to accept a payment, but payment can be refused in some circumstances, for example, on a Sunday or outside banking ```openingTimes```. A payee is usually obligated to acknowledge payment by producing a receipt to the payer. A receipt may be an endorsement on an account as \"paid in full\". The giving of a guarantee or other security for a debt does not constitute a ```payment```.", response = String.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/payments",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> paymentInitiate(

@ApiParam(value = "" ,required=true ) @RequestBody PaymentInitiation body

);


    @ApiOperation(value = "Update existing payment", notes = "A ```payment``` can be updatet until due date: * Date  * Amount * Status (deactivate, reactivate)  Returns the updated ```payment```.", response = Payment.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Changed", response = Payment.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Payment.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Payment.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Payment.class),
        @ApiResponse(code = 404, message = "Not Found", response = Payment.class) })
    @RequestMapping(value = "/payments/{paymentId}",
        produces = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Payment> updatePayment(
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


,

@ApiParam(value = "" ,required=true ) @RequestBody List<String> body

);

}
