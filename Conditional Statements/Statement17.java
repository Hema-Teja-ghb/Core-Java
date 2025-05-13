package com.conditional;

public class Statement17 {

	public static void main(String[] args) {
		String membership="silver";
		if(membership.equals("gold")||membership.equals("platinum")){
			System.out.println("Welcome to VIP Lounge");
		}
		else {
			System.out.println("NOt acess to vip lounge");
		}
	}

}
