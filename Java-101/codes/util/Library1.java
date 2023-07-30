package co.edureka.java.util;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Library1 {

	public static void main(String[] args) {
		List<Book> library = Arrays.asList(
				new Book(100001, "Python"),
				new Book(100002, "Microsoft"),
				new Book(100003, "Java"),
				new Book(100004, "React")
			);
	
		displayLibraryStock(library);
	}

	private static void displayLibraryStock(List<Book> library) {
		//library.forEach(bk -> System.out.println(bk));		
		library.forEach(bk -> {
				System.out.println(bk);
				try {
					TimeUnit.SECONDS.sleep(2); //Thread.sleep(2000);
				}catch(Exception ex) {}
			});
	}

}
