package com.capgemini.electricitybillapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricitybillapp.dao.ConnectionDAO;
import com.capgemini.electricitybillapp.dao.ReadingDAO;
import com.capgemini.electricitybillapp.entity.Reading;
@Service
public class ReadingServiceImpl implements ReadingService {
	@Autowired
	private ReadingDAO readingDAO;
	
	@Autowired
	private ConnectionDAO connectionDAO;
	@Override
	public Reading selfSubmitReading(Reading reading) {
	
		return readingDAO.save(reading);
	}

	@Override
	public Reading findMeterReadingByConsumerNumberAndBillDate(Long consumerId, LocalDate billDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reading> findMeterReadingByConsumerNumber(Long consumerNumber) {
		return connectionDAO.findMeterReadingByConsumerNumber(consumerNumber);
		
	}

}
