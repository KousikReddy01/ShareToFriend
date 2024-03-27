package com.abstractkeyword.javaproject;

public abstract class AbsDemo1 {

	public AbsDemo1() {
		
		System.out.println("Cons of ABSDemo1");
		
	}

	public static void main(String[] args) {
		
//		AbsDemo1 ab = new AbsDemo1();
//		ab.func();

	}
	
	abstract void funA();
	abstract void funB();
	
	void funC(){
		
		System.out.println("Fun C of AbsDemo1");
		
	}

}
