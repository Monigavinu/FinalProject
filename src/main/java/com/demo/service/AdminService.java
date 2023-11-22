package com.demo.service;

import java.util.List;

import com.demo.entity.MVMstaff;
import com.demo.entity.StaffDetails;

public interface AdminService {
	public abstract List<StaffDetails>findAll();
	public abstract StaffDetails findById(int theId);
	public abstract void save(MVMstaff theAdmin);
	public abstract void save(StaffDetails theAdmin);
	public abstract void deleteById(int theId);
	public abstract List<StaffDetails> findStaff();
	
}