package co.edureka.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("no of participants = " + names.size());
		System.out.println("is names empty = " + names.isEmpty());
		System.out.println(names);
		
		names.add("Sunil");
		names.add("Abhilasha");
		names.add("Ahmad");
		names.add("Sunil");
		names.add("Assem");
		names.add("Avinash");
		names.add("Sunil");
		System.out.println(names + " | size= " + names.size());
		
		names.add(1, "Harshith");
		names.set(1, "HARSHISTH");
		System.out.println(names + " | size= " + names.size());
		
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) = " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(Sanjay) = " + names.indexOf("Sanjay"));
		System.out.println();
		
		System.out.println("person @ index 1 = " + names.get(1));
		//System.out.println("person @ index 8 = " + names.get(8)); //java.lang.IndexOutOfBoundsException
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(0)); //HARSHITH
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		System.out.println("is \"Ashwin\" in list = " + names.contains("Ashwin"));
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
	}
}
