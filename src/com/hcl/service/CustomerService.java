package com.hcl.service;

import java.util.List;

import com.hcl.model.Customer;

public interface CustomerService {
	boolean addCustomer(Customer customer);

	boolean deleteCustomer(int id);

	List<Customer> getCustomers();
}