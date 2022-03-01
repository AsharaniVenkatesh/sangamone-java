package com.sangamone.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.employee.model.Companies;

public interface CompaniesRepos extends JpaRepository<Companies, Integer> {

}
