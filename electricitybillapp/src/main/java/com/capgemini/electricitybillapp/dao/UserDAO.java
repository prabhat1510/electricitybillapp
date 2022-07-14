package com.capgemini.electricitybillapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.User;

public interface UserDAO extends CrudRepository<User, Long>{

}
