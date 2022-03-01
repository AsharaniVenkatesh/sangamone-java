package com.sangamone.pincode6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangamone.pincode6.repository.PincodeRepository;

@Controller
public class PincodeController {
	@Autowired
	PincodeRepository pincodeRepository;
	
	@RequestMapping("/pincode")
	public String getPincode(Model model) {
		model.addAttribute("pincode", pincodeRepository.findAll());
		return "Pincode.jsp";
	}
	
	@RequestMapping("/getCityName")
	public String getCityName(Model model,@RequestParam String pincode) {
		model.addAttribute("pincode", pincodeRepository.getCityPincode(pincode));
		return "cityName.jsp";
		
	}
	

}
