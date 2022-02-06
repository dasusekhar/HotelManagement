package com.example.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.hotel.entity.Customer;
import com.example.demo.hotel.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/customers")
	public String listCustomers(Model model)
	{
		model.addAttribute("customer",customerService.getAllCustomers());
		return "customers";
	}
	@GetMapping("/customers/new")
	public String createCustomerForm(Model model)
	{
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "create_customer";
	}
	@PostMapping("/customers")
	public String saveCustomer(@ModelAttribute("customer") Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/customers";
		
	}
	

}
