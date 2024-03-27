package com.abstractkeyword.javaproject;

public class AbsChildDemo1 extends AbsDemo1 {

	public AbsChildDemo1() {
		
		System.out.println("Cons of AbsChildDemo1");
		
	}

	public static void main(String[] args) {
		
		AbsChildDemo1  abc = new AbsChildDemo1();
		abc.funC();	

	}

	@Override
	void funA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void funB() {
		// TODO Auto-generated method stub
		
	}

}
