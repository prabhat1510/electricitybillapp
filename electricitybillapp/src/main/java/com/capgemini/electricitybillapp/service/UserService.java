package com.capgemini.electricitybillapp.service;

import com.capgemini.electricitybillapp.entity.User;

public interface UserService {
	public User registerUser(User user);
	public User loginUser(User user);
	public void changePassword(User user);
	public void forgotPassword(String userName);
	public void emailPassword(String email);
	public User searchUserByUserName(String userName);
	public User searchUserByUserId(Long userId);
}
