package co.edureka.java.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();

		System.out.println(names.add("Mark"));
		System.out.println(names.add("Mark"));
		System.out.println(names.add("Prakash"));
		names.add("Charles");
		names.add("Rahul");
		names.add("Sujith");
		names.add("Anil");
		
		System.out.println(names);
		System.out.println("no of participants = " + names.size());
		
		names.add(null);
		System.out.println(names);
	}

}
