package com.capgemini.electricitybillapp.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.capgemini.electricitybillapp.constants.ConnectionType;

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
public class Connection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int connetionId;
	private Long consumerNum;

	private LocalDate applicationDate;
	private LocalDate connectionDate;
	private boolean connectionStatus;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_Id",referencedColumnName="addressId")
	private Address address;
	
	private ConnectionType connectionType;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_Id",referencedColumnName="customerId")
	private Customer customer;
}
