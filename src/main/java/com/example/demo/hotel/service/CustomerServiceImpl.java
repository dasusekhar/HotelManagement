package com.example.demo.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.entity.Customer;
import com.example.demo.hotel.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}
	

}
