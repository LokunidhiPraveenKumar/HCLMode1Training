package com.hcl.day1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int noOfObjs = in.nextInt();
		Wicket[] wicketObjs = new Wicket[noOfObjs];
		byte k = 1;
		in.nextLine();
		for (int i = 0; i < noOfObjs; i++) {
			System.out.println("Enter the details of wicket " + k++);
			String[] st = in.nextLine().split(",");
			wicketObjs[i] = new Wicket();
			wicketObjs[i].setOver(Long.parseLong(st[0]));
			wicketObjs[i].setBall(Long.parseLong(st[1]));
			wicketObjs[i].setWicketType(st[2]);
			wicketObjs[i].setPlayerName(st[3]);
			wicketObjs[i].setBowlerName(st[4]);
		}

		System.out.println("Wicket Details : ");
		for (Wicket obj : wicketObjs) {
			System.out.println("Over : " + obj.getOver());
			System.out.println("Ball : " + obj.getBall());
			System.out.println("Wicket Type : " + obj.getWicketType());
			System.out.println("Player Name : " + obj.getPlayerName());
			System.out.println("Bowler Name : " + obj.getBowlerName());
		}
		in.close();

	}

}
