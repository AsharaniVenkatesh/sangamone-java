package com.sangamone.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.employee.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query(value="select * from employee where place=?", nativeQuery=true)
	List<Employee> getPlaceName(String place);
}
