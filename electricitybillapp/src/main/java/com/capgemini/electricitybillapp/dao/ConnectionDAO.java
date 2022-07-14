package com.capgemini.electricitybillapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Connection;

public interface ConnectionDAO extends CrudRepository<Connection, Long>{

}
