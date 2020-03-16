package _30_days_of_code;

public class Day13_AbstractClasses {
}
abstract class Book {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

class MyBook extends Book{

	private int price;

	public MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}
