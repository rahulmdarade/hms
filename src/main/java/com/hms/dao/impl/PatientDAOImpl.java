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

import com.hms.constants.Patient_Constant;
import com.hms.dao.PatientDao;
import com.hms.model.Patient;
import com.hms.rowmapper.PatientRowMapper;

@Repository
public class PatientDAOImpl implements PatientDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	PatientRowMapper patientRowMapper;
	@Override
	public List<Patient> allPatients() {
		return namedParameterJdbcTemplate.query(Patient_Constant.FETCH_SQL, patientRowMapper);
	}
	
//	(address,contact_number,disease,email_id,gender,name)
	
	@Override
	public Patient createPatient(Patient patient) {
		KeyHolder holder=new GeneratedKeyHolder();
		SqlParameterSource parameter = new MapSqlParameterSource()
				.addValue("address", patient.getAddress())
				.addValue("contact_number", patient.getContactNumber())
				.addValue("disease", patient.getDisease())
				.addValue("email_id",patient.getEmailId())
				.addValue("gender",patient.getGender())
				.addValue("name", patient.getName())
				.addValue("doctor", patient.getDoctor().getId());
		namedParameterJdbcTemplate.update(Patient_Constant.INSERT_SQL, parameter, holder);
		patient.setId(holder.getKey().longValue());
		return patient;
	}

	@Override
	public void updatePatient(Patient patient) {
		KeyHolder holder=new GeneratedKeyHolder();
		SqlParameterSource parameter=new MapSqlParameterSource()
				.addValue("id", patient.getId())
				.addValue("address",patient.getAddress() )
				.addValue("contact_number", patient.getContactNumber())
				.addValue("disease", patient.getDisease())
				.addValue("email_id", patient.getEmailId())
				.addValue("gender",patient.getGender())
				.addValue("name", patient.getName())
				.addValue("doctor", patient.getDoctor().getId());
		namedParameterJdbcTemplate.update(Patient_Constant.UPDATE_SQL, parameter, holder);		
	}

	@Override
	public void deletePatient(long id) {
		Map<String, Long> parameter = new HashMap<>();
		parameter.put("id", id);
		namedParameterJdbcTemplate.update(Patient_Constant.DELETE_SQL, parameter);
	}
	@Override
	public List<Map<String, Object>> searchPatientByName(String name){
		Map<String, String> parameter = new HashMap<>();
		parameter.put("name", name);
		return namedParameterJdbcTemplate.queryForList(Patient_Constant.FETCH_SQL_BY_NAME, parameter);
	}
	@Override
	public Patient searchPatientById(long id) {
		Map<String, Long> parameter = new HashMap<>();
		parameter.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(Patient_Constant.FETCH_SQL_BY_ID, parameter,patientRowMapper);
	}
}
