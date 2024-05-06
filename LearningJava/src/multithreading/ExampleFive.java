package multithreading;

class Counter {
	int count;

//	public void increment()
	// synchronized keyword is used to control access to critical sections of code
	// by allowing only one thread at a time to execute the synchronized block or
	// method on the same object.
	public synchronized void increment() {
		count++;
	}
}

public class ExampleFive {
	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();

		Runnable obj1 = () -> {
//    		for(int i=1;i<=1000;i++)
			for (int i = 1; i <= 10000; i++) {
				c.increment();
			}
		};

		Runnable obj2 = () -> {
//    		for(int i=1;i<=1000;i++)
			for (int i = 1; i <= 10000; i++) {
				c.increment();
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(c.count);
	}
}

//Thread States:
/*
 * - New State - Runnable State -> start() method - Running State -> a thead is
 * running with run() method - Waiting State -> sleep(), wait() method - Dead
 * State
 * 
 * Through notify(), you will go to waiting state to runnable state. From
 * Running, Runnable state to dead state through stop() method.
 */