package impConcepts;

public class OperatorsExample {
	public static void main(String[] args) {
		//Unary Operators
		int x=10;
		int y=20;
		System.out.println(x++ + ++x); // 10+12=22
		System.out.println(y-- + --y); // 20+18=38
		int a1=10;
		int b1=-10;
		System.out.println(~a1); //
		System.out.println(~b1);
		System.out.println(!false);
		
		//Arithmetic Operators
		int a=10;
		int b=6;
		System.out.println(a+b); //10+6=16
		System.out.println(a-b); //10-6=4
		System.out.println(a*b); //10*6=60
		System.out.println(a/b); //10/6=1 return quotient
		System.out.println(a%b); //10%6=4 return reminder
		System.out.println(10*10/5+3-1*4/2);// 21 (/ -> * -> + -> -)
		
		//Shift operator
		//Left Shift
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80 
		//Right Shift
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(15>>3);//15/2^3=15/8=1
		
		//Logical operators
		int aa=10,bb=5,cc=20;
		//The logical && operator doesn't check the second condition if the first condition is false. 
		//It checks the second condition only if the first one is true.
		System.out.println(aa<bb&&aa++<cc);//false && true = false
		System.out.println(aa);//10 because second condition is not checked
		
		int aaa=10,bbb=5,ccc=20;
		//The logical || operator doesn't check the second condition if the first condition is true. 
		//It checks the second condition only if the first one is false.
		System.out.println(aaa>bbb||aaa++<ccc);//true || true = true
		System.out.println(aaa);//10 because second condition is not checked
		
		//Bitwise operators
		int num1=10,num2=15,num3=20;
		//The bitwise & operator always checks both conditions whether first condition is true or false.
		System.out.println(num1>num2&num1++<num3);//false && true = false
		System.out.println(num1);//11 because second condition is checked
		
		int n=10,m=15,l=20;
		//The bitwise | operator always checks both conditions whether first condition is true or false.
		System.out.println(n>m|n++<l);//true | true = true  
		System.out.println(n);//11 because second condition is checked
		
		//Ternary Operator
		int num=254;
		String result=num%2==0?"Even Number":"Odd Number";
		System.out.println(result);
		
		//Assignment operator
		int p=10;  
		int q=20;  
		p+=4;//p=p+4 (p=10+4)  
		q-=4;//q=q-4 (q=20-4)  
		System.out.println(p);
		System.out.println(q);
	}
}
