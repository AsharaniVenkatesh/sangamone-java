package com.sangamone.pincodeRestAPI2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangamone.pincodeRestAPI2.repository.PincodesRepo;
import com.sangamone.pincodeRestAPI2.service.PincodeService;

@Controller
public class PincodeController {
	
	@Autowired 
	PincodesRepo prepo;
	
	@Autowired
	PincodeService pservice;
	
	@RequestMapping("/pincodes")
	public String getPincode(Model model, String keyword) {
		if(keyword != null) {
			model.addAttribute("pincode",pservice.findByKeyword(keyword));
			
		}
		else {
		model.addAttribute("pincode",prepo.findAll());
		}
		
		return "pincode.jsp";
	}

}
