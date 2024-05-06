package multithreading;

class One extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hi:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Two extends Thread {
	public void run() {
		for (int j = 1; j <= 10; j++) {
			System.out.println("Hello:" + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ExampleTwo {

	public static void main(String[] args) {
		One obj1 = new One();
		obj1.start();

		Two obj2 = new Two();
		obj2.start();

	}
}