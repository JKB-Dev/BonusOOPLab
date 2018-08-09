package com.bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class Part2BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new UsedBook("9780446310789", "Harper Lee", "To Kill a Mockingbird", 3.95, "Fair"));
		books.add(new UsedBook("9780385340571", "Lee Child", "Gone Tomorrow", 3.95, "Fine"));
		books.add(new UsedBook("9780374500016", "Elie Wiesel", "Night", 3.62, "Good"));
		books.add(new Book("9780316392389", "David Sedaris", "Calypso", 18.33));
		books.add(new Book("9780525563709", "Dan Brown ", "Origin: A Novel", 7.48));
		books.add(new Book("9780307341556", "Gillian Flynn", "Sharp Objects", 8.99));
		
		System.out.println("Welcome to Grand Circus New and Used Books!\nPlease choose from the following:\n");
		
		String cont = "y";
		
		// loop this menu until user exits
		while (cont.equalsIgnoreCase("y")) {
			
			int counter = 1;
			for (int i = 0; i < books.size(); i++) {
				
				System.out.println(counter + ") " + books.get(i));
				counter++;
			}
			System.out.println(counter + ") Exit\n\nYour choice:\n");
			int selectChoice = scan.nextInt();
			scan.nextLine();
			if (selectChoice == counter) {
				System.out.println("Goodbye!");
				cont = "n";
			} else {
			
				String buyChoice = Validator.getYorN(scan, "\nDo you want to buy this book? (y/n)\n");
				
				if (buyChoice.equals("y")) {
					System.out.println("\nAdded to cart: \n" + books.get(selectChoice-1) + "\n");
					books.remove(selectChoice-1);
				} else {
					continue;
				}
			}
			
		}
	
	}

}
