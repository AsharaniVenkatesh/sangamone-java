package com.sangamone.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangamone.employee.repository.EmployeeRepo;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@RequestMapping("/employee")
	public String getAllEmployee(Model model) {
		model.addAttribute("employee", employeeRepo.findAll());
		return "employeeAll.jsp";
	}
	
	@RequestMapping("/getPlace")
	public String getPlace(Model model, @RequestParam String place) {
		model.addAttribute("employee",employeeRepo.getPlaceName(place));
		return "getDisplay.jsp";
	}

}
