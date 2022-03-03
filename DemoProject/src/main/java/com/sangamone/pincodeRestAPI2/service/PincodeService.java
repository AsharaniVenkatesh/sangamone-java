package com.sangamone.pincodeRestAPI2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.pincodeRestAPI2.model.Pincodes;
import com.sangamone.pincodeRestAPI2.repository.PincodesRepo;

@Service
public class PincodeService {
	
	@Autowired
	PincodesRepo prepo;
	
	//Get the keyword
	public List<Pincodes> findByKeyword(String keyword){
		return prepo.findByKeyword(keyword);
		
	}
	
	

}
