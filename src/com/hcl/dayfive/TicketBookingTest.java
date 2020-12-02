package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicketBookingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<TicketBooking> tickets = new ArrayList<>();
		System.out.println("Enter the number of customers");
		int noOfCustomers = in.nextInt();
		in.nextLine();
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (int i = 0; i < noOfCustomers; i++) {
			String ticketDetails[] = in.nextLine().split(",");
			tickets.add(new TicketBooking(ticketDetails[0], Integer.parseInt(ticketDetails[1])));
		}
		TicketBooking maxTicket = Collections.max(tickets, new TicketBooking());
		TicketBooking minTicket = Collections.min(tickets, new TicketBooking());
		System.out.println(minTicket.getCustomerName() + " spends minimum amount of Rs." + minTicket.getPrice());
		System.out.println(maxTicket.getCustomerName() + " maximum amount of Rs." + maxTicket.getPrice());
		in.close();
	}

}
