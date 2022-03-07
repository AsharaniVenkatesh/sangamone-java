package com.sangamone.pincodedemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangamone.pincodedemo1.dao.PincodeDao;

@Controller
public class PincodeController {
	
	@Autowired
	PincodeDao pincodeDao;
	
	@RequestMapping("/pincodes")
	public String getPincode(Model model) {
		model.addAttribute("pincode", pincodeDao.findAll());
		return "pincode";
	}

}
