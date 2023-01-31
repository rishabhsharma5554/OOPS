package Java8.LambdaExpressions.WithCollections;

import java.util.PriorityQueue;

public class CustomSortingOnHeapObjects2 {
	public static void main(String[] args) {
		PriorityQueue<Employee> minHeap = new PriorityQueue<>((e1,e2) -> e1.emp_no - e2.emp_no);
		minHeap.add(new Employee(1, "Rishabh"));
		minHeap.add(new Employee(36, "Madhuri"));
		minHeap.add(new Employee(98, "Mohit"));
		minHeap.add(new Employee(3, "Lucky"));
		minHeap.add(new Employee(61, "Rahul"));
		while(!minHeap.isEmpty())
		{
			Employee e = minHeap.remove();
			System.out.println(e.emp_no+" : "+e.emp_name);
		}
	}
}
