package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping("/login")
	public String login(ModelMap model){
		return "login";
	}
	
	@RequestMapping("/login_failure")
	public String loginFailure(ModelMap model){
		return "login";
	}
	
}
