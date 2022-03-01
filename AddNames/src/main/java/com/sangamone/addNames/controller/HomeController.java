package com.sangamone.addNames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangamone.addNames.model.Customer;
import com.sangamone.addNames.repository.CustomerRepo;


@Controller
public class HomeController {
	
	@Autowired
	CustomerRepo  customerRepo;
		
	@RequestMapping("/addNames")
	public String saveInfoNames(Customer customer) {
		//customerRepo.save(customer);
		return "addNames1.jsp";
		
	}

}
