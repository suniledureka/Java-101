package co.edureka.java.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListIterations {

	public static void main(String[] args) throws Exception {
		List<Integer> marks = Arrays.asList(98,73,65,87,99,45,80);
		System.out.println(marks);
		
		iterate1(marks);
		Thread.sleep(2000);
		
		iterate2(marks);
		Thread.sleep(2000);
		
		iterate3(marks);
		Thread.sleep(2000);
		
		iterate4(marks);
		Thread.sleep(2000);
		
		iterate5(marks);
		Thread.sleep(2000);
		
		iterate6(marks);
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println(">>> iteration using a for loop and get() method - only for List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}

	private static void iterate2(List<Integer> marks) {
		System.out.println(">>> iteration using enhanced for loop");
		for(Integer n : marks) {
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}
	
	private static void iterate3(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}
	
	private static void iterate4(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.ListIterator - only for List implementations");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "       ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}	
	
	private static void iterate5(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}	
	
	private static void iterate6(List<Integer> marks) {
		System.out.println(">>> iteration using forEach(java.util.function.Consumer) method");
		/*
		marks.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + "       ");				
			}
			
		});
		*/
		//marks.forEach((Integer t) -> System.out.print(t + "       "));
		marks.forEach( t -> System.out.print(t + "       "));
		
		System.out.println("\n");
	}		
}
