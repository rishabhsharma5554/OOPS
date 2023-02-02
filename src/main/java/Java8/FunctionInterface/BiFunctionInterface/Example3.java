package Java8.FunctionInterface.BiFunctionInterface;

import java.util.function.BiFunction;

public class Example3 {
	class Employee {
		int eno;
		String name;
		double dailyWage;

		Employee(int eno, String name, double dailyWage) {
			this.eno = eno;
			this.name = name;
			this.dailyWage = dailyWage;
		}
	}

	class TimeSheet {
		int eno;
		int days;

		TimeSheet(int eno, int days) {
			this.eno = eno;
			this.days = days;
		}
	}

	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> f = (e,t) -> e.dailyWage * t.days;
		Example3 obj = new Example3();
		
		Employee e = obj.new Employee(101, "Rishabh", 1500);
		TimeSheet t = obj.new TimeSheet(105, 25);
		
		System.out.println("Employee Mothly Salary : "+f.apply(e, t));
	}
}
