package com.hms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hms.constants.Hospital_Constant;
import com.hms.dao.HospitalDao;
import com.hms.model.Hospital;
import com.hms.rowmapper.HospitalRowMapper;

@Repository
public class HospitalDAOImpl implements HospitalDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	HospitalRowMapper hospitalRowMapper;
	@Override
	public List<Hospital> getHospital() {
		return namedParameterJdbcTemplate.query(Hospital_Constant.FETCH_SQL, hospitalRowMapper);
	}
}
