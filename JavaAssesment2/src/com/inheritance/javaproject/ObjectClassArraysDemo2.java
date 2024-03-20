package com.inheritance.javaproject;

public class ObjectClassArraysDemo2 {

	public static void main(String[] args) {
		
		Object o[] = new Object[7];
		o[0] = new Object();
		o[1] = new RBIBank();
		o[2] = new HDFCBank();
		o[3] = "RBG Technologies";
		o[4] = 10;
		o[5] = true;
		o[6] = 'R';
//		
//		for(int i=0; i<=o.length-1;i++){
//			System.out.println(o[i]);
//		}
		
		System.out.println(o[0]);
		System.out.println(o[1]);
		System.out.println(o[2]);
		System.out.println(o[3]);
		System.out.println(o[4]);
		System.out.println(o[5]);
		System.out.println(o[6]);

	}

}
