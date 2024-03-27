package com.accessmodifiers.javaproject;

public class PrivateDemo2 {
	
	private PrivateDemo2(){
		
		System.out.println("Cons of PrivateDemo2");
		
	}
	
	private int a =10;
	private void funA(){
		
		System.out.println("Fun A of PrivateDemo2");
		
	}
	
	static void funB(){
		
		PrivateDemo2 p1 = new PrivateDemo2();
		p1.funA();
		System.out.println("Fun B of PrivateDemo2");
		System.out.println(p1.a);
	}

}
