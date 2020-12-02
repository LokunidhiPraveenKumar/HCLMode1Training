package com.hcl.dayfive;

import java.util.Comparator;

public class TicketBooking implements Comparator<TicketBooking> {
	private String customerName;
	private Integer price;

	public TicketBooking() {

	}

	public TicketBooking(String customerName, Integer price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int compare(TicketBooking o1, TicketBooking o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());

	}

}
