package com.conditional;

public class Statement11 {

	public static void main(String[] args) {
		String str="@.";
		if(str.contains("@") && str.contains(".")) {
			System.out.println("Valid Email id");
		}else {
			System.out.println("Not Valid Email Id");
		}
			
	}

}
