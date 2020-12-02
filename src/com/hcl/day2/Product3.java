package com.hcl.day2;

public class Product3 extends Product2 {

	public static Product3 checkLessTock(Product3[] productsList) {
		int min = Integer.MAX_VALUE;
		Product3 lessStockProduct = null;
		for (Product3 p : productsList) {
			if (p != null)
				if (p.getStock() <= min) {
					min = p.getStock();
					lessStockProduct = p;
				}
		}

		return lessStockProduct;
	}
}