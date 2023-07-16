package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,76,83,65,71,92,81};
		
		System.out.println(marks);
		System.out.println(Arrays.toString(marks));
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		/*--- array iteration using normal for loop ---*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for Subject-"+(i+1)+" = " + marks[i]);
		}
		System.out.println();
		
		/*--- array iteration using enhanced for loop (from Java 5/ JDK 1.5) ---*/
		System.out.print("marks obtained ------> ");
		for(int mark : marks) {
			System.out.print(mark + "      ");
		}
		System.out.println();
		
		System.out.println(marks[6]);
		System.out.println(marks[7]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
