package com.hms.constants;

public class Hospital_Constant {
	public static final String FETCH_SQL = "select * from Hospital";
	public static final String INSERT_SQL = "insert into Hospital( address,contact_number,name,website)"
			+ " values(:address, :contact_number, :name, :website)";
	public static final String UPDATE_SQL = "update Hospital set name=:name, address=:address,website=:website, contact_number=:contact_number "
			+ "where id=:id";
	public static final String DELETE_SQL = "delete from Hospital where id=:id";
}
