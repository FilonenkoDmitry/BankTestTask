package com.mydnb.service;

import com.mydnb.api.NotFoundException;
import com.mydnb.model.Address;
import com.mydnb.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

  private List<Customer> customers = new ArrayList<>();

  public CustomerService() {
    customers.add(new Customer().customerId("12345").firstName("John").lastName("Donn").address(new Address().postCity("Oslo").postalAddressLine1("Karl Johans Gate 1").postCode("1234").postCountry("Norway")).email("john.donn@dnb.no").companyName("DNB"));
    customers.add(new Customer().customerId("67890").firstName("Elon").lastName("Musk").address(new Address().postCity("New York").postalAddressLine1("Space Avenue 3").postCode("3333").postCountry("USA")).email("e.musk@spacex.com").companyName("SpaceX"));
  }

  @Override
  public List<Customer> getAllCustomers() {
    return customers;
  }

  @Override
  public Customer getCustomer(String customerId) throws NotFoundException {
    return findCustomer(customerId);
  }

  @Override
  public Customer updateCustomer(Customer updatedCustomer) throws NotFoundException {
    Customer existingCustomer = findCustomer(updatedCustomer.getCustomerId());

    existingCustomer.update(updatedCustomer);

    return existingCustomer;
  }

  //in real app this method is supposed to fetch such data either from Repository or from AccountsService
  @Override
  public List<String> getCustomerAccounts(String customerId) throws NotFoundException {
    if (customerId.equals("12345"))
      return new ArrayList<String>() {{add("0001"); add("0003");}};
    else if (customerId.equals("67890"))
      return new ArrayList<String>() {{add("0002");}};
    else
      throw new NotFoundException(0, "No customer with such ID");
  }

  private Customer findCustomer(String id) throws NotFoundException {
    Optional<Customer> customer = customers.stream().filter(c -> c.getCustomerId().equals(id)).findFirst();

    if (!customer.isPresent())
      throw new NotFoundException(0, "No customer with such ID");

    return customer.get();
  }
}
