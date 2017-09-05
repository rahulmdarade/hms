package com.hms.constants;

public class Doctor_Constant {
	
	public static final String FETCH_SQL_BY_ID = "select * from Doctor where id = :id";
	public static final String FETCH_SQL_BY_NAME = "select * from Doctor where name = :name";
	public static final String FETCH_SQL = "select * from Doctor";
	public static final String INSERT_SQL = "insert into Doctor(address,contact_number,degree,designation,email_id,experience,name)"
			+ " values(:address,:contact_number,:degree,:designation, :email_id, :experience, :name)";
	public static final String UPDATE_SQL = "update Doctor set name=:name, designation=:designation,degree=:degree,experience=:experience,"
			+ "address=:address, email_id=:email_id, contact_number=:contact_number where id=:id";
	public static final String DELETE_SQL = "delete from Doctor where id=:id";
}
