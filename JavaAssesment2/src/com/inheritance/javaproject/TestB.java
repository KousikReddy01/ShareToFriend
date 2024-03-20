package com.inheritance.javaproject;

public class TestB extends TestA{

	public static void main(String[] args) {
		
		TestB t1 = new TestB();
		t1.funA();
		
		TestA t2 = new TestA();
		t2.funA();

	}

}
