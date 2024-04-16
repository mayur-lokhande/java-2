package strings;

public class MutableStringsExample1 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity());// 16
		System.out.println(s.length());// 0
		
		s.append("Sachin");
		System.out.println(s.capacity());// 16
		System.out.println(s.length());// 6
		
		s.append(" is a great batsman.");
		System.out.println(s.capacity());// 16*2+2=34
		System.out.println(s.length());// 26
		
		s.append(" He is from india");
		System.out.println(s.capacity());// 34*2+2=70
		System.out.println(s.length());// 43
		
		StringBuffer str2 = new StringBuffer("Rahul");
		System.out.println(str2.capacity());//initial capacity 16 + passing argument of length 5=21
	}
}
