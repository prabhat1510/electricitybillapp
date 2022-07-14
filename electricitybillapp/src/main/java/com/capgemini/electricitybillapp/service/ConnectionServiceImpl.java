package com.capgemini.electricitybillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.electricitybillapp.dao.ConnectionDAO;
import com.capgemini.electricitybillapp.dao.CustomerDAO;
import com.capgemini.electricitybillapp.entity.Connection;
import com.capgemini.electricitybillapp.entity.Customer;

public class ConnectionServiceImpl implements ConnectionService{

	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private ConnectionDAO connectionDAO;
	
	@Override
	public Connection newConnectionRequest(Connection newConnection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByConsumerNumber(Long consumerNumber) {
		Optional<Customer> customer = customerDAO.findByConsumerNumber(consumerNumber);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public Connection modifyConnectionAddress(Connection connection) {
		
		return connectionDAO.save(connection);
	}

	@Override
	public Connection modifyConnection(Connection connection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Connection> findActiveConnectionsByVillage(String villageName) {
		return connectionDAO.findByVillage(villageName);
	}

	@Override
	public List<Connection> findActiveConnectionsByTaluka(String taluka) {
		return connectionDAO.findByTaluka(taluka);
	}

	@Override
	public List<Connection> findActiveConnectionsByDistrict(String districtName) {
		return connectionDAO.findByDistrict(districtName);
	}

	@Override
	public List<Connection> findActiveConnectionsByPincode(String pincode) {
		return connectionDAO.findByPincode(pincode);
	}

	@Override
	public List<Connection> findInactiveConnectionsByVillage(String villageName) {
		return connectionDAO.findByVillage(villageName);
	}

	@Override
	public List<Connection> findInactiveConnectionsByTaluka(String taluka) {
		return connectionDAO.findByTaluka(taluka);
	}

	@Override
	public List<Connection> findInactiveConnectionsByDistrict(String districtName) {
		return connectionDAO.findByDistrict(districtName);
	}

	@Override
	public List<Connection> findInactiveConnectionsByPincode(String pincode) {
		return connectionDAO.findByPincode(pincode);
	}

}
