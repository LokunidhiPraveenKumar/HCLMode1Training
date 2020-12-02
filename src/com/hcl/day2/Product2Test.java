package com.hcl.day2;

import java.util.Scanner;

public class Product2Test {
	public static Product2 buildProduct(Scanner in) {
		Product2 product = new Product2();

		System.out.println("Enter Product Code : ");
		int product_code = in.nextInt();
		in.nextLine();
		System.out.println("Enter Product Name : ");
		String product_name = in.nextLine();
		System.out.println("Enter Price : ");
		double productPrice = in.nextDouble();
		System.out.println("Enter Stock : ");
		int stock = in.nextInt();

		product.setProduct_code(product_code);
		product.setProduct_name(product_name);
		product.setPrice(productPrice);
		product.setStock(stock);

		return product;
	}

	public static void displayProduct(Product2 p) {
		System.out.println("\n" + Product2.name);
		System.out.println("Product Code : " + p.getProduct_code());
		System.out.println("Name : " + p.getProduct_name());
		System.out.println("Stock : " + p.getStock());
		System.out.println("Price : " + p.getPrice());
		System.out.println("Discounted Price : " + p.getDiscountedPrice(p.getPrice()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Product2 product1 = buildProduct(in);
		// new Scanner(System.in).nextLine();
		Product2 product2 = buildProduct(in);
		System.out.println("Product Details :");
		displayProduct(product1);

		displayProduct(product2);

		System.out.println("\n" + product1.checkPrice(product2));
		in.close();
	}

}
