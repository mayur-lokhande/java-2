package interview_questions;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Mayur";
		int length = str.length();//5
		System.out.println("Original String is:"+str);
		
		//declaring two character arrays
		char original[] = new char[length];
		char reverse[] = new char[length];

		//Converting original String to Character Array
		int i;
		for (i = 0; i < length; i++) {
			original[i] = str.charAt(i);
		}
		
		//iterating i from last index
		i = length - 1; //i=4
		int j = 0;
		while (i >= 0) {
			//adding characters of original from last index to reverse
			reverse[j] = original[i];
			i--;
			j++;
			/*
			 * reverse[0] = original[4];
			 * reverse[1] = original[3];
			 * reverse[2] = original[2];
			 * reverse[3] = original[1];
			 * reverse[4] = original[0];
			 * */
			
		}
		//converting character array to String
		String result=new String(reverse);
		System.out.println("Reversed String is:"+result);
		
		//By Using StringBuffer and StringBuilder
		//StringBuffer s=new StringBuffer(str);
		//StringBuilder s=new StringBuilder(str);
		//System.out.println(s.reverse());
		
	}

}