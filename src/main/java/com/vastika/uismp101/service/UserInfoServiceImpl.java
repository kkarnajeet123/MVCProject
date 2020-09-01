package com.vastika.uismp101.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vastika.uismp101.dao.UserInfoDao;
import com.vastika.uismp101.model.User;

public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private UserInfoDao userinfodao;
	@Override
	public void saveUserInfo(User user) {
		userinfodao.saveUserInfo(user);
		
	}

	@Override
	public List<User> displayAllUsers() {
		
		return userinfodao.displayAllUsers();
	}

	@Override
	public User getUserById(int id) {
		
		return userinfodao.getUserById(id);
	}



}
