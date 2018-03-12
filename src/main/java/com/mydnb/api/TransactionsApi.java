//package com.mydnb.api;
//
//import com.mydnb.model.Transaction;
//import org.joda.time.LocalDate;
//import java.math.BigDecimal;
//
//import io.swagger.annotations.*;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")
//
//@Api(value = "transactions", description = "the transactions API")
//public interface TransactionsApi {
//
//    @ApiOperation(value = "Get transaction for account by transaction id", notes = "**Note:** Duplicates ```Transactions```endpoint in ```Accounts```. For evaluation purposes. ", response = Transaction.class, responseContainer = "List", authorizations = {
//        @Authorization(value = "OAuth2", scopes = {
//            @AuthorizationScope(scope = "read", description = "Read"),
//            @AuthorizationScope(scope = "write", description = "Write")
//            })
//    }, tags={ "Transactions", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Request succeeded", response = Transaction.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = Transaction.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = Transaction.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = Transaction.class),
//        @ApiResponse(code = 404, message = "Not Found", response = Transaction.class) })
//    @RequestMapping(value = "/transactions/accounts/{accountNumber}/{transactionId}",
//        produces = { "application/json" },
//        consumes = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<List<Transaction>> gertTransactionForAccountById(
//@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber
//
//
//,
//@ApiParam(value = "",required=true ) @PathVariable("transactionId") String transactionId
//
//
//);
//
//
//    @ApiOperation(value = "Get transactions for account", notes = "**Note:** Duplicates ```Transactions```endpoint in ```Accounts```. For evaluation purposes.   Optional query parameters below. Note: Sorting and filtering affects backend, and may change.  * SortOrder: \"ASC\", \"DESC\" * DateFrom: \"YYYY-MM-DD\": ISO 8601: www.iso.org/iso/home/standards/iso8601.htm * DateTo: \"YYYY-MM-DD\": ISO 8601: www.iso.org/iso/home/standards/iso8601.htm * AmountMinimum: Include amount from (and including) this amount. * AmountMaximum: Include amount from (and including) this amount. * MCC: Include only this MCC code: ISO 18245: https://www.iso.org/standard/33365.html  * FreeText: Filter by free text", response = Transaction.class, responseContainer = "List", authorizations = {
//        @Authorization(value = "OAuth2", scopes = {
//            @AuthorizationScope(scope = "read", description = "Read"),
//            @AuthorizationScope(scope = "write", description = "Write")
//            })
//    }, tags={ "Transactions", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Request succeeded", response = Transaction.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = Transaction.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = Transaction.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = Transaction.class),
//        @ApiResponse(code = 404, message = "Not Found", response = Transaction.class) })
//    @RequestMapping(value = "/transactions/accounts/{accountNumber}",
//        produces = { "application/json" },
//        consumes = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<List<Transaction>> gertTransactionsForAccount(
//@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber
//
//
//,@ApiParam(value = "Should reserved (unbooked) transactions be included?") @RequestParam(value = "includeReserved", required = false) Boolean includeReserved
//
//
//
//,@ApiParam(value = "Ascending, descending", allowableValues = "{values=[ASC, DESC], enumVars=[{name=ASC, value="ASC"}, {name=DESC, value="DESC"}]}", defaultValue = "ASC") @RequestParam(value = "sortOrder", required = false, defaultValue="ASC") String sortOrder
//
//
//
//,@ApiParam(value = "Filter for start date (included).") @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom
//
//
//
//,@ApiParam(value = "Filter for end date (included).") @RequestParam(value = "dateTo", required = false) LocalDate dateTo
//
//
//
//,@ApiParam(value = "Filter for minimum amount (included). No decimals.") @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum
//
//
//
//,@ApiParam(value = "Filter for maximum amount (included). No decimals.") @RequestParam(value = "amountMaximum", required = false) String amountMaximum
//
//
//
//,@ApiParam(value = "Filter for MCC. Use only the numeric code.") @RequestParam(value = "MCC", required = false) String MCC
//
//
//
//,@ApiParam(value = "Filter for free text. Case insensitive.") @RequestParam(value = "freeText", required = false) String freeText
//
//
//
//);
//
//
//    @ApiOperation(value = "Get transactions for credit card", notes = "**Note:** Duplicates ```Transactions```endpoint in ```Cards```. For evaluation purposes.   Optional query parameters below. Note: Sorting and filtering affects backend, and may change.  * SortOrder: \"ASC\", \"DESC\" * DateFrom: \"YYYY-MM-DD\": ISO 8601: www.iso.org/iso/home/standards/iso8601.htm * DateTo: \"YYYY-MM-DD\": ISO 8601: www.iso.org/iso/home/standards/iso8601.htm * AmountMinimum: Include amount from (and including) this amount. * AmountMaximum: Include amount from (and including) this amount. * MCC: Include only this MCC code: ISO 18245: https://www.iso.org/standard/33365.html  * FreeText: Filter by free text", response = Transaction.class, responseContainer = "List", authorizations = {
//        @Authorization(value = "OAuth2", scopes = {
//            @AuthorizationScope(scope = "read", description = "Read"),
//            @AuthorizationScope(scope = "write", description = "Write")
//            })
//    }, tags={ "Transactions", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Request succeeded", response = Transaction.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = Transaction.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = Transaction.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = Transaction.class),
//        @ApiResponse(code = 404, message = "Not Found", response = Transaction.class) })
//    @RequestMapping(value = "/transactions/cards/{cardId}",
//        produces = { "application/json" },
//        consumes = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<List<Transaction>> gertTransactionsForCard(
//@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId
//
//
//,@ApiParam(value = "Ascending, descending") @RequestParam(value = "sortOrder", required = false) String sortOrder
//
//
//
//,@ApiParam(value = "Filter for start date (included).") @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom
//
//
//
//,@ApiParam(value = "Filter for end date (included).") @RequestParam(value = "dateTo", required = false) LocalDate dateTo
//
//
//
//,@ApiParam(value = "Filter for minimum amount (included). No decimals.") @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum
//
//
//
//,@ApiParam(value = "Filter for maximum amount (included). No decimals.") @RequestParam(value = "amountMaximum", required = false) String amountMaximum
//
//
//
//,@ApiParam(value = "Filter for MCC. Use code only.") @RequestParam(value = "MCC", required = false) String MCC
//
//
//
//,@ApiParam(value = "Filter for free text. Case insensitive.") @RequestParam(value = "freeText", required = false) String freeText
//
//
//
//,@ApiParam(value = "Should pending transactions be included?") @RequestParam(value = "includePending", required = false) Boolean includePending
//
//
//
//);
//
//}
