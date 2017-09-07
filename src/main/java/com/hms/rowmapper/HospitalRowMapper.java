package com.hms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hms.model.Hospital;

@Component
public class HospitalRowMapper implements RowMapper<Hospital> {

//	@Autowired
	Hospital hospital=new Hospital();
	
	@Override
	public Hospital mapRow(ResultSet rs, int rowNum) throws SQLException {
		hospital.setId(rs.getLong(1));
		hospital.setAddress(rs.getString(2));
		hospital.setContactNumber(rs.getLong(3));
		hospital.setName(rs.getString(4));
		hospital.setWebsite(rs.getString(5));
		return hospital;
	}

}
