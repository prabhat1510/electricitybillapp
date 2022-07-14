package com.capgemini.electricitybillapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Bill;

public interface BillDAO extends CrudRepository<Bill, Long>{

}
