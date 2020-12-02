package com.hcl.day2;

import java.util.Scanner;

public class ProductTest {
	public static void setProductDetails(Product product, Scanner in) {
		System.out.print("\nProduct Code : ");
		int product_code = in.nextInt();
		in.nextLine();
		System.out.print("Name : ");
		String product_name = in.nextLine();
		System.out.print("Price : ");
		double productPrice = in.nextDouble();
		System.out.print("Stock : ");
		int stock = in.nextInt();

		product.setProduct_code(product_code);
		product.setProduct_name(product_name);
		product.setPrice(productPrice);
		product.setStock(stock);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Product Details : ");

		Product product1 = new Product();
		setProductDetails(product1, in);

		Product product2 = new Product();
		setProductDetails(product2, in);
		System.out.println();
		product1.checkPrice(product2);
		in.close();
	}

}
