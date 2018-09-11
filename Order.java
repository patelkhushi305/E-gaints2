package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class Order {

	private long orderid;
	private int productid;
	private int quantity;
	
	public Order() {
		super();
	}

	public Order(long orderid, int productid, int quantity) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.quantity = quantity;
	}
	
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
}
