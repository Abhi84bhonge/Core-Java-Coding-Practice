package com.BankManagementSystem;

public class Card extends Account{

	private long cardNumber;
	private int cvv;
	private long otp;
	
	
	public Card(long cardNumber,int cvv,long otp) {
	
	this.cardNumber=cardNumber;
	this.cvv=cvv;
	this.otp=otp;
	}


	public long getCardNumber() {
		return cardNumber;
	}


	public int getCvv() {
		return cvv;
	}


	public long getOtp() {
		return otp;
	}


	
	
	
	
}
