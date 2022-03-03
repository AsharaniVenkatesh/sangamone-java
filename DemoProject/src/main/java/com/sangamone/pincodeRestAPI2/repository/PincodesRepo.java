package com.sangamone.pincodeRestAPI2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sangamone.pincodeRestAPI2.model.Pincodes;

@Repository
public interface PincodesRepo extends JpaRepository<Pincodes, Integer> {
	
	@Query(value = "select * from pincode11 e where e.officename like %:keyword%", nativeQuery=true)
	List<Pincodes> findByKeyword(@Param("keyword") String keyword);

}
