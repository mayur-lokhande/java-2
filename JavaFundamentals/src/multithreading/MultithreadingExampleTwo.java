package multithreading;

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running.");
		}
	}

}

public class MultithreadingExampleTwo {

	public static void main(String[] args) {
		Runnable obj=new A();
		
		Thread t1=new Thread(obj);
		t1.start();

	}

}
