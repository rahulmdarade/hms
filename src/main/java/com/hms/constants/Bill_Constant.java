package com.hms.constants;

public class Bill_Constant {
		public static final String FETCH_SQL_BY_ID = "select * from Bill where bill_id = :id";
		public static final String FETCH_SQL = "select * from Bill";
		public static final String INSERT_SQL = "insert into Bill( particular,quantity,unitValue)"
				+ " values(:particular, :quantity, :unitValue)";
		public static final String UPDATE_SQL = "update Bill set particular=:particular, quantity=:quantity, "
				+ "unitValue=:unitValue where bill_id=:id";
		public static final String DELETE_SQL = "delete from Bill where bill_id=:id";

}
