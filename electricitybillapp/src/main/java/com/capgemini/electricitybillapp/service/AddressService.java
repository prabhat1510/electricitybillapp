package com.capgemini.electricitybillapp.service;

import com.capgemini.electricitybillapp.entity.Address;

public interface AddressService {
	//CRUD
	public Address addAddress(Address address);
	public Address viewAddress(Long addressId);
	public Address updateAddress(Address address,Long addressId);
	public void deleteAddressById(Long addressId);
}
