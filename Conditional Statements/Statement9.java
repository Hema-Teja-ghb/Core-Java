package com.conditional;

public class Statement9 {

	public static void main(String[] args) {
		boolean user=true;
		boolean login=false;
		boolean premium=true;
		if(user) {
			if(login && premium) {
				System.out.println("Eligible for Premium Content");
			}else if(login) {
				System.out.println("Subscribe for Premium");
			}else {
				System.out.println("Invalid Credentials");
			}
		}else {
			System.out.println("Create Account");
				
			}
				
			}
		}

	


