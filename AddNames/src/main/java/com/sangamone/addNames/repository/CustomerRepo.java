package com.sangamone.addNames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.addNames.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
