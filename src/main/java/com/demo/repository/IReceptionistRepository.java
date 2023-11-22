
package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;

public interface IReceptionistRepository extends JpaRepository<PatientDetails, Integer> {
	
}
