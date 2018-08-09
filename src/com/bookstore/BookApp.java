package com.bookstore;

import java.util.ArrayList;
import java.util.Scanner;


public class BookApp {
	
	
	public static void main(String[] args) {
		
		String isbn = "";
		String title = "";
		String author = "";
		double price = 0.0;


		Scanner scan = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<>();
		
		int arraySize = Validator.getInt(scan, "How many books are you entering?\n");
		
		for (int i = 0; i < arraySize; i++) {
			isbn = Validator.getString(scan, "Enter book number " + (i+1) + "'s ISBN number: ");
			title = Validator.getString(scan, "Enter book number " + (i+1) + "'s title: ");
			author = Validator.getString(scan, "Enter book number " + (i+1) + "'s author: ");
			price = Validator.getDouble(scan, "Enter book number " + (i+1) + "'s price: ");
			
			books.add(new Book(isbn, title, author, price));
			
			//scan.nextLine(); // garbage line
		}
		
		System.out.println();
		System.out.println("Current Inventory:");
		
		// print ArrayList to console and exit
		for (Book b : books) {
			System.out.println(b);
		}
		scan.close();
		
	}

}
