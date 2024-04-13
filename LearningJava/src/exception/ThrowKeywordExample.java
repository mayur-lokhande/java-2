package exception;

class ClassA {
	public void A() {
		System.out.println("Inside A()");
		try{
			ClassB b = new ClassB();
			b.B();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside ClassA finally.");
		}
	}
}

class ClassB {
	public void B() {
		System.out.println("Inside B()");
		try {
			int a = 10 / 0;
			System.out.println(a);
			int arr[] = { 1, 2, 3, 4 };
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			throw e;
		} 
		catch(ArrayIndexOutOfBoundsException e){
			throw e;
		}
		finally {
			System.out.println("Inside ClassB finally.");
		}
	}
}

public class ThrowKeywordExample {

	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		ClassA a=new ClassA();
		a.A();
		System.out.println("Exited main normally.");
	}

}
