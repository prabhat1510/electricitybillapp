package com.capgemini.electricitybillapp.service;

import java.util.List;

import com.capgemini.electricitybillapp.entity.Customer;

public interface CustomerService {
	public Customer registerCustomer(Customer customer);
	public Customer viewCustomerProfie(Long customerId);
	public Customer editCustomerProfie(Customer customer ,Long customerId);
	public Customer searchCustomerByCustomerId(Long customerId);
	public Customer searchCustomerByEmail(String email);
	public Customer searchCustomerByAadhar(String aadhar);
	public Customer searchCustomerByMobile(String mobile);
	public List<Customer> searchCustomerByName(String customerName);
}
