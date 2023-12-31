package co.edureka.java.threads;

public class MainThreadTest {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("no of threads = " + noOfThreads);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println();
		
		System.out.println("thread name = " + t.getName());
		System.out.println("thread priority = " + t.getPriority());
		ThreadGroup tgp = t.getThreadGroup();
		System.out.println(tgp);
		System.out.println();
		
		t.setName("edureka");
		//t.setPriority(10);
		t.setPriority(11); //java.lang.IllegalArgumentException
		System.out.println(t);
	}
}