package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.entity.Customer;
import com.zs.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	@Override
	public void save(Customer c) {
		repo.save(c);
	}
	
	@Override
	public Customer fetch(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<Customer> list() {
		return repo.findAll();
	}
	
	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}
	

}
