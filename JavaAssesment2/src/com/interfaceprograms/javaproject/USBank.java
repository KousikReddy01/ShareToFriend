package com.interfaceprograms.javaproject;

public class USBank implements Bank{

	public static void main(String[] args) {
		

	}

	@Override
	public void totalBalance() {
		
		System.out.println("Total Balance of US Bank");
		
	}

	@Override
	public void totalCustomers() {
		
		System.out.println("Total Customers of US Bank");
		
	}

	@Override
	public void totalBranches() {
		
		System.out.println("Total Branches of US Bank");
		
	}
	
	void bankCode(){
		
		System.out.println("Method of Bank Code");
	}


}
