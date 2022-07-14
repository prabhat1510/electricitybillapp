package com.capgemini.electricitybillapp.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.electricitybillapp.constants.PaymentStatus;
import com.capgemini.electricitybillapp.entity.Payment;

public interface PaymentService {
	
	//CRUD
	public PaymentStatus payBill(PaymentStatus paymentstatus);
	public void sendEmailOnPaymentCompletion(Long consumerId, String email);
	public List<Payment> viewHistoricalPayment(Long consumerNumber);
	//PaymentStatus payBill(PaymentStatus paymentstatus);
	


}
