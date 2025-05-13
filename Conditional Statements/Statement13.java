package com.conditional;

public class Statement13 {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		 char operator= '+';
		 int result;
		 switch(operator) {
		 case '+':
			 result=a+b;
			 System.out.println(result);
			 break;
		 case '-':
			 result=a-b;
			 System.out.println(result);
			 break;
		 case '*':
			 result=a*b;
			 System.out.println(result);
			 break;
		 case '%':
			 result=a%b;
			 System.out.println(result);
			 break;
		 case '/':
			 result=a/b;
			 System.out.println(result);
			 break;
			 default:
				 System.out.println("INVALID OPERATOR");
			 
		 }
		 
	}

}
