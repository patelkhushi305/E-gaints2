package com.mtc.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	
		private Product product;
		
		@Autowired
		List<Order> neworder = new ArrayList<Order>();
		
		public void processOrder(Order order)
		{
			if (order.getOrderid() == product.getId() && order.getQuantity()<= product.getQuntity())
			{
				System.out.println("Order Placed");
				
				neworder.add(new Order(order.getOrderid(),order.getProductid(), order.getQuantity()));
			
				product.setQuntity(product.getQuntity()-order.getQuantity());
			}
			
			else
			{
				System.out.println(" No sufficient Quantity ");
			}
		}
}


