package co.edureka.java.threads;

class Task1 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() method = " + t.getName().toUpperCase());
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println("thread in main() method = " + t.getName().toUpperCase());
		
		Runnable runObj = new Task1();
		Thread ct = new Thread(runObj);
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
