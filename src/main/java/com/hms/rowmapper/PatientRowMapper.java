package com.hms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hms.model.Patient;

public class PatientRowMapper implements RowMapper<Patient> {
	
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
		return patient;
	}

}
