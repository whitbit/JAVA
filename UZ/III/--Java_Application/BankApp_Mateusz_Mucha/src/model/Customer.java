package model;

public class Customer extends Person {
	private int cash;
	private String cardNumber;
//
	public Customer( int cash, String cardNumber, String firstName, String lastName, String dateOfB, int id, String address ) {
		super( firstName, lastName, dateOfB, id, address );
		this.cash = cash;
		this.cardNumber = cardNumber;
	}
//
	public int getcash() {
		return cash;
	}
	public void setcash( int cash ) {
		this.cash = cash;
	}
//
	public String getCardNumber() {
		return cardNumber;
	}
//
	public void setCardNumber( String cardNumber ) {
		this.cardNumber = cardNumber;
	}
//
}