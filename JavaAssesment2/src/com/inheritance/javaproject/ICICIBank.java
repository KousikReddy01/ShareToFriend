package com.inheritance.javaproject;

public class ICICIBank extends RBIBank{
	
	ICICIBank(){
		System.out.println("Cons of ICICIBank");
	}

	public static void main(String[] args) {
		
		ICICIBank i = new ICICIBank();
		i.cBillScore();
		

	}

}
