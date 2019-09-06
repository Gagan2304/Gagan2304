package com.customerorders.RestCRUDapi.service;

import com.customerorders.RestCRUDapi.dao.CustomerRepository;
import com.customerorders.RestCRUDapi.method.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {

   

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer fetchById(int id) {
        return null;
    }

    @Override
    public Customer getCustomer(Integer id) {
       return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getAllCustomersByName(String name) {
        return customerRepository.findAllByName(name);
    }
   
    

  /*  @Override
    public List<Customer> getAllCustomersByNameCountry(String name, String country) {
        if(country!= null && name !=null)
        return customerRepository.findAllByNameAndCountry(name,country);
        else if()
    }*/

    @Override
    public void deleteCustomer(Integer id) {    	
    	customerRepository.deleteById(id);
    }

	@Override
	public boolean save(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return false;
	}
   
	@Override
	public void updateCustomer(Customer customer){
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}

}
   
	

  
   





