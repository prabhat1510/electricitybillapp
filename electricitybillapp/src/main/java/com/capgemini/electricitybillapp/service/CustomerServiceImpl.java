package com.capgemini.electricitybillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricitybillapp.dao.CustomerDAO;
import com.capgemini.electricitybillapp.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public Customer registerCustomer(Customer customer) {

		return customerDAO.save(customer);
	}

	@Override
	public Customer viewCustomerProfie(Long customerId) {
		Optional<Customer> customer = customerDAO.findById(customerId);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public Customer editCustomerProfie(Customer customer, Long customerId) {
		Optional<Customer> customerData = customerDAO.findById(customerId);
		if (customerData.isPresent()) {
			Customer _customer = customerData.get();
			_customer.setAadharnumber(customer.getAadharnumber());
			_customer.setEmail(customer.getEmail());
			_customer.setFirstname(customer.getFirstname());
			_customer.setLastname(customer.getLastname());
			_customer.setMiddlename(customer.getMiddlename());
			_customer.setMoblienumber(customer.getMoblienumber());
			return customerDAO.save(_customer);
		} else {
			return null;
		}
	}

	@Override
	public Customer searchCustomerByCustomerId(Long customerId) {
		Optional<Customer> customer = customerDAO.findById(customerId);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public Customer searchCustomerByEmail(String email) {
		Optional<Customer> customer = customerDAO.findByEmail(email);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public Customer searchCustomerByAadhar(String aadhar) {
		Optional<Customer> customer = customerDAO.findByAadharnumber(aadhar);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public Customer searchCustomerByMobile(String mobile) {
		Optional<Customer> customer = customerDAO.findByMoblienumber(mobile);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public List<Customer> searchCustomerByName(String firstName) {
		
		return customerDAO.findByFirstname(firstName);
	}

}
