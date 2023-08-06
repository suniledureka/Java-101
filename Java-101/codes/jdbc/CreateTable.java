package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//-- initialize JDBC Driver of MySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to db_edureka MySQL database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create an object for passing SQL query
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno int, ename varchar(30), sal float(10,2), primary key(empno))";
		
		//-- pas the sql query
		try {
			st.execute(sql);
			System.out.println("Database Table Created!!");
		}catch(Exception ex) {
			System.err.println("ERROR: " + ex.toString());
		}
		
		//-- close the connection with database
		st.close();
		con.close();
	}
}
