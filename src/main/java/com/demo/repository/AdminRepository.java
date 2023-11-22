package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.StaffDetails;

public interface AdminRepository extends JpaRepository<StaffDetails, Integer> {
	 @Query("from StaffDetails  where stfDept = 'Doctor'")
	 public List< StaffDetails> findStaff();

}