package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import com.hcl.model.Customer;
import com.hcl.modelexception.CustomerNotFound;

public class CustomerServiceImpl implements CustomerService {
	List<Customer> customers = new ArrayList<>();

	@Override
	public boolean addCustomer(Customer customer) {
		if (customer != null)
			return customers.add(customer);
		else
			return false;

	}

	@Override
	public boolean deleteCustomer(int id) throws CustomerNotFound {
		boolean b = false;
		Customer customer = getCustomer(id);
		if (customer != null)
			b = customers.remove(customer);
		else {
			throw new CustomerNotFound("no customer existed with id");
		}
		return b;
	}

	@Override
	public List<Customer> getCustomers() {

		return customers;
	}

	private Customer getCustomer(int id) {
		Customer customer = null;
		for (Customer customer2 : customers) {
			if (id == customer2.getId()) {
				customer = customer2;
				break;
			}
		}
		return customer;
	}

}