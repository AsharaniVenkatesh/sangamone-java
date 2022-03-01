package com.sangamone.pincode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.pincode.model.Pincode;

public interface PincodeRepo extends JpaRepository<Pincode, Integer> {

}
