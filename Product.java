package com.mtc.app;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int id;
	private String name;
	private float price; 
	private int quntity;
	
	
	public Product(int id, String name, float price, int quntity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quntity = quntity;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + quntity;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (quntity != other.quntity)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quntity=" + quntity + "]";
	}
	
	
}
