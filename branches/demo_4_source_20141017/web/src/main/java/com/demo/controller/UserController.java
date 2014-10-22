package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.UsersModel;
import com.demo.service.UsersService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/list")
	public String getUser(ModelMap model){
		UsersModel users = usersService.find("root");
		return "login";
	}

}
