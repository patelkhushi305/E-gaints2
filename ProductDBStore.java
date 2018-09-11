	package com.mtc.app;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class ProductDBStore {

	private List<Product> product= new ArrayList<Product>();

	public ProductDBStore() {
		//id, desc, name, price, quntity, supplierid
		
		product.add(new Product (101, "Almonds" , 101, 2));
		product.add(new Product (102, "Cashew" , 80, 1));
		product.add(new Product (103, "Peanuts" , 120, 12));
		product.add(new Product (104, "Iphone" , 100, 4));
	}
 
	public Product findbyId(int productId)
	{
		 for (Product product : product)
		 {
			 if(product.getId()== productId)
			 {
				 return product;
			 }
		}
		return null;
	}
	
	
	
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
}
