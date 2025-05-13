package com.conditional;

public class Statement19 {

	public static void main(String[] args) {
		float bmi=300;
		if(bmi<18.5) {
			System.out.println("Under Weight");
			}else if(bmi>=18.5 && bmi<=24.9) {
				System.out.println("Normal Weight");
			}else if(bmi>=25 && bmi<=29.9) {
				System.out.println("Over Weight");
			}else if(bmi>=30) {
				System.out.println("Obese");
			}else {
				System.out.println("check the data");
			}
		}

}
