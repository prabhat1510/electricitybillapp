package com.capgemini.electricitybillapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricitybillapp.constants.PaymentStatus;
import com.capgemini.electricitybillapp.dao.PaymentDAO;
import com.capgemini.electricitybillapp.entity.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentDAO paymentDao;
	

	@Override
	public PaymentStatus payBill(PaymentStatus paymentstatus) {
		
		//return paymentDao.save(payment);
	 
		return paymentDao.createBill(paymentstatus);
	}

	@Override
	public void sendEmailOnPaymentCompletion(Long consumerId, String email) {
		
		paymentDao.findByConsumerIdAndEmail(consumerId, email);
	}

	@Override
	public List<Payment> viewHistoricalPayment(Long consumerNumber) {
		
		return paymentDao.findByConsumerNumber(consumerNumber);
	}
}
