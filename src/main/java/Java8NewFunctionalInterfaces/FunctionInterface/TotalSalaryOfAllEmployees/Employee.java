package Java8NewFunctionalInterfaces.FunctionInterface.TotalSalaryOfAllEmployees;

public class Employee 
{
	public String name;
	public double salary;
	public Employee(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return String.format("%s %f",name,salary);
	}
}
