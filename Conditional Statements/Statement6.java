package com.conditional;

public class Statement6 {

	public static void main(String[] args) {
		int time=12;
		if (time>=0 && time<=4) {
			System.out.println("MidNight");
		}else if(time>=5 && time<=11) {
			System.out.println("GOOD MORNING");
		}else if(time>=12 && time<=16) {
			System.out.println("GOOD AFTERNOON");
		}else if(time>=16 && time<=20) {
			System.out.println("GOOD EVENING");
		}else if(time>=21 &&time<=24) {
			System.out.println("GOOD NIGHT");
		}else {
			System.out.println("PLEASE CHECK THE TIME");
		}
		

	}

}
