package com.capgemini.electricitybillapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Reading;

public interface ReadingDAO extends CrudRepository<Reading, Long>{

}
