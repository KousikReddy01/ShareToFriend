package com.WrapperClass;

public class WrapperClassDemo3 {

	public static void main(String[] args) {
		
		String actualTicketPrice = "$5,000";
		String ticketPrice = actualTicketPrice.replace("$","");
		String price = ticketPrice.replace(",","");
//		System.out.println(price);
		
		int bookingPrice = Integer.parseInt(price);
		int availableAmount = 4000;
		
		if(availableAmount>=bookingPrice){
			System.out.println("Book the Ticket");
		}else{
			System.out.println("Amount is Insufficient");
		}

	}

}
