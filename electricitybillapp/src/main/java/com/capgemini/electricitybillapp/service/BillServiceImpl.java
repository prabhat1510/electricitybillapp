package com.capgemini.electricitybillapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.electricitybillapp.constants.ConnectionType;
import com.capgemini.electricitybillapp.dao.BillDAO;
import com.capgemini.electricitybillapp.entity.Bill;

public class BillServiceImpl implements BillService{

	@Autowired
	private BillDAO billDAO;
	
	@Override
	public Bill viewBillByConsumerNumber(Long consumerNumber) {
		
		 Optional<Bill> bill =billDAO.findByConsumerNumber(consumerNumber);
		 if(bill.isPresent()) {
			 return bill.get();
		 }
		return null;
	}

	@Override
	public Bill viewBillByMobileNumber(String mobile) {
		Optional<Bill> bill =billDAO.findByMobileNumber(mobile);
		 if(bill.isPresent()) {
			 return bill.get();
		 }
		return null;
	}

	@Override
	public Bill viewBillByEmail(String email) {
		Optional<Bill> bill =billDAO.findByEmail(email);
		 if(bill.isPresent()) {
			 return bill.get();
		 }
		return null;
	}

	@Override
	public List<Bill> viewBillForDateRange(LocalDate from, LocalDate to) {
		return billDAO.viewBillForDateRange(from, to);
		
	}

	@Override
	public double enrgeyBillCalculator(ConnectionType type, double unitsConsumed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void emailBillToCustomer(Long consumerNumber, String email) {
		// TODO Auto-generated method stub
		
	}

}
