package com.customerorders.RestCRUDapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.customerorders.RestCRUDapi.method.Customer;
import com.customerorders.RestCRUDapi.method.CustomerOrder;
import com.customerorders.RestCRUDapi.service.ICustomerOrderService;


@RestController
@RequestMapping("/customers")
public class CustomerOrderController {
	 Logger log = LoggerFactory.getLogger(this.getClass());

	    @Autowired
	    private ICustomerOrderService customerOrderService;

	    @PostMapping("/{id}/orders")
	    public String saveOrder(@RequestBody CustomerOrder order  )  {
	    	 try {
	    		 order.setCustomer(new Customer());
	             customerOrderService.save(order);
	         } catch (Exception e) {
	             log.error("unable to save order", e);
	             e.printStackTrace();
	             return "error";
	         }
	         return "Order saved";	        
	        		}
	    
	  /*  @GetMapping("")
	    public List<CustomerOrder> getAllOrders(){
	    	return customerOrderService.getAllCustomerOrder();
	    }*/
	    
	    @GetMapping("/{orderid}")
	    public CustomerOrder getCustomerOrder(@PathVariable(value = "orderId")Integer orderId){
	        return customerOrderService.fetchById(orderId);
	    }
	    
	    @GetMapping("/{id}/orders")
	    public List<CustomerOrder> getAllCustomerOrder(@PathVariable int id){
	    	return customerOrderService.getAllCustomerOrder(id);
	    }
	    
	    


	    }
