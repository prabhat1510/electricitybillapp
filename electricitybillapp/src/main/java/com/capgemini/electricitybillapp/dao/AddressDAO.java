package com.capgemini.electricitybillapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Address;

public interface AddressDAO extends CrudRepository<Address, Long>{

}
