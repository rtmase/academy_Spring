package com.mis.domain;

public class ProductVO {

	private String name;
	private double price;
	private int size;
	private int count;

	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public ProductVO(String name, double price, int size, int count) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
		this.count = count;
	}


	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", size=" + size + ", count=" + count + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getSize()=" + getSize() + ", getCount()=" + getCount()
				+ "]";
	}


	
}
