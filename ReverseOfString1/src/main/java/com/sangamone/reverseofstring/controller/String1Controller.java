package com.sangamone.reverseofstring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangamone.reverseofstring.model.String1;
import com.sangamone.reverseofstring.repository.String1Repo;

@Controller
public class String1Controller {
	
	@Autowired
	String1Repo string1Repo;
	
	@RequestMapping("/getString")
	public String getString() {
		return "stringrev";
		}

}	
	
	
	