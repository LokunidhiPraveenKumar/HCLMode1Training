package com.hcl.day2;

public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void checkPrice(Product p) {

		if (this.getPrice() == p.getPrice())
			System.out.println(this.getProduct_name() + " and " + p.getProduct_name() + " have same price");
		else if (this.getPrice() > p.getPrice())
			System.out.println(p.getProduct_name() + " is cheaper than " + this.getProduct_name());
		else
			System.out.println(this.getProduct_name() + " is cheaper than " + p.getProduct_name());

	}

}