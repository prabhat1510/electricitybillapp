package com.capgemini.electricitybillapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricitybillapp.dao.CustomerDAO;
import com.capgemini.electricitybillapp.dao.UserDAO;
import com.capgemini.electricitybillapp.entity.Customer;
import com.capgemini.electricitybillapp.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	public User registerUser(User user) {
		return userDAO.save(user);
	}

	@Override
	public User loginUser(User user) {
		Optional<User> userData = userDAO.findByUserName(user.getUserName());
		if(userData.isPresent()) {
			if( (userData.get().getPassword()).equals(user.getPassword())) {
				return userData.get();
			}
		}
		return null;
	}

	@Override
	public void changePassword(User user) {
		Optional<User> userData = userDAO.findById(user.getUserId());
		if (userData.isPresent()) {
			User _user = userData.get();
			_user.setPassword(user.getPassword());
			userDAO.save(_user);
		}		

	}

	@Override
	public String forgotPassword(String userName) {
		Optional<User> user = userDAO.findByUserName(userName);
		if(user.isPresent()) {
			return user.get().getPassword();
		}
		return null;
	}

	@Override
	public String emailPassword(String email) {
		Optional<Customer> customer = customerDAO.findByEmail(email);
		if(customer.isPresent()) {
			if(customer.get().getPassword()!= null) {
				return "Password emailed to your registered email id ";
			}
		}
		return "Password doesn't exists";
	}

	@Override
	public User searchUserByUserName(String userName) {
		 Optional<User> user = userDAO.findByUserName(userName);
		 if(user.isPresent()) {
			 return user.get();
		 }
		return null;
	}

	@Override
	public User searchUserByUserId(Long userId) {
		 Optional<User> user = userDAO.findById(userId);
		 if(user.isPresent()) {
			 return user.get();
		 }
		return null;
	}

}
