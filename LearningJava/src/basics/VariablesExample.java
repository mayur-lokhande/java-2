package basics;

public class VariablesExample {
int number; //Instance Variable
static float i; //Static Variable
	public static void main(String[] args) {
		int numOne=34; //Local Variable
		System.out.println(numOne); //local variables do not have default values
		
		VariablesExample v=new VariablesExample();
		System.out.println(v.number); //instance variable can have default values
		System.out.println(v.i); //static variable also can have default values
	}

}
