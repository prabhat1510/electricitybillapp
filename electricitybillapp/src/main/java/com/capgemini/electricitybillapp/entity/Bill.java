package com.capgemini.electricitybillapp.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;
	private LocalDate billDate;
	private LocalDate billDueDate;
	private Integer unitConsumed;
	private Integer billAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="reading_Id",referencedColumnName="readingId")
	private Reading reading;

}
