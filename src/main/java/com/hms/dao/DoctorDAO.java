package com.hms.dao;

import java.util.List;

import com.hms.model.Doctor;

public interface DoctorDao {
	public List<Doctor> allDoctors();
	public void createDoctor();
	public void updateDoctor();
	public void deleteDoctor();
}
