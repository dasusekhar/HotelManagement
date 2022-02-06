package com.example.demo.hotel.service;

import java.util.List;

import com.example.demo.hotel.entity.Customer;

public interface CustomerService {

List<Customer>  getAllCustomers();
	Customer saveCustomer(Customer customer);

}
