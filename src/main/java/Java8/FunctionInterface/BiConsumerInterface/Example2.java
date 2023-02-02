package Java8.FunctionInterface.BiConsumerInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s,%f",name,salary);
	}
}

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		populate(al);
		BiConsumer<Employee, Double> c = (e, d) -> e.salary = e.salary + d;
		for (Employee e : al)
			c.accept(e, 500.0);

		for (Employee e : al)
			System.out.println(e);
	}

	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Sunny", 2000));
		l.add(new Employee("Bunny", 3000));
		l.add(new Employee("Chinny", 4000));
	}
}
