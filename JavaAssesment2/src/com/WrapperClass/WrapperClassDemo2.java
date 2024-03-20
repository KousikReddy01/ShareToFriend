package com.WrapperClass;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		
		String actualAirMiles = "5000";
		int availableAirMiles = 4000;
		
//		if(availableAirMiles>=actualAirMiles){    // compile time Error because Comparison between String and int is not Possible.
//			System.out.println("Book the Ticket");
//		}else{
//			System.out.println("Air Miles are Insufficient");
//		}
		
		System.out.println(availableAirMiles);
		System.out.println(actualAirMiles);

	}

}
