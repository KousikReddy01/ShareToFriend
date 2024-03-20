package com.inheritance.javaproject;

public class AXISBank extends RBIBank{
	
	int minBalance = 5000;
	
	AXISBank(){
		System.out.println("cons of AxisBank");
	}

	public static void main(String[] args) {
		
		RBIBank r = new AXISBank();      //UpCasting
		r.cBillScore();
		
//		System.out.println(r.minBalance);    //Compile time errors because parent class access to the child class is not possible.
//		r.personalLoan();

	}
	
	void cBillScore(){
		System.out.println("CBillScore of AXISBank is 780");
	}
	
	void personalLoan(){
		System.out.println("Personal Loan of AXISBank");
	}

}
