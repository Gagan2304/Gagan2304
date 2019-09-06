package com.customerorders.RestCRUDapi.method;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class CustomerOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String orderItem;
	private double orderPrice;
	private Date orderDate;
	
	@ManyToOne
	private Customer customer;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
		public String getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setCustomer(Customer customer2) {
		// TODO Auto-generated method stub
		this.customer = new Customer();
	}
	
	
	
}
