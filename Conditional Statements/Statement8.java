package com.conditional;

public class Statement8{

	public static void main(String[] args) {
		int age=45;
		if(age<18) {
			System.out.println("MINOR");
		}else if(age>=18 && age<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("Old Age");
		}
	}
}
	

	


