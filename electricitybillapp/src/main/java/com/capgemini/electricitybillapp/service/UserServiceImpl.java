package com.capgemini.electricitybillapp.service;

import org.springframework.stereotype.Service;

import com.capgemini.electricitybillapp.dao.UserDAO;
import com.capgemini.electricitybillapp.entity.User;
@Service
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void forgotPassword(String userName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void emailPassword(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public User searchUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUserByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
