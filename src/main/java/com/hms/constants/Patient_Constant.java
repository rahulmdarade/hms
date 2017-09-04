package com.hms.constants;

public class Patient_Constant {
	public static final String FETCH_SQL_BY_ID = "select * from Patient where id = :id";
	public static final String FETCH_SQL_BY_NAME = "select * from Patient where name = :name";
	public static final String FETCH_SQL = "select * from Patient";
	public static final String INSERT_SQL = "insert into Patient( name,address,gender,disease,emailId,contactNumber)"
			+ " values(:name, :address,:gender,:disease, :emailId, :contactNumber)";
	public static final String UPDATE_SQL = "update Patient set name=:name, address=:address,gender=:gender, "
			+ "disease=:disease, emailId=:emailId, contactNumber=:contactNumber where id=:id";
	public static final String DELETE_SQL = "delete from Patient where id=:id";
}
