package com.capgemini.electricitybillapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricitybillapp.dao.AddressDAO;
import com.capgemini.electricitybillapp.entity.Address;
@Service 
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDAO addressDao;
	
	@Override
	public Address addAddress(Address address) {
			
		return addressDao.save(address);
	}

	@Override
	public Address viewAddress(Long addressId) {
		 Optional<Address> address = addressDao.findById(addressId);
		 if(address.isPresent()) {
			 return address.get();
		 }
		return null;
	}

	@Override
	public Address updateAddress(Address address, Long addressId) {
		Optional<Address> addressData = addressDao.findById(addressId);
		if (addressData.isPresent()) {
			Address _addres = addressData.get();
			_addres.setBuildingName(address.getBuildingName());
			_addres.setDistrict(address.getDistrict());
			_addres.setFlatOrHouseNumber(address.getFlatOrHouseNumber());
			_addres.setLandmark(address.getLandmark());
			_addres.setPincode(address.getPincode());
			_addres.setState(address.getState());
			_addres.setTaluka(address.getTaluka());
			_addres.setVillage(address.getVillage());
			return addressDao.save(_addres);
		}else {
				return null;
			}
	}

	@Override
	public void deleteAddressById(Long addressId) {
		addressDao.deleteById(addressId);

	}

}
