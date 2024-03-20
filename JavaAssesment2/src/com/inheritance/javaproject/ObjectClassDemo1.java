package com.inheritance.javaproject;

public class ObjectClassDemo1 {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		System.out.println(o1);
		
		Object o2 = new RBIBank();
		System.out.println(o2);
		
		Object o3 = new HDFCBank();
		System.out.println(o3);
		
		Object o4 = new AXISBank();
		System.out.println(o4);
		
		Object o5 = "Testing Classes";
		System.out.println(o5);
		
		Object o6 = 10;
		System.out.println(o6);
		
		Object o7 = true;
		System.out.println(o7);
		
		Object o8 = 'K';
		System.out.println(o8);

	}

}
