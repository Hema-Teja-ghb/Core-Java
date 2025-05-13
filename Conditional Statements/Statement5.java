package com.conditional;

public class Statement5 {

	public static void main(String[] args) {
		int a=85;
		if(a>=90) {
			System.out.println("A GRADE MARKS");
				
		}else if(a>=80 && a<=89)
		{
			System.out.println("B GRADE MARKS");
		}
		else if(a>=70 && a<=79) {
			System.out.println("C GRADE MARKS");
		}else if(a>=60 && a<=69) {
			System.out.println("D GRADE MARKS");
		}
		else {
			System.out.println("FAILED");
		}

	}

}
