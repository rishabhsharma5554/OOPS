package com.rishabh.OOPS.Abstraction;

/*
 * There are several key use cases for abstract classes in Java:
 * 	To provide a common interface for a group of related classes:
 * 		An abstract class can define a common set of methods that must be 
 * 		implemented by all subclasses, ensuring that they all have a consistent behavior.
 * 	To share code among multiple classes: An abstract class can provide a
 *  	default implementation for certain methods, which can be reused by multiple subclasses.	
 * 	To define non-static or non-final fields: An interface can only 
 * 		have static and final fields. An abstract class can have fields 
 * 		that are not static or final.
 * 	To create a class that cannot be instantiated: An abstract 
 * 		class cannot be instantiated, it can only be subclassed.
 * 	To create a class that is incomplete, and need to be implemented by subclass.
*/
abstract class Shape {
	// instance variables
	protected String color;

	// constructor
	public Shape(String color) {
		this.color = color;
	}

	// abstract method
	public abstract double getArea();

	// concrete method
	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

class Square extends Shape {
	private double side;

	public Square(double side, String color) {
		super(color);
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}
}

public class AbstractionExample {
	public static void main(String[] args) 
	{
		//You cannot create object of Abstract class directly
		//Shape shape = new Shape("RIshabh");
		
		// But you can can create a reference object for abstract class
		// Creating an object of Circle class
		Shape circle = new Circle(2,"red");
		System.out.println("Circle color: " + circle.getColor());
		System.out.println("Circle area: " + circle.getArea());
	}
}
