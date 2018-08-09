package com.bookstore;

public class UsedBook extends Book {
	private String wear;
	
	public UsedBook() {
		super();
	}
	
	public UsedBook(String isbn, String author, String title, double price, String wear) {
		super(isbn, author, title, price);
		this.wear = wear;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tUsed, Condition: " + wear;
	}
}
