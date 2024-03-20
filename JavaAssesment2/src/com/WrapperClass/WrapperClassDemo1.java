package com.WrapperClass;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		
		int a = 10;
		Integer i1 = new Integer(a);
		int b = i1.intValue();
		System.out.println(b);
		
		Integer i2 = 20;
		int c = i2;
		System.out.println(c);
		

	}

}
