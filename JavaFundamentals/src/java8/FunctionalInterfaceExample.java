package java8;

@FunctionalInterface
interface Addition {
	int add(int a, int b);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Addition addition= (a,b)->a+b;
		int result=addition.add(12, 34);
		System.out.println("Addition is: "+result);
	}

}
