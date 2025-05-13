package com.conditional;

public class Statement7 {

	public static void main(String[] args) {
		int age=19;
		boolean isHavingLicense=true;
		if(age>=18) {
			if(isHavingLicense) {
				System.out.println("VERIFICATION SUCESS");
			}else {
				System.out.println("VERIFICATION FAILED");
			}
		}else {
			System.out.println("Still Minor");
		}

	}

}
