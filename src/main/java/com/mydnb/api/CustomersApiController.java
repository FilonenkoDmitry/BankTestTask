package com.mydnb.api;

import com.mydnb.model.Customer;
import com.mydnb.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("customers")
public class CustomersApiController implements CustomersApi {

  private ICustomerService customerService;

  public CustomersApiController(@Autowired ICustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public ResponseEntity<Customer[]> getAllCustomers() {
    List<Customer> allCustomers = customerService.getAllCustomers();
    Customer[] customersArr = new Customer[allCustomers.size()];
    return new ResponseEntity<>(allCustomers.toArray(customersArr), HttpStatus.OK);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public ResponseEntity<Customer> updateCustomerById(@PathVariable("id") String customerId,
                                                     @RequestBody Customer toUpdate) {
    toUpdate.setCustomerId(customerId);
    Customer updated;
    try {
      updated = customerService.updateCustomer(toUpdate);
    }
    catch (NotFoundException e) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    return new ResponseEntity<>(updated, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String customerId) {
    Customer found;
    try {
      found = customerService.getCustomer(customerId);
    }
    catch (NotFoundException e) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    return new ResponseEntity<>(found, HttpStatus.OK);
  }

  @GetMapping("/{id}/accounts")
  public ResponseEntity<String[]> getCustomerAccounts(@PathVariable("id") String customerId) {
    try {
      List<String> customerAccounts = customerService.getCustomerAccounts(customerId);
      String[] accountsAr = new String[customerAccounts.size()];
      return new ResponseEntity<>(customerAccounts.toArray(accountsAr), HttpStatus.OK);
    }
    catch (NotFoundException e) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }
}
