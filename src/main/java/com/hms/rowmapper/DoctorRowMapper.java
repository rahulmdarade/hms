package com.hms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hms.model.Doctor;
@Component
public class DoctorRowMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor = new Doctor();
		doctor.setId(rs.getLong(1));
		doctor.setAddress(rs.getString(2));
		doctor.setContactNumber(rs.getLong(3));
		doctor.setDegree(rs.getString(4));
		doctor.setDesignation(rs.getString(5));
		doctor.setEmailId(rs.getString(6));
		doctor.setExperience(rs.getInt(7));
		doctor.setName(rs.getString(8));
		return doctor;
	}

}
