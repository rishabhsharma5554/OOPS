package OOPS.Abstraction;

/*
 * If two interfaces, such as Printable and Movable in your example, 
 * have methods with the same signature, then a class that implements both interfaces must provide an implementation for both methods.
 * For example, if both the Printable and Movable interfaces have a 
 * print() method, then the class that implements both interfaces must 
 * provide an implementation for the print() method twice, once for each interface.
 * */
interface Printable {
	void print();
}

class Book implements Printable {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println("Printing book: " + title);
	}
}

class Newspaper implements Printable {
	private String name;

	public Newspaper(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Printing newspaper: " + name);
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Printable book = new Book("Harry Potter");
		book.print();
		Printable newspaper = new Newspaper("The Times");
		newspaper.print();
	}
}
