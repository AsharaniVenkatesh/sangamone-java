package com.sangamone.pincode6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sangamone.pincode6.entity.Pincode;

@Repository
public interface PincodeRepository extends CrudRepository<Pincode, Integer>{
	
	@Query(value="select * from allindiapincode where pincode=?1", nativeQuery=true)
	//@Query(value="select * from allindiapincode where office_name LIKE '%A%' ", nativeQuery=true)

	List<Pincode> getCityPincode(String pincode);

}
