package com.capgemini.electricitybillapp.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.electricitybillapp.entity.Bill;

public interface BillDAO extends CrudRepository<Bill, Long>{

	public Optional<Bill> findByConsumerNumber(Long consumerNumber);

	public List<Bill> viewBillForDateRange(LocalDate from, LocalDate to);

	public Optional<Bill> findByEmail(String email);

	public Optional<Bill> findByMobileNumber(String mobile);

}
