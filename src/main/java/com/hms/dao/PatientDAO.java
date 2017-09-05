package com.hms.dao;

import java.util.List;
import java.util.Map;

import com.hms.model.Patient;

public interface PatientDao {
	public List<Patient> allPatients();
	public void createPatient();
	public void updatePatient();
	public void deletePatient();
	public List<Map<String, Object>> searchPatientByName(String name);
	public Patient searchPatientById(long id);
}
