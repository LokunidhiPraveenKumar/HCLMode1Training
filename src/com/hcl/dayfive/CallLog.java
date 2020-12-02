package com.hcl.dayfive;

public class CallLog {
	private String dialledNumber;
	private Double duration;
	private String dialledDate;

	public CallLog(String dialledNumber, Double duration, String dialledDate) {
		super();
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}

	public String getDialledNumber() {
		return dialledNumber;
	}

	public void setDialledNumber(String dialledNumber) {
		this.dialledNumber = dialledNumber;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getDialledDate() {
		return dialledDate;
	}

	public void setDialledDate(String dialledDate) {
		this.dialledDate = dialledDate;
	}

}
