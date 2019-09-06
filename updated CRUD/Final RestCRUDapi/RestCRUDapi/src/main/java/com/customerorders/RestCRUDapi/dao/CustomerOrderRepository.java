package com.customerorders.RestCRUDapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerorders.RestCRUDapi.method.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Integer> {
	//public List<CustomerOrder> getCustomerOrderByCustomer(Integer customerId );
	public List<CustomerOrder> findByCustomerId(Integer customerId);

}
