package com.mydnb.api;

import com.mydnb.model.Customer;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class CustomersApiController implements CustomersApi {

  public ResponseEntity<Void> customersCustomerIdPatch(@ApiParam(value = "", required = true) @PathVariable("customerId") String customerId,
                                                       @ApiParam(value = "", required = true) @RequestBody List<String> body) {
    // do some magic!
    return new ResponseEntity<Void>(HttpStatus.OK);
  }

  public ResponseEntity<Customer> getCustomerById(@ApiParam(value = "", required = true) @PathVariable("customerId") String customerId) {
    // do some magic!
    return new ResponseEntity<Customer>(HttpStatus.OK);
  }

  public ResponseEntity<Customer> getCustomerCurrent() {
    // do some magic!
    return new ResponseEntity<Customer>(HttpStatus.OK);
  }

}
