package com.capgemini.electricitybillapp.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.electricitybillapp.constants.ConnectionType;
import com.capgemini.electricitybillapp.entity.Bill;

public interface BillService {

	public Bill viewBillByConsumerNumber(Long consumerNumber);
	public Bill viewBillByMobileNumber(String mobile);
	public Bill viewBillByEmail(String email);
	public List<Bill> viewBillForDateRange(LocalDate from, LocalDate to);
	public double enrgeyBillCalculator(ConnectionType type, double unitsConsumed);
	public void emailBillToCustomer(Long consumerNumber, String email);

}
