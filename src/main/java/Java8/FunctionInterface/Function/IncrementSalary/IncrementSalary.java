package Java8.FunctionInterface.Function.IncrementSalary;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import Java8.FunctionInterface.Function.TotalSalaryOfAllEmployees.Employee;

public class IncrementSalary {
	
	//Increment salarys of employees whose salary is less than 3500
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		populate(employees);
		
		Predicate<Employee> p = e -> e.salary < 3500;
		Function<Employee, Employee> f = emp -> {
													emp.salary += 4777;
													return emp;
												};
		ArrayList<Employee> afterIncrementEmployee = new ArrayList<>();
		for(Employee e : employees)
			if(p.test(e))
				afterIncrementEmployee.add(f.apply(e));
		System.out.println("After Increment : "+afterIncrementEmployee);
	}

	private static void populate(ArrayList<Employee> employees) {
		employees.add(new Employee("Rishabh", 656516.626556));
		employees.add(new Employee("Chinny", 65161.5151));
		employees.add(new Employee("Sunny", 8489841.561651));
		employees.add(new Employee("mahi", 3400.55));
	}
}
