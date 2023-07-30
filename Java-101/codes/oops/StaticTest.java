package co.edureka.java.oops;

public class StaticTest {
	static{
		System.out.println("inside static block");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");		
	}
	static {
		System.out.println("another static block");
	}
}