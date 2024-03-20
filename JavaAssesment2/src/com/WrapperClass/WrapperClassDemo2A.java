package com.WrapperClass;

public class WrapperClassDemo2A {

	public static void main(String[] args) {
		
		String actualAirMiles = "5000";
		int airMiles = Integer.parseInt(actualAirMiles);
		
		int availableAirMiles = 4000;
		
		if(availableAirMiles>=airMiles){    
			System.out.println("Book the Ticket");
		}else{
			System.out.println("Air Miles are Insufficient");
		}
		

	}

}
