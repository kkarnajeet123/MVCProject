package com.vastika.uismp101.dao;

import java.util.List;

import com.vastika.uismp101.model.User;

public interface UserInfoDao {

	void saveUserInfo(User user);
	List <User> displayAllUsers();
	User getUserById(int id);
}
