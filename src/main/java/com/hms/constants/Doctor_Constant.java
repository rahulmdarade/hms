package com.hms.constants;

public class Doctor_Constant {
	
	public static final String FETCH_SQL_BY_ID = "select * from Doctor where id = :id";
	public static final String FETCH_SQL_BY_NAME = "select * from Doctor where name = :name";
	public static final String FETCH_SQL = "select * from Doctor";
	public static final String INSERT_SQL = "insert into Doctor( name,designation,degree,experience,address,emailId,contactNumber)"
			+ " values(:name,:designation,:degree,:experience, :address, :emailId, :contactNumber)";
	public static final String UPDATE_SQL = "update Doctor set name=:name, designation=:designation,degree=:degree,experience=:experience,"
			+ "address=:address, emailId=:emailId, contactNumber=:contactNumber where id=:id";
	public static final String DELETE_SQL = "delete from Doctor where id=:id";
}
