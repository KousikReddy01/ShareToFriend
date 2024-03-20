package com.inheritance.javaproject;

public class DCBBank {
	
	DCBBank(){
	
		System.out.println("Cons of DCBBank");
	}

	public static void main(String[] args) {
		
		RBIBank r = new RBIBank();
		r.cBillScore();
		
		DCBBank d = new DCBBank();
		d.cropLoan();

	}
	
	void cropLoan(){
		System.out.println("Crop Loan of DCBBank");
	}

}
