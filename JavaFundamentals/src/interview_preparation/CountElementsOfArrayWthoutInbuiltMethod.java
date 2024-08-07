package interview_preparation;

public class CountElementsOfArrayWthoutInbuiltMethod {

	public static void main(String[] args) {
		//Integers
		int arr[]= {1,2,3,4,2,4,5};
		int count=0;
		
		for(int n:arr) {
			count++;
		}
		System.out.println(count);
		//String
		String str="JaiShreeRam";
		char charArray[]=str.toCharArray();
		int c=0;
		for(int n:charArray) {
			c++;
		}
		System.out.println(c);
	}

}
