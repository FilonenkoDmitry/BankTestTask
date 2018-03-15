package com.mydnb.api;

import com.mydnb.model.Account;
import com.mydnb.model.AccountBalance;
import com.mydnb.model.AccountDetails;
import com.mydnb.model.Payment;
import com.mydnb.model.Transaction;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("accounts")
public class AccountsApiController implements AccountsApi {

    private HashMap<String, AccountDetails> accounts = new HashMap<>();
    private HashMap<String, AccountBalance> balances = new HashMap<>();
    private Payment[] payments = new Payment[5];
    private HashMap<String, ArrayList<Transaction>> transactions = new HashMap<>();

    public AccountsApiController() {
        DateTimeFormatter timeformatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");

        accounts.put("0001", new AccountDetails().BIC("BIC0001").IBAN("IBAN0001").currency("NOK").created(timeformatter.parseDateTime("2017-01-01 00:01")).updated(timeformatter.parseDateTime("2018-01-10 23:13")));
        accounts.put("0002", new AccountDetails().BIC("BIC0002").IBAN("IBAN0002").currency("USD").created(timeformatter.parseDateTime("2017-02-01 00:01")).updated(timeformatter.parseDateTime("2018-02-15 13:24")));
        accounts.put("0003", new AccountDetails().BIC("BIC0003").IBAN("IBAN0003").currency("EUR").created(timeformatter.parseDateTime("2017-03-01 00:01")).updated(timeformatter.parseDateTime("2018-03-15 10:10")));

        balances.put("0001", new AccountBalance().accountNumber("0001").amountAvailable(new BigDecimal(1000)).amountBooked(new BigDecimal(200)).timestamp(timeformatter.parseDateTime("2018-01-10 23:13")));
        balances.put("0002", new AccountBalance().accountNumber("0002").amountAvailable(new BigDecimal(3000)).amountBooked(new BigDecimal(100)).timestamp(timeformatter.parseDateTime("2018-02-15 13:24")));
        balances.put("0003", new AccountBalance().accountNumber("0003").amountAvailable(new BigDecimal(400)).amountBooked(new BigDecimal(20)).timestamp(timeformatter.parseDateTime("2018-03-15 10:10")));

        transactions.put("0001", new ArrayList<>());
        transactions.get("0001").add(new Transaction().transactionId("1").MCC("MCC1").currency("NOK").amount(new BigDecimal(123.45)).dateBooking(LocalDate.parse("2018-03-15")).status(Transaction.StatusEnum.BOOKED));
        transactions.get("0001").add(new Transaction().transactionId("2").MCC("MCC2").currency("NOK").amount(new BigDecimal(67.45)).dateBooking(LocalDate.parse("2018-03-11")).status(Transaction.StatusEnum.RESERVED));

        payments[0] = new Payment().paymentId("1").creditAccount("0001").debitAccount("0002").date(LocalDate.parse("2018-03-10")).amount(new BigDecimal(20)).status(Payment.StatusEnum.PENDINGCONFIRMATION);
        payments[1] = new Payment().paymentId("2").creditAccount("0003").debitAccount("0002").date(LocalDate.parse("2018-03-02")).amount(new BigDecimal(50)).status(Payment.StatusEnum.CONFIRMED);
        payments[2] = new Payment().paymentId("3").creditAccount("0003").debitAccount("0001").date(LocalDate.parse("2018-01-02")).amount(new BigDecimal(500)).status(Payment.StatusEnum.LIMITEXCEEDED);
        payments[3] = new Payment().paymentId("4").creditAccount("0002").debitAccount("0003").date(LocalDate.parse("2018-03-15")).amount(new BigDecimal(123.09)).status(Payment.StatusEnum.REJECTED);
        payments[4] = new Payment().paymentId("5").creditAccount("0001").debitAccount("0003").date(LocalDate.parse("2018-03-11")).amount(new BigDecimal(56.90)).status(Payment.StatusEnum.CONFIRMED);
    }

    public ResponseEntity<AccountBalance> getAccountBalance(@PathVariable("accountNumber") String accountNumber) {
        if (!balances.containsKey(accountNumber))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(balances.get(accountNumber), HttpStatus.OK);
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<AccountDetails> getAccountDetails(@PathVariable("accountNumber") String accountNumber) {
        if (!accounts.containsKey(accountNumber))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(accounts.get(accountNumber), HttpStatus.OK);
    }

    public ResponseEntity<Payment> getAccountPaymentDetailsById(@PathVariable("accountNumber") String accountNumber,
                                                                @PathVariable("paymentId") String paymentId) {
        Optional<Payment> payment = Arrays.stream(payments)
                                          .filter(p -> p.getPaymentId().equals(paymentId) && p.getCreditAccount().equals(accountNumber))
                                          .findFirst();

        if (!payment.isPresent())
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(payment.get(), HttpStatus.OK);
    }

    public ResponseEntity<List<Payment>> getAccountPaymentsDue(@PathVariable("accountNumber") String accountNumber,
                                                               @RequestParam(value = "startDate", required = false) LocalDate startDate,
                                                               @RequestParam(value = "stopDate", required = false) LocalDate stopDate) {
        return new ResponseEntity<>(
                Arrays.stream(payments)
                      .filter(p -> p.getCreditAccount().equals(accountNumber) && p.getDate().isAfter(startDate) && p.getDate().isBefore(stopDate))
                      .collect(Collectors.toList()), HttpStatus.OK);
    }

    public ResponseEntity<Transaction> getAccountTransactionById(@PathVariable("accountNumber") String accountNumber,
                                                                 @PathVariable("transactionId") String transactionId) {
        if (!transactions.containsKey(accountNumber))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Optional<Object> transaction = Optional.ofNullable(transactions.get(accountNumber).stream().filter(t -> t.getTransactionId().equals(transactionId)).findFirst());

        if (!transaction.isPresent())
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(((Transaction)transaction.get()), HttpStatus.OK);
    }

    public ResponseEntity<List<Transaction>> getAccountTransactions(@PathVariable("accountNumber") String accountNumber,
                                                                    @RequestParam(value = "sortOrder", required = false) String sortOrder,
                                                                    @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom,
                                                                    @RequestParam(value = "dateTo", required = false) LocalDate dateTo,
                                                                    @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum,
                                                                    @RequestParam(value = "amountMaximum", required = false) BigDecimal amountMaximum,
                                                                    @RequestParam(value = "MCC", required = false) String MCC,
                                                                    @RequestParam(value = "freeText", required = false) String freeText,
                                                                    @RequestParam(value = "includePending", required = false) Boolean includePending) {
        if (!transactions.containsKey(accountNumber))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        List<Transaction> accountTransactions = transactions.get(accountNumber);

        if (dateFrom != null)
            accountTransactions = accountTransactions.stream().filter(t -> t.getDateBooking().isAfter(dateFrom)).collect(Collectors.toList());

        if (dateTo != null)
            accountTransactions = accountTransactions.stream().filter(t -> t.getDateBooking().isBefore(dateTo)).collect(Collectors.toList());

        if (amountMinimum != null)
            accountTransactions = accountTransactions.stream().filter(t -> t.getAmount().compareTo(amountMinimum) >= 0).collect(Collectors.toList());

        if (amountMaximum != null)
            accountTransactions = accountTransactions.stream().filter(t -> t.getAmount().compareTo(amountMaximum) <= 0).collect(Collectors.toList());

        if (MCC != null)
            accountTransactions = accountTransactions.stream().filter(t -> t.getMCC().equals(MCC)).collect(Collectors.toList());

        return new ResponseEntity<>(accountTransactions, HttpStatus.OK);
    }
}
