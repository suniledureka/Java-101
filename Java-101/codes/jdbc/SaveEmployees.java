package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection(); 
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno,ename,sal) values(102, 'Praveen', 2750.5), (103, 'Shankar',3000),"
				+ "(104, 'Bharath', 3250.75), (105, 'Charles', 3500)";
		
		int employeesSaved = st.executeUpdate(sql);
		
		System.out.println("employees saved = " + employeesSaved);
		
		st.close();
		con.close();
	}
}
