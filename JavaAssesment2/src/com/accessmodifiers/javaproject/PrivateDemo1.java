package com.accessmodifiers.javaproject;

public class PrivateDemo1 {
	
	private int a =10;
	private void funA(){
		
		System.out.println("Fun A of PrivateDemo1");
		
	}
	
	void funB(){
		
		System.out.println("Fun B of PrivateDemo1");
		funA();
		System.out.println(a);
	}

}
