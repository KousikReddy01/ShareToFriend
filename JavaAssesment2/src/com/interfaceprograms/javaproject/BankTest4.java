package com.interfaceprograms.javaproject;

public class BankTest4 {
	
	Bank b;

	public static void main(String[] args) {
		
		BankTest4 b1 = new BankTest4();
		b1.bankDetails("Canada");

	}
	
	void bankDetails(String bankName){
		
		if(bankName.equals("US")){
			b = new USBank();
		}else if(bankName.equals("UK")){
			b = new UKBank();
		}else if(bankName.equals("Canada")){
			b = new CanadaBank();
		}
		b.totalBalance();
		b.totalCustomers();
	}

}
