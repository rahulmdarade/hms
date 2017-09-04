package com.hms.constants;

public class Hospital_Constant {
	public static final String FETCH_SQL = "select * from Hospital";
	public static final String INSERT_SQL = "insert into Hospital( name,address,website,contactNumber)"
			+ " values(:name, :address, :website, :contactNumber)";
	public static final String UPDATE_SQL = "update Hospital set name=:name, address=:address, "
			+ "website=:website, contactNumber=:contactNumber where id=:id";
	public static final String DELETE_SQL = "delete from Hospital where id=:id";
}
