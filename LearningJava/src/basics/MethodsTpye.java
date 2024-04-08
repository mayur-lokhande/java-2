package basics;

public class MethodsTpye {
//	Method which accept parameters and has a return type
	public int add(int a, int b) {
		return a + b;
	}

//	Method which accept parameters but does not have a return type
	public void printMessage(String message) {
		System.out.println(message);
	}

//	Methods which do not accept the parameter but has return type
	public int getRandomNumber() {
		return (int) (Math.random() * 100);
	}

//	Methods which do not accept the parameter and does not have a return type
	public void greet() {
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		MethodsTpye mt = new MethodsTpye();
		System.out.println(mt.add(10, 20));
		mt.printMessage("Hello!");
		System.out.println(mt.getRandomNumber());
		mt.greet();
	}
}
