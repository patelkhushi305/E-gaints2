package com.mtc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringProductOrder.xml");
		
		OrderService orderservice= context.getBean(OrderService.class);
		
				
         orderservice.processOrder(new Order(1011, 101,2));

	}

}
