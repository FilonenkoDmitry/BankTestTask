package com.mydnb.api;

import com.mydnb.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomersApi {

    ResponseEntity<Customer[]> getAllCustomers();

    ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") String customerId);

    ResponseEntity<Customer> updateCustomerById(@PathVariable("id") String customerId,
                                                @RequestBody Customer updatedCustomer);
}
