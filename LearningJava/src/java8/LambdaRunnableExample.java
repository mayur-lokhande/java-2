package java8;

class ThreadExample implements Runnable {

	@Override
	public void run() {
		System.out.println("run() method called by implementing runnable interface");
	}

}

public class LambdaRunnableExample {

	public static void main(String[] args) {
		// thread without lambda
		Thread t = new Thread(new ThreadExample());
		t.start();

		// thread using lambda expression
		Runnable runnable = () -> System.out.println("run() method called using lambda expression");
		Thread thread = new Thread(runnable);
		thread.start();

	}

}