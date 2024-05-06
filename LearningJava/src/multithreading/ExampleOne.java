package multithreading;

class ClassOne extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("i:"+i);
		}
	}
}

class ClassTwo extends Thread{
	public void run() {
		for(int j=1;j<=10;j++) {
			System.out.println("j:"+j);
		}
	}
}

public class ExampleOne {

	public static void main(String[] args) {
		ClassOne classOne=new ClassOne();
		classOne.start();
		
		ClassTwo classTwo=new ClassTwo();
		classTwo.start();
		
//		classOne.setPriority(Thread.MIN_PRIORITY); //1
//		classOne.setPriority(Thread.NORM_PRIORITY);//5
//		classOne.setPriority(Thread.MAX_PRIORITY); //10
		
		System.out.println(Thread.NORM_PRIORITY);
	}

}
