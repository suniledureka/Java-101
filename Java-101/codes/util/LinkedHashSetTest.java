package co.edureka.java.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();

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