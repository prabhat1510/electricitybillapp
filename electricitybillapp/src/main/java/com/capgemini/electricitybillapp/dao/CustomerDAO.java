package com.capgemini.electricitybillapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long>{
	public Optional<Customer> findByEmail(String email);
	public Optional<Customer> findByAadharnumber(String aadhar);
	public Optional<Customer> findByMoblienumber(String mobile);
	public List<Customer> findByFirstname(String firstName);
	public Optional<Customer> findByConsumerNumber(Long consumerNumber);
}
