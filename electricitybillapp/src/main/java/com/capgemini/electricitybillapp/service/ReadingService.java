package com.capgemini.electricitybillapp.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.electricitybillapp.entity.Reading;

public interface ReadingService {
	public Reading selfSubmitReading(Reading reading);
	public Reading findMeterReadingByConsumerNumberAndBillDate(Long consumerId,LocalDate billDate);
	public List<Reading> findMeterReadingByConsumerNumber(Long consumerId);
}
