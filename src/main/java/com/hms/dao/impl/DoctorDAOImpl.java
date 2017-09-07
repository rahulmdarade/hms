package com.hms.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.hms.constants.Doctor_Constant;
import com.hms.dao.DoctorDao;
import com.hms.model.Doctor;
import com.hms.rowmapper.DoctorRowMapper;

@Repository
public class DoctorDAOImpl implements DoctorDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	DoctorRowMapper doctorRowMapper;
	
	@Override
	public List<Doctor> allDoctors(){
		return namedParameterJdbcTemplate.query(Doctor_Constant.FETCH_SQL,doctorRowMapper);
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource parameters = new MapSqlParameterSource()
				.addValue("address", doctor.getAddress())
				.addValue("contact_number", doctor.getContactNumber())
				.addValue("degree", doctor.getDegree())
				.addValue("designation", doctor.getDesignation())
				.addValue("email_id", doctor.getEmailId())
				.addValue("experience", doctor.getExperience())
				.addValue("name", doctor.getName());
		namedParameterJdbcTemplate.update(Doctor_Constant.INSERT_SQL, parameters, holder);
		doctor.setId(holder.getKey().longValue());
		return doctor;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		KeyHolder holder=new GeneratedKeyHolder();
		SqlParameterSource parameter=new MapSqlParameterSource()
				.addValue("id", doctor.getId())
				.addValue("address",doctor.getAddress() )
				.addValue("contact_number", doctor.getContactNumber())
				.addValue("degree", doctor.getDegree())
				.addValue("designation",doctor.getDesignation())
				.addValue("email_id",doctor.getEmailId())
				.addValue("experience",doctor.getExperience())
				.addValue("name", doctor.getName());
		namedParameterJdbcTemplate.update(Doctor_Constant.UPDATE_SQL, parameter, holder);
		return doctor;
	}

	@Override
	public void deleteDoctor(long id) {
		Map<String, Long> parameter = new HashMap<>();
		parameter.put("id", id);
		namedParameterJdbcTemplate.update(Doctor_Constant.DELETE_SQL, parameter);
	}
	
	@Override
	public List<Map<String, Object>> searchDoctorByName(String name){
		Map<String, String> parameter = new HashMap<>();
		parameter.put("name", name);
		return namedParameterJdbcTemplate.queryForList(Doctor_Constant.FETCH_SQL_BY_NAME, parameter);
	}
	@Override
	public Doctor searchDoctorById(long id) {
		Map<String, Long> parameter = new HashMap<>();
		parameter.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(Doctor_Constant.FETCH_SQL_BY_ID, parameter,doctorRowMapper);
	}
}
