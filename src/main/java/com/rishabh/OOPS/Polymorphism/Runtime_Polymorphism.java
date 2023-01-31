package com.rishabh.OOPS.Polymorphism;
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
 * 
 * 2. Runtime polymorphism (also known as dynamic polymorphism) 
 * is achieved through method overriding. Method overriding occurs when 
 * a subclass provides a specific implementation of a method that is already
 * present in its superclass. The correct method to be called is determined 
 * at runtime based on the actual type of the object that is being referred to. 
 */
class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}


//Runtime/ Dynamic/ Dynamic Method Dispatch/ Late Binding polymorphism.
public class Runtime_Polymorphism
{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.move();
		
	}
}
