package com.inheritance.javaproject;

public class JavaProjectDemo2 {
	
	int a = 10;
	static String s1 = "RBG Technologies";

	public static void main(String[] args) {
		
		System.out.println("Main Method Start");
		
		JavaProjectDemo2 j = new JavaProjectDemo2();
		System.out.println(j);
		System.out.println("Done");

	}
	
	public String toString(){
		System.out.println("ToString Method of ToStringDemo2");
		return a+" "+s1;
	}

}
