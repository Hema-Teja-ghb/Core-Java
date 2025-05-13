package com.conditional;

public class Statement18 {

	public static void main(String[] args) {
		int year=1800;
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println("It is a Leap Year");
			
		}else {
			System.out.println("It is not a Leap Year");
		}
	}

}
