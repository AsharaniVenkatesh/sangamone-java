package com.sangamone.springsecurityappdemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController1 {
	
	@RequestMapping("/")
	public String getHome() {
		return "home.jsp";
	}

}
