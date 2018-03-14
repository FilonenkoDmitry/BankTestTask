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

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("customers")
public class CustomersApiController implements CustomersApi {

  private Customer[] customers = new Customer[2];

  public CustomersApiController() {
    this.customers = new Customer[2];

    customers[0] = new Customer().customerId("12345").firstName("John").lastName("Donn").address(new Address().postCity("Oslo")).email("john.donn@dnb.no").companyName("DNB");
    customers[1] = new Customer().customerId("67890").firstName("Elon").lastName("Mask").address(new Address().postCity("New-York")).email("e.mask@spacex.com").companyName("SpaceX");
  }

  @GetMapping
  public ResponseEntity<Customer[]> getAllCustomers() {
    return new ResponseEntity<>(customers, HttpStatus.OK);
  }

  public ResponseEntity<Void> customersCustomerIdPatch(@PathVariable("customerId") String customerId,
                                                       @RequestBody List<String> body) {
    // do some magic!
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String customerId) {
    // do some magic!
    Optional<Customer> customer = Arrays.stream(customers).filter(c -> c.getCustomerId().equals(customerId)).findFirst();

    if (!customer.isPresent())
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    return new ResponseEntity<>(customer.get(), HttpStatus.OK);
  }

  public ResponseEntity<Customer> getCustomerCurrent() {
    // do some magic!
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
