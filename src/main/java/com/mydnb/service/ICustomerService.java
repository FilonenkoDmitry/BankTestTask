package com.mydnb.service;

import com.mydnb.api.NotFoundException;
import com.mydnb.model.Customer;

import java.util.List;

public interface ICustomerService {
  List<Customer> getAllCustomers();
  Customer getCustomer(String customerId) throws NotFoundException;
  Customer updateCustomer(Customer updatedCustomer) throws NotFoundException;
  List<String> getCustomerAccounts(String customerId) throws NotFoundException;
}
