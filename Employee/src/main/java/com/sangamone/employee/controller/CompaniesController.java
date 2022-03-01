package com.sangamone.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sangamone.employee.model.Companies;

import com.sangamone.employee.repository.CompaniesRepos;





@RestController
public class CompaniesController {
	
	@Autowired
	CompaniesRepos companiesRepos;
	
	@GetMapping("/getCompanies")
	public List<Companies> getAllCompanies() {
		return companiesRepos.findAll();
	}

}
