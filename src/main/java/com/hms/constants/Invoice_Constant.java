package com.hms.constants;

public class Invoice_Constant {
	public static final String FETCH_SQL_BY_ID = "select * from Invoice where id = :id";
	public static final String FETCH_SQL = "select * from Invoice";
	public static final String INSERT_SQL = "insert into Invoice( patientId,doctorId,billId,totalAmount)"
			+ " values(:patientId, :doctorId, :billId, :totalAmount)";
	public static final String UPDATE_SQL = "update Invoice set patientId=:patientId, doctorId=:doctorId, "
			+ "billId=:billId, totalAmount=:totalAmount where id=:id";
	public static final String DELETE_SQL = "delete from Invoice where id=:id";
}
