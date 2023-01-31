package Java8.LambdaExpressions.WithCollections;

import java.util.PriorityQueue;

public class CustomSortingOnHeapObjects1 {

	public static void main(String[] args) {
		PriorityQueue<Employee> maxHeap = new PriorityQueue<>((e1,e2) -> e2.emp_no - e1.emp_no);
		maxHeap.add(new Employee(1, "Rishabh"));
		maxHeap.add(new Employee(36, "Madhuri"));
		maxHeap.add(new Employee(98, "Mohit"));
		maxHeap.add(new Employee(3, "Lucky"));
		maxHeap.add(new Employee(61, "Rahul"));
		while(!maxHeap.isEmpty())
		{
			Employee e = maxHeap.remove();
			System.out.println(e.emp_no+" : "+e.emp_name);
		}
	}

}
