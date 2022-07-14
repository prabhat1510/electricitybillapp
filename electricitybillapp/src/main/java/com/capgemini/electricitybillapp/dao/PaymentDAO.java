package com.capgemini.electricitybillapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.constants.PaymentStatus;
import com.capgemini.electricitybillapp.entity.Payment;

public interface PaymentDAO extends CrudRepository<Payment, Long>{

	public List<Payment> findByConsumerNumber(Long consumerNumber);
	
	public PaymentStatus createBill(PaymentStatus paymentstatus);

	public void findByConsumerIdAndEmail(Long consumerId, String email);

	//public PaymentStatus save(PaymentStatus paymentstatus);
}
