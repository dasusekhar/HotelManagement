package com.example.demo.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.hotel.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
