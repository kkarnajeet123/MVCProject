package com.vastika.uismp101.service;

import java.util.List;

import com.vastika.uismp101.model.User;

public interface UserInfoService {
	
	void saveUserInfo(User user);
	List <User> displayAllUsers();
	User getUserById (int id);

}
