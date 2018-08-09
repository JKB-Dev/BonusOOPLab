package com.bookstore;

public class Book {
	private String isbn;
	private String author;
	private String title;
	private double price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(String isbn, String author, String title, double price) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		//return isbn + "\t" + author + "\t" + title + "\t$" + price; 
		return String.format("%-25s%-25s%-20s%-1s%-10.2f", isbn, title, author, "$", price);
	}
	
	
}
