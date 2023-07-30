package co.edureka.java.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/java/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/java/io/edureka.txt", true); //appending mode		
		
		String str = "Enroll in Edureka's certification courses & give your Tech career a much-needed boost.\n";
		
		byte[] b = str.getBytes(); //to convert a string to bytes
		
		fout.write(b);
		
		System.out.println("file saved!!!");
		
		fout.close();
	}

}
