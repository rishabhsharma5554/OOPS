package OOPS.Polymorphism;
/*
 * In Java, polymorphism is the ability of an object to behave 
 * in multiple ways depending on the context in which it is used. 
 * This allows for the creation of more flexible and reusable code. 
 * 
 * There are two main types of polymorphism in Java: 
 * 1. Compile-time/ Static/ Early Binding/ Adhoc polymorphism 
 * 2. Runtime/ Dynamic/ Dynamic Method Dispatch/ Late Binding polymorphism.
 * 
 * 
 * 1. Compile-time polymorphism (also known as static polymorphism) 
 * is achieved through method overloading. Method overloading occurs 
 * when two or more methods in a class have the same name but different parameters.
 * The correct method to be called is determined at compile time based on the types
 * and number of arguments passed to the method. For example:

 */
class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
//Compile-time/ Static/ Early Binding/ Adhoc polymorphism 
public class CompileTime_Polymorphism {
	public static void main(String[] args)
	{
	}
}