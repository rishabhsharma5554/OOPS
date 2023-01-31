package Java8.FunctionInterface.PredicateInterface.EmployeeManagement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		populate(employees);
		Predicate<Employee> p1 = emp -> emp.designation.equals("Software Engineer");
		display(p1,employees);
		
		Predicate<Employee> p2 = emp -> emp.city.equals("Indore");
		display(p2,employees);
		
		Predicate<Employee> p3 = emp -> emp.salary>35000;
		display(p3,employees);
		
		display(p1.and(p2),employees);
		display(p1.or(p3),employees);
	}

	private static void display(Predicate<Employee> p, ArrayList<Employee> employees) {
		for(Employee employee : employees)
			if(p.test(employee))
				System.out.println(employee);
		
		System.out.println("******************************************");
	}

	private static void populate(ArrayList<Employee> e) {
		e.add(new Employee("Rishabh", "Software Engineer", 30000.6556456456, "Indore"));
		e.add(new Employee("Varun", "Senior Software Engineer", 50000, "Indore"));
		e.add(new Employee("Dharma", "Lead", 30000.6556456456, "Dewas"));
		e.add(new Employee("Ram", "CEO", 76456, "Indore"));
		e.add(new Employee("Prachi", "Software Engineer", 30045645600.6556456456, "Dewas"));
		e.add(new Employee("Lakshmi", "Senior Software Engineer", 465656, "Indore"));
	}

}
