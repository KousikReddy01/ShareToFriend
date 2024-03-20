package com.inheritance.javaproject;

public class APGVBBank extends RBIBank{

	public static void main(String[] args) {
		
		APGVBBank ap = new APGVBBank();
		ap.cBillScore();
		ap.cropLoan();

	}
	
	void cropLoan(){
		System.out.println("Crop Loan of APGVBBank");
	}

}
