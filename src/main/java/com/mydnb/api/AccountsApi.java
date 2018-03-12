package com.mydnb.api;

import com.mydnb.model.Account;
import com.mydnb.model.AccountBalance;
import com.mydnb.model.AccountDetails;
import com.mydnb.model.Payment;
import com.mydnb.model.Transaction;
import org.joda.time.LocalDate;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Get account balance", notes = "", response = AccountBalance.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = AccountBalance.class),
        @ApiResponse(code = 400, message = "Bad Request", response = AccountBalance.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = AccountBalance.class),
        @ApiResponse(code = 403, message = "Forbidden", response = AccountBalance.class),
        @ApiResponse(code = 404, message = "Not Found", response = AccountBalance.class) })
    @RequestMapping(value = "/accounts/{accountNumber}/balance",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AccountBalance> getAccountBalance(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


);


    @ApiOperation(value = "Get account details", notes = "Returns an ```account```, which also has ```accountBalance```, ```accountDetails``` and ```accountInterestDetails```. ", response = AccountDetails.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = AccountDetails.class),
        @ApiResponse(code = 400, message = "Bad Request", response = AccountDetails.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = AccountDetails.class),
        @ApiResponse(code = 403, message = "Forbidden", response = AccountDetails.class),
        @ApiResponse(code = 404, message = "accountNumber not found", response = AccountDetails.class) })
    @RequestMapping(value = "/accounts/{accountNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AccountDetails> getAccountDetails(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


);


    @ApiOperation(value = "Get details for a payment for an account", notes = "", response = Payment.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Payment.class),
        @ApiResponse(code = 400, message = "Status 400", response = Payment.class),
        @ApiResponse(code = 404, message = "Status 404", response = Payment.class) })
    @RequestMapping(value = "/accounts/{accountNumber}/payments/due/{paymentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Payment> getAccountPaymentDetailsById(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


);


    @ApiOperation(value = "Get due payments for account by date range", notes = "", response = Payment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Payment.class),
        @ApiResponse(code = 400, message = "Status 400", response = Payment.class),
        @ApiResponse(code = 404, message = "Status 404", response = Payment.class) })
    @RequestMapping(value = "/accounts/{accountNumber}/payments/due",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Payment>> getAccountPaymentsDue(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,@ApiParam(value = "Filter for start date (included).") @RequestParam(value = "startDate", required = false) LocalDate startDate



,@ApiParam(value = "Filter for end date (included).") @RequestParam(value = "stopDate", required = false) String stopDate



);


    @ApiOperation(value = "Get transaction specified by id", notes = "**NOTE:** May not be possible, as this is not implemented in the Open Layer yet. Duplicates endpoint in ```Transactions```. For evaluation purposes. ", response = Transaction.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Transaction.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Transaction.class),
        @ApiResponse(code = 404, message = "Not Found", response = Transaction.class) })
    @RequestMapping(value = "/accounts/{accountNumber}/transactions/{transactionId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Transaction> getAccountTransactionById(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
@ApiParam(value = "",required=true ) @PathVariable("transactionId") String transactionId


);


    @ApiOperation(value = "Get transactions for account", notes = "**NOTE:** Duplicates endpoint in ```Transactions```. For evaluation purposes. May be restricted to only retrieve one month at a time.  Optional query parameters below. Note: Sorting and filtering affects backend, and may change.  * SortOrder: \"ASC\", \"DESC\" * DateFrom: \"YYYY-MM-DD\": ISO 8601: www.iso.org/iso/home/standards/iso8601.htm * DateTo: \"YYYY-MM-DD\": ISO 8601: www.iso.org/iso/home/standards/iso8601.htm * AmountMinimum: Include amount from (and including) this amount. * AmountMaximum: Include amount from (and including) this amount. * MCC: Include only this MCC code: ISO 18245: https://www.iso.org/standard/33365.html  * FreeText: Filter by free text", response = Transaction.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Transaction.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Transaction.class),
        @ApiResponse(code = 404, message = "Not Found", response = Transaction.class) })
    @RequestMapping(value = "/accounts/{accountNumber}/transactions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getAccountTransactions(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,@ApiParam(value = "Ascending, descending") @RequestParam(value = "sortOrder", required = false) String sortOrder



,@ApiParam(value = "Filter for start date (included)") @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom



,@ApiParam(value = "Filter for end date (included).") @RequestParam(value = "dateTo", required = false) LocalDate dateTo



,@ApiParam(value = "Filter for minimum amount (included). No decimals.") @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum



,@ApiParam(value = "Filter for maximum amount (included). No decimals.") @RequestParam(value = "amountMaximum", required = false) String amountMaximum



,@ApiParam(value = "Filter for MCC. Use code only.") @RequestParam(value = "MCC", required = false) String MCC



,@ApiParam(value = "Filter for free text. Case insensitive.") @RequestParam(value = "freeText", required = false) String freeText



,@ApiParam(value = "Should pending transactions be included?") @RequestParam(value = "includePending", required = false) Boolean includePending



);


    @ApiOperation(value = "Get account list for current user", notes = "", response = Account.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Account.class),
        @ApiResponse(code = 400, message = "Status 400", response = Account.class),
        @ApiResponse(code = 404, message = "Status 404", response = Account.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Account>> getAccountsForCurrentUser();

}
