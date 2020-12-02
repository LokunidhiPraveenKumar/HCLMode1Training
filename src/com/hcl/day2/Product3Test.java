package com.hcl.day2;

import java.util.Scanner;

public class Product3Test {
	@SuppressWarnings("resource")
	public static Product3 buildProduct() {
		Product3 product = new Product3();
		Scanner in = new Scanner(System.in);

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
		// in.close();
		return product;
	}

	public static void displayProduct(Product3 p) {
		System.out.println("\n" + Product2.name);
		System.out.println("Product Code : " + p.getProduct_code());
		System.out.println("Name : " + p.getProduct_name());
		System.out.println("Stock : " + p.getStock());
		System.out.println("Price : " + p.getPrice());
		System.out.println("Discounted Price : " + p.getDiscountedPrice(p.getPrice()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product3[] productsList = new Product3[5];

		for (int i = 0; i < 5; i++)
			productsList[i] = buildProduct();
		System.out.println("Product Details :");

		for (Product3 p : productsList)
			displayProduct(p);

		System.out.println("\nThe product With Min Stock :");
		Product3 minStockProduct = Product3.checkLessTock(productsList);
		System.out.println(Product2.name);
		System.out.println("Name : " + minStockProduct.getProduct_name());
		System.out.println("Stock : " + minStockProduct.getStock());
	}

}
