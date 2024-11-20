package com.zs.service;

import java.util.List;

import com.zs.entity.Customer;

public interface CustomerService {
	
	public void save(Customer c);
	
	public Customer fetch(int id);
	
	public List<Customer> list();
	
	public void remove(int id);

}
