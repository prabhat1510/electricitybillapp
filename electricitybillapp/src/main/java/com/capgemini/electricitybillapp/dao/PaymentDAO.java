package com.capgemini.electricitybillapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Payment;

public interface PaymentDAO extends CrudRepository<Payment, Long>{

}
