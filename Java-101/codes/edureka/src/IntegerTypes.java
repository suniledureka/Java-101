
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = -128;
		System.out.println(b);
		
		b = 24;
		System.out.println(b);
		
		b = 127;
		System.out.println(b);
		
		//b = 128; //error - Type mismatch: cannot convert from int to byte
		short s = 128;
		System.out.println(s);
		
		long pop = 2147483647;
		System.out.println("world population = " + pop);
		
		//pop = 2147483648; //The literal 2147483648 of type int is out of range
		pop = 2147483648L;
		System.out.println("world population = " + pop);
		
		int n = (int) 12L;
		System.out.println(n);
	}
}
