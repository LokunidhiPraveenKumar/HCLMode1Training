package com.hcl.day2;

import java.util.Scanner;

public class Product4Test extends Product3Test {
	static int index = 0;

	public static void displayProduct(Product3[] productList) {

		for (Product3 p : productList) {
			System.out.println(Product3.name);
			if (p != null) {
				System.out.println("Name : " + p.getProduct_name());
				System.out.println("Stock : " + p.getStock() + "\n");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Product3[] productList = new Product3[15];

		while (true) {
			System.out.println("\t\t\tMenu");
			System.out.println("\t\t1.Add Product\n\t\t2.Display Product\n"
					+ "\t\t3. Get Discounted Price\n\t\t4. Find Costly Product\n"
					+ "\t\t5. Check Min Stock\n\t\t6. exit");

			System.out.println("Enter Choice");
			byte choice = in.nextByte();
			if (choice == 1) {

				productList[index] = Product3Test.buildProduct();
				index++;

			} else if (choice == 2) {
				System.out.println("Product Details\n");
				displayProduct(productList);
			} else if (choice == 3) {
				System.out.println("Discounted price of Products\n");
				System.out.println("Product Name\t\tDiscountPrice");
				for (int j = 0; j < index; j++)
					System.out.println(productList[j].getProduct_name() + "\t\t\t"
							+ productList[j].getDiscountedPrice(productList[j].getPrice()) + "\n");

			} else if (choice == 4) {
				double max = Double.MIN_VALUE;
				Product3 maxPriceProduct = null;
				for (Product3 p : productList) {
					if (p != null)
						if (max <= p.getPrice()) {
							max = p.getPrice();
							maxPriceProduct = p;
						}
				}
				System.out.println(maxPriceProduct.getProduct_name() + " is the Costly product");
			} else if (choice == 5) {
				System.out.println("The product With Min Stock :\n");
				Product3 minStockProduct = Product3.checkLessTock(productList);
				System.out.println(Product3.name);
				System.out.println("Name : " + minStockProduct.getProduct_name());
				System.out.println("Stock : " + minStockProduct.getStock());

			} else {
				System.out.println("Exited!!!");
				break;
			}
		}

		in.close();
	}

}
