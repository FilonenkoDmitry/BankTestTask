package com.mydnb.api;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class IdeasApiController implements IdeasApi {

    public ResponseEntity<String> getIbanForAccount(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> verifyAccount(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
        
@ApiParam(value = "SSN or Organization number",required=true ) @PathVariable("customerId") String customerId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<String> verifyIbanFormat(
@ApiParam(value = "",required=true ) @PathVariable("IBAN") String IBAN


) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
