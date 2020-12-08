package com.hcl.modelexception;

@SuppressWarnings("serial")
public class CustomerNotFound extends RuntimeException {
	public CustomerNotFound(String desc) {
		super(desc);
	}
}