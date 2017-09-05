package com.hms.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hms.constants.Patient_Constant;
import com.hms.dao.PatientDao;
import com.hms.model.Patient;
import com.hms.rowmapper.PatientRowMapper;

@Repository
public class PatientDAOImpl implements PatientDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public List<Patient> allPatients() {
		return namedParameterJdbcTemplate.query(Patient_Constant.FETCH_SQL, new PatientRowMapper());
	}

	@Override
	public void createPatient() {
		
	}

	@Override
	public void updatePatient() {
		
	}

	@Override
	public void deletePatient() {
		
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
		return namedParameterJdbcTemplate.queryForObject(Patient_Constant.FETCH_SQL_BY_ID, parameter,new PatientRowMapper());
	}
}
