package Java8.LambdaExpressions.WithCollections;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	int emp_no;
	String emp_name;
	public Employee(int emp_no, String emp_name)
	{
		this.emp_name = emp_name;
		this.emp_no = emp_no;
	}
	
	public String toString()
	{
		return emp_no+" : "+emp_name;
	}
}
public class CustomSortingOnObjects {
	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(100, "Rishabh"));
		al.add(new Employee(36, "Madhuri"));
		al.add(new Employee(98, "Mohit"));
		al.add(new Employee(3, "Lucky"));
		al.add(new Employee(61, "Rahul"));
		System.out.println(al);
//		Collections.sort(al,(e1,e2)-> e2.emp_no - e1.emp_no);
		Collections.sort(al,(e1,e2)->(e1.emp_no>e2.emp_no) ? -1 : (e1.emp_no<e2.emp_no) ? 1 : 0);
		System.out.println(al);
	}
	
}
