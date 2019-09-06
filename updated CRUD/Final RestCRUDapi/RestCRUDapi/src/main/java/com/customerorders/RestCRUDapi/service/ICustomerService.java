package com.customerorders.RestCRUDapi.service;

import com.customerorders.RestCRUDapi.method.Customer;

import java.util.List;

public interface ICustomerService {
  

    Customer fetchById(int id);

    Customer getCustomer(Integer id);

    List<Customer> getAllCustomers();

    List<Customer> getAllCustomersByName(String name);

	void deleteCustomer(Integer id);

	void updateCustomer(Customer customer);

	boolean save(Customer customer) throws Exception;













	
  





	


   // List<Customer> getAllCustomersByNameCountry(String name, String country);
}
