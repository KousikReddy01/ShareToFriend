package com.interfaceprograms.javaproject;

public class BankTest2 {

	public static void main(String[] args) {
		
		Bank b1 = new USBank();
		b1.totalBalance();
		b1.totalCustomers();
		b1.totalBranches();
		
		Bank b2 = new UKBank();
		b2.totalBalance();
		b2.totalCustomers();
		b2.totalBranches();
		
		Bank b3 = new CanadaBank();
		b3.totalBalance();
		b3.totalCustomers();
		b3.totalBranches();

	}

}
