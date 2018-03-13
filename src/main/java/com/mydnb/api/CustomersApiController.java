package com.mydnb.api;

import com.mydnb.model.Address;
import com.mydnb.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("customers")
public class CustomersApiController implements CustomersApi {

  @GetMapping
  public ResponseEntity<Customer[]> getAllCustomers() {
    Customer[] customers = new Customer[2];

    customers[0] = new Customer().firstName("John").lastName("Donn").address(new Address().postCity("Oslo")).email("john.donn@dnb.no").companyName("DNB");
    customers[1] = new Customer().firstName("Elon").lastName("Mask").address(new Address().postCity("New-York")).email("e.mask@spacex.com").companyName("SpaceX");

    return new ResponseEntity<>(customers, HttpStatus.OK);
  }

  public ResponseEntity<Void> customersCustomerIdPatch(@PathVariable("customerId") String customerId,
                                                       @RequestBody List<String> body) {
    // do some magic!
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") String customerId) {
    // do some magic!
    return new ResponseEntity<>(HttpStatus.OK);
  }

  public ResponseEntity<Customer> getCustomerCurrent() {
    // do some magic!
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
