package Java8.LambdaExpressions.WithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer obj1 , Integer obj2)
	{
//		if(obj1>obj2)
//			return -1;
//		else if(obj1<obj2)
//			return 1;
//		else
//			return 0;
		
		return (obj1>obj2) ? -1 : (obj1<obj2) ? 1 : 0;
	}
}
public class ComparatorExampleWithoutLambda {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(25);
		al.add(7);
		al.add(98);
		al.add(36);
		al.add(0);
		al.add(12);
		System.out.println("Before Sorting "+al);
		Collections.sort(al);
		System.out.println("Default Natural Sorting "+al);
		Collections.sort(al,new MyComparator());
		System.out.println("Customized Natural Sorting "+al);
	}
}
