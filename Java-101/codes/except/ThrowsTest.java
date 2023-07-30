package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uService = new UserService();
		int id = 102;
		try {
			String userName = uService.findUserById(id);
			System.out.println("Hello "+ userName);
		}catch(SQLException | IOException ex) {
			System.out.println(ex);
		}	
		
		System.out.println("please wait for 5 seconds....");
		Thread.sleep(5000); //5000ms - 5 seconds
		System.out.println("thanks for waiting");
	}

}
