package com.mydnb.api;

import com.mydnb.model.Account;
import com.mydnb.model.AccountBalance;
import com.mydnb.model.Payment;
import com.mydnb.model.Transaction;
import com.mydnb.model.AccountDetails;
import org.joda.time.LocalDate;

import java.math.BigDecimal;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class AccountsApiController implements AccountsApi {

    public ResponseEntity<AccountBalance> getAccountBalance(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


) {
        // do some magic!
        return new ResponseEntity<AccountBalance>(HttpStatus.OK);
    }

    public ResponseEntity<AccountDetails> getAccountDetails(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


) {
        // do some magic!
        return new ResponseEntity<AccountDetails>(HttpStatus.OK);
    }

    public ResponseEntity<Payment> getAccountPaymentDetailsById(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


) {
        // do some magic!
        return new ResponseEntity<Payment>(HttpStatus.OK);
    }

    public ResponseEntity<List<Payment>> getAccountPaymentsDue(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        @ApiParam(value = "Filter for start date (included).") @RequestParam(value = "startDate", required = false) LocalDate startDate



,
        @ApiParam(value = "Filter for end date (included).") @RequestParam(value = "stopDate", required = false) String stopDate



) {
        // do some magic!
        return new ResponseEntity<List<Payment>>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> getAccountTransactionById(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        
@ApiParam(value = "",required=true ) @PathVariable("transactionId") String transactionId


) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<List<Transaction>> getAccountTransactions(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        @ApiParam(value = "Ascending, descending") @RequestParam(value = "sortOrder", required = false) String sortOrder



,
        @ApiParam(value = "Filter for start date (included)") @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom



,
        @ApiParam(value = "Filter for end date (included).") @RequestParam(value = "dateTo", required = false) LocalDate dateTo



,
        @ApiParam(value = "Filter for minimum amount (included). No decimals.") @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum



,
        @ApiParam(value = "Filter for maximum amount (included). No decimals.") @RequestParam(value = "amountMaximum", required = false) String amountMaximum



,
        @ApiParam(value = "Filter for MCC. Use code only.") @RequestParam(value = "MCC", required = false) String MCC



,
        @ApiParam(value = "Filter for free text. Case insensitive.") @RequestParam(value = "freeText", required = false) String freeText



,
        @ApiParam(value = "Should pending transactions be included?") @RequestParam(value = "includePending", required = false) Boolean includePending



) {
        // do some magic!
        return new ResponseEntity<List<Transaction>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Account>> getAccountsForCurrentUser() {
        // do some magic!
        return new ResponseEntity<List<Account>>(HttpStatus.OK);
    }

}
