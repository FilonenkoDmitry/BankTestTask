package com.mydnb.api;

import com.mydnb.model.Payment;
import com.mydnb.model.PaymentInitiation;
import org.joda.time.LocalDate;

import java.util.List;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class PaymentsApiController implements PaymentsApi {

    public ResponseEntity<Void> deletePayment(
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Payment> getPaymentDueById(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


) {
        // do some magic!
        return new ResponseEntity<Payment>(HttpStatus.OK);
    }

    public ResponseEntity<List<Payment>> getPaymentsDue(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        @ApiParam(value = "Filter for start date (included).") @RequestParam(value = "startDate", required = false) LocalDate startDate



,
        @ApiParam(value = "Filter for end date (included).") @RequestParam(value = "stopDate", required = false) LocalDate stopDate



) {
        // do some magic!
        return new ResponseEntity<List<Payment>>(HttpStatus.OK);
    }

    public ResponseEntity<String> paymentInitiate(

@ApiParam(value = "" ,required=true ) @RequestBody PaymentInitiation body

) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Payment> updatePayment(
@ApiParam(value = "",required=true ) @PathVariable("paymentId") String paymentId


,
        

@ApiParam(value = "" ,required=true ) @RequestBody List<String> body

) {
        // do some magic!
        return new ResponseEntity<Payment>(HttpStatus.OK);
    }

}
