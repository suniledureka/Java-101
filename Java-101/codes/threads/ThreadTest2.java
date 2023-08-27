package co.edureka.java.threads;

class Task2 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() method = " + t.getName().toUpperCase());
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println("thread in main() method = " + t.getName().toUpperCase());		
		
		Thread ct = new Task2();
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
