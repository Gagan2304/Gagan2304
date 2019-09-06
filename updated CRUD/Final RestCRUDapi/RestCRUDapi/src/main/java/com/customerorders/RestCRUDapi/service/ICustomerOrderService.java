package com.customerorders.RestCRUDapi.service;

import java.util.List;

import com.customerorders.RestCRUDapi.method.CustomerOrder;

public interface ICustomerOrderService {


	//List<CustomerOrder> getAllCustomerOrder();

	CustomerOrder fetchById(int orderId);

	CustomerOrder getCustomerOrder(Integer orderId);

	boolean save(CustomerOrder order) throws Exception;

	List<CustomerOrder> getAllCustomerOrder(Integer customerId);













}
