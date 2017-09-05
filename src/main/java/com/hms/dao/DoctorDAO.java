package com.hms.dao;

import java.util.List;
import java.util.Map;

import com.hms.model.Doctor;

public interface DoctorDao {
	public List<Doctor> allDoctors();
	public Doctor createDoctor(Doctor doctor);
	public void updateDoctor();
	public void deleteDoctor();
	public List<Map<String, Object>> searchDoctorByName(String name);
	public Doctor searchDoctorById(long id);
	
}
