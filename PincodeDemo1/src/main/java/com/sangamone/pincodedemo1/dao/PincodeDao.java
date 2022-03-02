package com.sangamone.pincodedemo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.pincodedemo1.model.Pincodes;

public interface PincodeDao extends JpaRepository<Pincodes, Integer>{

}
