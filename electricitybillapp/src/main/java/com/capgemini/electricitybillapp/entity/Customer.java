package com.capgemini.electricitybillapp.entity;

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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String aadharnumber;
    private String firstname;
    private String middlename;
    private String lastname;
    private String moblienumber;
    private String email;
    private String username;
    private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_Id",referencedColumnName="userId")
    private User user;
}
