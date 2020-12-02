package com.hcl.dayfive;

public class SummaryLog implements Comparable<SummaryLog> {
	private String dialledNumber;
	private Double totalDuration;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SummaryLog(String dialledNumber, Double totalDuration, String name) {
		super();
		this.dialledNumber = dialledNumber;
		this.totalDuration = totalDuration;
		this.name = name;
	}

	public String getDialledNumber() {
		return dialledNumber;
	}

	public void setDialledNumber(String dialledNumber) {
		this.dialledNumber = dialledNumber;
	}

	public Double getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Double totalDuration) {
		this.totalDuration = totalDuration;
	}

	@Override
	public int compareTo(SummaryLog o) {
		// TODO Auto-generated method stub
		return this.getTotalDuration().compareTo(o.getTotalDuration());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s(%s)\t\t%s Seconds\n", this.getName(), this.getDialledNumber(),
				this.getTotalDuration());
	}

}
