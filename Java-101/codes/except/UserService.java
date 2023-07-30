package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

class UserService {
	public String findUserById(int id) throws SQLException, IOException {
		// do some DB logic
		if (id == 101)
			return "Sanjay";
		return "Guest";
	}
}
