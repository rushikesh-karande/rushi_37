package com.zs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.zs.entity.Customer;
import com.zs.service.CustomerServiceImpl;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	private CustomerServiceImpl service;
	
	@PostMapping(value="/save", consumes="application/json")
	public String postMethodName(@RequestBody Customer e) {
		service.save(e);
		return "person saved";
	}
	
	@GetMapping(value="/fetch", produces = "application/json")
	public Customer fetch(int id) {
		
		return service.fetch(id);
	}
	
	@GetMapping(value="/list", produces = "application/json")
	public List list() {
		return service.list();
	}
	
	@DeleteMapping(value = "/remove")
	public void remove(int id) {
		service.remove(id);
	}

}
