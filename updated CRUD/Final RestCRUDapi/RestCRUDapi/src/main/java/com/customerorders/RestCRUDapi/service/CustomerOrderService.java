package com.customerorders.RestCRUDapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerorders.RestCRUDapi.dao.CustomerOrderRepository;
import com.customerorders.RestCRUDapi.method.CustomerOrder;

@Service
public class CustomerOrderService implements ICustomerOrderService {
	
	
	@Autowired
    CustomerOrderRepository customerOrderRepository;
	@Override
    public CustomerOrder fetchById(int customerorderId) {
        return null;
    }
	
	   @Override
	    public CustomerOrder getCustomerOrder(Integer orderId) {
	       return customerOrderRepository.findById(orderId).orElse(null);
	    }

	@Override
	public boolean save(CustomerOrder order) throws Exception{
		// TODO Auto-generated method stub
		customerOrderRepository.save(order);
		return false;
	}
	
	@Override
	public List<CustomerOrder> getAllCustomerOrder(Integer customerId) {
		// TODO Auto-generated method stub
	return customerOrderRepository.findByCustomerId(customerId);
	
	
	}

	
	
	
	}
	


