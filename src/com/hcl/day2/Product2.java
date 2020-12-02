package com.hcl.day2;

public class Product2 {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	public static String name = "L & K Suppliers";

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

	public double getDiscountedPrice(double price) {
		if (price >= 80000)
			return (price * 0.30);
		else if (price >= 60000)
			return (price * 0.20);
		else if (price >= 50000)
			return (price * 0.10);
		return (price * 0.05);

	}

	public String checkPrice(Product2 p) {
		double p1ActualPrice = this.getPrice() - this.getDiscountedPrice(this.getPrice());
		double p2ActualPrice = p.getPrice() - p.getDiscountedPrice(p.getPrice());

		if (p1ActualPrice == p2ActualPrice)
			return this.getProduct_name() + " and " + p.getProduct_name() + " have same price";
		else if (p1ActualPrice > p2ActualPrice)
			return p.getProduct_name() + " is cheaper than " + this.getProduct_name();
		else
			return this.getProduct_name() + " is cheaper than " + p.getProduct_name();
	}
}
