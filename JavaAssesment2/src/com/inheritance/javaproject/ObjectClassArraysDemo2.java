package com.inheritance.javaproject;

public class ObjectClassArraysDemo2 {

	public static void main(String[] args) {
		
		Object o[] = new Object[7];
		
		o[0] = new Object();
//		System.out.println(o[0]);
		
		o[1] = new RBIBank();
//  	System.out.println(o[1]);
		
		o[2] = new HDFCBank();
//		System.out.println(o[2]);
		
		o[3] = "RBG Technologies";
//		System.out.println(o[3]);
		
		o[4] = 10;
//		System.out.println(o[4]);
		
		o[5] = true;
//		System.out.println(o[5]);
		
		o[6] = 'R';
//		System.out.println(o[6]);
		
		for(int i=0; i<=o.length-1;i++){
			System.out.println(o[i]);
		}
		
		System.out.println(o[0]);
		System.out.println(o[1]);
		System.out.println(o[2]);
		System.out.println(o[3]);
		System.out.println(o[4]);
		System.out.println(o[5]);
		System.out.println(o[6]);
		

	}

}
