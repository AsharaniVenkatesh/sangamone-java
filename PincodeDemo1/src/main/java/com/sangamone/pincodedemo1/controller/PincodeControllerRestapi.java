package com.sangamone.pincodedemo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.pincodedemo1.dao.PincodeDao;
import com.sangamone.pincodedemo1.model.Pincodes;

@RestController
@RequestMapping("/api/pincodes")
public class PincodeControllerRestapi {
	
	@Autowired
	PincodeDao pRepo;
	
	@GetMapping
	public List<Pincodes> findAllPincodes(){
		return pRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pincodes> findByPincodes(@PathVariable (value="id") Integer id){
		
		Optional<Pincodes> pin=pRepo.findById(id);
		if(pin.isPresent()) {
			return ResponseEntity.ok().body(pin.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}

}
