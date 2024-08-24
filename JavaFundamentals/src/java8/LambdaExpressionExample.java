package java8;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java 8");
			}
		};
		runnable.run();
		
		Runnable runnableLambda=()->System.out.println("After Java 8");
		runnableLambda.run();
	}

}
