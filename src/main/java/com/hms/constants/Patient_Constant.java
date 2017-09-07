package com.hms.constants;

public class Patient_Constant {
	public static final String FETCH_SQL_BY_ID = "select * from Patient where patient_id = :id";
	public static final String FETCH_SQL_BY_NAME = "select * from Patient where name = :name";
	public static final String FETCH_SQL = "select * from Patient";
	public static final String INSERT_SQL = "insert into Patient(address,contact_number,disease,doctor_doctor_id,email_id,gender,name)"
			+ " values( :address, :contact_number, :disease, :doctor, :email_id, :gender, :name)";
	public static final String UPDATE_SQL = "update Patient set name=:name, address=:address,gender=:gender, "
			+ "disease=:disease,doctor_doctor_id=:doctor, email_id=:email_id, contact_number=:contact_number where patient_id=:id";
	public static final String DELETE_SQL = "delete from Patient where patient_id=:id";
}