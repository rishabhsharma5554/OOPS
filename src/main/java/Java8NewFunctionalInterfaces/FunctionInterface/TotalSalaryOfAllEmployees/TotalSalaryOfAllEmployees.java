package Java8NewFunctionalInterfaces.FunctionInterface.TotalSalaryOfAllEmployees;

import java.util.ArrayList;
import java.util.function.Function;

public class TotalSalaryOfAllEmployees {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		populate(employees);
		Function<ArrayList<Employee>, Double> f = emps -> {
			double total = 0;
			for(Employee e : emps)
				total = total + e.salary;
			return total;
		};
		
		System.out.println("Total Salary of All Employees : "+f.apply(employees));
	}

	private static void populate(ArrayList<Employee> employees) {
		employees.add(new Employee("Rishabh", 656516.626556));
		employees.add(new Employee("Chinny", 65161.5151));
		employees.add(new Employee("Sunny", 8489841.561651));
		employees.add(new Employee("mahi", 65225.55));
	}
}
