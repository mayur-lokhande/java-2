package strings;

public class MutableStringsExample {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Mayur");
		StringBuffer str2 = new StringBuffer("Rahul");
		
		str1.append("Lokhande");
		System.out.println(str1);
		str1.insert(5," ");
		System.out.println(str1);
		System.out.println("-----------------------");
		str2.append("Lokhande");
		System.out.println(str2);
		str2.insert(5," ");
		System.out.println(str2);
	}
}
