package com.hms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hms.dao.impl.DoctorDAOImpl;
import com.hms.model.Patient;

@Component
public class PatientRowMapper implements RowMapper<Patient> {
	
	@Autowired
	DoctorDAOImpl doctorDao;
	
	@Override
	public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
		Patient patient=new Patient();
		patient.setId(rs.getLong(1));
		patient.setAddress(rs.getString(2));
		patient.setContactNumber(rs.getLong(3));
		patient.setDisease(rs.getString(4));
		patient.setEmailId(rs.getString(5));
		patient.setGender(rs.getString(6));
		patient.setName(rs.getString(7));
		patient.setDoctor(doctorDao.searchDoctorById(rs.getLong(8)));
		return patient;
	}
}
