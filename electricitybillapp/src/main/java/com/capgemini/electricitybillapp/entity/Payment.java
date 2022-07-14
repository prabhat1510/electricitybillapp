package com.capgemini.electricitybillapp.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.capgemini.electricitybillapp.constants.PaymentMode;
import com.capgemini.electricitybillapp.constants.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	private Long paymentId;
	private LocalDate paymentDate;
	private double latePaymentCharges;
	private double totalPaid;
	private PaymentStatus status;
	private PaymentMode mode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bill_Id",referencedColumnName="billId")
	private Bill bill;
}
