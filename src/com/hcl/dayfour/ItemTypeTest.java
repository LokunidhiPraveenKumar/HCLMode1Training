package com.hcl.dayfour;

import java.util.Scanner;

public class ItemTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ItemType item=new ItemType();
		
		System.out.println("Enter the Item Type details :");
		try {
			System.out.println("Enter the name :");
			item.setName(sc.nextLine());
			System.out.println("Enter the deposit :");
			item.setDeposit(Double.parseDouble(sc.nextLine()));
			System.out.println("Enter the cost per day :");
			item.setCostPerDay(Double.parseDouble(sc.nextLine()));
			
			
			System.out.println(item);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
