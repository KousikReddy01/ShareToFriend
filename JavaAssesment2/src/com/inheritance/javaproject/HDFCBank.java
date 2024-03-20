package com.inheritance.javaproject;

public class HDFCBank extends RBIBank{

	public static void main(String[] args) {
		HDFCBank h = new HDFCBank();
		h.cBillScore();

	}
	
	void cBillScore(){
		System.out.println("CBillScore of HDFCBank is 750");
	}

}
