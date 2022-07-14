package com.capgemini.electricitybillapp.service;

import java.util.List;

import com.capgemini.electricitybillapp.entity.Connection;
import com.capgemini.electricitybillapp.entity.Customer;

public interface ConnectionService {
	
	public Connection newConnectionRequest(Connection newConnection);
	public Customer searchCustomerByConsumerNumber(Long consumerNumber);
	public Connection modifyConnectionAddress(Connection connection);
	// suspend or activate connection
	public Connection modifyConnection(Connection connection);
	public List<Connection> findActiveConnectionsByVillage(String villageName);
	public List<Connection> findActiveConnectionsByTaluka(String taluka);
	public List<Connection> findActiveConnectionsByDistrict(String districtName);
	public List<Connection> findActiveConnectionsByPincode(String pincode);
	
	public List<Connection> findInactiveConnectionsByVillage(String villageName);
	public List<Connection> findInactiveConnectionsByTaluka(String taluka);
	public List<Connection> findInactiveConnectionsByDistrict(String districtName);
	public List<Connection> findInactiveConnectionsByPincode(String pincode);


}
