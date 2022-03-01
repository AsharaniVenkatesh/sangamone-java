package com.sangamone.pincode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangamone.pincode.repository.PincodeRepo;

@Controller
public class PincodeController {
	
	@Autowired
	PincodeRepo pr;
	
	@RequestMapping("/getPincode")
	public String getPincode(Model model) {
		model.addAttribute("allpincodes", pr.findAll());
		return "pincode.jsp";
	}

}
