package com.capgemini.electricitybillapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Connection;

public interface ConnectionDAO extends CrudRepository<Connection, Long>{

	public List<Connection> findByVillage(String villageName);

	public List<Connection> findAllById(String taluka);

	public List<Connection> findAllByDistrict(String districtName);

	public List<Connection> findAllByPincode(String pincode);

	public List<Connection> findAllByTaluka(String taluka);

	public List<Connection> findAllByVillage(String villageName);

	public List<Connection> findByDistrict(String districtName);

	public List<Connection> findByPincode(String pincode);

	public List<Connection> findByTaluka(String taluka);

}
