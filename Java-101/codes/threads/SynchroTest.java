package co.edureka.java.threads;

import java.util.concurrent.TimeUnit;

class Printer{
	synchronized public void printTable(int num) {
		for(int i=1; i<=5; i++) {
			int p = num * i;
			System.out.printf("%-2d x %2d = %2d\n", num, i, p);
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(Exception ex) {}
		}
		System.out.println("--------------------------------------------------------");
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(Exception ex) {}
	}
}


class Computer1Thread extends Thread{
	private Printer printer;
	private int n;
	
	public Computer1Thread(Printer printer, int n) {
		super();
		this.printer = printer;
		this.n = n;
	}

	@Override
	public void run() {
		printer.printTable(n);
	}	
}

class Computer2Thread extends Thread{
	private Printer printer;
	private int n;
	
	public Computer2Thread(Printer printer, int n) {
		super();
		this.printer = printer;
		this.n = n;
	}

	@Override
	public void run() {
		printer.printTable(n);
	}	
}

public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		Thread t1 = new Computer1Thread(printer, 5);
		Thread t2 = new Computer2Thread(printer, 6);
		
		t1.start();
		t2.start();
	}

}
