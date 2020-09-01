package com.vastika.uismp101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vastika.uismp101.model.User;
import com.vastika.uismp101.service.UserInfoService;

public class UserInfoController {
	@Autowired
	private UserInfoService userinfoService;
	
	@RequestMapping (value={"/","/home"})
	public String displayHome() {
		
		return "Home";
	}

	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user, Model model, BindingResult result) {
		
		userinfoService.saveUserInfo(user);
		
		return"createlist";
	}
	
	@RequestMapping(value="/displaylist")
	public String displayUserList( Model model) {
		
		model.addAttribute("users",userinfoService.displayAllUsers());
		
		return "userlist";
		
	}
	
	
	
}
