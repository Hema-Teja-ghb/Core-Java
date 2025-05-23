package com.constructors;

public class Profile {
	
	String name;
	int age;
	
	public Profile(String ne,int ae) {
		name=ne;
		age=ae;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		Profile p=new Profile("jithu",12);
		p.display();
		
	}

}
