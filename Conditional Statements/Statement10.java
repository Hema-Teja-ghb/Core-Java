package com.conditional;

public class Statement10 {

	public static void main(String[] args) {
		String Password="12";
		if(Password==null) {
			System.out.println("Null not Allowed");
		}else if(Password.isEmpty()){
			System.out.println("Empty is not allowed");
		}else if(Password.length()<8) {
			System.out.println("Password should contain 8 letters");
		}else {
			System.out.println("Valid Password");
		}
	}

}
