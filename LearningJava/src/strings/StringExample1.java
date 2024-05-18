package strings;

public class StringExample1 {

	public static void main(String[] args) {
		String s1, s2;
		s1 = "Rama";
		s2 = s1;
		System.out.println(s1);// Rama
		System.out.println(s2);// Rama
		
		String str2=new String("mayur");
		String str1="mayur";
		System.out.println(str1==str2);
	}
}